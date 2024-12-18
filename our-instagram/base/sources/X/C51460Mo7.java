package X;

import java.util.List;

/* renamed from: X.Mo7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51460Mo7 extends AbstractC53423NkC {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51460Mo7) {
                C51460Mo7 c51460Mo7 = (C51460Mo7) obj;
                if (!C14360o3.A0K(this.A02, c51460Mo7.A02) || !C14360o3.A0K(this.A03, c51460Mo7.A03) || this.A01 != c51460Mo7.A01 || this.A00 != c51460Mo7.A00 || !C14360o3.A0K(this.A04, c51460Mo7.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A01) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C51460Mo7(String str, String str2, List list, int i, int i2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OutputSpec(id=");
        A1C.append(this.A02);
        A1C.append(", name=");
        A1C.append(this.A03);
        A1C.append(", width=");
        MSX.A1O(A1C, this.A01);
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(1415));
        return AbstractC167017dG.A0o(this.A04, A1C);
    }
}
