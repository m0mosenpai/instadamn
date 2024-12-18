package X;

import android.content.Context;
import android.content.res.Resources;
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
import com.instagram.reels.question.model.MusicQuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponseReshareModel;

/* renamed from: X.9SM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SM extends Drawable implements Drawable.Callback, BEb {
    public MusicOverlayStickerModel A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Paint A05;
    public final RectF A06;
    public final RectF A07;
    public final C6RL A08;
    public final C9SQ A09;
    public final QuestionResponseReshareModel A0A;
    public final C221159pd A0B;

    @Override // X.BEc
    public final int ApI() {
        return 0;
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
    public final /* synthetic */ void DUc(MusicOverlayStickerModel musicOverlayStickerModel) {
    }

    @Override // X.BEc
    public final void ERe(int i) {
    }

    @Override // X.BEc
    public final /* synthetic */ void Elg() {
    }

    @Override // X.C74Q
    public final /* synthetic */ void FBl(boolean z, boolean z2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C9SM(Context context, QuestionResponseReshareModel questionResponseReshareModel, int i) {
        Resources resources = context.getResources();
        this.A0A = questionResponseReshareModel;
        this.A04 = i;
        int A08 = AbstractC166997dE.A08(resources);
        this.A02 = A08;
        this.A01 = AbstractC166997dE.A0A(resources);
        Paint A0P = AbstractC166997dE.A0P();
        this.A05 = A0P;
        AbstractC166987dD.A1R(A0P);
        A0P.setColor(-1);
        C221159pd c221159pd = new C221159pd(context, questionResponseReshareModel.A07, i);
        this.A0B = c221159pd;
        c221159pd.setCallback(this);
        MusicQuestionResponseModelIntf musicQuestionResponseModelIntf = questionResponseReshareModel.A01;
        musicQuestionResponseModelIntf.getClass();
        MusicAssetModel A01 = MusicAssetModel.A01(musicQuestionResponseModelIntf.BVV(), false);
        int color = context.getColor(R.color.grey_9);
        ImageUrl imageUrl = A01.A02;
        String str = A01.A0I;
        String str2 = A01.A0D;
        C14360o3.A0B(imageUrl, 2);
        AbstractC167007dF.A1F(str, 3, str2);
        C9SQ c9sq = new C9SQ(context, imageUrl, str2, str, R.dimen.album_music_sticker_album_art_size, color, 2, R.dimen.album_music_sticker_album_art_size, R.dimen.action_bar_item_spacing_right, color, false, false, false);
        this.A09 = c9sq;
        c9sq.setCallback(this);
        int i2 = c9sq.A05 + A08;
        this.A03 = c221159pd.A01 + i2;
        float f = i;
        this.A07 = AbstractC166987dD.A0Y(f, i2);
        this.A06 = AbstractC166987dD.A0Y(f, i2 - r4);
        this.A08 = AbstractC1572274c.A00(context, this);
    }

    @Override // X.BEc
    public final MusicOverlayStickerModel BVf() {
        return this.A00;
    }

    @Override // X.BEc
    public final EnumC138556Pl BVp() {
        return EnumC138556Pl.A0J;
    }

    @Override // X.BCC
    public final C22932A9c Bjc() {
        return this.A0A.A02;
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A08;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AbstractC167027dH.A0h(this.A0B, i);
        AbstractC167027dH.A0h(this.A09, i);
        this.A05.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC167027dH.A0d(colorFilter, this.A0B);
        AbstractC167027dH.A0d(colorFilter, this.A09);
        this.A05.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // X.BEb
    public final void EZN(MusicOverlayStickerModel musicOverlayStickerModel) {
        this.A00 = musicOverlayStickerModel;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167017dG.A11(canvas, getBounds());
        this.A0B.draw(canvas);
        canvas.translate(0.0f, r0.A01);
        RectF rectF = this.A07;
        float f = this.A01;
        Paint paint = this.A05;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A06, paint);
        int i = this.A04;
        AbstractC167007dF.A0u(canvas, this.A09, (i - r2.A08) / 2, this.A02);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
