package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UAV extends View {
    public long A00;
    public InterfaceC16660sJ A01;
    public final float A02;
    public final W2X A03;
    public final Runnable A04;
    public final List A05;

    public UAV(Context context) {
        super(context, null, 0);
        this.A02 = AbstractC69815Vw1.A00(context, -150.0f);
        this.A05 = new ArrayList();
        this.A03 = new W2X(this, new X2o(this, 7));
        this.A04 = new RunnableC71277Wr7(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        for (C69332Vle c69332Vle : this.A05) {
            int save = canvas.save();
            try {
                c69332Vle.A04.A00(canvas);
                c69332Vle.A02.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        W2X.A00(this.A03);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        List list = this.A05;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C69332Vle) it.next()).A02, drawable)) {
                    return true;
                }
            }
        }
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public static final void A00(UAV uav) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uav.A00;
        if (j == 0) {
            j = uptimeMillis - 16;
            uav.A00 = j;
        }
        float f = ((float) (uptimeMillis - j)) / 1000.0f;
        uav.A00 = uptimeMillis;
        float width = uav.getWidth() * 0.5f;
        List list = uav.A05;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                C69332Vle c69332Vle = (C69332Vle) list.get(size);
                C69719VuE c69719VuE = c69332Vle.A03;
                C69627VsU c69627VsU = c69332Vle.A04;
                c69332Vle.A00 += f;
                c69719VuE.A07 = (-15.0f) * c69627VsU.A02;
                C14360o3.A07(uav.getResources());
                C14360o3.A07(c69332Vle.A02.getBounds());
                float centerX = (((width - (r9.centerX() + c69627VsU.A05)) * 0.35f) + (AbstractC69815Vw1.A01(r3, c69627VsU.A02) * 20.0f)) - c69719VuE.A08;
                c69719VuE.A00 = centerX;
                c69719VuE.A00 = centerX * (c69332Vle.A00 + 1.0f);
                c69719VuE.A00(f);
                c69719VuE.A01(c69627VsU, f);
                if (c69332Vle.A05) {
                    float cos = (((float) Math.cos((c69332Vle.A00 * 1.5f) + c69332Vle.A01)) * 0.45f) + 0.75f;
                    c69627VsU.A03 = cos;
                    c69627VsU.A04 = cos;
                }
                if (r9.top + c69627VsU.A06 + (c69627VsU.A04 * r9.height()) < 0.0f) {
                    list.remove(size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        uav.invalidate();
        if (!list.isEmpty()) {
            uav.postOnAnimation(uav.A04);
            return;
        }
        uav.A00 = 0L;
        InterfaceC16660sJ interfaceC16660sJ = uav.A01;
        if (interfaceC16660sJ == null) {
            return;
        }
        interfaceC16660sJ.invoke(uav);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(353451267);
        super.onWindowVisibilityChanged(i);
        W2X w2x = this.A03;
        w2x.A00 = i;
        W2X.A00(w2x);
        C0f9.A0D(1893156031, A06);
    }

    public final void setOnFinishListener(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }
}
