package X;

/* renamed from: X.SOi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62741SOi {
    public final Class A00;
    public final Class A01;

    public final boolean equals(Object o) {
        if (!(o instanceof C62741SOi)) {
            return false;
        }
        C62741SOi c62741SOi = (C62741SOi) o;
        if (!c62741SOi.A00.equals(this.A00)) {
            return false;
        }
        return AbstractC58320PtC.A1X(c62741SOi.A01, this.A01);
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, this.A01);
    }

    public final String toString() {
        return AnonymousClass001.A0g(this.A00.getSimpleName(), " with serialization type: ", this.A01.getSimpleName());
    }

    public C62741SOi(Class keyClass, Class keySerializationClass) {
        this.A00 = keyClass;
        this.A01 = keySerializationClass;
    }
}
