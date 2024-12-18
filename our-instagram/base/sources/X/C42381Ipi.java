package X;

import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import java.util.Map;

/* renamed from: X.Ipi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42381Ipi implements InterfaceC43071ya {
    public boolean A00;
    public final AdsProductPageFragment A01;
    public final Map A02 = AbstractC166987dD.A1I();

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // X.InterfaceC43071ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATP(X.C59062n7 r6, X.InterfaceC57162jr r7) {
        /*
            r5 = this;
            r4 = 0
            boolean r0 = X.AbstractC167007dF.A1R(r4, r6, r7)
            r3 = 1
            int r1 = X.AbstractC37301Gc2.A01(r6, r7)
            if (r1 == r4) goto L58
            r0 = 2
            if (r1 != r0) goto L1a
            java.util.Map r2 = r5.A02
            java.lang.String r1 = r6.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L17:
            r2.put(r1, r0)
        L1a:
            java.util.Map r1 = r5.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L56
            java.util.Iterator r1 = X.AbstractC166997dE.A15(r1)
        L26:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = X.AbstractC31176DnK.A0j(r1)
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            if (r0 == 0) goto L26
        L36:
            boolean r0 = r5.A00
            if (r0 == r3) goto L55
            r5.A00 = r3
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r1 = r5.A01
            X.JID r0 = r1.A0N
            if (r0 == 0) goto L55
            com.instagram.user.model.User r2 = r0.BSW()
            if (r2 == 0) goto L55
            X.HHF r1 = r1.A0A
            com.instagram.user.model.Product r0 = r0.Bgk()
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.api.schemas.SellerBadgeDict r0 = r0.A08
            r1.A01(r0, r2)
        L55:
            return
        L56:
            r3 = 0
            goto L36
        L58:
            java.util.Map r2 = r5.A02
            java.lang.String r1 = r6.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42381Ipi.ATP(X.2n7, X.2jr):void");
    }

    public C42381Ipi(AdsProductPageFragment adsProductPageFragment) {
        this.A01 = adsProductPageFragment;
    }
}
