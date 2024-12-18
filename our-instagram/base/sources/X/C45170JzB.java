package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.JzB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45170JzB extends C0T6 implements MRM {
    public final C38321qM A00;
    public final boolean A01;
    public final String A02;

    public C45170JzB(C38321qM c38321qM) {
        String str;
        User Bgg;
        C14360o3.A0B(c38321qM, 1);
        this.A00 = c38321qM;
        this.A01 = c38321qM.A5y();
        InterfaceC99334d2 A0h = AbstractC43592JPx.A0h(c38321qM);
        if (A0h != null && (Bgg = A0h.Bgg()) != null) {
            str = Bgg.getUsername();
        } else {
            str = null;
        }
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45170JzB) && C14360o3.A0K(this.A00, ((C45170JzB) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.MRM
    public final Boolean Akb() {
        InterfaceC99334d2 A0h = AbstractC43592JPx.A0h(this.A00);
        if (A0h != null) {
            return A0h.Akb();
        }
        return null;
    }

    @Override // X.MRM
    public final Boolean Aki() {
        boolean z;
        InterfaceC99334d2 A0h;
        C38321qM c38321qM = this.A00;
        InterfaceC99334d2 A0h2 = AbstractC43592JPx.A0h(c38321qM);
        if (A0h2 != null) {
            z = AbstractC31177DnL.A1b(A0h2.Cam());
        } else {
            z = false;
        }
        if (z || c38321qM.A00 != 0 || (A0h = AbstractC43592JPx.A0h(c38321qM)) == null) {
            return null;
        }
        return A0h.Aki();
    }

    @Override // X.MRM
    public final Integer Axb() {
        int i;
        Integer Axb;
        InterfaceC99334d2 A0h = AbstractC43592JPx.A0h(this.A00);
        if (A0h != null && (Axb = A0h.Axb()) != null) {
            i = Axb.intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // X.MRM
    public final String Bgh() {
        return this.A02;
    }

    @Override // X.MRM
    public final String Bjv() {
        C4d0 BuA;
        C38321qM Bjw;
        InterfaceC99334d2 A0h = AbstractC43592JPx.A0h(this.A00);
        if (A0h != null && (BuA = A0h.BuA()) != null && (Bjw = BuA.Bjw()) != null) {
            return Bjw.getId();
        }
        return null;
    }

    @Override // X.MRM
    public final String Bnv() {
        C4d0 BuA;
        C38321qM Bnw;
        InterfaceC99334d2 A0h = AbstractC43592JPx.A0h(this.A00);
        if (A0h != null && (BuA = A0h.BuA()) != null && (Bnw = BuA.Bnw()) != null) {
            return Bnw.getId();
        }
        return null;
    }

    @Override // X.MRM
    public final User Bnx(UserSession userSession) {
        C4d0 BuA;
        C38321qM Bnw;
        InterfaceC99334d2 A0h = AbstractC43592JPx.A0h(this.A00);
        if (A0h != null && (BuA = A0h.BuA()) != null && (Bnw = BuA.Bnw()) != null) {
            return Bnw.A2E(userSession);
        }
        return null;
    }

    @Override // X.MRM
    public final User CDk(UserSession userSession) {
        return this.A00.A2E(userSession);
    }

    @Override // X.MRM
    public final boolean Cb2() {
        return this.A01;
    }

    @Override // X.MRM
    public final String getId() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw AbstractC166997dE.A0g();
    }
}
