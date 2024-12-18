package X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.4ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC106874ro extends AbstractC106884rp implements Runnable {
    public final Reference A00;
    public final Reference A01;

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.A00.get();
        Object obj = this.A01.get();
        if (obj != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter : filters) {
                if (inputFilter == obj) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        C58341Ptc A00 = C58341Ptc.A00();
                        if (text == null) {
                            length = 0;
                        } else {
                            length = text.length();
                        }
                        CharSequence A02 = A00.A02(text, 0, length);
                        if (text != A02) {
                            int selectionStart = Selection.getSelectionStart(A02);
                            int selectionEnd = Selection.getSelectionEnd(A02);
                            textView.setText(A02);
                            if (A02 instanceof Spannable) {
                                Spannable spannable = (Spannable) A02;
                                if (selectionStart >= 0) {
                                    if (selectionEnd >= 0) {
                                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                                        return;
                                    } else {
                                        Selection.setSelection(spannable, selectionStart);
                                        return;
                                    }
                                }
                                if (selectionEnd < 0) {
                                    return;
                                }
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public RunnableC106874ro(TextView textView, C3WP c3wp) {
        this.A00 = new WeakReference(textView);
        this.A01 = new WeakReference(c3wp);
    }
}
