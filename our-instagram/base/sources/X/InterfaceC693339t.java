package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: X.39t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC693339t {
    boolean A8N(Spannable spannable, int i);

    boolean A8O(Spannable spannable, int i, int i2, int i3);

    boolean A8P(Spannable spannable, int i, boolean z);

    InputConnection AMO(EditorInfo editorInfo, InputConnection inputConnection, EditText editText);

    KeyListener AMS(KeyListener keyListener, EditText editText);

    Drawable B1H(String str, int i);

    Typeface B7d(String str);

    void CNc(Context context, AbstractC12990ll abstractC12990ll, int i);

    boolean CTj();

    CharSequence Cny(int i, CharSequence charSequence);
}
