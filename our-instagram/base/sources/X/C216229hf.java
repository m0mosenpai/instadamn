package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216229hf extends C5RN implements Drawable.Callback {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public GradientDrawable A05;
    public int A06;
    public LayerDrawable A07;
    public LayerDrawable A08;
    public final Context A09;
    public final GradientDrawable A0A;
    public final C9SG A0B;
    public final List A0C;

    @Override // X.C5RN
    public final List A07() {
        return this.A0C;
    }

    public final void A08() {
        C9SG c9sg = this.A0B;
        c9sg.A03 = null;
        c9sg.A02 = null;
        c9sg.invalidateSelf();
    }

    public final void A09(int i) {
        C9SG c9sg = this.A0B;
        c9sg.A05.setColor(i);
        c9sg.invalidateSelf();
    }

    public final void A0A(int i) {
        C9SG c9sg = this.A0B;
        c9sg.A01 = i;
        c9sg.invalidateSelf();
    }

    public final void A0B(int i) {
        GradientDrawable gradientDrawable = this.A0A;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        gradientDrawable.setColorFilter(new PorterDuffColorFilter(i, mode));
        GradientDrawable gradientDrawable2 = this.A05;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColorFilter(new PorterDuffColorFilter(i, mode));
        }
    }

    public final void A0C(Drawable drawable) {
        C9SG c9sg = this.A0B;
        c9sg.A02 = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), c9sg.A02.getIntrinsicHeight());
    }

    public final void A0D(Drawable drawable, Drawable drawable2, int i) {
        LayerDrawable layerDrawable = this.A07;
        if (layerDrawable != null) {
            this.A0C.remove(layerDrawable);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable2, drawable});
        this.A07 = layerDrawable2;
        layerDrawable2.setLayerInset(1, i, i, i, i);
        this.A0C.add(this.A07);
    }

    public final void A0E(Drawable drawable, boolean z) {
        LayerDrawable layerDrawable = this.A08;
        if (layerDrawable != null) {
            this.A0C.remove(layerDrawable);
        }
        Context context = this.A09;
        GradientDrawable gradientDrawable = (GradientDrawable) context.getDrawable(R.drawable.interactive_sticker_background).mutate();
        this.A05 = gradientDrawable;
        gradientDrawable.setCornerRadius(this.A03);
        this.A05.setOrientation(this.A0A.getOrientation());
        int i = -1;
        if (z) {
            i = -16777216;
        }
        AbstractC166997dE.A1F(drawable, i);
        this.A08 = new LayerDrawable(new Drawable[]{this.A05, context.getDrawable(R.drawable.circle_outline_white_2).mutate(), drawable});
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.album_music_sticker_text_vertical_padding);
        this.A08.setLayerInset(2, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.A0C.add(1, this.A08);
    }

    public final void A0F(GradientDrawable.Orientation orientation) {
        this.A0A.setOrientation(orientation);
        GradientDrawable gradientDrawable = this.A05;
        if (gradientDrawable != null) {
            gradientDrawable.setOrientation(orientation);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            AbstractC166987dD.A0Z(it).draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AbstractC166987dD.A0F(this.A0A, this.A00) - this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public C216229hf(Context context) {
        this.A09 = context;
        Resources resources = context.getResources();
        this.A03 = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
        this.A06 = dimensionPixelSize;
        this.A02 = dimensionPixelSize;
        this.A00 = resources.getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
        GradientDrawable gradientDrawable = (GradientDrawable) context.getDrawable(R.drawable.interactive_sticker_background).mutate();
        this.A0A = gradientDrawable;
        C9SG c9sg = new C9SG(context);
        this.A0B = c9sg;
        c9sg.setCallback(this);
        c9sg.A01 = AbstractC166987dD.A04(resources, R.dimen.ads_disclosure_footer_top_divider_height);
        c9sg.invalidateSelf();
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0C = A1E;
        Collections.addAll(A1E, gradientDrawable, c9sg);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setBounds(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            super.setBounds(r9, r10, r11, r12)
            int r0 = r9 + r11
            int r4 = r0 / 2
            android.graphics.drawable.LayerDrawable r7 = r8.A08
            r6 = 0
            if (r7 == 0) goto L56
            int r5 = r8.A06
            double r0 = (double) r5
            r2 = 4606011482896901079(0x3febd70a3d70a3d7, double:0.87)
            double r0 = r0 * r2
            int r2 = (int) r0
        L16:
            int r1 = r4 - r5
            int r1 = r1 + r2
            int r5 = r5 + r4
            int r5 = r5 + r2
            int r0 = r8.A00
            int r0 = r0 + r10
            r7.setBounds(r1, r10, r5, r0)
        L21:
            int r1 = r11 - r9
            int r0 = r8.A03
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r1, r6)
            float r0 = X.AbstractC166987dD.A02(r0)
            int r0 = (int) r0
            int r9 = r9 + r0
            int r11 = r11 - r0
            android.graphics.drawable.GradientDrawable r1 = r8.A0A
            int r0 = r8.A02
            int r0 = r0 + r10
            r1.setBounds(r9, r0, r11, r12)
            int r5 = r8.A00
            int r5 = r5 + r10
            int r1 = r8.A06
            int r3 = r4 + r1
            int r3 = r3 - r2
            X.9SG r0 = r8.A0B
            int r4 = r4 - r1
            int r4 = r4 - r2
            r0.setBounds(r4, r10, r3, r5)
            android.graphics.drawable.Drawable r2 = r8.A04
            if (r2 == 0) goto L55
            int r0 = r8.A01
            int r1 = r3 - r0
            int r0 = r5 - r0
            r2.setBounds(r1, r0, r3, r5)
        L55:
            return
        L56:
            android.graphics.drawable.LayerDrawable r7 = r8.A07
            if (r7 == 0) goto L63
            int r5 = r8.A06
            double r0 = (double) r5
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r0 = r0 * r2
            int r2 = (int) r0
            int r2 = -r2
            goto L16
        L63:
            r2 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216229hf.setBounds(int, int, int, int):void");
    }
}
