package X;

/* renamed from: X.69Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69Q extends C0T6 implements C69R {
    public final C69P A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69Q) {
                C69Q c69q = (C69Q) obj;
                if (!C14360o3.A0K(this.A00, c69q.A00) || !C14360o3.A0K(this.A01, c69q.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A01;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public C69Q(C69P c69p, String str) {
        this.A00 = c69p;
        this.A01 = str;
    }
}
