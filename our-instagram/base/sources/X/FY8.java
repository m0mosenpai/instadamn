package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class FY8 {
    public static final View A00(ViewGroup viewGroup) {
        View A0D = AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.selectable_user_row, false);
        A0D.setTag(new C31953E2h(A0D));
        return A0D;
    }

    public static final void A01(Context context, InterfaceC11380iw interfaceC11380iw, InterfaceC37204GaF interfaceC37204GaF, C31953E2h c31953E2h, FNI fni, boolean z, boolean z2, boolean z3) {
        boolean A1b = AbstractC25233BEq.A1b(c31953E2h, fni, interfaceC37204GaF);
        C14360o3.A0B(interfaceC11380iw, 7);
        if (z2 && context != null) {
            FNF fnf = c31953E2h.A02;
            AbstractC31172DnG.A1F(context.getResources(), fnf.A00.getLayoutParams(), R.dimen.action_button_min_width);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = fnf.A01;
            AbstractC31172DnG.A1F(context.getResources(), gradientSpinnerAvatarView.getLayoutParams(), R.dimen.action_button_settings_height);
            gradientSpinnerAvatarView.getLayoutParams().width = AbstractC166997dE.A04(context, R.dimen.action_button_settings_height);
            gradientSpinnerAvatarView.A0B(AbstractC166997dE.A04(context, R.dimen.action_button_settings_height), 0);
            gradientSpinnerAvatarView.A06();
        }
        FNF fnf2 = c31953E2h.A02;
        User user = fni.A01;
        FCO.A00(interfaceC11380iw, user.Bhu(), fnf2, fni.A02, fni.A03, fni.A04, user.isVerified());
        if (z3) {
            fni.A00 = A1b;
        }
        ((CompoundButton) c31953E2h.A01.A01()).setChecked(fni.A00);
        ViewGroup viewGroup = fnf2.A00;
        ViewOnClickListenerC35684FpJ.A00(viewGroup, interfaceC37204GaF, fni, c31953E2h, 64);
        C57012jc c57012jc = c31953E2h.A00;
        View A01 = c57012jc.A01();
        if (z) {
            A01.setVisibility(0);
            ViewOnClickListenerC35670Fp5.A00(c57012jc.A01(), 9, interfaceC37204GaF, fni);
        } else {
            A01.setVisibility(8);
        }
        float f = 0.3f;
        if (interfaceC37204GaF.Ccd(user)) {
            f = 1.0f;
        }
        viewGroup.setAlpha(f);
    }
}
