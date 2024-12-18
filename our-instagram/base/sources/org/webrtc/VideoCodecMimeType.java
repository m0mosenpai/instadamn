package org.webrtc;

/* loaded from: classes10.dex */
public enum VideoCodecMimeType {
    VP8("video/x-vnd.on2.vp8"),
    VP9("video/x-vnd.on2.vp9"),
    H264("video/avc"),
    AV1("video/av01"),
    H265("video/hevc");

    public final String mimeType;

    public String mimeType() {
        return this.mimeType;
    }

    VideoCodecMimeType(String str) {
        this.mimeType = str;
    }
}
