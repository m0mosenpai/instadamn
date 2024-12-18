package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.8P7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8P7 extends AbstractC130945vi implements C8P8, C5RR {
    public int A00;
    public C180537zh A01;
    public C180547zi A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final Resources A09;
    public final C6RL A0A;
    public final PromptStickerModel A0B;
    public final C180567zk A0C;
    public final Integer A0D;
    public final String A0E;
    public final InterfaceC09390do A0F;
    public final boolean A0G;

    @Override // X.C8P8
    public final void FAk(Integer num) {
        int i;
        int i2;
        C14360o3.A0B(num, 0);
        boolean z = false;
        if (num == C05F.A01) {
            z = true;
        }
        this.A0A.A00();
        PromptStickerModel promptStickerModel = this.A0B;
        PromptStickerModel A04 = promptStickerModel.A04();
        A04.A0C(AbstractC001800i.A0d(promptStickerModel.A00.B48(), 1));
        Context context = this.A08;
        String str = this.A0E;
        if (!z) {
            A04 = promptStickerModel;
        }
        Integer num2 = this.A0D;
        int i3 = this.A04;
        if (z) {
            i = 1;
        } else {
            i = 3;
            if (promptStickerModel.A0M()) {
                i = 2;
            }
        }
        C180547zi c180547zi = new C180547zi(context, A04, num2, str, i3, i, 192);
        c180547zi.setCallback(this);
        this.A02 = c180547zi;
        C180537zh c180537zh = new C180537zh(context, i3, R.dimen.account_discovery_bottom_gap, !z, promptStickerModel.A0M(), true);
        c180537zh.setCallback(this);
        this.A01 = c180537zh;
        if (z) {
            int A08 = (this.A06 - this.A02.A08()) - this.A0C.A01;
            int i4 = 3;
            if (promptStickerModel.A0M()) {
                i4 = 4;
            }
            i2 = A08 / i4;
        } else {
            i2 = this.A05;
        }
        this.A00 = i2;
        setBounds(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        int i;
        Drawable drawable;
        C14360o3.A0B(canvas, 0);
        if (!this.A03) {
            this.A01.draw(canvas);
            this.A02.draw(canvas);
            if (this.A0B.A0M()) {
                if (this.A0G) {
                    drawable = this.A0C;
                    f = drawable.getBounds().right;
                    i = this.A02.getBounds().left;
                } else {
                    f = this.A02.getBounds().right;
                    i = this.A0C.getBounds().left;
                    drawable = this.A02;
                }
                float f2 = f + ((i - drawable.getBounds().right) / 2.0f);
                canvas.drawLine(f2, this.A01.getBounds().top, f2, this.A01.getBounds().bottom, (Paint) this.A0F.getValue());
            }
            this.A0C.draw(canvas);
            this.A0A.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (r20.A0B.A0M() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C8P7(android.content.Context r21, com.instagram.common.session.UserSession r22, com.instagram.reels.prompt.model.PromptStickerModel r23, java.lang.String r24, int r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8P7.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.String, int, boolean, boolean):void");
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A01, this.A02, this.A0C);
    }

    @Override // X.AbstractC130945vi
    public final String A09() {
        String A00 = this.A0B.BlQ().A00();
        C14360o3.A07(A00);
        return A00;
    }

    @Override // X.C8P8
    public final /* synthetic */ Integer Aj1() {
        return null;
    }

    @Override // X.C8P8
    public final Integer AjE() {
        int i = this.A0C.A01;
        int i2 = this.A00;
        int i3 = 1;
        if (this.A0B.A0M()) {
            i3 = 2;
        }
        return Integer.valueOf(i + (i2 * i3));
    }

    @Override // X.C8P8
    public final PromptStickerModel BUK() {
        return this.A0B;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0B;
    }

    @Override // X.C8P8
    public final void EU6(float f) {
        this.A02.A09(f);
    }

    @Override // X.C8P8
    public final /* synthetic */ void Ekz() {
        this.A0A.A01();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02.A01 + this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06;
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        this.A0C.setAlpha(i);
        this.A02.setAlpha(i);
        if (this.A0B.A0M()) {
            ((Paint) this.A0F.getValue()).setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float intrinsicWidth;
        float f3;
        float f4;
        super.setBounds(i, i2, i3, i4);
        float f5 = (i + i3) / 2.0f;
        float f6 = (i2 + i4) / 2.0f;
        float f7 = this.A06 / 2.0f;
        float f8 = f5 - f7;
        float f9 = f5 + f7;
        float intrinsicHeight = getIntrinsicHeight() / 2.0f;
        float f10 = f6 - intrinsicHeight;
        float f11 = intrinsicHeight + f6;
        this.A01.setBounds(C1H4.A01(f8), C1H4.A01(f10), C1H4.A01(f9), C1H4.A01(f11));
        boolean z = this.A0G;
        if (z) {
            f = this.A00;
            f2 = (f9 - this.A02.getIntrinsicWidth()) - f;
        } else {
            f = this.A00;
            f2 = f + f8;
        }
        int A01 = C1H4.A01(f2);
        if (z) {
            intrinsicWidth = f9 - f;
        } else {
            f = this.A00;
            intrinsicWidth = this.A02.getIntrinsicWidth() + f8 + f;
        }
        int A012 = C1H4.A01(intrinsicWidth);
        if (z) {
            f3 = f + f8;
        } else {
            f3 = (f9 - this.A0C.A01) - f;
        }
        int A013 = C1H4.A01(f3);
        if (z) {
            f4 = f8 + this.A0C.A01 + f;
        } else {
            f4 = f9 - f;
        }
        int A014 = C1H4.A01(f4);
        this.A02.setBounds(A01, C1H4.A01(f10), A012, (int) f11);
        C180567zk c180567zk = this.A0C;
        float intrinsicHeight2 = c180567zk.getIntrinsicHeight() / 2;
        c180567zk.setBounds(A013, C1H4.A01(f6 - intrinsicHeight2), A014, C1H4.A01(f6 + intrinsicHeight2));
    }
}
