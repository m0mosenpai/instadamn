package X;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RBJ extends RBL implements Serializable {
    public final transient Field A00;

    @Override // X.AnonymousClass455
    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = C914045z.A00;
            if (obj != null && obj.getClass() == cls) {
                Field field = ((RBJ) obj).A00;
                Field field2 = this.A00;
                if (field == null) {
                    if (field2 != null) {
                        return false;
                    }
                } else {
                    return field.equals(field2);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // X.AnonymousClass455
    public final AbstractC910944l A03() {
        return this.A01.EKO(this.A00.getGenericType());
    }

    @Override // X.AnonymousClass455
    public final Class A04() {
        return this.A00.getType();
    }

    @Override // X.AnonymousClass455
    public final String A05() {
        return this.A00.getName();
    }

    @Override // X.AnonymousClass455
    public final /* bridge */ /* synthetic */ AnnotatedElement A07() {
        return this.A00;
    }

    @Override // X.AnonymousClass455
    public final int hashCode() {
        return this.A00.getName().hashCode();
    }

    @Override // X.AnonymousClass455
    public final String toString() {
        return AnonymousClass001.A0g("[field ", A0B(), "]");
    }

    public RBJ(C64179T2j c64179T2j, AnonymousClass456 anonymousClass456, Field field) {
        super(c64179T2j, anonymousClass456);
        this.A00 = field;
    }
}
