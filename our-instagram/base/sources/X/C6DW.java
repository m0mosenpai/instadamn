package X;

/* renamed from: X.6DW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DW extends C6DX {
    public final Object A00;
    public final String A01;

    public C6DW(String str, Object obj) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(obj, 2);
        this.A01 = str;
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6DW) {
                C6DW c6dw = (C6DW) obj;
                if (!C14360o3.A0K(this.A01, c6dw.A01) || !C14360o3.A0K(this.A00, c6dw.A00)) {
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
        sb.append("SnapshotUpdate(dataModuleType=");
        sb.append(this.A01);
        sb.append(", snapshot=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
