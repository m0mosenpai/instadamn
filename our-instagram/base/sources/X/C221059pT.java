package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.facebook.R;
import com.instagram.user.model.ProductCollection;

/* renamed from: X.9pT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221059pT extends AbstractC202368xG implements InterfaceC25199BCx {
    public final C9SA A00;
    public final ProductCollection A01;
    public final String A02;

    public C221059pT(Context context, ProductCollection productCollection, String str) {
        String str2;
        C14360o3.A0B(str, 2);
        this.A02 = str;
        this.A01 = productCollection;
        C9SA c9sa = new C9SA(context, this.A02, AbstractC13880nE.A0A(context), context.getResources().getDimensionPixelSize(R.dimen.product_sticker_text_size), false);
        this.A00 = c9sa;
        String title = productCollection.getTitle();
        if (title != null) {
            str2 = AbstractC166997dE.A10(C1Q2.A02(), title);
        } else {
            str2 = "";
        }
        c9sa.A05(str2, -1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A00.onBoundsChange(rect);
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A02;
    }

    @Override // X.InterfaceC25199BCx
    public final C190888ck C6I() {
        return this.A00.A0D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    @Override // X.InterfaceC25199BCx
    public final void setTextFormat(C190888ck c190888ck) {
        if (c190888ck != null) {
            this.A00.A04(c190888ck);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A00.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
