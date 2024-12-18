package X;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.Sq2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63595Sq2 implements C03M {
    @Override // X.C03M
    public final C006302d Dd9(View view, C006302d c006302d) {
        CharSequence coerceToStyledText;
        android.util.Log.isLoggable("ReceiveContent", 3);
        InterfaceC006202c interfaceC006202c = c006302d.A00;
        if (interfaceC006202c.Byc() != 2) {
            ClipData Ao3 = interfaceC006202c.Ao3();
            int B6x = interfaceC006202c.B6x();
            TextView textView = (TextView) view;
            Editable editable = (Editable) textView.getText();
            Context context = textView.getContext();
            boolean z = false;
            for (int i = 0; i < Ao3.getItemCount(); i++) {
                ClipData.Item itemAt = Ao3.getItemAt(i);
                if ((B6x & 1) != 0) {
                    coerceToStyledText = itemAt.coerceToText(context);
                    if (coerceToStyledText instanceof Spanned) {
                        coerceToStyledText = coerceToStyledText.toString();
                    }
                } else {
                    coerceToStyledText = itemAt.coerceToStyledText(context);
                }
                if (coerceToStyledText != null) {
                    if (!z) {
                        int selectionStart = Selection.getSelectionStart(editable);
                        int selectionEnd = Selection.getSelectionEnd(editable);
                        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                        Selection.setSelection(editable, max2);
                        editable.replace(max, max2, coerceToStyledText);
                        z = true;
                    } else {
                        editable.insert(Selection.getSelectionEnd(editable), "\n");
                        editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                    }
                }
            }
            return null;
        }
        return c006302d;
    }
}
