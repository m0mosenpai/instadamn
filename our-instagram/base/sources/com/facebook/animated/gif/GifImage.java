package com.facebook.animated.gif;

import X.C05F;
import X.C09270dc;
import X.C5FG;
import X.C69323VlV;
import X.InterfaceC71992XEf;
import X.VCZ;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public class GifImage implements InterfaceC71992XEf {
    public static volatile boolean sInitialized;
    public Bitmap.Config mDecodeBitmapConfig = null;
    public long mNativeContext;

    public static GifImage createFromByteArray(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        C5FG c5fg = C5FG.A02;
        synchronized (GifImage.class) {
            if (!sInitialized) {
                sInitialized = true;
                C09270dc.A01("gifimage");
            }
        }
        allocateDirect.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(allocateDirect, Integer.MAX_VALUE, false);
        nativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = c5fg.A00;
        return nativeCreateFromDirectByteBuffer;
    }

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    public static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    public static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.InterfaceC71992XEf
    /* renamed from: nativeGetFrame, reason: merged with bridge method [inline-methods] */
    public native GifFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    @Override // X.InterfaceC71992XEf
    public boolean doesRenderSupportScaling() {
        return false;
    }

    @Override // X.InterfaceC71992XEf
    public Bitmap.Config getAnimatedBitmapConfig() {
        return this.mDecodeBitmapConfig;
    }

    public GifImage(long j) {
        this.mNativeContext = j;
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
        VCZ vcz;
        GifFrame frame = getFrame(i);
        try {
            int xOffset = frame.getXOffset();
            int yOffset = frame.getYOffset();
            int width = frame.getWidth();
            int height = frame.getHeight();
            Integer num = C05F.A00;
            int disposalMode = frame.getDisposalMode();
            if (disposalMode != 0 && disposalMode != 1) {
                if (disposalMode != 2) {
                    if (disposalMode == 3) {
                        vcz = VCZ.DISPOSE_TO_PREVIOUS;
                    }
                } else {
                    vcz = VCZ.DISPOSE_TO_BACKGROUND;
                }
                return new C69323VlV(vcz, num, xOffset, yOffset, width, height);
            }
            vcz = VCZ.DISPOSE_DO_NOT;
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
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount == 0) {
            return 0;
        }
        return nativeGetLoopCount + 1;
    }

    @Override // X.InterfaceC71992XEf
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.InterfaceC71992XEf
    public int getWidth() {
        return nativeGetWidth();
    }

    public GifImage() {
    }
}
