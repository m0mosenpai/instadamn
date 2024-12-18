package X;

import android.view.KeyEvent;
import com.facebook.primitive.textinput.TextInputView;

/* loaded from: classes5.dex */
public abstract class CC1 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            int A0D = AbstractC25230BEn.A0D(c6fw.A02(), AbstractC111324zv.A00(38));
            BX7 bx7 = (BX7) AnonymousClass634.A06(c6fg, c102884kP);
            if (bx7 != null) {
                AbstractC79383gk.A02(null);
                TextInputView textInputView = bx7.A02;
                if (textInputView != null) {
                    for (int i = 0; i < A0D; i++) {
                        textInputView.dispatchKeyEvent(new KeyEvent(0, 67));
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
