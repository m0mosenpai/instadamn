package X;

/* renamed from: X.6Ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137476Ks {
    public final String A00;
    public final InterfaceC16820sZ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C137476Ks) {
                C137476Ks c137476Ks = (C137476Ks) obj;
                if (!C14360o3.A0K(this.A00, c137476Ks.A00) || this.A01 != c137476Ks.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomAccessibilityAction(label=");
        sb.append(this.A00);
        sb.append(", action=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C137476Ks(String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = str;
        this.A01 = interfaceC16820sZ;
    }
}
