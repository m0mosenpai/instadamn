package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AKS {
    public Float A00;
    public String A01;
    public float[] A02;
    public final C8KX A03;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.onecamera.components.ml.sceneunderstanding.SceneUnderstandingOutputModel");
                AKS aks = (AKS) obj;
                if (this.A03 == aks.A03 && C14360o3.A0K(this.A01, aks.A01) && C14360o3.A0J(this.A00, aks.A00)) {
                    float[] fArr = this.A02;
                    float[] fArr2 = aks.A02;
                    if (fArr != null) {
                        if (fArr2 == null || !Arrays.equals(fArr, fArr2)) {
                        }
                    } else if (fArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static float A00(AKS aks) {
        Float f = aks.A00;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final int hashCode() {
        int i;
        int i2;
        int A0G = AbstractC166987dD.A0G(this.A03);
        String str = this.A01;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (A0G + i) * 31;
        Float f = this.A00;
        if (f != null) {
            i2 = f.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        float[] fArr = this.A02;
        if (fArr != null) {
            i3 = Arrays.hashCode(fArr);
        }
        return i5 + i3;
    }

    public AKS(C8KX c8kx, Float f, String str, float[] fArr) {
        this.A03 = c8kx;
        this.A01 = str;
        this.A00 = f;
        this.A02 = fArr;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SceneUnderstandingOutputModel(outputType=");
        A1C.append(this.A03);
        A1C.append(", concept=");
        A1C.append(this.A01);
        A1C.append(", score=");
        A1C.append(this.A00);
        A1C.append(", embeddings=");
        A1C.append(Arrays.toString(this.A02));
        return AbstractC167017dG.A0p(A1C);
    }

    public AKS() {
        this(C8KX.A03, null, null, null);
    }
}
