package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.0t6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17110t6 implements InterfaceC02900Bo, CallerContextable, C08V {
    public static final String __redex_internal_original_name = "MultipleAccountHelperImpl";
    public long A00;
    public boolean A01;
    public final AnonymousClass088 A02;
    public final C17120t7 A03;
    public final boolean A04;

    public C17110t6(AnonymousClass088 anonymousClass088, C17120t7 c17120t7, boolean z) {
        C14360o3.A0B(anonymousClass088, 1);
        C14360o3.A0B(c17120t7, 2);
        this.A02 = anonymousClass088;
        this.A03 = c17120t7;
        this.A04 = z;
    }

    public static final boolean A03(Activity activity, UserSession userSession) {
        if (!AbstractC35181FfY.A02(userSession)) {
            FW1.A00(activity);
            return false;
        }
        if (C1XC.A00(activity, userSession)) {
            return true;
        }
        FW1.A01(userSession, activity, false);
        return false;
    }

    @Override // X.InterfaceC02900Bo
    public final /* synthetic */ C0BO AEY(Activity activity, android.net.Uri uri, UserSession userSession, String str, boolean z) {
        C14360o3.A0B(activity, 1);
        C14360o3.A0B(userSession, 2);
        return AEZ(activity, uri, userSession, str, z, false);
    }

    @Override // X.InterfaceC02900Bo
    public final C0BO AEZ(Activity activity, android.net.Uri uri, UserSession userSession, String str, boolean z, boolean z2) {
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(userSession, 1);
        if (!A03(activity, userSession)) {
            return new C0BO(null, false);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
        if (uri != null) {
            bundle.putString("original_url", uri.toString());
        }
        bundle.putBoolean("SHOULD_START_AT_SAC_REG_FLOW", z);
        bundle.putBoolean("is_current_user_fb_connected", AbstractC49092Nc.A00(userSession).A00(new CallerContext(C17110t6.class), "ig_add_account_flow"));
        bundle.putString("current_username", C08730cb.A00(userSession).A00().getUsername());
        bundle.putString("last_accessed_user_id", userSession.userId);
        bundle.putBoolean("multiple_accounts_logged_in", C0BQ.A00(userSession).CLL());
        if ("settings".equals(str)) {
            bundle.putString("page_id_for_suma_new_biz_account", C08730cb.A00(userSession).A00().A03.Bb0());
            bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        }
        bundle.putString("current_user_id", userSession.userId);
        bundle.putString("cached_ig_access_token", C1F8.A00(userSession).A04);
        bundle.putString("last_logged_in_ig_access_token", userSession.token);
        bundle.putBoolean("should_show_youth_regulation_block", z2);
        bundle.putString("current_user_id", userSession.userId);
        bundle.putString("cached_ig_access_token", C1F8.A00(userSession).A04);
        bundle.putString("last_logged_in_ig_access_token", userSession.token);
        return new C0BO(bundle, true);
    }

    @Override // X.InterfaceC02900Bo
    public final boolean AGB(Context context, UserSession userSession, User user) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(user, 2);
        if (!C1XC.A00(context, userSession)) {
            "ig_account_switch_blocked".getClass();
            C19280xC A01 = C19280xC.A01("ig_account_switch_blocked", null);
            Iterator it = new ArrayList(C1XC.A00).iterator();
            while (it.hasNext()) {
                ((C1XB) it.next()).CuO(context, A01, userSession);
            }
            AbstractC11060iN.A00(userSession).EHW(A01);
            FW1.A01(userSession, context, false);
            return false;
        }
        if (!C14360o3.A0K(user.getId(), userSession.userId)) {
            return true;
        }
        C0w9.A04("MultipleAccountUtil_duplicateAccountSwitch", "Tried to switch to same user twice", 1);
        return false;
    }

    @Override // X.InterfaceC02900Bo
    public final java.util.Set BOd() {
        return AbstractC001800i.A0k(BOc(null));
    }

    @Override // X.InterfaceC02900Bo
    public final User BWy(User user) {
        Object obj;
        C14360o3.A0B(user, 0);
        AnonymousClass088 anonymousClass088 = this.A02;
        List A03 = anonymousClass088.A03(user);
        Map map = anonymousClass088.A04;
        Number number = (Number) map.get(user);
        Iterator it = A03.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Number number2 = (Number) map.get(obj);
                if (number != null && number2 != null && number2.longValue() <= number.longValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        User user2 = (User) obj;
        if (user2 == null) {
            return (User) AbstractC001800i.A0J(A03);
        }
        return user2;
    }

    @Override // X.InterfaceC02900Bo
    public final void CJm(Context context, UserSession userSession, String str) {
        Intent intent;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        if ((System.currentTimeMillis() - this.A00) / 1000 > C1AD.A01(C06090Tz.A06, 18580264745699132L) && this.A01 && C1AD.A06(C06090Tz.A05, 18298789769054014L)) {
            this.A01 = false;
        }
        if (this.A01) {
            AnonymousClass088 anonymousClass088 = C09Y.A00().A02;
            User A00 = C08730cb.A00(userSession).A00();
            Map map = anonymousClass088.A01;
            Object obj = anonymousClass088.A02.get(A00);
            if (obj != null) {
                map.put(A00, obj);
            }
            this.A01 = false;
        }
        User BWy = BWy(C08730cb.A00(userSession).A00());
        if (BWy != null) {
            if (AGB(context, userSession, BWy)) {
                if ("double_tap_tab_bar_direct_action_bar".equals(str)) {
                    intent = C14H.A03.A00().A02(context, 0);
                    intent.setData(new Uri.Builder().scheme("ig").authority("direct_inbox_account_switch").appendQueryParameter("filter_type", "all").build());
                } else {
                    intent = null;
                }
                E45(context, intent, userSession, BWy, str);
            } else {
                C0w9.A03(__redex_internal_original_name, AnonymousClass001.A0R("Can't perform account switch for user: ", BWy.getId()));
            }
        }
        C19740y2 A002 = AbstractC19730y1.A00(AbstractC12960li.A00);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = A002.A00.ARD();
        ARD.E7G("preference_double_tap_account_switch_last_impression_time", currentTimeMillis);
        ARD.apply();
    }

    @Override // X.InterfaceC02900Bo
    public final void E45(Context context, Intent intent, UserSession userSession, User user, String str) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(user, 2);
        C14360o3.A0B(str, 3);
        E46(context, intent, userSession, user, str, true);
    }

    @Override // X.InterfaceC02900Bo
    public final void E46(Context context, Intent intent, UserSession userSession, User user, String str, boolean z) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        E47(context, intent, userSession, user, str, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1vw, java.lang.Object] */
    public static final void A00(Context context, UserSession userSession, C17110t6 c17110t6, User user) {
        AnonymousClass088 anonymousClass088 = c17110t6.A02;
        java.util.Set set = anonymousClass088.A05;
        if (!set.contains(user.getId())) {
            set.add(user.getId());
            AnonymousClass088.A02(anonymousClass088);
        }
        C41451vu c41451vu = C41451vu.A01;
        String str = userSession.userId;
        user.getId();
        C14360o3.A0B(str, 1);
        c41451vu.E4s(new Object());
        String str2 = userSession.userId;
        InterfaceC19610xo ARD = anonymousClass088.A00.A00.ARD();
        ARD.E7K("last_seen_user_id", str2);
        ARD.apply();
        C08S.A00(context, C023409i.A0A.A03(c17110t6), userSession, user);
    }

    public static final void A01(final Context context, final UserSession userSession, final C17110t6 c17110t6, final User user) {
        C41451vu c41451vu = C41451vu.A01;
        user.getId();
        user.getUsername();
        c41451vu.E4s(new C04020Js(null, new Runnable() { // from class: X.0CH
            @Override // java.lang.Runnable
            public final void run() {
                C17110t6 c17110t62 = c17110t6;
                C17120t7 c17120t7 = c17110t62.A03;
                Context context2 = context;
                UserSession userSession2 = userSession;
                C08S.A01(context2, userSession2, c17120t7.A00);
                C17110t6.A00(context2, userSession2, c17110t62, user);
            }
        }, C17060sy.A01.A01(userSession).getUsername(), null, 24, true));
    }

    public static final void A02(User user, User user2) {
        C41451vu c41451vu = C41451vu.A01;
        user2.getId();
        user2.getUsername();
        c41451vu.E4s(new C04020Js(null, null, user.getUsername(), null, 88, true));
    }

    @Override // X.InterfaceC02900Bo
    public final List BOY() {
        List A03 = this.A02.A03(null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A03) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC02900Bo
    public final int BOZ() {
        return this.A02.A04.size();
    }

    @Override // X.InterfaceC02900Bo
    public final User BOa(String str) {
        Object obj;
        Iterator it = this.A02.A04.keySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            User user = (User) next;
            if (user != null) {
                obj = user.getId();
            }
            if (C14360o3.A0K(obj, str)) {
                obj = next;
                break;
            }
        }
        return (User) obj;
    }

    @Override // X.InterfaceC02900Bo
    public final User BOb(String str) {
        Object obj;
        Iterator it = this.A02.A04.keySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            User user = (User) next;
            if (user != null) {
                obj = user.getUsername();
            }
            if (C14360o3.A0K(obj, str)) {
                obj = next;
                break;
            }
        }
        return (User) obj;
    }

    @Override // X.InterfaceC02900Bo
    public final List BOc(String str) {
        java.util.Set<User> keySet = this.A02.A04.keySet();
        ArrayList arrayList = new ArrayList();
        for (User user : keySet) {
            if (user != null && !C14360o3.A0K(str, user.getId())) {
                arrayList.add(user.getId());
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC02900Bo
    public final List BOe() {
        return this.A02.A03(null);
    }

    @Override // X.InterfaceC02900Bo
    public final List BOf(User user) {
        return this.A02.A03(user);
    }

    @Override // X.InterfaceC02900Bo
    public final boolean CLL() {
        if (this.A02.A04.size() > 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC02900Bo
    public final boolean CPH(String str) {
        List A03 = this.A02.A03(null);
        if (!(A03 instanceof Collection) || !A03.isEmpty()) {
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((User) it.next()).getId(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC02900Bo
    public final void Cn0() {
        InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
        ARD.E7D("preference_double_tap_profile_tab_education_dialog_impression_count", 1);
        ARD.apply();
    }

    @Override // X.InterfaceC02900Bo
    public final void E47(Context context, Intent intent, final UserSession userSession, User user, String str, boolean z, boolean z2) {
        EnumC31512Dsw A00;
        double currentTimeMillis = System.currentTimeMillis();
        final C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            c006802i.markerStart(31784965);
            MarkerEditor withMarker = c006802i.withMarker(31784965);
            withMarker.setSurviveUserSwitch(true);
            withMarker.markerEditingCompleted();
            c006802i.markerAnnotate(31784965, "from_pk", userSession.userId);
            c006802i.markerAnnotate(31784965, "to_pk", user.getId());
            c006802i.markerAnnotate(31784965, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            C11T.A02(new Runnable() { // from class: X.0CJ
                @Override // java.lang.Runnable
                public final void run() {
                    MessageQueue myQueue = Looper.myQueue();
                    final UserSession userSession2 = userSession;
                    final C17110t6 c17110t6 = this;
                    final C006802i c006802i2 = c006802i;
                    myQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: X.0CI
                        @Override // android.os.MessageQueue.IdleHandler
                        public final boolean queueIdle() {
                            boolean hasEnded = userSession2.hasEnded();
                            if (hasEnded) {
                                Map A002 = AbstractC46723Klg.A00(C023409i.A0A.A08(c17110t6));
                                C006802i c006802i3 = c006802i2;
                                for (Map.Entry entry : A002.entrySet()) {
                                    c006802i3.markerAnnotate(31784965, (String) entry.getKey(), (String) entry.getValue());
                                }
                                c006802i3.markerEnd(31784965, (short) 2);
                            }
                            return !hasEnded;
                        }
                    });
                }
            });
        }
        String obj = UUID.randomUUID().toString();
        if (intent != null) {
            intent.putExtra("EXTRA_SWITCHED_FROM_USER", C17060sy.A01.A01(userSession).getUsername());
            obj = intent.getStringExtra("event_session_id");
        }
        C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
        C25531Mh c25531Mh = new C25531Mh(A01.A00(A01.A00, "ig_account_switched"), 192);
        c25531Mh.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        c25531Mh.A0R("to_pk", user.getId());
        c25531Mh.A0R("from_pk", userSession.userId);
        c25531Mh.Cht();
        C6QM.A00(userSession);
        A00(context, userSession, this, user);
        if (z) {
            C18920wW c18920wW = new C18920wW(C12180kM.A02, userSession);
            C25531Mh c25531Mh2 = new C25531Mh(c18920wW.A00(c18920wW.A00, "switched_success"), 379);
            c25531Mh2.A0O("is_badge_shown", true);
            c25531Mh2.A0Q("raw_target_account_id", AbstractC003100w.A0k(10, user.getId()));
            c25531Mh2.A0Q("target_identity_id", AbstractC003100w.A0k(10, user.getId()));
            A00 = C0CK.A00(str);
            c25531Mh2.A0M(A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            c25531Mh2.A0P(TraceFieldType.StartTime, Double.valueOf(currentTimeMillis));
            c25531Mh2.A0R("event_session_id", obj);
            c25531Mh2.A0O("is_logged_in", true);
            c25531Mh2.A0R("switch_type", "intra_app");
            c25531Mh2.A0O("is_cds", false);
            c25531Mh2.A0O("is_sso_enabled", true);
            c25531Mh2.A0O("is_tooltip_shown", false);
            c25531Mh2.A0R("tooltip_type", "");
            c25531Mh2.A0M(EnumC31511Dsv.INSTAGRAM, "initiator_account_type");
            c25531Mh2.A0R("initiator_identity_type", null);
            c25531Mh2.A0P("end_time", Double.valueOf(System.currentTimeMillis()));
            c25531Mh2.Cht();
        }
        C41451vu c41451vu = C41451vu.A01;
        user.getId();
        user.getUsername();
        c41451vu.E4s(new C04020Js(intent, null, null, str, 100, false));
        if (intent != null && z2) {
            android.net.Uri data = intent.getData();
            Intent A02 = C14H.A03.A00().A02(context, 335544320);
            A02.setData(data);
            C12260kU.A0C(context, A02);
        }
        if (AbstractC12290kX.A00 != null) {
            C17280tP A002 = C17280tP.A4E.A00();
            java.util.Set A09 = A002.A09();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : A09) {
                if (!C14360o3.A0K(obj2, user.getId())) {
                    arrayList.add(obj2);
                }
            }
            A002.A0H(AbstractC001800i.A0k(arrayList));
        }
    }
}
