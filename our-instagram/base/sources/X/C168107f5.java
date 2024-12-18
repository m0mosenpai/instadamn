package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.ArrayList;

/* renamed from: X.7f5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168107f5 implements TextWatcher {
    public ForegroundColorSpan[] A00 = new ForegroundColorSpan[0];
    public final InterfaceC168097f4 A01;

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Editable text;
        ComposerAutoCompleteTextView AeD = this.A01.AeD();
        if (AeD != null && (text = AeD.getText()) != null) {
            for (ForegroundColorSpan foregroundColorSpan : this.A00) {
                int spanStart = text.getSpanStart(foregroundColorSpan);
                int spanEnd = text.getSpanEnd(foregroundColorSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    text.removeSpan(foregroundColorSpan);
                    text.delete(spanStart, spanEnd);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ForegroundColorSpan[] foregroundColorSpanArr;
        ComposerAutoCompleteTextView AeD = this.A01.AeD();
        if (charSequence != null && AeD != null) {
            if (i3 < i2 && Character.isWhitespace(charSequence.charAt(i))) {
                int selectionEnd = AeD.getSelectionEnd();
                Editable text = AeD.getText();
                C14360o3.A07(text);
                ForegroundColorSpan[] foregroundColorSpanArr2 = (ForegroundColorSpan[]) text.getSpans(selectionEnd, selectionEnd, ForegroundColorSpan.class);
                int i4 = -1;
                C14360o3.A0A(foregroundColorSpanArr2);
                ArrayList arrayList = new ArrayList();
                int length = foregroundColorSpanArr2.length;
                int i5 = 0;
                while (i5 < length) {
                    ForegroundColorSpan foregroundColorSpan = foregroundColorSpanArr2[i5];
                    int spanStart = text.getSpanStart(foregroundColorSpan);
                    int spanEnd = text.getSpanEnd(foregroundColorSpan);
                    if (spanStart <= i4) {
                        spanEnd = i4;
                    } else {
                        arrayList.add(foregroundColorSpan);
                    }
                    i5++;
                    i4 = spanEnd;
                }
                foregroundColorSpanArr = (ForegroundColorSpan[]) arrayList.toArray(new ForegroundColorSpan[0]);
            } else {
                foregroundColorSpanArr = new ForegroundColorSpan[0];
            }
            this.A00 = foregroundColorSpanArr;
        }
    }

    public C168107f5(InterfaceC168097f4 interfaceC168097f4) {
        this.A01 = interfaceC168097f4;
    }
}
