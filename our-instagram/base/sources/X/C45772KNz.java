package X;

import java.util.List;

/* renamed from: X.KNz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45772KNz extends AbstractC46412KgY {
    public final String A00;
    public final List A01;
    public final List A02;

    public C45772KNz(List list, List list2, String str) {
        C14360o3.A0B(list, 2);
        this.A00 = str;
        this.A01 = list;
        this.A02 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45772KNz) {
                C45772KNz c45772KNz = (C45772KNz) obj;
                if (!C14360o3.A0K(this.A00, c45772KNz.A00) || !C14360o3.A0K(this.A01, c45772KNz.A01) || !C14360o3.A0K(this.A02, c45772KNz.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A00)) + AbstractC167017dG.A0M(this.A02);
    }
}
