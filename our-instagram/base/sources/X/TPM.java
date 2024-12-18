package X;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.widget.TextView;
import java.util.Collection;
import java.util.List;

/* loaded from: classes10.dex */
public final class TPM implements Runnable {
    public final int A00;
    public final Throwable A01;
    public final List A02;

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A02;
        int size = list.size();
        int i = 0;
        if (this.A00 != 1) {
            while (i < size) {
                AbstractC61272Rki abstractC61272Rki = (AbstractC61272Rki) list.get(i);
                Throwable th = this.A01;
                if (abstractC61272Rki instanceof Q7Y) {
                    Q7Y q7y = (Q7Y) abstractC61272Rki;
                    if (th != null) {
                        C0K8.A0O("EmojiCompatImpl", "EmojiCompat initialization failed", th.getLocalizedMessage());
                        C2UW.A00(q7y.A00, -1L, false);
                    }
                }
                i++;
            }
            return;
        }
        while (i < size) {
            AbstractC61272Rki abstractC61272Rki2 = (AbstractC61272Rki) list.get(i);
            if (abstractC61272Rki2 instanceof Q7Y) {
                Q7Y q7y2 = (Q7Y) abstractC61272Rki2;
                TG8.A01 = true;
                long currentTimeMillis = System.currentTimeMillis() - TG8.A00;
                if (currentTimeMillis >= 0) {
                    C2UW.A00(q7y2.A00, currentTimeMillis, true);
                }
                new Handler(C1CG.A00()).post(new TJ2());
            } else {
                TextView textView = (TextView) ((Q7X) abstractC61272Rki2).A00.get();
                if (textView != null && textView.isAttachedToWindow()) {
                    Editable editableText = textView.getEditableText();
                    int selectionStart = Selection.getSelectionStart(editableText);
                    int selectionEnd = Selection.getSelectionEnd(editableText);
                    C63218SfO.A00().A02(editableText);
                    if (selectionStart >= 0) {
                        if (selectionEnd >= 0) {
                            Selection.setSelection(editableText, selectionStart, selectionEnd);
                        } else {
                            Selection.setSelection(editableText, selectionStart);
                        }
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(editableText, selectionEnd);
                    }
                }
            }
            i++;
        }
    }

    public TPM(Throwable th, Collection collection, int i) {
        C02R.A03(collection, "initCallbacks cannot be null");
        this.A02 = AbstractC166987dD.A1F(collection);
        this.A00 = i;
        this.A01 = th;
    }
}
