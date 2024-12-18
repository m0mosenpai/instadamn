package X;

import java.util.ArrayList;

/* renamed from: X.GyH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38614GyH extends C0T6 {
    public ArrayList A01 = AbstractC166987dD.A1E();
    public String A00 = null;
    public boolean A02 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38614GyH) {
                C38614GyH c38614GyH = (C38614GyH) obj;
                if (!C14360o3.A0K(this.A01, c38614GyH.A01) || !C14360o3.A0K(this.A00, c38614GyH.A00) || this.A02 != c38614GyH.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, (AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A00)) * 31);
    }
}
