package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3B1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3B1 {
    public int A00;
    public View A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C69623Aw A07;
    public final C69453Af A08;
    public final boolean A09;

    public static final void A00(C3B1 c3b1, boolean z) {
        View view;
        View view2 = c3b1.A01;
        if (view2 != null && z) {
            UserSession userSession = c3b1.A06;
            if (!AbstractC23021Ah.A00(userSession).A01.getBoolean("has_seen_group_stories_tray_tooltip", false)) {
                Object parent = view2.getParent();
                if ((parent instanceof View) && (view = (View) parent) != null) {
                    Activity activity = c3b1.A03;
                    String string = view.getContext().getString(2131954719);
                    C14360o3.A07(string);
                    C5SU c5su = new C5SU(activity, new C149686oL(string));
                    c5su.A04(view, (-view.getWidth()) / 2, 0, true);
                    c5su.A06(EnumC58132lV.A06);
                    c5su.A0A = true;
                    c5su.A00().A07(userSession);
                    InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                    ARD.E77("has_seen_group_stories_tray_tooltip", true);
                    ARD.apply();
                }
            }
        }
    }

    public C3B1(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C69453Af c69453Af) {
        this.A06 = userSession;
        this.A04 = context;
        this.A03 = activity;
        this.A08 = c69453Af;
        this.A05 = interfaceC11380iw;
        this.A07 = new C69623Aw(interfaceC11380iw, userSession);
        this.A09 = C18U.A06(C06090Tz.A05, userSession, 36320279271907592L);
    }
}
