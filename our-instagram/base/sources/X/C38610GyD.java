package X;

import java.util.List;

/* renamed from: X.GyD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38610GyD extends C0T6 {
    public final C38321qM A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38610GyD) {
                C38610GyD c38610GyD = (C38610GyD) obj;
                if (!C14360o3.A0K(this.A01, c38610GyD.A01) || !C14360o3.A0K(this.A02, c38610GyD.A02) || !C14360o3.A0K(this.A00, c38610GyD.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38610GyD(C38321qM c38321qM, String str, List list) {
        this.A01 = str;
        this.A02 = list;
        this.A00 = c38321qM;
    }
}
