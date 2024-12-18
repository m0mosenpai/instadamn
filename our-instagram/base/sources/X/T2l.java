package X;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* loaded from: classes10.dex */
public final class T2l implements C45A, Serializable {
    public final Class A00;
    public final Class A01;
    public final Annotation A02;
    public final Annotation A03;

    @Override // X.C45A
    public final int size() {
        return 2;
    }

    @Override // X.C45A
    public final Annotation AXU(Class cls) {
        if (this.A00 == cls) {
            return this.A02;
        }
        if (this.A01 == cls) {
            return this.A03;
        }
        return null;
    }

    @Override // X.C45A
    public final boolean CLT(Class[] clsArr) {
        int i = 0;
        do {
            Class cls = clsArr[i];
            if (cls != this.A00 && cls != this.A01) {
                i++;
            } else {
                return true;
            }
        } while (i < 8);
        return false;
    }

    public T2l(Class cls, Class cls2, Annotation annotation, Annotation annotation2) {
        this.A00 = cls;
        this.A02 = annotation;
        this.A01 = cls2;
        this.A03 = annotation2;
    }
}
