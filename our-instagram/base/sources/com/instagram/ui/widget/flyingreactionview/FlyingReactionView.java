package com.instagram.ui.widget.flyingreactionview;

import X.C128935sB;
import X.C14360o3;
import X.C69164Vit;
import X.C69363Vm9;
import X.JQ0;
import X.WO4;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class FlyingReactionView extends View {
    public static final OvershootInterpolator A06 = new OvershootInterpolator(2.0f);
    public static final C128935sB A07 = new C128935sB();
    public C69164Vit A00;
    public C69363Vm9 A01;
    public boolean A02;
    public final float A03;
    public final Matrix A04;
    public final Paint A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlyingReactionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A05 = new Paint(1);
        this.A04 = new Matrix();
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        setOnTouchListener(WO4.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r38) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.flyingreactionview.FlyingReactionView.onDraw(android.graphics.Canvas):void");
    }

    public final void setAnimating(boolean z) {
        this.A02 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlyingReactionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ FlyingReactionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlyingReactionView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
