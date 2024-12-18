package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.452, reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass452 extends AnonymousClass453 implements Serializable {
    public static final C45B A00;
    public static final C45B A01;
    public static final C45B A02;
    public static final C45B A03;
    public static final C45B A04 = new C45B(C911644s.A00(String.class), null, new AnonymousClass454(String.class), Collections.emptyList());

    public final C63027Sax A06(AbstractC910944l abstractC910944l, C45T c45t, C45F c45f, boolean z) {
        SN9 rbe;
        AnonymousClass454 A002 = C63390Sj8.A00(abstractC910944l, c45t, c45f);
        if (abstractC910944l.A0P()) {
            rbe = new RBW(c45t, A002);
        } else {
            rbe = new RBE(c45t, A002, "set");
        }
        return new C63027Sax(abstractC910944l, c45t, rbe, A002, z);
    }

    static {
        Class cls = Boolean.TYPE;
        A00 = new C45B(C911644s.A00(cls), null, new AnonymousClass454(cls), Collections.emptyList());
        Class cls2 = Integer.TYPE;
        A01 = new C45B(C911644s.A00(cls2), null, new AnonymousClass454(cls2), Collections.emptyList());
        Class cls3 = Long.TYPE;
        A02 = new C45B(C911644s.A00(cls3), null, new AnonymousClass454(cls3), Collections.emptyList());
        A03 = new C45B(C911644s.A00(Object.class), null, new AnonymousClass454(Object.class), Collections.emptyList());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C45B A00(X.AbstractC910944l r3, X.C45T r4) {
        /*
            java.lang.Class r1 = r3.A00
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L17
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 == r0) goto L39
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 == r0) goto L36
            java.lang.Class r0 = java.lang.Boolean.TYPE
        L12:
            if (r1 != r0) goto L53
            X.45B r0 = X.AnonymousClass452.A00
            return r0
        L17:
            boolean r0 = X.C914045z.A0J(r1)
            if (r0 == 0) goto L3c
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 != r0) goto L24
            X.45B r0 = X.AnonymousClass452.A03
            return r0
        L24:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L2b
            X.45B r0 = X.AnonymousClass452.A04
            return r0
        L2b:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 == r0) goto L39
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 == r0) goto L36
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            goto L12
        L36:
            X.45B r0 = X.AnonymousClass452.A02
            return r0
        L39:
            X.45B r0 = X.AnonymousClass452.A01
            return r0
        L3c:
            java.lang.Class<X.44p> r0 = X.AbstractC911344p.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L53
            X.454 r2 = new X.454
            r2.<init>(r1)
            java.util.List r1 = java.util.Collections.emptyList()
            X.45B r0 = new X.45B
            r0.<init>(r3, r4, r2, r1)
            return r0
        L53:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass452.A00(X.44l, X.45T):X.45B");
    }

    public C45B A02(C912845h c912845h, AbstractC910944l abstractC910944l, C45F c45f) {
        C45B A002 = A00(abstractC910944l, c912845h);
        if (A002 == null) {
            C45B A042 = A04(abstractC910944l, c912845h);
            if (A042 == null) {
                return new C45B(A06(abstractC910944l, c912845h, c45f, false));
            }
            return A042;
        }
        return A002;
    }

    public C45B A03(AbstractC910944l abstractC910944l, C45R c45r, C45F c45f) {
        C45B A002 = A00(abstractC910944l, c45r);
        if (A002 == null) {
            C45B A042 = A04(abstractC910944l, c45r);
            if (A042 == null) {
                return new C45B(A06(abstractC910944l, c45r, c45f, true));
            }
            return A042;
        }
        return A002;
    }

    public final C45B A04(AbstractC910944l abstractC910944l, C45T c45t) {
        if (abstractC910944l.A0N() && !(abstractC910944l instanceof C102424jJ)) {
            Class cls = abstractC910944l.A00;
            if (C914045z.A0J(cls)) {
                if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
                    return new C45B(abstractC910944l, c45t, C63390Sj8.A00(abstractC910944l, c45t, c45t), Collections.emptyList());
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final C45B A05(AbstractC910944l abstractC910944l, C45T c45t, C45F c45f) {
        AnonymousClass454 A06;
        C45B A002 = A00(abstractC910944l, c45t);
        if (A002 == null) {
            if (abstractC910944l instanceof C102424jJ) {
                A06 = new AnonymousClass454(abstractC910944l.A00);
            } else {
                A06 = new C63390Sj8(abstractC910944l, c45t, c45f).A06();
            }
            return new C45B(abstractC910944l, c45t, A06, Collections.emptyList());
        }
        return A002;
    }
}
