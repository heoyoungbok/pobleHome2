package com.its.home.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;
@Getter
@Setter
@ToString
public  class MemberDTO {

    private Long memberId;
    private String memberName;
    private String memberLoginID;
    private String memberPassword;
    private String memberMobile;
    private int memberAge;
    private String postcode;
    private String roadAddress;
    private String jibunAddress;
    private String detailAddress;
    private String originalFileName;
    private String storedFileName;

    private int fileAttached;


}
