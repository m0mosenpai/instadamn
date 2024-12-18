package X;

import android.content.Context;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.Random;

/* renamed from: X.19R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19R extends C18V {
    public static C1AB A03;
    public static final Random A04 = new Random();
    public final Context A00;
    public final LightweightQuickPerformanceLogger A01;
    public final InterfaceC09390do A02;

    @Override // X.C18V
    public final C13310mH A00(AbstractC12990ll abstractC12990ll, EnumC20090yg enumC20090yg) {
        C1AC A01;
        C14360o3.A0B(abstractC12990ll, 0);
        if (enumC20090yg.ordinal() != 1) {
            A01 = A02((UserSession) abstractC12990ll);
            C14360o3.A0A(A01);
        } else {
            A01 = A01();
        }
        AbstractC202778xv.A00();
        return C1AC.A00(A01, false);
    }

    @Override // X.C18V
    public final void A03(final UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.4HM
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1297312377, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C229419w c229419w;
                C18V c18v;
                UserSession userSession2 = UserSession.this;
                C06090Tz c06090Tz = C06090Tz.A05;
                C1AD.A06(c06090Tz, 18298527775983151L);
                C1AD.A00(c06090Tz, 19142952706244659L);
                C1AD.A01(c06090Tz, 18580002752759506L);
                C1AD.A04(c06090Tz, 18861477729599569L);
                if (C18U.A06(c06090Tz, userSession2, 36312921990497837L)) {
                    C18950wb.A01.AEp("Fake failure to simulate F&S canary failures, push_event_test_ig_user_session_canary_test.bool1", 817892914).report();
                }
                C18U.A06(c06090Tz, userSession2, 36312921990563374L);
                C18U.A00(c06090Tz, userSession2, 37157346920824882L);
                C18U.A01(c06090Tz, userSession2, 36594396967339729L);
                C18U.A04(c06090Tz, userSession2, 36875871944179792L);
                C18U.A01(c06090Tz, userSession2, 36612427239922055L);
                if (C18U.A06(c06090Tz, userSession2, 36315756668915235L) && C19R.A04.nextInt(50000) == 0 && (c18v = C18V.A01) != null) {
                    C1AC A02 = c18v.A02(userSession2);
                    C14360o3.A0A(A02);
                    C229419w c229419w2 = A02.A01.A00;
                    C06090Tz A00 = C06090Tz.A00(new C06090Tz());
                    A00.A02 = true;
                    String valueOf = String.valueOf(c229419w2.BPF(A00, 36597205875952371L));
                    boolean z = false;
                    if (A00.A00.A00.getSource() > 1) {
                        z = true;
                    }
                    C5N3.A01(userSession2, valueOf, 36597205875952371L, z);
                    String valueOf2 = String.valueOf(c229419w2.BPF(A00, 36597210170919668L));
                    boolean z2 = false;
                    if (A00.A00.A00.getSource() > 1) {
                        z2 = true;
                    }
                    C5N3.A01(userSession2, valueOf2, 36597210170919668L, z2);
                    String valueOf3 = String.valueOf(c229419w2.BPF(A00, 36597214465886965L));
                    boolean z3 = false;
                    if (A00.A00.A00.getSource() > 1) {
                        z3 = true;
                    }
                    C5N3.A01(userSession2, valueOf3, 36597214465886965L, z3);
                    String valueOf4 = String.valueOf(c229419w2.BPF(A00, 36597218760854262L));
                    boolean z4 = false;
                    if (A00.A00.A00.getSource() > 1) {
                        z4 = true;
                    }
                    C5N3.A01(userSession2, valueOf4, 36597218760854262L, z4);
                }
                if (C18U.A06(c06090Tz, userSession2, 36318518332889322L)) {
                    C25621Ms c25621Ms = new C25621Ms(userSession2, -2);
                    c25621Ms.A09(C05F.A0N);
                    c25621Ms.A0B("fast_and_safe/server_configs_test/");
                    c25621Ms.A0P(null, C67790UyP.class, C69861Vwm.class, false);
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = new V3T();
                    C1GJ.A03(A0N);
                }
                C19R c19r = this;
                C1AC A01 = c19r.A01();
                C1AC.A00(A01, true);
                C229419w c229419w3 = c19r.A01().A01.A00;
                StringBuilder sb = new StringBuilder();
                C5N3.A00(c229419w3, Boolean.valueOf(C1AD.A06(c06090Tz, 18300872828128378L)), false, "bool1", sb, 18300872828128378L);
                C5N3.A00(c229419w3, Boolean.valueOf(C1AD.A06(c06090Tz, 2324143882041887867L)), true, "bool2", sb, 2324143882041887867L);
                C5N3.A00(c229419w3, Boolean.valueOf(C1AD.A06(c06090Tz, 2324143882041953404L)), false, "bool3", sb, 2324143882041953404L);
                C5N3.A00(c229419w3, Boolean.valueOf(C1AD.A06(c06090Tz, 18300872828324989L)), true, "bool4", sb, 18300872828324989L);
                Double valueOf5 = Double.valueOf(C1AD.A00(c06090Tz, 19145297758584932L));
                Double valueOf6 = Double.valueOf(-142.5d);
                C5N3.A00(c229419w3, valueOf5, valueOf6, "double1", sb, 19145297758584932L);
                Double valueOf7 = Double.valueOf(C1AD.A00(c06090Tz, 19145297758716005L));
                Double valueOf8 = Double.valueOf(0.0d);
                C5N3.A00(c229419w3, valueOf7, valueOf8, "double2", sb, 19145297758716005L);
                Double valueOf9 = Double.valueOf(C1AD.A00(c06090Tz, 19145297758912614L));
                Double valueOf10 = Double.valueOf(9.876543210125E9d);
                C5N3.A00(c229419w3, valueOf9, valueOf10, "double3", sb, 19145297758912614L);
                C5N3.A00(c229419w3, Long.valueOf(C1AD.A01(c06090Tz, 18582347805362806L)), 975612L, "int1", sb, 18582347805362806L);
                C5N3.A00(c229419w3, Long.valueOf(C1AD.A01(c06090Tz, 18582347805559415L)), 0L, "int2", sb, 18582347805559415L);
                C5N3.A00(c229419w3, Long.valueOf(C1AD.A01(c06090Tz, 18582347805624952L)), -4321L, "int3", sb, 18582347805624952L);
                C5N3.A00(c229419w3, C1AD.A04(c06090Tz, 18863822781808802L), "Lorem Ipsum", "string1", sb, 18863822781808802L);
                C5N3.A00(c229419w3, C1AD.A04(c06090Tz, 18863822781939875L), "", "string2", sb, 18863822781939875L);
                C5N3.A00(c229419w3, C1AD.A04(c06090Tz, 18863822782136484L), "MobileConfig is a cross-platform framework for Android and iOS apps to access server-side configurations", "string3", sb, 18863822782136484L);
                if (sb.length() > 0) {
                    sb.insert(0, "Failed to get remote config values: ");
                    C0f5 AEp = C18950wb.A01.AEp("NEEDLE_FAILURE_FDIDIG", 13636632);
                    AEp.ERI(new IllegalStateException(sb.toString()));
                    AEp.report();
                }
                C1AD.A04(c06090Tz, 18863822782398629L);
                C1AC A022 = c19r.A02(userSession2);
                if (A022 != null) {
                    C1AC.A00(A022, true);
                }
                C1AC A023 = c19r.A02(userSession2);
                if (A023 != null) {
                    C229419w c229419w4 = A023.A01.A00;
                    StringBuilder sb2 = new StringBuilder();
                    C5N3.A00(c229419w4, Boolean.valueOf(C18U.A06(c06090Tz, userSession2, 36312986415597136L)), false, "bool1", sb2, 36312986415597136L);
                    C5N3.A00(c229419w4, Boolean.valueOf(C18U.A06(c06090Tz, userSession2, 2342155995629356625L)), true, "bool2", sb2, 2342155995629356625L);
                    C5N3.A00(c229419w4, Boolean.valueOf(C18U.A06(c06090Tz, userSession2, 2342155995629422162L)), false, "bool3", sb2, 2342155995629422162L);
                    C5N3.A00(c229419w4, Boolean.valueOf(C18U.A06(c06090Tz, userSession2, 36312986415793747L)), true, "bool4", sb2, 36312986415793747L);
                    C5N3.A00(c229419w4, Double.valueOf(C18U.A00(c06090Tz, userSession2, 37157411345268788L)), valueOf6, "double1", sb2, 37157411345268788L);
                    C5N3.A00(c229419w4, Double.valueOf(C18U.A00(c06090Tz, userSession2, 37157411345399861L)), valueOf8, "double2", sb2, 37157411345399861L);
                    C5N3.A00(c229419w4, Double.valueOf(C18U.A00(c06090Tz, userSession2, 37157411345530934L)), valueOf10, "double3", sb2, 37157411345530934L);
                    C5N3.A00(c229419w4, Long.valueOf(C18U.A01(c06090Tz, userSession2, 36594461391718122L)), 975612L, "int1", sb2, 36594461391718122L);
                    C5N3.A00(c229419w4, Long.valueOf(C18U.A01(c06090Tz, userSession2, 36594461392176875L)), 0L, "int2", sb2, 36594461392176875L);
                    C5N3.A00(c229419w4, Long.valueOf(C18U.A01(c06090Tz, userSession2, 36594461392242412L)), -4321L, "int3", sb2, 36594461392242412L);
                    C5N3.A00(c229419w4, C18U.A04(c06090Tz, userSession2, 36875936368492628L), "Lorem Ipsum", "string1", sb2, 36875936368492628L);
                    C5N3.A00(c229419w4, C18U.A04(c06090Tz, userSession2, 36875936368623701L), "", "string2", sb2, 36875936368623701L);
                    C5N3.A00(c229419w4, C18U.A04(c06090Tz, userSession2, 36875936368754774L), "MobileConfig is a cross-platform framework for Android and iOS apps to access server-side configurations", "string3", sb2, 36875936368754774L);
                    if (sb2.length() > 0) {
                        sb2.insert(0, "Failed to get remote config values: ");
                        C0f5 AEp2 = C18950wb.A01.AEp("NEEDLE_FAILURE_IG_CONFIG", 13636632);
                        AEp2.ERI(new IllegalStateException(sb2.toString()));
                        AEp2.report();
                    }
                    C18U.A04(c06090Tz, userSession2, 36875940663394391L);
                }
                C229419w c229419w5 = null;
                if (A01 != null) {
                    c229419w = A01.A01.A00;
                } else {
                    c229419w = null;
                }
                if (A022 != null) {
                    c229419w5 = A022.A01.A00;
                }
                C23011Ag.A00(c229419w5, c229419w, C1AR.A01(userSession2), C1AR.A00(), null, userSession2, C05F.A00, AbstractC16960so.A1Q(new C22951Aa(AbstractC20100yh.A00(36328847729246027L)), new C22951Aa(AbstractC20100yh.A00(36891797682717603L))), AbstractC16960so.A1Q(new C22951Aa(AbstractC20070ye.A00(18315132119564677L)), new C22951Aa(AbstractC20070ye.A00(18878082073035718L))), 1792);
            }
        });
    }

    @Override // X.C18V
    public final void A04(UserSession userSession) {
        C13310mH c13310mH;
        C13310mH A00 = C1AC.A00(A01(), false);
        C1AC A02 = A02(userSession);
        if (A02 != null) {
            c13310mH = C1AC.A00(A02, false);
        } else {
            c13310mH = null;
        }
        for (C13310mH c13310mH2 : AbstractC16960so.A1Q(A00, c13310mH)) {
            if (c13310mH2 != null) {
                try {
                    c13310mH2.A02.await();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Override // X.C18V
    public final void A05(UserSession userSession, String str, int i) {
        C1AC A01;
        C1AB c1ab;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        if (i != 1) {
            A01 = A02(userSession);
            if (A01 == null) {
                return;
            }
        } else {
            A01 = A01();
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A01;
        C14360o3.A0B(lightweightQuickPerformanceLogger, 3);
        Context context = A01.A00;
        if (i != 1) {
            AbstractC68225VIl.A01 = C19V.A00(context, lightweightQuickPerformanceLogger, userSession, null, str, AbstractC58410Puo.A01(0, 9, 109), null, 2, true, false);
            C17280tP.A00().A0D(str);
            c1ab = AbstractC68225VIl.A01;
        } else {
            AbstractC68225VIl.A00 = C19V.A00(context, lightweightQuickPerformanceLogger, userSession, null, "", str, null, 1, true, false);
            C17280tP.A00().A0C(str);
            c1ab = AbstractC68225VIl.A00;
        }
        if (c1ab == null) {
            return;
        }
        C0U3 c0u3 = new C0U3();
        c0u3.A03 = true;
        c0u3.A00 = 30000;
        c0u3.A01 = new WWo();
        C17280tP A00 = C17280tP.A00();
        A00.A0O.Egi(A00, false, C17280tP.A4G[136]);
        C229419w c229419w = c1ab.A00;
        c229419w.A0C();
        c229419w.A0A().updateConfigs(c0u3);
    }

    @Override // X.C18V
    public final void A06(final UserSession userSession, final boolean z) {
        C14360o3.A0B(userSession, 0);
        final C1AC A01 = A01();
        final C1AC A02 = A02(userSession);
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.4HN
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(64142938, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1AC c1ac = A01;
                UserSession userSession2 = userSession;
                boolean z2 = z;
                c1ac.A02(userSession2, z2);
                C1AC c1ac2 = A02;
                if (c1ac2 != null) {
                    c1ac2.A02(userSession2, z2);
                }
            }
        });
    }

    @Override // X.C18V
    public final void A07(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        C1AC A02 = A02(userSession);
        if (A02 != null) {
            A02.A01.A03(z);
        }
    }

    @Override // X.C18V
    public final boolean A08(AbstractC12990ll abstractC12990ll) {
        UserSession userSession;
        C1AC A02;
        C14360o3.A0B(abstractC12990ll, 0);
        if (!(abstractC12990ll instanceof UserSession) || (userSession = (UserSession) abstractC12990ll) == null || (A02 = A02(userSession)) == null) {
            return false;
        }
        C229419w c229419w = A02.A01.A00;
        c229419w.A0C();
        return c229419w.A0A().updateEmergencyPushConfigs();
    }

    @Override // X.C18V
    public final C1AC A01() {
        return (C1AC) this.A02.getValue();
    }

    @Override // X.C18V
    public final C1AC A02(UserSession userSession) {
        if (userSession != null) {
            return (C1AC) userSession.A01(C1AC.class, new C9F7(5, userSession, this));
        }
        return null;
    }

    public C19R(Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.A01 = lightweightQuickPerformanceLogger;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A00 = applicationContext;
        this.A02 = AbstractC09440dt.A01(new C9EO(this, 1));
    }
}
