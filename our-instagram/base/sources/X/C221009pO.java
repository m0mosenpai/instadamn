package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.9pO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221009pO extends AbstractC130945vi implements C8P8, C5RR, InterfaceC133125ze {
    public boolean A00;
    public C180537zh A01;
    public C180547zi A02;
    public final int A03;
    public final int A04;
    public final C6RL A05;
    public final PromptStickerModel A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Context A0E;
    public final C216139hW A0F;
    public final AbstractC216079hQ A0G;
    public final C6RB A0H;
    public final C124385ju A0I;
    public final Integer A0J;
    public final String A0K;
    public final boolean A0L;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0132, code lost:
    
        if (r22.A06.A00.B48().size() > 1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C221009pO(final android.content.Context r23, com.instagram.common.session.UserSession r24, com.instagram.reels.prompt.model.PromptStickerModel r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221009pO.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.String):void");
    }

    @Override // X.C8P8
    public final void FAk(Integer num) {
        int i = 0;
        C14360o3.A0B(num, 0);
        boolean z = false;
        boolean A1X = AbstractC167007dF.A1X(num, C05F.A01);
        this.A05.A00();
        PromptStickerModel promptStickerModel = this.A06;
        PromptStickerModel A04 = promptStickerModel.A04();
        C69669VtA AKZ = A04.A00.AKZ();
        AKZ.A00 = 0;
        A04.A00 = AKZ.A00();
        A04.A0C(AbstractC001800i.A0d(promptStickerModel.A00.B48(), 1));
        Context context = this.A0E;
        String str = this.A0K;
        if (!A1X) {
            A04 = promptStickerModel;
        }
        Integer num2 = this.A0J;
        int i2 = this.A07;
        C180547zi c180547zi = new C180547zi(context, A04, num2, str, i2, i, 224);
        c180547zi.setCallback(this);
        this.A02 = c180547zi;
        C180537zh c180537zh = new C180537zh(context, i2, R.dimen.account_discovery_bottom_gap, !A1X, false, true);
        c180537zh.setCallback(this);
        this.A01 = c180537zh;
        if (promptStickerModel.A00.Bio() == StoryPromptType.A06 && A1X) {
            z = true;
        }
        this.A00 = z;
        AbstractC167027dH.A0g(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A0H.draw(canvas);
        if (!this.A0L) {
            this.A02.draw(canvas);
        }
        if (!this.A00 && this.A06.A01 == 0) {
            this.A0I.draw(canvas);
            this.A0F.draw(canvas);
            this.A05.draw(canvas);
        }
        AbstractC216079hQ abstractC216079hQ = this.A0G;
        if (abstractC216079hQ != null) {
            abstractC216079hQ.draw(canvas);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        Drawable[] drawableArr = {this.A01, this.A0H, this.A02, this.A0I, this.A0F, this.A0G};
        C14360o3.A0B(drawableArr, 0);
        return AbstractC009903n.A0I(drawableArr);
    }

    @Override // X.AbstractC130945vi
    public final Integer A08() {
        return C05F.A0u;
    }

    @Override // X.C8P8
    public final Integer Aj1() {
        return Integer.valueOf(this.A0F.getIntrinsicHeight() + this.A0C + this.A0D);
    }

    @Override // X.C8P8
    public final /* synthetic */ Integer AjE() {
        return null;
    }

    @Override // X.C8P8
    public final PromptStickerModel BUK() {
        return this.A06;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A06;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        if (this.A06.A0H()) {
            return "clips_prompt_sticker_bundle_id";
        }
        return "prompt_sticker_bundle_id";
    }

    @Override // X.C8P8
    public final void EU6(float f) {
        this.A02.A09(f);
    }

    @Override // X.C8P8
    public final /* synthetic */ void Ekz() {
        this.A05.A01();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        int i2 = this.A0H.A06;
        if (this.A0L) {
            i = 0;
        } else {
            i = this.A02.A01 + this.A0A;
        }
        return AbstractC166987dD.A0F(this.A0F, AbstractC166987dD.A0F(this.A0I, i2 + i)) + this.A09 + this.A0B + this.A0C + this.A0D + this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04;
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        this.A0H.setAlpha(i);
        this.A02.setAlpha(i);
        this.A0I.setAlpha(i);
        this.A0F.setAlpha(i);
        AbstractC216079hQ abstractC216079hQ = this.A0G;
        if (abstractC216079hQ != null) {
            abstractC216079hQ.setAlpha(i);
        }
        if (i == 0) {
            this.A05.A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setBounds(int r13, int r14, int r15, int r16) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221009pO.setBounds(int, int, int, int):void");
    }
}
