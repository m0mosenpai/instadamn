package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: X.XPa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72128XPa extends MediaCodec.Callback {
    public final /* synthetic */ C73398YBk A00;

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
    }

    public C72128XPa(C73398YBk c73398YBk) {
        this.A00 = c73398YBk;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 4) != 0 && bufferInfo.size <= 0) {
            C73398YBk c73398YBk = this.A00;
            C73398YBk.A01(c73398YBk.A02, c73398YBk.A03, c73398YBk);
            return;
        }
        if (i < 0) {
            this.A00.A06.A01(AbstractC72046XLm.A0R("Unexpected result from encoder.dequeueOutputBuffer: %d", AbstractC25228BEl.A1Y(i)), null);
            return;
        }
        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
        if (outputBuffer == null) {
            this.A00.A06.A01(AbstractC72046XLm.A0R("onOutputBufferAvailable ByteBuffer %d was null", AbstractC25228BEl.A1Y(i)), null);
            return;
        }
        if ((bufferInfo.flags & 2) != 0) {
            bufferInfo.flags = 2;
        }
        if (bufferInfo.size > 0) {
            try {
                this.A00.A06.A00(bufferInfo, outputBuffer);
            } catch (IllegalArgumentException e) {
                AC9 ac9 = this.A00.A06;
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("IllegalArgumentException - ");
                A1C.append(e.getMessage());
                ac9.A01(new IOException(AbstractC167017dG.A0n(bufferInfo, ". BufferInfo: ", A1C)), null);
                return;
            }
        }
        mediaCodec.releaseOutputBuffer(i, false);
        if ((bufferInfo.flags & 4) != 0 && bufferInfo.size > 0) {
            C73398YBk c73398YBk2 = this.A00;
            C73398YBk.A01(c73398YBk2.A02, c73398YBk2.A03, c73398YBk2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.A00.A01 = mediaFormat;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        HashMap A1G = AbstractC166987dD.A1G();
        C73398YBk c73398YBk = this.A00;
        A1G.put(TraceFieldType.CurrentState, XgU.A00(c73398YBk.A0D));
        A1G.put("method_invocation", c73398YBk.A07.toString());
        A1G.put("isRecoverable", String.valueOf(codecException.isRecoverable()));
        A1G.put("isTransient", String.valueOf(codecException.isTransient()));
        c73398YBk.A06.A01(codecException, A1G);
    }
}
