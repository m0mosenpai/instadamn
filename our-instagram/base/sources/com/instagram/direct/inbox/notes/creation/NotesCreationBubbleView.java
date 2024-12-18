package com.instagram.direct.inbox.notes.creation;

import X.AbstractC13620mo;
import X.AbstractC13690mv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25226BEj;
import X.AbstractC53242c7;
import X.C14360o3;
import X.C1H6;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* loaded from: classes8.dex */
public final class NotesCreationBubbleView extends IgLinearLayout {
    public CardView A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public View A08;
    public ConstraintLayout A09;
    public boolean A0A;
    public final float A0B;
    public final Paint A0C;
    public final RectF A0D;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotesCreationBubbleView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float paddingEnd;
        float f;
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        if (!this.A01) {
            boolean z = this.A0A;
            if (z) {
                paddingEnd = (this.A00.getWidth() + this.A09.getPaddingStart()) - getBubbleXOffset();
            } else {
                paddingEnd = this.A09.getPaddingEnd() + getBubbleXOffset();
            }
            float A08 = AbstractC166987dD.A08(this.A00) - (getLargeThoughtBubbleRadius() / 2.0f);
            float f2 = 180.0f - (2.0f * 15.0f);
            if (!this.A01) {
                RectF rectF = this.A0D;
                rectF.left = paddingEnd - getLargeThoughtBubbleRadius();
                rectF.right = getLargeThoughtBubbleRadius() + paddingEnd;
                rectF.top = A08 - getLargeThoughtBubbleRadius();
                rectF.bottom = getLargeThoughtBubbleRadius() + A08;
                Paint paint = this.A0C;
                canvas.drawArc(rectF, 15.0f, f2, false, paint);
                float smallThoughtBubbleXOffset = getSmallThoughtBubbleXOffset();
                if (z) {
                    f = paddingEnd - smallThoughtBubbleXOffset;
                } else {
                    f = paddingEnd + smallThoughtBubbleXOffset;
                }
                canvas.drawCircle(f, A08 + getSmallThoughtBubbleYOffset(), getSmallThoughtBubbleRadius(), paint);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r11.A05 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setIconicRedesignLayout(androidx.cardview.widget.CardView r12) {
        /*
            r11 = this;
            r8 = 0
            X.C14360o3.A0B(r12, r8)
            boolean r0 = r11.A01
            if (r0 == 0) goto L3f
            android.view.View r2 = r11.A08
            android.content.Context r3 = r11.getContext()
            int r1 = X.AbstractC167017dG.A05(r3)
            int r0 = X.AbstractC167017dG.A0E(r3)
            X.AbstractC13880nE.A0k(r2, r8, r1, r8, r0)
            r12.setClipToOutline(r8)
            int r4 = r11.A07
            r0 = 2131099903(0x7f0600ff, float:1.7812172E38)
            int r5 = r3.getColor(r0)
            boolean r0 = X.C1H6.A03()
            if (r0 != 0) goto L30
            boolean r0 = r11.A05
            r7 = 0
            if (r0 == 0) goto L31
        L30:
            r7 = 1
        L31:
            boolean r9 = r11.A04
            boolean r10 = r11.A03
            r6 = 882(0x372, float:1.236E-42)
            X.BSc r2 = new X.BSc
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r12.setBackground(r2)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView.setIconicRedesignLayout(androidx.cardview.widget.CardView):void");
    }

    private final float getBubbleXOffset() {
        float f;
        if (this.A06) {
            f = this.A0B + 5.0f;
        } else {
            f = 47.0f;
        }
        return AbstractC13690mv.A00(AbstractC166997dE.A0L(this), f);
    }

    private final float getLargeThoughtBubbleRadius() {
        float f = 7.0f;
        if (this.A02) {
            f = 10.0f;
        }
        return AbstractC13690mv.A00(AbstractC166997dE.A0L(this), f);
    }

    private final float getSmallThoughtBubbleRadius() {
        float f = 2.5f;
        if (this.A02) {
            f = 3.5f;
        }
        return AbstractC13690mv.A00(AbstractC166997dE.A0L(this), f);
    }

    private final float getSmallThoughtBubbleXOffset() {
        float f = 5.0f;
        if (this.A02) {
            f = 8.0f;
        }
        return AbstractC13690mv.A00(AbstractC166997dE.A0L(this), f);
    }

    private final float getSmallThoughtBubbleYOffset() {
        float f = 10.0f;
        if (this.A02) {
            f = 15.0f;
        }
        return AbstractC13690mv.A00(AbstractC166997dE.A0L(this), f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = 90.0f;
        if (this.A01) {
            f = 160.0f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) AbstractC13690mv.A00(AbstractC166997dE.A0L(this), f), Integer.MIN_VALUE));
    }

    public final void setBubbleBackgroundColor(int i) {
        this.A07 = i;
        setIconicRedesignLayout(this.A00);
        invalidate();
    }

    public final void setIsImmersiveMode(boolean z) {
        this.A05 = z;
    }

    public final void setWysiwyg(boolean z) {
        this.A06 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotesCreationBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0B = 22.0f;
        this.A0D = AbstractC166987dD.A0X();
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1R(A0R);
        AbstractC166987dD.A1N(context, A0R, AbstractC53242c7.A02(context));
        this.A0C = A0R;
        this.A07 = AbstractC167007dF.A09(context, C1H6.A03() ? R.attr.igds_color_elevated_background : R.attr.igds_color_primary_background);
        setWillNotDraw(false);
        View A0R2 = AbstractC25226BEj.A0R(LayoutInflater.from(context), this, R.layout.notes_creation_bubble_view, false);
        this.A09 = (ConstraintLayout) A0R2.requireViewById(R.id.pog_note_bubble_root_view);
        this.A00 = (CardView) A0R2.requireViewById(R.id.pog_note_bubble_card_view);
        this.A08 = A0R2.requireViewById(R.id.bubble_nested_scroll_view);
        if (!this.A01) {
            this.A00.setRadius(AbstractC13690mv.A00(context, 22.0f));
        }
        this.A00.setLayoutTransition(new LayoutTransition());
        this.A0A = AbstractC13620mo.A02(getContext());
        addView(A0R2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotesCreationBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
