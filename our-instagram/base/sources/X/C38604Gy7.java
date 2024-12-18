package X;

import java.util.List;

/* renamed from: X.Gy7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38604Gy7 extends C0T6 {
    public final C38011pl A00;
    public final List A01;

    public C38604Gy7(C38011pl c38011pl, List list) {
        C14360o3.A0B(list, 2);
        this.A00 = c38011pl;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38604Gy7) {
                C38604Gy7 c38604Gy7 = (C38604Gy7) obj;
                if (!C14360o3.A0K(this.A00, c38604Gy7.A00) || !C14360o3.A0K(this.A01, c38604Gy7.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }
}
