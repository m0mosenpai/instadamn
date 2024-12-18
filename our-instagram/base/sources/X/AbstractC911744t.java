package X;

/* renamed from: X.44t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC911744t extends AbstractC910944l implements InterfaceC911544r {
    public static final C911244o A03 = C911244o.A04;
    public final AbstractC910944l A00;
    public final C911244o A01;
    public final AbstractC910944l[] A02;

    public String A0R() {
        StringBuilder sb;
        if (this instanceof C911644s) {
            C911644s c911644s = (C911644s) this;
            if (c911644s instanceof C102414jI) {
                C102414jI c102414jI = (C102414jI) c911644s;
                sb = new StringBuilder();
                Class cls = ((AbstractC910944l) c102414jI).A00;
                sb.append(cls.getName());
                AbstractC910944l abstractC910944l = c102414jI.A01;
                if (abstractC910944l != null && cls.getTypeParameters().length == 1) {
                    sb.append('<');
                    sb.append(((AbstractC911744t) abstractC910944l).A0R());
                    sb.append('>');
                }
                return sb.toString();
            }
            sb = new StringBuilder();
            Class cls2 = ((AbstractC910944l) c911644s).A00;
            sb.append(cls2.getName());
            int length = ((AbstractC911744t) c911644s).A01.A01.length;
            if (length > 0 && cls2.getTypeParameters().length == length) {
                sb.append('<');
                int i = 0;
                do {
                    AbstractC910944l A07 = c911644s.A07(i);
                    if (i > 0) {
                        sb.append(',');
                    }
                    sb.append(((AbstractC911744t) A07).A0R());
                    i++;
                } while (i < length);
                sb.append('>');
            }
            return sb.toString();
        }
        return super.A00.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.SX7, java.lang.Object] */
    @Override // X.InterfaceC911544r
    public final void EOv(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar) {
        C16R c16r = C16R.A0J;
        ?? obj = new Object();
        obj.A03 = this;
        obj.A04 = null;
        obj.A00 = c16r;
        abstractC63023Sar.A02(anonymousClass182, obj);
        EOr(anonymousClass182, abstractC913345m);
        abstractC63023Sar.A03(anonymousClass182, obj);
    }

    public AbstractC911744t(AbstractC911744t abstractC911744t) {
        super(abstractC911744t);
        this.A00 = abstractC911744t.A00;
        this.A02 = abstractC911744t.A02;
        this.A01 = abstractC911744t.A01;
    }

    public static void A01(Class cls, StringBuilder sb, boolean z) {
        char c;
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                c = 'Z';
            } else if (cls == Byte.TYPE) {
                c = 'B';
            } else if (cls == Short.TYPE) {
                c = 'S';
            } else if (cls == Character.TYPE) {
                c = 'C';
            } else if (cls == Integer.TYPE) {
                c = 'I';
            } else if (cls == Long.TYPE) {
                c = 'J';
            } else if (cls == Float.TYPE) {
                c = 'F';
            } else if (cls == Double.TYPE) {
                c = 'D';
            } else if (cls == Void.TYPE) {
                c = 'V';
            } else {
                throw new IllegalStateException(AnonymousClass001.A0R("Unrecognized primitive type: ", cls.getName()));
            }
        } else {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char charAt = name.charAt(i);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb.append(charAt);
            }
            if (!z) {
                return;
            } else {
                c = ';';
            }
        }
        sb.append(c);
    }

    @Override // X.InterfaceC911544r
    public final void EOr(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m) {
        anonymousClass182.A0u(A0R());
    }

    public AbstractC911744t(AbstractC910944l abstractC910944l, C911244o c911244o, Class cls, Object obj, Object obj2, AbstractC910944l[] abstractC910944lArr, int i, boolean z) {
        super(cls, obj, obj2, i, z);
        this.A01 = c911244o == null ? A03 : c911244o;
        this.A00 = abstractC910944l;
        this.A02 = abstractC910944lArr;
    }
}
