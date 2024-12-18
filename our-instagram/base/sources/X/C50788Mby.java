package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.List;

/* renamed from: X.Mby, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50788Mby extends View {
    public float A00;
    public int A01;
    public int A02;
    public List A03;
    public boolean A04;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        C55131Obt c55131Obt = C55131Obt.A05;
        Context A0L = AbstractC166997dE.A0L(this);
        boolean z = this.A04;
        List list = this.A03;
        int i = this.A01;
        int i2 = this.A02;
        float f3 = this.A00;
        synchronized (c55131Obt) {
            OEL oel = C55131Obt.A02;
            if (oel != null) {
                if (z) {
                    f = oel.A05;
                } else {
                    f = oel.A03;
                }
                if (z) {
                    f2 = oel.A04;
                } else {
                    f2 = oel.A00;
                }
                if (list != null) {
                    int i3 = 0;
                    for (Object obj : C55131Obt.A00(null, list, ((AbstractC50522MSa.A00(A0L, OZQ.A00) * 1000.0f) / oel.A01) / f3, f3, i, i2, false)) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C55131Obt.A01(canvas, AbstractC166987dD.A09(obj), f2, f, i3);
                        i3 = i4;
                    }
                }
            }
        }
    }
}
