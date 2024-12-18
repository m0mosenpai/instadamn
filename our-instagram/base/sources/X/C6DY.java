package X;

/* renamed from: X.6DY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DY extends C6DX {
    public final Object A00;
    public final String A01;

    public C6DY(String str, Object obj) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6DY) {
                C6DY c6dy = (C6DY) obj;
                if (!C14360o3.A0K(this.A01, c6dy.A01) || !C14360o3.A0K(this.A00, c6dy.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        Object obj = this.A00;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VariableUpdate(variableIdentifier=");
        sb.append(this.A01);
        sb.append(AbstractC43591JPw.A00(15));
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
