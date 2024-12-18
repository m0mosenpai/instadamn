package X;

import android.animation.Animator;

/* loaded from: classes11.dex */
public final class UP7 extends C0T6 {
    public String A03 = "";
    public boolean A04 = true;
    public int A01 = 1;
    public Animator.AnimatorListener A02 = null;
    public float A00 = 0.0f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UP7) {
                UP7 up7 = (UP7) obj;
                if (!C14360o3.A0K(this.A03, up7.A03) || this.A04 != up7.A04 || this.A01 != up7.A01 || !C14360o3.A0K(this.A02, up7.A02) || Float.compare(this.A00, up7.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A04, this.A03.hashCode() * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + Float.floatToIntBits(this.A00);
    }
}
