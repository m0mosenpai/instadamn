package X;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.44k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C910844k implements Serializable {
    public static final C911644s A04;
    public static final C911644s A05;
    public static final C911644s A06;
    public static final C911644s A07;
    public static final C911644s A08;
    public static final Class A0C;
    public static final Class A0D;
    public static final Class A0E;
    public static final C911644s A0F;
    public static final C911644s A0G;
    public static final C911644s A0H;
    public static final C911644s A0I;
    public final C911144n A00;
    public final InterfaceC910744j A01;
    public final ClassLoader A02;
    public final C4jF[] A03;
    public static final AbstractC910944l[] A0B = new AbstractC910944l[0];
    public static final C910844k A0A = new C910844k(null);
    public static final C911244o A09 = C911244o.A04;

    static {
        Class cls = Boolean.TYPE;
        A0C = cls;
        Class cls2 = Integer.TYPE;
        A0D = cls2;
        Class cls3 = Long.TYPE;
        A0E = cls3;
        A0F = new C911644s(cls);
        A0G = new C911644s(cls2);
        A0I = new C911644s(cls3);
        A08 = new C911644s(String.class);
        A07 = new C911644s(Object.class);
        A05 = new C911644s(Comparable.class);
        A06 = new C911644s(Enum.class);
        A04 = new C911644s(Class.class);
        A0H = new C911644s(AbstractC911344p.class);
    }

    public final RD5 A0B(AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2, Class cls) {
        C911244o c911244o;
        int length;
        AbstractC910944l[] abstractC910944lArr = {abstractC910944l, abstractC910944l2};
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && (length = typeParameters.length) != 0) {
            String[] strArr = new String[length];
            int i = 0;
            do {
                strArr[i] = typeParameters[i].getName();
                i++;
            } while (i < length);
            if (length != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot create TypeBindings for class ");
                sb.append(cls.getName());
                sb.append(" with ");
                sb.append(2);
                sb.append(" type parameter");
                sb.append("s");
                sb.append(": class expects ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            c911244o = new C911244o(abstractC910944lArr, strArr, null);
        } else {
            c911244o = C911244o.A04;
        }
        RD5 rd5 = (RD5) A06(null, c911244o, cls);
        if (c911244o.A01.length == 0) {
            AbstractC910944l A0B2 = rd5.A0B(Map.class);
            AbstractC910944l A042 = A0B2.A04();
            if (A042.equals(abstractC910944l)) {
                AbstractC910944l A03 = A0B2.A03();
                if (!A03.equals(abstractC910944l2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", C914045z.A06(cls), abstractC910944l2, A03));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", C914045z.A06(cls), abstractC910944l, A042));
            }
        }
        return rd5;
    }

    public static final AbstractC910944l A00(AbstractC910944l abstractC910944l, Class cls) {
        Class cls2 = abstractC910944l.A00;
        if (cls2 == cls) {
            return abstractC910944l;
        }
        AbstractC910944l A0B2 = abstractC910944l.A0B(cls);
        if (A0B2 == null) {
            boolean isAssignableFrom = cls.isAssignableFrom(cls2);
            Object[] objArr = {cls.getName(), abstractC910944l};
            if (!isAssignableFrom) {
                throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", objArr));
            }
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", objArr));
        }
        return A0B2;
    }

    private boolean A02(AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2) {
        if (abstractC910944l2 instanceof RD7) {
            ((RD7) abstractC910944l2).A00 = abstractC910944l;
        } else {
            if (abstractC910944l.A00 == abstractC910944l2.A00) {
                List A03 = abstractC910944l.A0G().A03();
                List A032 = abstractC910944l2.A0G().A03();
                int size = A03.size();
                for (int i = 0; i < size; i++) {
                    if (A02((AbstractC910944l) A03.get(i), (AbstractC910944l) A032.get(i))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final AbstractC910944l A04(AbstractC910944l abstractC910944l) {
        AbstractC910944l c102414jI;
        C4jF[] c4jFArr = this.A03;
        if (c4jFArr != null) {
            int length = c4jFArr.length;
            for (int i = 0; i < length; i++) {
                if (!abstractC910944l.A02() && !abstractC910944l.A0N()) {
                    Class cls = abstractC910944l.A00;
                    if (cls == C46g.class) {
                        AbstractC910944l A072 = abstractC910944l.A07(0);
                        if (A072 == null) {
                            A072 = A07;
                        }
                        AbstractC910944l A073 = abstractC910944l.A07(1);
                        if (A073 == null) {
                            A073 = A07;
                        }
                        if (abstractC910944l instanceof AbstractC911744t) {
                            c102414jI = new AnonymousClass558(A072, A073, (AbstractC911744t) abstractC910944l);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cannot upgrade from an instance of ");
                            sb.append(abstractC910944l.getClass());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else if (cls != C46h.class) {
                        continue;
                    } else {
                        AbstractC910944l A074 = abstractC910944l.A07(0);
                        if (A074 == null) {
                            A074 = A07;
                        }
                        if (abstractC910944l instanceof AbstractC911744t) {
                            c102414jI = new C102414jI(A074, (AbstractC911744t) abstractC910944l);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cannot upgrade from an instance of ");
                            sb2.append(abstractC910944l.getClass());
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                    abstractC910944l = c102414jI;
                }
            }
        }
        return abstractC910944l;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC910944l A05(X.AbstractC910944l r18, java.lang.Class r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C910844k.A05(X.44l, java.lang.Class, boolean):X.44l");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0241 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC910944l A06(X.C102404jH r25, X.C911244o r26, java.lang.Class r27) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C910844k.A06(X.4jH, X.44o, java.lang.Class):X.44l");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
    
        if (r5 != null) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC910944l A07(X.C102404jH r13, X.C911244o r14, java.lang.reflect.Type r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C910844k.A07(X.4jH, X.44o, java.lang.reflect.Type):X.44l");
    }

    public final AbstractC910944l A08(String str) {
        C911144n c911144n = this.A00;
        C64918TZt c64918TZt = new C64918TZt(str.trim());
        AbstractC910944l A01 = c911144n.A01(c64918TZt);
        if (!c64918TZt.hasMoreTokens()) {
            return A01;
        }
        throw C911144n.A00(c64918TZt, "Unexpected tokens after complete type");
    }

    public final AbstractC910944l A09(Type type) {
        return A07(null, A09, type);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.44s, X.44t] */
    @Deprecated
    public final C911644s A0C(Class cls) {
        C911644s A01;
        C911244o c911244o = A09;
        if (c911244o.A01.length == 0 && (A01 = A01(cls)) != null) {
            return A01;
        }
        return new AbstractC911744t(null, c911244o, cls, null, null, null, 0, false);
    }

    public final Class A0D(String str) {
        Class cls;
        if (str.indexOf(46) < 0) {
            if ("int".equals(str)) {
                cls = Integer.TYPE;
            } else if ("long".equals(str)) {
                cls = Long.TYPE;
            } else if ("float".equals(str)) {
                cls = Float.TYPE;
            } else if ("double".equals(str)) {
                cls = Double.TYPE;
            } else if ("boolean".equals(str)) {
                cls = Boolean.TYPE;
            } else if ("byte".equals(str)) {
                cls = Byte.TYPE;
            } else if ("char".equals(str)) {
                cls = Character.TYPE;
            } else if ("short".equals(str)) {
                cls = Short.TYPE;
            } else if ("void".equals(str)) {
                cls = Void.TYPE;
            } else {
                cls = null;
            }
            if (cls != null) {
                return cls;
            }
        }
        Throwable e = null;
        ClassLoader classLoader = this.A02;
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return Class.forName(str, true, classLoader);
            } catch (Exception e2) {
                e = e2;
                AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
                while (e.getCause() != null) {
                    e = e.getCause();
                }
            }
        }
        try {
            return Class.forName(str);
        } catch (Exception e3) {
            e = e3;
            if (e == null) {
                AnonymousClass460[] anonymousClass460Arr2 = C914045z.A01;
                while (e.getCause() != null) {
                    e = e.getCause();
                }
                e = e;
            }
            C914045z.A0F(e);
            throw new ClassNotFoundException(e.getMessage(), e);
        }
    }

    public C910844k(C911144n c911144n, InterfaceC910744j interfaceC910744j, ClassLoader classLoader, C4jF[] c4jFArr) {
        this.A01 = interfaceC910744j == null ? new C910644i(16, 200) : interfaceC910744j;
        this.A00 = this != c911144n.A00 ? new C911144n(this) : c911144n;
        this.A03 = c4jFArr;
        this.A02 = classLoader;
    }

    public static final C911644s A01(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == A0C) {
                return A0F;
            }
            if (cls == A0D) {
                return A0G;
            }
            if (cls == A0E) {
                return A0I;
            }
            return null;
        }
        if (cls == String.class) {
            return A08;
        }
        if (cls == Object.class) {
            return A07;
        }
        if (cls == AbstractC911344p.class) {
            return A0H;
        }
        return null;
    }

    public static final AbstractC910944l[] A03(AbstractC910944l abstractC910944l, Class cls) {
        AbstractC910944l A0B2 = abstractC910944l.A0B(cls);
        if (A0B2 == null) {
            return A0B;
        }
        return A0B2.A0G().A01;
    }

    public final RD4 A0A(AbstractC910944l abstractC910944l, Class cls) {
        C911244o c911244o;
        int length;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters != null && (length = typeParameters.length) != 0) {
            if (length == 1) {
                c911244o = new C911244o(new AbstractC910944l[]{abstractC910944l}, new String[]{typeParameters[0].getName()}, null);
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A07(length, "Cannot create TypeBindings for class ", cls.getName(), " with 1 type parameter: class expects "));
            }
        } else {
            c911244o = C911244o.A04;
        }
        RD4 rd4 = (RD4) A06(null, c911244o, cls);
        if (c911244o.A01.length == 0 && abstractC910944l != null) {
            AbstractC910944l A03 = rd4.A0B(Collection.class).A03();
            if (!A03.equals(abstractC910944l)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", C914045z.A06(cls), abstractC910944l, A03));
            }
        }
        return rd4;
    }

    public C910844k(InterfaceC910744j interfaceC910744j) {
        this.A01 = new C910644i(16, 200);
        this.A00 = new C911144n(this);
        this.A03 = null;
        this.A02 = null;
    }

    public C910844k() {
        this(null);
    }
}
