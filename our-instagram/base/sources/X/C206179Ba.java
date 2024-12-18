package X;

/* renamed from: X.9Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206179Ba extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    public C206179Ba(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        this.A00 = i4;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = obj;
        this.A05 = obj2;
    }

    public final boolean equals(Object obj) {
        C206179Ba c206179Ba;
        int i;
        int i2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C206179Ba) {
                    c206179Ba = (C206179Ba) obj;
                    if (c206179Ba.A00 == 1 && this.A01 == c206179Ba.A01 && this.A03 == c206179Ba.A03) {
                        i = this.A02;
                        i2 = c206179Ba.A02;
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
            if (!(obj instanceof C206179Ba)) {
                return false;
            }
            c206179Ba = (C206179Ba) obj;
            if (c206179Ba.A00 != 0 || this.A02 != c206179Ba.A02 || this.A01 != c206179Ba.A01) {
                return false;
            }
            i = this.A03;
            i2 = c206179Ba.A03;
        } else {
            return true;
        }
        if (i != i2 || !C14360o3.A0K(this.A04, c206179Ba.A04) || !C14360o3.A0K(this.A05, c206179Ba.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode;
        if (this.A00 != 0) {
            i = ((this.A01 * 31) + this.A03) * 31;
            i2 = this.A02;
        } else {
            i = ((this.A02 * 31) + this.A01) * 31;
            i2 = this.A03;
        }
        int i3 = (i + i2) * 31;
        Object obj = this.A04;
        int i4 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        Object obj2 = this.A05;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FrameWatchResult(frameCount=");
        sb.append(this.A01);
        sb.append(", smallFrameDrops=");
        sb.append(this.A03);
        sb.append(", largeFrameDrops=");
        sb.append(this.A02);
        sb.append(", avgFrameMetrics=");
        sb.append(this.A04);
        sb.append(", largeFrameDropMetrics=");
        sb.append(this.A05);
        sb.append(')');
        return sb.toString();
    }
}
