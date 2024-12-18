package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.IeJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41745IeJ {
    public InterfaceC66382zF A00;
    public IgFundedIncentive A01;
    public MultiProductComponent A02;
    public IH1 A03;
    public C41634IbP A04;
    public String A05;
    public java.util.Set A06;
    public H7I A07;
    public final C66362zD A08;
    public final C42824Ix0 A09;
    public final Context A0A;
    public final H7I A0B;
    public final H7I A0C;
    public final UserSession A0D;
    public final C1571273r A0E;
    public final C1571273r A0F;

    private final C4F4 A00() {
        int i;
        String string;
        String str;
        Iterator it;
        ProductDiscountInformationDict productDiscountInformationDict;
        String name;
        java.util.Set set = this.A06;
        if (set != null && !set.isEmpty()) {
            java.util.Set set2 = this.A06;
            if (set2 != null) {
                i = set2.size();
            } else {
                i = 0;
            }
            String str2 = "";
            Integer num = null;
            if (i > 1) {
                Context context = this.A0A;
                java.util.Set set3 = this.A06;
                if (set3 != null) {
                    num = Integer.valueOf(set3.size());
                }
                str = AbstractC167007dF.A0f(context, num, 2131967912);
                string = context.getString(2131967913);
            } else {
                java.util.Set set4 = this.A06;
                if (set4 != null && (it = set4.iterator()) != null && (productDiscountInformationDict = (ProductDiscountInformationDict) it.next()) != null && (name = productDiscountInformationDict.getName()) != null) {
                    str2 = name;
                }
                Context context2 = this.A0A;
                String string2 = context2.getString(2131964492);
                string = context2.getString(2131973180);
                str = str2;
                str2 = string2;
            }
            return new C39095HIt(str, str2, string);
        }
        Context context3 = this.A0A;
        return new C39091HIp(AbstractC166997dE.A0p(context3, 2131960975), context3.getString(2131976824));
    }

    private final C42315Iod A01(IgFundedIncentive igFundedIncentive) {
        String str = igFundedIncentive.A07;
        return new C42315Iod(new C45126Jxv(igFundedIncentive.A0A, igFundedIncentive.A06, this.A0A.getString(2131973180)), new IHB(new C57252Pba(36, igFundedIncentive, this), new C57252Pba(37, igFundedIncentive, this), this.A09.A00.isVisible()), str);
    }

    public static void A03(C41745IeJ c41745IeJ, MerchantShoppingCartFragment merchantShoppingCartFragment, IH1 ih1, C41634IbP c41634IbP, Object obj) {
        MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
        String str = merchantShoppingCartFragment.A0W;
        IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
        java.util.Set set = merchantShoppingCartFragment.A0a;
        C14360o3.A0B(obj, 0);
        c41745IeJ.A04 = c41634IbP;
        c41745IeJ.A03 = ih1;
        c41745IeJ.A02 = multiProductComponent;
        c41745IeJ.A05 = str;
        c41745IeJ.A01 = igFundedIncentive;
        c41745IeJ.A00 = null;
        c41745IeJ.A06 = set;
        A02(c41745IeJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.2zJ, java.lang.Object] */
    public C41745IeJ(Context context, InterfaceC11380iw interfaceC11380iw, C38383GuK c38383GuK, UserSession userSession, C42824Ix0 c42824Ix0, Map map) {
        AbstractC167017dG.A1R(userSession, c42824Ix0);
        C14360o3.A0B(c38383GuK, 5);
        this.A0A = context;
        this.A0D = userSession;
        this.A09 = c42824Ix0;
        AbstractC53242c7.A0F(context, R.attr.igds_color_primary_background);
        C1571273r A0O = AbstractC37304Gc5.A0O();
        A0O.A00 = AbstractC53242c7.A0F(context, R.attr.igds_color_primary_background);
        ViewOnClickListenerC42033Ik2.A01(A0O, c42824Ix0, 18);
        this.A0F = A0O;
        C1571273r A0J = AbstractC37300Gc1.A0J();
        A0J.A02 = R.drawable.instagram_shopping_cart_outline_96;
        A0J.A0D = context.getString(2131966346);
        A0J.A07 = context.getString(2131973952);
        A0J.A00 = AbstractC53242c7.A0F(context, R.attr.igds_color_primary_background);
        this.A0E = A0J;
        this.A0C = new H7I(Integer.valueOf(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background)), null, "top_padding_view_model_key", R.dimen.abc_button_padding_horizontal_material);
        this.A0B = new H7I(Integer.valueOf(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background)), null, "bag_items_bottom_padding_view_model_key", R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new HI7(c42824Ix0));
        A00.A01(new HI6(c42824Ix0));
        A00.A01(new Object());
        A00.A01(new HIE(null));
        A00.A01(new HIR(interfaceC11380iw, c42824Ix0, C05F.A00));
        C38057Gok.A00(A00, new Object());
        A00.A01(new Object());
        A00.A01(new HIW(interfaceC11380iw, userSession, c42824Ix0, map));
        A00.A01(new Object());
        this.A08 = AbstractC31173DnH.A0R(A00, new HIX(interfaceC11380iw, c38383GuK, userSession, c42824Ix0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C41745IeJ r9) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41745IeJ.A02(X.IeJ):void");
    }

    public final void A04(int i) {
        this.A07 = new H7I(null, Integer.valueOf(i), "footer_gap_view_model_key", R.dimen.abc_button_padding_horizontal_material);
        A02(this);
    }
}
