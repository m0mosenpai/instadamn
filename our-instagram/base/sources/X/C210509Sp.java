package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.9Sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210509Sp extends Drawable implements BEc, InterfaceC133125ze {
    public int A00;
    public MusicOverlayStickerModel A01;
    public final C6RL A02;
    public final String A03 = AbstractC111324zv.A00(1118);

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
    public final void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 0;
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

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A03;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    public C210509Sp(Context context, MusicOverlayStickerModel musicOverlayStickerModel, int i) {
        this.A00 = i;
        this.A01 = musicOverlayStickerModel;
        this.A02 = AbstractC1572274c.A00(context, this);
    }

    @Override // X.BEc
    public final void ERe(int i) {
        this.A00 = i;
    }
}
