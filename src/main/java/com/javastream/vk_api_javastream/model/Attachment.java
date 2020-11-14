package com.javastream.vk_api_javastream.model;

import lombok.Data;

import java.awt.datatransfer.DataFlavor;
import java.net.URL;

@Data
public class Attachment {
    private AttachmentType type;
    private int contentId;
    private String accessKey;
    private URL url;
    public void setAccessKey(String accessKey) {
    }

    public void setContentId(Integer id) {
    }

    public void setType(AttachmentType audio) {
    }

    public void setUrl(URL url) {
    }


    public DataFlavor getType() {
        return null;
    }
}
