package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RBT extends SZY {
    public RBG A00;
    public final AnonymousClass456 A01;
    public final boolean A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.T2j, java.lang.Object] */
    public static C64179T2j A00(RBT rbt, AnonymousClass460 anonymousClass460) {
        if (rbt.A02) {
            Annotation[] annotationArr = anonymousClass460.A02;
            if (annotationArr == null) {
                annotationArr = anonymousClass460.A01.getDeclaredAnnotations();
                anonymousClass460.A02 = annotationArr;
            }
            return rbt.A03(annotationArr).A01();
        }
        return new Object();
    }

    private C64179T2j[] A01(Annotation[][] annotationArr) {
        if (this.A02) {
            int length = annotationArr.length;
            C64179T2j[] c64179T2jArr = new C64179T2j[length];
            for (int i = 0; i < length; i++) {
                AnonymousClass458 anonymousClass458 = RBN.A00;
                for (Annotation annotation : annotationArr[i]) {
                    anonymousClass458 = anonymousClass458.A00(annotation);
                    if (super.A00.A0n(annotation)) {
                        anonymousClass458 = A02(anonymousClass458, annotation);
                    }
                }
                c64179T2jArr[i] = anonymousClass458.A01();
            }
            return c64179T2jArr;
        }
        return SZY.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final RBG A04(AnonymousClass460 anonymousClass460) {
        C64179T2j[] A01;
        int i;
        Annotation[][] annotationArr;
        int i2;
        AnonymousClass456 anonymousClass456;
        Constructor constructor;
        C64179T2j c64179T2j;
        C64179T2j[] c64179T2jArr;
        int i3 = anonymousClass460.A00;
        if (i3 < 0) {
            i3 = anonymousClass460.A01.getParameterTypes().length;
            anonymousClass460.A00 = i3;
        }
        if (super.A00 == null) {
            anonymousClass456 = this.A01;
            constructor = anonymousClass460.A01;
            c64179T2j = new Object();
            c64179T2j = c64179T2j;
            if (i3 != 0) {
                c64179T2jArr = new C64179T2j[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    c64179T2jArr[i4] = new Object();
                }
                return new RBG(c64179T2j, anonymousClass456, constructor, c64179T2jArr);
            }
        } else if (i3 == 0) {
            anonymousClass456 = this.A01;
            constructor = anonymousClass460.A01;
            c64179T2j = A00(this, anonymousClass460);
        } else {
            Annotation[][] annotationArr2 = anonymousClass460.A03;
            if (annotationArr2 == null) {
                annotationArr2 = anonymousClass460.A01.getParameterAnnotations();
                anonymousClass460.A03 = annotationArr2;
            }
            int length = annotationArr2.length;
            if (i3 != length) {
                Constructor constructor2 = anonymousClass460.A01;
                Class<?> declaringClass = constructor2.getDeclaringClass();
                Iterator it = C914045z.A00;
                if (Enum.class.isAssignableFrom(declaringClass) && i3 == (i2 = length + 2)) {
                    annotationArr = new Annotation[i2];
                    System.arraycopy(annotationArr2, 0, annotationArr, 2, length);
                } else if (declaringClass.isMemberClass() && i3 == (i = length + 1)) {
                    annotationArr = new Annotation[i];
                    System.arraycopy(annotationArr2, 0, annotationArr, 1, length);
                    annotationArr[0] = SZY.A02;
                } else {
                    throw AbstractC58319PtB.A0l("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", AbstractC58320PtC.A1a(constructor2.getDeclaringClass().getName(), i3, length));
                }
                A01 = A01(annotationArr);
            } else {
                A01 = A01(annotationArr2);
            }
            return new RBG(A00(this, anonymousClass460), this.A01, anonymousClass460.A01, A01);
        }
        c64179T2jArr = SZY.A01;
        return new RBG(c64179T2j, anonymousClass456, constructor, c64179T2jArr);
    }

    public RBT(C44W c44w, AnonymousClass456 anonymousClass456, boolean z) {
        super(c44w);
        this.A01 = anonymousClass456;
        this.A02 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.T2j] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final RBK A05(AnonymousClass456 anonymousClass456, Method method) {
        C64179T2j A01;
        C64179T2j[] A012;
        int length = method.getParameterTypes().length;
        if (super.A00 == null) {
            A01 = new Object();
            A01 = A01;
            if (length != 0) {
                A012 = new C64179T2j[length];
                int i = 0;
                do {
                    A012[i] = new Object();
                    i++;
                } while (i < length);
            }
            A012 = SZY.A01;
        } else {
            A01 = A03(method.getDeclaredAnnotations()).A01();
            A01 = A01;
            if (length != 0) {
                A012 = A01(method.getParameterAnnotations());
            }
            A012 = SZY.A01;
        }
        return new RBK(A01, anonymousClass456, method, A012);
    }
}
