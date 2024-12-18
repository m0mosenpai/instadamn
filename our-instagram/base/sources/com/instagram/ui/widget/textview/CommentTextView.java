package com.instagram.ui.widget.textview;

import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.C0f9;
import X.C0w9;
import X.C14360o3;
import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.common.accessibility.AccessibleTextView;

/* loaded from: classes11.dex */
public final class CommentTextView extends AccessibleTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = C0f9.A05(-1953878172);
        boolean z = false;
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - getTotalPaddingLeft();
            int totalPaddingTop = y - getTotalPaddingTop();
            int scrollX = totalPaddingLeft + getScrollX();
            int scrollY = totalPaddingTop + getScrollY();
            Layout layout = getLayout();
            if (layout == null) {
                i = 2089807832;
            } else {
                int lineForVertical = layout.getLineForVertical(scrollY);
                if (getTag() != null && (getTag() instanceof String)) {
                    C14360o3.A0C(getTag(), "null cannot be cast to non-null type kotlin.String");
                }
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
                    if (offsetForHorizontal != -1) {
                        if (getText() != null && (getText() instanceof Spannable)) {
                            CharSequence text = getText();
                            C14360o3.A0C(text, AbstractC43591JPw.A00(85));
                            if (((ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)).length != 0) {
                                z = super.onTouchEvent(motionEvent);
                                i = -184921541;
                            }
                        }
                        i = -23519700;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C0w9.A03("IgSpannableTouchHelper HorizontalMeasurementProvider crash....", message);
                }
                i = -192586435;
            }
        } else {
            z = super.onTouchEvent(motionEvent);
            i = -1597525606;
        }
        C0f9.A0C(i, A05);
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }
}
