package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import java.util.List;

/* renamed from: X.IKi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41169IKi {
    public IgFundedIncentive A00;
    public MultiProductComponent A01;
    public EnumC39590He0 A02;
    public EnumC39539HdB A03;
    public List A04;
    public List A05;
    public final Context A06;
    public final H7I A07;
    public final H7I A08;
    public final C66362zD A09;
    public final ShoppingCartFragment A0A;
    public final C1571273r A0B;
    public final C1571273r A0C;
    public final C1571273r A0D;
    public final boolean A0E;
    public final UserSession A0F;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.2zJ, java.lang.Object] */
    public C41169IKi(Context context, InterfaceC11380iw interfaceC11380iw, C38383GuK c38383GuK, UserSession userSession, ShoppingCartFragment shoppingCartFragment, boolean z) {
        AbstractC167007dF.A1G(userSession, 1, c38383GuK);
        this.A0F = userSession;
        this.A06 = context;
        this.A0A = shoppingCartFragment;
        this.A0E = z;
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new HIE(new C40962ICj(this)));
        A00.A01(new HIR(interfaceC11380iw, shoppingCartFragment, C05F.A01));
        C38057Gok.A00(A00, new Object());
        A00.A01(new HIQ(interfaceC11380iw, userSession, shoppingCartFragment));
        A00.A01(new Object());
        A00.A01(new Object());
        A00.A01(new HIX(interfaceC11380iw, c38383GuK, userSession, shoppingCartFragment));
        this.A09 = AbstractC31173DnH.A0R(A00, new HIS(interfaceC11380iw, userSession, shoppingCartFragment));
        this.A08 = new H7I(null, null, "top_gap_view_model_key", R.dimen.abc_button_padding_horizontal_material);
        this.A07 = new H7I(null, null, "bottom_gap_view_model_key", z ? R.dimen.abc_dropdownitem_icon_width : R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        C1571273r A0J = AbstractC37300Gc1.A0J();
        A0J.A00 = AbstractC53242c7.A00(context);
        this.A0D = A0J;
        C1571273r A0O = AbstractC37304Gc5.A0O();
        A0O.A00 = AbstractC53242c7.A00(context);
        ViewOnClickListenerC42033Ik2.A01(A0O, shoppingCartFragment, 17);
        this.A0C = A0O;
        C1571273r A0J2 = AbstractC37300Gc1.A0J();
        A0J2.A02 = R.drawable.instagram_shopping_cart_outline_96;
        A0J2.A0D = context.getString(2131973953);
        A0J2.A07 = context.getString(2131973952);
        A0J2.A0C = context.getString(2131973951);
        A0J2.A00 = AbstractC53242c7.A00(context);
        A0J2.A06 = shoppingCartFragment;
        this.A0B = A0J2;
        this.A03 = EnumC39539HdB.A04;
        this.A02 = EnumC39590He0.A04;
    }
}
