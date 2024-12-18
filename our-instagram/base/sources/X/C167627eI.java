package X;

import com.instagram.user.model.User;

/* renamed from: X.7eI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167627eI extends AbstractC167617eH {
    public final int A00;
    public final User A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167627eI) {
                C167627eI c167627eI = (C167627eI) obj;
                if (this.A03 != c167627eI.A03 || this.A02 != c167627eI.A02 || !C14360o3.A0K(this.A01, c167627eI.A01) || this.A00 != c167627eI.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        return ((((i2 + i3) * 31) + this.A01.hashCode()) * 31) + this.A00;
    }

    public C167627eI(User user, int i, boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = user;
        this.A00 = i;
    }
}
