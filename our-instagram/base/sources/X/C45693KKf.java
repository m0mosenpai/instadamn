package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KKf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45693KKf extends C5RN implements Drawable.Callback {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final Drawable A05;
    public final GradientDrawable A06;
    public final List A07;

    public C45693KKf(Context context, List list) {
        int i;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A07 = A1E;
        this.A04 = context;
        Resources resources = context.getResources();
        this.A03 = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A01 = dimensionPixelSize;
        this.A00 = dimensionPixelSize2;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
        this.A02 = dimensionPixelSize3;
        if (list.size() == 5) {
            i = list.size();
        } else {
            i = 4;
        }
        L9I l9i = new L9I(context, "standalonefundraisersticker", list, dimensionPixelSize);
        l9i.A0B = true;
        l9i.A00 = 0.3f;
        l9i.A01(dimensionPixelSize3);
        l9i.A08 = AbstractC31174DnI.A0q(context, R.color.grey_2);
        l9i.A01 = i;
        l9i.A02 = AbstractC31172DnG.A03(list, i);
        l9i.A05 = Integer.valueOf(AbstractC167007dF.A09(context, R.attr.igds_color_text_on_white));
        C89553yv A00 = l9i.A00();
        this.A05 = A00;
        A00.setCallback(this);
        GradientDrawable gradientDrawable = (GradientDrawable) context.getDrawable(R.drawable.interactive_sticker_background).mutate();
        this.A06 = gradientDrawable;
        gradientDrawable.setStroke(AbstractC166997dE.A0B(resources), context.getColor(R.color.grey_2));
        Collections.addAll(A1E, gradientDrawable, A00);
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (this.A01 + this.A06.getIntrinsicHeight()) - this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        GradientDrawable gradientDrawable = this.A06;
        int i6 = this.A00 + i2;
        int i7 = this.A02;
        gradientDrawable.setBounds(i, i6 + i7, i3, i4);
        Drawable drawable = this.A05;
        drawable.setBounds(i5 - (drawable.getIntrinsicWidth() / 2), i2, i5 + (drawable.getIntrinsicWidth() / 2), this.A01 + i2 + (i7 * 2));
    }
}
