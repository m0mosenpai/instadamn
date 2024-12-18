package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.F0a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34021F0a {
    public static final void A00(Context context, boolean z) {
        int i;
        DialogInterface.OnClickListener onClickListener;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        if (z) {
            A0I.A0A(2131954407);
            AbstractC31173DnH.A16(context, A0I, 2131954405);
            i = 2131954403;
            onClickListener = DialogInterfaceOnClickListenerC35388Fj3.A00;
        } else {
            A0I.A0A(2131954406);
            AbstractC31173DnH.A16(context, A0I, 2131954404);
            i = 2131954403;
            onClickListener = DialogInterfaceOnClickListenerC35389Fj4.A00;
        }
        AbstractC31176DnK.A17(onClickListener, A0I, i);
    }
}
