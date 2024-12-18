package com.facebook.cameracore.recognizer.debug.info;

import X.EnumC72353Xbp;

/* loaded from: classes12.dex */
public class RecognizerDebugInfo {
    public final String mInfo;
    public final Integer mQplInstanceKey;
    public final EnumC72353Xbp mType;

    public RecognizerDebugInfo(String str, int i, int i2) {
        Integer valueOf;
        this.mInfo = str;
        if (i == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        this.mQplInstanceKey = valueOf;
        this.mType = EnumC72353Xbp.values()[i2];
    }

    public String getInfo() {
        return this.mInfo;
    }

    public Integer getQplInstanceKey() {
        return this.mQplInstanceKey;
    }

    public EnumC72353Xbp getType() {
        return this.mType;
    }
}
