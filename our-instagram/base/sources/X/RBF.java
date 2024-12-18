package X;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RBF extends RBL implements Serializable {
    public final Class A00;
    public final String A01;
    public final AbstractC910944l A02;

    public RBF(AbstractC910944l abstractC910944l, AnonymousClass456 anonymousClass456, Class cls, String str) {
        super(null, anonymousClass456);
        this.A00 = cls;
        this.A02 = abstractC910944l;
        this.A01 = str;
    }

    @Override // X.AnonymousClass455
    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = C914045z.A00;
            if (obj != null && obj.getClass() == cls) {
                RBF rbf = (RBF) obj;
                if (rbf.A00 != this.A00 || !rbf.A01.equals(this.A01)) {
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
        return this.A02;
    }

    @Override // X.AnonymousClass455
    public final Class A04() {
        return this.A02.A00;
    }

    @Override // X.AnonymousClass455
    public final String A05() {
        return this.A01;
    }

    @Override // X.AnonymousClass455
    public final /* bridge */ /* synthetic */ AnnotatedElement A07() {
        return null;
    }

    @Override // X.AnonymousClass455
    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // X.AnonymousClass455
    public final String toString() {
        return AnonymousClass001.A0g("[virtual ", A0B(), "]");
    }
}
