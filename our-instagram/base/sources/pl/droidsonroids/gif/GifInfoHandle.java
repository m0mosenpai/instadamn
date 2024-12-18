package pl.droidsonroids.gif;

import X.C09170dP;
import android.graphics.Bitmap;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class GifInfoHandle {
    public volatile long A00;

    public static native void bindSurface(long j, Surface surface, long[] jArr);

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z);

    public static native void free(long j);

    public static native long getAllocationByteCount(long j);

    public static native String getComment(long j);

    public static native int getCurrentFrameIndex(long j);

    public static native int getCurrentLoop(long j);

    public static native int getCurrentPosition(long j);

    public static native int getDuration(long j);

    public static native int getFrameDuration(long j, int i);

    public static native int getHeight(long j);

    public static native int getLoopCount(long j);

    public static native long getMetadataByteCount(long j);

    public static native int getNativeErrorCode(long j);

    public static native int getNumberOfFrames(long j);

    public static native long[] getSavedState(long j);

    public static native long getSourceLength(long j);

    public static native int getWidth(long j);

    public static native void glTexImage2D(long j, int i, int i2);

    public static native void glTexSubImage2D(long j, int i, int i2);

    public static native void initTexImageDescriptor(long j);

    public static native boolean isAnimationCompleted(long j);

    public static native boolean isOpaque(long j);

    public static native long openByteArray(byte[] bArr);

    public static native long openDirectByteBuffer(ByteBuffer byteBuffer);

    public static native long openFile(String str);

    public static native long openNativeFileDescriptor(int i, long j);

    public static native long openStream(InputStream inputStream);

    public static native void postUnbindSurface(long j);

    public static native long renderFrame(long j, Bitmap bitmap);

    public static native boolean reset(long j);

    public static native long restoreRemainder(long j);

    public static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    public static native void saveRemainder(long j);

    public static native void seekToFrame(long j, int i, Bitmap bitmap);

    public static native void seekToFrameGL(long j, int i);

    public static native void seekToTime(long j, int i, Bitmap bitmap);

    public static native void setLoopCount(long j, char c);

    public static native void setOptions(long j, char c, boolean z);

    public static native void setSpeedFactor(long j, float f);

    public static native void startDecoderThread(long j);

    public static native void stopDecoderThread(long j);

    public final void finalize() {
        synchronized (this) {
            free(this.A00);
            this.A00 = 0L;
        }
    }

    static {
        C09170dP.A0C("pl_droidsonroids_gif");
    }

    public GifInfoHandle(String str) {
        this.A00 = openFile(str);
    }

    public GifInfoHandle() {
    }
}
