package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9SX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SX extends Drawable implements BE6 {
    public int A00;
    public int A01;
    public boolean A02;
    public final Drawable A03;
    public final C22923A8t A04;
    public final C210539Ss A05;

    public C9SX(Context context, Drawable drawable, TargetViewSizeProvider targetViewSizeProvider, C22923A8t c22923A8t) {
        int intrinsicHeight;
        C14360o3.A0B(targetViewSizeProvider, 4);
        this.A03 = drawable;
        this.A04 = c22923A8t;
        this.A05 = new C210539Ss(context);
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        if (interfaceC1812882f.getWidth() != 0 && interfaceC1812882f.getHeight() != 0) {
            this.A01 = (int) (interfaceC1812882f.getWidth() * 0.5f);
            intrinsicHeight = (int) (interfaceC1812882f.getHeight() * 0.5f);
        } else {
            this.A01 = this.A03.getIntrinsicWidth();
            intrinsicHeight = this.A03.getIntrinsicHeight();
        }
        this.A00 = intrinsicHeight;
        ESD(Math.min(this.A01, intrinsicHeight) / 10.0f);
    }

    @Override // X.BE6
    public final /* synthetic */ void APv() {
    }

    @Override // X.BE6
    public final void APw() {
        this.A02 = true;
        invalidateSelf();
    }

    @Override // X.BE6
    public final /* synthetic */ void CMo(boolean z) {
    }

    @Override // X.BE6
    public final void CMp() {
        this.A02 = false;
        invalidateSelf();
    }

    @Override // X.BE6
    public final /* synthetic */ void Dek(AbstractC172157lk abstractC172157lk, float f) {
    }

    @Override // X.BE6
    public final /* synthetic */ void EQ8(int i) {
    }

    @Override // X.BE6
    public final /* synthetic */ void Egd(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A03.draw(canvas);
        if (this.A02) {
            this.A05.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A03.setBounds(rect);
        this.A05.setBounds(rect);
        ESD(Math.min(rect.width(), rect.height()) / 10.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.InterfaceC25171BBr
    public final Drawable Ad0() {
        return this.A03;
    }

    @Override // X.BE6
    public final /* synthetic */ int AeQ() {
        return 0;
    }

    @Override // X.BE6
    public final float Arr() {
        Object obj = this.A03;
        if (obj instanceof C8FY) {
            return ((C8FY) obj).A00;
        }
        if (obj instanceof BD2) {
            return ((BD2) obj).Arr();
        }
        return 0.0f;
    }

    @Override // X.BE6
    public final Bitmap BQU() {
        Drawable drawable = this.A03;
        return AbstractC167027dH.A05(drawable, drawable);
    }

    @Override // X.BE6
    public final C22923A8t BmU() {
        return this.A04;
    }

    @Override // X.BE6
    public final /* synthetic */ int CE8() {
        return 0;
    }

    @Override // X.BE6
    public final void ESD(float f) {
        Object obj = this.A03;
        if (obj instanceof C8FY) {
            ((C8FY) obj).A02(f);
        } else {
            if (!(obj instanceof BD2)) {
                return;
            }
            ((BD2) obj).ESD(f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AbstractC167027dH.A0j(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC167027dH.A0i(this, runnable);
    }
}
