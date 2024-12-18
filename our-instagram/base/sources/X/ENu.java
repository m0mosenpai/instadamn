package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ENu extends C53Z implements InterfaceC11380iw, InterfaceC60072op, InterfaceC60112ot {
    public static final String __redex_internal_original_name = "OneTapOptInFragment";
    public TextView A00;
    public TextView A01;
    public InterfaceC37222GaX A02;
    public C35782FrK A03;
    public ProgressButton A04;
    public User A05;
    public final View.OnClickListener A06 = new ViewOnClickListenerC31724DwT(this, 16);

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkF(false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "one_tap_upsell_nux";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A02(getSession(), "nux_one_tap_upsell");
        InterfaceC37222GaX interfaceC37222GaX = this.A02;
        if (interfaceC37222GaX != null) {
            if (interfaceC37222GaX.E3w() != null) {
                AbstractC31179DnN.A1T(this.A02);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A02 = AbstractC35211Fg4.A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1896596510);
        super.onCreate(bundle);
        this.A03 = new C35782FrK(this, this, getSession());
        C0f9.A09(-2106445980, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2036209396);
        this.A05 = AbstractC166987dD.A10(getSession());
        View inflate = layoutInflater.inflate(R.layout.nux_onetap_opt_in_redesign, viewGroup, false);
        this.A01 = AbstractC166997dE.A0T(inflate, R.id.field_title);
        this.A00 = AbstractC166997dE.A0T(inflate, R.id.field_detail);
        this.A04 = (ProgressButton) inflate.requireViewById(R.id.progress_button_text);
        View requireViewById = inflate.requireViewById(R.id.skip_button);
        View requireViewById2 = inflate.requireViewById(R.id.nux_one_tap_lock);
        View requireViewById3 = inflate.requireViewById(R.id.nux_one_tap_phone_logo_container);
        if (C18U.A06(C06090Tz.A05, getSession(), 36329728197542404L)) {
            requireViewById2.setVisibility(0);
            requireViewById3.setVisibility(8);
        } else {
            requireViewById2.setVisibility(8);
            requireViewById3.setVisibility(0);
            ImageView A0I = AbstractC31173DnH.A0I(inflate, R.id.ig_logo);
            Context context = getContext();
            if (context != null) {
                AbstractC31180DnO.A10(context, A0I);
            }
            IgImageView A0Z = AbstractC31172DnG.A0Z(inflate, R.id.profile_image_view);
            this.A05.Bhu();
            AbstractC31173DnH.A1T(this, A0Z, this.A05);
            AbstractC31173DnH.A1F(AbstractC166997dE.A0T(inflate, R.id.username), this.A05);
        }
        this.A01.setText(2131968902);
        this.A00.setText(2131968900);
        this.A04.setText(2131968901);
        C0fQ.A00(this.A06, this.A04);
        C0fQ.A00(new ViewOnClickListenerC31724DwT(this, 15), requireViewById);
        UserSession session = getSession();
        AbstractC167017dG.A1N(session, "nux_one_tap_upsell");
        C35203Ffv.A01(session, "nux_one_tap_upsell");
        C0f9.A09(-1853645408, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-459777844);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        C0f9.A09(-1646547496, A02);
    }
}
