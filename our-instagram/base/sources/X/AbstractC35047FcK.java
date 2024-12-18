package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FcK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35047FcK {
    public static boolean A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            str4 = "Effect ID is not set";
        } else {
            if (AbstractC27671Vv.A00 != null) {
                AbstractC27671Vv A00 = C3ER.A00();
                if (A00.A02(context, userSession)) {
                    C11T.A04(new RunnableC57079PTs(context, interfaceC11380iw, userSession, A00, str, str2, str3), 500L);
                    return true;
                }
                return false;
            }
            str4 = "RtcPlugin is not available";
        }
        AbstractC12120kG.A01("ArEffectOpener", str4);
        return false;
    }

    public static void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        if (!A02(context, interfaceC11380iw, userSession, str, str2, str3)) {
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            AbstractC31175DnJ.A1O(A0I);
            AbstractC31172DnG.A1C(context, A0I, 2131974374);
            AbstractC31173DnH.A16(context, A0I, 2131974373);
            A0I.A0K(null, 2131968948);
            AbstractC166987dD.A1W(A0I);
        }
    }

    public static void A01(FragmentActivity fragmentActivity, String str, String str2, String str3, String str4) {
        Intent A01 = C14H.A00().A01(fragmentActivity);
        Uri.Builder A04 = AbstractC31175DnJ.A04("instagram://story-camera");
        if (str != null) {
            A04.appendQueryParameter("entrypoint", str);
        }
        if (str2 != null) {
            A04.appendQueryParameter("effect_id", str2);
        }
        if (str3 != null) {
            A04.appendQueryParameter("test_link_crypto_hash", str3);
        }
        if (str4 != null) {
            A04.appendQueryParameter("test_link_revision_id", str4);
        }
        AbstractC31180DnO.A0z(fragmentActivity, A01, A04);
    }
}
