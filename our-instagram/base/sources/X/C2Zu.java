package X;

/* renamed from: X.2Zu, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Zu {
    public EnumC48482Kp A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2Zu) {
                C2Zu c2Zu = (C2Zu) obj;
                if (!C14360o3.A0K(this.A01, c2Zu.A01) || this.A00 != c2Zu.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdAndState(id=");
        sb.append(this.A01);
        sb.append(", state=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
