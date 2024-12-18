package X;

import java.util.List;

/* renamed from: X.Grf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38236Grf extends C0T6 implements JK1 {
    public final List A00;

    @Override // X.JK1
    public final C38236Grf F2a(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38236Grf) && C14360o3.A0K(this.A00, ((C38236Grf) obj).A00));
    }

    @Override // X.JK1
    public final List C3x() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C38236Grf(List list) {
        this.A00 = list;
    }

    @Override // X.JK1
    public final JK1 EAw(C1DY c1dy) {
        return this;
    }
}
