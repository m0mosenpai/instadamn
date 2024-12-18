package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216199hc extends C5RN {
    public boolean A00;
    public final int A01 = 2131974408;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Resources A06;
    public final Drawable A07;
    public final Drawable A08;
    public final C89533yt A09;
    public final C6RB A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        C14360o3.A0B(canvas, 0);
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if ((!this.A00 && (drawable = this.A09) != null) || (drawable = this.A07) != null) {
            drawable.draw(canvas);
        }
        this.A0A.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        int centerY = rect.centerY();
        int i = rect.left;
        int i2 = this.A04;
        int i3 = i2 + i;
        int i4 = this.A02;
        int i5 = centerY - (i4 / 2);
        int i6 = i3 + i4;
        int i7 = i4 + i5;
        C89533yt c89533yt = this.A09;
        if (c89533yt != null) {
            c89533yt.setBounds(i3, i5, i6, i7);
        }
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setBounds(i3, i5, i6, i7);
        }
        C6RB c6rb = this.A0A;
        int i8 = c6rb.A06 / 2;
        c6rb.setBounds(i6 + this.A05, centerY - i8, rect.right - i2, centerY + i8);
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public static final SpannableString A00(C216199hc c216199hc, String str) {
        if (str != null) {
            String A0r = AbstractC166997dE.A0r(c216199hc.A06, str, c216199hc.A01);
            C14360o3.A07(A0r);
            int A08 = AbstractC001900j.A08(A0r, str, 0, false);
            SpannableString spannableString = new SpannableString(A0r);
            spannableString.setSpan(new CharacterStyle(), A08, str.length() + A08, 33);
            return spannableString;
        }
        return new SpannableString(c216199hc.A0B);
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.A04;
        return i + this.A02 + this.A05 + this.A0A.A0A + i;
    }

    public C216199hc(Context context, ImageUrl imageUrl, String str, String str2, int i) {
        this.A0C = str2;
        Resources A0M = AbstractC166997dE.A0M(context);
        this.A06 = A0M;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0D = A1E;
        this.A03 = A0M.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        int dimensionPixelSize = A0M.getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
        this.A02 = dimensionPixelSize;
        int A09 = AbstractC166997dE.A09(A0M);
        this.A05 = A09;
        this.A04 = A09;
        this.A0B = A0M.getString(2131974406);
        int dimensionPixelSize2 = A0M.getDimensionPixelSize(R.dimen.challenge_sticker_subtitle_text_size);
        A0M.getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
        Drawable drawable = context.getDrawable(R.drawable.bottom_sticker_attribution_background);
        this.A08 = drawable;
        if (drawable != null) {
            drawable.mutate();
        }
        setAlpha(128);
        setColorFilter(AbstractC46530KiV.A00(C05F.A1I, context.getColor(R.color.chat_sticker_chat_bubble_color)));
        C6RB A0z = AbstractC166987dD.A0z(context, ((i - dimensionPixelSize) - (A09 * 2)) - A09);
        A0z.A0L(A00(this, str2));
        AbstractC166997dE.A1A(context, A0z, R.color.countdown_sticker_title_text_color);
        A0z.A0A(dimensionPixelSize2);
        A0z.A0C(0.0f, 0.0f);
        A0z.A0G(1, "…");
        A0z.setCallback(this);
        this.A0A = A0z;
        int color = context.getColor(R.color.fds_transparent);
        C89533yt c89533yt = new C89533yt(imageUrl, str, dimensionPixelSize, 0, color, color);
        c89533yt.setCallback(this);
        this.A09 = c89533yt;
        Drawable drawable2 = context.getDrawable(R.drawable.sticker_attribution_anonymous_avatar);
        this.A07 = drawable2;
        Collections.addAll(A1E, this.A09, drawable, A0z, drawable2, null);
    }
}
