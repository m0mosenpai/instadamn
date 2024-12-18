package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.5TJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TJ implements InterfaceC53292cD {
    public InterfaceC53292cD A00;
    public C117365Sv A01;
    public String A02;

    @Override // X.InterfaceC53292cD
    public final void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, Object obj) {
        this.A00.configure(mediaFormat, surface, mediaCrypto, 0, obj);
    }

    @Override // X.InterfaceC53292cD
    public final void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.A00.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // X.InterfaceC53292cD
    public final void queueSecureInputBuffer(int i, int i2, C96114Tu c96114Tu, long j, int i3) {
        this.A00.queueSecureInputBuffer(i, 0, c96114Tu, j, 0);
    }

    @Override // X.InterfaceC53292cD
    public final void releaseOutputBuffer(int i, boolean z) {
        this.A00.releaseOutputBuffer(i, false);
    }

    @Override // X.InterfaceC53292cD
    public final int dequeueInputBufferIndex() {
        return this.A00.dequeueInputBufferIndex();
    }

    @Override // X.InterfaceC53292cD
    public final int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        return this.A00.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // X.InterfaceC53292cD
    public final void enableSR(boolean z) {
        this.A00.enableSR(z);
    }

    @Override // X.InterfaceC53292cD
    public final void flush() {
        this.A00.flush();
    }

    @Override // X.InterfaceC53292cD
    public final ByteBuffer getInputBuffer(int i) {
        return this.A00.getInputBuffer(i);
    }

    @Override // X.InterfaceC53292cD
    public final ByteBuffer getOutputBuffer(int i) {
        return this.A00.getOutputBuffer(i);
    }

    @Override // X.InterfaceC53292cD
    public final MediaFormat getOutputFormat() {
        return this.A00.getOutputFormat();
    }

    @Override // X.InterfaceC53292cD
    public final Pair getPerFrameTotalDecodeTimeAndCount() {
        return this.A00.getPerFrameTotalDecodeTimeAndCount();
    }

    @Override // X.InterfaceC53292cD
    public final int getTotalSampleCount() {
        return this.A00.getTotalSampleCount();
    }

    @Override // X.InterfaceC53292cD
    public final boolean isSREnabled(int i) {
        return this.A00.isSREnabled(i);
    }

    @Override // X.InterfaceC53292cD
    public final boolean needsReconfiguration() {
        return this.A00.needsReconfiguration();
    }

    @Override // X.InterfaceC53292cD
    public final void release() {
        C117365Sv c117365Sv = this.A01;
        InterfaceC53292cD interfaceC53292cD = this.A00;
        String str = this.A02;
        C2VR c2vr = C2VR.A05;
        boolean z = c117365Sv.A03;
        c2vr.A02(c117365Sv.A00.A00, c117365Sv.A01, interfaceC53292cD, C05F.A01, str, z);
    }

    @Override // X.InterfaceC53292cD
    public final void reset() {
        this.A00.reset();
    }

    @Override // X.InterfaceC53292cD
    public final void setOnFrameRenderedListener(InterfaceC123265i1 interfaceC123265i1, Handler handler) {
        this.A00.setOnFrameRenderedListener(interfaceC123265i1, handler);
    }

    @Override // X.InterfaceC53292cD
    public final void setOutputSurface(Surface surface) {
        this.A00.setOutputSurface(surface);
    }

    @Override // X.InterfaceC53292cD
    public final void setParameters(Bundle bundle) {
        this.A00.setParameters(bundle);
    }

    @Override // X.InterfaceC53292cD
    public final void setVideoScalingMode(int i) {
        this.A00.setVideoScalingMode(i);
    }

    @Override // X.InterfaceC53292cD
    public final void start() {
        this.A00.start();
    }

    @Override // X.InterfaceC53292cD
    public final void stop() {
        this.A00.stop();
    }

    @Override // X.InterfaceC53292cD
    public final void releaseOutputBuffer(int i, long j) {
        this.A00.releaseOutputBuffer(i, j);
    }
}
