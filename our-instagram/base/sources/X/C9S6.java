package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.9S6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9S6 extends Drawable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final Bitmap A0E;
    public final C1816583x A0F;
    public final String A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final float A0O;
    public final float A0P;
    public final UserSession A0Q;
    public final InteractiveDrawableContainer A0R;

    public C9S6(Context context, Bitmap bitmap, UserSession userSession, C1816583x c1816583x, InteractiveDrawableContainer interactiveDrawableContainer) {
        AbstractC167007dF.A1G(c1816583x, 3, interactiveDrawableContainer);
        this.A0Q = userSession;
        this.A0D = context;
        this.A0F = c1816583x;
        this.A0E = bitmap;
        this.A0R = interactiveDrawableContainer;
        this.A0P = AbstractC167017dG.A0F(context);
        this.A0O = AbstractC167017dG.A03(context);
        int A0A = (int) (AbstractC13880nE.A0A(context) * 0.75f);
        this.A01 = A0A;
        this.A00 = (int) (A0A / 0.75f);
        this.A0G = c1816583x.A03;
        this.A08 = AbstractC166997dE.A01(context);
        this.A0C = AbstractC166997dE.A02(context);
        this.A0A = context.getColor(R.color.black_30_transparent);
        this.A07 = context.getColor(R.color.black_10_transparent);
        this.A0B = AbstractC167007dF.A08(context);
        this.A06 = bitmap.getWidth();
        this.A09 = AbstractC167017dG.A08(context);
        this.A0H = B8S.A00(this, 31);
        this.A0L = B8S.A00(this, 35);
        this.A0K = B8S.A00(this, 34);
        this.A0I = B8S.A00(this, 32);
        this.A0N = B8S.A00(this, 37);
        this.A0M = B8S.A00(this, 36);
        this.A0J = B8S.A00(this, 33);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) (this.A01 / 0.75f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.A0E.getWidth() * 0.75f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable A0a = AbstractC166987dD.A0a(this.A0H);
        if (A0a != null) {
            A0a.setAlpha(i);
        }
    }

    public static void A00(Canvas canvas, InterfaceC09390do interfaceC09390do, int i, int i2) {
        ((Drawable) interfaceC09390do.getValue()).setBounds(i2, i - ((Drawable) interfaceC09390do.getValue()).getIntrinsicHeight(), ((Drawable) interfaceC09390do.getValue()).getIntrinsicWidth() + i2, i);
        canvas.save();
        ((Drawable) interfaceC09390do.getValue()).draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect A0Q = AbstractC167017dG.A0Q(this, canvas);
        int i = (A0Q.left + A0Q.right) / 2;
        int i2 = (A0Q.top + A0Q.bottom) / 2;
        int i3 = this.A01;
        int i4 = i - (i3 / 2);
        this.A03 = i4;
        int i5 = this.A00;
        int i6 = i2 - (i5 / 2);
        this.A05 = i6;
        this.A04 = i4 + i3;
        this.A02 = i6 + i5;
        InterfaceC09390do interfaceC09390do = this.A0H;
        if (interfaceC09390do.getValue() != null) {
            Drawable A0a = AbstractC166987dD.A0a(interfaceC09390do);
            if (A0a != null) {
                A0a.setBounds(this.A03, this.A05, this.A04, this.A02);
            }
            Drawable A0a2 = AbstractC166987dD.A0a(interfaceC09390do);
            if (A0a2 != null) {
                A0a2.draw(canvas);
            }
            canvas.save();
            float f = this.A03;
            float f2 = this.A05;
            Context context = this.A0D;
            canvas.drawRoundRect(new RectF(f, f2 + AbstractC13880nE.A04(context, 140), this.A04, this.A02), 12.0f, 12.0f, (Paint) this.A0I.getValue());
            canvas.restore();
            int i7 = this.A03;
            int i8 = (int) this.A0P;
            int i9 = i7 + i8;
            int i10 = this.A05 + i8;
            InterfaceC09390do interfaceC09390do2 = this.A0L;
            AbstractC166987dD.A0a(interfaceC09390do2).setBounds(i9, i10, AbstractC166987dD.A0a(interfaceC09390do2).getIntrinsicWidth() + i9, AbstractC167027dH.A02(interfaceC09390do2) + i10);
            canvas.save();
            AbstractC167007dF.A0v(canvas, interfaceC09390do2);
            canvas.restore();
            int i11 = this.A02;
            int i12 = (int) this.A0O;
            int i13 = i11 - i12;
            int i14 = this.A03 + i12;
            InterfaceC09390do interfaceC09390do3 = this.A0K;
            Drawable A0a3 = AbstractC166987dD.A0a(interfaceC09390do3);
            int i15 = this.A09;
            int i16 = i13 - i15;
            int i17 = i15 + i14;
            A0a3.setBounds(i14, i16, i17, i13);
            canvas.save();
            AbstractC167007dF.A0v(canvas, interfaceC09390do3);
            canvas.restore();
            int A05 = i17 + AbstractC167017dG.A05(context);
            InterfaceC09390do interfaceC09390do4 = this.A0N;
            A00(canvas, interfaceC09390do4, i13 - ((i15 - AbstractC167027dH.A02(interfaceC09390do4)) / 2), A05);
            int dimensionPixelSize = i16 - context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            InterfaceC09390do interfaceC09390do5 = this.A0M;
            int A02 = AbstractC167027dH.A02(interfaceC09390do5);
            A00(canvas, interfaceC09390do5, dimensionPixelSize, i14);
            A00(canvas, this.A0J, (dimensionPixelSize - A02) - AbstractC166997dE.A04(context, R.dimen.abc_action_bar_elevation_material), i14);
        }
    }
}
