package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.3KW, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3KW {
    public static final C3KX A01(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C3KX) userSession.A01(C3KX.class, new C9F7(39, context.getApplicationContext(), userSession));
    }

    public static final void A03(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        if (!userSession.isStopped()) {
            C1OU c1ou = C1OU.$redex_init_class;
            ReelStore A03 = ReelStore.A03(userSession);
            C14360o3.A07(A03);
            Reel A0M = A03.A0M(str);
            if (A0M != null) {
                C105824pt c105824pt = A0M.A0H;
                if (A0M.A0d() && c105824pt != null) {
                    EnumC109104va enumC109104va = c105824pt.A06;
                    if (enumC109104va == null) {
                        enumC109104va = EnumC109104va.A0E;
                    }
                    if (!enumC109104va.A00()) {
                        c105824pt.A06 = EnumC109104va.A0D;
                        A0M.A0R(userSession);
                    }
                }
            }
        }
    }

    public static final FragmentActivity A00() {
        try {
            if (C2OG.A01().A0B()) {
                return C2OG.A01().A06();
            }
            return null;
        } catch (Exception unused) {
            C0w9.A03("IgLiveNotificationsController", "failed to get current activity from InAppNotificationController");
            return null;
        }
    }

    public static final void A02(UserSession userSession, String str) {
        C27741Wc A01 = C27741Wc.A01();
        String A00 = MSV.A00(223);
        C14360o3.A0B(A00, 1);
        A01.A04(userSession, "iglive", AnonymousClass001.A0T(str, A00, '_'));
    }
}
