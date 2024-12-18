package X;

/* renamed from: X.3cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77083cu {
    public final C2VE A00;
    public final AbstractC50922Vo A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77083cu) {
                C77083cu c77083cu = (C77083cu) obj;
                if (!C14360o3.A0K(this.A01, c77083cu.A01) || !C14360o3.A0K(this.A00, c77083cu.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        C2VE c2ve = this.A00;
        return hashCode + (c2ve == null ? 0 : c2ve.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComponentState(value=");
        sb.append(this.A01);
        sb.append(", eventDispatchInfo=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C77083cu(C2VE c2ve, AbstractC50922Vo abstractC50922Vo) {
        this.A01 = abstractC50922Vo;
        this.A00 = c2ve;
    }
}
