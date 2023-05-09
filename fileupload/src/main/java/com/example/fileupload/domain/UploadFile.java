package com.example.fileupload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName; // 업로드한 파일 이름
    private String storeFileName; // 업로드한 파일 이름이 겹치지 않게 저장해주는 이름

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}