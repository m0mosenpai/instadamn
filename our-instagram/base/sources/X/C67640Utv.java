package X;

import java.util.List;

/* renamed from: X.Utv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67640Utv extends AbstractC46363Kfl {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C67640Utv) {
                C67640Utv c67640Utv = (C67640Utv) obj;
                if (!C14360o3.A0K(this.A01, c67640Utv.A01) || !C14360o3.A0K(this.A00, c67640Utv.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = AbstractC167017dG.A0M(this.A01) * 31;
        List list = this.A00;
        if (list != null) {
            i = list.hashCode();
        }
        return A0M + i;
    }

    public C67640Utv(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public C67640Utv() {
        this(null, null);
    }
}
