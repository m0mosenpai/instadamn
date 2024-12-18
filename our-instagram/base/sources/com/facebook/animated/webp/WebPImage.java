package com.facebook.animated.webp;

import X.C05800Si;
import X.C05F;
import X.C5FG;
import X.C69323VlV;
import X.InterfaceC71992XEf;
import X.VCZ;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public class WebPImage implements InterfaceC71992XEf {
    public long mNativeContext;

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.InterfaceC71992XEf
    /* renamed from: nativeGetFrame, reason: merged with bridge method [inline-methods] */
    public native WebPFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // X.InterfaceC71992XEf
    public boolean doesRenderSupportScaling() {
        return true;
    }

    @Override // X.InterfaceC71992XEf
    public Bitmap.Config getAnimatedBitmapConfig() {
        return null;
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage createFromByteArray(byte[] bArr, C5FG c5fg) {
        C05800Si.A00();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // X.InterfaceC71992XEf
    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    @Override // X.InterfaceC71992XEf
    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    @Override // X.InterfaceC71992XEf
    public C69323VlV getFrameInfo(int i) {
        Integer num;
        VCZ vcz;
        WebPFrame frame = getFrame(i);
        try {
            int xOffset = frame.getXOffset();
            int yOffset = frame.getYOffset();
            int width = frame.getWidth();
            int height = frame.getHeight();
            if (frame.isBlendWithPreviousFrame()) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            if (frame.shouldDisposeToBackgroundColor()) {
                vcz = VCZ.DISPOSE_TO_BACKGROUND;
            } else {
                vcz = VCZ.DISPOSE_DO_NOT;
            }
            return new C69323VlV(vcz, num, xOffset, yOffset, width, height);
        } finally {
            frame.dispose();
        }
    }

    @Override // X.InterfaceC71992XEf
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.InterfaceC71992XEf
    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    @Override // X.InterfaceC71992XEf
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.InterfaceC71992XEf
    public int getWidth() {
        return nativeGetWidth();
    }

    public WebPImage() {
    }
}
