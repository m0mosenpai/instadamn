package X;

import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.CKu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27727CKu {
    public static final void A00(SpannableString spannableString, View view, C76223bS c76223bS, C51762Yz c51762Yz, InterfaceC16820sZ interfaceC16820sZ) {
        ColorDrawable A0G = AbstractC25225BEi.A0G(-1);
        A0G.setAlpha(0);
        ((PopupWindow) c51762Yz.A03).setBackgroundDrawable(A0G);
        AbstractC77313dH.A00(c76223bS, new D8Y(spannableString, view, c76223bS, c51762Yz, interfaceC16820sZ), AbstractC25228BEl.A1b(false));
    }
}
