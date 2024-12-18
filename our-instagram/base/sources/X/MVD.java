package X;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes9.dex */
public final class MVD {
    public static final MVD A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        if (r7.A07 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        if (r1 != 1) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.Q0Z A01(android.content.Context r6, X.L59 r7) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVD.A01(android.content.Context, X.L59):X.Q0Z");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00eb, code lost:
    
        if (r12.A07 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
    
        if (r0 != 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018b, code lost:
    
        if (r12.A07 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017e, code lost:
    
        if (r12.A07 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ac, code lost:
    
        if (r0 != 1) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.content.Context r10, com.instagram.common.session.UserSession r11, X.L59 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MVD.A02(android.content.Context, com.instagram.common.session.UserSession, X.L59, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.MVD] */
    static {
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        Object systemService = context.getSystemService("notification");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (AbstractC14490oL.A0C(context)) {
            C92I.A05(notificationManager, context, true);
        } else {
            C14360o3.A0B(notificationManager, 1);
            AbstractC47112Ed.A01(notificationManager, null, EnumC47122Ee.A0P, null, context.getResources().getString(2131968830), 2, 0, 1, false, false);
        }
    }

    public static final PendingIntent A00(Context context) {
        Intent A04;
        C04750Mt c04750Mt = new C04750Mt();
        if (AbstractC14490oL.A0C(AbstractC12290kX.A00)) {
            C14H A002 = C14H.A03.A00();
            Context context2 = AbstractC12290kX.A00;
            C14360o3.A07(context2);
            A04 = A002.A03(context2, 67108864);
        } else {
            A04 = AbstractC31171DnF.A04();
            A04.setComponent(new ComponentName(AbstractC12290kX.A00.getPackageName(), "com.instagram.barcelona.mainactivity.BarcelonaActivity"));
            A04.setFlags(67108864);
        }
        c04750Mt.A0A(A04);
        return c04750Mt.A01(context, 64278, 134217728);
    }
}
