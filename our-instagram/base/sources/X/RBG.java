package X;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RBG extends RBH {
    public final Constructor A00;

    @Override // X.AnonymousClass455
    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            Iterator it = C914045z.A00;
            if (obj != null && obj.getClass() == cls) {
                Constructor constructor = ((RBG) obj).A00;
                Constructor constructor2 = this.A00;
                if (constructor == null) {
                    if (constructor2 != null) {
                        return false;
                    }
                } else {
                    return constructor.equals(constructor2);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // X.AnonymousClass455
    public final AbstractC910944l A03() {
        return this.A01.EKO(this.A00.getDeclaringClass());
    }

    @Override // X.AnonymousClass455
    public final Class A04() {
        return this.A00.getDeclaringClass();
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
        String str;
        Constructor constructor = this.A00;
        int length = constructor.getParameterTypes().length;
        String A06 = C914045z.A06(constructor.getDeclaringClass());
        Integer valueOf = Integer.valueOf(length);
        if (length == 1) {
            str = "";
        } else {
            str = "s";
        }
        return String.format("[constructor for %s (%d arg%s), annotations: %s", A06, valueOf, str, ((RBL) this).A00);
    }

    public RBG(C64179T2j c64179T2j, AnonymousClass456 anonymousClass456, Constructor constructor, C64179T2j[] c64179T2jArr) {
        super(c64179T2j, anonymousClass456, c64179T2jArr);
        if (constructor != null) {
            this.A00 = constructor;
            return;
        }
        throw AbstractC166987dD.A12("Null constructor not allowed");
    }
}
