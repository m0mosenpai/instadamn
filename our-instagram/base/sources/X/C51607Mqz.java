package X;

import java.util.ArrayList;

/* renamed from: X.Mqz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51607Mqz extends C0T6 {
    public ArrayList A01 = AbstractC166987dD.A1E();
    public String A00 = null;
    public boolean A03 = false;
    public boolean A02 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51607Mqz) {
                C51607Mqz c51607Mqz = (C51607Mqz) obj;
                if (!C14360o3.A0K(this.A01, c51607Mqz.A01) || !C14360o3.A0K(this.A00, c51607Mqz.A00) || this.A03 != c51607Mqz.A03 || this.A02 != c51607Mqz.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A03, (AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A00)) * 31));
    }
}
