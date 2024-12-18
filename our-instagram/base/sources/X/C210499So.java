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

/* renamed from: X.9So, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C210499So extends Drawable implements BEc, Drawable.Callback, InterfaceC133125ze, BEa {
    public MusicOverlayStickerModel A00;
    public boolean A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final C6RL A06;
    public final C9SQ A08;
    public final EnumC138556Pl A07 = EnumC138556Pl.A0E;
    public final String A09 = AbstractC111324zv.A00(2730);

    public C210499So(Context context, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, int i, boolean z, boolean z2) {
        this.A00 = musicOverlayStickerModel;
        this.A06 = AbstractC1572274c.A00(context, this);
        Paint A0S = AbstractC166987dD.A0S(1);
        AbstractC166987dD.A1N(context, A0S, R.color.cds_white_a20);
        this.A05 = A0S;
        this.A04 = AbstractC13880nE.A00(context, 5.0f);
        this.A03 = AbstractC13880nE.A00(context, 10.0f);
        MusicAssetModel A03 = MusicAssetModel.A03(this.A00);
        ImageUrl imageUrl = A03.A02;
        C14360o3.A07(imageUrl);
        String str = A03.A0I;
        C14360o3.A07(str);
        String str2 = A03.A0D;
        C14360o3.A07(str2);
        C9SQ c9sq = new C9SQ(context, imageUrl, str2, str, R.dimen.album_music_sticker_album_art_size, i, 2, R.dimen.album_music_sticker_album_art_size, R.dimen.action_bar_item_spacing_right, i, z, A03.A0U && C36A.A0C(userSession), z2);
        this.A08 = c9sq;
        c9sq.setCallback(this);
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
    public final void DUc(MusicOverlayStickerModel musicOverlayStickerModel) {
        C14360o3.A0B(musicOverlayStickerModel, 0);
        this.A00 = musicOverlayStickerModel;
    }

    @Override // X.C74S
    public final void Edi(boolean z) {
        this.A01 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.BEc
    public final int ApI() {
        return this.A08.A0B.A0b.getColor();
    }

    @Override // X.BEc
    public final MusicOverlayStickerModel BVf() {
        return this.A00;
    }

    @Override // X.BEc
    public final EnumC138556Pl BVp() {
        return this.A07;
    }

    @Override // X.C74S
    public final /* synthetic */ EnumC223189sx Btb() {
        return EnumC223189sx.A05;
    }

    @Override // X.BEa
    public final C9ZU Byb() {
        C9SQ c9sq = this.A08;
        int i = c9sq.A08 / 2;
        int i2 = c9sq.A06;
        int i3 = c9sq.A07;
        int i4 = i3 / 2;
        int i5 = c9sq.A05;
        float f = i3;
        return new C9ZU(3, (i - i2) - i4, (((i5 / 2) - (i5 - c9sq.A04)) - i2) - i4, f, f);
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A06;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A09;
    }

    @Override // X.C74S
    public final boolean Ccs() {
        return this.A01;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // X.BEc
    public final void CoB() {
        if (!(this instanceof C5RQ) || this.A01) {
            this.A08.A01 = false;
        }
    }

    @Override // X.BEc
    public final void ERe(int i) {
        C9SQ c9sq = this.A08;
        c9sq.A0B.A0F(i);
        c9sq.A0A.A0F(i);
    }

    @Override // X.BEc
    public final void Elg() {
        this.A08.A01 = true;
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        this.A02 = z;
        C6RL c6rl = this.A06;
        if (z2) {
            c6rl.A01();
        } else {
            c6rl.A00();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A08.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AbstractC167027dH.A0h(this.A08, i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC167027dH.A0d(colorFilter, this.A08);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        if (this.A02) {
            RectF A0H = AbstractC167007dF.A0H(this);
            AbstractC167027dH.A0e(A0H, A0H.left, this.A04);
            float f = this.A03;
            canvas.drawRoundRect(A0H, f, f, this.A05);
        }
        AbstractC167017dG.A12(canvas, this);
        this.A08.draw(canvas);
        canvas.restore();
        this.A06.draw(canvas);
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
