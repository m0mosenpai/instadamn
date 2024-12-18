package X;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RBO extends AnonymousClass458 {
    public final HashMap A00;

    @Override // X.AnonymousClass458
    public final AnonymousClass458 A00(Annotation annotation) {
        this.A00.put(annotation.annotationType(), annotation);
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.T2j, java.lang.Object] */
    @Override // X.AnonymousClass458
    public final C64179T2j A01() {
        ?? obj = new Object();
        Iterator A0k = AbstractC167007dF.A0k(this.A00);
        while (A0k.hasNext()) {
            Annotation annotation = (Annotation) A0k.next();
            HashMap hashMap = obj.A00;
            if (hashMap == null) {
                hashMap = AbstractC166987dD.A1G();
                obj.A00 = hashMap;
            }
            Annotation annotation2 = (Annotation) hashMap.put(annotation.annotationType(), annotation);
            if (annotation2 != null) {
                annotation2.equals(annotation);
            }
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.45A, X.T2j, java.lang.Object] */
    @Override // X.AnonymousClass458
    public final C45A A02() {
        HashMap hashMap = this.A00;
        if (hashMap.size() == 2) {
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            Map.Entry A1K2 = AbstractC166987dD.A1K(A14);
            return new T2l((Class) A1K.getKey(), (Class) A1K2.getKey(), (Annotation) A1K.getValue(), (Annotation) A1K2.getValue());
        }
        ?? obj = new Object();
        obj.A00 = hashMap;
        return obj;
    }

    @Override // X.AnonymousClass458
    public final boolean A03(Annotation annotation) {
        return this.A00.containsKey(annotation.annotationType());
    }

    public RBO(Class cls, Class cls2, Object obj, Annotation annotation, Annotation annotation2) {
        super(obj);
        HashMap A1G = AbstractC166987dD.A1G();
        this.A00 = A1G;
        A1G.put(cls, annotation);
        A1G.put(cls2, annotation2);
    }
}
