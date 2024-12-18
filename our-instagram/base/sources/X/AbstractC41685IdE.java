package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.IdE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41685IdE {
    public static final C37796GkB A00;
    public static final C1PC A01;

    static {
        C39361Ha1 c39361Ha1 = C39361Ha1.A00;
        A01 = c39361Ha1;
        C1PH.A01(new C42937Iyp(0), c39361Ha1);
        A00 = new C37796GkB(0);
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [X.2sP, java.lang.Object] */
    public static final C32S A00(Context context, UserSession userSession, IMU imu, DiscoveryChainingItem discoveryChainingItem, C38018Go6 c38018Go6, InterfaceC60442pS interfaceC60442pS, InterfaceC669530m interfaceC669530m, InterfaceC61522rF interfaceC61522rF, String str) {
        InterfaceC671231d c42957Iz9;
        InterfaceC670931a anonymousClass326;
        C31E A002;
        InterfaceC671531g c140756Yd;
        InterfaceC669530m interfaceC669530m2 = interfaceC669530m;
        C14360o3.A0B(userSession, 0);
        if (C1P9.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36323715245092378L)) {
            c42957Iz9 = new C42958IzA(userSession, discoveryChainingItem, c38018Go6);
        } else {
            c42957Iz9 = new C42957Iz9(userSession, discoveryChainingItem, c38018Go6);
        }
        InterfaceC671231d interfaceC671231d = c42957Iz9;
        C1PH A003 = C1PH.A00(userSession);
        C14360o3.A07(A003);
        C1PC c1pc = A01;
        C1PY A06 = A003.A06(c1pc);
        C14360o3.A07(A06);
        ?? obj = new Object();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342168734501778743L)) {
            C31W c31w = C31W.A01;
            C14360o3.A0C(c31w, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.brandsafety.BlocklistEnforcer<Model of com.instagram.sponsored.asyncads.brandsafety.SeverityBrandSafetyEnforcer>");
            anonymousClass326 = new C31Z(c31w, obj, false);
        } else {
            anonymousClass326 = new AnonymousClass326();
        }
        AnonymousClass318 A03 = A003.A03(c1pc);
        C42964IzG c42964IzG = new C42964IzG(userSession, anonymousClass326);
        boolean A05 = C1P8.A05(userSession);
        C31B c31b = C31B.A0Q;
        C39373HaD c39373HaD = new C39373HaD(userSession, c38018Go6, A03, interfaceC60442pS, c42964IzG);
        if (A05) {
            A002 = I9J.A00(userSession, c42964IzG, c31b, c39373HaD, str, "session_id_not_defined_for_Discovery_Chaining", "session_id_not_defined_for_Discovery_Chaining");
        } else {
            A002 = C31J.A00(userSession, c42964IzG, c31b, c39373HaD, "session_id_not_defined_for_Discovery_Chaining");
            C14360o3.A0A(A002);
        }
        C42962IzE c42962IzE = new C42962IzE(A002);
        C37796GkB c37796GkB = A00;
        C14360o3.A0B(c37796GkB, 5);
        C32K c39370HaA = new C39370HaA(userSession, obj, interfaceC671231d, c42962IzE, A06, c37796GkB);
        C43003Izt c43003Izt = new C43003Izt();
        AnonymousClass320 anonymousClass320 = new AnonymousClass320(AbstractC166987dD.A1J(discoveryChainingItem.A0E), 0, 0, false);
        if (C18U.A06(c06090Tz, userSession, 36315679359503857L)) {
            c140756Yd = new C39378HaI(userSession, c38018Go6, anonymousClass326, obj, A06);
        } else {
            c140756Yd = new C140756Yd(obj, interfaceC671231d, A06, new C39374HaE(anonymousClass326, A06, c43003Izt), false, true, false);
        }
        if (C1P8.A04(userSession)) {
            HashSet A1H = AbstractC166987dD.A1H();
            C672131m c672131m = new C672131m(false);
            ArrayList A1E = AbstractC166987dD.A1E();
            C13920nI c13920nI = C13920nI.A00;
            AnonymousClass328 anonymousClass328 = AnonymousClass328.A02;
            C42961IzD c42961IzD = C42961IzD.A00;
            C32E c32e = C32E.A02;
            if (C17280tP.A4E.A00().A0L() || C18U.A06(c06090Tz, userSession, 36312866156053852L)) {
                c39370HaA = new C3GV();
            }
            if (interfaceC669530m == null) {
                interfaceC669530m2 = new C42952Iz4(context, userSession, imu, interfaceC60442pS, interfaceC671231d, A002, AbstractC38143GqA.A00(userSession, interfaceC60442pS, str, false), str);
            }
            return AbstractC37306Gc8.A02(c13920nI, new AnonymousClass314(), anonymousClass326, anonymousClass320, obj, interfaceC669530m2, interfaceC671231d, c42961IzD, c39370HaA, A002, A06, c140756Yd, new C43008Izy(A003), interfaceC61522rF, c672131m, new AnonymousClass327(), A1E, A1H);
        }
        AnonymousClass321 anonymousClass321 = new AnonymousClass321(anonymousClass320);
        if (C17280tP.A4E.A00().A0L() || C18U.A06(c06090Tz, userSession, 36312866156053852L)) {
            c39370HaA = new C3GV();
        }
        anonymousClass321.A0J = c39370HaA;
        anonymousClass321.A0H = interfaceC671231d;
        if (interfaceC669530m == null) {
            interfaceC669530m2 = new C42952Iz4(context, userSession, imu, interfaceC60442pS, interfaceC671231d, A002, AbstractC38143GqA.A00(userSession, interfaceC60442pS, str, false), str);
        }
        anonymousClass321.A0G = interfaceC669530m2;
        anonymousClass321.A0K = A002;
        anonymousClass321.A0N = c140756Yd;
        anonymousClass321.A0P = interfaceC61522rF;
        anonymousClass321.A0L = A06;
        anonymousClass321.A0E = obj;
        anonymousClass321.A0O = new C43008Izy(A003);
        anonymousClass321.A0F = null;
        anonymousClass321.A0B = new AnonymousClass314();
        anonymousClass321.A0D = anonymousClass326;
        anonymousClass321.A0R = new AnonymousClass327();
        C32S A004 = anonymousClass321.A00();
        C14360o3.A0A(A004);
        return A004;
    }

    public static final C1PC A01() {
        return A01;
    }
}
