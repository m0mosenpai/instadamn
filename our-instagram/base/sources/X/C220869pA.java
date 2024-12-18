package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.smb.model.ProfileStickerModel;
import java.util.List;

/* renamed from: X.9pA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220869pA extends AbstractC130945vi implements InterfaceC133125ze {
    public static final double A0d = (1.0d + Math.sqrt(5.0d)) / 2.0d;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public final ProfileStickerModel A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final Context A0Q;
    public final Resources A0R;
    public final UserSession A0T;
    public final C89533yt A0U;
    public final C6RB A0V;
    public final C6RB A0W;
    public final C6RB A0X;
    public final C6RB A0Y;
    public final C6RB A0Z;
    public final C124385ju A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final RectF A0S = AbstractC166987dD.A0X();
    public final RectF A06 = AbstractC166987dD.A0X();
    public List A05 = C16930sl.A00;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r2 == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r2 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C220869pA(android.content.Context r18, com.instagram.common.session.UserSession r19, com.instagram.reels.smb.model.ProfileStickerModel r20) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220869pA.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.reels.smb.model.ProfileStickerModel):void");
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "share_profile_sticker_id";
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(-1);
        A0R.setShadowLayer(this.A0A, 0.0f, 0.0f, AbstractC167007dF.A09(this.A0Q, R.attr.igds_color_shadow_on_media));
        Paint A0R2 = AbstractC166987dD.A0R();
        A0R2.setColor(-1);
        RectF rectF = this.A0S;
        float f = this.A08;
        canvas.drawRoundRect(rectF, f, f, A0R);
        this.A0U.draw(canvas);
        if (this.A0b) {
            RectF rectF2 = this.A06;
            float height = rectF2.height() / 2.0f;
            for (A77 a77 : this.A05) {
                PointF pointF = a77.A01;
                canvas.drawCircle(pointF.x, pointF.y, a77.A00, A0R);
            }
            canvas.drawRoundRect(rectF2, height, height, A0R);
            for (A77 a772 : this.A05) {
                PointF pointF2 = a772.A01;
                canvas.drawCircle(pointF2.x, pointF2.y, a772.A00, A0R2);
            }
            this.A0Y.draw(canvas);
        }
        this.A0X.draw(canvas);
        this.A0V.draw(canvas);
        this.A0Z.draw(canvas);
        this.A0a.draw(canvas);
        this.A0W.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return C16930sl.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        int i2 = this.A0L;
        int i3 = i2 + this.A0J + this.A0K + this.A0I + this.A0X.A06 + this.A0V.A06;
        if (this.A0c) {
            i = this.A0Z.A06 + this.A0O;
        } else {
            i = 0;
        }
        return AbstractC166987dD.A0F(this.A0a, i3 + i + this.A0N) + this.A0D + this.A0W.A06 + i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.A0B;
        int[] iArr = {this.A0H, this.A0P, this.A0C, this.A0F};
        int i2 = 0;
        do {
            i = Math.max(i, iArr[i2]);
            i2++;
        } while (i2 < 4);
        return i + (this.A0L * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        this.A0S.set(i, i2, i3, i4);
        int i5 = this.A0J + i2 + this.A0L;
        C89533yt c89533yt = this.A0U;
        int i6 = (int) f;
        int i7 = this.A0K;
        int i8 = i7 / 2;
        c89533yt.setBounds(i6 - i8, i5, i8 + i6, i2 + i7);
        C6RB c6rb = this.A0Y;
        int i9 = c6rb.A0A / 2;
        c6rb.setBounds(i6 - i9, i5, i9 + i6, c6rb.A06 + i5);
        RectF rectF = new RectF(AbstractC166987dD.A0W(c6rb));
        RectF rectF2 = this.A06;
        float f2 = rectF.left;
        float f3 = this.A0M;
        rectF2.set(f2 - f3, rectF.top - f3, rectF.right + f3, rectF.bottom + f3);
        float height = rectF2.height() / 4.0f;
        PointF pointF = new PointF(rectF2.left + (rectF2.width() * 0.4f), rectF2.bottom);
        float f4 = (2.0f * height) / 5.0f;
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(height, height + f4);
        this.A05 = AbstractC16960so.A1Q(new A77(pointF, height), new A77(pointF2, f4));
        int i10 = this.A0H / 2;
        int i11 = i5 + i7 + this.A0I;
        C6RB c6rb2 = this.A0X;
        int i12 = c6rb2.A06 + i11 + this.A0G;
        c6rb2.setBounds(i6 - i10, i11, i10 + i6, i12);
        int i13 = this.A0B / 2;
        C6RB c6rb3 = this.A0V;
        int i14 = c6rb3.A06 + i12 + this.A0N;
        c6rb3.setBounds(i6 - i13, i12, i13 + i6, i14);
        int min = Math.min(this.A0P, this.A0E) / 2;
        C6RB c6rb4 = this.A0Z;
        int i15 = c6rb4.A06 + i14 + this.A0O;
        c6rb4.setBounds(i6 - min, i14, min + i6, i15);
        if (this.A0c) {
            i14 = i15;
        }
        int i16 = i3 - i;
        C124385ju c124385ju = this.A0a;
        c124385ju.setBounds(i, i14, i16 + i, ((int) this.A09) + i14);
        int i17 = this.A0C / 2;
        int A0D = AbstractC166987dD.A0D(c124385ju) + this.A0D;
        C6RB c6rb5 = this.A0W;
        c6rb5.setBounds(i6 - i17, A0D, i6 + i17, c6rb5.A06 + A0D);
        float f5 = i16;
        this.A01 = f / f5;
        float f6 = i4 - i3;
        this.A02 = A03 / f6;
        float f7 = (r1 - A0D) / f6;
        this.A00 = f7;
        this.A04 = (r5 - r4) / f5;
        this.A03 = f7;
    }
}
