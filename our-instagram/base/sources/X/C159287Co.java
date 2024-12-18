package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7Co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159287Co {
    public final C159297Cp A00;
    public final List A01;
    public final Activity A02;
    public final C159337Ct A03;
    public final C159337Ct A04;
    public final C159337Ct A05;
    public final C159337Ct A06;
    public final C159337Ct A07;
    public final C159337Ct A08;

    /* JADX WARN: Type inference failed for: r15v1, types: [X.7Hh, X.7Hi] */
    public C159287Co(Activity activity, View view, View view2, View view3, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C2EE c2ee, C160467Hg c160467Hg, C160477Hh c160477Hh, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 7);
        this.A02 = activity;
        this.A00 = new C159297Cp();
        C159337Ct c159337Ct = new C159337Ct(view3, new C159307Cq(userSession, interfaceC16820sZ), EnumC159327Cs.A02);
        this.A08 = c159337Ct;
        C7D0 c7d0 = new C7D0(userSession, new C159347Cu(c160477Hh));
        EnumC159327Cs enumC159327Cs = EnumC159327Cs.A04;
        C159337Ct c159337Ct2 = new C159337Ct(view2, c7d0, enumC159327Cs);
        this.A04 = c159337Ct2;
        C159337Ct c159337Ct3 = new C159337Ct(view2, new C7D1(userSession, new C159347Cu(c160477Hh)), enumC159327Cs);
        this.A05 = c159337Ct3;
        C159337Ct c159337Ct4 = null;
        if (c160467Hg != null) {
            c159337Ct4 = new C159337Ct(view2, new C7D4(interfaceC11380iw, userSession, C7D2.A01(c2ee.BlE()), c160467Hg, new C160477Hh(c160477Hh), str, z), enumC159327Cs);
        }
        this.A03 = c159337Ct4;
        C159337Ct c159337Ct5 = new C159337Ct(view, new C7D5(userSession, c2ee), EnumC159327Cs.A03);
        this.A06 = c159337Ct5;
        C159337Ct c159337Ct6 = new C159337Ct(view2, new C7D6(userSession, new C159347Cu(c160477Hh)), enumC159327Cs);
        this.A07 = c159337Ct6;
        this.A01 = AbstractC16960so.A1N(c159337Ct6, c159337Ct, c159337Ct2, c159337Ct3, c159337Ct4, c159337Ct5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00c8, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3.A03, 36324071726067578L) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.EnumC159327Cs r23) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159287Co.A00(X.7Cs):void");
    }
}
