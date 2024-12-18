package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* renamed from: X.9Sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC210529Sr extends Drawable implements BEc, C5RQ, InterfaceC133125ze {
    public int A00;
    public MusicOverlayStickerModel A01;
    public String A02;
    public boolean A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final Paint A07;
    public final C70993Wm9 A08;
    public final EnumC138556Pl A09;
    public final C6RL A0A;
    public final int A0B;

    public AbstractC210529Sr(Context context, MusicOverlayStickerModel musicOverlayStickerModel, C70993Wm9 c70993Wm9, EnumC138556Pl enumC138556Pl, float f) {
        this.A08 = c70993Wm9;
        this.A01 = musicOverlayStickerModel;
        this.A0B = c70993Wm9.Bzm(c70993Wm9.Bd3() - 1);
        this.A06 = (int) (AbstractC13880nE.A0A(context) * f);
        this.A09 = enumC138556Pl;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A07 = A0S;
        this.A05 = AbstractC13880nE.A00(context, 5.0f);
        this.A04 = AbstractC13880nE.A00(context, 10.0f);
        AbstractC166987dD.A1N(context, A0S, R.color.cds_white_a20);
        this.A0A = AbstractC1572274c.A00(context, this);
    }

    public abstract void A01(Canvas canvas, int i);

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
    public void DUc(MusicOverlayStickerModel musicOverlayStickerModel) {
        C14360o3.A0B(musicOverlayStickerModel, 0);
        this.A01 = musicOverlayStickerModel;
    }

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // X.BEc
    public final /* synthetic */ void Elg() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        double d;
        int i;
        C14360o3.A0B(canvas, 0);
        if (this.A03) {
            RectF A0H = AbstractC167007dF.A0H(this);
            AbstractC167027dH.A0e(A0H, A0H.left, this.A05);
            float f = this.A04;
            canvas.drawRoundRect(A0H, f, f, this.A07);
        }
        List list = this.A01.A0o;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            AudioFilterType audioFilterType = ((AudioFilterInfo) list.get(0)).A00;
            C14360o3.A0B(audioFilterType, 0);
            for (EnumC185288Jt enumC185288Jt : EnumC185288Jt.values()) {
                if (enumC185288Jt.A04 == audioFilterType) {
                    d = enumC185288Jt.A01;
                    break;
                }
            }
        }
        d = 1.0d;
        int i3 = this.A00;
        MusicOverlayStickerModel musicOverlayStickerModel = this.A01;
        Integer num = musicOverlayStickerModel.A0K;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = musicOverlayStickerModel.A0O;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        double d2 = i;
        A01(canvas, AbstractC13600mm.A03((int) ((i3 * d) + d2), i, Math.min((int) (d2 + (i2 * d)), this.A0B)));
        this.A0A.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public abstract int getIntrinsicHeight();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.BEc
    public final MusicOverlayStickerModel BVf() {
        return this.A01;
    }

    @Override // X.BEc
    public final EnumC138556Pl BVp() {
        return this.A09;
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A0A;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        this.A00 = i;
        invalidateSelf();
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        this.A03 = z;
        C6RL c6rl = this.A0A;
        if (z2) {
            c6rl.A01();
        } else {
            c6rl.A00();
        }
        invalidateSelf();
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return AbstractC167017dG.A0K(this.A01.A0O);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06;
    }
}
