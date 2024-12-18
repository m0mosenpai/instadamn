package X;

import java.util.List;

/* renamed from: X.Jw3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45013Jw3 extends C0T6 {
    public final C45028JwJ A00;
    public final List A01;

    public C45013Jw3(C45028JwJ c45028JwJ, List list) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = c45028JwJ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45013Jw3) {
                C45013Jw3 c45013Jw3 = (C45013Jw3) obj;
                if (!C14360o3.A0K(this.A01, c45013Jw3.A01) || !C14360o3.A0K(this.A00, c45013Jw3.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00);
    }
}
