package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Idr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41720Idr {
    public static final C41720Idr A00 = new Object();

    public static final void A01(Context context, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, String str, String str2, boolean z, boolean z2, boolean z3) {
        C33211Ekz A002 = AbstractC34033F0m.A00(userSession, str, str2, AbstractC167007dF.A1R(0, context, userSession), z, z2, z3);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0d = context.getResources().getString(2131975719);
        C189478aR A003 = A0y.A00();
        FragmentActivity fragmentActivity = null;
        AbstractC35091Fd2.A01(null, userSession, "video_overflow_menu", MSV.A00(36), null);
        A003.A03(context, A002);
        C3DO c3do = C3DN.A00;
        if (fragment != null) {
            fragmentActivity = fragment.requireActivity();
        }
        C3DN A004 = c3do.A00(fragmentActivity);
        if (A004 != null) {
            ((C3DP) A004).A0H = new C43024J0p(onDismissListener, 0);
        }
    }

    public final void A02(Context context, UserSession userSession, String str) {
        boolean z = false;
        if (AbstractC75343a1.A05(userSession)) {
            CFO.A00(false);
        } else {
            AbstractC34031F0k.A00(userSession, str, null, false, true, false, false, false);
        }
        if (AbstractC75373a4.A04(userSession) || AbstractC75373a4.A02(userSession)) {
            z = true;
        }
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        Resources resources = context.getResources();
        int i = 2131954790;
        if (z) {
            i = 2131954792;
        }
        A0y.A0d = resources.getString(i);
        A0y.A00();
        AbstractC35091Fd2.A01(null, userSession, "video_overflow_menu", MSV.A00(36), null);
    }

    public static final String A00(Context context, UserSession userSession) {
        int i;
        boolean A06 = C18U.A06(AbstractC25228BEl.A0l(context), userSession, 36322860544895683L);
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (A06) {
            A1C.append('[');
            i = 2131952900;
        } else {
            A1C.append('[');
            i = 2131954803;
        }
        A1C.append(context.getString(i));
        A1C.append(']');
        return A1C.toString();
    }
}
