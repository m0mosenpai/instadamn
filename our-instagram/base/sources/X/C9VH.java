package X;

import java.util.Arrays;

/* renamed from: X.9VH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VH extends AbstractC72460Xe6 {
    public Float A00;
    public String A01;
    public float[] A02;
    public final EnumC193268h6 A03;

    public C9VH(EnumC193268h6 enumC193268h6, Float f, String str, float[] fArr) {
        C14360o3.A0B(enumC193268h6, 1);
        this.A03 = enumC193268h6;
        this.A01 = str;
        this.A00 = f;
        this.A02 = fArr;
    }

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
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.aiplatform.processors.scenerecognizer.model.SceneRecognizerOutputModel");
                C9VH c9vh = (C9VH) obj;
                if (this.A03 == c9vh.A03 && C14360o3.A0K(this.A01, c9vh.A01) && C14360o3.A0J(this.A00, c9vh.A00)) {
                    float[] fArr = this.A02;
                    float[] fArr2 = c9vh.A02;
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

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SceneRecognizerOutputModel(outputType=");
        A1C.append(this.A03);
        A1C.append(", concept=");
        A1C.append(this.A01);
        A1C.append(", score=");
        A1C.append(this.A00);
        A1C.append(", embeddings=");
        A1C.append(Arrays.toString(this.A02));
        return AbstractC167017dG.A0p(A1C);
    }

    public C9VH() {
        this(EnumC193268h6.A03, null, null, null);
    }
}
