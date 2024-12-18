package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43631zr implements InterfaceC12870lZ, InterfaceC13000lm {
    public long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final BroadcastReceiver A08;
    public final Context A09;
    public final Handler A0A;
    public final AnonymousClass208 A0B;
    public final InterfaceC43681zz A0C;
    public final UserSession A0D;
    public final Map A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final C18920wW A0K;
    public final String A0L;
    public final Map A0M;

    /* JADX WARN: Type inference failed for: r0v40, types: [X.208] */
    public C43631zr(final UserSession userSession, final Context context) {
        InterfaceC43681zz c70592WdU;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        this.A0D = userSession;
        this.A09 = context;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = C18U.A01(c06090Tz, userSession, 36598412761763028L) * 1000;
        this.A03 = C18U.A01(c06090Tz, userSession, 36598412762418393L) * 1000;
        this.A02 = C18U.A01(c06090Tz, userSession, 36598412762483930L) * 1000;
        this.A05 = C18U.A01(c06090Tz, userSession, 36598412761894102L) * 1000;
        this.A04 = C18U.A01(c06090Tz, userSession, 36598412761828565L) * 1000;
        this.A0L = String.valueOf(C18U.A01(c06090Tz, userSession, 36598412761828565L) / 60);
        this.A0J = C18U.A06(c06090Tz, userSession, 2342159946998944477L);
        this.A0I = C18U.A06(c06090Tz, userSession, 36316937785381598L);
        this.A07 = C18U.A01(c06090Tz, userSession, 36598412762025175L) * 1000;
        this.A0F = C18U.A06(c06090Tz, userSession, 36316937785447135L);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36316937785578209L);
        this.A0H = A06;
        this.A06 = C18U.A01(c06090Tz, userSession, 36598412762352856L) * 1000;
        this.A0G = C18U.A06(c06090Tz, userSession, 36316937785840354L);
        if (A06) {
            final C43651zv c43651zv = new C43651zv(this);
            c70592WdU = new InterfaceC43681zz(context, c43651zv, userSession) { // from class: X.1zy
                public final Context A00;
                public final C1UM A01;
                public final C43651zv A02;
                public final UserSession A03;

                @Override // X.InterfaceC43681zz
                public final synchronized void E70(C40R c40r, String str) {
                    C14360o3.A0B(str, 0);
                    ConcurrentHashMap A00 = A00();
                    A00.put(str, c40r);
                    A01(A00);
                }

                @Override // X.InterfaceC43681zz
                public final synchronized void EEk(String str) {
                    C14360o3.A0B(str, 0);
                    ConcurrentHashMap A00 = A00();
                    A00.remove(str);
                    A01(A00);
                }

                private final ConcurrentHashMap A00() {
                    try {
                        String string = this.A01.getString("tracking_installs_key", "");
                        C14360o3.A0A(string);
                        return C40P.A01(this.A02, string);
                    } catch (C90173zy | IOException unused) {
                        A01(new ConcurrentHashMap());
                        return new ConcurrentHashMap();
                    }
                }

                private final void A01(ConcurrentHashMap concurrentHashMap) {
                    C1UP c1up = (C1UP) this.A01;
                    C1UP.A03(c1up);
                    C1ZT c1zt = new C1ZT(c1up);
                    c1zt.A09("tracking_installs_key", C40P.A00(this.A02, concurrentHashMap));
                    c1zt.A03();
                }

                {
                    this.A00 = context;
                    this.A03 = userSession;
                    this.A02 = c43651zv;
                    C1UM A00 = C1U4.A00(context).A00("install_open_pref");
                    C14360o3.A07(A00);
                    this.A01 = A00;
                }

                @Override // X.InterfaceC43681zz
                public final C40R AXH(String str) {
                    return (C40R) A00().get(str);
                }

                @Override // X.InterfaceC43681zz
                public final Collection values() {
                    Collection values = A00().values();
                    C14360o3.A07(values);
                    return values;
                }
            };
        } else {
            c70592WdU = new C70592WdU();
        }
        this.A0C = c70592WdU;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "app_install_notification";
        this.A0K = c12210kP.A00();
        this.A0A = new Handler(Looper.getMainLooper());
        this.A0E = new ConcurrentHashMap();
        this.A0M = new ConcurrentHashMap();
        this.A0B = new Runnable() { // from class: X.208
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String string;
                String string2;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                String str9;
                C43631zr c43631zr = C43631zr.this;
                Map map = c43631zr.A0E;
                for (C40R c40r : map.values()) {
                    long j = c40r.A01;
                    if (j != 0) {
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        String str10 = c40r.A05;
                        C43631zr.A04(c43631zr, str10, c40r.A08, "User return time from package", String.valueOf(currentTimeMillis), c40r.A07);
                        map.remove(str10);
                    }
                }
                InterfaceC43681zz interfaceC43681zz = c43631zr.A0C;
                for (C40R c40r2 : interfaceC43681zz.values()) {
                    if (!c40r2.A09) {
                        if (c43631zr.A0G && C43631zr.A01(c43631zr.A09, c40r2, c43631zr) == C05F.A00) {
                            c40r2.A09 = true;
                            c40r2.A00 = System.currentTimeMillis();
                            c40r2.A0A = !C218914p.A08();
                            String str11 = c40r2.A05;
                            interfaceC43681zz.E70(c40r2, str11);
                            C43631zr.A04(c43631zr, str11, c40r2.A08, "Application install found through get package state", null, c40r2.A07);
                        } else if (c43631zr.A0H && System.currentTimeMillis() - c40r2.A0B > c43631zr.A06) {
                            String str12 = c40r2.A05;
                            interfaceC43681zz.EEk(str12);
                            C43631zr.A04(c43631zr, str12, c40r2.A08, "Tracked Install expired before install", null, c40r2.A07);
                        }
                    }
                    if (C218914p.A08()) {
                        str2 = c40r2.A05;
                        str3 = c40r2.A08;
                        str7 = c40r2.A07;
                        str8 = "Show IG notification";
                        str9 = "App is not in foreground";
                    } else {
                        Context context2 = c43631zr.A09;
                        Integer A01 = C43631zr.A01(context2, c40r2, c43631zr);
                        if (System.currentTimeMillis() - c40r2.A00 > c43631zr.A04) {
                            C43631zr.A04(c43631zr, c40r2.A05, c40r2.A08, "Install expired", null, c40r2.A07);
                        } else if (A01 != C05F.A01) {
                            if (c43631zr.A0H) {
                                String str13 = c40r2.A04;
                                if (str13 != null) {
                                    UserSession userSession2 = c43631zr.A0D;
                                    str2 = c40r2.A05;
                                    str4 = null;
                                    if (AbstractC115215Is.A01(context2, userSession2, str13, str2, false)) {
                                        str3 = c40r2.A08;
                                        str5 = c40r2.A07;
                                        str6 = "App can launch with deep link";
                                        C43631zr.A04(c43631zr, str2, str3, str6, str4, str5);
                                    }
                                }
                                PackageManager packageManager = context2.getPackageManager();
                                str2 = c40r2.A05;
                                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2);
                                str3 = c40r2.A08;
                                if (launchIntentForPackage == null) {
                                    str7 = c40r2.A07;
                                    str8 = "App can not Launch Now";
                                    str9 = "Null intent";
                                } else {
                                    str4 = null;
                                    str5 = c40r2.A07;
                                    str6 = "App can Launch Now with package intent";
                                    C43631zr.A04(c43631zr, str2, str3, str6, str4, str5);
                                }
                            }
                            if (System.currentTimeMillis() - c43631zr.A00 >= c43631zr.A05) {
                                String A02 = C43631zr.A02(c40r2, c43631zr);
                                Drawable A00 = C43631zr.A00(c40r2, c43631zr);
                                try {
                                } catch (Exception e) {
                                    str = c40r2.A05;
                                    C43631zr.A04(c43631zr, str, c40r2.A08, "Show Snack Bar error", e.toString(), c40r2.A07);
                                }
                                if (!c43631zr.A0J) {
                                    if (c43631zr.A0I) {
                                        if (!c43631zr.A0F || c40r2.A0A) {
                                            str = c40r2.A05;
                                            C43631zr.A04(c43631zr, str, c40r2.A08, "Show Snack Bar for auto open", null, c40r2.A07);
                                            C70948Wku c70948Wku = new C70948Wku(c40r2, c43631zr, c43631zr.A07);
                                            C54971OTd c54971OTd = new C54971OTd((C49490Lu3) null, c70948Wku);
                                            C41451vu c41451vu = C41451vu.A01;
                                            if (c43631zr.A02 >= 0) {
                                                c41451vu.A02(new C70718Wfj(c70948Wku), C3KH.class);
                                            }
                                            c41451vu.E4s(new C3KH(c54971OTd));
                                        }
                                    } else {
                                        C34648FOf A002 = C35129FeW.A00(c43631zr.A0D.userId);
                                        A002.A0G = "app_install_notification";
                                        A002.A0C = context2.getString(2131952985);
                                        A002.A03 = PushChannelType.A09;
                                        A002.A08 = new C70943Wkp(c40r2, c43631zr);
                                        A002.A09 = new C36502G8a();
                                        A002.A01 = A00;
                                        if (A02.length() > 0) {
                                            string2 = context2.getString(2131952984, C43631zr.A02(c40r2, c43631zr));
                                        } else {
                                            string2 = context2.getString(2131952983);
                                        }
                                        A002.A0E = string2;
                                        C2OG.A01().A0A(new C35129FeW(A002));
                                        str = c40r2.A05;
                                        C43631zr.A04(c43631zr, str, c40r2.A08, "Show In App Notification", null, c40r2.A07);
                                    }
                                    interfaceC43681zz.EEk(str);
                                    c43631zr.A00 = System.currentTimeMillis();
                                }
                                C146106i8 c146106i8 = new C146106i8();
                                String string3 = context2.getString(2131952985);
                                C14360o3.A07(string3);
                                c146106i8.A0G = string3;
                                c146106i8.A01();
                                c146106i8.A0A(new C70945Wkr(c40r2, c43631zr));
                                c146106i8.A03();
                                c146106i8.A01 = (int) c43631zr.A07;
                                c146106i8.A04 = A00;
                                if (A02.length() > 0) {
                                    string = context2.getString(2131952984, C43631zr.A02(c40r2, c43631zr));
                                } else {
                                    string = context2.getString(2131952983);
                                }
                                c146106i8.A0D = string;
                                C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                                str = c40r2.A05;
                                C43631zr.A04(c43631zr, str, c40r2.A08, "Show Snack Bar", null, c40r2.A07);
                                interfaceC43681zz.EEk(str);
                                c43631zr.A00 = System.currentTimeMillis();
                            }
                            c43631zr.A0A.postDelayed(this, c43631zr.A01);
                        }
                        interfaceC43681zz.EEk(c40r2.A05);
                        c43631zr.A0A.postDelayed(this, c43631zr.A01);
                    }
                    C43631zr.A04(c43631zr, str2, str3, str8, str9, str7);
                    c43631zr.A0A.postDelayed(this, c43631zr.A01);
                }
                c43631zr.A0A.postDelayed(this, c43631zr.A01);
            }
        };
        this.A08 = new BroadcastReceiver() { // from class: X.20A
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                int i;
                String encodedSchemeSpecificPart;
                String str;
                int A01 = C0f9.A01(-1230685455);
                C0fM.A01(this, context2, intent);
                C14360o3.A0B(context2, 0);
                C14360o3.A0B(intent, 1);
                if (!C08310bt.A02().A00(context2, intent, this)) {
                    i = 2063347850;
                } else {
                    android.net.Uri data = intent.getData();
                    if (data != null && (encodedSchemeSpecificPart = data.getEncodedSchemeSpecificPart()) != null && encodedSchemeSpecificPart.length() != 0) {
                        C43631zr c43631zr = C43631zr.this;
                        InterfaceC43681zz interfaceC43681zz = c43631zr.A0C;
                        C40R AXH = interfaceC43681zz.AXH(encodedSchemeSpecificPart);
                        if (AXH == null) {
                            i = 208171208;
                        } else {
                            AXH.A09 = true;
                            AXH.A00 = System.currentTimeMillis();
                            AXH.A0A = !C218914p.A08();
                            interfaceC43681zz.E70(AXH, encodedSchemeSpecificPart);
                            String str2 = AXH.A05;
                            String str3 = AXH.A08;
                            if (C218914p.A08()) {
                                str = AppStateModule.APP_STATE_BACKGROUND;
                            } else {
                                str = "foreground";
                            }
                            C43631zr.A04(c43631zr, str2, str3, AnonymousClass001.A0R("PACKAGE_ADDED received while on ", str), null, AXH.A07);
                            long j = c43631zr.A03;
                            if (j >= 0 && !C218914p.A08()) {
                                Handler handler = c43631zr.A0A;
                                AnonymousClass208 anonymousClass208 = c43631zr.A0B;
                                handler.removeCallbacks(anonymousClass208);
                                handler.postDelayed(anonymousClass208, j);
                            }
                            i = 93329044;
                        }
                    } else {
                        i = 1190411700;
                    }
                }
                C0f9.A0E(i, A01, intent);
            }
        };
    }

    public static final Drawable A00(C40R c40r, C43631zr c43631zr) {
        try {
            PackageManager packageManager = c43631zr.A09.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(c40r.A05, 0);
            C14360o3.A07(applicationInfo);
            return applicationInfo.loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e) {
            A04(c43631zr, c40r.A05, c40r.A08, "Get app icon from package", e.toString(), c40r.A07);
            Drawable A00 = AbstractC65877Tvg.A00(c43631zr.A09, XNQ.A2L, BSV.SIZE_24, BSU.OUTLINE);
            C14360o3.A07(A00);
            return A00;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x003f: INVOKE 
      (r4 I:X.1zr)
      (r5 I:java.lang.String)
      (r6 I:java.lang.String)
      (r7 I:java.lang.String)
      (r8 I:java.lang.String)
      (r9 I:java.lang.String)
     STATIC call: X.1zr.A04(X.1zr, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void A[MD:(X.1zr, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:63), block:B:17:0x0033 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0052: INVOKE 
      (r4 I:X.1zr)
      (r5 I:java.lang.String)
      (r6 I:java.lang.String)
      (r7 I:java.lang.String)
      (r8 I:java.lang.String)
      (r9 I:java.lang.String)
     STATIC call: X.1zr.A04(X.1zr, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void A[MD:(X.1zr, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:82), block:B:14:0x0046 */
    public static final Integer A01(Context context, C40R c40r, C43631zr c43631zr) {
        C43631zr A04;
        C43631zr A042;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                A04(c43631zr, c40r.A05, c40r.A08, "Package is not Installed", "Got null PackageManager", c40r.A07);
                return C05F.A0N;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                packageManager.getPackageInfo(c40r.A05, PackageManager.PackageInfoFlags.of(0L));
            } else {
                packageManager.getPackageInfo(c40r.A05, 1);
            }
            return C05F.A00;
        } catch (PackageManager.NameNotFoundException e) {
            A04(A042, c40r.A05, c40r.A08, "Package Name Not Found Exception", e.toString(), c40r.A07);
            return C05F.A01;
        } catch (RuntimeException e2) {
            A04(A04, c40r.A05, c40r.A08, "Package RuntimeException", e2.toString(), c40r.A07);
            return C05F.A0C;
        }
    }

    public static final String A02(C40R c40r, C43631zr c43631zr) {
        try {
            PackageManager packageManager = c43631zr.A09.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(c40r.A05, 0);
            C14360o3.A07(applicationInfo);
            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            C14360o3.A0C(applicationLabel, "null cannot be cast to non-null type kotlin.String");
            return (String) applicationLabel;
        } catch (PackageManager.NameNotFoundException e) {
            A04(c43631zr, c40r.A05, c40r.A08, "Get app name from package", e.toString(), c40r.A07);
            return "";
        }
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00ad: INVOKE 
      (r8 I:X.1zr)
      (r9 I:java.lang.String)
      (r10 I:java.lang.String)
      (r11 I:java.lang.String)
      (r12 I:java.lang.String)
      (r13 I:java.lang.String)
     STATIC call: X.1zr.A04(X.1zr, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void A[MD:(X.1zr, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:173), block:B:34:0x00a1 */
    public static final void A03(C40R c40r, C43631zr c43631zr) {
        C43631zr A04;
        String str;
        AndroidLink androidLink;
        try {
            JJ5 jj5 = c40r.A02;
            String str2 = c40r.A04;
            if (jj5 != null) {
                C42137Ill c42137Ill = (C42137Ill) jj5;
                C37953Gmv c37953Gmv = c42137Ill.A02;
                C37952Gmu c37952Gmu = c37953Gmv.A00;
                if (C18U.A06(C06090Tz.A05, c37952Gmu.A11, 36316937785512672L)) {
                    C37954Gmw A03 = c37953Gmv.A03();
                    if (A03.A00 != null && (androidLink = A03.A02) != null && AbstractC114965Hm.A01(androidLink) == EnumC906041v.AD_DESTINATION_DEEPLINK) {
                        C38321qM c38321qM = c42137Ill.A01;
                        if (c38321qM != null) {
                            AbstractC41772Ieo.A04(c42137Ill.A00, c38321qM, androidLink, c37952Gmu, null);
                            str = c40r.A05;
                            A04(c43631zr, str, c40r.A08, "Deep link opened", null, c40r.A07);
                            c40r.A01 = System.currentTimeMillis();
                            c43631zr.A0M.put(str, c40r);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            if (c43631zr.A0H && str2 != null) {
                Context context = c43631zr.A09;
                UserSession userSession = c43631zr.A0D;
                str = c40r.A05;
                if (AbstractC115215Is.A01(context, userSession, str2, str, false) && C12260kU.A0A(context, AbstractC41776Ies.A00(context, str2))) {
                    A04(c43631zr, str, c40r.A08, "Deep link opened from Shared Preference", null, c40r.A07);
                    c40r.A01 = System.currentTimeMillis();
                    c43631zr.A0M.put(str, c40r);
                    return;
                }
            }
            Context context2 = c43631zr.A09;
            PackageManager packageManager = context2.getPackageManager();
            str = c40r.A05;
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                C12260kU.A0F(context2, launchIntentForPackage);
                c40r.A01 = System.currentTimeMillis();
                c43631zr.A0M.put(str, c40r);
                return;
            }
            A04(c43631zr, str, c40r.A08, "Open button clicked", "Null intent", c40r.A07);
        } catch (Exception e) {
            A04(A04, c40r.A05, c40r.A08, "Exception while invokePostInstallCallback", e.toString(), c40r.A07);
        }
    }

    public static final void A04(C43631zr c43631zr, String str, String str2, String str3, String str4, String str5) {
        C18920wW c18920wW = c43631zr.A0K;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "on_device_install_notification_logging");
        if (A00.isSampled()) {
            A00.AAP("package_name", str);
            A00.AAP("action", str3);
            A00.AAP("tracking_token", str2);
            A00.AAP("expiry_time", c43631zr.A0L);
            A00.AAP("error", str4);
            A00.AAP("store_interface", str5);
            A00.Cht();
        }
    }

    public final void A05(JJ5 jj5, String str, String str2, String str3, String str4) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 16) {
            sb.append(new BigInteger(5, secureRandom).toString(32));
        }
        String substring = sb.substring(0, 16);
        C14360o3.A07(substring);
        C40R c40r = new C40R(jj5, str2, str, str3, substring, null, str4, System.currentTimeMillis(), 0L, 0L, false, false);
        this.A0C.E70(c40r, str);
        A04(this, c40r.A05, c40r.A08, "Package added for tracking", null, str4);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(2073316073);
        this.A0A.removeCallbacks(this.A0B);
        Map map = this.A0M;
        for (C40R c40r : map.values()) {
            Map map2 = this.A0E;
            String str = c40r.A05;
            map2.put(str, c40r);
            map.remove(str);
        }
        C0f9.A0A(-168376686, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(809151161);
        long j = this.A02;
        if (j >= 0) {
            this.A0A.postDelayed(this.A0B, j);
        } else {
            this.A0A.postDelayed(this.A0B, this.A01);
        }
        C0f9.A0A(-1930765025, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
        this.A0A.removeCallbacks(this.A0B);
        this.A09.unregisterReceiver(this.A08);
    }
}
