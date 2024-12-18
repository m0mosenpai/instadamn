package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.R;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9p8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220849p8 extends AbstractC130945vi implements InterfaceC25178BCb, InterfaceC133125ze {
    public static final double A0Y = (1.0d + Math.sqrt(5.0d)) / 2.0d;
    public boolean A00;
    public final ProfileStickerModel A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
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
    public final Context A0N;
    public final Resources A0O;
    public final RectF A0P = AbstractC166987dD.A0X();
    public final AbstractC12990ll A0Q;
    public final C89533yt A0R;
    public final C6RB A0S;
    public final C6RB A0T;
    public final C6RB A0U;
    public final C6RB A0V;
    public final C124385ju A0W;
    public final C9Rz[] A0X;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        if (r1 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C220849p8(android.content.Context r26, X.AbstractC12990ll r27, com.instagram.reels.smb.model.ProfileStickerModel r28) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220849p8.<init>(android.content.Context, X.0ll, com.instagram.reels.smb.model.ProfileStickerModel):void");
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
        A0R.setShadowLayer(this.A04, 0.0f, 0.0f, AbstractC167007dF.A09(this.A0N, R.attr.igds_color_shadow_on_media));
        RectF rectF = this.A0P;
        float f = this.A02;
        canvas.drawRoundRect(rectF, f, f, A0R);
        this.A0R.draw(canvas);
        this.A0T.draw(canvas);
        this.A0U.draw(canvas);
        this.A0S.draw(canvas);
        if (this.A00) {
            this.A0W.draw(canvas);
        } else {
            canvas.save();
            for (C9Rz c9Rz : this.A0X) {
                c9Rz.draw(canvas);
                canvas.translate(this.A0C + this.A0B, 0.0f);
            }
            canvas.restore();
        }
        this.A0V.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC25178BCb
    public final /* synthetic */ int BSK() {
        return 1;
    }

    @Override // X.InterfaceC25178BCb
    public final List BSS() {
        List A1J = AbstractC166987dD.A1J(this.A01.A03);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A1J) {
            if (obj != null) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.A00) {
            return this.A07;
        }
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.A00) {
            return this.A08;
        }
        return this.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        String A0N;
        super.setBounds(i, i2, i3, i4);
        float A02 = AbstractC166987dD.A02(i + i3);
        int i5 = this.A0G;
        int i6 = i5 + i2;
        this.A0P.set(i, i6, i3, i4);
        C89533yt c89533yt = this.A0R;
        int i7 = (int) A02;
        int i8 = this.A0H;
        int i9 = i8 / 2;
        c89533yt.setBounds(i7 - i9, i2, i9 + i7, i8 + i2);
        int i10 = this.A0E / 2;
        int i11 = i6 + i5 + this.A0F;
        C6RB c6rb = this.A0T;
        int i12 = c6rb.A06 + i11;
        c6rb.setBounds(i7 - i10, i11, i10 + i7, i12);
        int i13 = this.A0K / 2;
        C6RB c6rb2 = this.A0U;
        int i14 = c6rb2.A06 + i12 + this.A0J;
        c6rb2.setBounds(i7 - i13, i12, i13 + i7, i14);
        int min = Math.min(this.A06, this.A0D) / 2;
        C6RB c6rb3 = this.A0S;
        int i15 = c6rb3.A06 + i14 + this.A05;
        c6rb3.setBounds(i7 - min, i14, min + i7, i15);
        User user = this.A01.A03;
        if (user != null && (A0N = user.A0N()) != null && A0N.length() > 0) {
            i14 = i15;
        }
        if (this.A00) {
            this.A0W.setBounds(i, i14, i3, ((int) this.A03) + i14);
        } else {
            int i16 = this.A0C;
            int i17 = i + i16;
            int i18 = i16 + i14;
            for (C9Rz c9Rz : this.A0X) {
                c9Rz.setBounds(i, i14, i17, i18);
            }
        }
        int i19 = this.A0L / 2;
        int i20 = i7 - i19;
        if (!this.A00) {
            i14 += this.A0C;
        }
        int i21 = i14 + this.A0M;
        int i22 = i7 + i19;
        C6RB c6rb4 = this.A0V;
        c6rb4.setBounds(i20, i21, i22, c6rb4.A06 + i21);
    }
}
