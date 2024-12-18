package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.reels.question.model.MusicQuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponseReshareModel;

/* renamed from: X.9SN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SN extends Drawable implements Drawable.Callback, BEb {
    public MusicOverlayStickerModel A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06;
    public final RectF A07;
    public final RectF A08;
    public final C6RL A09;
    public final C9SI A0A;
    public final QuestionResponseReshareModel A0B;
    public final C221159pd A0C;

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
        return this.A0B.A02;
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A09;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AbstractC167027dH.A0h(this.A0C, i);
        AbstractC167027dH.A0h(this.A0A, i);
        this.A06.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC167027dH.A0d(colorFilter, this.A0C);
        AbstractC167027dH.A0d(colorFilter, this.A0A);
        this.A06.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C9SN(Context context, QuestionResponseReshareModel questionResponseReshareModel, int i) {
        Resources resources = context.getResources();
        this.A0B = questionResponseReshareModel;
        this.A05 = i;
        int A08 = AbstractC166997dE.A08(resources);
        this.A03 = A08;
        int A09 = AbstractC166997dE.A09(resources);
        this.A02 = A09;
        this.A01 = AbstractC166997dE.A0A(resources);
        Paint A0P = AbstractC166997dE.A0P();
        this.A06 = A0P;
        AbstractC166987dD.A1R(A0P);
        A0P.setColor(-1);
        C221159pd c221159pd = new C221159pd(context, questionResponseReshareModel.A07, i);
        this.A0C = c221159pd;
        c221159pd.setCallback(this);
        MusicQuestionResponseModelIntf musicQuestionResponseModelIntf = questionResponseReshareModel.A01;
        musicQuestionResponseModelIntf.getClass();
        C9SI c9si = new C9SI(context, MusicAssetModel.A01(musicQuestionResponseModelIntf.BVV(), false), i - (A09 * 2), -1, false, false, false);
        this.A0A = c9si;
        c9si.setCallback(this);
        int i2 = c9si.A06 + (A08 * 2);
        this.A04 = c221159pd.A01 + i2;
        float f = i;
        this.A08 = AbstractC166987dD.A0Y(f, i2);
        this.A07 = AbstractC166987dD.A0Y(f, i2 - r3);
        this.A09 = AbstractC1572274c.A00(context, this);
    }

    @Override // X.BEb
    public final void EZN(MusicOverlayStickerModel musicOverlayStickerModel) {
        this.A00 = musicOverlayStickerModel;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167017dG.A11(canvas, getBounds());
        this.A0C.draw(canvas);
        canvas.translate(0.0f, r0.A01);
        RectF rectF = this.A08;
        float f = this.A01;
        Paint paint = this.A06;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A07, paint);
        canvas.translate(this.A02, this.A03);
        this.A0A.draw(canvas);
        canvas.restore();
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
