package X;

/* renamed from: X.8TE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TE extends C8T0 {
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8TE) {
                C8TE c8te = (C8TE) obj;
                if (this.A01 != c8te.A01 || this.A00 != c8te.A00 || !C14360o3.A0K(this.A02, c8te.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A01 * 31) + this.A00) * 31;
        String str = this.A02;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextSelectedState(selectedRow=");
        sb.append(this.A01);
        sb.append(", selectedIndex=");
        sb.append(this.A00);
        sb.append(", selectedVoiceName=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C8TE(int i, int i2, String str) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }
}
