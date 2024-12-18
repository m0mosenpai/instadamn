package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.8xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202628xg extends Drawable implements C5RQ, InterfaceC133125ze, InterfaceC202608xe, InterfaceC25171BBr {
    public final Drawable A00;
    public final C202618xf A01;
    public final C3YU A02;
    public final ProductType A03;
    public final String A04;

    public C202628xg(Context context, Drawable drawable, C1815983m c1815983m, C3YU c3yu) {
        this.A00 = drawable;
        this.A02 = c3yu;
        C202618xf c202618xf = new C202618xf(context, c1815983m, true);
        this.A01 = c202618xf;
        this.A04 = c202618xf.C5K();
        this.A03 = ProductType.IGTV;
    }

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A00.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A01.setBounds(rect);
        this.A00.setBounds(rect);
        invalidateSelf();
    }

    @Override // X.InterfaceC25171BBr
    public final Drawable Ad0() {
        return this.A00;
    }

    @Override // X.InterfaceC202608xe
    public final C3YU BS7() {
        return this.A02;
    }

    @Override // X.InterfaceC202608xe
    public final ProductType BhP() {
        return this.A03;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A01.A05;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A04;
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        this.A01.A00 = i;
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.round(this.A01.A03);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.round(this.A01.A04);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }
}
