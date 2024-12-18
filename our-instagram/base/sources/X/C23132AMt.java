package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.AMt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23132AMt {
    public static final C23132AMt A00 = new Object();

    public static final ArrayList A01(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        C14360o3.A0B(str2, 3);
        if (!(abstractC12990ll instanceof UserSession)) {
            return AbstractC166987dD.A1E();
        }
        if (str.equals("active_account")) {
            UserSession userSession = (UserSession) abstractC12990ll;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = AMd.A03(context, userSession, str2, str3, userSession.userId, new HashSet(AbstractC166987dD.A1J(EnumC200798uM.INSTAGRAM))).iterator();
            while (it.hasNext()) {
                A0H(A1E, it);
            }
            return A1E;
        }
        if (str.equals("inactive_logged_in_accounts")) {
            return A03((UserSession) abstractC12990ll);
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        UserSession userSession2 = (UserSession) abstractC12990ll;
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Iterator it2 = AMd.A03(context, userSession2, str2, str3, userSession2.userId, new HashSet(AbstractC166987dD.A1J(EnumC200798uM.INSTAGRAM))).iterator();
        while (it2.hasNext()) {
            A0H(A1E3, it2);
        }
        A1E2.addAll(A1E3);
        A1E2.addAll(A03(userSession2));
        return A1E2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.AMj, java.lang.Object] */
    private final List A0A(Context context, UserSession userSession, String str, String str2) {
        String str3 = str2;
        String str4 = str;
        try {
            C006802i.A0p.markerAnnotate(444800256, "fb_lite_content_provider", "enabled");
            ?? obj = new Object();
            java.util.Set A0E = A0E(EnumC200808uN.A03, EnumC200938ua.SAVED_ACCOUNTS);
            if (str == null) {
                str4 = C18U.A04(C06090Tz.A06, userSession, 36884792591057490L);
            }
            if (str2 == null) {
                str3 = "FxNativeAuthDataHelper";
            }
            List list = (List) obj.A07(context, userSession, str4, str3, A0E).get();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0G(A1E, it);
            }
            return A1E;
        } catch (Exception e) {
            C0K8.A0F("FxNativeAuthDataHelper", "Lite Access Library error: ", e);
            return C16930sl.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.AMj, java.lang.Object] */
    private final List A0D(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, String str, String str2) {
        String str3 = str2;
        String str4 = str;
        try {
            C006802i.A0p.markerAnnotate(444800256, "fb_lite_content_provider", "enabled");
            ?? obj = new Object();
            java.util.Set A0E = A0E(EnumC200808uN.A03, EnumC200938ua.ACTIVE_ACCOUNT);
            if (str == null) {
                str4 = C18U.A04(C06090Tz.A06, abstractC12990ll, 36884792591057490L);
            }
            if (str2 == null) {
                str3 = "FxNativeAuthDataHelper";
            }
            List list = (List) obj.A07(fragmentActivity, abstractC12990ll, str4, str3, A0E).get();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C203128yU c203128yU = ((C203148yW) it.next()).A01;
                A1E.add(A04(c203128yU.A01.A02, c203128yU.A00, "Facebook", "Facebook", "active_account"));
            }
            return A1E;
        } catch (Exception e) {
            C0K8.A0F("FxNativeAuthDataHelper", "Lite Access Library error: ", e);
            return C16930sl.A00;
        }
    }

    public static java.util.Set A0E(EnumC200808uN enumC200808uN, EnumC200938ua enumC200938ua) {
        java.util.Set singleton = Collections.singleton(new A9D(null, AbstractC16850sd.A0M(new C09530e4("resolver_type", AbstractC111324zv.A00(231))), enumC200808uN, enumC200938ua));
        C14360o3.A07(singleton);
        return singleton;
    }

    @Deprecated(message = "Caller name should be set by the Bloks caller for all new usecases. Use bk.fx.action.FetchAllAvailableNativeAuthDataForCaller and the corresponding methods with caller")
    public static final ArrayList A02(AbstractC12990ll abstractC12990ll, String str) {
        if (!(abstractC12990ll instanceof UserSession)) {
            return AbstractC166987dD.A1E();
        }
        if (C14360o3.A0K(str, "active_account")) {
            UserSession userSession = (UserSession) abstractC12990ll;
            String str2 = C1F8.A00(userSession).A04;
            ArrayList A1E = AbstractC166987dD.A1E();
            if (AbstractC13670mt.A0B(str2)) {
                return A1E;
            }
            A1E.add(A04(userSession.userId, str2, "Instagram", "Instagram", "active_account"));
            return A1E;
        }
        if (C14360o3.A0K(str, "inactive_logged_in_accounts")) {
            return A03((UserSession) abstractC12990ll);
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        UserSession userSession2 = (UserSession) abstractC12990ll;
        String str3 = C1F8.A00(userSession2).A04;
        ArrayList A1E3 = AbstractC166987dD.A1E();
        if (!AbstractC13670mt.A0B(str3)) {
            A1E3.add(A04(userSession2.userId, str3, "Instagram", "Instagram", "active_account"));
        }
        A1E2.addAll(A1E3);
        A1E2.addAll(A03(userSession2));
        return A1E2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.AMj, java.lang.Object] */
    public static final List A07(Context context, AbstractC12990ll abstractC12990ll, String str, String str2) {
        String str3;
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36321842637711206L)) {
            try {
                C006802i.A0p.markerAnnotate(444800256, "msgr_lite_content_provider", "enabled");
                List list = (List) new Object().A07(context, abstractC12990ll, str, str2, A0E(EnumC200808uN.A08, EnumC200938ua.ACTIVE_ACCOUNT)).get();
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0H(A1E, it);
                }
                return A1E;
            } catch (Exception e) {
                C0K8.A0F("FxNativeAuthDataHelper", "Lite Access Library error: ", e);
                return C16930sl.A00;
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        if (abstractC12990ll instanceof UserSession) {
            str3 = ((UserSession) abstractC12990ll).userId;
        } else {
            str3 = null;
        }
        Iterator it2 = AMd.A02(context, abstractC12990ll, str, str2, str3).iterator();
        while (it2.hasNext()) {
            A0H(A1E2, it2);
        }
        return A1E2;
    }

    private final List A09(Context context, UserSession userSession, String str) {
        String A002 = AbstractC111324zv.A00(592);
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36321842637580133L)) {
            return A0A(context, userSession, str, A002);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (A0I()) {
            if (!AMd.A04(str, A002, new C200898uW(userSession, userSession.userId))) {
                new C200908uX(userSession).A07("FACEBOOK", C05F.A03, "SAVED_ACCOUNTS");
            } else {
                A0F(userSession, A1E);
            }
        }
        if (!A1E.isEmpty()) {
            return A1E;
        }
        Iterator it = AMd.A00(context, userSession, str, A002, userSession.userId, EnumC200798uM.FACEBOOK).iterator();
        while (it.hasNext()) {
            A0G(A1E, it);
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0100, code lost:
    
        if (r0 != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.AMj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List A0B(androidx.fragment.app.FragmentActivity r17, X.AbstractC12990ll r18) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23132AMt.A0B(androidx.fragment.app.FragmentActivity, X.0ll):java.util.List");
    }

    private final List A0C(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, String str) {
        String str2;
        String A002 = AbstractC111324zv.A00(592);
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36321842637580133L)) {
            return A0D(fragmentActivity, abstractC12990ll, str, A002);
        }
        if (abstractC12990ll instanceof UserSession) {
            str2 = ((UserSession) abstractC12990ll).userId;
        } else {
            str2 = null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = AMd.A01(AbstractC166987dD.A0O(fragmentActivity), abstractC12990ll, str, A002, str2).iterator();
        while (it.hasNext()) {
            C203128yU c203128yU = ((C203148yW) it.next()).A01;
            A1E.add(A04(c203128yU.A01.A02, c203128yU.A00, "Facebook", "Facebook", "active_account"));
        }
        return A1E;
    }

    public static final ArrayList A00(Context context, AbstractC12990ll abstractC12990ll, String str, String str2) {
        String str3;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (abstractC12990ll instanceof UserSession) {
            str3 = ((UserSession) abstractC12990ll).userId;
        } else {
            str3 = null;
        }
        Iterator it = AMd.A03(context, abstractC12990ll, str, str2, str3, AbstractC16830sb.A06(EnumC200798uM.OCULUS)).iterator();
        while (it.hasNext()) {
            C203128yU c203128yU = ((C203148yW) it.next()).A01;
            A1E.add(A04(c203128yU.A01.A02, c203128yU.A00, "FRL", "Oculus", "active_account"));
        }
        return A1E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Jk, java.lang.Object] */
    public static final ArrayList A03(UserSession userSession) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = ((C17110t6) C0BQ.A00(userSession)).BOc(null).iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            if (!AbstractC13670mt.A0B(A1B) && !C14360o3.A0K(A1B, userSession.userId)) {
                C023409i.A0A.A0A(new Object(), new C24041Ald(A1E, A1B), new Object(), A1B);
            }
        }
        return A1E;
    }

    public static final HashMap A04(String str, String str2, String str3, String str4, String str5) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        A1G.put("auth_token", str2);
        A1G.put("account_type", str3);
        A1G.put("app_source", str4);
        A1G.put("account_source", str5);
        return A1G;
    }

    @Deprecated(message = "Caller name should be set by the Bloks caller for all new usecases. Use bk.fx.action.FetchAllAvailableNativeAuthDataForCaller and the corresponding methods with caller name")
    public static final List A05(Context context, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, String str) {
        AbstractC167017dG.A1O(abstractC12990ll, fragmentActivity);
        if (abstractC12990ll instanceof UserSession) {
            if (str == null) {
                str = "";
            }
            if (!str.equals("active_account")) {
                if (str.equals("inactive_logged_in_accounts")) {
                    return A00.A08(context, (UserSession) abstractC12990ll);
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                C23132AMt c23132AMt = A00;
                A1E.addAll(c23132AMt.A0B(fragmentActivity, abstractC12990ll));
                A1E.addAll(c23132AMt.A08(context, (UserSession) abstractC12990ll));
                return A1E;
            }
        }
        return A00.A0B(fragmentActivity, abstractC12990ll);
    }

    public static final List A06(Context context, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, String str, String str2) {
        AbstractC167017dG.A1O(abstractC12990ll, fragmentActivity);
        C14360o3.A0B(str2, 4);
        if ((abstractC12990ll instanceof UserSession) && !str.equals("active_account")) {
            if (str.equals("inactive_logged_in_accounts")) {
                return A00.A09(context, (UserSession) abstractC12990ll, str2);
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            C23132AMt c23132AMt = A00;
            A1E.addAll(c23132AMt.A0C(fragmentActivity, abstractC12990ll, str2));
            A1E.addAll(c23132AMt.A09(context, (UserSession) abstractC12990ll, str2));
            return A1E;
        }
        return A00.A0C(fragmentActivity, abstractC12990ll, str2);
    }

    private final List A08(Context context, UserSession userSession) {
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36321842637580133L)) {
            return A0A(context, userSession, null, null);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (A0I()) {
            A0F(userSession, A1E);
        }
        if (!A1E.isEmpty()) {
            return A1E;
        }
        C200758uI c200758uI = new C200758uI();
        c200758uI.A03 = new C200898uW(userSession, null);
        c200758uI.A04 = new C200908uX(userSession);
        Iterator it = C200918uY.A01(context, null, AbstractC166987dD.A1J(EnumC200798uM.FACEBOOK), new C200918uY(c200758uI)).iterator();
        while (it.hasNext()) {
            A0G(A1E, it);
        }
        return A1E;
    }

    private final void A0F(UserSession userSession, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new AK5(EnumC200808uN.A03, EnumC200938ua.SAVED_ACCOUNTS));
        Iterator it = A3F.A00(AbstractC166997dE.A0o(), "FxNativeAuthDataHelper", A1E, new C200908uX(userSession)).iterator();
        while (it.hasNext()) {
            ACJ acj = (ACJ) it.next();
            list.add(A04(acj.A02, acj.A01, "Facebook", "Facebook", "inactive_logged_in_accounts"));
        }
    }

    public static void A0G(AbstractCollection abstractCollection, Iterator it) {
        C203128yU c203128yU = ((C203148yW) it.next()).A01;
        abstractCollection.add(A04(c203128yU.A01.A02, c203128yU.A00, "Facebook", "Facebook", "inactive_logged_in_accounts"));
    }

    public static void A0H(AbstractCollection abstractCollection, Iterator it) {
        C203128yU c203128yU = ((C203148yW) it.next()).A01;
        abstractCollection.add(A04(c203128yU.A01.A02, c203128yU.A00, "Facebook", AbstractC43591JPw.A00(117), "active_account"));
    }

    public static final boolean A0I() {
        if (!C20150ym.A07(AbstractC20100yh.A00(36313613480560821L)) && !C20150ym.A07(AbstractC20100yh.A00(36313613480691895L)) && !C20150ym.A07(AbstractC20070ye.A00(18299219266046140L)) && !C20150ym.A07(AbstractC20070ye.A00(18299219266177213L))) {
            return false;
        }
        return true;
    }
}
