package org.webrtc;

import X.AbstractC166987dD;

/* loaded from: classes12.dex */
public class DtmfSender {
    public long nativeDtmfSender;

    public static native boolean nativeCanInsertDtmf(long j);

    public static native int nativeDuration(long j);

    public static native boolean nativeInsertDtmf(long j, String str, int i, int i2);

    public static native int nativeInterToneGap(long j);

    public static native String nativeTones(long j);

    private void checkDtmfSenderExists() {
        if (this.nativeDtmfSender != 0) {
        } else {
            throw AbstractC166987dD.A14("DtmfSender has been disposed.");
        }
    }

    public DtmfSender(long j) {
        this.nativeDtmfSender = j;
    }

    public boolean canInsertDtmf() {
        checkDtmfSenderExists();
        return nativeCanInsertDtmf(this.nativeDtmfSender);
    }

    public void dispose() {
        checkDtmfSenderExists();
        JniCommon.nativeReleaseRef(this.nativeDtmfSender);
        this.nativeDtmfSender = 0L;
    }

    public int duration() {
        checkDtmfSenderExists();
        return nativeDuration(this.nativeDtmfSender);
    }

    public boolean insertDtmf(String str, int i, int i2) {
        checkDtmfSenderExists();
        return nativeInsertDtmf(this.nativeDtmfSender, str, i, i2);
    }

    public int interToneGap() {
        checkDtmfSenderExists();
        return nativeInterToneGap(this.nativeDtmfSender);
    }

    public String tones() {
        checkDtmfSenderExists();
        return nativeTones(this.nativeDtmfSender);
    }
}
