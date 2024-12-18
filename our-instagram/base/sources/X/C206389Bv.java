package X;

/* renamed from: X.9Bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206389Bv extends C0T6 {
    public boolean A00;
    public final int A01;
    public final String A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C206389Bv(String str) {
        this(str, false, 2);
        this.A01 = 2;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C206389Bv)) {
                        return false;
                    }
                    C206389Bv c206389Bv = (C206389Bv) obj;
                    if (c206389Bv.A01 != 0 || this.A00 != c206389Bv.A00 || !C14360o3.A0K(this.A02, c206389Bv.A02)) {
                        return false;
                    }
                    return true;
                }
                return true;
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C206389Bv) {
            C206389Bv c206389Bv2 = (C206389Bv) obj;
            if (c206389Bv2.A01 != i || !C14360o3.A0K(this.A02, c206389Bv2.A02) || this.A00 != c206389Bv2.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        if (this.A01 != 0) {
            i = this.A02.hashCode() * 31;
            hashCode = 1237;
            if (this.A00) {
                hashCode = 1231;
            }
        } else {
            int i2 = 1237;
            if (this.A00) {
                i2 = 1231;
            }
            i = i2 * 31;
            String str = this.A02;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
        }
        return i + hashCode;
    }

    public final String toString() {
        if (this.A01 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MutedWordsMatch(containsMatch=");
        sb.append(this.A00);
        sb.append(", dictionaryId=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C206389Bv(String str, boolean z, int i) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C206389Bv() {
        this(null, false);
        this.A01 = 0;
    }

    public C206389Bv(String str, boolean z) {
        this.A01 = 0;
        this.A00 = z;
        this.A02 = str;
    }
}
