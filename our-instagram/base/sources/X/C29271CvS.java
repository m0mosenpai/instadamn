package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.CvS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29271CvS implements InterfaceC161707Mf {
    public CP0 A00;
    public final View A01;

    @Override // X.InterfaceC161707Mf
    public final void APo(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Eiq(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Ej5() {
        return false;
    }

    @Override // X.InterfaceC161707Mf
    public final void DBy(float f, float f2) {
        this.A01.setTranslationX(f);
        CP0 cp0 = this.A00;
        if (cp0 != null) {
            float min = Math.min(f / f2, 1.0f);
            C162987Rj c162987Rj = cp0.A00;
            c162987Rj.A00 = f;
            c162987Rj.A02 = min;
            C55982hj c55982hj = c162987Rj.A03;
            if (c55982hj != null && !c55982hj.A0C()) {
                return;
            }
            C162987Rj.A00(c162987Rj, f, min);
        }
    }

    public C29271CvS(View view) {
        this.A01 = view;
    }
}
