package com.instagram.ui.widget.mediapicker.view;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.C14360o3;
import X.C153406vA;
import X.C3DY;
import X.C44295Jhm;
import X.C44296Jhn;
import X.EnumC44309Ji0;
import X.EnumC44310Ji1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class GalleryPickerMediaOverlayView extends View {
    public static final Paint A0F;
    public static final Paint A0G;
    public Bitmap A00;
    public Drawable A01;
    public EnumC44309Ji0 A02;
    public EnumC44310Ji1 A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C44295Jhm A0C;
    public final Paint A0D;
    public final C44296Jhn A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryPickerMediaOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A0C = new C44295Jhm(context);
        this.A03 = EnumC44310Ji1.A03;
        this.A0D = new Paint(2);
        this.A02 = EnumC44309Ji0.A06;
        this.A0E = new C44296Jhn(context.getResources().getDimensionPixelSize(R.dimen.button_text_size));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float width;
        float height;
        Paint paint;
        int i;
        C14360o3.A0B(canvas, 0);
        if (this.A0B) {
            if ((this.A06 || this.A07) && this.A05) {
                Context context = getContext();
                C14360o3.A07(context);
                Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
                if (drawable != null) {
                    drawable.setColorFilter(C3DY.A00(context.getColor(R.color.audio_bar_action_color_enabled)));
                    drawable.setBounds((canvas.getWidth() - drawable.getIntrinsicWidth()) / 2, (canvas.getHeight() - drawable.getIntrinsicHeight()) / 2, (canvas.getWidth() + drawable.getIntrinsicWidth()) / 2, (canvas.getHeight() + drawable.getIntrinsicHeight()) / 2);
                    drawable.draw(canvas);
                }
            }
            Bitmap bitmap = this.A00;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, canvas.getWidth() - bitmap.getWidth(), 0.0f, this.A0D);
            } else if (this.A09 && !this.A0A && this.A03 != EnumC44310Ji1.A02) {
                C153406vA c153406vA = this.A0C.A00;
                int i2 = c153406vA.A00 + c153406vA.A06;
                c153406vA.setBounds(0, 0, i2, i2);
                canvas.save();
                float f2 = c153406vA.A07;
                canvas.translate((canvas.getWidth() - i2) - f2, f2);
                c153406vA.draw(canvas);
                canvas.restore();
            }
            String str = this.A04;
            if (str != null) {
                C44296Jhn c44296Jhn = this.A0E;
                int width2 = canvas.getWidth();
                int i3 = c44296Jhn.A00 / 2;
                canvas.drawText(str, width2 - i3, canvas.getHeight() - i3, c44296Jhn.A01);
            }
            Drawable drawable2 = this.A01;
            if (drawable2 != null) {
                int i4 = 12;
                if (this.A08) {
                    i4 = 16;
                }
                Context context2 = getContext();
                C14360o3.A07(context2);
                int A04 = (int) AbstractC13880nE.A04(context2, i4);
                int A042 = (int) AbstractC13880nE.A04(context2, 3);
                if (!this.A08) {
                    i = getHeight() - A042;
                } else {
                    i = A042 + A04;
                }
                int i5 = A042 + A04;
                int i6 = A042;
                if (!this.A08) {
                    i6 = i - A04;
                }
                drawable2.setBounds(A042, i6, i5, i);
                drawable2.draw(canvas);
            }
        }
        int ordinal = this.A03.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                f = 0.0f;
                width = canvas.getWidth();
                height = canvas.getHeight();
                paint = A0F;
            } else {
                return;
            }
        } else {
            f = 0.0f;
            width = canvas.getWidth();
            height = canvas.getHeight();
            paint = A0G;
        }
        canvas.drawRect(f, f, width, height, paint);
    }

    public final void setMediaIconType(EnumC44309Ji0 enumC44309Ji0) {
        C14360o3.A0B(enumC44309Ji0, 0);
        this.A02 = enumC44309Ji0;
    }

    public final void setViewRenderMode(EnumC44310Ji1 enumC44310Ji1) {
        C14360o3.A0B(enumC44310Ji1, 0);
        this.A03 = enumC44310Ji1;
    }

    static {
        int argb = Color.argb(204, 255, 255, 255);
        Paint A0R = AbstractC166987dD.A0R();
        Paint.Style style = Paint.Style.FILL;
        A0R.setStyle(style);
        A0R.setColor(Color.argb(180, 147, 147, 147));
        A0F = A0R;
        Paint A0R2 = AbstractC166987dD.A0R();
        A0R2.setStyle(style);
        A0R2.setColor(argb);
        A0G = A0R2;
    }

    public final Bitmap getAlbumIndicatorBitmap() {
        return this.A00;
    }

    public final Drawable getCornerIconDrawable() {
        return this.A01;
    }

    public final boolean getEnableSelectedCheckmarks() {
        return this.A05;
    }

    public final String getFriendlyVideoDuration() {
        return this.A04;
    }

    public final EnumC44309Ji0 getMediaIconType() {
        return this.A02;
    }

    public final boolean getMultiSelectEnabled() {
        return this.A09;
    }

    public final C44295Jhm getNumberedCircleDrawer() {
        return this.A0C;
    }

    public final boolean getSendingSingleMediaWithMultiSelect() {
        return this.A0A;
    }

    public final boolean getShowPrimaryOverlay() {
        return this.A0B;
    }

    public final EnumC44310Ji1 getViewRenderMode() {
        return this.A03;
    }

    public final void setAlbumIndicatorBitmap(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public final void setCornerIconDrawable(Drawable drawable) {
        this.A01 = drawable;
    }

    public final void setEnableSelectedCheckmarks(boolean z) {
        this.A05 = z;
    }

    public final void setFriendlyVideoDuration(String str) {
        this.A04 = str;
    }

    public final void setItemSelected(boolean z) {
        this.A06 = z;
    }

    public final void setMultiSelectEnabled(boolean z) {
        this.A09 = z;
    }

    public final void setPreviewItem(boolean z) {
        this.A07 = z;
    }

    public final void setSendingSingleMediaWithMultiSelect(boolean z) {
        this.A0A = z;
    }

    public final void setShowPrimaryOverlay(boolean z) {
        this.A0B = z;
    }

    public final void setTopLeftIcon(boolean z) {
        this.A08 = z;
    }
}
