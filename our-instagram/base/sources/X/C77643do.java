package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.3do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77643do {
    public final C76313bb A00;

    public final View.OnTouchListener A00(C76353bf c76353bf, String str) {
        User A2E;
        C14360o3.A0B(c76353bf, 0);
        C76313bb c76313bb = this.A00;
        C38321qM c38321qM = c76353bf.A01;
        C14360o3.A0B(c38321qM, 0);
        if ((c38321qM.A0A != null) || (A2E = c38321qM.A2E(c76313bb.A00)) == null) {
            return null;
        }
        InterfaceC75453aC interfaceC75453aC = c76313bb.A01;
        String id = A2E.getId();
        if (str == null) {
            str = "";
        }
        return interfaceC75453aC.DuM(c38321qM, id, str);
    }

    public final void A01(C76353bf c76353bf, int i) {
        C14360o3.A0B(c76353bf, 0);
        C76313bb c76313bb = this.A00;
        C38321qM c38321qM = c76353bf.A01;
        C75113Zb c75113Zb = c76353bf.A02;
        boolean z = c76353bf.A04;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        if (c38321qM.A0A == null) {
            c76313bb.A01.D3k(c38321qM, c75113Zb, i, z);
        }
    }

    public final void A02(C76353bf c76353bf, int i) {
        C14360o3.A0B(c76353bf, 0);
        C76313bb c76313bb = this.A00;
        C38321qM c38321qM = c76353bf.A01;
        C75113Zb c75113Zb = c76353bf.A02;
        boolean z = c76353bf.A04;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        if (c38321qM.A0A == null) {
            User A2E = c38321qM.A2E(c76313bb.A00);
            InterfaceC75453aC interfaceC75453aC = c76313bb.A01;
            if (A2E != null) {
                interfaceC75453aC.D4g(c38321qM, c75113Zb, A2E.getId(), i, z);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C77643do(C76313bb c76313bb) {
        this.A00 = c76313bb;
    }
}
