package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Woo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71153Woo implements InterfaceC71985XDw {
    public MediaCodec A00;
    public MediaFormat A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final C69795Vve A05;

    public C71153Woo(C69795Vve c69795Vve, int i, int i2) {
        C14360o3.A0B(c69795Vve, 1);
        this.A05 = c69795Vve;
        this.A03 = i;
        this.A04 = i2;
    }

    @Override // X.InterfaceC71985XDw
    public final void cancel() {
        this.A02 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc A[EDGE_INSN: B:46:0x00bc->B:16:0x00bc BREAK  A[LOOP:0: B:2:0x001e->B:45:?], SYNTHETIC] */
    @Override // X.InterfaceC71985XDw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CqO(long r21, long r23) {
        /*
            r20 = this;
            android.media.MediaCodec$BufferInfo r2 = new android.media.MediaCodec$BufferInfo
            r2.<init>()
            r3 = r20
            int r0 = r3.A04
            long r0 = (long) r0
            long r23 = r23 * r0
            int r0 = r3.A03
            long r0 = (long) r0
            long r23 = r23 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r23 = r23 / r0
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r5]
            r15 = 0
            r11 = 0
            r9 = 0
        L1e:
            java.lang.String r10 = "codec"
            if (r9 != 0) goto Lb1
            boolean r0 = r3.A02
            if (r0 != 0) goto Lb1
            r0 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            android.media.MediaCodec r6 = r3.A00
            if (r7 < 0) goto L86
            if (r6 == 0) goto Lbc
            int r14 = r6.dequeueInputBuffer(r0)
            if (r14 < 0) goto L43
            android.media.MediaCodec r13 = r3.A00
            if (r13 == 0) goto Lbc
            r17 = 0
            r19 = 4
            r16 = r15
        L40:
            r13.queueInputBuffer(r14, r15, r16, r17, r19)
        L43:
            android.media.MediaCodec r6 = r3.A00
            if (r6 == 0) goto Lbc
            r0 = 0
            int r8 = r6.dequeueOutputBuffer(r2, r0)
            r9 = 0
        L4e:
            r6 = -1
            if (r8 == r6) goto L1e
            if (r8 < 0) goto L7d
            android.media.MediaCodec r6 = r3.A00
            if (r6 == 0) goto Lbc
            java.nio.ByteBuffer r7 = r6.getOutputBuffer(r8)
            X.Vve r6 = r3.A05     // Catch: java.lang.Exception -> L61
            r6.A00(r2, r7)     // Catch: java.lang.Exception -> L61
            goto L6f
        L61:
            r7 = move-exception
            java.lang.Class<X.Woo> r6 = X.C71153Woo.class
            java.lang.String r6 = r6.getSimpleName()
            X.C14360o3.A07(r6)
            X.C0w9.A07(r6, r7)
            r9 = 1
        L6f:
            int r6 = r2.flags
            r6 = r6 & 4
            if (r6 == 0) goto L76
            r9 = 1
        L76:
            android.media.MediaCodec r6 = r3.A00
            if (r6 == 0) goto Lbc
            r6.releaseOutputBuffer(r8, r15)
        L7d:
            android.media.MediaCodec r6 = r3.A00
            if (r6 == 0) goto Lbc
            int r8 = r6.dequeueOutputBuffer(r2, r0)
            goto L4e
        L86:
            if (r6 == 0) goto Lbc
            int r6 = r6.dequeueInputBuffer(r0)
            if (r6 < 0) goto L43
            r0 = 1024(0x400, double:5.06E-321)
            long r11 = r11 + r0
            android.media.MediaCodec r0 = r3.A00
            if (r0 == 0) goto Lbc
            java.nio.ByteBuffer r0 = r0.getInputBuffer(r6)
            if (r0 == 0) goto La4
            r0.clear()
            r0.position(r15)
            r0.put(r4)
        La4:
            android.media.MediaCodec r0 = r3.A00
            if (r0 == 0) goto Lbc
            r17 = 0
            r19 = 1
            r13 = r0
            r14 = r6
            r16 = r5
            goto L40
        Lb1:
            android.media.MediaCodec r1 = r3.A00
            if (r1 == 0) goto Lbc
            r0 = -237215854(0xfffffffff1dc5f92, float:-2.1824717E30)
            X.C0fT.A03(r1, r0)
            return
        Lbc:
            X.C14360o3.A0F(r10)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71153Woo.CqO(long, long):void");
    }

    @Override // X.InterfaceC71985XDw
    public final void E5e() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("aac-profile", 2);
        mediaFormat.setInteger("sample-rate", this.A04);
        mediaFormat.setInteger("channel-count", this.A03);
        mediaFormat.setInteger(TraceFieldType.Bitrate, 64000);
        this.A01 = mediaFormat;
        MediaCodec A02 = C0fT.A02("audio/mp4a-latm", 1658431799);
        this.A00 = A02;
        String str = "codec";
        if (A02 != null) {
            MediaFormat mediaFormat2 = this.A01;
            if (mediaFormat2 == null) {
                str = "audioFormat";
            } else {
                C0fT.A07(A02, null, mediaFormat2, null, 1, 1769226264);
                MediaCodec mediaCodec = this.A00;
                if (mediaCodec != null) {
                    C0fT.A05(mediaCodec, 1041434947);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC71985XDw
    public final void EnZ() {
        C69795Vve c69795Vve = this.A05;
        MediaFormat mediaFormat = this.A01;
        if (mediaFormat == null) {
            C14360o3.A0F("audioFormat");
            throw C00O.createAndThrow();
        }
        c69795Vve.A02(mediaFormat);
    }
}
