package X;

/* renamed from: X.5og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127025og {
    public final int A00;
    public final int A01;
    public final InterfaceC122595gu A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127025og) {
                C127025og c127025og = (C127025og) obj;
                if (!C14360o3.A0K(this.A02, c127025og.A02) || this.A01 != c127025og.A01 || this.A00 != c127025og.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.A02);
        sb.append(", startIndex=");
        sb.append(this.A01);
        sb.append(", endIndex=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C127025og(InterfaceC122595gu interfaceC122595gu, int i, int i2) {
        this.A02 = interfaceC122595gu;
        this.A01 = i;
        this.A00 = i2;
    }
}
