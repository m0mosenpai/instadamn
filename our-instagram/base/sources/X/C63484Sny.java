package X;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Sny, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63484Sny implements TextWatcher, SpanWatcher {
    public final Object A00;
    public final AtomicInteger A01 = AbstractC58319PtB.A16();

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.A00).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.A00).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.A01.get() > 0 && (obj instanceof AbstractC1343865k)) {
            return;
        }
        ((SpanWatcher) this.A00).onSpanAdded(spannable, obj, i, i2);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.A01.get() > 0 && (obj instanceof AbstractC1343865k)) {
            return;
        }
        ((SpanWatcher) this.A00).onSpanChanged(spannable, obj, i, i2, i3, i4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.A01.get() > 0 && (obj instanceof AbstractC1343865k)) {
            return;
        }
        ((SpanWatcher) this.A00).onSpanRemoved(spannable, obj, i, i2);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.A00).onTextChanged(charSequence, i, i2, i3);
    }

    public C63484Sny(Object obj) {
        this.A00 = obj;
    }
}
