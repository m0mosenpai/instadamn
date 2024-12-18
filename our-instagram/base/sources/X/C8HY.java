package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.services.uicontrol.instagram.RawTextInputView;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.8HY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HY implements InterfaceC150426pr, InterfaceC150406pp, C8HZ {
    public InterfaceC203868zv A00;
    public RawTextInputView A01;
    public BCV A02;
    public String A03 = null;
    public IgLinearLayout A04;
    public final InputMethodManager A05;

    @Override // X.InterfaceC150426pr
    public final void DDs(BCV bcv, String str) {
        this.A00 = null;
        this.A02 = bcv;
        RawTextInputView rawTextInputView = this.A01;
        rawTextInputView.setText(str);
        rawTextInputView.setVisibility(0);
        rawTextInputView.setEnabled(true);
        rawTextInputView.setFocusable(true);
        rawTextInputView.setFocusableInTouchMode(true);
        rawTextInputView.setSelection(rawTextInputView.getText().length());
        rawTextInputView.bringToFront();
        rawTextInputView.requestFocus();
        rawTextInputView.A05 = true;
        rawTextInputView.post(new RunnableC24260ApR(rawTextInputView));
    }

    @Override // X.InterfaceC150406pp
    public final void DDw(C22908A8d c22908A8d, InterfaceC203868zv interfaceC203868zv) {
        this.A02 = null;
        this.A00 = interfaceC203868zv;
        RawTextInputView rawTextInputView = this.A01;
        if (rawTextInputView != null) {
            this.A04.setVisibility(0);
            String str = c22908A8d.A02;
            this.A03 = str;
            rawTextInputView.setText(str);
            rawTextInputView.setVisibility(0);
            rawTextInputView.setEnabled(true);
            rawTextInputView.setFocusable(true);
            rawTextInputView.setFocusableInTouchMode(true);
            rawTextInputView.setSelection(rawTextInputView.getText().length());
            rawTextInputView.bringToFront();
            rawTextInputView.requestFocus();
            InputMethodManager inputMethodManager = this.A05;
            inputMethodManager.getClass();
            if (!inputMethodManager.showSoftInput(rawTextInputView, 2)) {
                inputMethodManager.toggleSoftInput(2, 0);
                inputMethodManager.showSoftInput(rawTextInputView, 2);
            }
        }
    }

    public static void A00(C8HY c8hy) {
        RawTextInputView rawTextInputView = c8hy.A01;
        if (rawTextInputView != null) {
            rawTextInputView.setEnabled(false);
            rawTextInputView.clearFocus();
            rawTextInputView.setFocusable(false);
            rawTextInputView.setFocusableInTouchMode(false);
            rawTextInputView.setVisibility(8);
            InputMethodManager inputMethodManager = c8hy.A05;
            inputMethodManager.getClass();
            inputMethodManager.hideSoftInputFromWindow(rawTextInputView.getWindowToken(), 0);
            if (c8hy.A02 != null) {
                c8hy.A02 = null;
            }
            c8hy.A04.setVisibility(8);
        }
    }

    @Override // X.InterfaceC150426pr
    public final void DEu() {
        this.A01.A01();
    }

    public C8HY(ViewGroup viewGroup) {
        this.A01 = (RawTextInputView) viewGroup.requireViewById(R.id.hidden_edit_text_view);
        View requireViewById = viewGroup.requireViewById(R.id.text_edit_cancel_button);
        this.A04 = (IgLinearLayout) viewGroup.requireViewById(R.id.edit_text_layout);
        this.A01.A02 = this;
        this.A05 = (InputMethodManager) viewGroup.getContext().getSystemService("input_method");
        this.A01.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.8Ha
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                String str;
                if (i == 6) {
                    C8HY c8hy = C8HY.this;
                    BCV bcv = c8hy.A02;
                    if (bcv != null) {
                        bcv.onExit();
                        c8hy.A02 = null;
                    }
                    RawTextInputView rawTextInputView = c8hy.A01;
                    if (rawTextInputView == null || (str = rawTextInputView.getText().toString()) == null) {
                        str = "";
                    }
                    InterfaceC203868zv interfaceC203868zv = c8hy.A00;
                    if (interfaceC203868zv != null) {
                        interfaceC203868zv.onTextEditComplete(str);
                    }
                    c8hy.A00 = null;
                    C8HY.A00(c8hy);
                    return false;
                }
                return false;
            }
        });
        C0fQ.A00(new View.OnClickListener() { // from class: X.8Hb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1018258201);
                C8HY c8hy = C8HY.this;
                String str = c8hy.A03;
                if (str != null) {
                    InterfaceC203868zv interfaceC203868zv = c8hy.A00;
                    if (interfaceC203868zv != null) {
                        interfaceC203868zv.onTextEditComplete(str);
                    }
                    c8hy.A00 = null;
                }
                C8HY.A00(c8hy);
                C0f9.A0C(-1580810426, A05);
            }
        }, requireViewById);
    }
}
