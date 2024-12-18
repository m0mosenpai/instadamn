package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class Y9S implements BET {
    public MediaCodec.BufferInfo A00;
    public MediaCodec A01;
    public MediaFormat A02;
    public final Handler A03;
    public final C177567uq A04;
    public final InterfaceC178337w7 A05;
    public final AC8 A06;
    public final C72680Xl1 A07;
    public volatile Integer A08 = C05F.A00;

    @Override // X.BET
    public final /* synthetic */ void Avw(Map map) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r5 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(android.media.MediaCodec r5, int r6) {
        /*
            r4 = this;
            java.lang.Integer r0 = r4.A08
            java.lang.Integer r1 = X.C05F.A0C
            if (r0 != r1) goto Ld
            android.media.MediaCodec r0 = r4.A01
            if (r0 != r5) goto Ld
            r0 = 1
            if (r5 != 0) goto Le
        Ld:
            r0 = 0
        Le:
            r3 = 1
            if (r0 == 0) goto L34
            boolean r0 = r4 instanceof X.C72169XRd
            if (r0 == 0) goto L1f
            java.nio.ByteBuffer[] r0 = r5.getInputBuffers()
            r0 = r0[r6]
            r0.clear()
            goto L35
        L1f:
            java.nio.ByteBuffer r0 = r5.getInputBuffer(r6)
            if (r0 != 0) goto L35
            X.AC8 r2 = r4.A06
            java.lang.Object[] r1 = X.AbstractC25228BEl.A1Y(r6)
            java.lang.String r0 = "encoderInputBuffer : %d was null"
            java.io.IOException r0 = X.AbstractC72046XLm.A0R(r0, r1)
            r2.A01(r0)
        L34:
            return r3
        L35:
            X.YFw r2 = new X.YFw     // Catch: java.lang.Exception -> L5c
            r2.<init>(r5, r0, r6)     // Catch: java.lang.Exception -> L5c
            java.lang.Integer r0 = r4.A08     // Catch: java.lang.Throwable -> L52
            if (r0 != r1) goto L4e
            X.Xl1 r0 = r4.A07     // Catch: java.lang.Throwable -> L52
            X.7se r0 = r0.A00     // Catch: java.lang.Throwable -> L52
            X.7sB r0 = r0.A00     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L4e
            int r0 = r0.DMG(r2)     // Catch: java.lang.Throwable -> L52
            r2.close()     // Catch: java.lang.Exception -> L5c
            return r0
        L4e:
            r2.close()     // Catch: java.lang.Exception -> L5c
            return r3
        L52:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r0 = move-exception
            X.AbstractC61625Rqp.A00(r1, r0)     // Catch: java.lang.Exception -> L5c
        L5b:
            throw r1     // Catch: java.lang.Exception -> L5c
        L5c:
            r1 = move-exception
            X.AC8 r0 = r4.A06
            r0.A01(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y9S.A01(android.media.MediaCodec, int):int");
    }

    public final void A02(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer outputBuffer;
        if (this.A08 == C05F.A0C && this.A01 == mediaCodec && mediaCodec != null) {
            if (this instanceof C72169XRd) {
                outputBuffer = mediaCodec.getOutputBuffers()[i];
            } else {
                outputBuffer = mediaCodec.getOutputBuffer(i);
            }
            if (outputBuffer != null) {
                try {
                    outputBuffer.position(bufferInfo.offset).limit(bufferInfo.size);
                    this.A06.A00(bufferInfo, outputBuffer);
                    return;
                } finally {
                    mediaCodec.releaseOutputBuffer(i, false);
                }
            }
            this.A06.A01(AbstractC72046XLm.A0R("encoderOutputBuffer : %d was null", AbstractC25228BEl.A1Y(i)));
        }
    }

    @Override // X.BET
    public final void COY(byte[] bArr, int i, long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.BET
    public final void E5X(Handler handler, InterfaceC176207sd interfaceC176207sd) {
        this.A00 = new MediaCodec.BufferInfo();
        this.A03.post(new RunnableC73529YHz(handler, this, interfaceC176207sd));
    }

    @Override // X.BET
    public final void Emt(Handler handler, InterfaceC176207sd interfaceC176207sd) {
        this.A03.post(new YI0(handler, this, interfaceC176207sd));
    }

    @Override // X.BET
    public final void EoU(Handler handler, InterfaceC176207sd interfaceC176207sd) {
        this.A03.post(new YI1(handler, this, interfaceC176207sd));
    }

    public Y9S(Handler handler, C177567uq c177567uq, InterfaceC178337w7 interfaceC178337w7, C72680Xl1 c72680Xl1, AC8 ac8) {
        this.A04 = c177567uq;
        this.A06 = ac8;
        this.A03 = handler;
        this.A05 = interfaceC178337w7;
        this.A07 = c72680Xl1;
    }

    @Override // X.InterfaceC25158BBd
    public final MediaFormat BaG() {
        return this.A02;
    }

    @Override // X.BET
    public final void COX(C73493YFw c73493YFw, int i, long j) {
        if (Looper.myLooper() == this.A03.getLooper()) {
            if (this.A08 == C05F.A0C) {
                try {
                    c73493YFw.A00 = i;
                    c73493YFw.A01 = j;
                    c73493YFw.A00();
                    return;
                } catch (Exception e) {
                    this.A06.A01(e);
                    return;
                }
            }
            return;
        }
        throw AbstractC166987dD.A14("inputData must be invoked on the same thread as the other methods");
    }
}
