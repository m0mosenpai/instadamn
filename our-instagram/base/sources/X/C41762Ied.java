package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.shopping.ProductSource;
import java.util.List;

/* renamed from: X.Ied, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41762Ied {
    public ProductSource A00;
    public EnumC39617HeR A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final InterfaceC09390do A07;
    public final boolean A08;

    public C41762Ied(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A08 = z;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A07 = J8X.A00(this, 15);
    }

    public static String A01(InterfaceC02590Ai interfaceC02590Ai, C41762Ied c41762Ied, String str) {
        EnumC39617HeR enumC39617HeR;
        interfaceC02590Ai.AAP("selected_source_id", str);
        ProductSource productSource = c41762Ied.A00;
        if (productSource == null || (enumC39617HeR = productSource.A00) == null) {
            return null;
        }
        return enumC39617HeR.toString();
    }

    public final void A07(ProductSource productSource, EnumC39617HeR enumC39617HeR, String str) {
        C14360o3.A0B(enumC39617HeR, 2);
        this.A00 = productSource;
        boolean z = this.A08;
        if (z) {
            if (str != null) {
                EnumC39617HeR A00 = I3J.A00(str);
                this.A01 = A00;
                if (A00 != enumC39617HeR) {
                    return;
                }
            } else {
                return;
            }
        } else {
            this.A01 = enumC39617HeR;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A07), "instagram_shopping_product_source_selection_opened");
        A0f.A7v("has_multiple_source_types", AbstractC31173DnH.A0e(A0f, "currently_viewed_source_type", String.valueOf(this.A01), z));
        A02(A0f, this);
        ProductSource productSource2 = this.A00;
        String str2 = null;
        if (productSource2 != null) {
            str2 = productSource2.A01;
        }
        A04(A0f, this, A01(A0f, this, str2));
        AbstractC37300Gc1.A0n(A0f, this.A05);
        A0f.Cht();
    }

    public final void A08(EnumC39617HeR enumC39617HeR) {
        C14360o3.A0B(enumC39617HeR, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A07), "instagram_shopping_product_source_load_start");
        A0f.AAP("loaded_source_type", enumC39617HeR.toString());
        String str = this.A05;
        if (str == null) {
            str = "";
        }
        AbstractC37300Gc1.A0n(A0f, str);
        A02(A0f, this);
        A03(A0f, this);
        ProductSource productSource = this.A00;
        String str2 = null;
        if (productSource != null) {
            str2 = productSource.A01;
        }
        A04(A0f, this, A01(A0f, this, str2));
        A0f.Cht();
    }

    public final void A09(EnumC39617HeR enumC39617HeR, Throwable th) {
        String str;
        String str2;
        EnumC39617HeR enumC39617HeR2;
        C14360o3.A0B(enumC39617HeR, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A07), "instagram_shopping_product_source_load_failure");
        A0f.AAP("loaded_source_type", enumC39617HeR.toString());
        String str3 = this.A05;
        if (str3 == null) {
            str3 = "";
        }
        AbstractC37300Gc1.A0n(A0f, str3);
        A02(A0f, this);
        A03(A0f, this);
        ProductSource productSource = this.A00;
        String str4 = null;
        if (productSource != null) {
            str = productSource.A01;
        } else {
            str = null;
        }
        A0f.AAP("selected_source_id", str);
        ProductSource productSource2 = this.A00;
        if (productSource2 != null && (enumC39617HeR2 = productSource2.A00) != null) {
            str2 = enumC39617HeR2.toString();
        } else {
            str2 = null;
        }
        A04(A0f, this, str2);
        if (th != null) {
            str4 = th.getMessage();
        }
        A0f.AAP("error_message", str4);
        A0f.Cht();
    }

    public final void A0A(EnumC39617HeR enumC39617HeR, List list, int i, boolean z) {
        C14360o3.A0B(enumC39617HeR, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A07), "instagram_shopping_product_source_load_success");
        A02(A0f, this);
        A0f.AAP("loaded_source_type", enumC39617HeR.toString());
        String str = this.A05;
        if (str == null) {
            str = "";
        }
        AbstractC37300Gc1.A0n(A0f, str);
        A03(A0f, this);
        ProductSource productSource = this.A00;
        String str2 = null;
        if (productSource != null) {
            str2 = productSource.A01;
        }
        A04(A0f, this, A01(A0f, this, str2));
        A0f.AAk("sources", list);
        A0f.A7v("has_more_results", AbstractC37300Gc1.A0P(A0f, AbstractC31171DnF.A0V(i), "result_count", z));
        A0f.Cht();
    }

    public static final C19280xC A00(C41762Ied c41762Ied, String str) {
        C82713mZ c82713mZ = new C82713mZ(c41762Ied.A03, AnonymousClass001.A0g("instagram_shopping", "_", str));
        c82713mZ.A6Z = c41762Ied.A05;
        return c82713mZ.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r4.A01 == X.EnumC39617HeR.A03) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.InterfaceC02590Ai r3, X.C41762Ied r4) {
        /*
            boolean r0 = r4.A08
            if (r0 != 0) goto Lb
            X.HeR r2 = r4.A01
            X.HeR r1 = X.EnumC39617HeR.A03
            r0 = 0
            if (r2 != r1) goto Lc
        Lb:
            r0 = 1
        Lc:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_influencer"
            r3.A7v(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41762Ied.A02(X.0Ai, X.Ied):void");
    }

    public static void A03(InterfaceC02590Ai interfaceC02590Ai, C41762Ied c41762Ied) {
        interfaceC02590Ai.AAP("currently_viewed_source_type", String.valueOf(c41762Ied.A01));
        interfaceC02590Ai.A7v("has_multiple_source_types", Boolean.valueOf(c41762Ied.A08));
    }

    public static void A04(InterfaceC02590Ai interfaceC02590Ai, C41762Ied c41762Ied, String str) {
        interfaceC02590Ai.AAP("selected_source_type", str);
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c41762Ied.A04);
        interfaceC02590Ai.AAP("waterfall_id", c41762Ied.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r4.A01 == X.EnumC39617HeR.A03) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C19280xC r3, X.C41762Ied r4) {
        /*
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "waterfall_id"
            if (r1 == 0) goto L9
            r3.A0C(r0, r1)
        L9:
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "entry_point"
            if (r1 == 0) goto L12
            r3.A0C(r0, r1)
        L12:
            boolean r2 = r4.A08
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "has_multiple_source_types"
            r3.A09(r0, r1)
            X.HeR r0 = r4.A01
            if (r0 == 0) goto L2a
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "currently_viewed_source_type"
            r3.A0C(r0, r1)
        L2a:
            com.instagram.model.shopping.ProductSource r0 = r4.A00
            if (r0 == 0) goto L45
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "selected_source_id"
            r3.A0C(r0, r1)
            com.instagram.model.shopping.ProductSource r0 = r4.A00
            X.C14360o3.A0A(r0)
            X.HeR r0 = r0.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "selected_source_type"
            r3.A0C(r0, r1)
        L45:
            if (r2 != 0) goto L4e
            X.HeR r2 = r4.A01
            X.HeR r1 = X.EnumC39617HeR.A03
            r0 = 0
            if (r2 != r1) goto L4f
        L4e:
            r0 = 1
        L4f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_influencer"
            r3.A09(r0, r1)
            com.instagram.common.session.UserSession r0 = r4.A02
            X.AbstractC31173DnH.A1S(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41762Ied.A05(X.0xC, X.Ied):void");
    }

    public final void A06(ProductSource productSource) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A07), "instagram_shopping_product_source_selected");
        String str = productSource.A01;
        C14360o3.A0A(str);
        A0f.AAP("selected_source_id", str);
        String str2 = productSource.A04;
        C14360o3.A0A(str2);
        A0f.AAP("selected_source_name", str2);
        A0f.AAP("selected_source_type", productSource.A00.toString());
        AbstractC37300Gc1.A0n(A0f, this.A05);
        A0f.AAP("waterfall_id", this.A06);
        A0f.Cht();
    }
}
