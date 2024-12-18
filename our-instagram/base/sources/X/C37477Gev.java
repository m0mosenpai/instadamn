package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Gev, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37477Gev implements InterfaceC670130s {
    public final int A00;
    public final Object A01;

    public C37477Gev(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC670130s
    public final Map Bkt() {
        if (2 - this.A00 != 0) {
            return AbstractC166987dD.A1G();
        }
        return AbstractC166987dD.A1I();
    }

    @Override // X.InterfaceC670130s
    public final void CtX(int i) {
        if (this.A00 == 0) {
            ((C37700Gib) this.A01).A0B = true;
        }
    }

    @Override // X.InterfaceC670130s
    public final void D7Y() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC670130s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C101484hA DnX(java.lang.Integer r6, java.util.List r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L28;
                default: goto L5;
            }
        L5:
            X.AbstractC167017dG.A1N(r7, r6)
            java.lang.Object r2 = r5.A01
            X.GeR r2 = (X.C37447GeR) r2
            X.318 r1 = r2.A0D
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0E = r0
            X.30s r0 = r2.A04
        L18:
            if (r0 == 0) goto L20
            X.4hA r0 = r0.DnX(r6, r7)
        L1e:
            if (r0 != 0) goto L27
        L20:
            X.0sl r1 = X.C16930sl.A00
            X.4hA r0 = new X.4hA
            r0.<init>(r1, r1)
        L27:
            return r0
        L28:
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            java.lang.Object r0 = r5.A01
            X.Iz5 r0 = (X.C42953Iz5) r0
            X.30s r1 = r0.A03
            if (r1 == 0) goto L20
            java.lang.Integer r0 = X.C05F.A00
            X.4hA r0 = r1.DnX(r0, r7)
            goto L1e
        L3b:
            X.AbstractC167017dG.A1N(r7, r6)
            java.lang.Object r4 = r5.A01
            X.Gib r4 = (X.C37700Gib) r4
            boolean r0 = r4.A09
            if (r0 != 0) goto L6a
            com.instagram.common.session.UserSession r3 = r4.A0Q
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318526925838616(0x810782002e1918, double:3.031320898645438E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L6a
            X.0wb r4 = X.C18950wb.A01
            r3 = 976028688(0x3a2d0410, float:6.6000316E-4)
            java.lang.String r2 = "SponsoredItemDelivery after fetcher de-activated, listSize: "
            int r1 = r7.size()
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = X.AnonymousClass001.A0I(r2, r0, r1)
            X.AbstractC166987dD.A1T(r4, r0, r3)
            goto L20
        L6a:
            X.30s r0 = r4.A04
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37477Gev.DnX(java.lang.Integer, java.util.List):X.4hA");
    }

    @Override // X.InterfaceC670130s
    public final /* synthetic */ C101484hA DnY(Integer num, Integer num2, List list) {
        int i = this.A00;
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(24));
    }
}
