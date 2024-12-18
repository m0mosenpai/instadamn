package X;

import android.app.Dialog;
import android.content.Context;

/* loaded from: classes6.dex */
public final class FPL {
    public Dialog A00;

    public final void A00(Context context, InterfaceC37198Ga9 interfaceC37198Ga9, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0k(context.getDrawable(i));
        A0I.A05 = str;
        A0I.A0d(DialogInterfaceOnClickListenerC35453FkA.A00(interfaceC37198Ga9, 14), str4);
        A0I.A0c(DialogInterfaceOnClickListenerC35453FkA.A00(interfaceC37198Ga9, 15), str5);
        A0I.A0s(z);
        DialogInterfaceOnCancelListenerC35300FhZ.A00(A0I, interfaceC37198Ga9, 5);
        if (str3 != null) {
            A0I.A0a(DialogInterfaceOnClickListenerC35453FkA.A00(interfaceC37198Ga9, 13), str2, str3);
        } else {
            A0I.A0r(str2);
        }
        Dialog A02 = A0I.A02();
        this.A00 = A02;
        if (A02 == null) {
            C14360o3.A0F("dialog");
            throw C00O.createAndThrow();
        }
        C0fJ.A00(A02);
    }
}
