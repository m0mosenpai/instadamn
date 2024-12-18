package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class TIj implements Comparable, Serializable {
    public String A00;
    public int A01;
    public Class A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && obj.getClass() == getClass() && ((TIj) obj).A02 == this.A02;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(((TIj) obj).A00);
    }

    public final int hashCode() {
        return this.A01;
    }

    public final String toString() {
        return this.A00;
    }

    public TIj(Class cls) {
        this.A02 = cls;
        String name = cls.getName();
        this.A00 = name;
        this.A01 = name.hashCode();
    }

    public TIj() {
        this.A02 = null;
        this.A00 = null;
        this.A01 = 0;
    }
}
