package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.QBc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58819QBc extends AbstractC58820QBd implements InterfaceC65197Tff {
    public Animatable A00;

    @Override // X.InterfaceC65634Tpv
    public final void DPi(Drawable drawable) {
        A00(null);
        this.A00 = null;
        ((ImageView) super.A00).setImageDrawable(drawable);
    }

    @Override // X.InterfaceC65634Tpv
    public final void DPu(Drawable drawable) {
        A00(null);
        this.A00 = null;
        ((ImageView) super.A00).setImageDrawable(drawable);
    }

    public final void A00(Object obj) {
        if (this instanceof C58818QBb) {
            ((ImageView) super.A00).setImageDrawable((Drawable) obj);
        } else {
            ((ImageView) super.A00).setImageBitmap((Bitmap) obj);
        }
    }

    @Override // X.InterfaceC65538TmA
    public final void onStart() {
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // X.InterfaceC65538TmA
    public final void onStop() {
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // X.AbstractC58820QBd, X.InterfaceC65634Tpv
    public final void DPb(Drawable drawable) {
        super.DPb(drawable);
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.stop();
        }
        A00(null);
        this.A00 = null;
        ((ImageView) super.A00).setImageDrawable(drawable);
    }

    @Override // X.InterfaceC65634Tpv
    public final void Dgc(InterfaceC65328Ti9 interfaceC65328Ti9, Object obj) {
        if (!interfaceC65328Ti9.F8U(this, obj)) {
            A00(obj);
        }
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.A00 = animatable;
            animatable.start();
            return;
        }
        this.A00 = null;
    }
}
