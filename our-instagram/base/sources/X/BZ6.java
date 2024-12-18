package X;

import android.graphics.Rect;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class BZ6 extends EditText implements TextView.OnEditorActionListener {
    public int A00;
    public TextWatcher A01;
    public C2XE A02;
    public C2V9 A03;
    public AtomicReference A04;

    @Override // android.widget.TextView, android.view.View
    public final int getAutofillType() {
        return super.getAutofillType();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = C0f9.A06(1734246623);
        super.onFocusChanged(z, i, rect);
        C0f9.A0D(370676787, A06);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int A06 = C0f9.A06(1223443170);
        super.onMeasure(i, i2);
        this.A00 = getLineCount();
        C0f9.A0D(-426897255, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.CQ1, java.lang.Object] */
    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C2XE c2xe;
        super.onTextChanged(charSequence, i, i2, i3);
        AtomicReference atomicReference = this.A04;
        if (atomicReference != null) {
            atomicReference.set(charSequence);
        }
        C2V9 c2v9 = this.A03;
        if (c2v9 != 0) {
            String charSequence2 = charSequence.toString();
            ?? obj = new Object();
            obj.A00 = this;
            obj.A01 = charSequence2;
            c2v9.A00(obj);
        }
        int lineCount = getLineCount();
        int i4 = this.A00;
        if (i4 != -1 && i4 != lineCount && (c2xe = this.A02) != null && c2xe.A01 != null) {
            c2xe.A0C(new C125975mo(new Object[0], 0), "updateState:TextInput.remeasureForUpdatedText");
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }
}
