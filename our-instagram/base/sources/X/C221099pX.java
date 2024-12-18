package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.facebook.R;
import com.instagram.user.model.Product;

/* renamed from: X.9pX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221099pX extends AbstractC202348xE implements InterfaceC25199BCx, BBF {
    public EnumC53230NgS A00;
    public Product A01;
    public boolean A02;
    public boolean A03;
    public final C9SA A04;
    public final String A05;

    public C221099pX(Context context, int i, int i2, String str) {
        this(context, str, i, i2, false, true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A04.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A04.onBoundsChange(rect);
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A04.A0P;
    }

    @Override // X.InterfaceC25199BCx
    public final C190888ck C6I() {
        return this.A04.A0D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A04.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    @Override // X.InterfaceC25199BCx
    public void setTextFormat(C190888ck c190888ck) {
        if (c190888ck != null) {
            this.A04.A04(c190888ck);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A04.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C221099pX(Context context, String str) {
        this(context, AbstractC13880nE.A0A(context), context.getResources().getDimensionPixelSize(R.dimen.product_sticker_text_size), str);
        C14360o3.A0B(context, 1);
    }

    public C221099pX(Context context, String str, int i, int i2, boolean z, boolean z2) {
        this.A05 = str;
        C9SA c9sa = new C9SA(context, str, i, i2, z);
        this.A04 = c9sa;
        c9sa.A0G = z2;
        c9sa.A05(context.getResources().getString(2131970024), -1);
    }
}
