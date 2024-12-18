package X;

import android.content.Intent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.KrY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47077KrY {
    public static void A00(Intent intent, AbstractC12990ll abstractC12990ll, List list) {
        String stringExtra;
        String str;
        boolean z;
        Long l;
        C18720vz c18720vz = AbstractC12960li.A00;
        C226418s A01 = C226218q.A01(c18720vz);
        A01.A0L(intent, C05F.A01);
        A01.A0P(A01.A02, "NOTIFICATION_CLICK_DETECTED");
        C19740y2 A00 = AbstractC19730y1.A00(c18720vz);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = A00.A00.ARD();
        ARD.E7G("notification_clicked_timestamp", currentTimeMillis);
        ARD.apply();
        String stringExtra2 = intent.getStringExtra("push_category");
        if (stringExtra2 != null) {
            C226418s.A06(A01.A02, "push_category", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("recipient_id");
        UserSession A012 = AbstractC03270Dk.A01(abstractC12990ll);
        if (A012 != null && stringExtra3 != null) {
            Boolean A0s = AbstractC31172DnG.A0s(A012.userId.equals(stringExtra3));
            C1KX c1kx = A01.A05;
            if (c1kx != null && c1kx.A03 == null) {
                c1kx.A03 = A0s;
            }
        }
        if (intent.getBooleanExtra("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_IS_FROM_DIRECT_PUSH", false) && A012 != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A012, 36329229983498450L) && !AbstractC18910wS.A00.getAndSet(true)) {
                C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.0tW
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC09800fd.A01("DirectPushToThreadViewClassPreload", 152092404);
                        AbstractC09800fd.A00(1131502239);
                    }
                });
            }
            if (C18U.A06(c06090Tz, A012, 36323968646721262L)) {
                C46104Kb4 c46104Kb4 = new C46104Kb4(C218914p.A08, A012, IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE);
                c46104Kb4.updateExtras(A012);
                boolean A08 = C218914p.A08();
                C2F8 c2f8 = c46104Kb4.A0A;
                if (A08) {
                    l = Long.valueOf(C1CC.A08);
                } else {
                    l = null;
                }
                c2f8.A00 = l;
                AbstractC47302Ey abstractC47302Ey = c46104Kb4.A06;
                if (abstractC47302Ey != null && abstractC47302Ey.onLoggerStarted(c46104Kb4)) {
                    Iterator A15 = AbstractC166997dE.A15(c46104Kb4.A0B);
                    while (A15.hasNext()) {
                        c46104Kb4.A07(AbstractC43594JPz.A0l(A15));
                    }
                    c46104Kb4.A0N();
                }
                c46104Kb4.A0H(c2f8, "app_start_type", C1CC.A09.toString());
                c46104Kb4.A0L(c2f8, "is_app_start", A08);
                C47959LGv c47959LGv = c46104Kb4.A09;
                c46104Kb4.A0L(c2f8, "disable_iris_check", c47959LGv.A06);
                c46104Kb4.A0L(c2f8, "disable_mem_check", c47959LGv.A07);
                if (stringExtra3 != null) {
                    c46104Kb4.annotateFirstUserIsBackground(!A012.userId.equals(stringExtra3));
                }
                if (stringExtra2 != null) {
                    c46104Kb4.annotatePushCategory(stringExtra2);
                }
            }
        }
        if (intent.getBooleanExtra("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_IS_FROM_DIRECT_PUSH", false) && A012 != null && C18U.A06(C06090Tz.A05, A012, 36326154787043021L)) {
            C2DG.A00(A012).A09("NOTIFICATION");
        }
        android.net.Uri data = intent.getData();
        if (AbstractC34771FTu.A00(data) != null) {
            stringExtra = AbstractC34771FTu.A00(data);
        } else {
            stringExtra = intent.getStringExtra("recipient_id");
        }
        if (stringExtra != null && (abstractC12990ll instanceof UserSession)) {
            UserSession userSession = (UserSession) abstractC12990ll;
            if (!userSession.userId.equals(stringExtra) && ((C17110t6) C0BQ.A00(userSession)).BOc(null).contains(stringExtra)) {
                return;
            }
        }
        if (intent.hasExtra("NotificationAnalyticsEventHelper.NOTIFICATION_CLICKED_ALREADY_LOGGED")) {
            return;
        }
        intent.putExtra("NotificationAnalyticsEventHelper.NOTIFICATION_CLICKED_ALREADY_LOGGED", Boolean.TRUE);
        long j = 0;
        long longExtra = intent.getLongExtra("notification_in_tray_timestamp", 0L);
        if (longExtra > 0) {
            j = AbstractC37300Gc1.A00(longExtra);
        }
        JQU jqu = JQU.A01;
        String A002 = MSV.A00(94);
        String stringExtra4 = intent.getStringExtra(A002);
        PushChannelType A003 = AbstractC46671Kko.A00(intent.getStringExtra("from_notification_push_channel_type"));
        if (A003 == null) {
            A003 = PushChannelType.A0D;
        }
        String A004 = MSV.A00(450);
        String stringExtra5 = intent.getStringExtra(A004);
        Long A0n = AbstractC25233BEq.A0n(intent.getStringExtra("recipient_id"));
        Long A0n2 = AbstractC25233BEq.A0n(intent.getStringExtra("sender_id"));
        String stringExtra6 = intent.getStringExtra("com.instagram.android.igns.logging.sender_id");
        String stringExtra7 = intent.getStringExtra("landing_path");
        Integer num = C05F.A00;
        boolean booleanExtra = intent.getBooleanExtra("is_e2ee", false);
        Long valueOf = Long.valueOf(intent.getLongExtra("occamadillo_thread_id", 0L));
        String stringExtra8 = intent.getStringExtra("armadillo_thread_id");
        String stringExtra9 = intent.getStringExtra(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        ArrayList A005 = C43608JQp.A00(intent);
        jqu.A09(new JQO(A003, num, null, valueOf, A0n, A0n2, stringExtra8, stringExtra4, stringExtra6, stringExtra7, stringExtra5, stringExtra4, stringExtra9, null, intent.getStringExtra("push_infra_notification_id"), intent.getStringExtra("token_fb_id"), intent.getStringExtra("trace_id"), A005, TimeUnit.MILLISECONDS.toSeconds(j), true, false, booleanExtra), list);
        AbstractC19330xH A006 = AbstractC11060iN.A00(abstractC12990ll);
        C19280xC A007 = JQW.A00(intent, "notification_clicked", intent.getStringExtra("recipient_id"));
        A007.A0C("pi", intent.getStringExtra(A004));
        A007.A0C("push_category", intent.getStringExtra(A002));
        A007.A0C("push_channel_type", intent.getStringExtra("from_notification_push_channel_type"));
        A007.A09("is_bg_account", Boolean.valueOf(intent.getBooleanExtra("MainActivityAccountHelper.ACCOUNT_SWITCH_EVENT", false)));
        A006.EHW(A007);
        String stringExtra10 = intent.getStringExtra("landing_path");
        if (stringExtra10 != null) {
            boolean booleanExtra2 = intent.getBooleanExtra("MainActivityAccountHelper.ACCOUNT_SWITCH_EVENT", false);
            boolean booleanExtra3 = intent.getBooleanExtra("is_instamadillo", false);
            String stringExtra11 = intent.getStringExtra(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
            long[] longArrayExtra = intent.getLongArrayExtra("feature_tags");
            if (longArrayExtra != null) {
                z = AbstractC009903n.A0Q(longArrayExtra, 15L);
            } else {
                z = false;
            }
            new C60H(abstractC12990ll).A05(Boolean.valueOf(booleanExtra3), stringExtra10, "ARMADILLO_NOTIFICATIONS_CLICKED", stringExtra11, booleanExtra2, z);
        }
        String stringExtra12 = intent.getStringExtra(A004);
        String stringExtra13 = intent.getStringExtra(A002);
        if (A012 != null) {
            if (stringExtra10 != null) {
                str = AbstractC25227BEk.A0B(stringExtra10).getQueryParameter("x");
            } else {
                str = null;
            }
            C60K.A00(A012).A00(stringExtra12, str, stringExtra13, null, null, 14);
            if (C1C0.A00(A012)) {
                AnonymousClass274.A00((AnonymousClass274) A012.A01(AnonymousClass274.class, AnonymousClass273.A00), "NOTIFICATION_CLICKED", stringExtra10, null);
            }
            BF5 bf5 = new BF5(A012);
            if (stringExtra10 != null && AbstractC001900j.A0a(stringExtra10, "remind_me_about_this_ad_ad_id", false)) {
                android.net.Uri A03 = AbstractC08820cl.A03(stringExtra10);
                String queryParameter = A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                Long A0n3 = AbstractC25233BEq.A0n(A03.getQueryParameter("remind_me_about_this_ad_ad_id"));
                if (queryParameter != null && A0n3 != null) {
                    ((C27966CUm) bf5.A01.getValue()).A01("notification_tap", queryParameter, A0n3.longValue());
                }
            }
            new C146076i5(null, A012, null).A05(stringExtra10, "upcoming_event_reminder_notification_tap");
            C06090Tz c06090Tz2 = C06090Tz.A05;
            if (C18U.A06(c06090Tz2, abstractC12990ll, 36323371645938882L)) {
                JXM jxm = (JXM) A012.A01(JXM.class, new C29899DGn(13, new M8X(2), A012));
                String stringExtra14 = intent.getStringExtra("sender_id");
                List list2 = jxm.A02;
                if (list2.size() == 2) {
                    AnonymousClass016.A15(list2);
                }
                list2.add(new C26087BgG(Long.valueOf(AbstractC166987dD.A0L(AbstractC166987dD.A0N(jxm.A03.invoke()))), num, new QJ0(stringExtra12, stringExtra3, stringExtra14, stringExtra13), stringExtra10, 3));
                if (C18U.A06(c06090Tz2, jxm.A00, 36323371646004419L)) {
                    C72Z.A01(new C50627MWo(list2, jxm.A01, 31));
                }
            }
        }
        if (!C18U.A06(C06090Tz.A05, abstractC12990ll, 36318183325440000L)) {
            return;
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("notification_id", stringExtra12);
        A1G.put("notification_type", stringExtra13);
        C55772hI.A00(abstractC12990ll).A0M.putAll(A1G);
    }
}
