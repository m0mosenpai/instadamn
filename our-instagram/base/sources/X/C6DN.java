package X;

/* renamed from: X.6DN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DN extends AbstractC107294sa {
    public final Throwable A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6DN) {
                C6DN c6dn = (C6DN) obj;
                if (!C14360o3.A0K(this.A00, c6dn.A00) || !C14360o3.A0K(this.A01, c6dn.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Throwable th = this.A00;
        int hashCode = (th == null ? 0 : th.hashCode()) * 31;
        Object obj = this.A01;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public C6DN(Object obj, Throwable th) {
        super(obj);
        this.A00 = th;
        this.A01 = obj;
    }
}
