package com.instagram.common.ui.base;

import X.A48;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC56832jG;
import X.C14360o3;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes2.dex */
public class IgSimpleImageView extends ImageView {
    public int A00;
    public int A01;
    public int A02;
    public Integer A03;
    public Integer A04;
    public boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSimpleImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        this.A02 = 255;
        this.A00 = 255;
        this.A01 = 255;
        A00(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A05) {
            Context context = getContext();
            C14360o3.A07(context);
            Rect rect = A48.A02;
            Resources resources = getResources();
            float dimension = resources.getDimension(R.dimen.abc_edit_text_inset_bottom_material);
            float dimension2 = resources.getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            Paint paint = A48.A01;
            paint.setColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text_on_media)));
            paint.setTextSize(resources.getDimension(R.dimen.abc_button_padding_horizontal_material));
            Paint paint2 = A48.A00;
            paint2.setColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_pink)));
            String string = resources.getString(2131956543);
            C14360o3.A07(string);
            int length = string.length();
            Rect rect2 = A48.A02;
            paint.getTextBounds(string, 0, length, rect2);
            float height = rect2.height();
            float height2 = (((getHeight() / 2.0f) - (height / 2.0f)) - dimension) - dimension2;
            RectF rectF = new RectF(getTranslationX(), (height2 - height) - dimension2, getTranslationX() + paint.measureText(string) + (2.0f * dimension2), height2 + dimension2);
            float dimension3 = resources.getDimension(R.dimen.abc_button_inset_vertical_material);
            canvas.drawRoundRect(rectF, dimension3, dimension3, paint2);
            canvas.drawText(string, getTranslationX() + dimension2, height2, paint);
        }
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        int i;
        Integer num;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1J);
        C14360o3.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.A04 = Integer.valueOf(obtainStyledAttributes.getColor(4, 0));
            if (obtainStyledAttributes.hasValue(1)) {
                num = Integer.valueOf(obtainStyledAttributes.getColor(1, 0));
            } else {
                num = this.A04;
            }
            this.A03 = num;
        }
        this.A02 = obtainStyledAttributes.getInt(5, 255);
        this.A00 = obtainStyledAttributes.getInt(2, 255);
        this.A01 = obtainStyledAttributes.getInt(3, 255);
        obtainStyledAttributes.recycle();
        Integer num2 = this.A04;
        if (num2 != null) {
            int intValue = num2.intValue();
            Integer num3 = this.A03;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                i = intValue;
            }
            AbstractC56832jG.A01(this, intValue, i, this.A02, this.A00, this.A01, 77);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSimpleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = 255;
        this.A00 = 255;
        this.A01 = 255;
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSimpleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A02 = 255;
        this.A00 = 255;
        this.A01 = 255;
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSimpleImageView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A02 = 255;
        this.A00 = 255;
        this.A01 = 255;
    }
}
