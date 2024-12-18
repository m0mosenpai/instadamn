package com.facebook.smartcapture.components;

import X.AbstractC166987dD;
import X.AbstractC47994LKy;
import X.C14360o3;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class DarkenedFrameView extends View {
    public final float A00;
    public final float A01;
    public final Path A02;
    public final RectF A03;
    public final RectF A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DarkenedFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A02 = AbstractC166987dD.A0T();
        this.A04 = AbstractC166987dD.A0X();
        this.A03 = AbstractC166987dD.A0X();
        this.A05 = AbstractC47994LKy.A01(context, R.attr.sc_dark_shadow);
        Resources resources = getResources();
        this.A01 = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
        this.A00 = resources.getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.clipOutPath(this.A02);
        canvas.drawColor(this.A05);
    }
}
