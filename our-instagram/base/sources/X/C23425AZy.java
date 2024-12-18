package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* renamed from: X.AZy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23425AZy implements InterfaceC25219BDt {
    public int A00;
    public int A01;
    public MediaMuxer A02;
    public volatile boolean A03;
    public volatile boolean A04;
    public volatile boolean A05;
    public volatile boolean A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    @Override // X.InterfaceC25219BDt
    public final void EaE(int i) {
        this.A02.setOrientationHint(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r4 != 0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC25219BDt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int EoQ(int[] r6) {
        /*
            r5 = this;
            r3 = 0
            r2 = 0
            android.media.MediaMuxer r0 = r5.A02     // Catch: java.lang.Throwable -> L6a
            r1 = 1
            if (r0 == 0) goto L49
            boolean r0 = r5.A05     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L15
            boolean r0 = r5.A04     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L15
            boolean r0 = r5.A03     // Catch: java.lang.Throwable -> L6a
            r4 = 2
            if (r0 == 0) goto L46
            goto L45
        L15:
            boolean r0 = r5.A08     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L24
            boolean r0 = r5.A07     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L24
            boolean r0 = r5.A06     // Catch: java.lang.Throwable -> L6a
            r4 = 4
            if (r0 == 0) goto L46
            r4 = 5
            goto L46
        L24:
            r4 = 0
            r6[r2] = r1     // Catch: java.lang.Throwable -> L6a
            int r1 = X.AbstractC177717v5.A00     // Catch: java.lang.Throwable -> L6a
            int r0 = r1 + (-1)
            X.AbstractC177717v5.A00 = r0     // Catch: java.lang.Throwable -> L6a
            if (r1 <= 0) goto L34
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L34 java.lang.Throwable -> L6a
        L34:
            android.media.MediaMuxer r0 = r5.A02     // Catch: java.lang.Throwable -> L6a
            r0.stop()     // Catch: java.lang.Throwable -> L6a
            r0 = 2
            r6[r2] = r0     // Catch: java.lang.Throwable -> L6a
            android.media.MediaMuxer r0 = r5.A02     // Catch: java.lang.Throwable -> L6a
            r0.release()     // Catch: java.lang.Throwable -> L6a
            r0 = 3
            r6[r2] = r0     // Catch: java.lang.Throwable -> L6a
            goto L46
        L45:
            r4 = 3
        L46:
            r1 = r4
            if (r4 == 0) goto L57
        L49:
            boolean r0 = r5.A09     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L57
            boolean r0 = r5.A0A     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L52
            goto L55
        L52:
            int r1 = r1 + 10
            goto L57
        L55:
            int r1 = r1 + 20
        L57:
            r5.A04 = r2
            r5.A07 = r2
            r5.A03 = r2
            r5.A06 = r2
            r5.A0A = r2
            r5.A09 = r2
            r5.A02 = r3
            r5.A00 = r2
            r5.A01 = r2
            return r1
        L6a:
            r0 = move-exception
            r5.A04 = r2
            r5.A07 = r2
            r5.A03 = r2
            r5.A06 = r2
            r5.A0A = r2
            r5.A09 = r2
            r5.A02 = r3
            r5.A00 = r2
            r5.A01 = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23425AZy.EoQ(int[]):int");
    }

    @Override // X.InterfaceC25219BDt
    public final void start() {
        this.A0A = true;
        this.A02.start();
        this.A09 = true;
    }

    @Override // X.InterfaceC25219BDt
    public final void AJA(String str) {
        AJB(str, C05F.A00);
    }

    @Override // X.InterfaceC25219BDt
    public final void ASg() {
        MediaMuxer mediaMuxer = this.A02;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.A02.release();
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // X.InterfaceC25219BDt
    public final void EQ1(MediaFormat mediaFormat) {
        this.A00 = this.A02.addTrack(mediaFormat);
        this.A05 = true;
    }

    @Override // X.InterfaceC25219BDt
    public final void Egv(MediaFormat mediaFormat) {
        this.A01 = this.A02.addTrack(mediaFormat);
        this.A08 = true;
    }

    @Override // X.InterfaceC25219BDt
    public final void FEP(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        AbstractC1808580n.A03("nativeWriteAudio");
        this.A03 = true;
        this.A02.writeSampleData(this.A00, byteBuffer, bufferInfo);
        this.A04 = true;
    }

    @Override // X.InterfaceC25219BDt
    public final void FEu(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        AbstractC1808580n.A03("nativeWriteVideo");
        this.A06 = true;
        if ((bufferInfo.flags & 2) == 0) {
            this.A02.writeSampleData(this.A01, byteBuffer, bufferInfo);
            this.A07 = true;
        }
    }

    @Override // X.InterfaceC25219BDt
    public final void AJB(String str, Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = -1;
                break;
            default:
                i = 0;
                break;
        }
        this.A02 = new MediaMuxer(str, i);
        this.A04 = false;
        this.A07 = false;
        this.A03 = false;
        this.A06 = false;
        this.A0A = false;
        this.A09 = false;
    }
}
