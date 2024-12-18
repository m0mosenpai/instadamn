package X;

import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Wr, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Wr {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;

    public C1Wr(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, InterfaceC16660sJ interfaceC16660sJ5) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        C14360o3.A0B(interfaceC16660sJ2, 2);
        C14360o3.A0B(interfaceC16660sJ3, 3);
        C14360o3.A0B(interfaceC16660sJ4, 4);
        C14360o3.A0B(interfaceC16660sJ5, 5);
        this.A02 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
        this.A00 = interfaceC16660sJ3;
        this.A04 = interfaceC16660sJ4;
        this.A01 = interfaceC16660sJ5;
    }

    public final void A01(C116155Nu c116155Nu, C116155Nu c116155Nu2, AbstractC12990ll abstractC12990ll) {
        String str;
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(c116155Nu2, 2);
        MRU A00 = JQX.A00(c116155Nu2.A0j);
        Long l = c116155Nu2.A0K;
        C14360o3.A07(l);
        A00.DW9(l.longValue(), C05F.A00);
        C19280xC A01 = JQW.A01(c116155Nu2, "notification_revoked", null);
        A01.A0C("revoke_push_pi", c116155Nu.A12);
        C43606JQm A012 = JQO.A0R.A01(c116155Nu2);
        A00(A01, A012, c116155Nu);
        ((InterfaceC11360iu) this.A02.invoke(abstractC12990ll)).EHW(A01);
        JQU jqu = (JQU) this.A03.invoke(abstractC12990ll);
        A012.A0K = c116155Nu.A12;
        A012.A00 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - c116155Nu2.A03);
        JQO jqo = new JQO(A012);
        if (JQV.A00().booleanValue()) {
            C18920wW c18920wW = jqu.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_notification_revoked");
            if (A002.isSampled()) {
                A002.AAQ(JQU.A01(jqo), "notif_logging_data");
                A002.AAP("landing_path", jqo.A0E);
                A002.AAP("push_type", JQU.A05(jqo));
                A002.AAP("revoke_push_pi", jqo.A0K);
                A002.A8R(jqo.A05, "revoke_reason");
                A002.A9K("message_revoke_timestamp", jqo.A08);
                if (C218914p.A08()) {
                    str = AppStateModule.APP_STATE_BACKGROUND;
                } else {
                    str = "foreground";
                }
                A002.AAP("app_state", str);
                A002.AAP("app_startup_type", JQU.A02());
                A002.AAP("render_target", JQU.A06(jqo));
                A002.A9K("time_in_push_tray_seconds", Long.valueOf(jqo.A04));
                A002.AAP("platform", JQU.A04(jqo));
                A002.AAQ(JQU.A00(jqo), "messaging_data");
                A002.AAk("push_token_fbid", JQU.A07(jqo));
                A002.AAP("push_infra_notif_id", jqo.A0J);
                A002.Cht();
            }
        }
        AbstractC44086JeB.A02(c116155Nu, abstractC12990ll, null, null, 2);
    }

    public final void A02(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll) {
        String str;
        C14360o3.A0B(abstractC12990ll, 0);
        JQU jqu = (JQU) this.A03.invoke(abstractC12990ll);
        JQO jqo = new JQO(JQO.A0R.A01(c116155Nu));
        if (JQV.A00().booleanValue()) {
            C18920wW c18920wW = jqu.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_notification_force_removed");
            if (A00.isSampled()) {
                A00.AAQ(JQU.A01(jqo), "notif_logging_data");
                A00.AAP("landing_path", jqo.A0E);
                A00.AAP("push_type", JQU.A05(jqo));
                if (C218914p.A08()) {
                    str = AppStateModule.APP_STATE_BACKGROUND;
                } else {
                    str = "foreground";
                }
                A00.AAP("app_state", str);
                A00.AAP("app_startup_type", JQU.A02());
                A00.AAP("render_target", JQU.A06(jqo));
                A00.AAP("platform", JQU.A04(jqo));
                A00.AAQ(JQU.A00(jqo), "messaging_data");
                A00.AAk("push_token_fbid", JQU.A07(jqo));
                A00.AAP("push_infra_notif_id", jqo.A0J);
                A00.Cht();
            }
        }
    }

    public final void A03(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 2342170010107001078L)) {
            ((InterfaceC11360iu) this.A02.invoke(abstractC12990ll)).EHW(JQW.A01(c116155Nu, "notification_enqueued_for_display", null));
            AbstractC44086JeB.A02(c116155Nu, abstractC12990ll, null, null, 16);
            MRU A00 = JQX.A00(c116155Nu.A0j);
            Long l = c116155Nu.A0K;
            C14360o3.A07(l);
            A00.Cn5("enqueue_for_display", l.longValue());
        }
    }

    public final void A04(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        MRU A00 = JQX.A00(c116155Nu.A0j);
        Long l = c116155Nu.A0K;
        C14360o3.A07(l);
        A00.DWA(C05F.A00, "notification not in tray", 1017, l.longValue());
        C19280xC A01 = JQW.A01(c116155Nu, "notification_suppressed", null);
        A01.A0C("reason", "notification not in tray");
        ((InterfaceC11360iu) this.A02.invoke(abstractC12990ll)).EHW(A01);
        ((JQU) this.A03.invoke(abstractC12990ll)).A08(new JQO(JQO.A0R.A01(c116155Nu)), "notification not in tray");
        C60H.A02.A00(abstractC12990ll, c116155Nu.A0j, new C207169Ev(19, c116155Nu, this));
        AbstractC44086JeB.A02(c116155Nu, abstractC12990ll, "notification not in tray", null, 3);
    }

    public final void A05(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll) {
        UserSession userSession;
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(c116155Nu, 1);
        if (abstractC12990ll instanceof UserSession) {
            userSession = (UserSession) abstractC12990ll;
        } else {
            userSession = null;
        }
        C60I c60i = C60H.A02;
        c60i.A00(abstractC12990ll, c116155Nu.A0j, new C207169Ev(20, c116155Nu, this));
        if (userSession != null) {
            if (C1C0.A00(userSession)) {
                AnonymousClass274.A00((AnonymousClass274) this.A04.invoke(userSession), "NOTIFICATION_DISPLAYED", c116155Nu.A0g, null);
            }
            c60i.A00(abstractC12990ll, c116155Nu.A0j, new C207169Ev(21, c116155Nu, this));
        }
        MRU A00 = JQX.A00(c116155Nu.A0j);
        Long l = c116155Nu.A0K;
        C14360o3.A07(l);
        A00.Cn5("will_display", l.longValue());
    }

    public final void A06(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, int i) {
        String str;
        String str2;
        C14360o3.A0B(abstractC12990ll, 0);
        MRU A00 = JQX.A00(c116155Nu.A0j);
        Long l = c116155Nu.A0K;
        C14360o3.A07(l);
        A00.DW9(l.longValue(), C05F.A00);
        boolean z = abstractC12990ll instanceof UserSession;
        if (i > 0) {
            str = "notification_revoke_success";
        } else {
            str = "notification_revoke_miss";
        }
        C19280xC A01 = JQW.A01(c116155Nu, str, null);
        C43606JQm A012 = JQO.A0R.A01(c116155Nu);
        A00(A01, A012, c116155Nu);
        InterfaceC11360iu interfaceC11360iu = (InterfaceC11360iu) this.A02.invoke(abstractC12990ll);
        A01.A08(Integer.valueOf(i), "revoked_count");
        interfaceC11360iu.EHW(A01);
        JQU jqu = (JQU) this.A03.invoke(abstractC12990ll);
        A012.A0K = c116155Nu.A16;
        JQO jqo = new JQO(A012);
        if (JQV.A00().booleanValue()) {
            C18920wW c18920wW = jqu.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_notification_revoked_result");
            if (A002.isSampled()) {
                A002.AAQ(JQU.A01(jqo), "notif_logging_data");
                A002.AAP("landing_path", jqo.A0E);
                A002.AAP("push_type", JQU.A05(jqo));
                A002.A9K("revoked_count", Long.valueOf(i));
                A002.A8R(jqo.A05, "revoke_reason");
                A002.A9K("message_revoke_timestamp", jqo.A08);
                if (C218914p.A08()) {
                    str2 = AppStateModule.APP_STATE_BACKGROUND;
                } else {
                    str2 = "foreground";
                }
                A002.AAP("app_state", str2);
                A002.AAP("app_startup_type", JQU.A02());
                A002.AAP("render_target", JQU.A06(jqo));
                A002.AAP("platform", JQU.A04(jqo));
                A002.AAQ(JQU.A00(jqo), "messaging_data");
                A002.AAk("push_token_fbid", JQU.A07(jqo));
                A002.AAP("push_infra_notif_id", jqo.A0J);
                A002.Cht();
            }
        }
        C60H.A02.A00(abstractC12990ll, c116155Nu.A0j, new C9FN(15, c116155Nu, this, A01));
        if (z) {
            ((C132515ya) this.A01.invoke(abstractC12990ll)).A06(c116155Nu.A0z, c116155Nu.A0v, "REVOKE", C60J.A01(c116155Nu.A0g), false, c116155Nu.A1S);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C19280xC r4, X.C43606JQm r5, X.C116155Nu r6) {
        /*
            X.Jxr r3 = r6.A05
            if (r3 == 0) goto L2e
            java.lang.Object r0 = r3.A05
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            r0 = 1
            java.lang.String r1 = "reason"
            if (r2 == r0) goto L2f
            r0 = 0
            if (r2 != r0) goto L20
            X.Ke6 r0 = X.EnumC46274Ke6.UNSEND
        L17:
            r5.A01 = r0
            java.lang.String r0 = r0.toString()
            r4.A0C(r1, r0)
        L20:
            java.lang.Object r1 = r3.A01
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L2e
            r5.A05 = r1
            java.lang.String r0 = "message_revoke_timestamp"
            r4.A0B(r0, r1)
        L2e:
            return
        L2f:
            X.Ke6 r0 = X.EnumC46274Ke6.EXPIRED
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Wr.A00(X.0xC, X.JQm, X.5Nu):void");
    }

    public final void A07(C116155Nu c116155Nu, UserSession userSession) {
        String str;
        JQU jqu = (JQU) this.A03.invoke(userSession);
        JQO jqo = new JQO(JQO.A0R.A01(c116155Nu));
        if (JQV.A00().booleanValue()) {
            C18920wW c18920wW = jqu.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_notification_expired");
            if (A00.isSampled()) {
                A00.AAQ(JQU.A01(jqo), "notif_logging_data");
                A00.AAP("landing_path", jqo.A0E);
                A00.AAP("push_type", JQU.A05(jqo));
                if (C218914p.A08()) {
                    str = AppStateModule.APP_STATE_BACKGROUND;
                } else {
                    str = "foreground";
                }
                A00.AAP("app_state", str);
                A00.AAP("app_startup_type", JQU.A02());
                A00.AAP("render_target", JQU.A06(jqo));
                A00.AAP("platform", JQU.A04(jqo));
                A00.AAQ(JQU.A00(jqo), "messaging_data");
                A00.AAk("push_token_fbid", JQU.A07(jqo));
                A00.AAP("push_infra_notif_id", jqo.A0J);
                A00.Cht();
            }
        }
    }
}
