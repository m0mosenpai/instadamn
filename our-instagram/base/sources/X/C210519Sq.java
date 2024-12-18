package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.9Sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210519Sq extends Drawable implements BEc, C5RQ, Drawable.Callback, InterfaceC133125ze {
    public MusicOverlayStickerModel A00;
    public boolean A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final C6RL A05;
    public final C9SH A07;
    public final EnumC138556Pl A06 = EnumC138556Pl.A0G;
    public final String A08 = AbstractC111324zv.A00(2737);

    public C210519Sq(Context context, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, int i, boolean z) {
        this.A00 = musicOverlayStickerModel;
        Paint A0S = AbstractC166987dD.A0S(1);
        AbstractC166987dD.A1N(context, A0S, R.color.cds_white_a20);
        this.A04 = A0S;
        this.A03 = AbstractC167017dG.A0D(context);
        this.A02 = AbstractC167017dG.A0A(context);
        MusicAssetModel A03 = MusicAssetModel.A03(this.A00);
        ImageUrl imageUrl = A03.A03;
        C14360o3.A07(imageUrl);
        String str = A03.A0I;
        C14360o3.A07(str);
        String str2 = A03.A0D;
        C14360o3.A07(str2);
        C9SH c9sh = new C9SH(context, userSession, imageUrl, C05F.A00, str, str2, 0.0f, i, z, true);
        c9sh.setCallback(this);
        this.A07 = c9sh;
        this.A05 = AbstractC1572274c.A00(context, this);
    }

    @Override // X.C74Q
    public final /* synthetic */ void CN0() {
        AbstractC1572274c.A02(this);
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean CaH(UserSession userSession) {
        return A22.A00(userSession);
    }

    @Override // X.BEc
    public final /* synthetic */ void CoB() {
    }

    @Override // X.BEc
    public final void DUc(MusicOverlayStickerModel musicOverlayStickerModel) {
        C14360o3.A0B(musicOverlayStickerModel, 0);
        this.A00 = musicOverlayStickerModel;
    }

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // X.BEc
    public final /* synthetic */ void Elg() {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.BEc
    public final int ApI() {
        return this.A07.A0G.A0b.getColor();
    }

    @Override // X.BEc
    public final MusicOverlayStickerModel BVf() {
        return this.A00;
    }

    @Override // X.BEc
    public final EnumC138556Pl BVp() {
        return this.A06;
    }

    @Override // X.C5RR
    public final /* bridge */ /* synthetic */ C5NL C0T() {
        return new C24024AlG(this.A00, null, this.A06, this.A07.A0G.A0b.getColor());
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A05;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A08;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // X.BEc
    public final void ERe(int i) {
        C9SH c9sh = this.A07;
        c9sh.A0G.A0F(i);
        c9sh.A0F.A0F(i);
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        this.A07.A00 = i;
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        this.A01 = z;
        C6RL c6rl = this.A05;
        if (z2) {
            c6rl.A01();
        } else {
            c6rl.A00();
        }
        invalidateSelf();
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return AbstractC167017dG.A0K(this.A00.A0O);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A07.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07.A0B;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        if (this.A01) {
            RectF A0H = AbstractC167007dF.A0H(this);
            AbstractC167027dH.A0e(A0H, A0H.left, this.A03);
            float f = this.A02;
            canvas.drawRoundRect(A0H, f, f, this.A04);
        }
        AbstractC167017dG.A12(canvas, this);
        this.A07.draw(canvas);
        canvas.restore();
        this.A05.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
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
