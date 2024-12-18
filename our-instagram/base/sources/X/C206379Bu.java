package X;

/* renamed from: X.9Bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206379Bu extends C0T6 {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final String A03;

    public C206379Bu(int i, int i2, String str) {
        C14360o3.A0B(str, 3);
        this.A01 = i;
        this.A02 = i2;
        this.A03 = str;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C206379Bu) {
                    C206379Bu c206379Bu = (C206379Bu) obj;
                    if (c206379Bu.A00 != 1 || this.A01 != c206379Bu.A01 || this.A02 != c206379Bu.A02 || !C14360o3.A0K(this.A03, c206379Bu.A03)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C206379Bu)) {
                return false;
            }
            C206379Bu c206379Bu2 = (C206379Bu) obj;
            if (c206379Bu2.A00 != 0 || !C14360o3.A0K(this.A03, c206379Bu2.A03) || this.A02 != c206379Bu2.A02 || this.A01 != c206379Bu2.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        if (this.A00 != 0) {
            hashCode = ((this.A01 * 31) + this.A02) * 31;
            i = this.A03.hashCode();
        } else {
            hashCode = ((this.A03.hashCode() * 31) + this.A02) * 31;
            i = this.A01;
        }
        return hashCode + i;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TooltipDataItem(count=");
        sb.append(this.A01);
        sb.append(", resId=");
        sb.append(this.A02);
        sb.append(", useCase=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C206379Bu(String str, int i, int i2) {
        this.A03 = str;
        this.A02 = i;
        this.A01 = i2;
    }
}
