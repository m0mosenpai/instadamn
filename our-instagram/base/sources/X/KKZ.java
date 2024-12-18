package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class KKZ extends C5RN {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Paint A07;
    public final Path A08;
    public final Drawable A09;
    public final C6RB A0A;
    public final C6RB A0B;

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        Path path = this.A08;
        path.reset();
        path.setFillType(Path.FillType.WINDING);
        RectF rectF = new RectF(rect);
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        float exactCenterY = rect.exactCenterY();
        C6RB c6rb = this.A0A;
        int i = c6rb.A06;
        int A01 = C1H4.A01(exactCenterY - (i / 2.0f));
        int i2 = rect.left;
        int i3 = this.A04;
        int i4 = i2 + i3;
        int i5 = i4 + c6rb.A0A;
        c6rb.setBounds(i4, A01, i5, i + A01);
        C6RB c6rb2 = this.A0B;
        if (c6rb2 != null) {
            int A012 = C1H4.A01(rect.exactCenterY() - (c6rb2.A06 / 2.0f));
            int i6 = c6rb.getBounds().right;
            int i7 = this.A03;
            i5 = i6 + i7 + c6rb2.A0A;
            c6rb2.setBounds(c6rb.getBounds().right + i7, A012, i5, c6rb2.A06 + A012);
        }
        Drawable drawable = this.A09;
        if (drawable != null) {
            float exactCenterY2 = rect.exactCenterY();
            int i8 = this.A01;
            int A013 = C1H4.A01(exactCenterY2 - (i8 / 2.0f));
            drawable.setBounds(i5 + this.A03, A013, rect.right - i3, i8 + A013);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC001800i.A0U(AbstractC16960so.A1R(this.A0A, this.A0B, this.A09));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A05;
    }

    public /* synthetic */ KKZ(Context context, String str, long j, boolean z) {
        C6RB c6rb;
        int i;
        int i2;
        int A03 = AbstractC44198Jg1.A03(context, R.dimen.abc_dialog_padding_top_material);
        float A032 = AbstractC44198Jg1.A03(context, R.dimen.autocomplete_dropdown_header_text_size);
        float A033 = AbstractC44198Jg1.A03(context, R.dimen.abc_button_inset_vertical_material);
        int A034 = AbstractC44198Jg1.A03(context, R.dimen.abc_button_inset_vertical_material);
        int A035 = AbstractC44198Jg1.A03(context, R.dimen.abc_action_bar_elevation_material);
        int A036 = AbstractC44198Jg1.A03(context, R.dimen.group_mention_entrypoint_min_text_size);
        AbstractC167007dF.A1D(context, 1, str);
        this.A06 = context;
        this.A02 = A03;
        this.A00 = A033;
        this.A04 = A034;
        this.A03 = A035;
        this.A01 = A036;
        boolean A1O = AbstractC167007dF.A1O((j > 0L ? 1 : (j == 0L ? 0 : -1)));
        int A04 = AbstractC166997dE.A04(context, R.dimen.abc_list_item_height_large_material);
        C6RB A0z = AbstractC166987dD.A0z(context, A04);
        Context context2 = A0z.A0Z;
        C14360o3.A07(context2);
        A0z.A0I(AbstractC15960qq.A00(context2).A02(EnumC15950qp.A11));
        A0z.A0A(A032);
        A0z.A0M(str);
        A0z.A0G(1, "…");
        AbstractC167017dG.A10(context2, A0z, R.attr.igds_color_primary_text);
        this.A0A = A0z;
        Drawable drawable = null;
        if (A1O) {
            C09530e4 A07 = AbstractC44198Jg1.A07(context, j);
            String str2 = (String) A07.A00;
            int i3 = AbstractC166987dD.A1a(A07.A01) ? R.attr.igds_color_active_badge : R.attr.igds_color_secondary_text;
            c6rb = AbstractC166987dD.A0z(context, A04);
            Context context3 = c6rb.A0Z;
            C14360o3.A07(context3);
            c6rb.A0I(AbstractC167017dG.A0R(context3));
            c6rb.A0A(A032);
            c6rb.A0M(str2);
            c6rb.A0G(1, "…");
            AbstractC167017dG.A10(context3, c6rb, i3);
        } else {
            c6rb = null;
        }
        this.A0B = c6rb;
        if (z) {
            int color = context.getColor(AbstractC53242c7.A0B(context));
            Drawable drawable2 = context.getDrawable(R.drawable.instagram_eye_off_pano_outline_24);
            if (drawable2 != null && (drawable = drawable2.mutate()) != null) {
                drawable.setTint(color);
                drawable.setBounds(new Rect(0, 0, A036, A036));
            } else {
                drawable = null;
            }
        }
        this.A09 = drawable;
        int i4 = (A034 * 2) + A0z.A0A;
        if (c6rb != null) {
            i = c6rb.A0A + A035;
        } else {
            i = 0;
        }
        int i5 = i4 + i;
        if (drawable != null) {
            i2 = AbstractC166997dE.A0H(drawable) + A035;
        } else {
            i2 = 0;
        }
        this.A05 = i5 + i2;
        this.A08 = AbstractC166987dD.A0T();
        Paint A0S = AbstractC166987dD.A0S(1);
        AbstractC43594JPz.A14(context, A0S, R.attr.igds_color_primary_background);
        A0S.setShadowLayer(A033, 0.0f, 0.0f, context.getColor(R.color.black_30_transparent));
        this.A07 = A0S;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        canvas.drawPath(this.A08, this.A07);
        canvas.restore();
        this.A0A.draw(canvas);
        C6RB c6rb = this.A0B;
        if (c6rb != null) {
            c6rb.draw(canvas);
        }
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.A07.setAlpha(i);
        this.A0A.setAlpha(i);
        C6RB c6rb = this.A0B;
        if (c6rb != null) {
            c6rb.setAlpha(i);
        }
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        invalidateSelf();
    }
}
