package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.R;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9p7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220839p7 extends AbstractC130945vi implements InterfaceC25178BCb, InterfaceC133125ze {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final C6RL A0B;
    public final ProfileStickerModel A0C;
    public final boolean A0D;
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
    public final Context A0O;
    public final RectF A0P;
    public final Drawable A0Q;
    public final C6RB A0R;
    public final C9Rz[] A0S;

    public C220839p7(Context context, ProfileStickerModel profileStickerModel) {
        int dimensionPixelSize;
        int A06;
        int i;
        Bitmap bitmap;
        C14360o3.A0B(context, 1);
        this.A0O = context;
        Resources resources = context.getResources();
        this.A0S = new C9Rz[3];
        this.A0C = profileStickerModel;
        C38687GzS[] c38687GzSArr = profileStickerModel.A00;
        boolean z = (c38687GzSArr == null || c38687GzSArr.length < 3 || c38687GzSArr[0] == null || c38687GzSArr[1] == null || c38687GzSArr[2] == null) ? false : true;
        this.A0D = z;
        this.A04 = !z;
        Integer num = profileStickerModel.A05;
        Drawable A00 = AEP.A00(context, num);
        this.A0Q = A00;
        int i2 = 0;
        if (A00 == null) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.caption_overlay_offset_with_social_bubble);
        }
        this.A0F = dimensionPixelSize;
        if (A00 == null) {
            A06 = 0;
        } else {
            A06 = (int) ((dimensionPixelSize / AbstractC166987dD.A06(A00)) * A00.getIntrinsicWidth());
        }
        this.A0H = A06;
        if (A00 == null) {
            i = 0;
        } else {
            i = (dimensionPixelSize * 7) / 10;
        }
        this.A0G = i;
        this.A0P = AbstractC166987dD.A0X();
        this.A0E = AbstractC166997dE.A01(context);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.quiz_sticker_corner_radius);
        this.A09 = dimensionPixelSize2;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.share_professional_profile_background_corner_radius_without_images);
        this.A0A = dimensionPixelSize3;
        this.A01 = this.A04 ? dimensionPixelSize3 : dimensionPixelSize2;
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.bio_product_sticker_width);
        this.A0J = dimensionPixelSize4;
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        this.A0K = dimensionPixelSize5;
        int A0D = AbstractC166997dE.A0D(resources);
        this.A0I = A0D;
        int i3 = dimensionPixelSize5 * 2;
        int i4 = i3 + (dimensionPixelSize4 * 3) + (A0D * 2);
        this.A07 = i4;
        int A0E = AbstractC166997dE.A0E(resources);
        this.A0L = A0E;
        C6RB A0z = AbstractC166987dD.A0z(context, i4 - i3);
        this.A0R = A0z;
        AMr.A06(context, A0z, A0E, 0.0f);
        User user = profileStickerModel.A03;
        if (user != null) {
            String A0D2 = AnonymousClass001.A0D(AbstractC166997dE.A10(C1Q2.A02(), user.getUsername()), '@');
            C14360o3.A0B(A0D2, 2);
            C14360o3.A0B(num, 3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0D2);
            spannableStringBuilder.setSpan(new C9T8(spannableStringBuilder, null, AEP.A01(context, num)), 0, spannableStringBuilder.length(), 33);
            A0z.A0L(spannableStringBuilder);
            A00(this);
            this.A03 = this.A04 ? this.A00 : i4;
            int dimensionPixelSize6 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
            this.A0M = dimensionPixelSize6;
            int A08 = AbstractC166997dE.A08(resources);
            this.A0N = A08;
            int i5 = i + (A08 * 2) + A0z.A06 + dimensionPixelSize6;
            this.A08 = i5;
            int i6 = dimensionPixelSize4 + i5 + dimensionPixelSize5;
            this.A06 = i6;
            this.A02 = this.A04 ? i5 : i6;
            C6RK c6rk = new C6RK(context, this, -1);
            c6rk.A01(2131973701);
            Integer num2 = C05F.A00;
            C14360o3.A0B(num2, 0);
            c6rk.A06 = num2;
            this.A0B = c6rk.A00();
            if (z) {
                int dimensionPixelSize7 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
                C38687GzS[] c38687GzSArr2 = profileStickerModel.A00;
                if (c38687GzSArr2 != null) {
                    int length = c38687GzSArr2.length;
                    int i7 = 0;
                    while (i2 < length) {
                        C38687GzS c38687GzS = c38687GzSArr2[i2];
                        int i8 = i7 + 1;
                        if (c38687GzS != null && (bitmap = (Bitmap) c38687GzS.A00) != null) {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            int i9 = this.A0J;
                            boolean z2 = C1NC.A02;
                            Matrix A0Q = AbstractC166987dD.A0Q();
                            C1NC.A0J(A0Q, width, height, i9, i9, 0, false);
                            this.A0S[i7] = new C9Rz(bitmap, A0Q, dimensionPixelSize7, 15);
                        }
                        i2++;
                        i7 = i8;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(this.A0E);
        RectF rectF = this.A0P;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, A0R);
        this.A0R.draw(canvas);
        Drawable drawable = this.A0Q;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (!this.A04) {
            canvas.save();
            int i = 0;
            do {
                C9Rz c9Rz = this.A0S[i];
                if (c9Rz != null) {
                    c9Rz.draw(canvas);
                }
                canvas.translate(this.A0J + this.A0I, 0.0f);
                i++;
            } while (i < 3);
            canvas.restore();
        }
        this.A0B.draw(canvas);
    }

    public static final void A00(C220839p7 c220839p7) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        if (c220839p7.A04) {
            i = AbstractC13880nE.A0A(c220839p7.A0O);
            i2 = c220839p7.A0K;
            i3 = i2 * 5;
        } else {
            i = c220839p7.A07;
            i2 = c220839p7.A0K;
            i3 = i2 * 2;
        }
        int i5 = i - i3;
        Context context = c220839p7.A0O;
        C6RB c6rb = c220839p7.A0R;
        int i6 = c220839p7.A0L;
        boolean A1a = AbstractC167017dG.A1a(context, c6rb);
        Spannable spannable = c6rb.A0F;
        if (spannable != null && spannable.length() != 0) {
            int i7 = 2;
            int i8 = (int) (i6 * 2.0f);
            int floor = ((int) Math.floor((i8 - 2) / 2.0f)) + 2;
            while (true) {
                f = floor / 2.0f;
                if (i7 >= floor) {
                    break;
                }
                String obj = c6rb.A0F.toString();
                TextPaint textPaint = c6rb.A0b;
                textPaint.setTextSize(f);
                if (i5 > textPaint.measureText(obj) && new StaticLayout(obj, textPaint, i5, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, A1a).getLineCount() == A1a) {
                    i7 = floor;
                } else {
                    i8 = floor;
                }
                floor = ((int) Math.floor((i8 - i7) / 2.0f)) + i7;
            }
            AMr.A06(context, c6rb, f, 0.0f);
        } else {
            c6rb.A0A(i6);
        }
        int A00 = AbstractC167027dH.A00(c6rb);
        c220839p7.A05 = A00;
        c6rb.A0E(A00);
        if (c220839p7.A04) {
            i4 = c220839p7.A05 + (i2 * 2);
            c220839p7.A00 = i4;
        } else {
            i4 = c220839p7.A07;
        }
        c220839p7.A03 = i4;
    }

    @Override // X.C5RN
    public final List A07() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC25178BCb
    public final int BSK() {
        return AbstractC167007dF.A1W(this.A0C.A03) ? 1 : 0;
    }

    @Override // X.InterfaceC25178BCb
    public final List BSS() {
        List A1J = AbstractC166987dD.A1J(this.A0C.A03);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A1J) {
            if (obj != null) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        if (this.A0D && !this.A04) {
            return "share_professional_thumbnails";
        }
        return "share_professional_no_thumbnails";
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float A02 = AbstractC166987dD.A02(i + i3);
        int i5 = this.A0G + i2;
        Drawable drawable = this.A0Q;
        if (drawable != null) {
            int i6 = (int) A02;
            int i7 = this.A0H / 2;
            drawable.setBounds(i6 - i7, i2, i6 + i7, this.A0F + i2);
        }
        this.A0P.set(i, i5, i3, i4);
        int i8 = (int) A02;
        int i9 = this.A05 / 2;
        int i10 = this.A08 + i2;
        this.A0R.setBounds(i8 - i9, i5 + this.A0N + this.A0M, i8 + i9, i10);
        if (this.A0D) {
            int i11 = i + this.A0K;
            int i12 = this.A0J;
            int i13 = i11 + i12;
            int i14 = i12 + i10;
            int i15 = 0;
            do {
                C9Rz c9Rz = this.A0S[i15];
                if (c9Rz != null) {
                    c9Rz.setBounds(i11, i10, i13, i14);
                }
                i15++;
            } while (i15 < 3);
        }
    }
}
