package X;

import java.util.List;

/* renamed from: X.Mqp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51597Mqp extends C0T6 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C51597Mqp(String str, List list, boolean z) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A02 = z;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51597Mqp) {
                C51597Mqp c51597Mqp = (C51597Mqp) obj;
                if (!C14360o3.A0K(this.A01, c51597Mqp.A01) || this.A02 != c51597Mqp.A02 || !C14360o3.A0K(this.A00, c51597Mqp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0O(this.A00);
    }
}
