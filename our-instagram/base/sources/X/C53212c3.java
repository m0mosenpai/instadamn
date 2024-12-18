package X;

/* renamed from: X.2c3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53212c3 {
    public final Object A00;
    public final Object A01;
    public final Throwable A02;
    public final InterfaceC16660sJ A03;
    public final C2QT A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53212c3) {
                C53212c3 c53212c3 = (C53212c3) obj;
                if (!C14360o3.A0K(this.A01, c53212c3.A01) || !C14360o3.A0K(this.A04, c53212c3.A04) || !C14360o3.A0K(this.A03, c53212c3.A03) || !C14360o3.A0K(this.A00, c53212c3.A00) || !C14360o3.A0K(this.A02, c53212c3.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.A01;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C2QT c2qt = this.A04;
        int hashCode2 = (hashCode + (c2qt == null ? 0 : c2qt.hashCode())) * 31;
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        int hashCode3 = (hashCode2 + (interfaceC16660sJ == null ? 0 : interfaceC16660sJ.hashCode())) * 31;
        Object obj2 = this.A00;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.A02;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompletedContinuation(result=");
        sb.append(this.A01);
        sb.append(", cancelHandler=");
        sb.append(this.A04);
        sb.append(", onCancellation=");
        sb.append(this.A03);
        sb.append(", idempotentResume=");
        sb.append(this.A00);
        sb.append(", cancelCause=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C53212c3(Object obj, Object obj2, Throwable th, InterfaceC16660sJ interfaceC16660sJ, C2QT c2qt) {
        this.A01 = obj;
        this.A04 = c2qt;
        this.A03 = interfaceC16660sJ;
        this.A00 = obj2;
        this.A02 = th;
    }
}
