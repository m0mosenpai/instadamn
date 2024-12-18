package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppReminder;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.user.model.User;
import com.instagram.wellbeing.timespent.activity.TimeSpentDashboardActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: X.27l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C455127l implements InterfaceC13000lm, InterfaceC13060ls {
    public Dialog A01;
    public UserSession A02;
    public EnumC456327x A03;
    public TimeInAppReminder A0C;
    public C2AP A0D;
    public final InterfaceC42271xH A0F;
    public final InterfaceC41501vz A0G;
    public final boolean A0I;
    public long A06 = 0;
    public long A0B = 0;
    public long A0A = 0;
    public long A08 = 0;
    public long A09 = 0;
    public long A07 = 0;
    public int A00 = 0;
    public boolean A05 = false;
    public boolean A04 = false;
    public final Handler A0E = new Handler(Looper.getMainLooper());
    public final Runnable A0H = new Runnable() { // from class: X.27q
        @Override // java.lang.Runnable
        public final void run() {
            C455127l c455127l = C455127l.this;
            if (C455127l.A0N("time_spent_fully_blocking_screen", "com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment") || C455127l.A0N("extension_request_fragment", "extension_request_fragment")) {
                if (C455127l.A0M(c455127l)) {
                    C461529z.A05();
                    c455127l.A0T();
                    c455127l.A0R();
                    c455127l.A03 = null;
                    UserSession userSession = c455127l.A02;
                    if (new C29W(userSession).A04() || AnonymousClass292.A02(userSession) != null) {
                        c455127l.A05 = true;
                    }
                    c455127l.A0X(false);
                    return;
                }
                Handler handler = c455127l.A0E;
                Runnable runnable = c455127l.A0H;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, C455127l.A04(c455127l).longValue());
            }
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C(X.EnumC456327x r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455127l.A0C(X.27x):void");
    }

    public static synchronized void A0J(C455127l c455127l) {
        synchronized (c455127l) {
            long currentTimeMillis = System.currentTimeMillis();
            c455127l.A06 = currentTimeMillis;
            UserSession userSession = c455127l.A02;
            C14360o3.A0B(userSession, 0);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A01(c06090Tz, userSession, 36595187241912399L) > 0 || C18U.A01(c06090Tz, userSession, 36595187241977936L) > 0) {
                long j = c455127l.A0B;
                long j2 = 0;
                if (j > 0) {
                    long j3 = c455127l.A0A;
                    if (j3 > 0) {
                        long j4 = (currentTimeMillis - j3) / 1000;
                        long j5 = j3 - j;
                        if (j4 > C18U.A01(c06090Tz, userSession, 36595187241912399L)) {
                            c455127l.A08 = 0L;
                        } else {
                            c455127l.A08 += j5 / 1000;
                        }
                        if (j4 <= C18U.A01(c06090Tz, userSession, 36595187241977936L)) {
                            j2 = c455127l.A09 + (j5 / 1000);
                        }
                        c455127l.A09 = j2;
                    }
                }
            }
            c455127l.A0B = System.currentTimeMillis();
        }
    }

    public static boolean A0N(String str, String str2) {
        String str3;
        FragmentActivity fragmentActivity = null;
        try {
            fragmentActivity = C2OG.A01().A06();
        } catch (ClassCastException | IndexOutOfBoundsException unused) {
        }
        if (fragmentActivity == null) {
            Object A00 = AbstractC54852fj.A00();
            if (!(A00 instanceof FragmentActivity)) {
                return false;
            }
            fragmentActivity = (FragmentActivity) A00;
        }
        AbstractC10360h2 abstractC10360h2 = fragmentActivity.mFragments.A00.A03;
        if (abstractC10360h2 == null) {
            return false;
        }
        Fragment A0Q = abstractC10360h2.A0Q(str);
        if (A0Q == null) {
            for (Fragment fragment : abstractC10360h2.A0U.A04()) {
                if (fragment.isVisible() && (str3 = fragment.mTag) != null && str3.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
            return false;
        }
        return A0Q.isVisible();
    }

    public final void A0S() {
        A0X(false);
    }

    public final synchronized void A0V() {
        TimeInAppReminder timeInAppReminder = this.A0C;
        if (timeInAppReminder != null) {
            C2A1.A01.A02(timeInAppReminder, 0);
        }
        UserSession userSession = this.A02;
        AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
        C14360o3.A0B(userSession, 0);
        InterfaceC19610xo ARD = anonymousClass282.A06(userSession).ARD();
        ARD.E7K("TAB_REMINDER_TYPE", "");
        ARD.apply();
    }

    public final synchronized void A0X(final boolean z) {
        final EnumC456327x enumC456327x;
        UserSession userSession;
        long A0P;
        HashMap A05;
        EnumC456327x enumC456327x2 = null;
        Integer num = C05F.A0Z;
        try {
            Map.Entry entry = null;
            for (Map.Entry entry2 : A0Q().entrySet()) {
                if (entry == null || ((Long) entry2.getValue()).longValue() < ((Long) entry.getValue()).longValue()) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                if (this.A0C != null) {
                    num = C05F.A0X;
                } else {
                    num = C05F.A0a;
                }
                A0V();
                userSession = this.A02;
                A0P = A0P();
                A05 = A05(this);
            } else {
                Object key = entry.getKey();
                Object value = entry.getValue();
                enumC456327x = ((InterfaceC456127v) key).CBj();
                final RunnableC206109Ar runnableC206109Ar = new RunnableC206109Ar(enumC456327x, this);
                try {
                    this.A0C = new TimeInAppReminder() { // from class: X.9As
                        @Override // com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppReminder
                        public final void remind() {
                            C455127l c455127l = this;
                            EnumC456327x enumC456327x3 = enumC456327x;
                            boolean z2 = z;
                            RunnableC206109Ar runnableC206109Ar2 = runnableC206109Ar;
                            Integer num2 = C05F.A0W;
                            C461329x.A01(c455127l.A02, enumC456327x3, num2, C455127l.A05(c455127l), c455127l.A0P(), z2);
                            runnableC206109Ar2.run();
                        }
                    };
                    long longValue = ((Long) value).longValue();
                    if (longValue == A01()) {
                        num = C05F.A0W;
                        runnableC206109Ar.run();
                    } else {
                        C2A1.A01.A02(this.A0C, (int) longValue);
                        num = C05F.A0G;
                    }
                    userSession = this.A02;
                    String str = enumC456327x.A00;
                    AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
                    C14360o3.A0B(userSession, 0);
                    InterfaceC19610xo ARD = anonymousClass282.A06(userSession).ARD();
                    ARD.E7K("TAB_REMINDER_TYPE", str);
                    ARD.apply();
                    A0P = A0P();
                    A05 = A05(this);
                    enumC456327x2 = enumC456327x;
                } catch (Throwable th) {
                    th = th;
                    EnumC456327x enumC456327x3 = enumC456327x;
                    C461329x.A01(this.A02, enumC456327x3, num, A05(this), A0P(), z);
                    throw th;
                }
            }
            C461329x.A01(userSession, enumC456327x2, num, A05, A0P, z);
        } catch (Throwable th2) {
            th = th2;
            enumC456327x = null;
        }
    }

    @Override // X.InterfaceC13060ls
    public final synchronized void Cww(AbstractC12990ll abstractC12990ll) {
        Object obj;
        Bundle bundle;
        String string;
        EnumC456327x valueOf;
        int ordinal;
        this.A0A = System.currentTimeMillis();
        this.A04 = true;
        A07();
        if (A0N("time_spent_fully_blocking_screen", "com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment")) {
            UserSession userSession = this.A02;
            String A08 = AnonymousClass280.A01.A08(userSession);
            long A0P = A0P();
            C14360o3.A0B(userSession, 0);
            C461329x.A07(userSession, C05F.A00, Long.valueOf(A0P), A08);
        } else {
            Iterator it = C461529z.A01.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Fragment) obj).isVisible()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) obj;
            if (abstractC59962oe != null && (bundle = abstractC59962oe.mArguments) != null && (string = bundle.getString("reminder_type")) != null && ((ordinal = (valueOf = EnumC456327x.valueOf(string)).ordinal()) == 5 || ordinal == 0 || ordinal == 6 || ordinal == 7)) {
                UserSession userSession2 = this.A02;
                String str = valueOf.A00;
                long A0P2 = A0P();
                C14360o3.A0B(userSession2, 0);
                C461329x.A07(userSession2, C05F.A00, Long.valueOf(A0P2), str);
            }
        }
        try {
            UserSession userSession3 = this.A02;
            if (new C71603Jf(userSession3).A01.A1W()) {
                AbstractC206099Aq.A06(userSession3);
            }
            C461329x.A00(userSession3, A0P());
        } catch (Exception e) {
            C0w9.A07("quiet_mode_background_tasks", e);
        }
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        this.A0A = System.currentTimeMillis();
        if (C24231Gs.A00() != null) {
            C24231Gs.A00().A02(this);
        }
        A0V();
        UserSession userSession = this.A02;
        C461329x.A00(userSession, A0P());
        AnonymousClass280.A01.A09(userSession, 0L);
        InterfaceC42271xH interfaceC42271xH = this.A0F;
        InterfaceC41501vz interfaceC41501vz = this.A0G;
        if (userSession != null && AbstractC25651Mw.A00(userSession) != null) {
            C25671My A00 = AbstractC25651Mw.A00(userSession);
            if (interfaceC42271xH != null) {
                A00.A02(interfaceC42271xH, C2AS.class);
            }
            if (interfaceC41501vz != null) {
                A00.A02(interfaceC41501vz, C2AT.class);
            }
        }
        this.A0E.removeCallbacks(this.A0H);
        A07();
    }

    public static int A00(C455127l c455127l) {
        UserSession userSession = c455127l.A02;
        C14360o3.A0B(userSession, 0);
        return Math.max((int) C18U.A01(C06090Tz.A05, userSession, 36595810011711753L), 30);
    }

    public static final long A01() {
        C2A1 c2a1 = C2A1.A01;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (c2a1.A03(calendar.getTimeInMillis() / 1000).length > 0) {
            return r1[r0 - 1];
        }
        return 0L;
    }

    private C35129FeW A02(Context context, FragmentActivity fragmentActivity, EnumC456327x enumC456327x, Boolean bool, Long l, Long l2) {
        String str;
        int i;
        int i2;
        Object[] objArr;
        UserSession userSession = this.A02;
        if (userSession != null) {
            str = userSession.userId;
        } else {
            str = "";
        }
        C34648FOf A00 = C35129FeW.A00(str);
        A00.A0G = "quite_mode_reminder_notification_type";
        A00.A01 = context.getDrawable(R.drawable.moon_with_circle_background_small);
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            i = 2131971392;
        } else {
            i = 2131971393;
            if (this.A0I) {
                i = 2131974151;
            }
        }
        A00.A0H = context.getString(i);
        boolean z = this.A0I;
        if (booleanValue) {
            i2 = 2131971391;
            if (z) {
                i2 = 2131974150;
            }
            long longValue = l.longValue();
            int i3 = (int) longValue;
            if (longValue == i3) {
                String A002 = AbstractC35189Ffh.A00(context, Integer.valueOf(i3));
                boolean A09 = AbstractC14490oL.A09(context);
                int i4 = R.string.res_0x7f130072_name_removed;
                if (A09) {
                    i4 = R.string.res_0x7f130009_name_removed;
                }
                objArr = new Object[]{A002, context.getString(i4)};
            } else {
                throw new ArithmeticException();
            }
        } else {
            i2 = 2131971390;
            if (z) {
                i2 = 2131974149;
            }
            objArr = new Object[]{AbstractC35189Ffh.A02(context.getResources(), l2.longValue())};
        }
        A00.A0E = context.getString(i2, objArr);
        A00.A03 = PushChannelType.A09;
        A00.A08 = new G8Q(fragmentActivity, enumC456327x, this);
        A00.A09 = new C36505G8d(this);
        return new C35129FeW(A00);
    }

    public static C455127l A03(final UserSession userSession) {
        return (C455127l) userSession.A01(C455127l.class, new InterfaceC16820sZ() { // from class: X.27n
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C455127l(UserSession.this);
            }
        });
    }

    private void A07() {
        UserSession userSession = this.A02;
        C71603Jf c71603Jf = new C71603Jf(userSession);
        if (!A0L(this) || (!c71603Jf.A01.A1W() && !AnonymousClass280.A01.A0C(userSession))) {
            C006802i c006802i = this.A0D.A03;
            if (c006802i.isMarkerOn(191636345)) {
                c006802i.markerEnd(191636345, (short) 4);
                return;
            }
            return;
        }
        this.A0D.A00(A0O());
    }

    private void A08() {
        UserSession userSession = this.A02;
        String BLx = C17060sy.A01.A01(userSession).A03.BLx();
        String id = TimeZone.getDefault().getID();
        if (BLx != null && BLx.equalsIgnoreCase(id)) {
            return;
        }
        C54811OKk A00 = AbstractC54293NzD.A00(userSession);
        GRZ grz = new GRZ(this);
        A00.A00.A00(C0eB.A00, grz, new C50537MSq(A00, null, 17));
    }

    public static void A0B(FragmentActivity fragmentActivity, C455127l c455127l) {
        UserSession userSession = c455127l.A02;
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(userSession, 1);
        Intent intent = new Intent(fragmentActivity, (Class<?>) TimeSpentDashboardActivity.class);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        intent.setFlags(268435456);
        C12260kU.A0C(fragmentActivity, intent);
    }

    public static void A0D(EnumC456327x enumC456327x, EnumC33408Epf enumC33408Epf, C455127l c455127l) {
        Context context = AbstractC12290kX.A00;
        Intent intent = new Intent(context, (Class<?>) TransparentModalActivity.class);
        c455127l.A09(intent, enumC456327x, enumC33408Epf);
        C12260kU.A0C(context, intent);
        c455127l.A0C(enumC456327x);
    }

    public static void A0E(final C71583Jd c71583Jd, final C455127l c455127l, final boolean z) {
        try {
            AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.2AQ
                @Override // X.AbstractC18280vF
                public final void loggedRun() {
                    Dialog dialog;
                    C455127l c455127l2 = c455127l;
                    C71583Jd c71583Jd2 = c71583Jd;
                    boolean z2 = z;
                    if (c455127l2.A01 != null) {
                        String upperCase = AnonymousClass280.A01.A08(c455127l2.A02).toUpperCase(Locale.US);
                        if (!upperCase.equalsIgnoreCase("scheduled_break") && !upperCase.equalsIgnoreCase("daily_limit")) {
                            try {
                                if ((!AnonymousClass292.A07(r6, EnumC456327x.valueOf(upperCase))) && (dialog = c455127l2.A01) != null) {
                                    dialog.dismiss();
                                    c455127l2.A01 = null;
                                }
                            } catch (IllegalArgumentException unused) {
                                C0w9.A03("InstagramTimeSpentManager_shouldDismissReminderDialog", AnonymousClass001.A0R("Bad Argument:", upperCase));
                            }
                        } else {
                            C0w9.A03("InstagramTimeSpentManager_shouldDismissReminderDialog", AnonymousClass001.A0R("Reminder type should correspond to a reminder dialog:", upperCase));
                        }
                    }
                    if ((C455127l.A0N("time_spent_fully_blocking_screen", "com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment") || C455127l.A0N("extension_request_fragment", "extension_request_fragment")) && C455127l.A0M(c455127l2)) {
                        C461529z.A05();
                        c455127l2.A0T();
                        c455127l2.A0R();
                        c455127l2.A03 = null;
                    }
                    c455127l2.A0X(z2);
                    if (c71583Jd2 != null) {
                        c71583Jd2.A00.A04 = false;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("takeABreakReminder", 1869849473, 3, false, true);
                }
            });
        } catch (Exception e) {
            C0w9.A07("InstagramTimeSpentManager_scheduleReminderTaskWithFallback", e);
            try {
                AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.2AQ
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        Dialog dialog;
                        C455127l c455127l2 = c455127l;
                        C71583Jd c71583Jd2 = c71583Jd;
                        boolean z2 = z;
                        if (c455127l2.A01 != null) {
                            String upperCase = AnonymousClass280.A01.A08(c455127l2.A02).toUpperCase(Locale.US);
                            if (!upperCase.equalsIgnoreCase("scheduled_break") && !upperCase.equalsIgnoreCase("daily_limit")) {
                                try {
                                    if ((!AnonymousClass292.A07(r6, EnumC456327x.valueOf(upperCase))) && (dialog = c455127l2.A01) != null) {
                                        dialog.dismiss();
                                        c455127l2.A01 = null;
                                    }
                                } catch (IllegalArgumentException unused) {
                                    C0w9.A03("InstagramTimeSpentManager_shouldDismissReminderDialog", AnonymousClass001.A0R("Bad Argument:", upperCase));
                                }
                            } else {
                                C0w9.A03("InstagramTimeSpentManager_shouldDismissReminderDialog", AnonymousClass001.A0R("Reminder type should correspond to a reminder dialog:", upperCase));
                            }
                        }
                        if ((C455127l.A0N("time_spent_fully_blocking_screen", "com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment") || C455127l.A0N("extension_request_fragment", "extension_request_fragment")) && C455127l.A0M(c455127l2)) {
                            C461529z.A05();
                            c455127l2.A0T();
                            c455127l2.A0R();
                            c455127l2.A03 = null;
                        }
                        c455127l2.A0X(z2);
                        if (c71583Jd2 != null) {
                            c71583Jd2.A00.A04 = false;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("takeABreakReminder", 1869849473, 3, false, true);
                    }
                });
            } catch (Exception e2) {
                C0w9.A07("InstagramTimeSpentManager_handleSchedulingFailure", e2);
            }
        }
    }

    public static void A0F(final C455127l c455127l) {
        long j = c455127l.A07;
        UserSession userSession = c455127l.A02;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A01(c06090Tz, userSession, 36595187242829906L) < System.currentTimeMillis() - j) {
            C1GJ.A05(new C2AG() { // from class: X.2AR
                @Override // X.C11R
                public final int getRunnableId() {
                    return 1261828832;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x013f, code lost:
                
                    if (r3.equals(r0) == false) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0184, code lost:
                
                    r0 = X.C1VE.A02;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0186, code lost:
                
                    if (r0 == null) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x0188, code lost:
                
                    com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener.A00(r0.A00, r7).A04.A01(X.EnumC49762Qj.FOREGROUND);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x0182, code lost:
                
                    if (r3.equals("AppStateManagerCurrentState:BACKGROUND_VOIPON") != false) goto L46;
                 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* bridge */ /* synthetic */ java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 409
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2AR.call():java.lang.Object");
                }
            }, 1261828832, 3, (int) TimeUnit.SECONDS.toMillis(C18U.A01(c06090Tz, userSession, 36595187242698833L)), false, false);
            c455127l.A07 = System.currentTimeMillis();
        }
    }

    public static void A0G(C455127l c455127l) {
        try {
            AbstractC206099Aq.A06(c455127l.A02);
            c455127l.A08();
        } catch (Exception e) {
            C0w9.A07("quiet_mode_startup_tasks", e);
        }
    }

    public static void A0H(final C455127l c455127l) {
        C1GJ.A05(new C2AG() { // from class: X.3Nu
            @Override // X.C11R
            public final int getRunnableId() {
                return 1440554863;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
            
                if (X.C18U.A06(r3, r6, 36315980007280483L) != false) goto L19;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 394
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C72733Nu.call():java.lang.Object");
            }
        }, 1440554863, 3, 5000, false, true);
    }

    public static void A0K(C455127l c455127l, int i) {
        C1GJ.A05(new C2AC(c455127l), 1218371471, 3, (int) (i * 1000), true, true);
    }

    public static boolean A0L(C455127l c455127l) {
        InterfaceC223716s C45 = C17060sy.A01.A01(c455127l.A02).A03.C45();
        if (C45 == null || C45.Ce0() == null || !C45.Ce0().booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (X.AnonymousClass292.A02(r6) != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0M(X.C455127l r7) {
        /*
            X.27x r2 = r7.A03
            r5 = 0
            if (r2 == 0) goto L34
            X.27x r0 = X.EnumC456327x.A05
            if (r2 == r0) goto L93
            X.27x r0 = X.EnumC456327x.A0A
            if (r2 == r0) goto L93
            com.instagram.common.session.UserSession r6 = r7.A02
            X.29W r0 = new X.29W
            r0.<init>(r6)
            boolean r0 = r0.A04()
            r3 = 5
            if (r0 != 0) goto L22
            X.XG6 r1 = X.AnonymousClass292.A02(r6)
            r0 = 1
            if (r1 == 0) goto L23
        L22:
            r0 = 0
        L23:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "extension_request_fragment"
            boolean r0 = A0N(r0, r0)
            if (r0 == 0) goto L35
            boolean r5 = r2.booleanValue()
        L34:
            return r5
        L35:
            X.27x r0 = r7.A03
            int r1 = r0.ordinal()
            if (r1 == r3) goto L46
            if (r1 == r5) goto L46
            r0 = 6
            if (r1 == r0) goto L73
            r0 = 7
            if (r1 == r0) goto L73
            return r5
        L46:
            java.lang.String r1 = "time_spent_fully_blocking_screen"
            java.lang.String r0 = "com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment"
            boolean r0 = A0N(r1, r0)
            if (r0 == 0) goto L34
            X.27x r0 = r7.A03
            if (r0 == 0) goto L34
            int r1 = r0.ordinal()
            if (r1 == r3) goto L6c
            if (r1 == r5) goto L64
            r0 = 3
            if (r1 == r0) goto L6c
            r0 = 4
            if (r1 == r0) goto L6c
            return r5
        L64:
            X.282 r0 = X.AnonymousClass280.A01
            boolean r0 = r0.A0C(r6)
            if (r0 == 0) goto L34
        L6c:
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L34
            goto L91
        L73:
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r0 = r0.A01(r6)
            boolean r0 = r0.A1W()
            if (r0 == 0) goto L91
            X.3Jf r0 = new X.3Jf
            r0.<init>(r6)
            boolean r0 = r0.A07(r1)
            if (r0 != 0) goto L34
        L91:
            r5 = 1
            return r5
        L93:
            java.lang.String r1 = "Reminder type should correspond to a blocking screen:"
            java.lang.String r0 = r2.A00
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r0 = "InstagramTimeSpentManager_shouldDismissBlockingScreen"
            X.C0w9.A03(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455127l.A0M(X.27l):boolean");
    }

    public final LinkedHashMap A0Q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        final UserSession userSession = this.A02;
        arrayList.add(new C455827s(userSession));
        arrayList.add(new AbstractC455927t(userSession) { // from class: X.28g
            public final long A00;
            public final EnumC456327x A01;
            public final UserSession A02;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(userSession);
                C14360o3.A0B(userSession, 1);
                this.A02 = userSession;
                EnumC456327x enumC456327x = EnumC456327x.A03;
                this.A01 = enumC456327x;
                this.A00 = AnonymousClass280.A01.A05(userSession, enumC456327x);
            }

            @Override // X.AbstractC455927t
            public final C9C2 A00(Map map) {
                long A04;
                Integer num;
                String str;
                String str2;
                Integer num2;
                Integer num3;
                UserSession userSession2 = this.A02;
                C29W c29w = new C29W(userSession2);
                AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
                boolean A0C = anonymousClass282.A0C(userSession2);
                long A00 = c29w.A00();
                LinkedHashMap A07 = AbstractC06930Yk.A07(new C09530e4("guardian_daily_limit", String.valueOf(A00)));
                C9BN c9bn = null;
                if (!A0C) {
                    num3 = C05F.A01;
                } else if (A00 <= 0) {
                    num3 = C05F.A00;
                } else {
                    long A02 = C461529z.A02(userSession2);
                    A07.put("time_spent_today", String.valueOf(A02));
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    A07.put("current_time_in_secs", String.valueOf(currentTimeMillis));
                    long A01 = C123815iv.A01();
                    A07.put("midnight_tomorrow_in_secs", String.valueOf(A01));
                    boolean A042 = c29w.A04();
                    A07.put("is_gdl_quota_exceeded", String.valueOf(A042));
                    if (A042) {
                        A04 = currentTimeMillis;
                    } else {
                        A04 = currentTimeMillis + (A00 - A02) + anonymousClass282.A04(userSession2);
                    }
                    long j = A01 - 1;
                    if (A04 >= A01) {
                        A04 = A01 + A00;
                        j += SandboxRepository.CACHE_TTL;
                        A07.put("start_next_day", String.valueOf(A04));
                    }
                    boolean A08 = C461529z.A08(userSession2);
                    A07.put("gdl_non_blocking_and_consolidated", String.valueOf(A08));
                    if (A08) {
                        long j2 = anonymousClass282.A06(userSession2).getLong("DAILY_LIMIT_REMIND_AGAIN_NEXT_START_TIME_IN_SECONDS", 0L);
                        A07.put("remind_again_time_in_secs", String.valueOf(j2));
                        if (j2 > 0) {
                            if (j2 < currentTimeMillis) {
                                anonymousClass282.A09(userSession2, 0L);
                                j2 = 0;
                            }
                            if (j2 < A01) {
                                c9bn = new C9BN(j2, null, 3);
                            }
                            num = C05F.A0N;
                        } else {
                            if (new C29W(userSession2).A04()) {
                                boolean A002 = AbstractC34358FDa.A00(this.A00, 1000 * currentTimeMillis);
                                A07.put("last_seen_on_current_date", String.valueOf(A002));
                                if (!A002 && C18U.A06(C06090Tz.A05, userSession2, 36330814824793121L)) {
                                    str2 = "schedule_for_today_dl_passed_not_seen_reminder_today";
                                    A04 = currentTimeMillis;
                                } else {
                                    str2 = "skip_gdl_quota_exceeded";
                                    A04 = 0;
                                }
                            } else {
                                str2 = "";
                            }
                            if (A04 >= A01) {
                                A04 = A01 + A00;
                                num2 = C05F.A15;
                            } else {
                                if (A04 != 0 && A04 != currentTimeMillis) {
                                    num2 = C05F.A0j;
                                }
                                return new C9C2(new C9BN(A04, null, 3), str2, A07);
                            }
                            switch (num2.intValue()) {
                                case 5:
                                    str2 = "schedule_for_today_daily_limit_not_reached_not_seen_reminder";
                                    break;
                                case 6:
                                    str2 = "schedule_for_next_day_daily_limit_passed_and_seen_reminder_today";
                                    break;
                                default:
                                    str2 = "schedule_for_next_day_cannot_reach_limit_today";
                                    break;
                            }
                            return new C9C2(new C9BN(A04, null, 3), str2, A07);
                        }
                    } else {
                        c9bn = new C9BN(A04, Long.valueOf(j), 3);
                        num = C05F.A1F;
                    }
                    switch (num.intValue()) {
                        case 3:
                            str = "schedule_after_snooze";
                            break;
                        case 4:
                            str = "schedule_for_today_daily_limit_reached_and_not_seen_reminder";
                            break;
                        case 5:
                            str = "schedule_for_today_daily_limit_not_reached_not_seen_reminder";
                            break;
                        case 6:
                            str = "schedule_for_next_day_daily_limit_passed_and_seen_reminder_today";
                            break;
                        case 7:
                            str = "schedule_for_next_day_cannot_reach_limit_today";
                            break;
                        default:
                            str = "schedule_for_today_daily_limit_not_reached_not_seen_blocking_reminder";
                            break;
                    }
                    return new C9C2(c9bn, str, A07);
                }
                if (num3.intValue() != 0) {
                    str = "skip_dl_not_set_by_guardian";
                } else {
                    str = "skip_daily_limit_value_is_0_or_null";
                }
                return new C9C2(c9bn, str, A07);
            }

            @Override // X.InterfaceC456127v
            public final Long BLw() {
                return Long.valueOf(this.A00);
            }

            @Override // X.InterfaceC456127v
            public final EnumC456327x CBj() {
                return this.A01;
            }

            @Override // X.InterfaceC456127v
            public final Map CNY() {
                Long l;
                UserSession userSession2 = this.A02;
                C29W c29w = new C29W(userSession2);
                if (c29w.A00() > 0 && AnonymousClass280.A01.A0C(userSession2)) {
                    l = Long.valueOf(c29w.A00());
                } else {
                    l = null;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("limit", String.valueOf(l));
                C16920sk c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C9BN c9bn = (C9BN) A00(c16920sk).A00;
                if (c9bn != null) {
                    long currentTimeMillis = c9bn.A01 - (System.currentTimeMillis() / 1000);
                    linkedHashMap2.put("limit", String.valueOf(l));
                    linkedHashMap2.put("next_instance", String.valueOf(currentTimeMillis));
                }
                return linkedHashMap2;
            }
        });
        if (this.A04) {
            arrayList.add(new AbstractC455927t(userSession) { // from class: X.92B
                public final EnumC456327x A00;
                public final UserSession A01;
                public final Long A02;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(userSession);
                    C14360o3.A0B(userSession, 1);
                    this.A01 = userSession;
                    EnumC456327x enumC456327x = EnumC456327x.A06;
                    this.A00 = enumC456327x;
                    this.A02 = Long.valueOf(AnonymousClass280.A01.A05(userSession, enumC456327x));
                }

                @Override // X.AbstractC455927t
                public final C9C2 A00(Map map) {
                    Integer num;
                    Long valueOf;
                    String str;
                    String str2;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    C08730cb c08730cb = C17060sy.A01;
                    UserSession userSession2 = this.A01;
                    User A01 = c08730cb.A01(userSession2);
                    linkedHashMap2.put("qm_enabled", String.valueOf(A01.A1W()));
                    C9BN c9bn = null;
                    if (!A01.A1W()) {
                        num = C05F.A00;
                    } else {
                        boolean A06 = C18U.A06(C06090Tz.A05, userSession2, 36315980008853354L);
                        linkedHashMap2.put("qm_bedtime_reminders_block_on_reopen_enabled", String.valueOf(A06));
                        if (!A06) {
                            num = C05F.A0Y;
                        } else {
                            long currentTimeMillis = System.currentTimeMillis() / 1000;
                            linkedHashMap2.put("qm_current_time_in_secs", String.valueOf(currentTimeMillis));
                            long j = AnonymousClass280.A01.A06(userSession2).getLong(AbstractC111324zv.A00(1504), 0L);
                            linkedHashMap2.put("qm_bedtime_reminder_blocking_screen_eligible_ts", String.valueOf(j));
                            linkedHashMap2.put("qm_next_start_time", String.valueOf(AbstractC206099Aq.A03(userSession2, currentTimeMillis)));
                            if (currentTimeMillis < j) {
                                num = C05F.A0j;
                            } else {
                                boolean A07 = new C71603Jf(userSession2).A07(currentTimeMillis);
                                linkedHashMap2.put("qm_active", String.valueOf(A07));
                                if (A07) {
                                    if (!new C71603Jf(userSession2).A07(currentTimeMillis)) {
                                        valueOf = null;
                                    } else {
                                        long A00 = (C123815iv.A00() / 1000) + new C71603Jf(userSession2).A01();
                                        if (currentTimeMillis <= A00) {
                                            A00 -= SandboxRepository.CACHE_TTL;
                                        }
                                        valueOf = Long.valueOf(A00);
                                    }
                                    long A02 = AbstractC206099Aq.A02(userSession2, currentTimeMillis);
                                    if (valueOf == null || (str = valueOf.toString()) == null) {
                                        str = "[none]";
                                    }
                                    linkedHashMap2.put("qm_next_start_time", str);
                                    linkedHashMap2.put("qm_next_end_time", String.valueOf(A02));
                                    if (valueOf == null) {
                                        num = C05F.A0u;
                                    } else {
                                        c9bn = new C9BN(valueOf.longValue(), Long.valueOf(A02), 3);
                                        str2 = "schedule_qm_in_progress";
                                        return new C9C2(c9bn, str2, linkedHashMap2);
                                    }
                                } else {
                                    num = C05F.A01;
                                }
                            }
                        }
                    }
                    switch (num.intValue()) {
                        case 0:
                            str2 = "skip_schedule_qm_disabled";
                            break;
                        case 1:
                            str2 = "skip_schedule_qm_inactive";
                            break;
                        case 2:
                            str2 = "skip_schedule_qm_paused";
                            break;
                        case 3:
                            str2 = "skip_schedule_bedtime_reminders_disabled";
                            break;
                        case 4:
                            str2 = "skip_schedule_qm_bedtime_reminder_block_on_reopen_disabled";
                            break;
                        case 5:
                            str2 = "skip_schedule_bedtime_reminder_in_cooldown";
                            break;
                        default:
                            str2 = "skip_schedule_qm_start_time_null";
                            break;
                    }
                    return new C9C2(c9bn, str2, linkedHashMap2);
                }

                @Override // X.InterfaceC456127v
                public final Long BLw() {
                    return this.A02;
                }

                @Override // X.InterfaceC456127v
                public final EnumC456327x CBj() {
                    return this.A00;
                }

                @Override // X.InterfaceC456127v
                public final Map CNY() {
                    return AbstractC06930Yk.A0E();
                }
            });
        }
        arrayList.add(new C457428i(userSession));
        arrayList.add(new InterfaceC456127v(userSession) { // from class: X.28k
            public List A00;
            public final EnumC456327x A01;
            public final UserSession A02;

            {
                C14360o3.A0B(userSession, 1);
                this.A02 = userSession;
                EnumC456327x enumC456327x = EnumC456327x.A05;
                this.A01 = enumC456327x;
                AnonymousClass280.A01.A05(userSession, enumC456327x);
                this.A00 = C16930sl.A00;
            }

            private final long A00() {
                String str;
                UserSession userSession2 = this.A02;
                long A01 = C18U.A01(C06090Tz.A05, userSession2, 36595810011580680L);
                if (C461529z.A0A(userSession2) && (str = (String) AbstractC001800i.A0J(AbstractC001900j.A0R(C18U.A04(C06090Tz.A06, userSession2, 36888168435352361L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0))) != null) {
                    try {
                        Long A0k = AbstractC003100w.A0k(10, str);
                        if (A0k != null) {
                            return A0k.longValue();
                        }
                        return A01;
                    } catch (NumberFormatException unused) {
                        return A01;
                    }
                }
                return A01;
            }

            @Override // X.InterfaceC456127v
            public final List BOx() {
                return this.A00;
            }

            @Override // X.InterfaceC456127v
            public final EnumC456327x CBj() {
                return this.A01;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
            
                if (X.AnonymousClass280.A01.A0C(r4) == false) goto L6;
             */
            @Override // X.InterfaceC456127v
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C9BN Cst(java.util.Map r15) {
                /*
                    r14 = this;
                    com.instagram.common.session.UserSession r4 = r14.A02
                    X.29W r8 = new X.29W
                    r8.<init>(r4)
                    long r5 = r8.A00()
                    r0 = 0
                    int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                    if (r2 <= 0) goto L1a
                    X.282 r2 = X.AnonymousClass280.A01
                    boolean r3 = r2.A0C(r4)
                    r2 = 1
                    if (r3 != 0) goto L1b
                L1a:
                    r2 = 0
                L1b:
                    r7 = 0
                    if (r2 != 0) goto L1f
                    return r7
                L1f:
                    long r12 = r14.A00()
                    long r10 = r8.A00()
                    long r10 = r10 - r12
                    X.282 r2 = X.AnonymousClass280.A01
                    long r2 = r2.A04(r4)
                    long r10 = r10 + r2
                    long r8 = X.C461529z.A02(r4)
                    long r5 = java.lang.System.currentTimeMillis()
                    r2 = 1000(0x3e8, double:4.94E-321)
                    long r5 = r5 / r2
                    long r3 = X.C123815iv.A01()
                    int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                    if (r2 != 0) goto L51
                    r0 = r5
                L43:
                    long r12 = r12 + r0
                    int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
                    if (r2 < 0) goto L4a
                    long r0 = r3 + r10
                L4a:
                    r3 = 3
                    X.9BN r2 = new X.9BN
                    r2.<init>(r0, r7, r3)
                    return r2
                L51:
                    int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                    if (r2 >= 0) goto L43
                    long r0 = r10 - r8
                    long r0 = r0 + r5
                    goto L43
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C457628k.Cst(java.util.Map):X.9BN");
            }

            @Override // X.InterfaceC456127v
            public final Long BLw() {
                throw C00O.createAndThrow();
            }

            @Override // X.InterfaceC456127v
            public final Map CNY() {
                long A00 = A00();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("interval", String.valueOf(A00));
                C16920sk c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C9BN Cst = Cst(c16920sk);
                if (Cst != null) {
                    long j = Cst.A01;
                    if (Long.valueOf(j) != null && j != 0) {
                        linkedHashMap2.put("next_instance", String.valueOf(j - (System.currentTimeMillis() / 1000)));
                    }
                }
                return linkedHashMap2;
            }
        });
        arrayList.add(new C458028o(userSession));
        arrayList.add(new AbstractC455927t(userSession) { // from class: X.28r
            public final long A00;
            public final EnumC456327x A01;
            public final UserSession A02;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(userSession);
                C14360o3.A0B(userSession, 1);
                this.A02 = userSession;
                EnumC456327x enumC456327x = EnumC456327x.A03;
                this.A01 = enumC456327x;
                this.A00 = AnonymousClass280.A01.A05(userSession, enumC456327x);
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
            @Override // X.AbstractC455927t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C9C2 A00(java.util.Map r21) {
                /*
                    Method dump skipped, instructions count: 306
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C458328r.A00(java.util.Map):X.9C2");
            }

            @Override // X.InterfaceC456127v
            public final Long BLw() {
                return Long.valueOf(this.A00);
            }

            @Override // X.InterfaceC456127v
            public final EnumC456327x CBj() {
                return this.A01;
            }

            @Override // X.InterfaceC456127v
            public final Map CNY() {
                Long A00 = AbstractC459829i.A00(this.A02);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("limit", String.valueOf(A00));
                C16920sk c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                C9BN c9bn = (C9BN) A00(c16920sk).A00;
                if (c9bn != null) {
                    long currentTimeMillis = c9bn.A01 - (System.currentTimeMillis() / 1000);
                    linkedHashMap2.put("limit", String.valueOf(A00));
                    linkedHashMap2.put("next_instance", String.valueOf(currentTimeMillis));
                }
                return linkedHashMap2;
            }
        });
        arrayList.add(new C458428s(userSession));
        arrayList.add(new C458728v(userSession));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC456127v interfaceC456127v = (InterfaceC456127v) it.next();
            C9BN Cst = interfaceC456127v.Cst(new HashMap());
            if (Cst != null) {
                long j = Cst.A01;
                Number number = (Number) Cst.A02;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                long A01 = A01();
                if (j >= currentTimeMillis) {
                    A01 += j - currentTimeMillis;
                } else if (number != null && j <= currentTimeMillis && number.longValue() >= currentTimeMillis) {
                }
                linkedHashMap.put(interfaceC456127v, Long.valueOf(A01));
            }
        }
        return linkedHashMap;
    }

    public final void A0R() {
        C5F2 A00;
        XFBYPRequestStatus C0J;
        String id;
        if (this.A03 == EnumC456327x.A03) {
            UserSession userSession = this.A02;
            AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
            if (anonymousClass282.A0C(userSession) && (A00 = AnonymousClass282.A00(userSession)) != null && (C0J = A00.C0J()) != null && C0J.equals(XFBYPRequestStatus.A04) && (id = A00.getId()) != null) {
                C14360o3.A0B(userSession, 0);
                if (!anonymousClass282.A06(userSession).getBoolean(AnonymousClass001.A0R("TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", id), false)) {
                    GQ2 gq2 = new GQ2(A00, this, id);
                    C11T.A01(gq2);
                    C11T.A04(gq2, 2000L);
                }
            }
        }
    }

    public final void A0T() {
        UserSession userSession = this.A02;
        AbstractC23021Ah.A00(userSession).A0k(-1L);
        C1GJ.A06(FXB.A01(userSession, "mute_all", "cancel"), 604052308, 3, true, true);
    }

    public final void A0U() {
        C25621Ms c25621Ms = new C25621Ms(this.A02);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("mental_well_being/get_daily_limit_settings/");
        c25621Ms.A0S(C67793UyS.class, C69860Vwl.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C67938V3d(this);
        C1GJ.A03(A0N);
    }

    public final void A0W(FragmentActivity fragmentActivity, EnumC456327x enumC456327x, EnumC33408Epf enumC33408Epf) {
        if (fragmentActivity == null) {
            A0D(enumC456327x, enumC33408Epf, this);
            return;
        }
        Intent intent = new Intent(fragmentActivity, (Class<?>) TransparentModalActivity.class);
        A09(intent, enumC456327x, enumC33408Epf);
        C12260kU.A0C(fragmentActivity, intent);
        A0C(enumC456327x);
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
        Object obj;
        Bundle bundle;
        String string;
        EnumC456327x valueOf;
        int ordinal;
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36313712264546513L) && !AnonymousClass280.A01.A0C(userSession)) {
            C08730cb.A00(userSession).A00().A1W();
        }
        C1VE c1ve = C1VE.A02;
        if (C18U.A06(c06090Tz, userSession, 36319020844981135L) && c1ve != null) {
            c1ve.A01(userSession, new Runnable() { // from class: X.GNG
                @Override // java.lang.Runnable
                public final void run() {
                    C455127l.A0I(C455127l.this);
                }
            });
        } else {
            A0I(this);
        }
        if (C57992lC.A03()) {
            A0H(this);
        } else {
            Runnable runnable = new Runnable() { // from class: X.3Je
                @Override // java.lang.Runnable
                public final void run() {
                    C455127l.A0H(C455127l.this);
                }
            };
            Object A00 = AbstractC54852fj.A00();
            if (A00 != null) {
                C57982lB.A0B.A05((Activity) A00, runnable);
            }
        }
        Iterator it = C461529z.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Fragment) obj).isVisible()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != null && (bundle = fragment.mArguments) != null && (string = bundle.getString("reminder_type")) != null && ((ordinal = (valueOf = EnumC456327x.valueOf(string)).ordinal()) == 5 || ordinal == 0 || ordinal == 6 || ordinal == 7)) {
            C461329x.A08(userSession, valueOf.A00, A0P());
        }
        if (new C71603Jf(userSession).A01.A1W() && C08730cb.A00(userSession).A00().A1W()) {
            if (C57992lC.A03()) {
                A0G(this);
            } else {
                Runnable runnable2 = new Runnable() { // from class: X.GNH
                    @Override // java.lang.Runnable
                    public final void run() {
                        C455127l.A0G(C455127l.this);
                    }
                };
                Object A002 = AbstractC54852fj.A00();
                if (A002 != null) {
                    C57982lB.A0B.A05((Activity) A002, runnable2);
                }
            }
        }
        boolean A1W = new C71603Jf(userSession).A01.A1W();
        boolean A0B = C461529z.A0B(userSession);
        if ((!A1W && C18U.A06(C06090Tz.A06, userSession, 36325836957169075L)) || (A0B && C18U.A06(C06090Tz.A06, userSession, 36329015232970707L))) {
            A08();
        }
    }

    public C455127l(UserSession userSession) {
        this.A0I = AbstractC455527p.A01(this.A02);
        this.A02 = userSession;
        A0X(false);
        UserSession userSession2 = this.A02;
        if (userSession2.sessionState.ordinal() == 0 && C18U.A01(C06090Tz.A05, userSession2, 36595810011711753L) > 0) {
            A0K(this, 5);
        }
        C24231Gs.A00().A01(this);
        this.A0F = new InterfaceC42271xH() { // from class: X.2AM
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C2AS c2as = (C2AS) obj;
                UserSession userSession3 = C455127l.this.A02;
                if (userSession3 != null && c2as.A00.equals(C08730cb.A00(userSession3).A00())) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1672325830);
                int A032 = C0f9.A03(-1171695740);
                C455127l c455127l = C455127l.this;
                if (C455127l.A0L(c455127l)) {
                    UserSession userSession3 = c455127l.A02;
                    if (new C29W(userSession3).A04() || AnonymousClass292.A02(userSession3) != null) {
                        FragmentActivity fragmentActivity = null;
                        try {
                            fragmentActivity = C2OG.A01().A06();
                        } catch (ClassCastException | IndexOutOfBoundsException unused) {
                        }
                        if (fragmentActivity == null) {
                            Object A00 = AbstractC54852fj.A00();
                            if (A00 != null && (A00 instanceof FragmentActivity)) {
                                fragmentActivity = (FragmentActivity) A00;
                            }
                            C455127l.A0E(null, c455127l, false);
                        }
                        AbstractC10360h2 abstractC10360h2 = fragmentActivity.mFragments.A00.A03;
                        if (abstractC10360h2 != null) {
                            for (int i = 0; i < abstractC10360h2.A0L(); i++) {
                                Object A0S = abstractC10360h2.A0S(i);
                                if (A0S == null || ((AbstractC016706m) A0S).A09 == null || !((AbstractC016706m) A0S).A09.equals("fully_blocking_fragment_backstack")) {
                                }
                            }
                        }
                        C455127l.A0E(null, c455127l, false);
                    }
                    if ((C455127l.A0N("time_spent_fully_blocking_screen", "com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment") || C455127l.A0N("extension_request_fragment", "extension_request_fragment")) && C455127l.A0M(c455127l)) {
                        C461529z.A05();
                        c455127l.A0T();
                        c455127l.A0R();
                        c455127l.A03 = null;
                    }
                }
                UserSession userSession4 = c455127l.A02;
                C14360o3.A0B(userSession4, 0);
                if (C18U.A06(C06090Tz.A05, userSession4, 2342173355886527302L)) {
                    c455127l.A0X(false);
                }
                C0f9.A0A(391413339, A032);
                C0f9.A0A(1636825603, A03);
            }
        };
        this.A0G = new InterfaceC41501vz() { // from class: X.2AN
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(31525618);
                int A032 = C0f9.A03(-825723559);
                if (((C2AT) obj).A00) {
                    UserSession userSession3 = C455127l.this.A02;
                    AnonymousClass282 anonymousClass282 = AnonymousClass280.A01;
                    C14360o3.A0B(userSession3, 0);
                    InterfaceC19610xo ARD = anonymousClass282.A06(userSession3).ARD();
                    ARD.E7G("BEDTIME_REMINDER_BLOCKING_SCREEN_ELIGIBLE_TIMESTAMP_SECONDS", 0L);
                    ARD.apply();
                    anonymousClass282.A0A(userSession3, EnumC456327x.A07, 0L);
                }
                C455127l c455127l = C455127l.this;
                c455127l.A0X(false);
                EnumC456327x enumC456327x = c455127l.A03;
                if (enumC456327x == EnumC456327x.A06 || enumC456327x == EnumC456327x.A08) {
                    Handler handler = c455127l.A0E;
                    Runnable runnable = c455127l.A0H;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, C455127l.A04(c455127l).longValue());
                }
                C0f9.A0A(-1968818530, A032);
                C0f9.A0A(1528153335, A03);
            }
        };
        this.A0D = C2AO.A00(this.A02);
    }

    public static Long A04(C455127l c455127l) {
        Long valueOf = Long.valueOf(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
        EnumC456327x enumC456327x = c455127l.A03;
        if (enumC456327x == EnumC456327x.A06 || enumC456327x == EnumC456327x.A08) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long A02 = (AbstractC206099Aq.A02(c455127l.A02, currentTimeMillis) - currentTimeMillis) * 1000;
            Long valueOf2 = Long.valueOf(A02);
            if (A02 < StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                return valueOf2;
            }
        }
        return valueOf;
    }

    public static HashMap A05(C455127l c455127l) {
        Object CNY;
        LinkedHashMap A0Q = c455127l.A0Q();
        HashMap hashMap = new HashMap();
        Iterator it = A0Q.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC456127v interfaceC456127v = (InterfaceC456127v) ((Map.Entry) it.next()).getKey();
            String str = interfaceC456127v.CBj().A00;
            List BOx = interfaceC456127v.BOx();
            int size = BOx.size() - 1;
            if (size >= 0 && size < BOx.size()) {
                CNY = BOx.get(size);
            } else {
                CNY = interfaceC456127v.CNY();
            }
            hashMap.put(str, CNY.toString());
        }
        return hashMap;
    }

    public static List A06(C455127l c455127l) {
        if (!A0L(c455127l)) {
            UserSession userSession = c455127l.A02;
            C14360o3.A0B(userSession, 0);
            if (!C18U.A06(C06090Tz.A05, userSession, 36313712266053849L)) {
                return Collections.emptyList();
            }
        }
        return C461529z.A04(false, false);
    }

    private void A09(Intent intent, EnumC456327x enumC456327x, EnumC33408Epf enumC33408Epf) {
        String str;
        Intent putExtra = intent.putExtra("fragment_name", "time_spent_fully_blocking_screen");
        if (enumC33408Epf != null) {
            str = enumC33408Epf.A00;
        } else {
            str = "";
        }
        Bundle bundle = new Bundle();
        bundle.putString("reminder_type", enumC456327x.toString());
        bundle.putString("timespent_dashbaord_entrypoint", str);
        putExtra.putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, bundle);
        if (enumC456327x == EnumC456327x.A06 || enumC456327x == EnumC456327x.A08) {
            intent.putExtra("fragment_animation", new int[]{R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out});
        }
        intent.setFlags(536870912);
    }

    public static void A0A(FragmentActivity fragmentActivity, EnumC456327x enumC456327x, C455127l c455127l) {
        String str;
        int i;
        Object[] objArr;
        C35129FeW c35129FeW;
        Integer Bzj;
        Object A00 = AbstractC54852fj.A00();
        if (A00 instanceof Context) {
            C2OG A01 = C2OG.A01();
            Context context = (Context) A00;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            int ordinal = enumC456327x.ordinal();
            boolean z = true;
            boolean z2 = false;
            if (ordinal != 3) {
                c35129FeW = null;
                if (ordinal != 4) {
                    if (ordinal != 1) {
                        if (ordinal == 8) {
                            UserSession userSession = c455127l.A02;
                            c35129FeW = c455127l.A02(context, fragmentActivity, enumC456327x, false, Long.valueOf(new C71603Jf(userSession).A01()), Long.valueOf(AbstractC206099Aq.A03(userSession, currentTimeMillis) - currentTimeMillis));
                        }
                    }
                } else {
                    UserSession userSession2 = c455127l.A02;
                    XG6 A03 = AnonymousClass292.A03(userSession2);
                    if (A03 != null && (Bzj = A03.Bzj()) != null) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(11, 0);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        long timeInMillis = calendar.getTimeInMillis() / 1000;
                        long intValue = Bzj.intValue();
                        long j = timeInMillis + intValue;
                        boolean z3 = false;
                        InterfaceC223716s C45 = C17060sy.A01.A01(userSession2).A03.C45();
                        if (C45 != null) {
                            Boolean CbU = C45.CbU();
                            if (CbU != null && CbU.booleanValue()) {
                                z = false;
                            }
                            z3 = Boolean.valueOf(z);
                        }
                        c35129FeW = c455127l.A02(context, fragmentActivity, enumC456327x, z3, Long.valueOf(intValue), Long.valueOf(j - currentTimeMillis));
                    }
                }
                A01.A0A(c35129FeW);
            }
            Boolean bool = false;
            if (enumC456327x == EnumC456327x.A05) {
                InterfaceC223716s C452 = C17060sy.A01.A01(c455127l.A02).A03.C45();
                if (C452 != null) {
                    Boolean CSI = C452.CSI();
                    if (CSI == null || !CSI.booleanValue()) {
                        z2 = true;
                    }
                    bool = Boolean.valueOf(z2);
                }
            }
            UserSession userSession3 = c455127l.A02;
            long parseLong = Long.parseLong(C18U.A04(C06090Tz.A06, userSession3, 36888168435352361L));
            if (userSession3 != null) {
                str = userSession3.userId;
            } else {
                str = "";
            }
            C34648FOf A002 = C35129FeW.A00(str);
            A002.A0G = "daily_limit_near_reminder_notification_type";
            A002.A01 = context.getDrawable(R.drawable.clock_with_circle_background);
            A002.A0H = context.getString(2131957452);
            if (bool.booleanValue()) {
                i = 2131957451;
                long j2 = parseLong / 60;
                String quantityString = context.getResources().getQuantityString(R.plurals.granted_extension_time_minutes, (int) j2, Long.valueOf(j2));
                boolean A09 = AbstractC14490oL.A09(context);
                int i2 = R.string.res_0x7f130072_name_removed;
                if (A09) {
                    i2 = R.string.res_0x7f130009_name_removed;
                }
                objArr = new Object[]{quantityString, context.getString(i2)};
            } else {
                i = 2131957450;
                objArr = new Object[]{AbstractC35189Ffh.A02(context.getResources(), parseLong)};
            }
            A002.A0E = context.getString(i, objArr);
            A002.A03 = PushChannelType.A09;
            A002.A08 = new G8P(fragmentActivity, enumC456327x, c455127l);
            A002.A09 = new C36504G8c(c455127l);
            c35129FeW = new C35129FeW(A002);
            A01.A0A(c35129FeW);
        }
    }

    public static void A0I(C455127l c455127l) {
        A0J(c455127l);
        A0F(c455127l);
        C2AP c2ap = c455127l.A0D;
        if (c2ap == null) {
            c2ap = C2AO.A00(c455127l.A02);
            c455127l.A0D = c2ap;
        }
        c2ap.A01 = System.currentTimeMillis() / 1000;
        C006802i c006802i = c2ap.A03;
        c006802i.markerStart(191636345);
        c006802i.markerAnnotate(191636345, "is_mitigationEnabled", c2ap.A05);
        c455127l.A04 = true;
        A0E(new C71583Jd(c455127l), c455127l, false);
        if (A0L(c455127l)) {
            c455127l.A0U();
        }
    }

    public final long A0O() {
        long currentTimeMillis = (System.currentTimeMillis() - this.A06) / 1000;
        UserSession userSession = this.A02;
        C14360o3.A0B(userSession, 0);
        if (C18U.A01(C06090Tz.A05, userSession, 36595187241977936L) > 0) {
            return currentTimeMillis + this.A09;
        }
        return currentTimeMillis;
    }

    public final long A0P() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A0B;
        if (j <= 0 || currentTimeMillis < j) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j);
    }
}
