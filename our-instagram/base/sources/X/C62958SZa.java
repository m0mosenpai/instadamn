package X;

/* renamed from: X.SZa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62958SZa {
    public final Object A00;
    public final Throwable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C62958SZa)) {
                return false;
            }
            C62958SZa c62958SZa = (C62958SZa) obj;
            Object obj2 = this.A00;
            if (obj2 == null || !obj2.equals(c62958SZa.A00)) {
                Throwable th = this.A01;
                if (th == null || c62958SZa.A01 == null) {
                    return false;
                }
                return th.toString().equals(th.toString());
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, this.A01);
    }

    public C62958SZa(Object obj) {
        this.A00 = obj;
        this.A01 = null;
    }

    public C62958SZa(Throwable th) {
        this.A01 = th;
        this.A00 = null;
    }
}
