package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.2us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63712us {
    public final C57112jm A00;
    public final C63622uj A01;
    public final C63722ut A02;

    public C63712us(UserSession userSession, C57112jm c57112jm, InterfaceC63682up interfaceC63682up, C1M1 c1m1) {
        C14360o3.A0B(c1m1, 2);
        this.A00 = c57112jm;
        C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A00;
        C14360o3.A07(c1bx);
        this.A02 = new C63722ut(c1bx, interfaceC63682up, c1m1.getSessionId());
        this.A01 = new C63622uj();
    }

    public final void A00(C47K c47k, C47O c47o) {
        int A01 = c47k.A01(c47o);
        C63622uj c63622uj = this.A01;
        if (C14360o3.A0K(c63622uj.A00(c47o.A03.getId()), C59062n7.A07)) {
            String id = c47o.A03.getId();
            C59072n8 c59072n8 = new C59072n8(new Pair(c47k, c47o), Integer.valueOf(A01), c47o.A03.getId());
            c59072n8.A00(this.A02);
            c63622uj.A01(c59072n8.A01(), id);
        }
    }
}
