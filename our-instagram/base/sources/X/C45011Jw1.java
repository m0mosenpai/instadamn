package X;

import java.util.List;

/* renamed from: X.Jw1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45011Jw1 extends C0T6 {
    public final String A00;
    public final List A01;

    public C45011Jw1(String str, List list) {
        C14360o3.A0B(list, 2);
        this.A00 = str;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45011Jw1) {
                C45011Jw1 c45011Jw1 = (C45011Jw1) obj;
                if (!C14360o3.A0K(this.A00, c45011Jw1.A00) || !C14360o3.A0K(this.A01, c45011Jw1.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }
}
