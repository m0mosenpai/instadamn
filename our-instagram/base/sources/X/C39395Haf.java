package X;

import android.view.ViewGroup;

/* renamed from: X.Haf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39395Haf extends AbstractC86353t7 {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C39C A01;
    public final /* synthetic */ IKE A02;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r2 == 3) goto L17;
     */
    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dyj(X.C51752Mtb r10) {
        /*
            r9 = this;
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            int r2 = r10.A00
            java.lang.String r4 = "swipe_vertical"
            r1 = 2
            r0 = 1
            if (r2 == r0) goto L62
            if (r2 == r1) goto L5f
            r7 = r4
        Lf:
            int r3 = r10.A01
            if (r3 == r0) goto L5c
            if (r3 == r1) goto L59
            r0 = 4
            if (r3 == r0) goto L56
            java.lang.String r8 = "partial_sheet"
        L1a:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L2c
            X.39C r0 = r9.A01
            int r2 = r0.A00
            java.lang.String r7 = "swipe_down"
            r1 = 4
            r0 = 3
            if (r3 != r1) goto L4a
            if (r2 != r0) goto L54
        L2c:
            X.39C r2 = r9.A01
            int r0 = r2.A00
            if (r3 != r0) goto L34
            java.lang.String r8 = "no_change"
        L34:
            r2.A00 = r3
            X.1qM r4 = r9.A00
            com.instagram.common.session.UserSession r3 = r2.A06
            X.2pS r5 = r2.A07
            java.lang.Object r1 = r10.A02
            X.GyN r1 = (X.C38620GyN) r1
            android.content.Context r0 = r2.A04
            X.5vh r6 = X.IA0.A00(r0, r1)
            X.C86833tv.A04(r3, r4, r5, r6, r7, r8)
            return
        L4a:
            if (r3 != r0) goto L54
            r0 = 2
            if (r2 == r0) goto L2c
            if (r2 != r1) goto L54
            java.lang.String r7 = "swipe_up"
            goto L2c
        L54:
            r7 = r4
            goto L2c
        L56:
            java.lang.String r8 = "collapse"
            goto L1a
        L59:
            java.lang.String r8 = "fullscreen"
            goto L1a
        L5c:
            java.lang.String r8 = "dismiss"
            goto L1a
        L5f:
            java.lang.String r7 = "swipe_down"
            goto Lf
        L62:
            java.lang.String r7 = "swipe_up"
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39395Haf.Dyj(X.Mtb):void");
    }

    public C39395Haf(C38321qM c38321qM, C39C c39c, IKE ike) {
        this.A02 = ike;
        this.A01 = c39c;
        this.A00 = c38321qM;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void CwQ(float f) {
        ViewGroup viewGroup;
        this.A01.A01 = false;
        IKE ike = this.A02;
        C39447HbZ c39447HbZ = ike.A06;
        if (c39447HbZ != null && c39447HbZ.A0B && (viewGroup = ike.A03) != null && !c39447HbZ.A0E) {
            ike.A04.A00.A0E.invoke(48, viewGroup);
        }
        InterfaceC16660sJ interfaceC16660sJ = ike.A04.A00.A0A;
        C3Y2 c3y2 = ike.A05;
        interfaceC16660sJ.invoke(Integer.valueOf(c3y2.A00 + AbstractC167017dG.A0E(c3y2.A01)));
        ike.A01 = true;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DId(Integer num) {
        C30E c30e;
        C39C c39c = this.A01;
        c39c.A01 = true;
        C33P c33p = c39c.A08;
        if (c33p != null && (c30e = c33p.A0G) != null) {
            c30e.A0U("bottom_sheet");
        }
        c39c.A03 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DZk(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39395Haf.DZk(int, int):void");
    }
}
