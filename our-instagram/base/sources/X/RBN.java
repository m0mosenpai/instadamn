package X;

import java.lang.annotation.Annotation;

/* loaded from: classes10.dex */
public final class RBN extends AnonymousClass458 {
    public static final RBN A00 = new AnonymousClass458(null);

    @Override // X.AnonymousClass458
    public final boolean A03(Annotation annotation) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.RBM, X.458] */
    @Override // X.AnonymousClass458
    public final AnonymousClass458 A00(Annotation annotation) {
        Object obj = this.A00;
        Class<? extends Annotation> annotationType = annotation.annotationType();
        ?? anonymousClass458 = new AnonymousClass458(obj);
        anonymousClass458.A00 = annotationType;
        anonymousClass458.A01 = annotation;
        return anonymousClass458;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.T2j, java.lang.Object] */
    @Override // X.AnonymousClass458
    public final C64179T2j A01() {
        return new Object();
    }

    @Override // X.AnonymousClass458
    public final C45A A02() {
        return AnonymousClass458.A01;
    }
}
