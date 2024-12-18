package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EHY extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "TwoFacLoginHelpSheetFragment";
    public final InterfaceC09390do A01 = AbstractC60492pY.A01(this);
    public final boolean A00 = C1AD.A06(C06090Tz.A05, 18306353206403954L);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EnumC33400EpX enumC33400EpX;
        int A02 = C0f9.A02(509417227);
        C14360o3.A0B(layoutInflater, 0);
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.two_fac_login_help_sheet_fragment, false);
        Button button = (Button) AbstractC166997dE.A0R(A0C, R.id.use_text_message_button);
        Button button2 = (Button) AbstractC166997dE.A0R(A0C, R.id.use_recovery_code_button);
        Button button3 = (Button) AbstractC166997dE.A0R(A0C, R.id.use_whatsapp_button);
        Button button4 = (Button) AbstractC166997dE.A0R(A0C, R.id.use_authenticator_app_button);
        Button button5 = (Button) AbstractC166997dE.A0R(A0C, R.id.learn_more_button);
        Button button6 = (Button) AbstractC166997dE.A0R(A0C, R.id.request_support_button);
        if (this.A00) {
            button6.setText(2131975921);
            button5.setVisibility(8);
        }
        View A0S = AbstractC166997dE.A0S(A0C, R.id.cancel_button);
        int i = 0;
        button.setVisibility(AbstractC167007dF.A05(requireArguments().getBoolean("argument_sms_two_factor_on") ? 1 : 0));
        button3.setVisibility(AbstractC167007dF.A05(requireArguments().getBoolean("argument_whatsapp_two_factor_on") ? 1 : 0));
        if (!requireArguments().getBoolean("argument_totp_two_factor_on")) {
            i = 8;
        }
        button4.setVisibility(i);
        int i2 = requireArguments().getInt("arg_two_fac_clear_method");
        EnumC33400EpX[] values = EnumC33400EpX.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                enumC33400EpX = values[i3];
                if (enumC33400EpX.A00 == i2) {
                    break;
                }
                i3++;
            } else {
                enumC33400EpX = EnumC33400EpX.A08;
                break;
            }
        }
        int ordinal = enumC33400EpX.ordinal();
        if (ordinal != 0) {
            if (ordinal != 5) {
                if (ordinal != 2) {
                    if (ordinal != 1) {
                        C0w9.A03(AbstractC31182DnR.A02(), "no clear method");
                    } else {
                        button2.setVisibility(8);
                    }
                } else {
                    button4.setVisibility(8);
                }
            } else {
                button3.setVisibility(8);
            }
        } else {
            button.setVisibility(8);
        }
        if (requireArguments().getBoolean("argument_sms_not_allowed")) {
            AbstractC166987dD.A1O(requireContext(), button, AbstractC31180DnO.A01(this));
            AbstractC166987dD.A1O(requireContext(), button3, AbstractC31180DnO.A01(this));
        }
        ViewOnClickListenerC31591DuJ.A00(button, 49, this, C05F.A00);
        ViewOnClickListenerC31591DuJ.A00(button3, 49, this, C05F.A0u);
        ViewOnClickListenerC31591DuJ.A00(button2, 49, this, C05F.A0C);
        ViewOnClickListenerC31591DuJ.A00(button4, 49, this, C05F.A0N);
        ViewOnClickListenerC31591DuJ.A00(button6, 49, this, C05F.A0Y);
        ViewOnClickListenerC31591DuJ.A00(button5, 49, this, C05F.A0j);
        ViewOnClickListenerC35677FpC.A00(A0S, 66, this);
        C0f9.A09(-325282201, A02);
        return A0C;
    }
}
