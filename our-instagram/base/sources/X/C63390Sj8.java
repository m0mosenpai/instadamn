package X;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sj8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63390Sj8 {
    public static final C45A A07 = AnonymousClass458.A01;
    public final C44W A00;
    public final AbstractC910944l A01;
    public final C45T A02;
    public final C45F A03;
    public final C911244o A04;
    public final Class A05;
    public final boolean A06;

    public static AnonymousClass454 A00(AbstractC910944l abstractC910944l, C45T c45t, C45F c45f) {
        if (abstractC910944l instanceof C102424jJ) {
            return new AnonymousClass454(abstractC910944l.A00);
        }
        C63390Sj8 c63390Sj8 = new C63390Sj8(abstractC910944l, c45t, c45f);
        ArrayList A17 = AbstractC25225BEi.A17(8);
        AbstractC910944l abstractC910944l2 = c63390Sj8.A01;
        Class cls = abstractC910944l2.A00;
        if (cls != Object.class) {
            if (cls.isInterface()) {
                A04(abstractC910944l2, A17, false);
            } else {
                A05(abstractC910944l2, A17, false);
            }
        }
        AnonymousClass457 anonymousClass457 = AnonymousClass454.A0D;
        Class cls2 = c63390Sj8.A05;
        C45A A03 = c63390Sj8.A03(A17);
        return new AnonymousClass454(c63390Sj8.A00, abstractC910944l2, c63390Sj8.A03, c63390Sj8.A04, c63390Sj8.A02.A01.A07, A03, cls2, A17, c63390Sj8.A06);
    }

    private C45A A03(List list) {
        Annotation[] A0L;
        Annotation[] A0L2;
        C44W c44w = this.A00;
        if (c44w == null || ((this.A03 instanceof C45E) && !this.A06)) {
            return A07;
        }
        AnonymousClass458 anonymousClass458 = RBN.A00;
        boolean z = this.A06;
        if (z && (A0L2 = C914045z.A0L(this.A05)) != null) {
            for (Annotation annotation : A0L2) {
                if (!anonymousClass458.A03(annotation)) {
                    anonymousClass458 = anonymousClass458.A00(annotation);
                    if (c44w.A0n(annotation)) {
                        anonymousClass458 = A02(anonymousClass458, annotation);
                    }
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC910944l abstractC910944l = (AbstractC910944l) it.next();
            if (z && (A0L = C914045z.A0L(abstractC910944l.A00)) != null) {
                for (Annotation annotation2 : A0L) {
                    if (!anonymousClass458.A03(annotation2)) {
                        anonymousClass458 = anonymousClass458.A00(annotation2);
                        if (c44w.A0n(annotation2)) {
                            anonymousClass458 = A02(anonymousClass458, annotation2);
                        }
                    }
                }
            }
        }
        return anonymousClass458.A02();
    }

    public static void A04(AbstractC910944l abstractC910944l, List list, boolean z) {
        List emptyList;
        int length;
        Class cls = abstractC910944l.A00;
        if (z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((AbstractC910944l) list.get(i)).A00 == cls) {
                    return;
                }
            }
            list.add(abstractC910944l);
            if (cls == List.class || cls == Map.class) {
                return;
            }
        }
        AbstractC910944l[] abstractC910944lArr = ((AbstractC911744t) abstractC910944l).A02;
        if (abstractC910944lArr != null && (length = abstractC910944lArr.length) != 0) {
            if (length != 1) {
                emptyList = Arrays.asList(abstractC910944lArr);
            } else {
                emptyList = Collections.singletonList(abstractC910944lArr[0]);
            }
        } else {
            emptyList = Collections.emptyList();
        }
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            A04((AbstractC910944l) it.next(), list, true);
        }
    }

    public static void A05(AbstractC910944l abstractC910944l, List list, boolean z) {
        List emptyList;
        int length;
        Class cls = abstractC910944l.A00;
        if (cls != Object.class && cls != Enum.class) {
            if (z) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((AbstractC910944l) list.get(i)).A00 == cls) {
                        return;
                    }
                }
                list.add(abstractC910944l);
            }
            AbstractC910944l[] abstractC910944lArr = ((AbstractC911744t) abstractC910944l).A02;
            if (abstractC910944lArr != null && (length = abstractC910944lArr.length) != 0) {
                if (length != 1) {
                    emptyList = Arrays.asList(abstractC910944lArr);
                } else {
                    emptyList = Collections.singletonList(abstractC910944lArr[0]);
                }
            } else {
                emptyList = Collections.emptyList();
            }
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                A04((AbstractC910944l) it.next(), list, true);
            }
            AbstractC910944l A05 = abstractC910944l.A05();
            if (A05 != null) {
                A05(A05, list, true);
            }
        }
    }

    public C63390Sj8(AbstractC910944l abstractC910944l, C45T c45t, C45F c45f) {
        boolean z;
        this.A02 = c45t;
        this.A01 = abstractC910944l;
        Class cls = abstractC910944l.A00;
        this.A05 = cls;
        this.A03 = c45f;
        this.A04 = abstractC910944l.A0G();
        C44W A00 = c45t.A06() ? c45t.A00() : null;
        this.A00 = A00;
        if (A00 != null && (!C914045z.A0J(cls) || !abstractC910944l.A0N())) {
            z = true;
        } else {
            z = false;
        }
        this.A06 = z;
    }

    public static AnonymousClass454 A01(C45T c45t, C45F c45f, Class cls) {
        if (cls.isArray()) {
            return new AnonymousClass454(cls);
        }
        return new C63390Sj8(c45t, c45f, cls).A06();
    }

    private AnonymousClass458 A02(AnonymousClass458 anonymousClass458, Annotation annotation) {
        for (Annotation annotation2 : C914045z.A0L(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !anonymousClass458.A03(annotation2)) {
                anonymousClass458 = anonymousClass458.A00(annotation2);
                if (this.A00.A0n(annotation2)) {
                    anonymousClass458 = A02(anonymousClass458, annotation2);
                }
            }
        }
        return anonymousClass458;
    }

    public final AnonymousClass454 A06() {
        List emptyList = Collections.emptyList();
        AnonymousClass457 anonymousClass457 = AnonymousClass454.A0D;
        Class cls = this.A05;
        C45A A03 = A03(emptyList);
        return new AnonymousClass454(this.A00, null, this.A03, this.A04, this.A02.A01.A07, A03, cls, emptyList, this.A06);
    }

    public C63390Sj8(C45T c45t, C45F c45f, Class cls) {
        this.A02 = c45t;
        this.A01 = null;
        this.A05 = cls;
        this.A03 = c45f;
        this.A04 = C911244o.A04;
        C44W A00 = c45t.A06() ? c45t.A00() : null;
        this.A00 = A00;
        this.A06 = AbstractC167007dF.A1W(A00);
    }
}
