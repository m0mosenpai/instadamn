package X;

/* renamed from: X.9Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206369Bt extends C0T6 {
    public final int A00;
    public final int A01;
    public final String A02;

    public C206369Bt(String str, int i, int i2) {
        this.A00 = i2;
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C206369Bt)) {
                        return false;
                    }
                    C206369Bt c206369Bt = (C206369Bt) obj;
                    if (c206369Bt.A00 != 1 || this.A01 != c206369Bt.A01 || !C14360o3.A0K(this.A02, c206369Bt.A02)) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C206369Bt) {
            C206369Bt c206369Bt2 = (C206369Bt) obj;
            if (c206369Bt2.A00 != i || !C14360o3.A0K(this.A02, c206369Bt2.A02) || this.A01 != c206369Bt2.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        if (1 - this.A00 != 0) {
            i = this.A02.hashCode() * 31;
            hashCode = this.A01;
        } else {
            i = this.A01 * 31;
            hashCode = this.A02.hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        StringBuilder sb;
        switch (this.A00) {
            case 1:
                sb = new StringBuilder();
                sb.append("NFTruncationConfig(limit=");
                sb.append(this.A01);
                sb.append(", controlTitle=");
                sb.append(this.A02);
                break;
            case 2:
                sb = new StringBuilder();
                sb.append("SegmentFrame(segmentId=");
                sb.append(this.A02);
                sb.append(", frameMs=");
                sb.append(this.A01);
                break;
            default:
                return super.toString();
        }
        sb.append(')');
        return sb.toString();
    }

    public C206369Bt(int i, String str) {
        this.A00 = 1;
        C14360o3.A0B(str, 2);
        this.A01 = i;
        this.A02 = str;
    }
}
