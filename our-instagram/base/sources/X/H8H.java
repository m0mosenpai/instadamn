package X;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes7.dex */
public final class H8H extends C668630d {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public H8H(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = i;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f;
        if (this.A00 != 0) {
            if (c55982hj != null) {
                f = (float) c55982hj.A09.A00;
            } else {
                f = 0.0f;
            }
            ((View) this.A03).setClipBounds(new Rect(0, (int) (0.0f + f), ((View) this.A02).getWidth(), (int) (this.A01 - f)));
            return;
        }
        ((View) this.A03).setTranslationY((float) AbstractC70163Da.A01(c55982hj.A09.A00, this.A01));
    }
}
