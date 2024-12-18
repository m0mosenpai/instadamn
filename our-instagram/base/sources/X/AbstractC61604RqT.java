package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.fbpay.shoppay.IGShopPayCustomTabsActivity;

/* renamed from: X.RqT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61604RqT {
    public final void A02(Fragment fragment, String str, int i) {
        C14360o3.A0B(str, 1);
        while (fragment.mParentFragment != null && !(fragment instanceof AbstractC60893Rb7)) {
            fragment = fragment.mParentFragment;
            if (fragment == null) {
                return;
            }
        }
        Intent A08 = MSW.A08(fragment.requireContext(), IGShopPayCustomTabsActivity.class);
        A08.putExtra("extra_url", str);
        C12260kU.A06(fragment, A08, i);
    }

    public final void A00(Context context, String str) {
        AbstractC167017dG.A1N(context, str);
        C60626REl c60626REl = (C60626REl) this;
        if (str.startsWith(AbstractC43591JPw.A00(40))) {
            AbstractC12990ll abstractC12990ll = c60626REl.A00;
            C14360o3.A0C(abstractC12990ll, AbstractC111324zv.A00(6));
            AbstractC70160WDy.A03((UserSession) abstractC12990ll, context, str);
        } else {
            Intent A07 = AbstractC31177DnL.A07(str);
            if (C0b3.A00().A06().A0G(context, A07)) {
                return;
            }
            AbstractC07840b2.A03(context, A07);
        }
    }

    public final void A01(Context context, String str) {
        AbstractC167017dG.A1N(context, str);
        try {
            android.net.Uri A0B = AbstractC25227BEk.A0B(str);
            if ("https".equals(A0B.getScheme())) {
                new C63165SeP().A01().A00(context, A0B);
            }
        } catch (SecurityException e) {
            C0K8.A0F("FBPayUrlLauncher", "Encounter security exception when parsing url!", e);
        }
    }
}
