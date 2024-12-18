package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.G2v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36369G2v implements InterfaceC37156GYt {
    public final C18920wW A00;
    public final UserSession A01;
    public final E70 A02;
    public final Context A03;

    public C36369G2v(Context context, C18920wW c18920wW, UserSession userSession, E70 e70) {
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A01 = userSession;
        this.A02 = e70;
        this.A00 = c18920wW;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        String A0u;
        E70 e70 = this.A02;
        int i = e70.A04;
        UserSession userSession = this.A01;
        boolean z = true;
        boolean z2 = false;
        if (i == 0) {
            Boolean bool = (Boolean) AbstractC31237DoK.A00(userSession).A02.getValue();
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            z = !z2;
        } else if (i != 2) {
            z = false;
        }
        boolean z3 = e70.A0r;
        Context context = this.A03;
        if (z3) {
            A0u = AnonymousClass001.A0g(AbstractC166997dE.A0p(context, 2131959136), "\n\n", AbstractC166997dE.A0p(context, 2131959137));
        } else {
            A0u = AbstractC25227BEk.A0u(context, 2131959136);
        }
        C36731GHa A03 = C36731GHa.A03(C35740FqY.A00, this, 21, 2131959135, z);
        A03.A0A = A0u;
        return AbstractC166987dD.A1J(A03);
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return F34.A00(this.A01, this.A02);
    }
}
