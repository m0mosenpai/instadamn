package X;

/* renamed from: X.SLo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62676SLo {
    public final TID A00;
    public final Class A01;
    public final Object A02;

    public final String toString() {
        return String.format("Object id [%s] (for %s) at %s", this.A02, C914045z.A06(this.A01), this.A00);
    }

    public C62676SLo(TID tid, Class cls, Object obj) {
        this.A02 = obj;
        this.A01 = cls;
        this.A00 = tid;
    }
}
