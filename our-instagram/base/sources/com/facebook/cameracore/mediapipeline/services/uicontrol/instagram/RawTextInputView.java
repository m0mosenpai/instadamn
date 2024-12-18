package com.facebook.cameracore.mediapipeline.services.uicontrol.instagram;

import X.BCV;
import X.C65C;
import X.C65D;
import X.C65E;
import X.C65G;
import X.C65H;
import X.C8HY;
import X.C8HZ;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.cameracore.mediapipeline.services.uicontrol.instagram.RawTextInputView;

/* loaded from: classes3.dex */
public class RawTextInputView extends EditText {
    public InputMethodManager A00;
    public C65H A01;
    public C8HZ A02;
    public C65E A03;
    public C65D A04;
    public boolean A05;

    private void A00(Context context) {
        setInputType(16385);
        setSingleLine();
        setEnabled(false);
        setVisibility(8);
        setImeOptions(6);
        setTextInteractionListener(new C65C(this));
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.65F
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                    RawTextInputView.this.A01();
                    return false;
                }
                return false;
            }
        });
        this.A01 = new C65G(this);
        this.A00 = (InputMethodManager) context.getSystemService("input_method");
    }

    public final void A01() {
        C8HY c8hy;
        BCV bcv;
        if (this.A05) {
            this.A05 = false;
            C8HZ c8hz = this.A02;
            if (c8hz != null && (bcv = (c8hy = (C8HY) c8hz).A02) != null) {
                bcv.onExit();
                c8hy.A02 = null;
            }
            setEnabled(false);
            clearFocus();
            setFocusable(false);
            setFocusableInTouchMode(false);
            setVisibility(8);
            this.A00.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.65E, android.text.TextWatcher] */
    public void setTextInteractionListener(C65D c65d) {
        C65E c65e = this.A03;
        if (c65d == null) {
            if (c65e != null) {
                removeTextChangedListener(c65e);
                this.A03 = null;
            }
        } else if (c65e == null) {
            ?? r0 = new TextWatcher() { // from class: X.65E
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    C8HZ c8hz;
                    C65D c65d2 = RawTextInputView.this.A04;
                    if (c65d2 != null && (c8hz = ((C65C) c65d2).A00.A02) != null) {
                        String charSequence2 = charSequence.toString();
                        BCV bcv = ((C8HY) c8hz).A02;
                        if (bcv != null) {
                            bcv.onTextChanged(charSequence2);
                        }
                    }
                }
            };
            this.A03 = r0;
            addTextChangedListener(r0);
        }
        this.A04 = c65d;
    }

    public RawTextInputView(Context context) {
        super(context);
        A00(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        getImeOptions();
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            return new InputConnectionWrapper(onCreateInputConnection) { // from class: X.9TZ
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public final boolean sendKeyEvent(KeyEvent keyEvent) {
                    C65H c65h;
                    if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && (c65h = this.A01) != null) {
                        RawTextInputView rawTextInputView = ((C65G) c65h).A00;
                        Editable text = rawTextInputView.getText();
                        int max = Math.max(text.length() - 1, 0);
                        CharSequence subSequence = text.subSequence(0, max);
                        rawTextInputView.setText(subSequence);
                        rawTextInputView.setSelection(max);
                        C8HZ c8hz = rawTextInputView.A02;
                        if (c8hz != null) {
                            String charSequence = subSequence.toString();
                            BCV bcv = ((C8HY) c8hz).A02;
                            if (bcv != null) {
                                bcv.onTextChanged(charSequence);
                            }
                        }
                    }
                    return super.sendKeyEvent(keyEvent);
                }
            };
        }
        return onCreateInputConnection;
    }

    public void setOnDeleteKeyListener(C65H c65h) {
        this.A01 = c65h;
    }

    public void setRawTextInputListener(C8HZ c8hz) {
        this.A02 = c8hz;
    }

    public RawTextInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    public RawTextInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
