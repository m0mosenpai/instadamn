package X;

import android.view.View;
import android.widget.EditText;
import com.facebook.R;

/* renamed from: X.Jr6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44723Jr6 extends C3OO {
    public final EditText A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;
    public final View A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44723Jr6(View view, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        super(view);
        AbstractC25233BEq.A0v(1, view, interfaceC16660sJ, interfaceC16660sJ2);
        this.A01 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
        EditText editText = (EditText) AbstractC166997dE.A0R(view, R.id.muted_word_edit_text);
        this.A00 = editText;
        View A0S = AbstractC166997dE.A0S(view, R.id.muted_word_delete_button);
        this.A03 = A0S;
        editText.setImeOptions(6);
        editText.setRawInputType(1);
        editText.setOnEditorActionListener(new LRL(this, 2));
        editText.setOnFocusChangeListener(new LQ3(this, 5));
        ViewOnClickListenerC48074LPz.A01(A0S, 21, this);
    }
}
