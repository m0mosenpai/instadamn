package com.instagram.direct.ui;

import X.C128955sF;
import X.C14360o3;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.direct.ui.DirectShareShimmerView;

/* loaded from: classes3.dex */
public final class DirectShareShimmerView extends C128955sF {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectShareShimmerView(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        final Resources resources = getResources();
        C14360o3.A07(resources);
        setImageDrawable(new Drawable(resources, this) { // from class: X.5sH
            public final float A00;
            public final float A01;
            public final float A02;
            public final float A03;
            public final float A04;
            public final float A05;
            public final float A06;
            public final float A07;
            public final float A08;
            public final Paint A09;
            public final RectF A0A;
            public final /* synthetic */ DirectShareShimmerView A0B;

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                C14360o3.A0B(canvas, 0);
                Rect bounds = getBounds();
                C14360o3.A07(bounds);
                float f = bounds.top;
                while (true) {
                    float f2 = this.A07;
                    if (f2 + f < bounds.bottom) {
                        float width = bounds.width();
                        float f3 = this.A02;
                        float f4 = this.A03 + f;
                        float f5 = this.A04;
                        Paint paint = this.A09;
                        canvas.drawCircle(f3, f4, f5, paint);
                        RectF rectF = this.A0A;
                        float f6 = f3 + f5 + this.A00;
                        float f7 = f2 / 3.0f;
                        float f8 = this.A05;
                        float f9 = this.A01;
                        float f10 = this.A06;
                        rectF.set(f6, (f7 - f8) + f, width - f9, f7 + f10 + f);
                        canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
                        float f11 = f7 * 2.0f;
                        rectF.set(f6, (f11 - f10) + f, width - (f9 * 2.0f), f11 + f8 + f);
                        canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
                        f += f2;
                    } else {
                        return;
                    }
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            {
                this.A0B = this;
                Paint paint = new Paint(1);
                this.A09 = paint;
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(this.getContext().getColor(R.color.grey_1));
                this.A08 = resources.getDisplayMetrics().density;
                Resources resources2 = this.getResources();
                float dimension = resources2.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
                this.A07 = dimension;
                float f = dimension / 2.0f;
                this.A02 = resources2.getDimension(R.dimen.abc_edit_text_inset_top_material) + f;
                this.A03 = f;
                this.A04 = resources2.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) / 2.0f;
                this.A01 = 100.0f * this.A08;
                this.A00 = resources2.getDimension(R.dimen.account_discovery_bottom_gap);
                this.A06 = resources2.getDimension(R.dimen.accent_edge_thickness);
                this.A05 = resources2.getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                this.A0A = new RectF();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.A09.setAlpha(i);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.A09.setColorFilter(colorFilter);
                invalidateSelf();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectShareShimmerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        final Resources resources = getResources();
        C14360o3.A07(resources);
        setImageDrawable(new Drawable(resources, this) { // from class: X.5sH
            public final float A00;
            public final float A01;
            public final float A02;
            public final float A03;
            public final float A04;
            public final float A05;
            public final float A06;
            public final float A07;
            public final float A08;
            public final Paint A09;
            public final RectF A0A;
            public final /* synthetic */ DirectShareShimmerView A0B;

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                C14360o3.A0B(canvas, 0);
                Rect bounds = getBounds();
                C14360o3.A07(bounds);
                float f = bounds.top;
                while (true) {
                    float f2 = this.A07;
                    if (f2 + f < bounds.bottom) {
                        float width = bounds.width();
                        float f3 = this.A02;
                        float f4 = this.A03 + f;
                        float f5 = this.A04;
                        Paint paint = this.A09;
                        canvas.drawCircle(f3, f4, f5, paint);
                        RectF rectF = this.A0A;
                        float f6 = f3 + f5 + this.A00;
                        float f7 = f2 / 3.0f;
                        float f8 = this.A05;
                        float f9 = this.A01;
                        float f10 = this.A06;
                        rectF.set(f6, (f7 - f8) + f, width - f9, f7 + f10 + f);
                        canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
                        float f11 = f7 * 2.0f;
                        rectF.set(f6, (f11 - f10) + f, width - (f9 * 2.0f), f11 + f8 + f);
                        canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
                        f += f2;
                    } else {
                        return;
                    }
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            {
                this.A0B = this;
                Paint paint = new Paint(1);
                this.A09 = paint;
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(this.getContext().getColor(R.color.grey_1));
                this.A08 = resources.getDisplayMetrics().density;
                Resources resources2 = this.getResources();
                float dimension = resources2.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
                this.A07 = dimension;
                float f = dimension / 2.0f;
                this.A02 = resources2.getDimension(R.dimen.abc_edit_text_inset_top_material) + f;
                this.A03 = f;
                this.A04 = resources2.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) / 2.0f;
                this.A01 = 100.0f * this.A08;
                this.A00 = resources2.getDimension(R.dimen.account_discovery_bottom_gap);
                this.A06 = resources2.getDimension(R.dimen.accent_edge_thickness);
                this.A05 = resources2.getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                this.A0A = new RectF();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i2) {
                this.A09.setAlpha(i2);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.A09.setColorFilter(colorFilter);
                invalidateSelf();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectShareShimmerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        final Resources resources = getResources();
        C14360o3.A07(resources);
        setImageDrawable(new Drawable(resources, this) { // from class: X.5sH
            public final float A00;
            public final float A01;
            public final float A02;
            public final float A03;
            public final float A04;
            public final float A05;
            public final float A06;
            public final float A07;
            public final float A08;
            public final Paint A09;
            public final RectF A0A;
            public final /* synthetic */ DirectShareShimmerView A0B;

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                C14360o3.A0B(canvas, 0);
                Rect bounds = getBounds();
                C14360o3.A07(bounds);
                float f = bounds.top;
                while (true) {
                    float f2 = this.A07;
                    if (f2 + f < bounds.bottom) {
                        float width = bounds.width();
                        float f3 = this.A02;
                        float f4 = this.A03 + f;
                        float f5 = this.A04;
                        Paint paint = this.A09;
                        canvas.drawCircle(f3, f4, f5, paint);
                        RectF rectF = this.A0A;
                        float f6 = f3 + f5 + this.A00;
                        float f7 = f2 / 3.0f;
                        float f8 = this.A05;
                        float f9 = this.A01;
                        float f10 = this.A06;
                        rectF.set(f6, (f7 - f8) + f, width - f9, f7 + f10 + f);
                        canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
                        float f11 = f7 * 2.0f;
                        rectF.set(f6, (f11 - f10) + f, width - (f9 * 2.0f), f11 + f8 + f);
                        canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
                        f += f2;
                    } else {
                        return;
                    }
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            {
                this.A0B = this;
                Paint paint = new Paint(1);
                this.A09 = paint;
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(this.getContext().getColor(R.color.grey_1));
                this.A08 = resources.getDisplayMetrics().density;
                Resources resources2 = this.getResources();
                float dimension = resources2.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
                this.A07 = dimension;
                float f = dimension / 2.0f;
                this.A02 = resources2.getDimension(R.dimen.abc_edit_text_inset_top_material) + f;
                this.A03 = f;
                this.A04 = resources2.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) / 2.0f;
                this.A01 = 100.0f * this.A08;
                this.A00 = resources2.getDimension(R.dimen.account_discovery_bottom_gap);
                this.A06 = resources2.getDimension(R.dimen.accent_edge_thickness);
                this.A05 = resources2.getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                this.A0A = new RectF();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i2) {
                this.A09.setAlpha(i2);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.A09.setColorFilter(colorFilter);
                invalidateSelf();
            }
        });
    }
}
