package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.9Sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210479Sm extends Drawable implements BEc {
    public int A00;
    public MusicOverlayStickerModel A01;
    public final C6RL A02;
    public final C6RB A03;

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
        this.A01 = musicOverlayStickerModel;
    }

    @Override // X.BEc
    public final /* synthetic */ void Elg() {
    }

    @Override // X.C74Q
    public final /* synthetic */ void FBl(boolean z, boolean z2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.BEc
    public final int ApI() {
        return this.A00;
    }

    @Override // X.BEc
    public final MusicOverlayStickerModel BVf() {
        return this.A01;
    }

    @Override // X.BEc
    public final EnumC138556Pl BVp() {
        return EnumC138556Pl.A0D;
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A02;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03.A0A;
    }

    public C210479Sm(Context context, MusicOverlayStickerModel musicOverlayStickerModel) {
        this.A01 = musicOverlayStickerModel;
        this.A02 = AbstractC1572274c.A00(context, this);
        C6RB A0Y = AbstractC167007dF.A0Y(context, context.getResources(), R.dimen.music_sticker_max_width);
        AbstractC166997dE.A1B(context.getResources(), A0Y, R.dimen.clips_template_landing_page_template_preview_clip_index_text_size);
        AbstractC166997dE.A1A(context, A0Y, AbstractC53242c7.A0A(context));
        AbstractC166997dE.A1C(context.getResources(), A0Y, 2131968056);
        this.A03 = A0Y;
        this.A00 = -1;
    }

    @Override // X.BEc
    public final void ERe(int i) {
        this.A00 = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        float A0F = AbstractC166997dE.A0F(this);
        C6RB c6rb = this.A03;
        Rect A0V = AbstractC166987dD.A0V((int) (A0F - (c6rb.A0A / 2.0f)), (int) (AbstractC167007dF.A00(this) - (c6rb.A06 / 2.0f)), (int) (AbstractC166997dE.A0F(this) + (c6rb.A0A / 2.0f)), (int) (AbstractC167007dF.A00(this) + (c6rb.A06 / 2.0f)));
        AbstractC167007dF.A0u(canvas, c6rb, A0V.left, A0V.top);
    }
}
