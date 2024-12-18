package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.InlineStyleAtRangeDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.WGq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70201WGq {
    public static AnonymousClass435 A00;
    public static boolean A01;

    public static void A0D(UserSession userSession) {
        A00 = null;
        C35241Fga.A02(EnumC33507Erg.EDIT_PHOTO_REMINDER, userSession, AbstractC111324zv.A00(3006));
        C67936V3b c67936V3b = new C67936V3b(7);
        if (C18U.A06(C06090Tz.A05, userSession, 36314476771478121L)) {
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGFxIdentityManagementQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67585Us3.class, false, null, 0, null, "business_presence", new ArrayList()).setMaxToleratedCacheAgeMs(0L), c67936V3b);
            return;
        }
        C907442n c907442n = new C907442n(new C2JM(), UO5.class, "IGFxIdentityManagementQuery", false);
        C14360o3.A0B(userSession, 0);
        C907542o c907542o = new C907542o(userSession);
        c907542o.A08(c907442n);
        C1ON A06 = c907542o.A06();
        A06.A00 = c67936V3b;
        C1GJ.A03(A06);
    }

    public static void A0E(UserSession userSession, boolean z) {
        C67936V3b c67936V3b = new C67936V3b(6);
        if (C18U.A06(C06090Tz.A05, userSession, 36314476771412584L)) {
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            c2jm.A02("set_reminder_shown", Boolean.valueOf(z));
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGFxIdentityManagementMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59735Qlb.class, true, null, 0, null, "fxim_update_reminders_state", new ArrayList()), c67936V3b);
            return;
        }
        C2JM c2jm3 = new C2JM();
        c2jm3.A02("set_reminder_shown", Boolean.valueOf(z));
        C907442n c907442n = new C907442n(c2jm3, UNJ.class, "IGFxIdentityManagementMutation", true);
        C14360o3.A0B(userSession, 0);
        C907542o c907542o = new C907542o(userSession);
        c907542o.A08(c907442n);
        C1ON A05 = c907542o.A05();
        A05.A00 = c67936V3b;
        C1GJ.A03(A05);
    }

    public static ImmutableList A00() {
        Object obj;
        AnonymousClass435 anonymousClass435 = A00;
        if (anonymousClass435 != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9I() != null && ((InterfaceC72042XIv) A00.A01).B9I().BFF() != null && ((InterfaceC72042XIv) A00.A01).B9I().BFF().Bou() != null) {
            return ((InterfaceC72042XIv) A00.A01).B9I().BFF().Bou();
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static XK0 A01() {
        Object obj;
        AnonymousClass435 anonymousClass435 = A00;
        if (anonymousClass435 != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9I() != null && ((InterfaceC72042XIv) A00.A01).B9I().Bqm() != null) {
            return ((InterfaceC72042XIv) A00.A01).B9I().Bqm();
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static XIR A02() {
        Object obj;
        AnonymousClass435 anonymousClass435 = A00;
        if (anonymousClass435 != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9J() != null && A08().BW6() != null) {
            return A08().BW6();
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static InterfaceC37284Gbl A03() {
        Object obj;
        AnonymousClass435 anonymousClass435 = A00;
        if (anonymousClass435 != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9J() != null && A08().BW7() != null) {
            return A08().BW7();
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static XIS A04() {
        Object obj;
        AnonymousClass435 anonymousClass435 = A00;
        if (anonymousClass435 != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9J() != null && A08().Bcp() != null) {
            return A08().Bcp();
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static XIT A05() {
        Object obj;
        AnonymousClass435 anonymousClass435 = A00;
        if (anonymousClass435 != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9J() != null && A08().Bcx() != null) {
            return A08().Bcx();
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static XIU A06() {
        Object obj;
        AnonymousClass435 anonymousClass435 = A00;
        if (anonymousClass435 != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9J() != null && A08().Bcy() != null) {
            return A08().Bcy();
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static XHh A07() {
        Object obj;
        AnonymousClass435 anonymousClass435 = A00;
        if (anonymousClass435 != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9J() != null && A08().CEB() != null) {
            return A08().CEB();
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static XJw A08() {
        return ((InterfaceC72042XIv) A00.A01).B9J();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (((X.InterfaceC72042XIv) X.AbstractC70201WGq.A00.A01).B9I().Ako() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0F() {
        /*
            X.435 r1 = X.AbstractC70201WGq.A00
            r3 = 0
            if (r1 == 0) goto L5a
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L5a
            X.XIv r0 = (X.InterfaceC72042XIv) r0
            X.XJu r0 = r0.B9I()
            if (r0 == 0) goto L5a
            java.lang.Object r2 = r1.A01
            X.XIv r2 = (X.InterfaceC72042XIv) r2
            X.XJu r0 = r2.B9I()
            X.XIQ r0 = r0.Bhr()
            if (r0 == 0) goto L5a
            X.435 r0 = X.AbstractC70201WGq.A00
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L40
            X.XIv r0 = (X.InterfaceC72042XIv) r0
            X.XJu r0 = r0.B9I()
            if (r0 == 0) goto L40
            X.435 r0 = X.AbstractC70201WGq.A00
            java.lang.Object r0 = r0.A01
            X.XIv r0 = (X.InterfaceC72042XIv) r0
            X.XJu r0 = r0.B9I()
            boolean r1 = r0.Ako()
            r0 = 1
            if (r1 != 0) goto L41
        L40:
            r0 = 0
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5a
            X.XJu r0 = r2.B9I()
            X.XIQ r0 = r0.Bhr()
            boolean r0 = r0.BJu()
            if (r0 == 0) goto L5a
            r3 = 1
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70201WGq.A0F():boolean");
    }

    public static boolean A0G() {
        Object obj;
        AnonymousClass435 anonymousClass435 = A00;
        if (anonymousClass435 != null && (obj = anonymousClass435.A01) != null && ((InterfaceC72042XIv) obj).B9I() != null && ((InterfaceC72042XIv) A00.A01).B9I().Akq()) {
            return true;
        }
        return false;
    }

    public static Boolean A09() {
        ImmutableList A002 = A00();
        ArrayList arrayList = new ArrayList();
        C1LC it = A002.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((XHX) it.next()).AYB());
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            z = !((XIP) arrayList.get(0)).BJt();
        }
        return Boolean.valueOf(z);
    }

    public static String A0A() {
        XIU A06 = A06();
        if (A06.C8q() != null && !AbstractC126965oa.A03(A06.C8q().getText())) {
            return A06.C8q().getText();
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static String A0B() {
        XIU A06 = A06();
        if (A06.Agp() != null && !AbstractC126965oa.A03(A06.Agp().getText())) {
            return A06.Agp().getText();
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }

    public static ArrayList A0C() {
        XHh A07 = A07();
        if (A07.Agq() != null) {
            ImmutableList inlineStyleRanges = A07.Agq().getInlineStyleRanges();
            ArrayList arrayList = new ArrayList();
            C1LC it = inlineStyleRanges.iterator();
            while (it.hasNext()) {
                XJv xJv = (XJv) it.next();
                if (xJv.hasInlineStyle() && xJv.hasLength() && xJv.hasOffset()) {
                    arrayList.add(new InlineStyleAtRangeDict(Integer.valueOf(xJv.getInlineStyle()), Integer.valueOf(xJv.getLength()), Integer.valueOf(xJv.getOffset())));
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("Missing required content to build the FX Reminder Dialog.");
    }
}
