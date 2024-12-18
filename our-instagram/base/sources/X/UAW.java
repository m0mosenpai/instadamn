package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes11.dex */
public final class UAW extends View {
    public U8X A00;
    public boolean A01;
    public float A02;
    public final W2X A03;
    public final Runnable A04;
    public final Runnable A05;
    public final InterfaceC16660sJ A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UAW(Context context, InterfaceC16660sJ interfaceC16660sJ) {
        super(context, null, 0);
        C14360o3.A0B(interfaceC16660sJ, 4);
        this.A06 = interfaceC16660sJ;
        this.A03 = new W2X(this, new X2o(this, 4));
        this.A01 = true;
        this.A04 = new RunnableC71274Wr3(this);
        this.A05 = new RunnableC71275Wr4(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        U8X u8x = this.A00;
        if (u8x != null) {
            u8x.draw(canvas);
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
        if (!drawable.equals(this.A00) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public static final U8X A00(UAW uaw) {
        U8X u8x = uaw.A00;
        if (u8x == null) {
            u8x = (U8X) uaw.A06.invoke(AbstractC166997dE.A0L(uaw));
            float f = uaw.A02;
            if (u8x.A01 != f) {
                u8x.A01 = f;
                u8x.A05 = true;
                u8x.invalidateSelf();
            }
            Resources resources = uaw.getResources();
            C14360o3.A07(resources);
            float A01 = AbstractC69815Vw1.A01(resources, 1.0f);
            if (u8x.A02 != A01) {
                u8x.A02 = A01;
                u8x.A05 = true;
                u8x.invalidateSelf();
            }
            u8x.setCallback(uaw);
            uaw.A00 = u8x;
        }
        return u8x;
    }

    public static final void A01(UAW uaw) {
        U8X u8x = uaw.A00;
        if (u8x != null) {
            C65726Tt0 c65726Tt0 = u8x.A03;
            if (c65726Tt0 == null) {
                c65726Tt0 = new C65726Tt0(U8X.A0I, u8x, 0.0f);
                ((AbstractC65716Tsp) c65726Tt0).A02 = 0.00390625f;
                c65726Tt0.A03(0.00390625f * 0.75f);
                C65717Tsq c65717Tsq = c65726Tt0.A01;
                c65717Tsq.A01(0.25f);
                c65717Tsq.A02(100.0f);
                u8x.A03 = c65726Tt0;
            }
            c65726Tt0.A04 = 15.0f;
            c65726Tt0.A02();
            Runnable runnable = uaw.A04;
            uaw.removeCallbacks(runnable);
            uaw.postDelayed(runnable, 2500L);
        }
    }

    public final boolean getCanPopLid() {
        return false;
    }

    public final float getCornerRadiusPx() {
        return this.A02;
    }

    public final void setCornerRadiusPx(float f) {
        this.A02 = f;
        U8X u8x = this.A00;
        if (u8x != null && u8x.A01 != f) {
            u8x.A01 = f;
            u8x.A05 = true;
            u8x.invalidateSelf();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this).setBounds(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(355341416);
        super.onWindowVisibilityChanged(i);
        W2X w2x = this.A03;
        w2x.A00 = i;
        W2X.A00(w2x);
        C0f9.A0D(-840514723, A06);
    }
}
