package X;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes9.dex */
public final class OI7 {
    public final Context A00;
    public final InterfaceC19630xq A01;

    public final Dialog A00(InterfaceC16820sZ interfaceC16820sZ) {
        Context context = this.A00;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0s(true);
        A0I.A0t(true);
        A0I.A05 = AbstractC166997dE.A0p(context, 2131967902);
        A0I.A0r(AbstractC166997dE.A0p(context, 2131963308));
        A0I.A0K(DialogInterfaceOnClickListenerC55321Ogj.A00(interfaceC16820sZ, this, 47), 2131956794);
        A0I.A06();
        return A0I.A02();
    }

    public OI7(Context context) {
        this.A00 = context;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        C14360o3.A07(defaultSharedPreferences);
        this.A01 = new C17320tT(defaultSharedPreferences, "RtcEffectPermissionDialogHelper");
    }
}
