package X;

import java.util.Arrays;

/* renamed from: X.Jsh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44810Jsh extends AbstractC72459Xe5 {
    public final float[] A00;

    public C44810Jsh(float[] fArr) {
        C14360o3.A0B(fArr, 1);
        this.A00 = fArr;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C44810Jsh) && C14360o3.A0K(this.A00, ((C44810Jsh) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("AiInputFloatArray(floatArray=", Arrays.toString(this.A00));
    }
}
