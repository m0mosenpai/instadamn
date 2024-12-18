package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes10.dex */
public final class TG7 implements InterfaceC693339t {
    @Override // X.InterfaceC693339t
    public final boolean A8N(Spannable spannable, int i) {
        return false;
    }

    @Override // X.InterfaceC693339t
    public final boolean A8O(Spannable spannable, int i, int i2, int i3) {
        return false;
    }

    @Override // X.InterfaceC693339t
    public final boolean A8P(Spannable spannable, int i, boolean z) {
        return false;
    }

    @Override // X.InterfaceC693339t
    public final InputConnection AMO(EditorInfo editorInfo, InputConnection inputConnection, EditText editText) {
        return inputConnection;
    }

    @Override // X.InterfaceC693339t
    public final KeyListener AMS(KeyListener keyListener, EditText editText) {
        return keyListener;
    }

    @Override // X.InterfaceC693339t
    public final Drawable B1H(String str, int i) {
        return null;
    }

    @Override // X.InterfaceC693339t
    public final Typeface B7d(String str) {
        return null;
    }

    @Override // X.InterfaceC693339t
    public final void CNc(Context context, AbstractC12990ll abstractC12990ll, int i) {
    }

    @Override // X.InterfaceC693339t
    public final boolean CTj() {
        return true;
    }

    @Override // X.InterfaceC693339t
    public final CharSequence Cny(int i, CharSequence charSequence) {
        return charSequence;
    }
}
