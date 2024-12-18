package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class FBH {
    public static Dialog A00(Activity activity, DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, Integer num, String str, String str2) {
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0A(2131972135);
        A0H.A0r(AbstractC31173DnH.A0B(activity.getResources(), str, 2131972127).toString());
        A0H.A0J(new DialogInterfaceOnClickListenerC35362Fid(activity, interfaceC11380iw, abstractC12990ll, num, str2, 5), 2131972765);
        A0H.A0I(new DialogInterfaceOnClickListenerC35301Fha(14), 2131968687);
        A0H.A0g(onDismissListener);
        A0H.A08(R.drawable.instagram_lock_outline_96);
        return A0H.A02();
    }
}
