package exoplayer2.av1.src;

import X.AbstractC117285Sn;
import X.AbstractC460729r;
import X.AbstractC96104Tt;
import X.AbstractC98584bc;
import X.C0IG;
import X.C0IL;
import X.C0KQ;
import X.C4Y3;
import X.C96094Ts;
import X.C96114Tu;
import X.C98644bj;
import X.InterfaceC123265i1;
import X.InterfaceC53292cD;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public class Dav1dMediaCodecAdapter implements InterfaceC53292cD {
    public static final String TAG = "Dav1dMediaCodecAdapter";
    public Bitmap mBitmap;
    public ColorInfo mColorInfo;
    public Dav1dMediaCodecAdapterSetting mDav1dMediaCodecAdapterSetting;
    public Dav1dDecoder mDecoder;
    public int mOutputMode;
    public Surface mSurface;
    public int mInputIndex = 0;
    public int mOutputIndex = 0;
    public HashMap mInputBufferInUse = new HashMap();
    public HashMap mOutputBufferInUse = new HashMap();
    public int mCurrentWidth = 0;
    public int mCurrentHeight = 0;
    public boolean mOutputFormatSet = false;
    public boolean mOutputFormatNotified = false;
    public int mPendingOutputIndex = -1;

    private void clearRenderedFirstFrame() {
    }

    private void onOutputReset() {
    }

    @Override // X.InterfaceC53292cD
    public int dequeueInputBufferIndex() {
        C96094Ts AOr;
        try {
            Dav1dDecoder dav1dDecoder = this.mDecoder;
            if (dav1dDecoder != null && (AOr = dav1dDecoder.AOr()) != null) {
                int i = this.mInputIndex;
                HashMap hashMap = this.mInputBufferInUse;
                this.mInputIndex = i + 1;
                hashMap.put(Integer.valueOf(i), AOr);
                return i;
            }
        } catch (Dav1dDecoderException e) {
            Log.w(TAG, String.format("dequeueInputBuffer() - Exception calling mDecoder.dequeueInputBuffer(): %s", e.toString()));
        }
        return -1;
    }

    @Override // X.InterfaceC53292cD
    public MediaFormat getOutputFormat() {
        this.mOutputFormatNotified = true;
        return MediaFormat.createVideoFormat(null, this.mCurrentWidth, this.mCurrentHeight);
    }

    @Override // X.InterfaceC53292cD
    public boolean needsReconfiguration() {
        return false;
    }

    public void processOutputBuffersChanged() {
    }

    @Override // X.InterfaceC53292cD
    public void queueSecureInputBuffer(int i, int i2, C96114Tu c96114Tu, long j, int i3) {
    }

    @Override // X.InterfaceC53292cD
    public void setOnFrameRenderedListener(InterfaceC123265i1 interfaceC123265i1, Handler handler) {
    }

    @Override // X.InterfaceC53292cD
    public void setParameters(Bundle bundle) {
    }

    @Override // X.InterfaceC53292cD
    public void setVideoScalingMode(int i) {
    }

    private boolean hasOutput() {
        if (this.mOutputMode == -1) {
            return false;
        }
        return true;
    }

    private boolean isSurfaceEligible(Surface surface) {
        if (surface != null && surface.isValid()) {
            return true;
        }
        return false;
    }

    private void onOutputChanged() {
    }

    private void onOutputRemoved() {
    }

    private void render(Dav1dOutputBuffer dav1dOutputBuffer, long j) {
        if (this.mDecoder == null) {
            return;
        }
        try {
            renderOutputBuffer(dav1dOutputBuffer);
        } catch (C4Y3 unused) {
        }
    }

    private void renderOutputBuffer(Dav1dOutputBuffer dav1dOutputBuffer) {
        Surface surface = this.mSurface;
        if ((dav1dOutputBuffer.mode == 0 || !isSurfaceEligible(surface)) && dav1dOutputBuffer.height > 0 && dav1dOutputBuffer.width > 0) {
            try {
                Dav1dDecoder dav1dDecoder = this.mDecoder;
                if (dav1dDecoder != null) {
                    dav1dDecoder.renderYuvFrameToSurface(dav1dOutputBuffer, surface);
                }
            } catch (Dav1dDecoderException e) {
                Log.w(TAG, String.format("renderOutputBuffer() - Exception calling renderOutputBuffer(): %s", e.toString()));
                throw new C4Y3(null, TAG, e, 1, 4003, 2, 4, false);
            }
        }
    }

    private void setOutputSurfaceInternal(Surface surface) {
        Dav1dDecoder dav1dDecoder;
        int i = 0;
        if (this.mSurface != surface) {
            this.mSurface = surface;
            this.mCurrentWidth = 0;
            this.mCurrentHeight = 0;
        }
        if (!isSurfaceEligible(surface)) {
            i = -1;
        }
        if (i != this.mOutputMode && (dav1dDecoder = this.mDecoder) != null) {
            this.mOutputMode = i;
            dav1dDecoder.outputMode = i;
        }
    }

    @Override // X.InterfaceC53292cD
    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, Object obj) {
        if (obj != null && (obj instanceof Dav1dMediaCodecAdapterSetting)) {
            this.mDav1dMediaCodecAdapterSetting = (Dav1dMediaCodecAdapterSetting) obj;
            this.mOutputMode = -1;
            if (this.mDecoder == null) {
                createDav1dDecoder(mediaFormat, surface);
            }
        }
    }

    @Override // X.InterfaceC53292cD
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        Dav1dOutputBuffer dav1dOutputBuffer;
        int i;
        int i2;
        int i3;
        int i4 = this.mPendingOutputIndex;
        if (i4 != -1) {
            this.mPendingOutputIndex = -1;
            return i4;
        }
        try {
            Dav1dDecoder dav1dDecoder = this.mDecoder;
            if (dav1dDecoder != null && (dav1dOutputBuffer = (Dav1dOutputBuffer) dav1dDecoder.AOu()) != null) {
                bufferInfo.presentationTimeUs = ((AbstractC117285Sn) dav1dOutputBuffer).A00;
                if ((((AbstractC96104Tt) dav1dOutputBuffer).A00 & 4) == 4) {
                    i = 4;
                } else {
                    i = 0;
                }
                bufferInfo.flags = i;
                ByteBuffer byteBuffer = dav1dOutputBuffer.data;
                if (byteBuffer != null) {
                    i2 = byteBuffer.remaining();
                } else {
                    i2 = 0;
                }
                bufferInfo.size = i2;
                int i5 = this.mOutputIndex;
                HashMap hashMap = this.mOutputBufferInUse;
                this.mOutputIndex = i5 + 1;
                hashMap.put(Integer.valueOf(i5), dav1dOutputBuffer);
                int i6 = dav1dOutputBuffer.width;
                if (i6 > 0 && (i3 = dav1dOutputBuffer.height) > 0) {
                    if (this.mCurrentWidth != i6 || this.mCurrentHeight != i3) {
                        this.mPendingOutputIndex = i5;
                        this.mCurrentWidth = i6;
                        this.mCurrentHeight = i3;
                        return -2;
                    }
                    return i5;
                }
                return i5;
            }
        } catch (Dav1dDecoderException e) {
            Log.w(TAG, String.format("dequeueOutputBuffer() - Exception calling mDecoder.dequeueOutputBuffer(): %s", e.toString()));
        }
        return -1;
    }

    @Override // X.InterfaceC53292cD
    public void enableSR(boolean z) {
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder != null) {
            dav1dDecoder.mEnableAV1SRShader = z;
        }
    }

    @Override // X.InterfaceC53292cD
    public void flush() {
        this.mInputBufferInUse.clear();
        Iterator it = this.mOutputBufferInUse.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC117285Sn abstractC117285Sn = (AbstractC117285Sn) ((Map.Entry) it.next()).getValue();
            if (abstractC117285Sn != null) {
                abstractC117285Sn.release();
            }
        }
        this.mOutputBufferInUse.clear();
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder != null) {
            dav1dDecoder.flush();
        }
    }

    @Override // X.InterfaceC53292cD
    public ByteBuffer getInputBuffer(int i) {
        C96094Ts c96094Ts = (C96094Ts) this.mInputBufferInUse.get(Integer.valueOf(i));
        if (c96094Ts != null) {
            return c96094Ts.A02;
        }
        return null;
    }

    public PersistableBundle getMetrics() {
        return new PersistableBundle();
    }

    @Override // X.InterfaceC53292cD
    public ByteBuffer getOutputBuffer(int i) {
        Dav1dOutputBuffer dav1dOutputBuffer = (Dav1dOutputBuffer) this.mOutputBufferInUse.get(Integer.valueOf(i));
        if (dav1dOutputBuffer != null) {
            return dav1dOutputBuffer.data;
        }
        return null;
    }

    @Override // X.InterfaceC53292cD
    public Pair getPerFrameTotalDecodeTimeAndCount() {
        Pair pair;
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder != null) {
            synchronized (dav1dDecoder) {
                pair = new Pair(Long.valueOf(dav1dDecoder.totalDecodeTime), Integer.valueOf(dav1dDecoder.totalSampleCount));
                dav1dDecoder.totalDecodeTime = 0L;
                dav1dDecoder.totalSampleCount = 0;
            }
            return pair;
        }
        return new Pair(0L, 0);
    }

    @Override // X.InterfaceC53292cD
    public int getTotalSampleCount() {
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder != null) {
            return dav1dDecoder.totalSampleCount;
        }
        return 0;
    }

    @Override // X.InterfaceC53292cD
    public boolean isSREnabled(int i) {
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder != null && dav1dDecoder.mEnableAV1SRShader && i > 0 && this.mDav1dMediaCodecAdapterSetting.maxWidthForAV1SRShader > i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC53292cD
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        Dav1dDecoder dav1dDecoder;
        HashMap hashMap = this.mInputBufferInUse;
        Integer valueOf = Integer.valueOf(i);
        C98644bj c98644bj = (C98644bj) hashMap.get(valueOf);
        if (c98644bj != null) {
            if ((i4 & 4) != 0) {
                ((AbstractC96104Tt) c98644bj).A00 = 4;
            }
            ColorInfo colorInfo = this.mColorInfo;
            if (colorInfo != null) {
                c98644bj.A00 = colorInfo;
            }
            try {
                c98644bj.A01 = j;
                dav1dDecoder = this.mDecoder;
            } catch (Dav1dDecoderException e) {
                Log.w(TAG, String.format("queueInputBuffer() - Exception calling mDecoder.queueInputBuffer(): %s", e.toString()));
            }
            if (dav1dDecoder != null) {
                dav1dDecoder.E7b(c98644bj);
                this.mInputBufferInUse.remove(valueOf);
            }
        }
    }

    @Override // X.InterfaceC53292cD
    public void releaseOutputBuffer(int i, boolean z) {
        HashMap hashMap = this.mOutputBufferInUse;
        Integer valueOf = Integer.valueOf(i);
        Dav1dOutputBuffer dav1dOutputBuffer = (Dav1dOutputBuffer) hashMap.get(valueOf);
        if (dav1dOutputBuffer != null) {
            if (z) {
                render(dav1dOutputBuffer, -1L);
            }
            dav1dOutputBuffer.release();
            this.mOutputBufferInUse.remove(valueOf);
        }
    }

    public void createDav1dDecoder(MediaFormat mediaFormat, Surface surface) {
        if (C0IL.A02()) {
            C0IL.A00(new C0KQ(1437958796, hashCode(), "dav1d"));
        }
        try {
            AbstractC460729r.A01("createDav1dDecoder");
            ThreadPoolExecutor threadPoolExecutor = Dav1dDecoder.sThreadPoolExecutor;
            this.mDecoder = new Dav1dDecoder(this.mDav1dMediaCodecAdapterSetting);
            this.mColorInfo = AbstractC98584bc.A00(mediaFormat);
            AbstractC460729r.A00();
        } catch (Dav1dDecoderException e) {
            Log.w(TAG, String.format("configure() - Exception initializing Dav1dDecoder: %s", e.toString()));
        }
        setOutputSurfaceInternal(surface);
    }

    @Override // X.InterfaceC53292cD
    public void release() {
        if (C0IL.A02()) {
            C0IL.A00(new C0IG(-849434272, Integer.valueOf(hashCode())));
        }
        Dav1dDecoder dav1dDecoder = this.mDecoder;
        if (dav1dDecoder != null) {
            dav1dDecoder.release();
            this.mDecoder = null;
        }
        this.mSurface = null;
    }

    @Override // X.InterfaceC53292cD
    public void reset() {
        if (C0IL.A02()) {
            C0IL.A00(new C0IG(997288427, Integer.valueOf(hashCode())));
        }
        flush();
        this.mInputIndex = 0;
        this.mOutputIndex = 0;
        this.mColorInfo = null;
        this.mCurrentWidth = 0;
        this.mCurrentHeight = 0;
    }

    @Override // X.InterfaceC53292cD
    public void start() {
        if (C0IL.A02()) {
            C0IL.A00(new C0IG(702923060, Integer.valueOf(hashCode())));
        }
    }

    @Override // X.InterfaceC53292cD
    public void stop() {
        if (C0IL.A02()) {
            C0IL.A00(new C0IG(936395742, Integer.valueOf(hashCode())));
        }
    }

    @Override // X.InterfaceC53292cD
    public void setOutputSurface(Surface surface) {
        setOutputSurfaceInternal(surface);
    }

    @Override // X.InterfaceC53292cD
    public void releaseOutputBuffer(int i, long j) {
        HashMap hashMap = this.mOutputBufferInUse;
        Integer valueOf = Integer.valueOf(i);
        Dav1dOutputBuffer dav1dOutputBuffer = (Dav1dOutputBuffer) hashMap.get(valueOf);
        if (dav1dOutputBuffer != null) {
            render(dav1dOutputBuffer, j);
            dav1dOutputBuffer.release();
            this.mOutputBufferInUse.remove(valueOf);
        }
    }
}
