package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.follow.autofollowback.AutoFollowBackBottomSheetData;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fh1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35266Fh1 {
    public static final C35266Fh1 A00 = new Object();

    public static final void A03(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        boolean A1a = AbstractC167017dG.A1a(userSession, interfaceC11380iw);
        C35121FeO c35121FeO = new C35121FeO(interfaceC11380iw, userSession);
        Object obj = new Object();
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(context, A0K, 2131953376);
        A0K.A0L = A1a;
        AbstractC31175DnJ.A0l(context, A0K, 2131953377);
        A0K.A0A = new C36522G8u(userSession, c35121FeO, obj, str, A1a ? 1 : 0);
        A0K.A01 = 5000;
        AbstractC31175DnJ.A0p(context.getResources(), A0K);
        AbstractC31178DnM.A1S(A0K);
    }

    public static final boolean A05(UserSession userSession) {
        C229419w A02;
        C14360o3.A0B(userSession, 0);
        if (AbstractC166997dE.A0Y(userSession).A0M() != C05F.A0C || (A02 = C18U.A02(userSession, 36328108995198131L)) == null || !A02.AhE(C06090Tz.A04, 36328108995198131L)) {
            return false;
        }
        return true;
    }

    public final void A07(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        A0Y.A03.EQ4(Boolean.valueOf(z));
        AnonymousClass189.A00(userSession).A01(A0Y, true, false);
        if (z) {
            InterfaceC19610xo ARD = AbstractC31178DnM.A0S(userSession, this).ARD();
            ARD.E77("auto_follow_back_has_enabled_system_setting_before", true);
            ARD.apply();
        }
    }

    public final boolean A08(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC166997dE.A0Y(userSession).A0M() != C05F.A0C || !A05(userSession) || A06(userSession, this) || AbstractC31178DnM.A0S(userSession, this).getBoolean("auto_follow_back_follow_prompt_dismissed", false)) {
            return false;
        }
        return true;
    }

    public final boolean A09(UserSession userSession, List list) {
        C229419w A02;
        C14360o3.A0B(userSession, 0);
        if (AbstractC166997dE.A0Y(userSession).A0M() != C05F.A0C || list.isEmpty()) {
            return false;
        }
        if ((A05(userSession) && A06(userSession, this)) || (A02 = C18U.A02(userSession, 36328108994870447L)) == null || !A02.AhE(C06090Tz.A04, 36328108994870447L)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [X.0oO, java.lang.Object] */
    public static final void A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, boolean z) {
        C35121FeO c35121FeO = new C35121FeO(interfaceC11380iw, userSession);
        ?? obj = new Object();
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0D = AbstractC31178DnM.A0c(context, user, 2131953364);
        A0K.A0L = true;
        AbstractC31175DnJ.A0l(context, A0K, 2131953363);
        A0K.A0A = new G91(context, interfaceC11380iw, userSession, c35121FeO, user, obj, z);
        int i = 5000;
        if (z) {
            i = 10000;
        }
        A0K.A01 = i;
        AbstractC31175DnJ.A0p(context.getResources(), A0K);
        AbstractC31178DnM.A1S(A0K);
    }

    public static final int A00(UserSession userSession, C35266Fh1 c35266Fh1) {
        return AbstractC31172DnG.A01(AbstractC31178DnM.A0S(userSession, c35266Fh1), "auto_follow_back_profile_toast_impression_count");
    }

    public static final void A01(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, GZ8 gz8, List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            A0q.add(new AutoFollowBackBottomSheetData(A15.Bhu(), A15.getId(), A15.getFullName(), A15.getUsername()));
        }
        ArrayList<? extends Parcelable> A1F = AbstractC166987dD.A1F(A0q);
        C35121FeO c35121FeO = new C35121FeO(interfaceC11380iw, userSession);
        boolean A05 = A05(userSession);
        Object obj = new Object();
        EO6 eo6 = new EO6();
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0U = new GH0(0, c35121FeO, obj, A1F, gz8);
        int i = 2131953362;
        if (C14360o3.A0K(interfaceC11380iw.getModuleName(), "profile")) {
            i = 2131953371;
        }
        A0y.A0g = context.getString(i);
        A0y.A1J = true;
        A0y.A0v = true;
        A0y.A0K = new ViewOnClickListenerC35632FoN(3, c35121FeO, obj, gz8, userSession, eo6, A05);
        C189478aR A002 = A0y.A00();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelableArrayList("auto_follow_back_list_data", A1F);
        A0b.putBoolean("auto_follow_back_system_setting_enabled", A05);
        eo6.setArguments(A0b);
        eo6.A00 = new C34678FPn(context, interfaceC11380iw, A002);
        A002.A02(activity, eo6);
        int size = A1F.size();
        InterfaceC02590Ai A003 = C35121FeO.A00(c35121FeO);
        AbstractC31178DnM.A12(EnumC33496ErV.BOTTOMSHEET, A003);
        A003.A9K("num_requests", AbstractC31171DnF.A0V(size));
        C35121FeO.A01(A003, c35121FeO);
        if (A05) {
            InterfaceC02590Ai A004 = C35121FeO.A00(c35121FeO);
            AbstractC31178DnM.A12(EnumC33496ErV.SYSTEM_SETTING, A004);
            C35121FeO.A01(A004, c35121FeO);
        }
    }

    public static final void A04(UserSession userSession, C35266Fh1 c35266Fh1) {
        InterfaceC19610xo ARD = AbstractC31178DnM.A0S(userSession, c35266Fh1).ARD();
        ARD.E7D("auto_follow_back_profile_toast_impression_count", A00(userSession, c35266Fh1) + 1);
        ARD.apply();
    }

    public static final boolean A06(UserSession userSession, C35266Fh1 c35266Fh1) {
        Boolean CQD = AbstractC31174DnI.A0m(userSession).CQD();
        if ((CQD == null || !CQD.booleanValue()) && !AbstractC31172DnG.A1a(AbstractC31178DnM.A0S(userSession, c35266Fh1), "auto_follow_back_has_enabled_system_setting_before")) {
            return false;
        }
        return true;
    }
}
