package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.FOi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34650FOi {
    public final void A00(Fragment fragment, FragmentActivity fragmentActivity, C34404FEu c34404FEu, String str, boolean z) {
        List A04 = fragmentActivity.getSupportFragmentManager().A0U.A04();
        if (A04 == null || !A04.contains(fragment)) {
            if (fragment.mArguments == null) {
                fragment.setArguments(AbstractC166987dD.A0b());
            }
            if (TextUtils.isEmpty(fragment.requireArguments().getString("IgSessionManager.SESSION_TOKEN_KEY"))) {
                fragment.requireArguments().putString("IgSessionManager.SESSION_TOKEN_KEY", c34404FEu.A00.getToken());
            }
            C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, c34404FEu.A00);
            A0r.A0G = true;
            if (z) {
                A0r.A09();
            }
            if (str != null) {
                A0r.A0A = str;
            }
            A0r.A0B(null, fragment);
            A0r.A04();
        }
    }
}
