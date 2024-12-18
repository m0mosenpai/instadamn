package X;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EL1 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacMultipleTotpSetupManuallyFragment";
    public Bundle A00;
    public TextView A01;
    public TextView A02;
    public boolean A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131975882);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    public static final void A00(EL1 el1) {
        String str;
        AbstractC35075Fcm.A00(AbstractC166987dD.A0r(el1.A04), C05F.A01);
        Object A0X = AbstractC31171DnF.A0X(el1.requireContext());
        if (A0X != null) {
            ClipboardManager clipboardManager = (ClipboardManager) A0X;
            StringBuilder A1C = AbstractC166987dD.A1C();
            TextView textView = el1.A01;
            if (textView == null) {
                str = "igKeyLineOne";
            } else {
                A1C.append((Object) textView.getText());
                A1C.append(' ');
                TextView textView2 = el1.A02;
                if (textView2 == null) {
                    str = "igKeyLineTwo";
                } else {
                    AbstractC31173DnH.A0x(clipboardManager, "Confirm_Key", AbstractC166997dE.A0v(textView2.getText(), A1C));
                    AbstractC31173DnH.A13(el1.requireContext(), el1, 2131956830);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1118027832);
        super.onCreate(bundle);
        this.A00 = requireArguments();
        C0f9.A09(-295294627, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1638601209);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_multiple_totp_setup_manually_fragment, viewGroup, false);
        this.A01 = AbstractC166997dE.A0T(inflate, R.id.ig_key_line_one);
        this.A02 = AbstractC166997dE.A0T(inflate, R.id.ig_key_line_two);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.copy_key);
        Em1 em1 = new Em1(this, requireContext().getColor(R.color.igds_gradient_cyan));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(getString(2131975892));
        A0H.setSpan(em1, 0, A0H.length(), 18);
        A0T.setText(A0H);
        ViewOnClickListenerC35677FpC.A00(A0T, 70, this);
        ((C64P) inflate.requireViewById(R.id.next_bottom_button)).setPrimaryActionOnClickListener(new ViewOnClickListenerC35667Fp2(this, 0));
        C0f9.A09(-8217363, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(391302318);
        super.onStart();
        String str = "twoFacResponseBundle";
        if (this.A03) {
            Bundle bundle = this.A00;
            if (bundle != null) {
                String A13 = AbstractC31172DnG.A13(bundle, "instagram_key");
                C14360o3.A07(A13);
                TextView textView = this.A01;
                if (textView == null) {
                    str = "igKeyLineOne";
                } else {
                    TextView textView2 = this.A02;
                    if (textView2 == null) {
                        str = "igKeyLineTwo";
                    } else {
                        AbstractC35235FgT.A03(textView, textView2, A13);
                        C0f9.A09(318413976, A02);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A04);
        Context requireContext = requireContext();
        C32539EUp c32539EUp = new C32539EUp(this, 11);
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            C25621Ms A0C = AbstractC31179DnN.A0C(A0o);
            AbstractC31172DnG.A1Q(A0C, 65, 38, 105);
            AbstractC31177DnL.A0t(requireContext, A0C);
            A0C.A9s(AbstractC31182DnR.A05(311, 15, 46), "false");
            A0C.A9s(AbstractC31182DnR.A05(384, 17, 57), bundle2.getString(AbstractC31178DnM.A0X()));
            A0C.A0R(EAZ.class, FSL.class);
            AbstractC31175DnJ.A1K(A0C, c32539EUp);
            C0f9.A09(318413976, A02);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
