package X;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.92I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C92I {
    public static final C92I A01 = new Object();
    public static final C92K A00 = new C92K(new InterfaceC11380iw() { // from class: X.92J
        public static final String __redex_internal_original_name = "NotificationChannelsHelper$logger$1";

        @Override // X.InterfaceC11380iw
        public final String getModuleName() {
            return "NotificationChannelsHelper";
        }
    });

    public static final void A05(NotificationManager notificationManager, Context context, boolean z) {
        C14360o3.A0B(notificationManager, 1);
        if (z && AbstractC14490oL.A0C(context)) {
            String string = context.getString(2131968838);
            C14360o3.A07(string);
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("IG", string));
        }
        AbstractC47112Ed.A01(notificationManager, null, EnumC47122Ee.A0P, "IG", context.getResources().getString(2131968830), 2, 0, 1, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A09(android.content.Context r36, X.AbstractC12990ll r37) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92I.A09(android.content.Context, X.0ll):void");
    }

    public static final void A0A(Context context, AbstractC12990ll abstractC12990ll, Map map) {
        Integer num;
        C14360o3.A0B(context, 0);
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 2342162446669716914L) && !(abstractC12990ll instanceof UserSession)) {
            return;
        }
        C92L c92l = C92L.A01;
        if (c92l == null) {
            c92l = new C92L(context);
            C92L.A01 = c92l;
        }
        boolean A012 = AbstractC14480oK.A01(context);
        C92K c92k = A00;
        if (A012) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        c92k.A00(abstractC12990ll, num, map);
        c92l.A01(A012);
    }

    public static final void A0B(Context context, AbstractC12990ll abstractC12990ll, boolean z) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(abstractC12990ll, 1);
        if (z) {
            A0A(context, abstractC12990ll, null);
        }
        Object systemService = context.getSystemService("notification");
        C14360o3.A0C(systemService, MSV.A00(15));
        A01.A04((NotificationManager) systemService, context, abstractC12990ll);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if ((r8 instanceof com.instagram.common.session.UserSession) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0C(android.content.Context r7, X.AbstractC12990ll r8) {
        /*
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            r1 = 1
            X.C14360o3.A0B(r8, r1)
            X.92L r0 = X.C92L.A01
            if (r0 != 0) goto L13
            X.92L r0 = new X.92L
            r0.<init>(r7)
            X.C92L.A01 = r0
        L13:
            boolean r4 = X.AbstractC14480oK.A01(r7)
            X.0xq r7 = r0.A00
            java.lang.String r0 = "NOTIFICATIONS_ARE_ENABLED"
            boolean r3 = r7.getBoolean(r0, r1)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "LAST_FULL_LOGGING_TS_FOR_"
            java.lang.String r0 = r8.getToken()
            java.lang.String r2 = X.AnonymousClass001.A0R(r1, r0)
            r0 = 0
            long r0 = r7.getLong(r2, r0)
            long r5 = r5 - r0
            long r1 = X.C92L.A02
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3f
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession
            r1 = 1
            if (r0 != 0) goto L40
        L3f:
            r1 = 0
        L40:
            r0 = 1
            if (r4 != r3) goto L46
            if (r1 != 0) goto L46
            r0 = 0
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92I.A0C(android.content.Context, X.0ll):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC47122Ee A00(android.content.Context r3, X.EnumC47122Ee r4, X.AbstractC12990ll r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92I.A00(android.content.Context, X.2Ee, X.0ll, java.lang.String, java.lang.String, java.lang.String):X.2Ee");
    }

    private final EnumC47122Ee A01(Context context, AbstractC12990ll abstractC12990ll) {
        try {
            if (context == null) {
                return EnumC47122Ee.A0K;
            }
            if (abstractC12990ll == null) {
                return EnumC47122Ee.A0K;
            }
            boolean A002 = C92M.A00(context, abstractC12990ll);
            EnumC47122Ee enumC47122Ee = EnumC47122Ee.A0D;
            C14360o3.A0B(enumC47122Ee, 1);
            boolean z = true;
            if (AbstractC47112Ed.A00(context, enumC47122Ee, false) != true) {
                z = false;
            }
            if (A002 != z) {
                Object systemService = context.getSystemService("notification");
                C14360o3.A0C(systemService, MSV.A00(15));
                A06((NotificationManager) systemService, context, A002);
            }
            if (!A002) {
                return EnumC47122Ee.A0K;
            }
            return enumC47122Ee;
        } catch (Exception unused) {
            return EnumC47122Ee.A0K;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x042a, code lost:
    
        if (r6.equals("threads_app_daily_digest") != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0476, code lost:
    
        return X.EnumC47122Ee.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x045b, code lost:
    
        if (r6.equals(r0) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0443, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36329010938003410L) != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0477, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03d5, code lost:
    
        if (r6.equals(r0) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0467, code lost:
    
        r0 = X.C06090Tz.A05;
        r2 = 36323272861822083L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0472, code lost:
    
        if (X.C18U.A06(r0, r5, r2) != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0465, code lost:
    
        if (r6.equals("contact_friend") != false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0404, code lost:
    
        if (r6.equals(r0) != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0414, code lost:
    
        r0 = X.C06090Tz.A05;
        r2 = 36323272861756546L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0412, code lost:
    
        if (r6.equals(X.AbstractC111324zv.A00(4604)) != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03ba, code lost:
    
        if (r6.equals(r0) == false) goto L19;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0029. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x030e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC47122Ee A02(android.content.Context r4, X.AbstractC12990ll r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 1822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92I.A02(android.content.Context, X.0ll, java.lang.String):X.2Ee");
    }

    public static final EnumC47122Ee A03(Context context, UserSession userSession, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1660159711:
                    if (str.equals("tagged_in_bio")) {
                        return EnumC47122Ee.A0L;
                    }
                    break;
                case -1618365534:
                    if (str.equals("video_call")) {
                        return EnumC47122Ee.A0A;
                    }
                    break;
                case -1534353675:
                    if (str.equals("view_count")) {
                        return EnumC47122Ee.A0b;
                    }
                    break;
                case -1461524499:
                    if (str.equals("notification_reminders")) {
                        return EnumC47122Ee.A0S;
                    }
                    break;
                case -1372693202:
                    if (str.equals("live_broadcast")) {
                        return A01.A01(context, userSession);
                    }
                    break;
                case -1307214883:
                    if (str.equals(AbstractC111324zv.A00(1123))) {
                        return EnumC47122Ee.A0M;
                    }
                    break;
                case -1112862244:
                    if (str.equals("comment_likes")) {
                        return EnumC47122Ee.A07;
                    }
                    break;
                case -602415628:
                    if (str.equals("comments")) {
                        return EnumC47122Ee.A05;
                    }
                    break;
                case -562217912:
                    if (str.equals("contact_joined")) {
                        return EnumC47122Ee.A0C;
                    }
                    break;
                case -160912177:
                    if (str.equals("first_post")) {
                        return EnumC47122Ee.A0B;
                    }
                    break;
                case -139282336:
                    if (str.equals("user_tagged")) {
                        return EnumC47122Ee.A0O;
                    }
                    break;
                case 102974396:
                    if (str.equals("likes")) {
                        return EnumC47122Ee.A0I;
                    }
                    break;
                case 106069776:
                    if (str.equals("other")) {
                        return EnumC47122Ee.A0N;
                    }
                    break;
                case 295987376:
                    if (str.equals("report_updated")) {
                        return EnumC47122Ee.A0X;
                    }
                    break;
                case 536242609:
                    if (str.equals(AbstractC111324zv.A00(1166))) {
                        return EnumC47122Ee.A09;
                    }
                    break;
                case 565271564:
                    if (str.equals("announcements")) {
                        return EnumC47122Ee.A0R;
                    }
                    break;
                case 639774245:
                    if (str.equals(AbstractC111324zv.A00(2392))) {
                        return EnumC47122Ee.A03;
                    }
                    break;
                case 718888547:
                    if (str.equals("like_and_comment_on_photo_user_tagged")) {
                        return EnumC47122Ee.A0J;
                    }
                    break;
                case 1134925464:
                    if (str.equals("felix_upload_result")) {
                        return EnumC47122Ee.A0H;
                    }
                    break;
                case 1752343173:
                    if (str.equals(AbstractC111324zv.A00(886))) {
                        return EnumC47122Ee.A08;
                    }
                    break;
            }
        }
        return EnumC47122Ee.A0c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if ((r21 instanceof com.instagram.common.session.UserSession) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0163, code lost:
    
        if (r3.isSampled() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018a, code lost:
    
        if (r1 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(android.app.NotificationManager r19, android.content.Context r20, final X.AbstractC12990ll r21) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92I.A04(android.app.NotificationManager, android.content.Context, X.0ll):void");
    }

    public static final void A06(NotificationManager notificationManager, Context context, boolean z) {
        EnumC47122Ee enumC47122Ee;
        EnumC47122Ee enumC47122Ee2;
        if (z) {
            enumC47122Ee = EnumC47122Ee.A0K;
        } else {
            enumC47122Ee = EnumC47122Ee.A0D;
        }
        AbstractC47112Ed.A02(notificationManager, enumC47122Ee);
        if (z) {
            enumC47122Ee2 = EnumC47122Ee.A0D;
        } else {
            enumC47122Ee2 = EnumC47122Ee.A0K;
        }
        String string = context.getResources().getString(2131968825);
        int i = 3;
        if (z) {
            i = 4;
        }
        AbstractC47112Ed.A01(notificationManager, null, enumC47122Ee2, "IG", string, i, 0, 1, false, true);
    }

    public static final void A07(Context context) {
        Intent intent = new Intent(AbstractC58317Pt9.A00(680));
        intent.putExtra(AbstractC58317Pt9.A00(225), context.getPackageName());
        AbstractC07840b2.A03(context, intent);
    }

    public static final void A08(Context context, EnumC47122Ee enumC47122Ee) {
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra(AbstractC58317Pt9.A00(225), context.getPackageName());
        intent.putExtra("android.provider.extra.CHANNEL_ID", enumC47122Ee);
        AbstractC07840b2.A03(context, intent);
    }
}
