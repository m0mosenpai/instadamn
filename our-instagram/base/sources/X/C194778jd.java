package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.facebook.R;
import java.util.List;

/* renamed from: X.8jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194778jd extends AbstractC130945vi implements C5RR, InterfaceC133125ze {
    public C210279Rq A00;
    public final int A01;
    public final C24017Akv A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final Resources A08;
    public final C216149hX A09;
    public final C6RB A0A;
    public final C124385ju A0B;

    /* JADX WARN: Type inference failed for: r0v10, types: [android.graphics.drawable.Drawable, X.9Rq] */
    public C194778jd(final Context context, C24017Akv c24017Akv, String str) {
        C14360o3.A0B(str, 3);
        C14360o3.A0B(c24017Akv, 4);
        this.A07 = context;
        this.A02 = c24017Akv;
        Resources resources = context.getResources();
        this.A08 = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.eu_stamp_icon_size);
        this.A01 = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A06 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A05 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A04 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A03 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        ?? r0 = new Drawable(context) { // from class: X.9Rq
            public final float A00;
            public final float A01;
            public final int A02;
            public final Resources A03;
            public final Paint A04;
            public final Paint A05;
            public final Path A06;
            public final RectF A07;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                C14360o3.A0B(rect, 0);
                super.onBoundsChange(rect);
                RectF rectF = this.A07;
                rectF.set(0.0f, 0.0f, rect.width(), rect.height());
                Path path = this.A06;
                path.reset();
                float f = this.A00;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.A04.setAlpha(i);
                Paint paint = this.A05;
                paint.setAlpha(i);
                if (i == 0) {
                    paint.clearShadowLayer();
                } else {
                    paint.setShadowLayer(this.A01, 0.0f, 0.0f, this.A02);
                }
            }

            {
                Resources resources2 = context.getResources();
                this.A03 = resources2;
                int A03 = AbstractC166997dE.A03(context);
                Paint A0S = AbstractC166987dD.A0S(3);
                A0S.setColor(A03);
                AbstractC166987dD.A1R(A0S);
                this.A04 = A0S;
                this.A00 = AbstractC166997dE.A0A(resources2);
                float A08 = AbstractC166997dE.A08(resources2);
                this.A01 = A08;
                int color = context.getColor(R.color.black_10_transparent);
                this.A02 = color;
                Paint A0S2 = AbstractC166987dD.A0S(3);
                A0S2.setColor(A03);
                A0S2.setShadowLayer(A08, 0.0f, 0.0f, color);
                this.A05 = A0S2;
                this.A06 = AbstractC166987dD.A0T();
                this.A07 = AbstractC166987dD.A0X();
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                AbstractC167007dF.A0r(canvas);
                AbstractC167017dG.A12(canvas, this);
                Path path = this.A06;
                canvas.drawPath(path, this.A05);
                canvas.drawPath(path, this.A04);
                canvas.restore();
            }
        };
        r0.setCallback(this);
        this.A00 = r0;
        C6RB c6rb = new C6RB(context, dimensionPixelSize - (dimensionPixelSize2 * 2));
        c6rb.A0A(resources.getDimensionPixelSize(R.dimen.account_group_management_row_text_size));
        c6rb.A0F(c6rb.A0Z.getColor(R.color.clips_remix_camera_outer_container_default_background));
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.prompt_sticker_title_text_line_spacing_multiplier, typedValue, true);
        c6rb.A0B(0.0f, typedValue.getFloat());
        String str2 = c24017Akv.A01;
        c6rb.A0M(str2 == null ? "" : str2);
        c6rb.setCallback(this);
        this.A0A = c6rb;
        C124385ju c124385ju = new C124385ju(context, resources.getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top), AbstractC53242c7.A0H(context, R.attr.dividerColor), 80);
        c124385ju.setCallback(this);
        this.A0B = c124385ju;
        C216149hX c216149hX = new C216149hX(context);
        c216149hX.setCallback(this);
        this.A09 = c216149hX;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "secret_sticker_default";
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        draw(canvas);
        this.A0A.draw(canvas);
        this.A0B.draw(canvas);
        this.A09.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A00, this.A0A, this.A0B, this.A09);
    }

    @Override // X.AbstractC130945vi
    public final Integer A08() {
        return C05F.A01;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0A.A06 + this.A0B.getIntrinsicHeight() + this.A09.A00.getIntrinsicHeight() + this.A06 + this.A05 + this.A04 + this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01;
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        setAlpha(i);
        this.A0A.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A09.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        float f3 = this.A01 / 2.0f;
        int i5 = (int) (f - f3);
        int intrinsicHeight = (int) (f2 - (getIntrinsicHeight() / 2.0f));
        int i6 = (int) (f3 + f);
        setBounds(i5, intrinsicHeight, i6, (int) (f2 + (getIntrinsicHeight() / 2.0f)));
        C6RB c6rb = this.A0A;
        float f4 = c6rb.A0A / 2.0f;
        int i7 = this.A06 + intrinsicHeight;
        c6rb.setBounds((int) (f - f4), i7, (int) (f4 + f), c6rb.A06 + i7);
        int i8 = c6rb.getBounds().bottom + this.A05;
        C124385ju c124385ju = this.A0B;
        c124385ju.setBounds(i5, i8, i6, c124385ju.getIntrinsicHeight() + i8);
        int i9 = c124385ju.getBounds().bottom + this.A04;
        C216149hX c216149hX = this.A09;
        c216149hX.setBounds((int) (f - (c216149hX.getIntrinsicWidth() / 2.0f)), i9, (int) (f + (c216149hX.getIntrinsicWidth() / 2.0f)), c216149hX.A00.getIntrinsicHeight() + i9);
    }
}
