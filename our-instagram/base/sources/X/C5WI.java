package X;

/* renamed from: X.5WI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WI extends C5WJ {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5WI) {
                C5WJ c5wj = (C5WJ) obj;
                if (!C14360o3.A0K(this.A03, c5wj.A03) || !C14360o3.A0K(this.A02, c5wj.A02) || !C14360o3.A0K(this.A00, c5wj.A00) || !C14360o3.A0K(this.A01, c5wj.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RoundedCornerShape(topStart = ");
        sb.append(this.A03);
        sb.append(", topEnd = ");
        sb.append(this.A02);
        sb.append(", bottomEnd = ");
        sb.append(this.A00);
        sb.append(", bottomStart = ");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
