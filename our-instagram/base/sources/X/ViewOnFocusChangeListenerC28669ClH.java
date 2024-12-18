package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.ClH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnFocusChangeListenerC28669ClH implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public ViewOnFocusChangeListenerC28669ClH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        InterfaceC16820sZ interfaceC16820sZ;
        switch (this.A00) {
            case 0:
                if (!(view instanceof TextInputView)) {
                    return;
                }
                if (z) {
                    TextView textView = (TextView) view;
                    BX7 bx7 = (BX7) this.A01;
                    C14360o3.A0B(textView, 0);
                    KeyListener keyListener = bx7.A00;
                    if (keyListener == null) {
                        C44246Jgq c44246Jgq = bx7.A03;
                        if (c44246Jgq != null) {
                            keyListener = c44246Jgq.A0H;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    if (textView.getKeyListener() == keyListener && textView.getEllipsize() == null) {
                        return;
                    }
                    textView.setKeyListener(keyListener);
                    textView.setEllipsize(null);
                    textView.getExtendedPaddingTop();
                    textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC55503Okw(textView, 0));
                    return;
                }
                TextInputView textInputView = (TextInputView) view;
                if (textInputView.getEllipsize() != null || !AbstractC25696BXg.A00.A04(textInputView) || !BXE.A03(textInputView)) {
                    return;
                }
                BXE.A00(TextUtils.TruncateAt.END, (BX7) this.A01, textInputView);
                return;
            case 1:
                if (!z) {
                    return;
                }
                Object systemService = ((Context) this.A01).getSystemService("input_method");
                C14360o3.A0C(systemService, MSV.A00(8));
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            default:
                BX4 bx4 = (BX4) this.A01;
                if (z) {
                    interfaceC16820sZ = bx4.A0M;
                } else {
                    interfaceC16820sZ = bx4.A0N;
                }
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                    return;
                }
                return;
        }
    }
}
