package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.9Sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210429Sh extends Drawable implements C74Q {
    public boolean A00;
    public boolean A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Paint A07;
    public final Drawable A08;
    public final Drawable A09;
    public final C6RL A0A;
    public final MusicAssetModel A0B;
    public final C25317BIm A0C;
    public final int A0D;
    public final UserSession A0E;

    public C210429Sh(Context context, UserSession userSession, MusicAssetModel musicAssetModel) {
        this.A06 = context;
        this.A0E = userSession;
        this.A0B = musicAssetModel;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_music_sticker_album_art_size);
        this.A04 = AbstractC167017dG.A0C(context);
        int A0C = AbstractC166987dD.A0C(context, 6);
        this.A0D = A0C;
        Paint A0S = AbstractC166987dD.A0S(1);
        AbstractC166987dD.A1N(context, A0S, R.color.cds_white_a20);
        this.A07 = A0S;
        this.A03 = AbstractC13880nE.A00(context, 10.0f);
        this.A02 = AbstractC13880nE.A00(context, 8.0f);
        Drawable A01 = AbstractC85953sP.A01(context, R.drawable.instagram_music_pano_filled_12, AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_media));
        if (A01 != null) {
            this.A09 = A01;
            Drawable A012 = AbstractC85953sP.A01(context, R.drawable.music_explicit, AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_media));
            if (A012 != null) {
                this.A08 = A012;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                MusicAssetModel musicAssetModel2 = this.A0B;
                spannableStringBuilder.append((CharSequence) musicAssetModel2.A0I);
                if (musicAssetModel2.A0S) {
                    spannableStringBuilder.append((CharSequence) " ");
                    C4GL.A02(this.A08, spannableStringBuilder, spannableStringBuilder.length(), 0, 0);
                }
                spannableStringBuilder.append((CharSequence) " • ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) musicAssetModel2.A0D);
                Context context2 = this.A06;
                spannableStringBuilder.setSpan(new ForegroundColorSpan(AbstractC167007dF.A09(context2, R.attr.igds_color_primary_text_on_media)), 0, length, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context2.getColor(R.color.bright_foreground_disabled_material_dark)), length, spannableStringBuilder.length(), 33);
                int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_primary_text_on_media);
                Integer num = C05F.A00;
                Typeface typeface = Typeface.SANS_SERIF;
                C14360o3.A08(typeface);
                this.A0C = new C25317BIm(context, AbstractC14710oj.A03(context, typeface, num), null, spannableStringBuilder, userSession, R.dimen.add_payment_bottom_sheet_row_subtitle_size, A09);
                this.A05 = (dimensionPixelSize - A01.getIntrinsicWidth()) - A0C;
                this.A0A = AbstractC1572274c.A00(context, this);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.C74Q
    public final /* synthetic */ void CN0() {
        AbstractC1572274c.A02(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return this.A0A;
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        this.A01 = z;
        C6RL c6rl = this.A0A;
        if (z2) {
            c6rl.A01();
        } else {
            c6rl.A00();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int intrinsicWidth = this.A09.getIntrinsicWidth() + this.A0D;
        C6RB c6rb = this.A0C.A02;
        if (c6rb == null) {
            C14360o3.A0F("textDrawableStart");
            throw C00O.createAndThrow();
        }
        return intrinsicWidth + Math.min(c6rb.A0A, this.A05) + (((int) this.A03) * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        this.A0C.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        this.A0C.setColorFilter(colorFilter);
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean CaH(UserSession userSession) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        if (this.A01) {
            float A0E = AbstractC166987dD.A0E(this.A09);
            float f = this.A03;
            RectF rectF = new RectF(A0E - f, r5.getBounds().top - f, this.A0C.getBounds().right + f, AbstractC166987dD.A0D(r5) + f);
            float f2 = this.A02;
            canvas.drawRoundRect(rectF, f2, f2, this.A07);
        }
        this.A09.draw(canvas);
        this.A0C.draw(canvas);
        this.A0A.draw(canvas);
        canvas.restore();
        if (this.A00) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        int intrinsicWidth = (int) (((i + i3) / 2.0f) - (getIntrinsicWidth() / 2));
        Drawable drawable = this.A09;
        int i5 = (int) this.A03;
        int i6 = i5 + intrinsicWidth;
        drawable.setBounds(i6, (int) (A03 - (drawable.getIntrinsicHeight() / 2)), i6 + drawable.getIntrinsicWidth(), (int) ((drawable.getIntrinsicHeight() / 2) + A03));
        C25317BIm c25317BIm = this.A0C;
        c25317BIm.setBounds(i6 + drawable.getIntrinsicWidth() + this.A0D, (int) (A03 - (c25317BIm.getIntrinsicHeight() / 2)), (intrinsicWidth + getIntrinsicWidth()) - i5, (int) (A03 + (c25317BIm.getIntrinsicHeight() / 2)));
        c25317BIm.A02(Integer.valueOf(this.A05), null);
    }
}
