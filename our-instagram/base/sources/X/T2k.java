package X;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* loaded from: classes10.dex */
public final class T2k implements C45A, Serializable {
    public final Class A00;
    public final Annotation A01;

    @Override // X.C45A
    public final int size() {
        return 1;
    }

    @Override // X.C45A
    public final Annotation AXU(Class cls) {
        if (this.A00 == cls) {
            return this.A01;
        }
        return null;
    }

    @Override // X.C45A
    public final boolean CLT(Class[] clsArr) {
        int i = 0;
        while (clsArr[i] != this.A00) {
            i++;
            if (i >= 8) {
                return false;
            }
        }
        return true;
    }

    public T2k(Class cls, Annotation annotation) {
        this.A00 = cls;
        this.A01 = annotation;
    }
}
