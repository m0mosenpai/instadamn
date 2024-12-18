package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EK8 extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatePasswordFragment";
    public CheckBox A00;
    public EditText A01;
    public UserSession A02;
    public ProgressButton A03;
    public int A04;
    public int A05;
    public FN0 A06;
    public final TextWatcher A07 = new C35469Fl4(this, 20);
    public volatile boolean A08;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(true);
        AbstractC31179DnN.A1G(interfaceC56362iU);
        interfaceC56362iU.setTitle(requireActivity().getString(2131956971));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "create_password";
    }

    public static void A00(EK8 ek8) {
        boolean z = true;
        ek8.A01.setEnabled(!ek8.A08);
        ek8.A03.setShowProgressBar(ek8.A08);
        boolean A1a = AbstractC31179DnN.A1a(ek8.A01);
        ProgressButton progressButton = ek8.A03;
        if (A1a) {
            z = false;
        }
        progressButton.setEnabled(z);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return this.A08;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1513898534);
        super.onCreate(bundle);
        this.A02 = AbstractC31176DnK.A0S(this);
        C0f9.A09(833851426, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(62035656);
        this.A05 = AbstractC31174DnI.A0H(this).getAttributes().softInputMode;
        AbstractC31180DnO.A1B(this);
        this.A04 = requireActivity().getResources().getDimensionPixelOffset(AbstractC53242c7.A0H(requireActivity(), AbstractC57322k7.A01(this.A02)));
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_create_password, viewGroup, false);
        IgImageView A0Z = AbstractC31172DnG.A0Z(inflate, R.id.user_avatar_image_view);
        UserSession userSession = this.A02;
        C08730cb c08730cb = C17060sy.A01;
        AbstractC31173DnH.A1T(this, A0Z, c08730cb.A01(userSession));
        AbstractC31173DnH.A1F(AbstractC166997dE.A0T(inflate, R.id.username_text_view), c08730cb.A01(this.A02));
        AbstractC31180DnO.A14(requireActivity().getResources(), AbstractC166997dE.A0T(inflate, R.id.subtitle_textview), AbstractC31173DnH.A0n(this.A02, c08730cb), 2131956973);
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.create_button);
        this.A03 = progressButton;
        ViewOnClickListenerC35677FpC.A00(progressButton, 24, this);
        EditText A0H = AbstractC31173DnH.A0H(inflate, R.id.password_edittext);
        this.A01 = A0H;
        A0H.setTypeface(Typeface.DEFAULT);
        AbstractC31179DnN.A0s(this.A01);
        this.A01.setImeOptions(6);
        this.A01.setInputType(524416);
        C35754Fqr.A00(this.A01, this, 7);
        CheckBox checkBox = (CheckBox) inflate.requireViewById(R.id.remember_password_checkbox);
        this.A00 = checkBox;
        if (C83743oJ.A01(this.A02).A0K(this.A02.userId)) {
            i = 8;
        }
        checkBox.setVisibility(i);
        this.A00.setChecked(true);
        this.A06 = new FN0(this.A03, (ScrollView) inflate.findViewById(R.id.scroll_view), this.A04);
        C0f9.A09(1670654861, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(212791645);
        super.onDestroyView();
        AbstractC31174DnI.A0H(this).setSoftInputMode(this.A05);
        this.A01 = null;
        this.A00 = null;
        this.A03 = null;
        C0f9.A09(73182095, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-2028163371);
        super.onPause();
        this.A01.removeTextChangedListener(this.A07);
        AbstractC31174DnI.A0H(this).setSoftInputMode(this.A05);
        C0f9.A09(1324876479, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(540239747);
        super.onResume();
        this.A01.addTextChangedListener(this.A07);
        AbstractC31180DnO.A1B(this);
        C0f9.A09(-1387275431, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(249118226);
        super.onStart();
        FN0 fn0 = this.A06;
        if (fn0 != null) {
            fn0.A00.Dnr(getActivity());
        }
        C0f9.A09(-1565163683, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(230082091);
        super.onStop();
        FN0 fn0 = this.A06;
        if (fn0 != null) {
            fn0.A00.onStop();
        }
        C0f9.A09(609858429, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A00(this);
    }
}
