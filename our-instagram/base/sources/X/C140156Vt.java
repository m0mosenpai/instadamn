package X;

/* renamed from: X.6Vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140156Vt {
    public final int A00;
    public final C102884kP A01;
    public final InterfaceC103384lE A02;
    public final Object A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140156Vt) {
                C140156Vt c140156Vt = (C140156Vt) obj;
                if (this.A00 != c140156Vt.A00 || !C14360o3.A0K(this.A01, c140156Vt.A01) || !C14360o3.A0K(this.A02, c140156Vt.A02) || !C14360o3.A0K(this.A03, c140156Vt.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A00 * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        Object obj = this.A03;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeBindingArgs(attributeKey=");
        sb.append(this.A00);
        sb.append(", model=");
        sb.append(this.A01);
        sb.append(", script=");
        sb.append(this.A02);
        sb.append(", defaultValue=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C140156Vt(C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, Object obj, int i) {
        this.A00 = i;
        this.A01 = c102884kP;
        this.A02 = interfaceC103384lE;
        this.A03 = obj;
    }
}
