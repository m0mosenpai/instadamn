package X;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: X.6R6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6R6 extends BaseMovementMethod {
    public static C6R6 A00 = new BaseMovementMethod();

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean canSelectArbitrarily() {
        return false;
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final void initialize(TextView textView, Spannable spannable) {
        C14360o3.A0B(spannable, 1);
        Selection.removeSelection(spannable);
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        C14360o3.A0B(textView, 0);
        C14360o3.A0B(spannable, 1);
        C14360o3.A0B(motionEvent, 2);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length > 0) {
            ClickableSpan clickableSpan = clickableSpanArr[0];
            int spanStart = spannable.getSpanStart(clickableSpan);
            int spanEnd = spannable.getSpanEnd(clickableSpan);
            if (offsetForHorizontal >= spanStart && offsetForHorizontal < spanEnd && offsetForHorizontal < layout.getLineEnd(lineForVertical)) {
                ClickableSpan clickableSpan2 = clickableSpanArr[0];
                if (actionMasked == 1) {
                    clickableSpan2.onClick(textView);
                    return true;
                }
                Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan2), spannable.getSpanEnd(clickableSpanArr[0]));
                return true;
            }
        }
        Selection.removeSelection(spannable);
        return false;
    }
}
