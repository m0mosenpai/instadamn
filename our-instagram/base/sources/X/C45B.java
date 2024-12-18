package X;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.45B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45B {
    public static final Class[] A09 = new Class[0];
    public SZ3 A00;
    public List A01;
    public boolean A02;
    public Class[] A03;
    public final C44W A04;
    public final AbstractC910944l A05;
    public final C45T A06;
    public final AnonymousClass454 A07;
    public final C63027Sax A08;

    public final C45U A00() {
        C45U A04;
        C45U c45u = null;
        C44W c44w = this.A04;
        if (c44w != null && (A04 = c44w.A04(this.A07)) != null) {
            c45u = A04;
        }
        C45U c45u2 = C45U.A07;
        if (c45u != null) {
            return c45u.A00(c45u2);
        }
        return c45u2;
    }

    public final TmN A02(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof TmN) {
            return (TmN) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (cls == AbstractC64180T2m.class || C914045z.A0I(cls)) {
                return null;
            }
            if (TmN.class.isAssignableFrom(cls)) {
                return (TmN) C914045z.A03(cls, this.A06.A05());
            }
            throw new IllegalStateException(AnonymousClass001.A0g("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(AnonymousClass001.A0g("AnnotationIntrospector returned Converter definition of type ", obj.getClass().getName(), "; expected type Converter or Class<Converter> instead"));
    }

    public final RBL A01() {
        C63027Sax c63027Sax = this.A08;
        if (c63027Sax != null) {
            if (!c63027Sax.A0A) {
                c63027Sax.A02();
            }
            LinkedList linkedList = c63027Sax.A09;
            if (linkedList != null) {
                if (linkedList.size() > 1) {
                    c63027Sax.A06("Multiple 'as-value' properties defined (%s vs %s)", linkedList.get(0), linkedList.get(1));
                    throw C00O.createAndThrow();
                }
                return (RBL) linkedList.get(0);
            }
            return null;
        }
        return null;
    }

    public final List A03() {
        List list = this.A01;
        if (list == null) {
            C63027Sax c63027Sax = this.A08;
            if (!c63027Sax.A0A) {
                c63027Sax.A02();
            }
            ArrayList arrayList = new ArrayList(c63027Sax.A02.values());
            this.A01 = arrayList;
            return arrayList;
        }
        return list;
    }

    public final List A04() {
        List<RBK> list = AnonymousClass454.A00(this.A07).A02;
        if (!list.isEmpty()) {
            ArrayList arrayList = null;
            for (RBK rbk : list) {
                Method method = rbk.A01;
                if (this.A05.A00.isAssignableFrom(method.getReturnType())) {
                    EnumC61114RfU A03 = this.A04.A03(rbk);
                    if (A03 == null || A03 == EnumC61114RfU.DISABLED) {
                        String name = method.getName();
                        if ("valueOf".equals(name)) {
                            if (rbk.A0F() == 1) {
                            }
                        }
                        if ("fromString".equals(name)) {
                            if (rbk.A0F() == 1) {
                                Class A0I = rbk.A0I(0);
                                if (A0I != String.class && !CharSequence.class.isAssignableFrom(A0I)) {
                                }
                            }
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(rbk);
                }
            }
            if (arrayList == null) {
                return Collections.emptyList();
            }
            return arrayList;
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] A05() {
        /*
            r3 = this;
            boolean r0 = r3.A02
            if (r0 != 0) goto L1a
            r0 = 1
            r3.A02 = r0
            X.44W r1 = r3.A04
            if (r1 != 0) goto L1d
            r2 = 0
        Lc:
            X.45T r1 = r3.A06
            X.45Y r0 = X.C45Y.A0H
            boolean r0 = r1.A08(r0)
            if (r0 != 0) goto L18
            java.lang.Class[] r2 = X.C45B.A09
        L18:
            r3.A03 = r2
        L1a:
            java.lang.Class[] r0 = r3.A03
            return r0
        L1d:
            X.454 r0 = r3.A07
            java.lang.Class[] r2 = r1.A0o(r0)
            if (r2 != 0) goto L18
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45B.A05():java.lang.Class[]");
    }

    public C45B(AbstractC910944l abstractC910944l, C45T c45t, AnonymousClass454 anonymousClass454, List list) {
        this.A05 = abstractC910944l;
        this.A08 = null;
        this.A06 = c45t;
        this.A04 = c45t != null ? c45t.A00() : null;
        this.A07 = anonymousClass454;
        this.A01 = list;
    }

    public C45B(C63027Sax c63027Sax) {
        AbstractC910944l abstractC910944l = c63027Sax.A0C;
        AnonymousClass454 anonymousClass454 = c63027Sax.A0F;
        this.A05 = abstractC910944l;
        this.A08 = c63027Sax;
        C45T c45t = c63027Sax.A0D;
        this.A06 = c45t;
        this.A04 = c45t.A00();
        this.A07 = anonymousClass454;
        C44W c44w = c63027Sax.A0B;
        SZ3 A0H = c44w.A0H(anonymousClass454);
        this.A00 = A0H != null ? c44w.A0I(anonymousClass454, A0H) : A0H;
    }
}
