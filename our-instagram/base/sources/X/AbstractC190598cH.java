package X;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8cH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC190598cH extends C2UU implements TextWatcher {
    public boolean A01;
    public List A00 = new ArrayList();
    public final C8SI A02 = new C8SI(0);
    public final List A03 = new ArrayList();

    public void A02(CharSequence charSequence) {
        this.A01 = false;
        InterfaceC169517hR interfaceC169517hR = ((C190588cG) this).A05;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.Eby(charSequence.toString());
        }
    }

    public void A03(List list) {
        this.A01 = true;
        this.A00 = list;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        List list = this.A03;
        list.clear();
        for (C202858y3 c202858y3 : (C202858y3[]) C4GL.A06(editable, C202858y3.class)) {
            int spanStart = editable.getSpanStart(c202858y3);
            int spanEnd = editable.getSpanEnd(c202858y3);
            User user = c202858y3.A00;
            String username = user.getUsername();
            CharSequence subSequence = editable.subSequence(spanStart + 1, spanEnd);
            C14360o3.A0C(subSequence, "null cannot be cast to non-null type android.text.Spanned");
            if (!A2U.A00((Spanned) subSequence, username)) {
                editable.removeSpan(c202858y3);
            } else {
                list.add(user);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 0);
        if (i3 >= 1) {
            int i4 = i3 + i;
            for (int i5 = i; i5 < i4; i5++) {
                if (charSequence.charAt(i5) != ' ') {
                    return;
                }
            }
            int i6 = i - 1;
            for (int i7 = i6; -1 < i7 && charSequence.charAt(i7) != ' '; i7--) {
                if (charSequence.charAt(i7) == '@') {
                    String obj = charSequence.subSequence(i7 + 1, i6 + 1).toString();
                    if (obj != null && this.A03.size() < 20) {
                        int size = this.A00.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            User user = (User) this.A00.get(i8);
                            if (C14360o3.A0K(user.getUsername(), obj)) {
                                ((C190588cG) this).A00.DSl(user, i8);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void A01() {
        if (this.A01) {
            this.A00.clear();
        }
        this.A01 = false;
        InterfaceC169517hR interfaceC169517hR = ((C190588cG) this).A05;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.Eby("".toString());
        }
    }
}
