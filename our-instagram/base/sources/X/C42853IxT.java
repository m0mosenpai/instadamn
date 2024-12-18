package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.IxT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42853IxT implements InterfaceC43442JHg {
    public final /* synthetic */ IM5 A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC43442JHg
    public final void Dxo(List list) {
        C14360o3.A0B(list, 0);
        IM5 im5 = this.A00;
        InterfaceC11380iw interfaceC11380iw = im5.A03;
        UserSession userSession = im5.A04;
        AbstractC41757IeY.A05(interfaceC11380iw, userSession, null, null, this.A01, "add_to_bag_cta", interfaceC11380iw.getModuleName(), this.A02, null, this.A03);
        JGU jgu = (JGU) AbstractC001800i.A0J(list);
        if (jgu != null) {
            AbstractC41666Iby.A02(jgu.BSe(im5.A00, userSession), 0, "add_to_bag_cta_product_add_to_cart_failure");
        }
    }

    public C42853IxT(IM5 im5, Product product, String str, String str2) {
        this.A00 = im5;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = product;
    }

    @Override // X.InterfaceC43442JHg
    public final void DVJ(String str) {
        IM5 im5 = this.A00;
        InterfaceC11380iw interfaceC11380iw = im5.A03;
        AbstractC41757IeY.A05(interfaceC11380iw, im5.A04, null, null, this.A01, "add_to_bag_cta", interfaceC11380iw.getModuleName(), this.A02, null, this.A03);
        AbstractC41666Iby.A01(im5.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r2.A05(r4) != null) goto L8;
     */
    @Override // X.InterfaceC43442JHg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            X.IM5 r5 = r6.A00
            java.lang.String r4 = r6.A02
            java.lang.String r3 = r6.A03
            com.instagram.common.session.UserSession r0 = r5.A04
            X.70Y r2 = X.C70Y.A00(r0)
            X.C14360o3.A07(r2)
            X.70e r0 = r2.A07
            java.util.Map r0 = r0.A0A
            java.lang.Object r1 = r0.get(r4)
            X.HdB r0 = X.EnumC39539HdB.A03
            if (r1 == r0) goto L26
            X.HdB r0 = X.EnumC39539HdB.A02
            if (r1 == r0) goto L26
            X.IbP r0 = r2.A05(r4)
            r1 = 0
            if (r0 == 0) goto L27
        L26:
            r1 = 1
        L27:
            X.ILa r0 = new X.ILa
            r0.<init>(r5, r4, r3)
            if (r1 != 0) goto L32
            r2.A07(r0)
            return
        L32:
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42853IxT.onSuccess(java.lang.Object):void");
    }
}
