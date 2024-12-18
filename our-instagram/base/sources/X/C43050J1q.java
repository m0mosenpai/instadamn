package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.J1q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43050J1q implements InterfaceC43428JGs {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C43050J1q(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC43428JGs
    public final void DKc(EnumC75193Zm enumC75193Zm) {
        UserSession userSession;
        C38321qM BQN;
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            userSession = ((C37607Gh2) this.A02).A0A;
            BQN = (C38321qM) this.A01;
            if (BQN.getId() != null) {
                z = false;
                z2 = true;
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            userSession = ((DialogInterfaceOnDismissListenerC41846Ig0) this.A02).A02;
            JPd jPd = (JPd) this.A01;
            BQN = jPd.BQN();
            boolean A1W = AbstractC167007dF.A1W(jPd.AiE());
            String id = jPd.getId();
            if (id != null) {
                z = false;
                z2 = true;
                if (A1W) {
                    C109144ve.A00(userSession).A01(id, true);
                    return;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C3YS.A00(userSession).A03(BQN, z2, z);
    }
}
