package X;

import java.lang.annotation.Annotation;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class RBM extends AnonymousClass458 {
    public Class A00;
    public Annotation A01;

    @Override // X.AnonymousClass458
    public final AnonymousClass458 A00(Annotation annotation) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Class<? extends Annotation> cls = this.A00;
        if (cls == annotationType) {
            this.A01 = annotation;
            return this;
        }
        return new RBO(cls, annotationType, super.A00, this.A01, annotation);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.T2j, java.lang.Object] */
    @Override // X.AnonymousClass458
    public final C64179T2j A01() {
        Class cls = this.A00;
        Annotation annotation = this.A01;
        HashMap hashMap = new HashMap(4);
        hashMap.put(cls, annotation);
        ?? obj = new Object();
        obj.A00 = hashMap;
        return obj;
    }

    @Override // X.AnonymousClass458
    public final C45A A02() {
        return new T2k(this.A00, this.A01);
    }

    @Override // X.AnonymousClass458
    public final boolean A03(Annotation annotation) {
        return AbstractC167007dF.A1X(annotation.annotationType(), this.A00);
    }
}
