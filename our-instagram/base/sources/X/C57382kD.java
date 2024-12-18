package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2kD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57382kD {
    public final UserSession A00;

    public final boolean A02(C38321qM c38321qM) {
        if (c38321qM == null) {
            return false;
        }
        C38321qM A1g = c38321qM.A1g(this.A00);
        return A1g.A5M() && !A1g.CdW() && A00();
    }

    public final boolean A00() {
        return C18U.A06(C06090Tz.A05, this.A00, 36323264271887486L);
    }

    public final boolean A01() {
        if (C18U.A06(C06090Tz.A05, this.A00, 36318741672171973L) && A00()) {
            return true;
        }
        return false;
    }

    public final boolean A03(C38321qM c38321qM, boolean z) {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
        if (A00.A01.getInt(AbstractC111324zv.A00(2035), 0) < 3 && C23031Ai.A07(A00, AbstractC111324zv.A00(2034), 1L) && A02(c38321qM) && !z) {
            return true;
        }
        return false;
    }

    public C57382kD(UserSession userSession) {
        this.A00 = userSession;
    }
}
