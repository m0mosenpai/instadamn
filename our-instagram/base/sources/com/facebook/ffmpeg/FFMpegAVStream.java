package com.facebook.ffmpeg;

import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public class FFMpegAVStream {
    public long mNativeContext;

    private native void nativeFinalize();

    private native void nativeSetOrientationHint(int i);

    private native void nativeWriteFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer);

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if (r3 == 270) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setOrientationHint(int r3) {
        /*
            r2 = this;
            if (r3 == 0) goto Lf
            r0 = 90
            if (r3 == r0) goto Lf
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 == r0) goto Lf
            r1 = 270(0x10e, float:3.78E-43)
            r0 = 0
            if (r3 != r1) goto L10
        Lf:
            r0 = 1
        L10:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C0Hf.A00(r0)
            r2.nativeSetOrientationHint(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ffmpeg.FFMpegAVStream.setOrientationHint(int):void");
    }

    public FFMpegAVStream(long j) {
        this.mNativeContext = j;
    }

    public void finalize() {
        nativeFinalize();
    }

    public void writeFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        nativeWriteFrame(fFMpegBufferInfo, byteBuffer);
    }
}
