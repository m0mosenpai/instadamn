package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.instagram.igds.components.form.IgFormField;

/* loaded from: classes6.dex */
public final class EL9 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacTotpKeyNamingFragment";
    public boolean A00;
    public Bundle A01;
    public IgFormField A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int i = 2131975882;
        if (this.A00) {
            i = 2131975979;
        }
        AbstractC25229BEm.A1G(interfaceC56362iU, i);
        if (this.A00) {
            if (A00().length() == 0) {
                interfaceC56362iU.AAC(2131972699);
            } else {
                interfaceC56362iU.AAF(new ViewOnClickListenerC35667Fp2(this, 4), 2131972699);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    private final CharSequence A00() {
        IgFormField igFormField = this.A02;
        if (igFormField == null) {
            C14360o3.A0F("nicknameView");
            throw C00O.createAndThrow();
        }
        return AbstractC001900j.A0B(igFormField.getText());
    }

    public static final void A02(EL9 el9) {
        C32539EUp c32539EUp = new C32539EUp(el9, 13);
        if (el9.A00().length() == 0) {
            AbstractC35254Fgn.A06(el9.requireContext(), el9.getString(2131975938), el9.getString(2131961880));
            return;
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(el9.A03);
        Context requireContext = el9.requireContext();
        String obj = el9.A00().toString();
        Bundle bundle = el9.A01;
        if (bundle == null) {
            C14360o3.A0F("twoFacArguments");
            throw C00O.createAndThrow();
        }
        String A13 = AbstractC31172DnG.A13(bundle, "rename_totp_seed_id");
        C14360o3.A07(A13);
        C14360o3.A0B(A0o, 0);
        String A0X = AbstractC31178DnM.A0X();
        C14360o3.A0B(obj, 3);
        C25621Ms A0c = AbstractC167017dG.A0c(A0o);
        AbstractC31172DnG.A1Q(A0c, 699, 38, 1);
        AbstractC31177DnL.A0t(requireContext, A0c);
        A0c.A9s(A0X, obj);
        A0c.A9s(AbstractC31178DnM.A0Y(), A13);
        A0c.A0R(EAZ.class, FSL.class);
        AbstractC31175DnJ.A1K(A0c, c32539EUp);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public static final void A01(EL9 el9) {
        if (el9.A00().length() > 0) {
            Bundle bundle = el9.A01;
            if (bundle == null) {
                C14360o3.A0F("twoFacArguments");
                throw C00O.createAndThrow();
            }
            bundle.putString(AbstractC31178DnM.A0X(), el9.A00().toString());
            AbstractC35179FfW.A03();
            Bundle requireArguments = el9.requireArguments();
            EL1 el1 = new EL1();
            AbstractC31179DnN.A0y(el1, AbstractC31173DnH.A0J(requireArguments, el1, el9), el9.A03);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1695397125);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments;
        this.A00 = requireArguments.getBoolean("is_renaming", false);
        Bundle bundle2 = this.A01;
        if (bundle2 == null) {
            C14360o3.A0F("twoFacArguments");
            throw C00O.createAndThrow();
        }
        bundle2.remove("is_renaming");
        C0f9.A09(-1511941796, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-423605700);
        C14360o3.A0B(layoutInflater, 0);
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.two_fac_key_naming_fragment, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.next_button);
        requireViewById.setEnabled(false);
        if (!(!this.A00)) {
            i = 8;
        }
        requireViewById.setVisibility(i);
        ViewOnClickListenerC35667Fp2.A00(requireViewById, 5, this);
        IgFormField A0k = AbstractC31172DnG.A0k(inflate, R.id.name_field);
        this.A02 = A0k;
        String str = "nicknameView";
        if (A0k != null) {
            C35754Fqr.A00(A0k.getMEditText(), this, 13);
            IgFormField igFormField = this.A02;
            if (igFormField != null) {
                Bundle bundle2 = this.A01;
                if (bundle2 == null) {
                    str = "twoFacArguments";
                } else {
                    String A13 = AbstractC31172DnG.A13(bundle2, AbstractC31178DnM.A0X());
                    C14360o3.A07(A13);
                    igFormField.setText(A13);
                    IgFormField igFormField2 = this.A02;
                    if (igFormField2 != null) {
                        igFormField2.A0H(new C35468Fl3(7, this, requireViewById));
                        AbstractC166997dE.A0T(inflate, R.id.instagram_naming_key_paragraph).setText(2131975950);
                        C0f9.A09(1920152174, A02);
                        return inflate;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        int A02 = C0f9.A02(-49258522);
        super.onPause();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(0);
        }
        IgFormField igFormField = this.A02;
        if (igFormField == null) {
            C14360o3.A0F("nicknameView");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0O(igFormField);
        C0f9.A09(-777192597, A02);
    }
}
