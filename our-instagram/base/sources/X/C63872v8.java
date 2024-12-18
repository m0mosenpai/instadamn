package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.2v8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63872v8 {
    public final C57112jm A00;
    public final C63622uj A01;
    public final C63882v9 A02;

    public final void A00(C47K c47k, FOC foc) {
        C63622uj c63622uj = this.A01;
        String str = foc.A04;
        C59062n7 A00 = c63622uj.A00(str);
        int A002 = c47k.A00(foc);
        if (A00 == C59062n7.A07) {
            C59072n8 c59072n8 = new C59072n8(new Pair(c47k, foc), Integer.valueOf(A002), str);
            c59072n8.A00(this.A02);
            c63622uj.A01(c59072n8.A01(), str);
        }
    }

    public C63872v8(UserSession userSession, C57112jm c57112jm, InterfaceC63842v5 interfaceC63842v5, C1M1 c1m1) {
        this.A00 = c57112jm;
        C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A00;
        C14360o3.A07(c1bx);
        this.A02 = new C63882v9(c1bx, interfaceC63842v5, c1m1.getSessionId());
        this.A01 = new C63622uj();
    }
}
