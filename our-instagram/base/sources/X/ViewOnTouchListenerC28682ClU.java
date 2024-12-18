package X;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.ClU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC28682ClU implements View.OnTouchListener {
    public boolean A00;
    public final /* synthetic */ View.OnTouchListener A01;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
        TextView textView = (TextView) view;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return false;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) motionEvent.getY()), motionEvent.getX());
        if (textView.getText() instanceof Spanned) {
            CharSequence text = textView.getText();
            C14360o3.A0C(text, AbstractC111324zv.A00(2773));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (motionEvent.getAction() == 0) {
                if (clickableSpanArr.length > 0) {
                    this.A00 = A1R;
                    return false;
                }
                this.A00 = false;
            } else if (this.A00) {
                return false;
            }
        }
        return this.A01.onTouch(view, motionEvent);
    }

    public ViewOnTouchListenerC28682ClU(View.OnTouchListener onTouchListener) {
        this.A01 = onTouchListener;
    }
}
