package X;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.454, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass454 extends AnonymousClass455 implements AnonymousClass456 {
    public static final AnonymousClass457 A0D = new AnonymousClass457(null, Collections.emptyList(), Collections.emptyList());
    public AnonymousClass457 A00;
    public TIo A01;
    public List A02;
    public final AbstractC910944l A03;
    public final C45A A04;
    public final Class A05;
    public final C44W A06;
    public final C45F A07;
    public final C911244o A08;
    public final C910844k A09;
    public final List A0A;
    public final boolean A0B;
    public transient Boolean A0C;

    @Override // X.AnonymousClass455
    public final boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
            if (obj == null || obj.getClass() != cls || ((AnonymousClass454) obj).A05 != this.A05) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AnonymousClass457 A00(X.AnonymousClass454 r26) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass454.A00(X.454):X.457");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.TIo] */
    public static final TIo A01(AnonymousClass454 anonymousClass454) {
        TIo tIo;
        TIo tIo2 = anonymousClass454.A01;
        TIo tIo3 = tIo2;
        if (tIo2 == null) {
            AbstractC910944l abstractC910944l = anonymousClass454.A03;
            if (abstractC910944l != null) {
                C44W c44w = anonymousClass454.A06;
                C45F c45f = anonymousClass454.A07;
                C910844k c910844k = anonymousClass454.A09;
                List<AbstractC910944l> list = anonymousClass454.A0A;
                RBR rbr = new RBR(c44w, c45f, anonymousClass454.A0B);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                RBR.A00(rbr, anonymousClass454, abstractC910944l.A00, linkedHashMap);
                for (AbstractC910944l abstractC910944l2 : list) {
                    RBR.A00(rbr, new C64177T2g(abstractC910944l2.A0G(), c910844k), abstractC910944l2.A00, linkedHashMap);
                }
                if (!linkedHashMap.isEmpty()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        C61567Rpq c61567Rpq = (C61567Rpq) entry.getValue();
                        Method method = c61567Rpq.A02;
                        if (method != null) {
                            linkedHashMap2.put(entry.getKey(), new RBK(c61567Rpq.A00.A01(), c61567Rpq.A01, method, null));
                        }
                    }
                    ?? obj = new Object();
                    obj.A00 = linkedHashMap2;
                    tIo = obj;
                    anonymousClass454.A01 = tIo;
                    tIo3 = tIo;
                }
            }
            tIo = new Object();
            anonymousClass454.A01 = tIo;
            tIo3 = tIo;
        }
        return tIo3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final List A02(AnonymousClass454 anonymousClass454) {
        ?? emptyList;
        Map A00;
        List list = anonymousClass454.A02;
        List list2 = list;
        if (list == null) {
            AbstractC910944l abstractC910944l = anonymousClass454.A03;
            if (abstractC910944l != null && (A00 = RBS.A00(abstractC910944l, new RBS(anonymousClass454.A06, anonymousClass454.A07, anonymousClass454.A09, anonymousClass454.A0B), anonymousClass454)) != null) {
                emptyList = new ArrayList(A00.size());
                for (SG9 sg9 : A00.values()) {
                    emptyList.add(new RBJ(sg9.A00.A01(), sg9.A01, sg9.A02));
                }
            } else {
                emptyList = Collections.emptyList();
            }
            anonymousClass454.A02 = emptyList;
            list2 = emptyList;
        }
        return list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A0C
            if (r0 != 0) goto L2a
            java.lang.Class r1 = r2.A05
            X.460[] r0 = X.C914045z.A01
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L23
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L23
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L23
            java.lang.Class r0 = r1.getEnclosingClass()
            r1 = 1
            if (r0 != 0) goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A0C = r0
        L2a:
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass454.A09():boolean");
    }

    @Override // X.AnonymousClass456
    public final AbstractC910944l EKO(Type type) {
        return this.A09.A07(null, this.A08, type);
    }

    @Override // X.AnonymousClass455
    public final int hashCode() {
        return this.A05.getName().hashCode();
    }

    @Override // X.AnonymousClass455
    public final String toString() {
        return AnonymousClass001.A0g("[AnnotedClass ", this.A05.getName(), "]");
    }

    public AnonymousClass454(Class cls) {
        this.A03 = null;
        this.A05 = cls;
        this.A0A = Collections.emptyList();
        this.A04 = AnonymousClass458.A01;
        this.A08 = C911244o.A04;
        this.A06 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0B = false;
    }

    public AnonymousClass454(C44W c44w, AbstractC910944l abstractC910944l, C45F c45f, C911244o c911244o, C910844k c910844k, C45A c45a, Class cls, List list, boolean z) {
        this.A03 = abstractC910944l;
        this.A05 = cls;
        this.A0A = list;
        this.A04 = c45a;
        this.A08 = c911244o;
        this.A06 = c44w;
        this.A07 = c45f;
        this.A09 = c910844k;
        this.A0B = z;
    }
}
