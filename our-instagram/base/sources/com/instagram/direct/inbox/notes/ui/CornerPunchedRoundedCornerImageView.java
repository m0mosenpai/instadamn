package com.instagram.direct.inbox.notes.ui;

import X.AbstractC13620mo;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class CornerPunchedRoundedCornerImageView extends RoundedCornerImageView {
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public Path A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CornerPunchedRoundedCornerImageView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // com.instagram.common.ui.widget.imageview.RoundedCornerImageView, com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A00) {
            Path path = this.A04;
            if (path == null) {
                C14360o3.A0F("path");
                throw C00O.createAndThrow();
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    private final void A00() {
        Path path = new Path();
        this.A04 = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        int[] punchCenter = getPunchCenter();
        int i = this.A03;
        if (i == -1) {
            i = getWidth() / 2;
        }
        Path path2 = this.A04;
        if (path2 == null) {
            C14360o3.A0F("path");
            throw C00O.createAndThrow();
        }
        path2.addCircle(punchCenter[0] + this.A01, punchCenter[1] + this.A02, i, Path.Direction.CW);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int[] getPunchCenter() {
        int i;
        int width;
        int height;
        if (this.A06) {
            i = getWidth();
            width = 0;
        } else {
            i = 0;
            width = getWidth();
        }
        String str = this.A05;
        switch (str.hashCode()) {
            case -1698351794:
                if (str.equals("bottom_start")) {
                    height = getHeight();
                    break;
                }
                height = 0;
                break;
            case -1682225977:
                if (str.equals("bottom_end")) {
                    height = getHeight();
                    i = width;
                    break;
                }
                height = 0;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    i = getWidth() / 2;
                    height = getHeight() / 2;
                    break;
                }
                height = 0;
                break;
            case -1139554575:
                if (str.equals("top_end")) {
                    i = width;
                }
                height = 0;
                break;
            default:
                height = 0;
                break;
        }
        return new int[]{i, height};
    }

    public final void setPunchOffsetX(int i) {
        this.A01 = i;
        A00();
        invalidate();
    }

    public final void setPunchOffsetY(int i) {
        this.A02 = i;
        A00();
        invalidate();
    }

    public final void setPunchRadius(int i) {
        this.A03 = i;
        A00();
        invalidate();
    }

    @Override // com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-340460960);
        super.onSizeChanged(i, i2, i3, i4);
        A00();
        C0f9.A0D(-1457582284, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornerPunchedRoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = true;
        boolean A02 = AbstractC13620mo.A02(context);
        this.A06 = A02;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0N);
        C14360o3.A07(obtainStyledAttributes);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 0);
        if (A00 != null) {
            this.A05 = A00;
            this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            int i2 = this.A01;
            this.A01 = A02 ? -i2 : i2;
            obtainStyledAttributes.recycle();
            A00();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public /* synthetic */ CornerPunchedRoundedCornerImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CornerPunchedRoundedCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
