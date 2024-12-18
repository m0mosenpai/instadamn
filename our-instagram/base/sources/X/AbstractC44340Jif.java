package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Jif, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44340Jif extends Drawable {
    public final float A00;
    public final float A01;
    public final float A02;
    public final Context A03;

    public AbstractC44340Jif(Context context) {
        C14360o3.A0B(context, 1);
        this.A03 = context;
        this.A02 = AbstractC13880nE.A04(context, 20);
        AbstractC13880nE.A04(context, 40);
        this.A00 = AbstractC13880nE.A04(context, 50);
        this.A01 = AbstractC13880nE.A04(context, 104);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final int A02() {
        if (this instanceof C46014KYc) {
            C46014KYc c46014KYc = (C46014KYc) this;
            if (c46014KYc.A0E) {
                long j = c46014KYc.A06;
                if (j == -1) {
                    return 0;
                }
                float A00 = (float) AbstractC37300Gc1.A00(j);
                if (A00 >= 300.0f) {
                    return c46014KYc.A04;
                }
                return Math.round(AbstractC13600mm.A02(A00, 0.0f, 300.0f, 0.0f, c46014KYc.A04));
            }
            return 255;
        }
        return 255;
    }

    public final int A03() {
        if (!(this instanceof C46014KYc) && (this instanceof C46012KYa)) {
            return -1;
        }
        return 0;
    }

    public final GradientSpinner A04() {
        if (this instanceof C46014KYc) {
            return ((C46014KYc) this).A0R;
        }
        return null;
    }
}
