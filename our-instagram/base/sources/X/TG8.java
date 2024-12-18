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
public final class TG8 implements InterfaceC693339t {
    public static long A00;
    public static boolean A01;

    @Override // X.InterfaceC693339t
    public final boolean A8N(Spannable spannable, int i) {
        A00(spannable, 0, -1);
        return true;
    }

    @Override // X.InterfaceC693339t
    public final boolean A8P(Spannable spannable, int i, boolean z) {
        A00(spannable, 0, -1);
        return true;
    }

    @Override // X.InterfaceC693339t
    public final Drawable B1H(String str, int i) {
        Typeface typeface = AnonymousClass561.A00;
        if (AbstractC168797gD.A02(str) && typeface != null) {
            return new Q2J(typeface, str, i);
        }
        return null;
    }

    @Override // X.InterfaceC693339t
    public final boolean CTj() {
        if (A01 && AnonymousClass561.A00 != null) {
            return true;
        }
        return false;
    }

    public final void A00(Spannable spannable, int i, int i2) {
        if (CTj()) {
            int length = spannable.length();
            if (i2 != -1) {
                length = i + i2;
            }
            C63218SfO.A00().A03(spannable, i, length, Integer.MAX_VALUE, 0);
        }
    }

    @Override // X.InterfaceC693339t
    public final boolean A8O(Spannable spannable, int i, int i2, int i3) {
        A00(spannable, i2, i3);
        return true;
    }

    @Override // X.InterfaceC693339t
    public final InputConnection AMO(EditorInfo editorInfo, InputConnection inputConnection, EditText editText) {
        if (CTj()) {
            editText.addTextChangedListener(new C140266We(this));
        }
        return inputConnection;
    }

    @Override // X.InterfaceC693339t
    public final KeyListener AMS(KeyListener keyListener, EditText editText) {
        if (CTj()) {
            editText.addTextChangedListener(new C140266We(this));
        }
        return keyListener;
    }

    @Override // X.InterfaceC693339t
    public final Typeface B7d(String str) {
        int length = str.length();
        C46y c46y = C46x.A00;
        if (c46y != null && c46y.A01(str, 0, length) == length) {
            return AnonymousClass561.A00;
        }
        return null;
    }

    @Override // X.InterfaceC693339t
    public final void CNc(Context context, AbstractC12990ll abstractC12990ll, int i) {
        A00 = System.currentTimeMillis();
        C63604SqC c63604SqC = new C63604SqC(context, AnonymousClass561.A00(context), AbstractC62292S5n.A00);
        Q7Y q7y = new Q7Y(abstractC12990ll);
        C012504o c012504o = new C012504o(0);
        c012504o.add(q7y);
        if (C63218SfO.A07 == null) {
            synchronized (C63218SfO.A06) {
                if (C63218SfO.A07 == null) {
                    C63218SfO.A07 = new C63218SfO(c63604SqC, c012504o);
                }
            }
        }
    }

    @Override // X.InterfaceC693339t
    public final CharSequence Cny(int i, CharSequence charSequence) {
        if (CTj() && C693239s.A00(charSequence, 0, charSequence.length())) {
            return C63218SfO.A00().A02(charSequence);
        }
        return charSequence;
    }
}
