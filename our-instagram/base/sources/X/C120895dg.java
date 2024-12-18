package X;

/* renamed from: X.5dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120895dg {
    public final String A00;
    public final InterfaceC09250da A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C120895dg) {
                C120895dg c120895dg = (C120895dg) obj;
                if (!C14360o3.A0K(this.A00, c120895dg.A00) || !C14360o3.A0K(this.A01, c120895dg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.A00;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        InterfaceC09250da interfaceC09250da = this.A01;
        if (interfaceC09250da != null) {
            i2 = interfaceC09250da.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccessibilityAction(label=");
        sb.append(this.A00);
        sb.append(", action=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C120895dg(String str, InterfaceC09250da interfaceC09250da) {
        this.A00 = str;
        this.A01 = interfaceC09250da;
    }
}
