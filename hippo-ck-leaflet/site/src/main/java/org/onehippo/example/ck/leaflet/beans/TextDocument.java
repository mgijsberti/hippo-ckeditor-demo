package org.onehippo.example.ck.leaflet.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="hippockleaflet:textdocument")
public class TextDocument extends BaseDocument{
    
    public String getTitle() {
        return getProperty("hippockleaflet:title");
    }

    public String getSummary() {
        return getProperty("hippockleaflet:summary");
    }
    
    public HippoHtml getHtml(){
        return getHippoHtml("hippockleaflet:body");    
    }

}
