package X;

import android.view.View;
import android.widget.EditText;

/* renamed from: X.9Uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210989Uv extends C3OO {
    public C211859aC A00;
    public final EditText A01;
    public final A5W A02;
    public final View.OnFocusChangeListener A03;
    public final C23188APk A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210989Uv(EditText editText, A5W a5w) {
        super(editText);
        C14360o3.A0B(editText, 1);
        this.A01 = editText;
        this.A02 = a5w;
        C23188APk c23188APk = new C23188APk(this);
        this.A04 = c23188APk;
        View.OnFocusChangeListener viewOnFocusChangeListenerC23253ASo = new ViewOnFocusChangeListenerC23253ASo(this, 1);
        this.A03 = viewOnFocusChangeListenerC23253ASo;
        editText.addTextChangedListener(c23188APk);
        editText.setOnFocusChangeListener(viewOnFocusChangeListenerC23253ASo);
        editText.setOnEditorActionListener(new C35754Fqr(this, 2));
    }
}
