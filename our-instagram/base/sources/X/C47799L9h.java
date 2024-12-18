package X;

import android.util.SizeF;

/* renamed from: X.L9h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47799L9h {
    public final float A00;
    public final C47804L9m A01;
    public final java.util.Set A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47799L9h) {
                C47799L9h c47799L9h = (C47799L9h) obj;
                if (!C14360o3.A0K(this.A02, c47799L9h.A02) || Float.compare(this.A00, c47799L9h.A00) != 0 || !C14360o3.A0K(this.A01, c47799L9h.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C47799L9h(java.util.Set set, float f, float f2) {
        float f3 = 2.0f * f;
        C47804L9m c47804L9m = new C47804L9m(new SizeF(f3, f3), f);
        this.A02 = set;
        this.A00 = f2;
        this.A01 = c47804L9m;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A02, 620), this.A00));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ParticleRing(particleCount=");
        A1C.append(20);
        A1C.append(", starIndices=");
        A1C.append(this.A02);
        A1C.append(", particleScaleFactor=");
        A1C.append(this.A00);
        A1C.append(", roundedRect=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
