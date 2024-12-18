package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.9mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219429mq extends AbstractC202648xi implements C5RQ {
    public float A00;
    public int A01;
    public C210419Sg A02;
    public User A03;
    public boolean A04;
    public C6RB A05;
    public final float A06;
    public final Context A07;
    public final UserSession A08;
    public final C83o A09;
    public final String A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final Drawable A0G;
    public final GradientDrawable A0H;
    public final GradientDrawable A0I;
    public final C38321qM A0J;
    public final C6RB A0K;

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private final float A00() {
        if (this.A04) {
            return this.A09.A00;
        }
        return this.A0E;
    }

    private final void A01() {
        int i;
        float f = this.A06;
        float A00 = A00();
        int i2 = (int) (f * A00);
        int i3 = (int) (this.A0B * A00);
        C6RB c6rb = this.A0K;
        float f2 = this.A0C;
        c6rb.A0A(f2);
        int i4 = (int) (i2 - (2.0f * this.A0F));
        C210419Sg c210419Sg = this.A02;
        if (c210419Sg != null) {
            i = c210419Sg.getIntrinsicWidth();
        } else {
            i = 0;
        }
        c6rb.A0E(i4 - i);
        this.A05.A0A(f2);
        this.A0I.setBounds(0, 0, i2, (int) (i3 * 0.25f));
    }

    private final void A02() {
        int i;
        float f = this.A06;
        float A00 = A00();
        int i2 = (int) (f * A00);
        int i3 = (int) (this.A0B * A00);
        C6RB c6rb = this.A0K;
        float f2 = this.A0D;
        c6rb.A0A(f2);
        int i4 = (int) (i2 - (2.0f * this.A0F));
        C210419Sg c210419Sg = this.A02;
        if (c210419Sg != null) {
            i = c210419Sg.getIntrinsicWidth();
        } else {
            i = 0;
        }
        c6rb.A0E(i4 - i);
        this.A05.A0A(f2);
        this.A0I.setBounds(0, 0, i2, (int) (i3 * 0.25f));
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A09;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        String str;
        boolean A1Z = AbstractC166997dE.A1Z(this.A09.A07.A02(), true);
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (A1Z) {
            str = "story-reels-metadata-sticker-fullscreen-";
        } else {
            str = "story-reels-metadata-sticker-";
        }
        A1C.append(str);
        return AbstractC166997dE.A0x(this.A0A, A1C);
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        int i = this.A09.A06;
        int i2 = 15000;
        if (i > 15000) {
            i2 = C1LE.A00(this.A08);
        }
        return Math.min(i, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return C1H4.A01(this.A0B);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return C1H4.A01(this.A06);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0K.setAlpha(i);
        C210419Sg c210419Sg = this.A02;
        if (c210419Sg != null) {
            c210419Sg.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0K.setColorFilter(colorFilter);
        C210419Sg c210419Sg = this.A02;
        if (c210419Sg != null) {
            c210419Sg.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f0, code lost:
    
        if (r1 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C219429mq(android.content.Context r15, com.instagram.common.session.UserSession r16, X.C83o r17) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219429mq.<init>(android.content.Context, com.instagram.common.session.UserSession, X.83o):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        boolean booleanValue;
        Rect A0Q = AbstractC167017dG.A0Q(this, canvas);
        int save = canvas.save();
        Boolean bool = (Boolean) this.A09.A07.A02();
        if (bool != null && (this.A04 != (booleanValue = bool.booleanValue()) || this.A00 != A00())) {
            this.A04 = booleanValue;
            this.A00 = A00();
            if (booleanValue) {
                A02();
            } else {
                A01();
            }
        }
        float A00 = 1.0f / A00();
        AbstractC167007dF.A0s(canvas, A0Q);
        canvas.scale(A00, A00);
        float f2 = this.A0B;
        float A002 = A00();
        float f3 = f2 * A002;
        float f4 = this.A06 * A002;
        canvas.save();
        this.A0I.draw(canvas);
        if (!this.A04) {
            this.A0H.draw(canvas);
        }
        canvas.restore();
        if (!this.A04) {
            canvas.save();
            float f5 = this.A0F;
            canvas.translate(f5, f5);
            this.A0G.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        String A02 = C23831Eq.A02(r1.A06 - this.A01);
        C6RB c6rb = this.A05;
        c6rb.A0M(A02);
        float f6 = this.A0F;
        canvas.translate((f4 - c6rb.A0A) - f6, f6);
        boolean z = this.A04;
        int i = this.A01;
        int i2 = 255;
        if (z && i >= 3000) {
            i2 = i < 3500 ? (255 * (3500 - i)) / 500 : 0;
        }
        c6rb.setAlpha(i2);
        AbstractC167007dF.A0t(canvas, c6rb);
        if (this.A04) {
            f = f6;
        } else {
            f = (f3 - this.A0K.A06) - f6;
        }
        canvas.translate(f6, f);
        this.A0K.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(save);
        C210419Sg c210419Sg = this.A02;
        if (c210419Sg != null) {
            c210419Sg.A00(canvas, A0Q.left + f6 + r6.A0A, A0Q.top + f, 1.0f);
        }
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        this.A01 = i;
    }
}
