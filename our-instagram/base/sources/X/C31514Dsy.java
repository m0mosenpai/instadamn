package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Dsy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31514Dsy {
    public static long A00;
    public static long A01;
    public static String A02;
    public static String A03;
    public static boolean A04;
    public static final C0JO A05;
    public static final String A06;

    public static final HashMap A02(EnumC31512Dsw enumC31512Dsw, AbstractC12990ll abstractC12990ll, Boolean bool, Long l, Long l2, long j, boolean z) {
        String str;
        C14360o3.A0B(abstractC12990ll, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "switcher_button_tapped");
        String A0j = AbstractC167017dG.A0j();
        double A002 = AbstractC31171DnF.A00();
        HashMap A1G = AbstractC166987dD.A1G();
        EnumC222416a A012 = AbstractC08690cX.A01(abstractC12990ll);
        String[] A08 = A08(enumC31512Dsw);
        String str2 = A08[0];
        String str3 = A08[1];
        String valueOf = String.valueOf(A002);
        if (valueOf != null) {
            A1G.put(TraceFieldType.StartTime, valueOf);
        }
        A1G.put("event_session_id", A0j);
        A1G.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC31512Dsw.A00);
        if (A0f.isSampled()) {
            A0f.A7v("is_badge_shown", Boolean.valueOf(z));
            A0f.A9K("badge_count", Long.valueOf(j));
            A0f.A9K("raw_initiator_account_id", l);
            A0f.A9K("initiator_identity_id", l2);
            A0f.A8R(EnumC31511Dsv.INSTAGRAM, "initiator_account_type");
            A0f.A7v("is_cds", bool);
            A0f.A8R(enumC31512Dsw, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            AbstractC31176DnK.A1J(A0f, A002);
            A0f.AAP("event_session_id", A0j);
            AbstractC31171DnF.A1A(A0f, "switcher");
            if (EnumC222416a.A08 == A012) {
                str = null;
            } else {
                int ordinal = A012.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        str = "IG_PERSONAL";
                    } else {
                        str = "IG_CREATOR";
                    }
                } else {
                    str = "IG_BUSINESS";
                }
            }
            A0f.AAP("initiator_identity_type", str);
            A0f.AAP("tooltip_type", str2);
            A0f.A7v("is_tooltip_shown", Boolean.valueOf(Boolean.parseBoolean(str3)));
            A0f.Cht();
        }
        return A1G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e7, code lost:
    
        if (r0 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.AbstractC12990ll r11, java.lang.Long r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, double r21, boolean r23, boolean r24, boolean r25) {
        /*
            r3 = 0
            X.AbstractC25229BEm.A1I(r11, r3, r15)
            X.0wW r1 = X.AbstractC12220kQ.A02(r11)
            java.lang.String r0 = "switched_success"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            r0 = 379(0x17b, float:5.31E-43)
            X.1Mh r2 = X.AbstractC31171DnF.A0A(r1, r0)
            X.Dsw r4 = A00(r16)
            java.lang.String[] r1 = A08(r4)
            r3 = r1[r3]
            r0 = 1
            r10 = r1[r0]
            X.AbstractC08690cX.A01(r11)
            boolean r0 = X.AbstractC25226BEj.A1Z(r2)
            if (r0 == 0) goto Lc4
            java.lang.String r0 = "raw_target_account_id"
            r2.A0Q(r0, r12)
            java.lang.String r0 = "target_identity_id"
            r2.A0Q(r0, r13)
            r9 = 0
            if (r20 == 0) goto Lea
            X.Dsv r1 = A01(r20)
        L3b:
            java.lang.String r0 = "target_account_type"
            r2.A0M(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.A0M(r4, r0)
            java.lang.Double r1 = java.lang.Double.valueOf(r21)
            java.lang.String r0 = "start_time"
            r2.A0P(r0, r1)
            java.lang.String r0 = "xapp_session_id"
            r1 = r19
            r2.A0R(r0, r1)
            java.lang.String r0 = "event_session_id"
            r2.A0R(r0, r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r23)
            java.lang.String r0 = "is_logged_in"
            r2.A0O(r0, r1)
            java.lang.String r0 = "switch_type"
            r2.A0R(r0, r14)
            r11 = r18
            if (r18 == 0) goto L82
            int r0 = r11.hashCode()
            java.lang.String r9 = "app_store"
            java.lang.String r8 = "a2w_success"
            java.lang.String r7 = "logged_out"
            java.lang.String r6 = "preload"
            java.lang.String r5 = "a2w_failed_route_to_appstore"
            java.lang.String r4 = "inactive_session"
            java.lang.String r1 = "active_session"
            switch(r0) {
                case -1663636798: goto Lca;
                case -785521755: goto Ld0;
                case -318476791: goto Ld6;
                case 518669073: goto Ldc;
                case 705975146: goto Le2;
                case 1842542915: goto Lc5;
                default: goto L81;
            }
        L81:
            r9 = r1
        L82:
            java.lang.String r0 = "landing_point"
            r2.A0R(r0, r9)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r24)
            java.lang.String r0 = "is_cds"
            r2.A0O(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            java.lang.String r0 = "is_sso_enabled"
            r2.A0O(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_tooltip_shown"
            r2.A0O(r0, r1)
            java.lang.String r0 = "tooltip_type"
            r2.A0R(r0, r3)
            X.Dsv r1 = A01(r17)
            java.lang.String r0 = "initiator_account_type"
            r2.A0M(r1, r0)
            double r0 = X.AbstractC31171DnF.A01()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "end_time"
            r2.A0P(r0, r1)
            r2.Cht()
        Lc4:
            return
        Lc5:
            boolean r0 = r11.equals(r9)
            goto Le7
        Lca:
            boolean r0 = r11.equals(r4)
            r9 = r4
            goto Le7
        Ld0:
            boolean r0 = r11.equals(r5)
            r9 = r5
            goto Le7
        Ld6:
            boolean r0 = r11.equals(r6)
            r9 = r6
            goto Le7
        Ldc:
            boolean r0 = r11.equals(r7)
            r9 = r7
            goto Le7
        Le2:
            boolean r0 = r11.equals(r8)
            r9 = r8
        Le7:
            if (r0 != 0) goto L82
            goto L81
        Lea:
            r1 = r9
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31514Dsy.A03(X.0ll, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, boolean, boolean):void");
    }

    public static final void A06(UserSession userSession) {
        Iterator it = C0BQ.A00(userSession).BOf(AbstractC166987dD.A10(userSession)).iterator();
        while (it.hasNext()) {
            int A022 = AbstractC25226BEj.A15(it).A02();
            if (A022 > 0) {
                AbstractC31173DnH.A0b(userSession).A00.AHj();
                C54432ex c54432ex = new C54432ex(EnumC54222eY.A06, null, A022, A022);
                C54392et A0b = AbstractC31173DnH.A0b(userSession);
                EnumC58162lY enumC58162lY = EnumC58162lY.A09;
                EnumC58122lU enumC58122lU = EnumC58122lU.A05;
                A0b.A03(enumC58122lU, enumC58162lY, c54432ex, C05F.A0C);
                C54412ev A0c = AbstractC31174DnI.A0c(userSession);
                C54432ex c54432ex2 = new C54432ex(EnumC54222eY.A0p, null, A022, A022);
                EnumC58162lY enumC58162lY2 = EnumC58162lY.A07;
                C14360o3.A0B(enumC58162lY2, 0);
                A0c.A02(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), c54432ex2);
            }
        }
    }

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        A05 = awakeTimeSinceBootClock;
        A06 = AbstractC31174DnI.A0s();
        A03 = "";
        A02 = "";
    }

    public static final EnumC31512Dsw A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -976711082:
                    if (str.equals("tab_bar_long_press")) {
                        return EnumC31512Dsw.A0D;
                    }
                    break;
                case -713987006:
                    if (str.equals("profile_title")) {
                        return EnumC31512Dsw.A09;
                    }
                    break;
                case -416741326:
                    if (str.equals("mini_switcher_select")) {
                        return EnumC31512Dsw.A06;
                    }
                    break;
                case -138683230:
                    if (str.equals("snack_bar")) {
                        return EnumC31512Dsw.A0B;
                    }
                    break;
                case 129084363:
                    if (str.equals("tab_bar_double_tap")) {
                        return EnumC31512Dsw.A0C;
                    }
                    break;
                case 359330359:
                    if (str.equals("new_account_created")) {
                        return EnumC31512Dsw.A07;
                    }
                    break;
                case 441111834:
                    if (str.equals("unknown_nt_action")) {
                        return EnumC31512Dsw.A0F;
                    }
                    break;
                case 660917936:
                    if (str.equals("direct_inbox")) {
                        return EnumC31512Dsw.A04;
                    }
                    break;
                case 1414199215:
                    if (str.equals("horizontal_switch")) {
                        return EnumC31512Dsw.A05;
                    }
                    break;
                case 2005378358:
                    if (str.equals("bookmark")) {
                        return EnumC31512Dsw.A03;
                    }
                    break;
            }
        }
        return EnumC31512Dsw.A0E;
    }

    public static final EnumC31511Dsv A01(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1984105012) {
                if (hashCode == 328036763 && str.equals(AbstractC111324zv.A00(1503))) {
                    return EnumC31511Dsv.THREADS;
                }
            } else if (str.equals("FB_ANDROID")) {
                return EnumC31511Dsv.FACEBOOK;
            }
        }
        return EnumC31511Dsv.INSTAGRAM;
    }

    public static final synchronized void A05(AbstractC12990ll abstractC12990ll, String str, String str2) {
        synchronized (C31514Dsy.class) {
            C14360o3.A0B(abstractC12990ll, 0);
            boolean A1V = AbstractC167007dF.A1V(str2);
            if (A04) {
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                c006802i.markerStart(857811724);
                c006802i.markerAnnotate(857811724, AbstractC111324zv.A00(154), "PREVIOUS_TIMESTAMP_FOUND");
                c006802i.markerEnd(857811724, (short) 3, A05.now(), TimeUnit.MILLISECONDS);
            }
            A04 = A1V;
            A01 = A05.now();
            A02 = str2;
            A03 = str;
        }
    }

    public static final String[] A08(EnumC31512Dsw enumC31512Dsw) {
        String str;
        boolean z;
        if (EnumC31512Dsw.A0D == enumC31512Dsw) {
            z = AbstractC167007dF.A1O(AbstractC31174DnI.A0f().getInt("long_press_account_switcher_row_to_create_shortcut_tooltip_impressions", 0));
            str = "long_press_tooltip";
        } else {
            str = "";
            z = false;
        }
        if (EnumC31512Dsw.A0C == enumC31512Dsw) {
            z = AbstractC167007dF.A1O(AbstractC31174DnI.A0f().getInt("preference_double_tap_profile_tab_tooltip_impressions", 0));
            str = "double_tap_tooltip";
        }
        return new String[]{str, String.valueOf(z)};
    }

    public static final void A04(AbstractC12990ll abstractC12990ll, String str, String str2) {
        AbstractC167017dG.A1N(abstractC12990ll, str);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerStart(857814227);
        c006802i.markerAnnotate(857814227, AbstractC31187DnW.A02(0, 9, 125), A06);
        c006802i.markerAnnotate(857814227, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        if (!"".equals(str2)) {
            c006802i.markerAnnotate(857814227, "native_or_bloks", str2);
        }
    }

    public static final void A07(UserSession userSession, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "switcher_tooltip_impression");
        if (A0f.isSampled()) {
            A0f.AAP("tooltip_type", str);
            A0f.Cht();
        }
    }
}
