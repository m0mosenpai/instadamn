package X;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RBK extends RBH implements Serializable {
    public Class[] A00;
    public final transient Method A01;

    @Override // X.AnonymousClass455
    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = C914045z.A00;
            if (obj != null && obj.getClass() == cls) {
                Method method = ((RBK) obj).A01;
                Method method2 = this.A01;
                if (method == null) {
                    if (method2 != null) {
                        return false;
                    }
                } else {
                    return method.equals(method2);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // X.AnonymousClass455
    public final AbstractC910944l A03() {
        return super.A01.EKO(this.A01.getGenericReturnType());
    }

    @Override // X.AnonymousClass455
    public final Class A04() {
        return this.A01.getReturnType();
    }

    @Override // X.AnonymousClass455
    public final String A05() {
        return this.A01.getName();
    }

    @Override // X.AnonymousClass455
    public final /* bridge */ /* synthetic */ AnnotatedElement A07() {
        return this.A01;
    }

    @Override // X.AnonymousClass455
    public final int hashCode() {
        return this.A01.getName().hashCode();
    }

    @Override // X.AnonymousClass455
    public final String toString() {
        return AnonymousClass001.A0g("[method ", A0B(), "]");
    }

    public RBK(C64179T2j c64179T2j, AnonymousClass456 anonymousClass456, Method method, C64179T2j[] c64179T2jArr) {
        super(c64179T2j, anonymousClass456, c64179T2jArr);
        if (method != null) {
            this.A01 = method;
            return;
        }
        throw AbstractC166987dD.A12("Cannot construct AnnotatedMethod with null Method");
    }

    @Override // X.RBL
    public final String A0B() {
        StringBuilder A11;
        String str;
        String A0B = super.A0B();
        int A0F = A0F();
        if (A0F != 0) {
            if (A0F != 1) {
                return String.format("%s(%d params)", AbstractC25228BEl.A1Z(super.A0B(), A0F()));
            }
            A11 = AbstractC166997dE.A11(A0B);
            A11.append("(");
            AbstractC58318PtA.A1Q(A0I(0), A11);
            str = ")";
        } else {
            A11 = AbstractC166997dE.A11(A0B);
            str = "()";
        }
        return AbstractC166997dE.A0x(str, A11);
    }
}
