package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196058lv {
    public static final C196068lw A08 = new Object();
    public final UserSession A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final C05A A06;
    public final C0UO A07;

    public final C131995xZ A00(CallerContext callerContext) {
        String str;
        String str2;
        String str3;
        C208059Im c208059Im;
        int intValue = AbstractC196078lx.A00(this.A00).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                return new C131995xZ(null, C05F.A00, C05F.A0C, "", "", "", C16930sl.A00);
            }
            return ((C196088ly) this.A04.getValue()).A00(callerContext);
        }
        A7F a7f = (A7F) this.A03.getValue();
        String str4 = callerContext.A02;
        C14360o3.A07(str4);
        C9CN c9cn = new C9CN(callerContext, "ig_android_ig_to_fb_crossposting", str4, "crossposting", "loading");
        C31590DuI c31590DuI = (C31590DuI) ((C97Q) a7f.A01.getValue()).AuS(c9cn);
        if (c31590DuI != null && (c208059Im = c31590DuI.A00) != null) {
            str = c208059Im.A00(c9cn, a7f.A00);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            Integer num = C05F.A00;
            return new C131995xZ(null, num, num, "", "", "", C16930sl.A00);
        }
        if (c31590DuI == null || (str2 = c31590DuI.A02) == null) {
            str2 = "";
        }
        Integer num2 = C05F.A0N;
        Integer num3 = C05F.A00;
        if (c31590DuI == null || (str3 = c31590DuI.A03) == null) {
            str3 = "";
        }
        return new C131995xZ(null, num2, num3, str, str2, str3, C16930sl.A00);
    }

    public final void A01(CallerContext callerContext, InterfaceC196338mP interfaceC196338mP, String str) {
        C09530e4 c09530e4;
        String str2;
        AtomicBoolean atomicBoolean = this.A01;
        if (atomicBoolean.get() && System.currentTimeMillis() - ((Number) this.A06.getValue()).longValue() < 30000) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36326876339517615L)) {
                return;
            }
        }
        atomicBoolean.set(true);
        ((C196348mQ) this.A05.getValue()).A00(str);
        String obj = C0HM.A00().toString();
        C14360o3.A07(obj);
        final C196358mR c196358mR = new C196358mR(interfaceC196338mP, this, obj);
        if (AbstractC196078lx.A00(this.A00).intValue() == 0) {
            final A7F a7f = (A7F) this.A03.getValue();
            ((C97Q) a7f.A01.getValue()).AV3(new C9CN(callerContext, "ig_android_ig_to_fb_crossposting", str, "crossposting", "loading"), C97J.A00, new C97X() { // from class: X.9O4
                @Override // X.C97X
                public final void onError(Throwable th) {
                    C14360o3.A0B(th, 0);
                    c196358mR.A01("OneLink");
                }

                @Override // X.C97X
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                    c196358mR.A00();
                }
            });
            str2 = "OneLink";
        } else {
            final C196088ly c196088ly = (C196088ly) this.A04.getValue();
            C196098lz c196098lz = (C196098lz) c196088ly.A02.getValue();
            List singletonList = Collections.singletonList("CROSS_POSTING_SETTING");
            C14360o3.A07(singletonList);
            InterfaceC196048lu interfaceC196048lu = new InterfaceC196048lu() { // from class: X.8mS
                @Override // X.InterfaceC196048lu
                public final void onFailure() {
                    C11T.A02(new RunnableC24675AwG(c196088ly, c196358mR));
                }

                @Override // X.InterfaceC196048lu
                public final void onSuccess() {
                    final C196358mR c196358mR2 = c196358mR;
                    final C196088ly c196088ly2 = c196088ly;
                    C11T.A02(new Runnable() { // from class: X.5oY
                        @Override // java.lang.Runnable
                        public final void run() {
                            c196358mR2.A00();
                        }
                    });
                }
            };
            C09530e4 c09530e42 = new C09530e4("CROSSPOSTING_DESTINATION_APP", "FB");
            C09530e4 c09530e43 = new C09530e4("CROSSPOSTING_SHARE_TO_SURFACE", "");
            if (C18U.A06(C06090Tz.A05, c196088ly.A00, 36326481202263954L)) {
                c09530e4 = new C09530e4("OVERRIDE_USER_VALIDATION_WITH_CXP_ELIGIBILITY_RULE", "true");
            } else {
                c09530e4 = null;
            }
            C09530e4[] c09530e4Arr = {c09530e42, c09530e43, c09530e4};
            C14360o3.A0B(c09530e4Arr, 0);
            c196098lz.A00.A03(callerContext, interfaceC196048lu, "ig_android_service_cache_crossposting_setting", singletonList, AbstractC06930Yk.A08(AbstractC009903n.A0I(c09530e4Arr)));
            str2 = "FXServiceCache";
        }
        C196438mZ c196438mZ = (C196438mZ) c196358mR.A01.A02.getValue();
        String str3 = c196358mR.A02;
        C18920wW c18920wW = (C18920wW) c196438mZ.A01.getValue();
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "cxp_ig_client_sourced_creation");
        EnumC222416a A0I = C17060sy.A01.A01(c196438mZ.A00).A0I();
        if (A0I == null) {
            A0I = EnumC222416a.A08;
        }
        A00.AAP(AbstractC50635MWw.A02(42, 10, 0), str3);
        A00.AAP("event_name", "xposting_destination_fetch_attempt");
        A00.AAP("data_source", str2);
        A00.AAP("source_account_type", A0I.A01);
        A00.Cht();
    }

    public final void A02(CallerContext callerContext, InterfaceC196338mP interfaceC196338mP, String str, boolean z) {
        long j;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j2;
        if (str.equals("reels")) {
            j = 604800000;
        } else {
            if (str.equals(MSV.A00(1176))) {
                userSession = this.A00;
                c06090Tz = C06090Tz.A05;
                j2 = 36608351316023008L;
            } else if (str.equals("camera_open_prefetch")) {
                userSession = this.A00;
                c06090Tz = C06090Tz.A05;
                j2 = 36608351316154081L;
            } else {
                j = 0;
            }
            j = C18U.A01(c06090Tz, userSession, j2);
        }
        long currentTimeMillis = System.currentTimeMillis() - ((Number) this.A06.getValue()).longValue();
        if (!z && currentTimeMillis < j) {
            return;
        }
        A01(callerContext, interfaceC196338mP, str);
    }

    public C196058lv(UserSession userSession) {
        this.A00 = userSession;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 28));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 27));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 29));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C206959Ea(this, 26));
        C008002u c008002u = new C008002u(0L);
        this.A06 = c008002u;
        this.A07 = c008002u;
    }
}
