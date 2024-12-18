package X;

import android.view.MotionEvent;

/* renamed from: X.GyN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38620GyN extends C0T6 {
    public final float A00;
    public final float A01;
    public final MotionEvent A02;
    public final MotionEvent A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38620GyN) {
                C38620GyN c38620GyN = (C38620GyN) obj;
                if (!C14360o3.A0K(this.A03, c38620GyN.A03) || !C14360o3.A0K(this.A02, c38620GyN.A02) || Float.compare(this.A00, c38620GyN.A00) != 0 || Float.compare(this.A01, c38620GyN.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC166997dE.A0I(this.A02)) * 31, this.A00) + Float.floatToIntBits(this.A01);
    }

    public C38620GyN(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A03 = motionEvent;
        this.A02 = motionEvent2;
        this.A00 = f;
        this.A01 = f2;
    }
}
