package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9pZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221119pZ extends AbstractC216079hQ {
    public final int A00;
    public final int A01;
    public final Drawable A02;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A02.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1O(this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public C221119pZ(Context context) {
        int A09 = AbstractC167017dG.A09(context);
        this.A00 = A09;
        C27073Bwx c27073Bwx = new C27073Bwx(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        c27073Bwx.setCallback(this);
        this.A02 = c27073Bwx;
        this.A01 = A09 / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = this.A00 / 2.0f;
        AbstractC166997dE.A1E(this.A02, f - f2, A03 - f2, f + f2, A03 + f2);
    }
}
