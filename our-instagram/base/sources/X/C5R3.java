package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsSpecialResponseType;
import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.5R3, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5R3 implements C5R4, C5R6 {
    public InterfaceC120815dY A00 = null;
    public Context A01;
    public final InterfaceC116925Qy A02;
    public final C5Qu A03;
    public final C37671Gi4 A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final AbstractC39459Hbl A08;
    public final Integer A09;
    public final String A0A;
    public final InterfaceC16820sZ A0B;
    public final boolean A0C;

    public C5R3(Context context, InterfaceC116925Qy interfaceC116925Qy, AbstractC39459Hbl abstractC39459Hbl, C5Qu c5Qu, C37671Gi4 c37671Gi4, Integer num, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        this.A06 = str;
        this.A04 = c37671Gi4;
        this.A03 = c5Qu;
        this.A0A = str2;
        this.A02 = interfaceC116925Qy;
        this.A09 = num;
        this.A07 = z;
        this.A0C = z2;
        this.A08 = abstractC39459Hbl;
        this.A01 = context;
        this.A05 = str3;
        this.A0B = interfaceC16820sZ;
    }

    private final void A03(UserSession userSession, C5R8 c5r8) {
        Long A07;
        long j;
        AHy(userSession);
        c5r8.A00++;
        Throwable th = new Throwable();
        if (C1LE.A0B(userSession)) {
            C1IA A00 = C1I9.A00(userSession);
            synchronized (A00) {
                C62292sU c62292sU = (C62292sU) A00.A00.get("clips_discover_prefetch");
                if (c62292sU != null) {
                    A07 = Long.valueOf(c62292sU.A00);
                } else {
                    C1IH c1ih = (C1IH) ((C1IB) A00).A00.A00.get("clips_discover_prefetch");
                    if (c1ih != null) {
                        A07 = Long.valueOf(c1ih.A00);
                    } else {
                        A07 = null;
                    }
                }
            }
        } else {
            A07 = C1P2.A00(userSession).A07("clips_discover_prefetch");
        }
        if (A07 != null) {
            j = System.currentTimeMillis() - A07.longValue();
        } else {
            j = 0;
        }
        LinkedHashMap A06 = AbstractC06930Yk.A06(new C09530e4("response_age_in_ms", String.valueOf(j)), new C09530e4("invalidation_count", String.valueOf(c5r8.A00)));
        C14360o3.A0B(A06, 2);
        AbstractC12120kG.A0J("invalidate_prefetch_cache", th, A06, 817893023);
        int i = c5r8.A01;
        if (i < 1) {
            c5r8.A01 = i + 1;
            AQ9(this.A01, userSession, this.A0A, null, false, true);
        }
    }

    public static final boolean A05(InterfaceC124295jj interfaceC124295jj) {
        if (interfaceC124295jj instanceof C124275jh) {
            C124275jh c124275jh = (C124275jh) interfaceC124295jj;
            if (c124275jh.A00 != ClipsSpecialResponseType.A04 && (!c124275jh.AoM().isEmpty() || !c124275jh.AoP().isEmpty())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C5R4
    public final Integer AJT(UserSession userSession, AbstractC154286wd abstractC154286wd, C154796xU c154796xU) {
        C14360o3.A0B(c154796xU, 1);
        C5RA A00 = C5R9.A00(userSession);
        A00.A01 = null;
        A00.A00 = 0L;
        A00.A03.clear();
        if (!this.A07 && !C18U.A06(C06090Tz.A05, userSession, 36316989325316874L) && this.A06 == null) {
            if (C1LE.A0B(userSession)) {
                return c154796xU.A02(abstractC154286wd, "clips_discover_prefetch", 43200L, true, false);
            }
            return c154796xU.A01(abstractC154286wd, "clips_discover_prefetch", 43200L, true);
        }
        return C05F.A0C;
    }

    @Override // X.C5R4
    public final boolean ARZ(UserSession userSession) {
        return false;
    }

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        String str;
        C14360o3.A0B(userSession, 0);
        C37787Gk2 c37787Gk2 = C37787Gk2.A01;
        String str2 = this.A06;
        C37671Gi4 c37671Gi4 = this.A04;
        if (c37671Gi4 != null) {
            str = c37671Gi4.A01();
        } else {
            str = null;
        }
        String A00 = this.A03.A00();
        String str3 = this.A0A;
        InterfaceC116925Qy interfaceC116925Qy = this.A02;
        InterfaceC120815dY interfaceC120815dY = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 2342156416535496628L);
        String A002 = AbstractC37792Gk7.A00(C18U.A04(c06090Tz, userSession, 36876357275418723L), String.valueOf(C18U.A06(c06090Tz, userSession, 2342156416535562165L)), String.valueOf(C18U.A06(c06090Tz, userSession, 2342156416535627702L)), C18U.A04(c06090Tz, userSession, 36876357275484260L), A06);
        return c37787Gk2.A08(this.A01, null, interfaceC116925Qy, userSession, interfaceC120815dY, this.A08, this.A09, str2, null, str, A00, str3, A002, AbstractC37497GfF.A00(userSession).A01, this.A05, null, this.A0B, -1.0d, false, false, this.A0C, z, true);
    }

    @Override // X.C5R4
    public final Integer BfR(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C1LE.A03(userSession) || (!this.A07 && !C18U.A06(C06090Tz.A05, userSession, 36316989325316874L) && this.A06 == null)) {
            if (C1LE.A0B(userSession)) {
                return C1I9.A00(userSession).A06("clips_discover_prefetch", 43200L, true);
            }
            return C1P2.A00(userSession).A06("clips_discover_prefetch", 43200L, true);
        }
        return C05F.A0C;
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        String str2;
        C14360o3.A0B(userSession, 0);
        C37787Gk2 c37787Gk2 = C37787Gk2.A01;
        String str3 = this.A06;
        C37671Gi4 c37671Gi4 = this.A04;
        if (c37671Gi4 != null) {
            str2 = c37671Gi4.A01();
        } else {
            str2 = null;
        }
        String A00 = this.A03.A00();
        String str4 = this.A0A;
        return c37787Gk2.A08(this.A01, null, this.A02, userSession, this.A00, this.A08, this.A09, str3, str, str2, A00, str4, null, AbstractC37497GfF.A00(userSession).A01, this.A05, null, this.A0B, -1.0d, false, false, false, false, false);
    }

    @Override // X.C5R6
    public final C24531Hw Co7(Context context, UserSession userSession, Long l, String str, List list, boolean z, boolean z2, boolean z3) {
        String str2;
        String str3;
        int i;
        long j;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(list, 3);
        C37787Gk2 c37787Gk2 = C37787Gk2.A01;
        String str4 = this.A06;
        C37671Gi4 c37671Gi4 = this.A04;
        if (c37671Gi4 != null) {
            str2 = c37671Gi4.A01();
        } else {
            str2 = null;
        }
        String A00 = this.A03.A00();
        String str5 = this.A0A;
        InterfaceC116925Qy interfaceC116925Qy = this.A02;
        InterfaceC120815dY interfaceC120815dY = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 2342156416535496628L);
        String A002 = AbstractC37792Gk7.A00(C18U.A04(c06090Tz, userSession, 36876357275418723L), String.valueOf(C18U.A06(c06090Tz, userSession, 2342156416535562165L)), String.valueOf(C18U.A06(c06090Tz, userSession, 2342156416535627702L)), C18U.A04(c06090Tz, userSession, 36876357275484260L), A06);
        AbstractC39459Hbl abstractC39459Hbl = this.A08;
        Integer num = this.A09;
        boolean z4 = this.A0C;
        String str6 = AbstractC37497GfF.A00(userSession).A01;
        String str7 = this.A05;
        if (!C18U.A06(c06090Tz, userSession, 36325845547824572L)) {
            str3 = null;
        } else {
            List<C37853Gl7> list2 = AbstractC37696GiX.A00(userSession).A04;
            str3 = null;
            if (!list2.isEmpty()) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0c();
                    for (C37853Gl7 c37853Gl7 : list2) {
                        A0A.A0d();
                        A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c37853Gl7.A02);
                        Integer num2 = c37853Gl7.A00;
                        if (num2 != null) {
                            i = num2.intValue();
                        } else {
                            i = 0;
                        }
                        A0A.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
                        Long l2 = c37853Gl7.A01;
                        if (l2 != null) {
                            j = l2.longValue();
                        } else {
                            j = 0;
                        }
                        A0A.A0R("server_ranked_at", j);
                        A0A.A0a();
                    }
                    A0A.A0Z();
                    A0A.close();
                    str3 = stringWriter.toString();
                } catch (Exception e) {
                    C0K8.A0F("ClipsViewerCacheStateManager", "Failed to encode cache items list into json string", e);
                }
            }
        }
        return c37787Gk2.A09(context, interfaceC116925Qy, userSession, interfaceC120815dY, abstractC39459Hbl, num, l, str4, null, str2, A00, str5, A002, str, str6, str7, str3, null, list, this.A0B, -1.0d, false, false, z4, z, true, z2, z3);
    }

    @Override // X.C5R6
    public final C24531Hw Co9(Context context, UserSession userSession, String str, List list, boolean z) {
        String str2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(list, 3);
        C37787Gk2 c37787Gk2 = C37787Gk2.A01;
        String str3 = this.A06;
        C37671Gi4 c37671Gi4 = this.A04;
        if (c37671Gi4 != null) {
            str2 = c37671Gi4.A01();
        } else {
            str2 = null;
        }
        return c37787Gk2.A09(context, this.A02, userSession, this.A00, this.A08, this.A09, null, str3, str, str2, this.A03.A00(), this.A0A, null, null, AbstractC37497GfF.A00(userSession).A01, this.A05, null, null, list, this.A0B, -1.0d, false, false, false, false, false, z, false);
    }

    @Override // X.C5R5
    public final /* synthetic */ void ERc(C37682GiJ c37682GiJ) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void EcO(String str) {
    }

    public static final void A02(Context context, UserSession userSession, C5R3 c5r3, String str, String str2, double d, boolean z, boolean z2) {
        String str3;
        C25621Ms A00;
        String str4;
        String str5;
        String str6;
        C23711Eb A02;
        String str7;
        String str8;
        EnumC37328GcW enumC37328GcW = EnumC37328GcW.A04;
        InterfaceC43545JLf A002 = C37327GcV.A00(userSession, enumC37328GcW);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C37501GfJ(userSession));
        A002.ED1(enumC37328GcW, arrayList);
        if (C1LE.A0B(userSession)) {
            C9FN c9fn = new C9FN(16, userSession, c5r3, A002);
            C37671Gi4 c37671Gi4 = c5r3.A04;
            if (c37671Gi4 != null) {
                str6 = c37671Gi4.A01();
            } else {
                str6 = null;
            }
            String A003 = c5r3.A03.A00();
            C1IA A004 = C1I9.A00(userSession);
            if (!A004.A07("clips_discover_prefetch")) {
                C42215In1 c42215In1 = new C42215In1(userSession, c5r3);
                C42216In2 c42216In2 = new C42216In2(userSession, str, c9fn);
                C24531Hw c24531Hw = null;
                C23561AcF c23561AcF = C23561AcF.A00;
                if (!z) {
                    C37787Gk2 c37787Gk2 = C37787Gk2.A01;
                    String str9 = c5r3.A06;
                    InterfaceC116925Qy interfaceC116925Qy = c5r3.A02;
                    InterfaceC120815dY interfaceC120815dY = c5r3.A00;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    boolean A06 = C18U.A06(c06090Tz, userSession, 2342156416535496628L);
                    String A04 = C18U.A04(c06090Tz, userSession, 36876357275418723L);
                    String valueOf = String.valueOf(C18U.A06(c06090Tz, userSession, 2342156416535627702L));
                    String valueOf2 = String.valueOf(C18U.A06(c06090Tz, userSession, 2342156416535562165L));
                    String A042 = C18U.A04(c06090Tz, userSession, 36876357275484260L);
                    if (A06) {
                        str8 = new JSONObject(AbstractC37792Gk7.A02(A04, valueOf2, valueOf, A042, A06)).toString();
                    } else {
                        str8 = null;
                    }
                    c24531Hw = c37787Gk2.A09(context, interfaceC116925Qy, userSession, interfaceC120815dY, null, null, null, str9, null, str6, A003, str, str8, null, AbstractC37497GfF.A00(userSession).A01, null, null, str2, C16930sl.A00, null, d, true, z2, false, false, true, false, false);
                }
                if (C37787Gk2.A06(userSession)) {
                    A02 = AbstractC37797GkC.A01(userSession);
                    str7 = "mixed_media/discover/stream/";
                } else {
                    A02 = AbstractC37797GkC.A02(userSession, 1617547344);
                    str7 = "clips/discover/stream/";
                }
                C37787Gk2.A03(A02, userSession, C05F.A0C, null, str, null, str7, null, null, null, null, false, false);
                C37787Gk2.A01(context, A02, userSession, null, str, null, null, null, null, true, false, true, true, false);
                C1IA.A00(A004, c23561AcF, c42216In2, c42215In1, c24531Hw, A02.A0N(), "clips_discover_prefetch", C37787Gk2.A00(userSession), true, C18U.A06(C06090Tz.A05, userSession, 36316989324530433L));
                return;
            }
            return;
        }
        C9FO c9fo = new C9FO(48, c5r3, A002, userSession);
        C37671Gi4 c37671Gi42 = c5r3.A04;
        if (c37671Gi42 != null) {
            str3 = c37671Gi42.A01();
        } else {
            str3 = null;
        }
        String A005 = c5r3.A03.A00();
        C1P3 A006 = C1P2.A00(userSession);
        if (A006.A09("clips_discover_prefetch")) {
            return;
        }
        C37520Gfc c37520Gfc = new C37520Gfc(userSession, c5r3, str, c9fo);
        C1ON c1on = null;
        C207869Hs c207869Hs = C207869Hs.A00;
        if (!z) {
            C37787Gk2 c37787Gk22 = C37787Gk2.A01;
            String str10 = c5r3.A06;
            InterfaceC116925Qy interfaceC116925Qy2 = c5r3.A02;
            C06090Tz c06090Tz2 = C06090Tz.A05;
            boolean A062 = C18U.A06(c06090Tz2, userSession, 2342156416535496628L);
            String A043 = C18U.A04(c06090Tz2, userSession, 36876357275418723L);
            String valueOf3 = String.valueOf(C18U.A06(c06090Tz2, userSession, 2342156416535627702L));
            String valueOf4 = String.valueOf(C18U.A06(c06090Tz2, userSession, 2342156416535562165L));
            String A044 = C18U.A04(c06090Tz2, userSession, 36876357275484260L);
            if (A062) {
                str5 = new JSONObject(AbstractC37792Gk7.A02(A043, valueOf4, valueOf3, A044, A062)).toString();
            } else {
                str5 = null;
            }
            c1on = c37787Gk22.A08(context, null, interfaceC116925Qy2, userSession, null, null, null, str10, null, str3, A005, str, str5, AbstractC37497GfF.A00(userSession).A01, c5r3.A05, str2, null, d, true, z2, false, false, true);
        }
        if (C37787Gk2.A06(userSession)) {
            A00 = new C25621Ms(userSession, -2);
            A00.A0P(null, C38858H9g.class, C41307IPw.class, false);
            str4 = "mixed_media/discover/";
        } else {
            A00 = AbstractC37797GkC.A00(userSession);
            str4 = "clips/discover/";
        }
        C37787Gk2.A03(A00, userSession, C05F.A0C, null, str, null, str4, null, null, null, null, false, false);
        C37787Gk2.A01(context, A00, userSession, null, str, null, null, null, null, true, false, true, false, false);
        C1P3.A00(A006, c207869Hs, null, c37520Gfc, c1on, A00.A0N(), "clips_discover_prefetch", C37787Gk2.A00(userSession), true, C18U.A06(C06090Tz.A05, userSession, 36316989324530433L));
    }

    @Override // X.C5R4
    public final void AQ9(Context context, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        IgSignalsClipsOpenTabTracker A00 = C2JF.A00(userSession);
        if (A00 != null && A00.A02 != null) {
            C43217J8o c43217J8o = new C43217J8o(context, userSession, this, str, str2, z, z2);
            A7T a7t = A00.A04;
            if (a7t != null) {
                long longValue = (((Number) A00.A0D.invoke()).longValue() - a7t.A01) / 1000;
                double d = a7t.A00;
                if (longValue < 900) {
                    c43217J8o.invoke(Double.valueOf(d));
                    return;
                }
            }
            C19L c19l = A00.A0E;
            C9D4 c9d4 = new C9D4(c43217J8o, A00, (InterfaceC23621Ds) null, 10);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, c19l);
            return;
        }
        A02(context, userSession, this, str, str2, -1.0d, z, z2);
    }

    @Override // X.C5R4
    public final String BfW() {
        return "clips_discover_prefetch";
    }

    @Override // X.C5R5
    public final boolean CUz(boolean z) {
        boolean z2;
        if (this.A05 == null) {
            if (z) {
                z2 = this.A0C;
            } else {
                z2 = this.A07;
            }
            if (!z2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C5R4
    public final void CoG(UserSession userSession, String str) {
        boolean A09;
        C5R8 c5r8 = (C5R8) userSession.A01(C5R8.class, C5R7.A00);
        if (C1LE.A0B(userSession)) {
            A09 = C1I9.A00(userSession).A07("clips_discover_prefetch");
        } else {
            A09 = C1P2.A00(userSession).A09("clips_discover_prefetch");
        }
        if (A09) {
            c5r8.A02.add(str);
        } else {
            if (!C5R9.A00(userSession).A03.contains(str)) {
                return;
            }
            A03(userSession, c5r8);
        }
    }

    public static final List A00(InterfaceC124295jj interfaceC124295jj) {
        List AoP = interfaceC124295jj.AoP();
        ArrayList arrayList = new ArrayList();
        for (Object obj : AoP) {
            if (((C120985dq) obj).A02 != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C38321qM c38321qM = ((C120985dq) it.next()).A02;
            if (c38321qM != null) {
                arrayList2.add(c38321qM);
            }
        }
        return arrayList2;
    }

    public static final List A01(InterfaceC124295jj interfaceC124295jj) {
        String str;
        List AoP = interfaceC124295jj.AoP();
        ArrayList arrayList = new ArrayList();
        for (Object obj : AoP) {
            C120985dq c120985dq = (C120985dq) obj;
            if (c120985dq.A01 == EnumC129395t1.A0G && c120985dq.A02 != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C38321qM c38321qM = ((C120985dq) it.next()).A02;
            if (c38321qM != null) {
                str = c38321qM.getId();
            } else {
                str = null;
            }
            arrayList2.add(str);
        }
        return AbstractC001800i.A0X(arrayList2);
    }

    public static final void A04(UserSession userSession, C5R3 c5r3) {
        Object obj;
        C5RA A00 = C5R9.A00(userSession);
        C5R8 c5r8 = (C5R8) userSession.A01(C5R8.class, C5R7.A00);
        java.util.Set set = c5r8.A02;
        Iterator it = set.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C14360o3.A0B(obj, 0);
                if (A00.A03.contains(obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        set.clear();
        if (obj != null) {
            c5r3.A03(userSession, c5r8);
        }
    }

    @Override // X.C5R4
    public final void AHy(UserSession userSession) {
        C5RA A00 = C5R9.A00(userSession);
        A00.A01 = null;
        A00.A00 = 0L;
        A00.A03.clear();
        C1IC.A00(userSession).A03("clips_discover_prefetch", true);
        C1ID.A00(C1IC.A00(userSession));
    }

    @Override // X.C5R4
    public final C38321qM B6c(UserSession userSession) {
        C5RA A00 = C5R9.A00(userSession);
        if (SystemClock.elapsedRealtime() - A00.A00 < TimeUnit.SECONDS.toMillis(C37787Gk2.A00(A00.A02))) {
            return A00.A01;
        }
        return null;
    }

    @Override // X.C5R5
    public final void ES6(Context context) {
        this.A01 = context;
    }

    @Override // X.C5R5
    public final void Eee(InterfaceC120815dY interfaceC120815dY) {
        this.A00 = interfaceC120815dY;
    }
}
