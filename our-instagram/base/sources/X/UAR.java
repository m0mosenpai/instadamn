package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes11.dex */
public final class UAR extends View {
    public final C66311U8k A00;
    public final C69070VhL A01;
    public final W2X A02;

    public UAR(Context context, C66309U8i c66309U8i) {
        super(context, null, 0);
        this.A01 = new C69070VhL(this, c66309U8i);
        C66311U8k c66311U8k = new C66311U8k(context);
        c66311U8k.setCallback(this);
        this.A00 = c66311U8k;
        this.A02 = new W2X(this, new X2o(this, 3));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        this.A01.A02.draw(canvas);
        this.A00.draw(canvas);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        W2X.A00(this.A02);
    }

    public final void setTargetId(String str) {
        C14360o3.A0B(str, 0);
        C66311U8k c66311U8k = this.A00;
        if (!C14360o3.A0K(c66311U8k.A04, str)) {
            c66311U8k.A04 = str;
            C66311U8k.A00(c66311U8k);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        if (!drawable.equals(this.A00) && drawable != this.A01.A02 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final int getCornerRadiusPx() {
        return this.A01.A02.A00;
    }

    public final InterfaceC161177Kc getFlareDrawableFactory() {
        return this.A00.A03;
    }

    public final String getTargetId() {
        return this.A00.A04;
    }

    public final void setCornerRadiusPx(int i) {
        C66309U8i c66309U8i = this.A01.A02;
        if (c66309U8i.A00 != i) {
            c66309U8i.A00 = i;
            c66309U8i.A01 = true;
            c66309U8i.invalidateSelf();
        }
        C66311U8k c66311U8k = this.A00;
        if (c66311U8k.A00 != i) {
            c66311U8k.A00 = i;
            if (c66311U8k.A01 != null) {
                c66311U8k.A05 = true;
                c66311U8k.invalidateSelf();
            }
        }
    }

    public final void setFlareDrawableFactory(InterfaceC161177Kc interfaceC161177Kc) {
        this.A00.A03 = interfaceC161177Kc;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C69070VhL c69070VhL = this.A01;
        C66309U8i c66309U8i = c69070VhL.A02;
        View view = c69070VhL.A01;
        c66309U8i.setBounds(view.getPaddingLeft(), view.getPaddingTop(), AbstractC65702TsY.A08(view), AbstractC65702TsY.A07(view));
        c66309U8i.A01(AbstractC25230BEn.A1S(AbstractC166997dE.A0G(c66309U8i), AbstractC69815Vw1.A00(AbstractC166997dE.A0L(view), 50.0f)));
        this.A00.setBounds(getPaddingLeft(), getPaddingTop(), AbstractC65702TsY.A08(this), AbstractC65702TsY.A07(this));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(-63257743);
        super.onWindowVisibilityChanged(i);
        W2X w2x = this.A02;
        w2x.A00 = i;
        W2X.A00(w2x);
        C0f9.A0D(965453132, A06);
    }
}
