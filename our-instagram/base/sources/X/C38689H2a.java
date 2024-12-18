package X;

import java.util.List;

/* renamed from: X.H2a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38689H2a extends C0T6 implements JIU {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38689H2a) {
                C38689H2a c38689H2a = (C38689H2a) obj;
                if (!C14360o3.A0K(this.A00, c38689H2a.A00) || this.A01 != c38689H2a.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public C38689H2a(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
