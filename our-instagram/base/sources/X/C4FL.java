package X;

import com.instagram.user.model.User;

/* renamed from: X.4FL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FL extends C4F4 {
    public final User A00;
    public final String A01;
    public final boolean A02;

    public C4FL(User user, String str, boolean z) {
        C14360o3.A0B(str, 3);
        this.A00 = user;
        this.A02 = z;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4FL) {
                C4FL c4fl = (C4FL) obj;
                if (!C14360o3.A0K(this.A00, c4fl.A00) || this.A02 != c4fl.A02 || !C14360o3.A0K(this.A01, c4fl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        User user;
        C4FL c4fl = (C4FL) obj;
        String id = this.A00.getId();
        if (c4fl != null && (user = c4fl.A00) != null) {
            str = user.getId();
        } else {
            str = null;
        }
        if (C14360o3.A0K(id, str) && this.A02 == c4fl.A02 && C14360o3.A0K(this.A01, c4fl.A01)) {
            return true;
        }
        return false;
    }
}
