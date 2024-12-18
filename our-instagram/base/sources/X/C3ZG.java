package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ZG, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3ZG {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d6, code lost:
    
        if (X.C17060sy.A01.A01(r31).equals(r10.CDj()) == false) goto L57;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A00(android.content.Context r29, X.InterfaceC11380iw r30, com.instagram.common.session.UserSession r31, X.C3XG r32, final int r33) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3ZG.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.3XG, int):java.util.ArrayList");
    }

    public static void A02(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, List list, int i) {
        C0T6 c9bp;
        InterfaceC39541sb injected;
        IGAdsIABScreenshotDataDict BFN;
        String Bqu;
        int i2;
        int A0p;
        long j;
        if (c38321qM.A5Q()) {
            List Ap5 = c38321qM.A0C.Ap5();
            if (Ap5 != null) {
                ArrayList arrayList = new ArrayList(Ap5.size());
                for (int i3 = 0; i3 < Ap5.size(); i3++) {
                    C38321qM c38321qM2 = (C38321qM) Ap5.get(i3);
                    EnumC40111tc BRp = c38321qM2.BRp();
                    if (c38321qM.CdW() && C18U.A06(C06090Tz.A05, userSession, 36311225478480343L) && (BRp == EnumC40111tc.A0Q || BRp == EnumC40111tc.A0a)) {
                        arrayList.add(new C43121yf(C3ZH.A04(context, userSession, c38321qM2, C05F.A00, interfaceC11380iw.getModuleName(), false), new C3ZN(new Pair(Integer.valueOf(i), 0), c38321qM.CCj())));
                    } else if (BRp == EnumC40111tc.A0V) {
                        IgShowreelNativeAnimationIntf Bx7 = c38321qM2.A0C.Bx7();
                        C18C.A07(Bx7, "Media collection item of SHOWREEL_NATIVE type should have SN animation model!");
                        C139366Sr c139366Sr = new C139366Sr(AbstractC41071vF.A07(userSession, c38321qM), c38321qM.A33());
                        ImmutableList Acw = AbstractC37415Gdv.A00(Bx7).Acw();
                        try {
                            String A00 = AbstractC111324zv.A00(1272);
                            C6VS c6vs = C6VR.A01;
                            C14360o3.A0B(userSession, 0);
                            C6VU A01 = c6vs.A01(C6VS.A00(userSession, A00), userSession, A00);
                            String Anz = Bx7.Anz();
                            String C5i = Bx7.C5i();
                            String Aqq = Bx7.Aqq();
                            if (Anz == null) {
                                Anz = "";
                            }
                            if (C5i == null) {
                                C5i = "";
                            }
                            if (Aqq == null) {
                                Aqq = "";
                            }
                            C65750TtP A002 = AbstractC65749TtO.A00(null, null, null, null, null, Anz, Aqq, c139366Sr.EqO(), interfaceC11380iw.getModuleName(), "IG_FEED", C5i, Acw, null);
                            A01.A04(new C42107IlH(), A002, A01.A02(A002, true));
                        } catch (C902840n e) {
                            C0w9.A07("igbv_feed_sn_prefetch_invalid_req_params", e);
                        }
                    }
                }
                list.add(new C902940o(arrayList, i, 1));
                return;
            }
            return;
        }
        if (c38321qM.A55()) {
            if (c38321qM.A5M()) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36328615801011893L)) {
                    if (C18U.A06(c06090Tz, userSession, 36328615801142966L) && !C1BU.A00().A03()) {
                        j = 36610090777909260L;
                    } else {
                        j = 36610090777778187L;
                    }
                    i2 = Long.valueOf(C18U.A01(c06090Tz, userSession, j)).intValue();
                } else {
                    i2 = 2;
                    if (C1BU.A00().A03()) {
                        i2 = 1;
                    }
                }
                if (C18U.A06(c06090Tz, userSession, 36328615801274039L)) {
                    A0p = c38321qM.A0q();
                } else {
                    A0p = c38321qM.A0p();
                }
                int min = Math.min(i2, A0p);
                int A0x = c38321qM.A0x();
                int min2 = Math.min(min, c38321qM.A0p() - A0x);
                ArrayList arrayList2 = new ArrayList(Math.max(min2, 0));
                for (int i4 = A0x; i4 < A0x + min2; i4++) {
                    int A0x2 = i4 - c38321qM.A0x();
                    C38321qM A1e = c38321qM.A1e(i4);
                    if (A1e != null) {
                        arrayList2.add(new C43121yf(C3ZH.A03(context, userSession, A1e, C05F.A00, interfaceC11380iw.getModuleName()), new C3ZN(new Pair(Integer.valueOf(i), Integer.valueOf(A0x2)), c38321qM.CCj())));
                    }
                }
                c9bp = new C902940o(arrayList2, i, 1);
            } else {
                if (C18U.A06(C06090Tz.A06, userSession, 36319789643275957L) || C18U.A06(C06090Tz.A05, userSession, 36319789643210420L)) {
                    AbstractC131155w3.A00(context, userSession, c38321qM, interfaceC11380iw.getModuleName());
                }
                C3ZM A03 = C3ZH.A03(context, userSession, c38321qM, C05F.A00, interfaceC11380iw.getModuleName());
                Integer valueOf = Integer.valueOf(i);
                C43121yf c43121yf = new C43121yf(A03, new C3ZN(new Pair(valueOf, 0), c38321qM.CCj()));
                C14360o3.A0B(userSession, 2);
                if (c38321qM.CdW() && (injected = c38321qM.A0C.getInjected()) != null && (BFN = injected.BFN()) != null && (Bqu = BFN.Bqu()) != null) {
                    C06090Tz c06090Tz2 = C06090Tz.A05;
                    if (C18U.A06(c06090Tz2, userSession, 36323676588682731L) && (C1BU.A00().A03() || C18U.A06(c06090Tz2, userSession, 36323676588748268L))) {
                        c9bp = new C9BP(ImmutableList.of((Object) c43121yf, (Object) new C43121yf(C3ZH.A06(userSession, new SimpleImageUrl(Bqu), interfaceC11380iw.getModuleName()), new C3ZN(new Pair(valueOf, 0), c38321qM.CCj()))), i);
                    }
                }
                c9bp = new C9BP(c43121yf, i, 0);
            }
            list.add(c9bp);
        }
    }

    public static ArrayList A01(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list, int i) {
        String moduleName = interfaceC11380iw.getModuleName();
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            C38321qM c38321qM = (C38321qM) list.get(i2);
            int i3 = i + i2;
            arrayList.add(new C9BP(new C43121yf(C3ZH.A03(context, userSession, c38321qM, C05F.A00, moduleName), new C3ZN(new Pair(Integer.valueOf(i3), 0), c38321qM.CCj())), i3, 0));
        }
        return arrayList;
    }

    public static void A03(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47K c47k, List list, int i) {
        List A04 = c47k.A04();
        if (A04 != null) {
            int min = Math.min(A04.size(), 2);
            ArrayList arrayList = new ArrayList(min);
            for (int i2 = 0; i2 < min; i2++) {
                Iterator it = ((FOC) A04.get(i2)).A07.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C43121yf(C3ZH.A02(context, userSession, (C38321qM) it.next(), C05F.A00, interfaceC11380iw.getModuleName()), new C3ZN(new Pair(Integer.valueOf(i), Integer.valueOf(i2)), C05F.A0N)));
                }
            }
            list.add(new C902940o(arrayList, i, 1));
        }
    }

    public static void A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Integer num, List list, int i, int i2) {
        C75363a3 CFR;
        ExtendedImageUrl A00;
        String moduleName = interfaceC11380iw.getModuleName();
        if (!c38321qM.Cff() && !c38321qM.A5p()) {
            CFR = null;
        } else {
            CFR = c38321qM.CFR();
        }
        String id = c38321qM.getId();
        InterfaceC59502nt interfaceC59502nt = null;
        if (c38321qM.A1t() != null && (A00 = AbstractC132205xy.A00(userSession, c38321qM, Double.valueOf(C18U.A00(C06090Tz.A05, userSession, 37170691385066001L)))) != null) {
            C1OG A0J = C25821No.A00().A0J(A00, moduleName);
            A0J.A0I = true;
            A0J.A05 = userSession;
            A0J.A0L = false;
            c38321qM.A18();
            String BU6 = c38321qM.BU6();
            if (!TextUtils.isEmpty(BU6)) {
                A0J.A09 = BU6;
            }
            interfaceC59502nt = A0J.A00();
        }
        list.add(new C43121yf(new C3ZM(interfaceC59502nt, CFR, id), new C3ZN(new Pair(Integer.valueOf(i), Integer.valueOf(i2)), num)));
    }
}
