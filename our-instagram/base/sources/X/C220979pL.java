package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.9pL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220979pL extends AbstractC130945vi implements C8P8, InterfaceC55932he, C5RR, InterfaceC133125ze {
    public boolean A00;
    public final int A01;
    public final GradientDrawable A02;
    public final C6RL A03;
    public final PromptStickerModel A04;
    public final C220909pE A05;
    public final long A06;
    public final Context A07;
    public final Resources A08;
    public final boolean A09;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.C8P8
    public final /* synthetic */ void EU6(float f) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A09) {
            canvas.save();
            float currentTimeMillis = (float) (System.currentTimeMillis() - this.A06);
            float f = 400.0f - 0.0f;
            float f2 = 1.0f - 0.0f;
            float f3 = 0.0f;
            if (f != 0.0f) {
                f3 = (currentTimeMillis - 0.0f) / f;
            }
            float f4 = (f3 * f2) + 0.0f;
            float A02 = AbstractC13600mm.A02(f4, 0.0f, 1.0f, 0.0f, 1.0f);
            canvas.translate(0.0f, AbstractC13600mm.A02(f4, 0.0f, 1.0f, 200.0f, 0.0f));
            canvas.scale(A02, A02, getBounds().exactCenterX(), getBounds().exactCenterY());
            int A022 = (int) AbstractC13600mm.A02(f4, 0.0f, 1.0f, 0.0f, 255.0f);
            C220909pE c220909pE = this.A05;
            c220909pE.setAlpha(A022);
            c220909pE.draw(canvas);
            canvas.restore();
            if (this.A00) {
                this.A02.draw(canvas);
            }
            if (f4 >= 1.0f) {
                this.A03.draw(canvas);
            } else {
                this.A02.setAlpha(A022);
            }
            invalidateSelf();
            return;
        }
        this.A05.draw(canvas);
        this.A03.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A05);
    }

    @Override // X.AbstractC130945vi
    public final String A09() {
        String A00 = this.A04.BlQ().A00();
        C14360o3.A07(A00);
        return A00;
    }

    @Override // X.C8P8
    public final Integer Aj1() {
        C220909pE c220909pE = this.A05;
        return Integer.valueOf(c220909pE.A04.A00 + (c220909pE.A02 * 2));
    }

    @Override // X.C8P8
    public final Integer AjE() {
        return Integer.valueOf(this.A05.A03);
    }

    @Override // X.C8P8
    public final PromptStickerModel BUK() {
        return this.A04;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A04;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A05.A09();
    }

    @Override // X.C8P8
    public final void Ekz() {
        PromptStickerModel promptStickerModel = this.A04;
        if (!promptStickerModel.A0L() && promptStickerModel.A03() != StoryPromptType.A09) {
            this.A03.A01();
            this.A00 = true;
        }
    }

    @Override // X.C8P8
    public final void FAk(Integer num) {
        this.A03.A00();
        AbstractC167027dH.A0g(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A05.A03;
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        if (i == 0) {
            this.A03.A00();
        }
    }

    public C220979pL(Context context, UserSession userSession, PromptStickerModel promptStickerModel, boolean z) {
        Typeface typeface;
        Object A0d;
        this.A07 = context;
        this.A04 = promptStickerModel;
        this.A09 = z;
        Resources resources = context.getResources();
        this.A08 = resources;
        this.A05 = new C220909pE(context, userSession, this.A04);
        C6RK c6rk = new C6RK(context, this, resources.getDimensionPixelSize(R.dimen.direct_multi_media_message_fixed_height));
        if (AbstractC14710oj.A08()) {
            typeface = AbstractC14710oj.A02(context);
        } else {
            typeface = null;
        }
        c6rk.A04 = typeface;
        c6rk.A01(2131965950);
        c6rk.A02(R.dimen.abc_text_size_menu_header_material);
        c6rk.A02 = AbstractC166997dE.A04(c6rk.A09, R.dimen.ai_agent_share_profile_sticker_padding);
        if (z) {
            A0d = Float.valueOf(400.0f);
        } else {
            A0d = AbstractC167007dF.A0d();
        }
        c6rk.A03 = AbstractC166987dD.A0N(A0d) + LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        c6rk.A05 = new C75C(this);
        this.A03 = c6rk.A00();
        this.A02 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{context.getColor(R.color.fds_transparent), AbstractC167007dF.A09(context, R.attr.igds_color_legibility_gradient)});
        this.A06 = System.currentTimeMillis();
        this.A01 = -this.A03.A05.A06;
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        C220909pE c220909pE = this.A05;
        c220909pE.setBounds(i, i2, i3, i4);
        this.A02.setBounds(0, c220909pE.getBounds().top - 32, AbstractC188878Yd.A01(this.A07), AbstractC166987dD.A0D(c220909pE) + this.A03.A05.A06);
    }
}
