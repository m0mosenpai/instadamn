package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.io.IOException;

/* renamed from: X.5hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123195hu implements C2BB {
    public int A00;
    public long A01;
    public long A02;
    public String A03;
    public final InterfaceC46362Ay A04;
    public final VpsEventCallback A05;
    public final C95844St A06;
    public final C123185ht A07;

    @Override // X.C2BC
    public final void D15(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, int i, boolean z) {
    }

    @Override // X.C2BB
    public final void DHL(EnumC92424Bx enumC92424Bx, long j, long j2, long j3) {
    }

    @Override // X.C2BB
    public final void DHM(long j, long j2) {
    }

    @Override // X.C2BB
    public final void Dv8() {
    }

    @Override // X.C2BC
    public final void Dv9(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z) {
    }

    @Override // X.C2BB
    public final void DvA(IOException iOException) {
    }

    @Override // X.C2BD
    public final void DvD(String str, Object obj) {
        if ("live_trace".equals(str)) {
            C46492Bm c46492Bm = (C46492Bm) obj;
            if (this.A03 != null) {
                int i = (int) (c46492Bm.A00 - this.A02);
                for (int i2 = 0; i2 < c46492Bm.A07.length; i2++) {
                    VpsEventCallback vpsEventCallback = this.A05;
                    long j = this.A01;
                    this.A01 = 1 + j;
                    vpsEventCallback.callback(new UtV(c46492Bm, this.A03, c46492Bm.A01, i2, i, this.A00, j));
                    this.A07.A01(new W2Q(c46492Bm, i2, false));
                }
            }
        }
    }

    @Override // X.C2BC
    public final void DvH(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z, boolean z2) {
    }

    @Override // X.C2BB
    public final void ETY(String str) {
    }

    public final void A00(W2Q w2q) {
        String str = this.A03;
        if (str != null) {
            long currentTimeMillis = System.currentTimeMillis();
            VpsEventCallback vpsEventCallback = this.A05;
            C46492Bm c46492Bm = w2q.A01;
            int i = w2q.A00;
            long j = this.A01;
            this.A01 = 1 + j;
            int i2 = this.A00;
            boolean z = w2q.A02;
            EnumC53322cG enumC53322cG = EnumC53322cG.A0E;
            C46502Bn c46502Bn = C46492Bm.A09;
            vpsEventCallback.callback(new UtX(c46492Bm, enumC53322cG, c46502Bn.A00, c46502Bn.A03, str, i, i2, j, currentTimeMillis, z));
            long[] jArr = {c46492Bm.A07[i].A01};
            if (this.A03 != null) {
                this.A06.DPS(new C68692VaS(jArr));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r29.equals(r27.A03) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.String r28, java.lang.String r29, int r30) {
        /*
            r27 = this;
            r2 = r27
            r3 = r29
            if (r29 == 0) goto Lf
            java.lang.String r0 = r2.A03
            boolean r1 = r3.equals(r0)
            r0 = 1
            if (r1 == 0) goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r3
            r1 = r30
            r2.A00 = r1
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7a
            long r25 = java.lang.System.currentTimeMillis()
            java.util.HashMap r23 = new java.util.HashMap
            r23.<init>()
            java.lang.String r18 = ""
            java.lang.String r22 = "STREAM_INFO"
            X.2Bn r0 = X.C46492Bm.A09
            double r0 = java.lang.Math.random()
            r4 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            double r0 = r0 * r4
            long r4 = (long) r0
            r0 = 0
            r8 = 0
            X.VeI r6 = new X.VeI
            r6.<init>(r4, r0)
            r16 = 0
            X.VeI[] r24 = new X.C68918VeI[]{r6}
            X.2Bm r5 = new X.2Bm
            r19 = r28
            r17 = r5
            r20 = r8
            r21 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            if (r29 == 0) goto L7a
            r10 = 0
        L55:
            X.VeI[] r0 = r5.A07
            int r0 = r0.length
            if (r10 >= r0) goto L7a
            com.facebook.exoplayer.monitor.VpsEventCallback r3 = r2.A05
            long r12 = r2.A01
            r0 = 1
            long r0 = r0 + r12
            r2.A01 = r0
            java.lang.String r9 = r2.A03
            int r11 = r2.A00
            X.2cG r6 = X.EnumC53322cG.A08
            X.2Bn r0 = X.C46492Bm.A09
            java.lang.String r7 = r0.A03
            long r14 = r5.A00
            X.UtS r4 = new X.UtS
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16)
            r3.callback(r4)
            int r10 = r10 + 1
            goto L55
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123195hu.A01(java.lang.String, java.lang.String, int):void");
    }

    public C123195hu(InterfaceC46362Ay interfaceC46362Ay, VpsEventCallback vpsEventCallback, C95844St c95844St, C123185ht c123185ht) {
        this.A01 = 0L;
        this.A05 = vpsEventCallback;
        this.A07 = c123185ht;
        this.A04 = interfaceC46362Ay;
        this.A06 = c95844St;
    }

    @Override // X.C2BB
    public final void DvF(EnumC92424Bx enumC92424Bx, C4C7 c4c7) {
        this.A02 = System.currentTimeMillis();
    }

    public C123195hu() {
    }
}
