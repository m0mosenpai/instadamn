package X;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.ENs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32368ENs extends C53Z implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "CheckoutAwarenessValuePropsFragment";
    public C18920wW A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_checkout_awareness_value_props";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1802715821);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("merchant_username");
        this.A02 = AbstractC31173DnH.A0j(requireArguments, AbstractC111324zv.A00(256));
        this.A03 = AbstractC31173DnH.A0j(requireArguments, AbstractC111324zv.A00(5089));
        this.A04 = AbstractC61112qZ.A00(requireArguments);
        C18920wW A01 = AbstractC12220kQ.A01(this, getSession());
        this.A00 = A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "instagram_shopping_checkout_awareness_value_props_entry");
        A0f.AAP("visual_style", AbstractC111324zv.A00(185));
        A0f.AAP("prior_module", this.A02);
        A0f.AAP("prior_submodule", this.A03);
        A0f.AAP("shopping_session_id", this.A04);
        A0f.Cht();
        C0f9.A09(903806204, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(899488463);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.checkout_awareness);
        C0f9.A09(890074031, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(995547152);
        super.onDestroy();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_shopping_checkout_awareness_value_props_closed");
        A0f.AAP("visual_style", AbstractC111324zv.A00(185));
        A0f.AAP("prior_module", this.A02);
        A0f.AAP("shopping_session_id", this.A04);
        A0f.Cht();
        C0f9.A09(-1499667995, A02);
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.U9N, android.text.method.LinkMovementMethod] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.shipping_information);
        ImageView A0I = AbstractC31173DnH.A0I(requireViewById, R.id.icon);
        TextView A06 = AbstractC31180DnO.A06(requireViewById);
        TextView A0T = AbstractC166997dE.A0T(requireViewById, R.id.description);
        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), A06, 2131955146);
        String str = this.A01;
        if (str != null && !str.isEmpty()) {
            string = AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), str, 2131955147);
        } else {
            string = AbstractC166997dE.A0N(this).getString(2131955148);
        }
        A0T.setText(string);
        Context context = A0I.getContext();
        AbstractC166997dE.A19(context, A0I, R.drawable.instagram_device_phone_pano_outline_24);
        AbstractC31177DnL.A0p(context, A0I, AbstractC53242c7.A08(context));
        View requireViewById2 = view.requireViewById(R.id.secure_payment_information);
        ImageView A0I2 = AbstractC31173DnH.A0I(requireViewById2, R.id.icon);
        TextView A062 = AbstractC31180DnO.A06(requireViewById2);
        TextView A0T2 = AbstractC166997dE.A0T(requireViewById2, R.id.description);
        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), A062, 2131955153);
        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), A0T2, 2131955154);
        Context context2 = A0I2.getContext();
        AbstractC166997dE.A19(context2, A0I2, R.drawable.instagram_lock_pano_outline_24);
        AbstractC31177DnL.A0p(context2, A0I2, AbstractC53242c7.A08(context2));
        View requireViewById3 = view.requireViewById(R.id.purchase_protection_information);
        ImageView A0I3 = AbstractC31173DnH.A0I(requireViewById3, R.id.icon);
        TextView A063 = AbstractC31180DnO.A06(requireViewById3);
        TextView A0T3 = AbstractC166997dE.A0T(requireViewById3, R.id.description);
        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), A063, 2131955155);
        String string2 = AbstractC166997dE.A0N(this).getString(2131955157);
        AnonymousClass773.A07(new Em1(Integer.valueOf(AbstractC31179DnN.A01(this)), this, 40), A0T3, string2, AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), string2, 2131955156));
        Context context3 = A0I3.getContext();
        AbstractC166997dE.A19(context3, A0I3, R.drawable.instagram_shield_pano_outline_24);
        AbstractC31177DnL.A0p(context3, A0I3, AbstractC53242c7.A08(context3));
        TextView A0T4 = AbstractC166997dE.A0T(view, R.id.learn_more_help_center);
        android.net.Uri A03 = AbstractC08820cl.A03(AbstractC63260SgI.A01(requireActivity(), "https://help.instagram.com/357872324807367/"));
        String string3 = AbstractC166997dE.A0N(this).getString(2131955152);
        A0T4.setText(AnonymousClass773.A00(A03, string3, AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), string3, 2131955151)));
        U9N u9n = U9N.A00;
        U9N u9n2 = u9n;
        if (u9n == null) {
            ?? linkMovementMethod = new LinkMovementMethod();
            U9N.A00 = linkMovementMethod;
            u9n2 = linkMovementMethod;
        }
        A0T4.setMovementMethod(u9n2);
        ImageView A0I4 = AbstractC31173DnH.A0I(view, R.id.close_button);
        Context context4 = A0I4.getContext();
        AbstractC31177DnL.A0p(context4, A0I4, AbstractC53242c7.A08(context4));
        ViewOnClickListenerC35682FpH.A01(A0I4, 7, this);
        AbstractC31173DnH.A0I(view, R.id.main_image_icon).setImageResource(R.drawable.checkout_chevron_96);
    }
}
