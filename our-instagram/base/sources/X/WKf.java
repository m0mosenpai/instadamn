package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.textinput.ReactTextInputManager;

/* loaded from: classes11.dex */
public final class WKf implements TextWatcher {
    public String A00 = null;
    public final int A01;
    public final X9J A02;
    public final UDV A03;
    public final /* synthetic */ ReactTextInputManager A04;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    public WKf(Q21 q21, UDV udv, ReactTextInputManager reactTextInputManager) {
        this.A04 = reactTextInputManager;
        this.A02 = UIManagerHelper.A05(q21, udv.getId());
        this.A03 = udv;
        this.A01 = UIManagerHelper.A00(q21);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Ush, X.Sb5] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        UDV udv = this.A03;
        if (!udv.A0F) {
            if (i3 == 0 && i2 == 0) {
                return;
            }
            AbstractC05810Sj.A00(this.A00);
            String substring = charSequence.toString().substring(i, i + i3);
            String substring2 = this.A00.substring(i, i + i2);
            if (i3 == i2 && substring.equals(substring2)) {
                return;
            }
            X9J x9j = this.A02;
            int i4 = this.A01;
            int id = udv.getId();
            String charSequence2 = charSequence.toString();
            int i5 = udv.A02 + 1;
            udv.A02 = i5;
            ?? sb5 = new Sb5(i4, id);
            sb5.A01 = charSequence2;
            sb5.A00 = i5;
            x9j.APn(sb5);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = charSequence.toString();
    }
}
