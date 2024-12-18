package X;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Sth, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63787Sth implements InterfaceC65558Tme {
    public final AnimatedImageDrawable A00;

    @Override // X.InterfaceC65558Tme
    public final Class BoY() {
        return Drawable.class;
    }

    @Override // X.InterfaceC65558Tme
    public final /* bridge */ /* synthetic */ Object get() {
        return this.A00;
    }

    @Override // X.InterfaceC65558Tme
    public final int getSize() {
        AnimatedImageDrawable animatedImageDrawable = this.A00;
        int intrinsicWidth = animatedImageDrawable.getIntrinsicWidth() * animatedImageDrawable.getIntrinsicHeight();
        int A06 = AbstractC58318PtA.A06(Bitmap.Config.ARGB_8888, S6B.A00);
        int i = 4;
        if (A06 != 1) {
            if (A06 != 2 && A06 != 3) {
                if (A06 == 4) {
                    i = 8;
                }
            } else {
                i = 2;
            }
        } else {
            i = 1;
        }
        return intrinsicWidth * i * 2;
    }

    @Override // X.InterfaceC65558Tme
    public final void recycle() {
        AnimatedImageDrawable animatedImageDrawable = this.A00;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }

    public C63787Sth(AnimatedImageDrawable animatedImageDrawable) {
        this.A00 = animatedImageDrawable;
    }
}
