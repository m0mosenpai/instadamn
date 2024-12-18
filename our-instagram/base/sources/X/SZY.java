package X;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* loaded from: classes10.dex */
public class SZY {
    public static final C64179T2j[] A01 = new C64179T2j[0];
    public static final Annotation[] A02 = new Annotation[0];
    public final C44W A00;

    public final AnonymousClass458 A03(Annotation[] annotationArr) {
        AnonymousClass458 anonymousClass458 = RBN.A00;
        for (Annotation annotation : annotationArr) {
            anonymousClass458 = anonymousClass458.A00(annotation);
            if (this.A00.A0n(annotation)) {
                anonymousClass458 = A02(anonymousClass458, annotation);
            }
        }
        return anonymousClass458;
    }

    public SZY(C44W c44w) {
        this.A00 = c44w;
    }

    public final AnonymousClass458 A02(AnonymousClass458 anonymousClass458, Annotation annotation) {
        for (Annotation annotation2 : C914045z.A0L(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (this.A00.A0n(annotation2)) {
                    if (!anonymousClass458.A03(annotation2)) {
                        anonymousClass458 = A02(anonymousClass458.A00(annotation2), annotation2);
                    }
                } else {
                    anonymousClass458 = anonymousClass458.A00(annotation2);
                }
            }
        }
        return anonymousClass458;
    }
}
