package X;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;

/* renamed from: X.6We, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140266We implements TextWatcher {
    public final InterfaceC693339t A00;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            int i4 = i + i2;
            AnonymousClass564[] anonymousClass564Arr = (AnonymousClass564[]) spannable.getSpans(i, i4, AnonymousClass564.class);
            int length = anonymousClass564Arr.length;
            if (length != 0) {
                int i5 = i;
                int i6 = i4;
                int i7 = 0;
                do {
                    AnonymousClass564 anonymousClass564 = anonymousClass564Arr[i7];
                    int spanStart = spannable.getSpanStart(anonymousClass564);
                    if (spanStart >= 0 && spanStart < i5) {
                        i5 = spanStart;
                    }
                    i6 = Math.max(i6, spannable.getSpanEnd(anonymousClass564));
                    spannable.removeSpan(anonymousClass564);
                    i7++;
                } while (i7 < length);
                if (i5 < i) {
                    int i8 = i - i5;
                    InterfaceC693339t interfaceC693339t = this.A00;
                    if (interfaceC693339t != null) {
                        interfaceC693339t.A8O(spannable, -1, i5, i8);
                    }
                }
                if (i4 < i6) {
                    int i9 = i6 - i4;
                    InterfaceC693339t interfaceC693339t2 = this.A00;
                    if (interfaceC693339t2 != null) {
                        interfaceC693339t2.A8O(spannable, -1, i4, i9);
                    }
                }
            }
            if (i2 != 0) {
                for (Q41 q41 : (Q41[]) spannable.getSpans(i, i4, Q41.class)) {
                    spannable.removeSpan(q41);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        InterfaceC693339t interfaceC693339t;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            if (i3 >= 1 && (interfaceC693339t = this.A00) != null) {
                interfaceC693339t.A8O(spannable, -1, i, i3);
            }
        }
    }

    public C140266We(InterfaceC693339t interfaceC693339t) {
        this.A00 = interfaceC693339t;
    }

    public C140266We() {
    }
}
