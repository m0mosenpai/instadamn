package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.May, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50744May extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final int A0G;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.save();
        canvas.drawPath((Path) this.A0D.getValue(), (Paint) this.A0C.getValue());
        canvas.drawPath((Path) this.A0F.getValue(), (Paint) this.A0E.getValue());
        AbstractC166987dD.A0a(this.A08).draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.setBounds(rect);
        float f = (rect.left + rect.right) / 2.0f;
        int i = rect.top + rect.bottom;
        int i2 = this.A03;
        float f2 = (i + i2) / 2.0f;
        AbstractC166987dD.A0a(this.A08).setBounds((int) (f - (((C6RB) r8.getValue()).A0A / 2.0f)), (int) (f2 - (((C6RB) r8.getValue()).A06 / 2.0f)), (int) (f + (((C6RB) r8.getValue()).A0A / 2.0f)), (int) (f2 + (((C6RB) r8.getValue()).A0A / 2.0f)));
        Path path = (Path) this.A0D.getValue();
        path.reset();
        float f3 = i2;
        RectF rectF = new RectF(rect.left, rect.top + f3, rect.right, rect.bottom);
        InterfaceC09390do interfaceC09390do = this.A0B;
        path.addRoundRect(rectF, new float[]{MSZ.A03(interfaceC09390do), MSZ.A03(interfaceC09390do), MSZ.A03(interfaceC09390do), MSZ.A03(interfaceC09390do), MSZ.A03(interfaceC09390do), MSZ.A03(interfaceC09390do), MSZ.A03(interfaceC09390do), MSZ.A03(interfaceC09390do)}, Path.Direction.CW);
        Path path2 = (Path) this.A0F.getValue();
        path2.reset();
        float f4 = rect.top + f3 + 1.0f;
        float f5 = ((rect.left + rect.right) / 2.0f) + (this.A00 / 2.0f);
        path2.moveTo(f5, f4);
        path2.lineTo(f5, f4 - f3);
        path2.lineTo(f5 + this.A04, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C6RB) this.A08.getValue()).A06 + this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0G - (AbstractC167027dH.A01(this.A06) * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AbstractC166987dD.A0a(this.A08).setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC166987dD.A0a(this.A08).setColorFilter(colorFilter);
    }

    public C50744May(Context context, int i, int i2, String str) {
        AbstractC167017dG.A1Q(context, str);
        this.A0G = i;
        this.A05 = str;
        this.A01 = i2;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        this.A04 = AbstractC166997dE.A04(context, R.dimen.action_bar_item_spacing_right);
        this.A09 = AbstractC09440dt.A01(new C25027B5z(context, 43));
        this.A07 = AbstractC09440dt.A01(new C25027B5z(context, 42));
        this.A0A = AbstractC09440dt.A01(new C25027B5z(context, 44));
        this.A06 = AbstractC09440dt.A01(new C25027B5z(context, 41));
        this.A0B = AbstractC09440dt.A01(new C25027B5z(context, 45));
        this.A02 = (i - (AbstractC167027dH.A01(this.A06) * 2)) - (AbstractC167027dH.A01(this.A07) * 2);
        this.A08 = AbstractC09440dt.A01(new C57257Pbf(34, context, this));
        this.A0C = AbstractC09440dt.A01(new C25027B5z(context, 46));
        this.A0E = AbstractC09440dt.A01(new C57257Pbf(35, context, this));
        this.A0D = AbstractC09440dt.A01(C57399Pdx.A00);
        this.A0F = AbstractC09440dt.A01(C57400Pdy.A00);
    }
}
