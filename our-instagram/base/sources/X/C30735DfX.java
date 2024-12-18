package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DfX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30735DfX extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ InterfaceC74963Ym A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ InterfaceC16610sE A06;
    public final /* synthetic */ C5Hc A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30735DfX(InterfaceC74963Ym interfaceC74963Ym, UserSession userSession, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16610sE interfaceC16610sE, C5Hc c5Hc) {
        super(4);
        this.A02 = list;
        this.A03 = interfaceC16660sJ;
        this.A05 = interfaceC16660sJ2;
        this.A00 = interfaceC74963Ym;
        this.A04 = interfaceC16660sJ3;
        this.A01 = userSession;
        this.A07 = c5Hc;
        this.A06 = interfaceC16610sE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r2 < (r20.A07.size() - 1)) goto L23;
     */
    @Override // X.InterfaceC16600sD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            r20 = this;
            r6 = r23
            int r2 = X.AbstractC166987dD.A0H(r22)
            X.5Tl r6 = (X.C5Tl) r6
            int r3 = X.AbstractC166987dD.A0H(r24)
            r0 = r3 & 6
            if (r0 != 0) goto Ld5
            r0 = r21
            int r0 = X.AbstractC25232BEp.A0R(r6, r0)
            r1 = r3 | r0
        L18:
            r0 = r3 & 48
            if (r0 != 0) goto L21
            int r0 = X.AbstractC25232BEp.A09(r6, r2)
            r1 = r1 | r0
        L21:
            r1 = r1 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L33
            boolean r0 = r6.Bxj()
            if (r0 == 0) goto L33
            r6.Em9()
        L30:
            X.0eB r0 = X.C0eB.A00
            return r0
        L33:
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L41
            r1 = -438437952(0xffffffffe5ddf7c0, float:-1.3102665E23)
            java.lang.String r0 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
            X.C0fH.A01(r1, r0)
        L41:
            r3 = r20
            java.util.List r0 = r3.A02
            java.lang.Object r15 = r0.get(r2)
            r0 = -893107084(0xffffffffcac44474, float:-6431290.0)
            r6.Eno(r0)
            X.0sJ r0 = r3.A03
            java.lang.Object r0 = r0.invoke(r15)
            float r18 = X.AbstractC166987dD.A09(r0)
            X.0sJ r0 = r3.A05
            java.lang.Object r8 = r0.invoke(r15)
            java.lang.String r8 = (java.lang.String) r8
            X.3Ym r0 = r3.A00
            float r13 = X.AbstractC25228BEl.A00(r0)
            java.lang.String r1 = "post"
            X.0sJ r0 = r3.A04
            java.lang.Object r0 = r0.invoke(r15)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r9 = X.AnonymousClass001.A0R(r1, r0)
            X.58n r7 = androidx.compose.ui.Modifier.A00
            com.instagram.common.session.UserSession r5 = r3.A01
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36327842706897833(0x810ffb00003ba9, double:3.0372122360989264E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            r1 = 1
            if (r0 == 0) goto L92
            if (r2 <= 0) goto Lc1
            X.5Hc r0 = r3.A07
            int r0 = r0.size()
            int r0 = r0 - r1
            if (r2 >= r0) goto Lce
        L92:
            X.5Y4 r4 = X.AbstractC136956Hy.A03
            X.5Y4 r5 = X.AbstractC136956Hy.A02
            r10 = 0
            X.0sE r1 = r3.A06
            r0 = 1799358689(0x6b4008e1, float:2.3215569E26)
            X.DcO r14 = new X.DcO
            r16 = r8
            r19 = r2
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            X.5TR r12 = X.C5UA.A01(r6, r14, r0)
            r14 = 100663296(0x6000000, float:2.4074124E-35)
            r15 = 144(0x90, float:2.02E-43)
            r11 = r10
            X.AbstractC136956Hy.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = X.AbstractC25230BEn.A1Y(r6)
            if (r0 == 0) goto L30
            r0 = 668229215(0x27d45e5f, float:5.8944138E-15)
            X.C0fH.A00(r0)
            goto L30
        Lc1:
            if (r2 != 0) goto Lce
            r0 = 1090519040(0x41000000, float:8.0)
            X.5WI r0 = X.C5WF.A02(r0, r13, r13, r0)
        Lc9:
            androidx.compose.ui.Modifier r7 = X.C6L2.A01(r7, r0)
            goto L92
        Lce:
            r0 = 1090519040(0x41000000, float:8.0)
            X.5WI r0 = X.C5WF.A02(r13, r0, r0, r13)
            goto Lc9
        Ld5:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30735DfX.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
