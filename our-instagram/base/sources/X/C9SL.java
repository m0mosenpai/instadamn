package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;

/* renamed from: X.9SL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SL extends Drawable implements Drawable.Callback, InterfaceC202998yH {
    public ReelsVisualRepliesModel A01;
    public C89533yt A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Context A0B;
    public final GradientDrawable A0C;
    public final UserSession A0D;
    public final AbstractC223739uI A0E;
    public final EnumC209229Ne A0F;
    public final C6RB A0G;
    public final C6RB A0H;
    public final boolean A0I;
    public int A02 = -1;
    public int A00 = 255;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String str;
        C14360o3.A0B(canvas, 0);
        C14360o3.A07(getBounds());
        int i = this.A02;
        if (i == -1 || i != this.A00) {
            C6RB c6rb = this.A0G;
            MediaVCRTappableData mediaVCRTappableData = this.A01.A00;
            if (mediaVCRTappableData != null) {
                str = mediaVCRTappableData.A05;
            } else {
                str = null;
            }
            c6rb.A0L(A00(this.A0B, this.A0D, this.A0F, str));
            this.A02 = this.A00;
        }
        this.A0C.draw(canvas);
        C89533yt c89533yt = this.A03;
        if (c89533yt != null) {
            c89533yt.draw(canvas);
        }
        this.A0H.draw(canvas);
        this.A0G.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (r14 != 9) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0120, code lost:
    
        if (r1 != 9) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9SL(android.content.Context r26, com.instagram.common.session.UserSession r27, com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r28, X.AbstractC223739uI r29) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9SL.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel, X.9uI):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 != 9) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.text.SpannableStringBuilder A00(android.content.Context r5, com.instagram.common.session.UserSession r6, X.EnumC209229Ne r7, java.lang.String r8) {
        /*
            r4 = this;
            if (r8 != 0) goto L4
            java.lang.String r8 = ""
        L4:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r8)
            if (r7 == 0) goto L16
            int r1 = r7.ordinal()
            r0 = 9
            r2 = 2130970251(0x7f04068b, float:1.7549207E38)
            if (r1 == r0) goto L19
        L16:
            r2 = 2130970282(0x7f0406aa, float:1.754927E38)
        L19:
            int r1 = X.AbstractC167007dF.A09(r5, r2)
            int r0 = r4.A00
            android.text.SpannableStringBuilder r0 = X.AbstractC167027dH.A0A(r3, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9SL.A00(android.content.Context, com.instagram.common.session.UserSession, X.9Ne, java.lang.String):android.text.SpannableStringBuilder");
    }

    @Override // X.InterfaceC202998yH
    public final void DtF(int i, int i2) {
        ReelsVisualRepliesModel reelsVisualRepliesModel = this.A01;
        reelsVisualRepliesModel.A02(Float.valueOf(i));
        reelsVisualRepliesModel.A01(Float.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A0C.setAlpha(i);
            this.A0G.setAlpha(i);
            this.A0H.setAlpha(i);
            C89533yt c89533yt = this.A03;
            if (c89533yt != null) {
                c89533yt.setAlpha(i);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        int i9 = this.A09;
        float f2 = i9 / 2.0f;
        float f3 = f - f2;
        float f4 = this.A05 / 2.0f;
        float f5 = A03 - f4;
        float f6 = f + f2;
        float f7 = A03 + f4;
        boolean z = this.A0I;
        if (z) {
            i5 = this.A06;
            i6 = (((int) f6) - i5) - this.A04;
        } else {
            i5 = this.A06;
            i6 = ((int) f3) + i5;
        }
        int i10 = (int) f5;
        int i11 = i10 + this.A08;
        int i12 = this.A04;
        int i13 = i6 + i12;
        int i14 = i11 + i12;
        int i15 = (int) f3;
        if (z) {
            i7 = i5;
        } else {
            i15 = i15 + i5 + i12;
            i7 = this.A07;
        }
        int i16 = i15 + i7;
        C6RB c6rb = this.A0H;
        int i17 = c6rb.A0A;
        int i18 = i17 + i16;
        int i19 = c6rb.A06 + i11;
        if (z) {
            i8 = ((((i9 - (i5 * 2)) - i12) - this.A07) - i17) + i16;
        } else {
            i8 = i16;
        }
        int i20 = this.A0A + i19;
        C6RB c6rb2 = this.A0G;
        int i21 = c6rb2.A0A + i8;
        int i22 = c6rb2.A06 + i20;
        this.A0C.setBounds(i15, i10, (int) f6, (int) f7);
        c6rb2.setBounds(i8, i20, i21, i22);
        c6rb.setBounds(i16, i11, i18, i19);
        C89533yt c89533yt = this.A03;
        if (c89533yt != null) {
            c89533yt.setBounds(i6, i11, i13, i14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC167027dH.A0d(colorFilter, this.A0G);
        AbstractC167027dH.A0d(colorFilter, this.A0H);
        AbstractC167017dG.A13(colorFilter, this.A03);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
