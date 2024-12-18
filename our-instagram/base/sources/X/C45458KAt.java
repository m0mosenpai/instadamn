package X;

import java.util.List;

/* renamed from: X.KAt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45458KAt extends AbstractC46391KgD {
    public final C148286ly A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45458KAt) {
                C45458KAt c45458KAt = (C45458KAt) obj;
                if (!C14360o3.A0K(this.A00, c45458KAt.A00) || !C14360o3.A0K(this.A01, c45458KAt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public C45458KAt(C148286ly c148286ly, List list) {
        this.A00 = c148286ly;
        this.A01 = list;
    }
}
