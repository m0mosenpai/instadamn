package X;

import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.style.UnderlineSpan;
import com.instagram.ui.text.CustomUnderlineSpan;

/* renamed from: X.9RF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9RF implements SpanWatcher {
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (obj instanceof AbstractC202868y4) {
            spannable.setSpan(new UnderlineSpan(), i + 1, i2, 33);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (obj instanceof AbstractC202868y4) {
            for (CustomUnderlineSpan customUnderlineSpan : (CustomUnderlineSpan[]) spannable.getSpans(i, i2, CustomUnderlineSpan.class)) {
                spannable.removeSpan(customUnderlineSpan);
            }
        }
    }
}
