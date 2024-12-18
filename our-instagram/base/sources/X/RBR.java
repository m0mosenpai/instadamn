package X;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RBR extends SZY {
    public final C45F A00;
    public final boolean A01;

    /* JADX WARN: Type inference failed for: r1v4, types: [X.Rpq, java.lang.Object] */
    public static void A00(RBR rbr, AnonymousClass456 anonymousClass456, Class cls, Map map) {
        AnonymousClass458 A03;
        if (cls != null) {
            for (Method method : C914045z.A0M(cls)) {
                if (!Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2) {
                    C62994SaI c62994SaI = new C62994SaI(method.getName(), method.getParameterTypes());
                    C61567Rpq c61567Rpq = (C61567Rpq) map.get(c62994SaI);
                    if (c61567Rpq == null) {
                        if (((SZY) rbr).A00 == null) {
                            A03 = RBN.A00;
                        } else {
                            A03 = rbr.A03(method.getDeclaredAnnotations());
                        }
                        ?? obj = new Object();
                        obj.A01 = anonymousClass456;
                        obj.A02 = method;
                        obj.A00 = A03;
                        map.put(c62994SaI, obj);
                    } else {
                        if (rbr.A01) {
                            AnonymousClass458 anonymousClass458 = c61567Rpq.A00;
                            for (Annotation annotation : method.getDeclaredAnnotations()) {
                                if (!anonymousClass458.A03(annotation)) {
                                    anonymousClass458 = anonymousClass458.A00(annotation);
                                    C44W c44w = ((SZY) rbr).A00;
                                    if (c44w.A0n(annotation)) {
                                        for (Annotation annotation2 : C914045z.A0L(annotation.annotationType())) {
                                            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !anonymousClass458.A03(annotation2)) {
                                                anonymousClass458 = anonymousClass458.A00(annotation2);
                                                if (c44w.A0n(annotation2)) {
                                                    anonymousClass458 = rbr.A02(anonymousClass458, annotation2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            c61567Rpq.A00 = anonymousClass458;
                        }
                        Method method2 = c61567Rpq.A02;
                        if (method2 == null) {
                            c61567Rpq.A02 = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            c61567Rpq.A02 = method;
                            c61567Rpq.A01 = anonymousClass456;
                        }
                    }
                }
            }
        }
    }

    public RBR(C44W c44w, C45F c45f, boolean z) {
        super(c44w);
        this.A00 = c44w == null ? null : c45f;
        this.A01 = z;
    }
}
