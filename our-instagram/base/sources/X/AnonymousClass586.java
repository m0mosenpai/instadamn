package X;

/* renamed from: X.586, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass586 {
    public long A00;
    public AnonymousClass585 A01;
    public InterfaceC1128957x A02;
    public AnonymousClass583 A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass586) {
                AnonymousClass586 anonymousClass586 = (AnonymousClass586) obj;
                if (!C14360o3.A0K(this.A02, anonymousClass586.A02) || this.A03 != anonymousClass586.A03 || !C14360o3.A0K(this.A01, anonymousClass586.A01) || this.A00 != anonymousClass586.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DrawParams(density=");
        sb.append(this.A02);
        sb.append(", layoutDirection=");
        sb.append(this.A03);
        sb.append(", canvas=");
        sb.append(this.A01);
        sb.append(", size=");
        sb.append((Object) C5YC.A03(this.A00));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31;
        long j = this.A00;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }
}
