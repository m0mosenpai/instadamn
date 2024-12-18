package X;

/* renamed from: X.9CA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CA extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9CA(int i, int i2, String str) {
        this(str, i, i2, 0, "");
        this.A00 = 0;
        this.A00 = 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9CA) {
                    C9CA c9ca = (C9CA) obj;
                    if (c9ca.A00 == 1 && this.A01 == c9ca.A01 && this.A02 == c9ca.A02 && C14360o3.A0K(this.A04, c9ca.A04)) {
                        str = this.A03;
                        str2 = c9ca.A03;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C9CA)) {
                return false;
            }
            C9CA c9ca2 = (C9CA) obj;
            if (c9ca2.A00 != 0 || this.A02 != c9ca2.A02 || this.A01 != c9ca2.A01 || !C14360o3.A0K(this.A03, c9ca2.A03)) {
                return false;
            }
            str = this.A04;
            str2 = c9ca2.A04;
        } else {
            return true;
        }
        if (!C14360o3.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str;
        if (this.A00 != 0) {
            hashCode = ((((this.A01 * 31) + this.A02) * 31) + this.A04.hashCode()) * 31;
            str = this.A03;
        } else {
            hashCode = ((((this.A02 * 31) + this.A01) * 31) + this.A03.hashCode()) * 31;
            str = this.A04;
        }
        return hashCode + str.hashCode();
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PatternMatch(startPosition=");
        sb.append(this.A02);
        sb.append(MSV.A00(291));
        sb.append(this.A01);
        sb.append(", dictionaryId=");
        sb.append(this.A03);
        sb.append(", matchedDictionaryWord=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C9CA(String str, int i, int i2, int i3, String str2) {
        this.A00 = i3;
        if (i3 != 0) {
            this.A01 = i;
            this.A02 = i2;
            this.A04 = str;
            this.A03 = str2;
            return;
        }
        this.A02 = i;
        this.A01 = i2;
        this.A03 = str;
        this.A04 = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9CA() {
        this("", -1, -1, 0, "");
        this.A00 = 0;
    }
}
