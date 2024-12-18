package X;

import com.meta.foa.session.FoaUserSession;

/* renamed from: X.CVa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27978CVa {
    public final FoaUserSession A00;
    public final C28280CdP A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27978CVa) {
                C27978CVa c27978CVa = (C27978CVa) obj;
                if (!C14360o3.A0K(this.A00, c27978CVa.A00) || !C14360o3.A0K(this.A01, c27978CVa.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C27978CVa(FoaUserSession foaUserSession, C28280CdP c28280CdP) {
        this.A00 = foaUserSession;
        this.A01 = c28280CdP;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WriteWithAIArgs(foaUserSession=");
        A1C.append(this.A00);
        A1C.append(", params=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
