package X;

import java.util.List;

/* renamed from: X.9ZA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZA extends C0T6 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZA) {
                C9ZA c9za = (C9ZA) obj;
                if (!C14360o3.A0K(this.A00, c9za.A00) || !C14360o3.A0K(this.A01, c9za.A01) || this.A02 != c9za.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, ((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC166997dE.A0I(this.A01)) * 31);
    }

    public C9ZA(String str, List list, boolean z) {
        this.A00 = str;
        this.A01 = list;
        this.A02 = z;
    }
}
