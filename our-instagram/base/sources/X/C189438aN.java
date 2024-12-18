package X;

import java.util.List;

/* renamed from: X.8aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189438aN extends C0T6 {
    public final C206429Bz A00;
    public final boolean A01;
    public final int A02;
    public final String A03;
    public final List A04;

    public C189438aN(C206429Bz c206429Bz, String str, List list, int i, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(list, 3);
        this.A03 = str;
        this.A02 = i;
        this.A04 = list;
        this.A01 = z;
        this.A00 = c206429Bz;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C189438aN) {
                C189438aN c189438aN = (C189438aN) obj;
                if (!C14360o3.A0K(this.A03, c189438aN.A03) || this.A02 != c189438aN.A02 || !C14360o3.A0K(this.A04, c189438aN.A04) || this.A01 != c189438aN.A01 || !C14360o3.A0K(this.A00, c189438aN.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A03.hashCode() * 31) + this.A02) * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        C206429Bz c206429Bz = this.A00;
        if (c206429Bz == null) {
            hashCode = 0;
        } else {
            hashCode = c206429Bz.hashCode();
        }
        return i2 + hashCode;
    }
}
