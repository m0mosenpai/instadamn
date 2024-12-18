package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.9Sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C210489Sn extends Drawable implements BEc, Drawable.Callback, InterfaceC133125ze, BEa {
    public MusicOverlayStickerModel A00;
    public boolean A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final C9SI A06;
    public final C6RL A07;
    public final String A08 = AbstractC111324zv.A00(2736);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (X.C36A.A0C(r12) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C210489Sn(android.content.Context r11, com.instagram.common.session.UserSession r12, com.instagram.music.common.model.MusicOverlayStickerModel r13, int r14, boolean r15) {
        /*
            r10 = this;
            r7 = 1
            r10.<init>()
            r10.A00 = r13
            r0 = 2736(0xab0, float:3.834E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r10.A08 = r0
            com.instagram.music.common.model.MusicAssetModel r4 = com.instagram.music.common.model.MusicAssetModel.A03(r13)
            r3 = r11
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165652(0x7f0701d4, float:1.7945527E38)
            int r5 = r1.getDimensionPixelSize(r0)
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r10.A00
            java.lang.Boolean r0 = r0.A0E
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r7)
            if (r0 == 0) goto L2f
            boolean r0 = X.C36A.A0C(r12)
            r8 = 1
            if (r0 != 0) goto L30
        L2f:
            r8 = 0
        L30:
            X.9SI r2 = new X.9SI
            r6 = r14
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.A06 = r2
            android.graphics.Paint r1 = X.AbstractC166987dD.A0S(r7)
            r10.A05 = r1
            r2.setCallback(r10)
            r0 = 1084227584(0x40a00000, float:5.0)
            float r0 = X.AbstractC13880nE.A00(r11, r0)
            r10.A04 = r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = X.AbstractC13880nE.A00(r11, r0)
            r10.A03 = r0
            r0 = 2131099903(0x7f0600ff, float:1.7812172E38)
            X.AbstractC166987dD.A1N(r11, r1, r0)
            X.6RL r0 = X.AbstractC1572274c.A00(r11, r10)
            r10.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210489Sn.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.music.common.model.MusicOverlayStickerModel, int, boolean):void");
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
        return this.A06.A0C.getColor();
    }

    @Override // X.BEc
    public final MusicOverlayStickerModel BVf() {
        return this.A00;
    }

    @Override // X.BEc
    public final EnumC138556Pl BVp() {
        return EnumC138556Pl.A0F;
    }

    @Override // X.C74S
    public final /* synthetic */ EnumC223189sx Btb() {
        return EnumC223189sx.A05;
    }

    @Override // X.BEa
    public final C9ZU Byb() {
        C9SI c9si = this.A06;
        int i = (c9si.A09 / 2) - c9si.A03;
        float f = c9si.A04;
        return new C9ZU(3, i - (r1 / 2), 0.0f, f, f);
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A07;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A08;
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
            this.A06.A00 = false;
        }
    }

    @Override // X.BEc
    public final void ERe(int i) {
        int A08;
        C9SI c9si = this.A06;
        c9si.A0C.setColor(i);
        if (i == c9si.A07) {
            A08 = -1;
        } else {
            A08 = AbstractC13950nL.A08(i, 1.0f);
        }
        ((C6RB) c9si.A0F.getValue()).A0F(A08);
        ((C6RB) c9si.A0D.getValue()).A0F(A08);
        c9si.invalidateSelf();
    }

    @Override // X.BEc
    public final void Elg() {
        this.A06.A00 = true;
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        this.A02 = z;
        C6RL c6rl = this.A07;
        if (z2) {
            c6rl.A01();
        } else {
            c6rl.A00();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A06.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AbstractC167027dH.A0h(this.A06, i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC167027dH.A0d(colorFilter, this.A06);
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
        this.A06.draw(canvas);
        canvas.restore();
        this.A07.draw(canvas);
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
