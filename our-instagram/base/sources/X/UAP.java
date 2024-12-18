package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UAP extends View {
    public long A00;
    public InterfaceC16660sJ A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final Runnable A06;
    public final List A07;
    public final W2X A08;

    public UAP(Context context) {
        super(context, null, 0);
        this.A07 = new ArrayList();
        this.A06 = new Wr5(this);
        C14360o3.A07(getResources());
        this.A05 = AbstractC69815Vw1.A01(r1, 4.0f);
        this.A04 = AbstractC69815Vw1.A01(r1, 15.0f);
        this.A03 = AbstractC69815Vw1.A01(r1, -200.0f);
        this.A02 = AbstractC69815Vw1.A01(r1, 800.0f);
        this.A08 = new W2X(this, new X2o(this, 5));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        for (C69207Vja c69207Vja : this.A07) {
            int save = canvas.save();
            try {
                c69207Vja.A03.A00(canvas);
                c69207Vja.A01.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        W2X.A00(this.A08);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        List list = this.A07;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C69207Vja) it.next()).A01, drawable)) {
                    return true;
                }
            }
        }
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(1778916225);
        super.onWindowVisibilityChanged(i);
        W2X w2x = this.A08;
        w2x.A00 = i;
        W2X.A00(w2x);
        C0f9.A0D(-582269067, A06);
    }

    public final void setOnFinishListener(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }
}
