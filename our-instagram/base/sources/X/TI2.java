package X;

import java.io.Serializable;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public abstract class TI2 implements Serializable {
    public final boolean A02(TI2 ti2) {
        AbstractC60564R8e abstractC60564R8e = (AbstractC60564R8e) this;
        if (abstractC60564R8e instanceof R8c) {
            R8c r8c = (R8c) abstractC60564R8e;
            if (ti2.getClass() != r8c.getClass()) {
                return false;
            }
            R8c r8c2 = (R8c) ti2;
            if (((AbstractC60564R8e) r8c2).A00 != ((AbstractC60564R8e) r8c).A00 || r8c2.A00 != r8c.A00) {
                return false;
            }
            return true;
        }
        if (ti2.getClass() == abstractC60564R8e.getClass() && ((AbstractC60564R8e) ti2).A00 == abstractC60564R8e.A00) {
            return true;
        }
        return false;
    }

    public final TI2 A00(Class cls) {
        if (this instanceof R8c) {
            R8c r8c = (R8c) this;
            if (cls != ((AbstractC60564R8e) r8c).A00) {
                return new R8c(r8c.A00, cls);
            }
            return r8c;
        }
        AbstractC60564R8e abstractC60564R8e = (AbstractC60564R8e) this;
        if (cls == abstractC60564R8e.A00) {
            return abstractC60564R8e;
        }
        return new AbstractC60564R8e(cls);
    }

    public final Object A01(Object obj) {
        if (this instanceof R8c) {
            R8c r8c = (R8c) this;
            try {
                RC7 rc7 = r8c.A00;
                Method method = rc7.A0E;
                if (method == null) {
                    return rc7.A0D.get(obj);
                }
                return method.invoke(obj, null);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new IllegalStateException(AnonymousClass001.A0u("Problem accessing property '", r8c.A00.A04.A03, "': ", e2.getMessage()), e2);
            }
        }
        throw AbstractC43592JPx.A11();
    }
}
