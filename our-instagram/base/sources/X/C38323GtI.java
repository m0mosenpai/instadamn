package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GtI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38323GtI extends AbstractC52922bZ {
    public java.util.Set A00;
    public final C2GT A01;
    public final C2GS A02;
    public final UserSession A03;
    public final C39324HYp A04;
    public final C39332HYx A05;
    public final InterfaceC06180Ui A06;
    public final InterfaceC15070pN A07;
    public final C42866Ixg A08;
    public final C41202ILq A09;
    public final C41203ILr A0A;
    public final C42867Ixh A0B;
    public final C42869Ixj A0C;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.PIC, X.HYx] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.2GT, X.2GS] */
    public C38323GtI(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C39324HYp c39324HYp) {
        AbstractC167027dH.A0a(1, userSession, context, abstractC018607g, c39324HYp);
        this.A03 = userSession;
        this.A04 = c39324HYp;
        this.A00 = AbstractC31171DnF.A0l();
        C42869Ixj c42869Ixj = new C42869Ixj(this);
        this.A0C = c42869Ixj;
        C42867Ixh c42867Ixh = new C42867Ixh(this);
        this.A0B = c42867Ixh;
        C42866Ixg c42866Ixg = new C42866Ixg(this, 3);
        this.A08 = c42866Ixg;
        this.A05 = new PIC(userSession, c42866Ixg);
        this.A0A = new C41203ILr(context, abstractC018607g, userSession, c42869Ixj);
        this.A09 = new C41202ILq(context, abstractC018607g, userSession, c42867Ixh);
        C16930sl c16930sl = C16930sl.A00;
        C16910sj c16910sj = C16910sj.A00;
        ?? c2gt = new C2GT(new C37783Gjy(null, "", null, c16930sl, c16930sl, c16910sj, c16910sj, false, false, false, false, false, false));
        this.A02 = c2gt;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A06 = A00;
        this.A01 = c2gt;
        this.A07 = new C06160Ug(null, A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(com.instagram.model.shopping.ProductGroup r9, X.C41643IbZ r10, com.instagram.user.model.Product r11) {
        /*
            r8 = this;
            r2 = 0
            boolean r6 = X.AbstractC167007dF.A1R(r2, r11, r10)
            java.util.Set r5 = r8.A00
            boolean r0 = X.C41643IbZ.A00(r10, r5)
            if (r0 != 0) goto Ld0
            X.2GT r4 = r8.A01
            X.Gjy r0 = X.AbstractC37302Gc3.A0N(r4)
            java.util.Set r0 = r0.A05
            boolean r0 = X.C41643IbZ.A00(r10, r0)
            r3 = r0 ^ 1
            r0 = 20
            X.BQB r1 = new X.BQB
            r1.<init>(r0, r11, r10, r3)
            X.2GS r0 = r8.A02
            X.AbstractC37304Gc5.A0x(r4, r0, r1)
            java.lang.String r0 = r10.A02()
            r5.add(r0)
            if (r3 == 0) goto Lc6
            if (r9 == 0) goto Lbb
            X.HYp r7 = r8.A04
            X.0wW r1 = r7.A02
            java.lang.String r0 = "instagram_shopping_shop_manager_add_product_variant_selection_tap"
            X.0Ai r4 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto Lc0
            java.util.List r0 = r9.A02
            java.util.List r0 = X.AbstractC31172DnG.A19(r0)
            java.lang.Object r3 = X.AbstractC001800i.A0O(r0, r2)
            com.instagram.model.shopping.ProductVariantDimension r3 = (com.instagram.model.shopping.ProductVariantDimension) r3
            java.util.List r0 = r9.A02
            java.util.Iterator r5 = X.AbstractC31174DnI.A13(r0)
        L54:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r2 = r5.next()
            com.instagram.model.shopping.ProductVariantDimension r2 = (com.instagram.model.shopping.ProductVariantDimension) r2
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r1 = r2.A00
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r0 = com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle.A05
            if (r1 != r0) goto L54
            r3 = r2
        L67:
            java.lang.String r1 = r7.A04
            java.lang.String r0 = "waterfall_id"
            r4.AAP(r0, r1)
            java.lang.String r1 = r7.A03
            java.lang.String r0 = "prior_module"
            java.lang.Boolean r1 = X.AbstractC31173DnH.A0e(r4, r0, r1, r6)
            java.lang.String r0 = "is_halfsheet"
            r4.A7v(r0, r1)
            java.lang.String r1 = r11.A0H
            java.lang.String r0 = "product_id"
            r4.AAP(r0, r1)
            java.lang.String r0 = r10.A03()
            X.Hdc r0 = X.I7Q.A00(r0)
            if (r0 == 0) goto Lb8
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto Lb5
            r0 = 1
            if (r1 != r0) goto Lb8
            java.lang.String r1 = "product_item"
        L98:
            java.lang.String r0 = "product_row_type"
            r4.AAP(r0, r1)
            r0 = 0
            if (r3 == 0) goto Lb3
            java.lang.String r2 = r3.A03
        La2:
            java.lang.String r1 = "product_variant_dimension"
            r4.AAP(r1, r2)
            if (r3 == 0) goto Lab
            java.lang.String r0 = r3.A02
        Lab:
            r11.A00(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lb3:
            r2 = r0
            goto La2
        Lb5:
            java.lang.String r1 = "product_group"
            goto L98
        Lb8:
            java.lang.String r1 = ""
            goto L98
        Lbb:
            X.HYp r0 = r8.A04
            r0.A00(r10, r11)
        Lc0:
            X.ILq r0 = r8.A09
            r0.A00(r10, r11)
            return
        Lc6:
            X.HYp r0 = r8.A04
            r0.A01(r10, r11)
            X.ILr r0 = r8.A0A
            r0.A00(r10, r11)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38323GtI.A00(com.instagram.model.shopping.ProductGroup, X.IbZ, com.instagram.user.model.Product):void");
    }

    public final void A01(String str) {
        boolean A1Y = C17060sy.A01.A01(this.A03).A1Y();
        C43211J8i c43211J8i = new C43211J8i(str, A1Y, 4);
        AbstractC37304Gc5.A0x(this.A01, this.A02, c43211J8i);
        if (!A1Y) {
            C39332HYx c39332HYx = this.A05;
            c39332HYx.A01 = str;
            c39332HYx.A06(true);
        }
    }
}
