package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes8.dex */
public abstract class LAv {
    public static final void A01(IgdsBottomButtonLayout igdsBottomButtonLayout, CharSequence charSequence) {
        if (igdsBottomButtonLayout.A06()) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        }
        igdsBottomButtonLayout.setPrimaryActionText(charSequence);
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(null);
    }

    public static final void A00(Fragment fragment, FragmentActivity fragmentActivity, C189478aR c189478aR) {
        C3DN A0r = AbstractC31172DnG.A0r(fragmentActivity);
        if (A0r != null) {
            C3DP c3dp = (C3DP) A0r;
            if (c3dp.A0h) {
                c3dp.A0H = new GH9(0, fragmentActivity, c189478aR, fragment);
                A0r.A0B();
            } else {
                c189478aR.A02(fragmentActivity, fragment);
            }
        }
    }
}
