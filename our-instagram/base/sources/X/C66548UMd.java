package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.UMd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66548UMd extends AbstractC53638Nnj {
    public final AtomicReference A00;
    public final C54993OUc A01;
    public final C68902Vdz A02;
    public final boolean A03;

    public C66548UMd(C54993OUc c54993OUc, C68902Vdz c68902Vdz, WG6 wg6, boolean z) {
        C14360o3.A0B(c68902Vdz, 2);
        this.A02 = c68902Vdz;
        this.A03 = z;
        this.A01 = c54993OUc;
        this.A00 = new AtomicReference(wg6);
    }

    @Override // X.AbstractC53638Nnj
    public final void A01(Exception exc, Map map, int i, boolean z) {
        AbstractC167007dF.A1E(exc, 0, map);
        AtomicReference atomicReference = this.A00;
        WG6 wg6 = (WG6) atomicReference.get();
        if (wg6 != null) {
            this.A01.A05.A00(exc);
            WG6.A03(wg6, exc, C05F.A01, "Failed to complete POST request", map, i, WG6.A00(exc), z);
        }
        atomicReference.set(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r12 == null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC53638Nnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.String r24, int r25, java.util.Map r26) {
        /*
            r23 = this;
            r5 = 0
            r13 = r24
            r6 = r26
            int r10 = X.AbstractC167007dF.A06(r5, r13, r6)
            r2 = r23
            java.util.concurrent.atomic.AtomicReference r1 = r2.A00
            java.lang.Object r0 = r1.get()
            X.WG6 r0 = (X.WG6) r0
            if (r0 == 0) goto Lc8
            boolean r8 = r2.A03
            X.XGn r4 = r0.A02     // Catch: X.VI4 -> Lb5
            r4.DHE(r13, r6, r8)     // Catch: X.VI4 -> Lb5
            int r2 = r13.length()     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            r9 = 1
            if (r2 <= 0) goto L33
            X.16L r2 = X.C16V.A00(r13)     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            X.Vkc r7 = X.VMK.parseFromJson(r2)     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            if (r7 != 0) goto L38
            X.VI4 r2 = new X.VI4     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            r2.<init>(r13)     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
        L32:
            throw r2     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
        L33:
            X.Vkc r7 = new X.Vkc     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            r7.<init>()     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
        L38:
            X.OUc r3 = r0.A04     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            X.Ni6 r2 = r3.A03     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            java.lang.Integer r2 = r2.A00     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            int r2 = r2.intValue()     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            if (r2 == r9) goto L49
            if (r2 != r10) goto L4d
            java.lang.String r12 = r7.A00     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            goto L4b
        L49:
            java.lang.String r12 = r7.A01     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
        L4b:
            if (r12 != 0) goto L4f
        L4d:
            java.lang.String r12 = ""
        L4f:
            X.W2H r2 = r3.A02     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            boolean r2 = r2.A01     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            if (r2 != 0) goto L7d
            java.lang.Integer r11 = X.C05F.A00     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
        L57:
            long r2 = r0.A01     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            java.lang.String r14 = r7.A03     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            java.lang.String r15 = r7.A02     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            java.util.HashMap r9 = r7.A04     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            X.Vdz r7 = r0.A06     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            java.util.ArrayList r7 = r7.A01     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            java.net.URI r10 = r0.A03     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            if (r10 == 0) goto L85
            java.lang.String r16 = r10.getHost()     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            if (r16 == 0) goto L85
            X.W63 r10 = new X.W63     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            r20 = r5
            r21 = r2
            r18 = r9
            r19 = r6
            r17 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            goto L8a
        L7d:
            if (r8 == 0) goto L82
            java.lang.Integer r11 = X.C05F.A01     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            goto L57
        L82:
            java.lang.Integer r11 = X.C05F.A0C     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            goto L57
        L85:
            java.lang.IllegalStateException r2 = X.AbstractC166997dE.A0g()     // Catch: java.io.IOException -> Laf X.VI4 -> Lb5
            goto L32
        L8a:
            if (r8 == 0) goto L9f
            long r2 = r0.A00     // Catch: X.VI4 -> Lb5
            r0.A00 = r2     // Catch: X.VI4 -> Lb5
            r4.D16(r2)     // Catch: X.VI4 -> Lb5
            long r2 = r0.A00     // Catch: X.VI4 -> Lb5
            float r8 = (float) r2     // Catch: X.VI4 -> Lb5
            X.Odx r2 = r0.A05     // Catch: X.VI4 -> Lb5
            long r2 = r2.A00     // Catch: X.VI4 -> Lb5
            float r7 = (float) r2     // Catch: X.VI4 -> Lb5
            float r8 = r8 / r7
            r4.Dbk(r8)     // Catch: X.VI4 -> Lb5
        L9f:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.Dbk(r2)     // Catch: X.VI4 -> Lb5
            r4.D6h(r10)     // Catch: X.VI4 -> Lb5
            r2 = 0
            r0.A09 = r2     // Catch: X.VI4 -> Lb5
            r0.A0A = r2     // Catch: X.VI4 -> Lb5
            r0.A0B = r2     // Catch: X.VI4 -> Lb5
            goto Lc8
        Laf:
            X.VI4 r2 = new X.VI4     // Catch: X.VI4 -> Lb5
            r2.<init>()     // Catch: X.VI4 -> Lb5
            throw r2     // Catch: X.VI4 -> Lb5
        Lb5:
            r9 = move-exception
            r14 = -1
            java.lang.String r2 = "Failed to parse offset from POST response:"
            java.lang.String r11 = X.AnonymousClass001.A0R(r2, r13)
            r16 = 1
            java.lang.Integer r10 = X.C05F.A01
            r8 = r0
            r12 = r6
            r13 = r5
            X.WG6.A03(r8, r9, r10, r11, r12, r13, r14, r16)
        Lc8:
            r0 = 0
            r1.set(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66548UMd.A02(java.lang.String, int, java.util.Map):void");
    }

    @Override // X.AbstractC53638Nnj
    public final void A00(int i) {
        C69684VtU c69684VtU;
        WG6 wg6 = (WG6) this.A00.get();
        if (wg6 != null) {
            C68902Vdz c68902Vdz = this.A02;
            long j = i;
            long j2 = c68902Vdz.A00;
            long uptimeMillis = SystemClock.uptimeMillis();
            c68902Vdz.A00 = uptimeMillis;
            long j3 = uptimeMillis - j2;
            ArrayList arrayList = c68902Vdz.A01;
            if (!arrayList.isEmpty()) {
                C69684VtU c69684VtU2 = (C69684VtU) arrayList.get(arrayList.size() - 1);
                c69684VtU2.A00 += j;
                c69684VtU2.A01 += j3;
            }
            if (arrayList.isEmpty()) {
                c69684VtU = null;
            } else {
                c69684VtU = (C69684VtU) arrayList.get(0);
            }
            long j4 = wg6.A00 + j;
            wg6.A00 = j4;
            XGn xGn = wg6.A02;
            xGn.D16(j4);
            xGn.Dbk(((float) wg6.A00) / ((float) wg6.A05.A00));
            if (c69684VtU != null) {
                xGn.DvI(c69684VtU);
            }
        }
    }
}
