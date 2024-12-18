package X;

import java.lang.reflect.Executable;
import java.lang.reflect.Type;

/* loaded from: classes10.dex */
public abstract class RBH extends RBL {
    public final C64179T2j[] A00;

    public final RBI A0H(int i) {
        C64179T2j c64179T2j;
        AbstractC910944l A0G = A0G(i);
        AnonymousClass456 anonymousClass456 = this.A01;
        C64179T2j[] c64179T2jArr = this.A00;
        if (c64179T2jArr != null && i >= 0 && i < c64179T2jArr.length) {
            c64179T2j = c64179T2jArr[i];
        } else {
            c64179T2j = null;
        }
        return new RBI(A0G, this, c64179T2j, anonymousClass456, i);
    }

    public final int A0F() {
        Class<?>[] parameterTypes;
        if (this instanceof RBK) {
            RBK rbk = (RBK) this;
            parameterTypes = rbk.A00;
            if (parameterTypes == null) {
                parameterTypes = rbk.A01.getParameterTypes();
                rbk.A00 = parameterTypes;
            }
        } else {
            parameterTypes = ((RBG) this).A00.getParameterTypes();
        }
        return parameterTypes.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC910944l A0G(int i) {
        Executable executable;
        RBG rbg;
        if (this instanceof RBK) {
            RBK rbk = (RBK) this;
            executable = rbk.A01;
            rbg = rbk;
        } else {
            RBG rbg2 = (RBG) this;
            executable = rbg2.A00;
            rbg = rbg2;
        }
        Type[] genericParameterTypes = executable.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return rbg.A01.EKO(genericParameterTypes[i]);
    }

    public final Class A0I(int i) {
        if (this instanceof RBK) {
            RBK rbk = (RBK) this;
            Class<?>[] clsArr = rbk.A00;
            if (clsArr == null) {
                clsArr = rbk.A01.getParameterTypes();
                rbk.A00 = clsArr;
            }
            if (0 < clsArr.length) {
                return clsArr[0];
            }
            return null;
        }
        Class<?>[] parameterTypes = ((RBG) this).A00.getParameterTypes();
        if (i < parameterTypes.length) {
            return parameterTypes[i];
        }
        return null;
    }

    public final Object A0J() {
        if (this instanceof RBK) {
            return ((RBK) this).A01.invoke(null, AbstractC58318PtA.A1b());
        }
        return ((RBG) this).A00.newInstance(null);
    }

    public final Object A0K(Object obj) {
        if (this instanceof RBK) {
            return ((RBK) this).A01.invoke(null, obj);
        }
        return ((RBG) this).A00.newInstance(obj);
    }

    public RBH(C64179T2j c64179T2j, AnonymousClass456 anonymousClass456, C64179T2j[] c64179T2jArr) {
        super(c64179T2j, anonymousClass456);
        this.A00 = c64179T2jArr;
    }
}
