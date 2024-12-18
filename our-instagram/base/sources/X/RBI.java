package X;

import java.lang.reflect.AnnotatedElement;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RBI extends RBL {
    public final int A00;
    public final AbstractC910944l A01;
    public final RBH A02;

    @Override // X.AnonymousClass455
    public final String A05() {
        return "";
    }

    @Override // X.AnonymousClass455
    public final AnnotatedElement A07() {
        return null;
    }

    @Override // X.AnonymousClass455
    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = C914045z.A00;
            if (obj != null && obj.getClass() == cls) {
                RBI rbi = (RBI) obj;
                if (!rbi.A02.equals(this.A02) || rbi.A00 != this.A00) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // X.AnonymousClass455
    public final AbstractC910944l A03() {
        return this.A01;
    }

    @Override // X.AnonymousClass455
    public final Class A04() {
        return this.A01.A00;
    }

    @Override // X.AnonymousClass455
    public final int hashCode() {
        return this.A02.hashCode() + this.A00;
    }

    public RBI(AbstractC910944l abstractC910944l, RBH rbh, C64179T2j c64179T2j, AnonymousClass456 anonymousClass456, int i) {
        super(c64179T2j, anonymousClass456);
        this.A02 = rbh;
        this.A01 = abstractC910944l;
        this.A00 = i;
    }

    @Override // X.AnonymousClass455
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[parameter #");
        A1C.append(this.A00);
        A1C.append(", annotations: ");
        A1C.append(super.A00);
        return AbstractC58319PtB.A0w(A1C);
    }
}
