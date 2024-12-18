package X;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* renamed from: X.44l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC910944l extends AbstractC911044m implements Serializable, Type {
    public final Class A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final int A04;

    public AbstractC910944l A04() {
        return null;
    }

    public AbstractC910944l A05() {
        return ((AbstractC911744t) this).A00;
    }

    public final AbstractC910944l A07(int i) {
        C911244o c911244o = ((AbstractC911744t) this).A01;
        if (i >= 0) {
            AbstractC910944l[] abstractC910944lArr = c911244o.A01;
            if (i < abstractC910944lArr.length) {
                return abstractC910944lArr[i];
            }
            return null;
        }
        return null;
    }

    public AbstractC910944l A08(AbstractC910944l abstractC910944l) {
        if (this instanceof C911644s) {
            C911644s c911644s = (C911644s) this;
            if (c911644s instanceof C102414jI) {
                C102414jI c102414jI = (C102414jI) c911644s;
                if (c102414jI.A01 != abstractC910944l) {
                    Class cls = ((AbstractC910944l) c102414jI).A00;
                    C911244o c911244o = ((AbstractC911744t) c102414jI).A01;
                    return new C102414jI(((AbstractC911744t) c102414jI).A00, abstractC910944l, c102414jI.A00, c911244o, cls, ((AbstractC910944l) c102414jI).A02, ((AbstractC910944l) c102414jI).A01, ((AbstractC911744t) c102414jI).A02, c102414jI.A03);
                }
                return c102414jI;
            }
            throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
        }
        AbstractC911744t abstractC911744t = (AbstractC911744t) this;
        return new C102424jJ(abstractC910944l, abstractC911744t.A01, Array.newInstance((Class<?>) abstractC910944l.A00, 0), ((AbstractC910944l) abstractC911744t).A02, ((AbstractC910944l) abstractC911744t).A01, abstractC911744t.A03);
    }

    public final AbstractC910944l A0B(Class cls) {
        AbstractC910944l A0B;
        AbstractC910944l[] abstractC910944lArr;
        AbstractC911744t abstractC911744t = (AbstractC911744t) this;
        if (cls != ((AbstractC910944l) abstractC911744t).A00) {
            if (cls.isInterface() && (abstractC910944lArr = abstractC911744t.A02) != null) {
                for (AbstractC910944l abstractC910944l : abstractC910944lArr) {
                    AbstractC910944l A0B2 = abstractC910944l.A0B(cls);
                    if (A0B2 != null) {
                        return A0B2;
                    }
                }
            }
            AbstractC910944l abstractC910944l2 = abstractC911744t.A00;
            if (abstractC910944l2 != null && (A0B = abstractC910944l2.A0B(cls)) != null) {
                return A0B;
            }
            return null;
        }
        return abstractC911744t;
    }

    public AbstractC910944l A0E(Object obj) {
        if (this instanceof C911644s) {
            C911644s c911644s = (C911644s) this;
            if (c911644s instanceof C102414jI) {
                C102414jI c102414jI = (C102414jI) c911644s;
                if (obj != ((AbstractC910944l) c102414jI).A01) {
                    Class cls = ((AbstractC910944l) c102414jI).A00;
                    C911244o c911244o = ((AbstractC911744t) c102414jI).A01;
                    return new C102414jI(((AbstractC911744t) c102414jI).A00, c102414jI.A01, c102414jI.A00, c911244o, cls, ((AbstractC910944l) c102414jI).A02, obj, ((AbstractC911744t) c102414jI).A02, c102414jI.A03);
                }
                return c102414jI;
            }
            if (((AbstractC910944l) c911644s).A01 == obj) {
                return c911644s;
            }
            Class cls2 = ((AbstractC910944l) c911644s).A00;
            C911244o c911244o2 = ((AbstractC911744t) c911644s).A01;
            return new AbstractC911744t(((AbstractC911744t) c911644s).A00, c911244o2, cls2, ((AbstractC910944l) c911644s).A02, obj, ((AbstractC911744t) c911644s).A02, 0, c911644s.A03);
        }
        C102424jJ c102424jJ = (C102424jJ) this;
        if (obj == ((AbstractC910944l) c102424jJ).A01) {
            return c102424jJ;
        }
        return new C102424jJ(c102424jJ.A00, ((AbstractC911744t) c102424jJ).A01, c102424jJ.A01, ((AbstractC910944l) c102424jJ).A02, obj, c102424jJ.A03);
    }

    public AbstractC910944l A0F(Object obj) {
        if (this instanceof C911644s) {
            C911644s c911644s = (C911644s) this;
            if (c911644s instanceof C102414jI) {
                C102414jI c102414jI = (C102414jI) c911644s;
                if (obj != ((AbstractC910944l) c102414jI).A02) {
                    Class cls = ((AbstractC910944l) c102414jI).A00;
                    C911244o c911244o = ((AbstractC911744t) c102414jI).A01;
                    return new C102414jI(((AbstractC911744t) c102414jI).A00, c102414jI.A01, c102414jI.A00, c911244o, cls, obj, ((AbstractC910944l) c102414jI).A01, ((AbstractC911744t) c102414jI).A02, c102414jI.A03);
                }
                return c102414jI;
            }
            if (obj == ((AbstractC910944l) c911644s).A02) {
                return c911644s;
            }
            Class cls2 = ((AbstractC910944l) c911644s).A00;
            C911244o c911244o2 = ((AbstractC911744t) c911644s).A01;
            return new AbstractC911744t(((AbstractC911744t) c911644s).A00, c911244o2, cls2, obj, ((AbstractC910944l) c911644s).A01, ((AbstractC911744t) c911644s).A02, 0, c911644s.A03);
        }
        C102424jJ c102424jJ = (C102424jJ) this;
        if (obj == ((AbstractC910944l) c102424jJ).A02) {
            return c102424jJ;
        }
        return new C102424jJ(c102424jJ.A00, ((AbstractC911744t) c102424jJ).A01, c102424jJ.A01, obj, ((AbstractC910944l) c102424jJ).A01, c102424jJ.A03);
    }

    public C911244o A0G() {
        return ((AbstractC911744t) this).A01;
    }

    public boolean A0M() {
        return false;
    }

    public boolean A0O() {
        return false;
    }

    public abstract boolean equals(Object obj);

    public abstract String toString();

    public AbstractC910944l A03() {
        if (this instanceof C102424jJ) {
            return ((C102424jJ) this).A00;
        }
        if (this instanceof C102414jI) {
            return ((C102414jI) this).A01;
        }
        return null;
    }

    public AbstractC910944l A06() {
        if (this instanceof C911644s) {
            C911644s c911644s = (C911644s) this;
            if (c911644s instanceof C102414jI) {
                C102414jI c102414jI = (C102414jI) c911644s;
                if (!c102414jI.A03) {
                    Class cls = ((AbstractC910944l) c102414jI).A00;
                    C911244o c911244o = ((AbstractC911744t) c102414jI).A01;
                    return new C102414jI(((AbstractC911744t) c102414jI).A00, c102414jI.A01.A06(), c102414jI.A00, c911244o, cls, ((AbstractC910944l) c102414jI).A02, ((AbstractC910944l) c102414jI).A01, ((AbstractC911744t) c102414jI).A02, true);
                }
                return c102414jI;
            }
            if (c911644s.A03) {
                return c911644s;
            }
            Class cls2 = ((AbstractC910944l) c911644s).A00;
            C911244o c911244o2 = ((AbstractC911744t) c911644s).A01;
            return new AbstractC911744t(((AbstractC911744t) c911644s).A00, c911244o2, cls2, ((AbstractC910944l) c911644s).A02, ((AbstractC910944l) c911644s).A01, ((AbstractC911744t) c911644s).A02, 0, true);
        }
        C102424jJ c102424jJ = (C102424jJ) this;
        if (c102424jJ.A03) {
            return c102424jJ;
        }
        return new C102424jJ(c102424jJ.A00.A06(), ((AbstractC911744t) c102424jJ).A01, c102424jJ.A01, ((AbstractC910944l) c102424jJ).A02, ((AbstractC910944l) c102424jJ).A01, true);
    }

    public AbstractC910944l A09(AbstractC910944l abstractC910944l) {
        AbstractC910944l abstractC910944l2;
        Object obj = abstractC910944l.A01;
        if (obj != this.A01) {
            abstractC910944l2 = A0E(obj);
        } else {
            abstractC910944l2 = this;
        }
        Object obj2 = abstractC910944l.A02;
        if (obj2 != this.A02) {
            return abstractC910944l2.A0F(obj2);
        }
        return abstractC910944l2;
    }

    public AbstractC910944l A0A(AbstractC910944l abstractC910944l, C911244o c911244o, Class cls, AbstractC910944l[] abstractC910944lArr) {
        if (this instanceof C911644s) {
            C911644s c911644s = (C911644s) this;
            if (c911644s instanceof C102414jI) {
                C102414jI c102414jI = (C102414jI) c911644s;
                return new C102414jI(abstractC910944l, c102414jI.A01, c102414jI.A00, ((AbstractC911744t) c102414jI).A01, cls, ((AbstractC910944l) c102414jI).A02, ((AbstractC910944l) c102414jI).A01, abstractC910944lArr, c102414jI.A03);
            }
            return null;
        }
        return null;
    }

    public AbstractC910944l A0C(Object obj) {
        if (this instanceof C911644s) {
            C911644s c911644s = (C911644s) this;
            if (c911644s instanceof C102414jI) {
                C102414jI c102414jI = (C102414jI) c911644s;
                AbstractC910944l abstractC910944l = c102414jI.A01;
                if (obj != abstractC910944l.A01) {
                    Class cls = ((AbstractC910944l) c102414jI).A00;
                    C911244o c911244o = ((AbstractC911744t) c102414jI).A01;
                    return new C102414jI(((AbstractC911744t) c102414jI).A00, abstractC910944l.A0E(obj), c102414jI.A00, c911244o, cls, ((AbstractC910944l) c102414jI).A02, ((AbstractC910944l) c102414jI).A01, ((AbstractC911744t) c102414jI).A02, c102414jI.A03);
                }
                return c102414jI;
            }
            throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
        }
        C102424jJ c102424jJ = (C102424jJ) this;
        AbstractC910944l abstractC910944l2 = c102424jJ.A00;
        if (obj == abstractC910944l2.A01) {
            return c102424jJ;
        }
        return new C102424jJ(abstractC910944l2.A0E(obj), ((AbstractC911744t) c102424jJ).A01, c102424jJ.A01, ((AbstractC910944l) c102424jJ).A02, ((AbstractC910944l) c102424jJ).A01, c102424jJ.A03);
    }

    public AbstractC910944l A0D(Object obj) {
        if (this instanceof C911644s) {
            C911644s c911644s = (C911644s) this;
            if (c911644s instanceof C102414jI) {
                C102414jI c102414jI = (C102414jI) c911644s;
                AbstractC910944l abstractC910944l = c102414jI.A01;
                if (obj != abstractC910944l.A02) {
                    AbstractC910944l A0F = abstractC910944l.A0F(obj);
                    Class cls = ((AbstractC910944l) c102414jI).A00;
                    C911244o c911244o = ((AbstractC911744t) c102414jI).A01;
                    return new C102414jI(((AbstractC911744t) c102414jI).A00, A0F, c102414jI.A00, c911244o, cls, ((AbstractC910944l) c102414jI).A02, ((AbstractC910944l) c102414jI).A01, ((AbstractC911744t) c102414jI).A02, c102414jI.A03);
                }
                return c102414jI;
            }
            throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
        }
        C102424jJ c102424jJ = (C102424jJ) this;
        AbstractC910944l abstractC910944l2 = c102424jJ.A00;
        if (obj == abstractC910944l2.A02) {
            return c102424jJ;
        }
        return new C102424jJ(abstractC910944l2.A0F(obj), ((AbstractC911744t) c102424jJ).A01, c102424jJ.A01, ((AbstractC910944l) c102424jJ).A02, ((AbstractC910944l) c102424jJ).A01, c102424jJ.A03);
    }

    public StringBuilder A0H(StringBuilder sb) {
        if (this instanceof C911644s) {
            AbstractC911744t.A01(this.A00, sb, true);
            return sb;
        }
        sb.append('[');
        return ((C102424jJ) this).A00.A0H(sb);
    }

    public StringBuilder A0I(StringBuilder sb) {
        if (this instanceof C911644s) {
            C911644s c911644s = (C911644s) this;
            if (c911644s instanceof C102414jI) {
                C102414jI c102414jI = (C102414jI) c911644s;
                AbstractC911744t.A01(((AbstractC910944l) c102414jI).A00, sb, false);
                sb.append('<');
                StringBuilder A0I = c102414jI.A01.A0I(sb);
                A0I.append(">;");
                return A0I;
            }
            int i = 0;
            AbstractC911744t.A01(((AbstractC910944l) c911644s).A00, sb, false);
            int length = ((AbstractC911744t) c911644s).A01.A01.length;
            if (length > 0) {
                sb.append('<');
                do {
                    sb = c911644s.A07(i).A0I(sb);
                    i++;
                } while (i < length);
                sb.append('>');
            }
            sb.append(';');
            return sb;
        }
        sb.append('[');
        return ((C102424jJ) this).A00.A0I(sb);
    }

    public final boolean A0J() {
        if (this instanceof C102424jJ) {
            return ((C102424jJ) this).A00.A0J();
        }
        if (((AbstractC911744t) this).A01.A01.length <= 0) {
            return false;
        }
        return true;
    }

    public boolean A0K() {
        if (this.A01 == null && this.A02 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0L() {
        if (this instanceof C102424jJ) {
            return false;
        }
        return Modifier.isAbstract(this.A00.getModifiers());
    }

    public boolean A0N() {
        if (this instanceof C911644s) {
            return false;
        }
        return true;
    }

    public final boolean A0P() {
        Class cls = this.A00;
        AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
        Class superclass = cls.getSuperclass();
        if (superclass != null && "java.lang.Record".equals(superclass.getName())) {
            return true;
        }
        return false;
    }

    public final boolean A0Q(Class cls) {
        Class cls2 = this.A00;
        if (cls2 != cls && !cls.isAssignableFrom(cls2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A04;
    }

    public AbstractC910944l(AbstractC910944l abstractC910944l) {
        this.A00 = abstractC910944l.A00;
        this.A04 = abstractC910944l.A04;
        this.A02 = abstractC910944l.A02;
        this.A01 = abstractC910944l.A01;
        this.A03 = abstractC910944l.A03;
    }

    public AbstractC910944l(Class cls, Object obj, Object obj2, int i, boolean z) {
        this.A00 = cls;
        this.A04 = cls.getName().hashCode() + i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = z;
    }
}
