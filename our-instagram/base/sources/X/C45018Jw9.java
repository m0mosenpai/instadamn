package X;

import java.util.List;

/* renamed from: X.Jw9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45018Jw9 extends C0T6 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C45018Jw9(String str, List list, boolean z) {
        C14360o3.A0B(list, 3);
        this.A00 = str;
        this.A02 = z;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45018Jw9) {
                C45018Jw9 c45018Jw9 = (C45018Jw9) obj;
                if (!C14360o3.A0K(this.A00, c45018Jw9.A00) || this.A02 != c45018Jw9.A02 || !C14360o3.A0K(this.A01, c45018Jw9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC167017dG.A0O(this.A00) * 31));
    }
}
