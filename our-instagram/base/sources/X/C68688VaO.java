package X;

import android.text.Spannable;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VaO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68688VaO {
    public final List A00;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.VjP, java.lang.Object] */
    public C68688VaO(Spannable spannable, ClickableSpan[] clickableSpanArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = clickableSpanArr.length;
            if (i < length) {
                ClickableSpan clickableSpan = clickableSpanArr[i];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                    ?? obj = new Object();
                    obj.A03 = spannable.subSequence(spanStart, spanEnd).toString();
                    obj.A02 = spanStart;
                    obj.A00 = spanEnd;
                    obj.A01 = (length - 1) - i;
                    arrayList.add(obj);
                }
                i++;
            } else {
                this.A00 = arrayList;
                return;
            }
        }
    }
}
