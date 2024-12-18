package X;

/* renamed from: X.55G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C55G {
    public AbstractC910944l A00;
    public Class A01;
    public boolean A02;
    public int A03;

    public C55G(AbstractC910944l abstractC910944l) {
        this.A00 = abstractC910944l;
        this.A01 = null;
        this.A02 = false;
        this.A03 = abstractC910944l.hashCode() - 1;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        C55G c55g = (C55G) obj;
        if (c55g.A02 != this.A02) {
            return false;
        }
        Class cls = this.A01;
        if (cls != null) {
            return c55g.A01 == cls;
        }
        return this.A00.equals(c55g.A00);
    }

    public final int hashCode() {
        return this.A03;
    }

    public final String toString() {
        StringBuilder sb;
        Class cls = this.A01;
        if (cls != null) {
            sb = new StringBuilder();
            sb.append("{class: ");
            sb.append(cls.getName());
        } else {
            sb = new StringBuilder();
            sb.append("{type: ");
            sb.append(this.A00);
        }
        sb.append(", typed? ");
        sb.append(this.A02);
        sb.append("}");
        return sb.toString();
    }

    public C55G(Class cls, boolean z) {
        this.A01 = cls;
        this.A00 = null;
        this.A02 = z;
        int hashCode = cls.getName().hashCode();
        this.A03 = z ? hashCode + 1 : hashCode;
    }

    public C55G() {
    }
}
