package X;

import java.util.List;

/* renamed from: X.Mqn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51595Mqn extends C0T6 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51595Mqn) {
                C51595Mqn c51595Mqn = (C51595Mqn) obj;
                if (this.A02 != c51595Mqn.A02 || !C14360o3.A0K(this.A00, c51595Mqn.A00) || !C14360o3.A0K(this.A01, c51595Mqn.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC25225BEi.A08(this.A02) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C51595Mqn(String str, List list, boolean z) {
        this.A02 = z;
        this.A00 = str;
        this.A01 = list;
    }
}
