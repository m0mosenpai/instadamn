package X;

import java.util.List;

/* renamed from: X.6AY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AY {
    public final C2W2 A00;
    public final Object A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6AY) {
                C6AY c6ay = (C6AY) obj;
                if (!C14360o3.A0K(this.A00, c6ay.A00) || !C14360o3.A0K(this.A01, c6ay.A01) || !C14360o3.A0K(this.A02, c6ay.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C2W2 c2w2 = this.A00;
        int hashCode = (c2w2 == null ? 0 : c2w2.hashCode()) * 31;
        Object obj = this.A01;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        List list = this.A02;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResolveResult(resolvedNode=");
        sb.append(this.A00);
        sb.append(", resolvedState=");
        sb.append(this.A01);
        sb.append(", appliedStateUpdates=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C6AY(C2W2 c2w2, Object obj, List list) {
        this.A00 = c2w2;
        this.A01 = obj;
        this.A02 = list;
    }
}
