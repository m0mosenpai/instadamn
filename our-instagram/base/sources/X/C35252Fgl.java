package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fgl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35252Fgl {
    public C32056E6i A00;

    public C35252Fgl(C206269Bj c206269Bj, UserSession userSession, C7U0 c7u0) {
        boolean z;
        EnumC31648DvE enumC31648DvE;
        boolean z2;
        boolean z3;
        String str;
        C81543kP c81543kP;
        List list;
        C14360o3.A0B(c7u0, 2);
        InterfaceC163837Ux C7r = c7u0.C7r();
        InterfaceC83733oI CCa = C7r.CCa();
        String C7q = C7r.C7q();
        C3o9 B90 = C7r.B90();
        String str2 = C7r.C7W().A0W;
        boolean z4 = C7r.C7W().A1B;
        ArrayList A03 = A03(c206269Bj, userSession, c7u0);
        ArrayList A032 = A03(c206269Bj, userSession, c7u0);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC25232BEp.A1Q(((C32107E9f) next).A00.getId(), userSession.userId, next, A1E);
        }
        String str3 = userSession.userId;
        List list2 = C7r.C7W().A0Z;
        boolean CPb = C7r.CPb(userSession.userId);
        if (c206269Bj != null && (c81543kP = (C81543kP) c206269Bj.A02) != null && (list = c81543kP.A0E) != null) {
            z = list.contains(userSession.userId);
        } else {
            z = false;
        }
        int A00 = AbstractC31172DnG.A00(C7r);
        ThemeViewModelDelegate A002 = AbstractC34894FZg.A00(C7r.C7W().A0I);
        ImageUrl imageUrl = C7r.C7W().A0E;
        if (C7r.CaB()) {
            enumC31648DvE = EnumC31648DvE.A08;
        } else {
            EnumC46982Dm C4i = C7r.C4i();
            if (C4i != null && C4i.ordinal() == 3) {
                enumC31648DvE = EnumC31648DvE.A03;
            } else {
                int C7E = C7r.C7E(C7r.C7W().A0w);
                if (C7E != 0) {
                    if (C7E != 1) {
                        if (C7E != 2) {
                            enumC31648DvE = EnumC31648DvE.A06;
                        } else {
                            enumC31648DvE = EnumC31648DvE.A0C;
                        }
                    } else {
                        enumC31648DvE = EnumC31648DvE.A04;
                    }
                } else {
                    enumC31648DvE = EnumC31648DvE.A0A;
                }
            }
        }
        String str4 = enumC31648DvE.A00;
        boolean z5 = C7r.C7W().A1A;
        boolean CX1 = C7r.CX1();
        boolean CWO = C7r.CWO();
        boolean CVY = C7r.CVY();
        boolean z6 = C7r.C7W().A16;
        boolean CaB = C7r.CaB();
        boolean CeW = C7r.CeW();
        if (c206269Bj != null) {
            z2 = c206269Bj.A05;
        } else {
            z2 = false;
        }
        String Bj3 = C7r.Bj3();
        if (C7r instanceof C163827Uw) {
            String A003 = AbstractC111324zv.A00(485);
            C14360o3.A0C(C7r, A003);
            C163827Uw c163827Uw = (C163827Uw) C7r;
            C2EC c2ec = c163827Uw.A07;
            c2ec.getClass();
            z3 = c2ec.CVT();
            C14360o3.A0C(C7r, A003);
            C2EC c2ec2 = c163827Uw.A07;
            c2ec2.getClass();
            str = c2ec2.BAY();
        } else {
            z3 = false;
            str = null;
        }
        this.A00 = new C32056E6i(imageUrl, A002, A02(c206269Bj), AbstractC160867Iu.A00(C7r.BAZ()), CCa, B90, C7q, str2, str3, str4, Bj3, str, A03, A1E, list2, A00, C7r.AdZ(), z4, CPb, z, z5, CX1, CWO, CVY, z6, CaB, CeW, z2, z3, C161867Mw.A02(C7r.C7W().A0G));
    }

    public static C32056E6i A00(C206269Bj c206269Bj, UserSession userSession, C7U0 c7u0) {
        return new C35252Fgl(c206269Bj, userSession, c7u0).A04();
    }

    public static C32056E6i A01(UserSession userSession, E70 e70) {
        return new C35252Fgl(userSession, e70).A04();
    }

    public static C81543kP A02(C206269Bj c206269Bj) {
        if (c206269Bj != null) {
            return (C81543kP) c206269Bj.A02;
        }
        return null;
    }

    public final C32056E6i A04() {
        C32056E6i c32056E6i = this.A00;
        if (c32056E6i != null) {
            return c32056E6i;
        }
        C14360o3.A0F("nullStateThreadViewData");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        if (r3 == 8) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A03(X.C206269Bj r30, com.instagram.common.session.UserSession r31, X.C7U0 r32) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35252Fgl.A03(X.9Bj, com.instagram.common.session.UserSession, X.7U0):java.util.ArrayList");
    }

    public C35252Fgl(UserSession userSession, E70 e70) {
        boolean z;
        String str;
        List list;
        C14360o3.A0B(userSession, 1);
        InterfaceC83733oI interfaceC83733oI = e70.A0L;
        String str2 = e70.A0Q;
        C3o9 A08 = e70.A08();
        String str3 = e70.A0P;
        boolean z2 = e70.A0x;
        List A0a = AbstractC001800i.A0a(e70.A0T);
        List A0n = AbstractC31171DnF.A0n(e70.A0c);
        String str4 = userSession.userId;
        List list2 = e70.A0S;
        boolean A0E = e70.A0E(str4);
        C81543kP c81543kP = e70.A0E;
        if (c81543kP != null && (list = c81543kP.A0E) != null) {
            z = list.contains(userSession.userId);
        } else {
            z = false;
        }
        int i = e70.A09;
        C32065E6r c32065E6r = e70.A0J;
        C14360o3.A0B(c32065E6r, 0);
        ThemeViewModelDelegate themeViewModelDelegate = new ThemeViewModelDelegate(c32065E6r.A09, c32065E6r.A0A, c32065E6r.A08, c32065E6r.A06, c32065E6r.A07, c32065E6r.A05, c32065E6r.A0C, c32065E6r.A0B, c32065E6r.A04, c32065E6r.A03, c32065E6r.A01, c32065E6r.A02, c32065E6r.A00);
        ImageUrl imageUrl = (i != 29 || c81543kP == null || (imageUrl = c81543kP.A04) == null) ? e70.A0C : imageUrl;
        String str5 = e70.A0N;
        boolean z3 = e70.A0v;
        boolean z4 = e70.A0n;
        boolean z5 = e70.A0k;
        boolean A04 = E70.A04(e70);
        boolean A0D = e70.A0D();
        boolean A0C = e70.A0C();
        boolean z6 = e70.A0e;
        boolean z7 = e70.A12;
        if (c81543kP != null) {
            str = c81543kP.A07;
        } else {
            str = null;
        }
        this.A00 = new C32056E6i(imageUrl, themeViewModelDelegate, c81543kP, e70.A0I, interfaceC83733oI, A08, str2, str3, str4, str5, str, e70.A0O, A0a, A0n, list2, i, e70.A06(), z2, A0E, z, z3, z4, z5, A04, A0D, A0C, z6, z7, e70.A0j, e70.A0m);
    }

    public C35252Fgl() {
    }
}
