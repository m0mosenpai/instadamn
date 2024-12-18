package X;

/* loaded from: classes10.dex */
public final class RML extends AbstractC64527TId {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((RML) obj).A00);
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(7, Boolean.valueOf(this.A00));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC64527TId abstractC64527TId = (AbstractC64527TId) obj;
        int A02 = abstractC64527TId.A02();
        if (7 != A02) {
            return 7 - A02;
        }
        RML rml = (RML) abstractC64527TId;
        int i = 20;
        int i2 = 21;
        if (true != this.A00) {
            i2 = 20;
        }
        if (true == rml.A00) {
            i = 21;
        }
        return i2 - i;
    }

    public final String toString() {
        return Boolean.toString(this.A00);
    }

    public RML(boolean z) {
        this.A00 = z;
    }
}
