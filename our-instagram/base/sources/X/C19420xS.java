package X;

/* renamed from: X.0xS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19420xS extends C0T6 {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19420xS) {
                C19420xS c19420xS = (C19420xS) obj;
                if (!C14360o3.A0K(this.A00, c19420xS.A00) || this.A01 != c19420xS.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }

    public C19420xS(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
