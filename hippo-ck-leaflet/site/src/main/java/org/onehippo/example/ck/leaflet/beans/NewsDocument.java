package org.onehippo.example.ck.leaflet.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;

@Node(jcrType="hippockleaflet:newsdocument")
public class NewsDocument extends BaseDocument{

    public String getTitle() {
        return getProperty("hippockleaflet:title");
    }
    
    public String getSummary() {
        return getProperty("hippockleaflet:summary");
    }
    
    public Calendar getDate() {
        return getProperty("hippockleaflet:date");
    }

    public HippoHtml getHtml(){
        return getHippoHtml("hippockleaflet:body");    
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("hippockleaflet:image", HippoGalleryImageSetBean.class);
    }


}
