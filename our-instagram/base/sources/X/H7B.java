package X;

import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class H7B extends C0T6 implements InterfaceC66482zP {
    public final C41634IbP A00;
    public final User A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7B) {
                H7B h7b = (H7B) obj;
                if (!C14360o3.A0K(this.A01, h7b.A01) || !C14360o3.A0K(this.A02, h7b.A02) || !C14360o3.A0K(this.A00, h7b.A00) || this.A03 != h7b.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String A0e = AbstractC37302Gc3.A0e(this.A01);
        C14360o3.A0A(A0e);
        return A0e;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A01))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        User user;
        H7B h7b = (H7B) obj;
        User user2 = this.A01;
        if (h7b != null) {
            user = h7b.A01;
        } else {
            user = null;
        }
        if (C14360o3.A0K(user2, user) && C14360o3.A0K(this.A02, h7b.A02) && C14360o3.A0K(this.A00, h7b.A00) && this.A03 == h7b.A03) {
            return true;
        }
        return false;
    }

    public H7B(C41634IbP c41634IbP, User user, String str, boolean z) {
        this.A01 = user;
        this.A02 = str;
        this.A00 = c41634IbP;
        this.A03 = z;
    }
}
