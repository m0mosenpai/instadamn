package com.facebook.imagepipeline.nativecode;

import X.C09270dc;
import X.C62993SaH;
import X.S6W;
import X.SA4;

/* loaded from: classes10.dex */
public class NativeJpegTranscoderFactory {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.imagepipeline.nativecode.NativeJpegTranscoder, java.lang.Object] */
    public NativeJpegTranscoder createImageTranscoder(C62993SaH c62993SaH, boolean z) {
        if (c62993SaH != SA4.A05) {
            return null;
        }
        int i = this.A00;
        boolean z2 = this.A02;
        boolean z3 = this.A01;
        ?? obj = new Object();
        obj.mResizingEnabled = z;
        obj.mMaxBitmapSize = i;
        obj.mUseDownsamplingRatio = z2;
        if (!z3) {
            return obj;
        }
        synchronized (S6W.class) {
            if (!S6W.A00) {
                C09270dc.A01("native-imagetranscoder");
                S6W.A00 = true;
            }
        }
        return obj;
    }

    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }
}
