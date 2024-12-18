package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U9O extends LinkMovementMethod {
    public static final U9O A00 = new LinkMovementMethod();

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        View view;
        boolean A1b = AbstractC25233BEq.A1b(textView, spannable, motionEvent);
        int action = motionEvent.getAction();
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        if (layout != null) {
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), x);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            C14360o3.A0A(clickableSpanArr);
            if (clickableSpanArr.length == 0) {
                Object tag = textView.getTag(R.id.tag_span_touch_key);
                if ((tag instanceof View) && (view = (View) tag) != null) {
                    view.onTouchEvent(motionEvent);
                }
                return false;
            }
            if (action != 0) {
                if (action == A1b && textView.hasWindowFocus()) {
                    clickableSpanArr[0].onClick(textView);
                }
            }
            return A1b;
        }
        return Touch.onTouchEvent(textView, spannable, motionEvent);
    }
}
