package X;

import java.util.List;

/* renamed from: X.KiL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46521KiL {
    public String A00;
    public List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46521KiL) {
                C46521KiL c46521KiL = (C46521KiL) obj;
                if (!C14360o3.A0K(this.A00, c46521KiL.A00) || !C14360o3.A0K(this.A01, c46521KiL.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BackupDataEntry(userId=");
        A1C.append(this.A00);
        A1C.append(", features=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
