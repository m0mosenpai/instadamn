package com.facebook.odin.model;

import X.AbstractC68612VXn;
import X.C00O;
import X.C0YZ;
import X.C14360o3;
import X.C3R9;
import X.C3TU;
import X.C3TZ;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class Matrix {
    public final float[][] A00;
    public static final Companion Companion = new Object();
    public static final C3R9[] A01 = {new C3TZ(new C0YZ(float[].class), C3TU.A00)};

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return Matrix$$serializer.INSTANCE;
        }
    }

    public Matrix(float[][] fArr) {
        C14360o3.A0B(fArr, 1);
        this.A00 = fArr;
    }

    public /* synthetic */ Matrix(float[][] fArr, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(Matrix$$serializer.descriptor, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = fArr;
    }
}
