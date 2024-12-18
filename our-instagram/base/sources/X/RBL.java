package X;

import com.fasterxml.jackson.annotation.JsonTypeId;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class RBL extends AnonymousClass455 implements Serializable {
    public final transient C64179T2j A00;
    public final transient AnonymousClass456 A01;

    @Override // X.AnonymousClass455
    public final Annotation A06(Class cls) {
        C64179T2j c64179T2j = this.A00;
        if (c64179T2j == null) {
            return null;
        }
        return c64179T2j.AXU(cls);
    }

    @Override // X.AnonymousClass455
    public final boolean A08(Class[] clsArr) {
        C64179T2j c64179T2j = this.A00;
        if (c64179T2j == null) {
            return false;
        }
        return c64179T2j.CLT(clsArr);
    }

    public final Class A09() {
        Executable executable;
        if (this instanceof RBF) {
            return ((RBF) this).A00;
        }
        if (this instanceof RBI) {
            return ((RBI) this).A02.A09();
        }
        if (this instanceof RBJ) {
            return ((RBJ) this).A00.getDeclaringClass();
        }
        if (this instanceof RBK) {
            executable = ((RBK) this).A01;
        } else {
            executable = ((RBG) this).A00;
        }
        return executable.getDeclaringClass();
    }

    public final Object A0A(Object obj) {
        if (this instanceof RBF) {
            throw AbstractC58320PtC.A0l("Cannot get virtual property '", ((RBF) this).A01, "'");
        }
        if (this instanceof RBI) {
            throw AbstractC166987dD.A1D(AbstractC58319PtB.A0t(((RBI) this).A02.A09(), "Cannot call getValue() on constructor parameter of "));
        }
        if (this instanceof RBJ) {
            RBJ rbj = (RBJ) this;
            try {
                return rbj.A00.get(obj);
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException(AnonymousClass001.A0u("Failed to getValue() for field ", rbj.A0B(), ": ", e.getMessage()), e);
            }
        }
        if (this instanceof RBK) {
            RBK rbk = (RBK) this;
            try {
                return rbk.A01.invoke(obj, null);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new IllegalArgumentException(AnonymousClass001.A0u("Failed to getValue() with method ", rbk.A0B(), ": ", C914045z.A09(e2)), e2);
            }
        }
        throw AbstractC166987dD.A1D(AbstractC58319PtB.A0t(((RBG) this).A00.getDeclaringClass(), "Cannot call getValue() on constructor of "));
    }

    public final Member A0C() {
        if (this instanceof RBF) {
            return null;
        }
        if (this instanceof RBI) {
            return ((RBI) this).A02.A0C();
        }
        if (this instanceof RBJ) {
            return ((RBJ) this).A00;
        }
        if (this instanceof RBK) {
            return ((RBK) this).A01;
        }
        return ((RBG) this).A00;
    }

    public final boolean A0E() {
        HashMap hashMap;
        C64179T2j c64179T2j = this.A00;
        if (c64179T2j != null && (hashMap = c64179T2j.A00) != null) {
            return hashMap.containsKey(JsonTypeId.class);
        }
        return false;
    }

    public RBL(C64179T2j c64179T2j, AnonymousClass456 anonymousClass456) {
        this.A01 = anonymousClass456;
        this.A00 = c64179T2j;
    }

    public String A0B() {
        return AnonymousClass001.A0g(A09().getName(), "#", A05());
    }

    public final void A0D(boolean z) {
        Member A0C = A0C();
        if (A0C != null) {
            C914045z.A0H(A0C, z);
        }
    }
}
