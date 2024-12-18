package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.direct.stella.permission.StellaPermissionActivity;

/* renamed from: X.FiL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35344FiL implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public DialogInterfaceOnClickListenerC35344FiL(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C8Y6.A02((C8Y6) this.A01, this.A03, this.A02);
                return;
            case 1:
                Activity activity = (Activity) this.A01;
                String str = this.A03;
                String str2 = this.A02;
                C08610cP c08610cP = StellaPermissionActivity.A01;
                AbstractC53968Ntf.A00(str, str2);
                AbstractC31180DnO.A0y(activity, AbstractC31171DnF.A04());
                return;
            default:
                EVQ evq = (EVQ) this.A01;
                String str3 = this.A02;
                AbstractC31176DnK.A11(evq.A04, evq.A08, AbstractC31171DnF.A0R(str3), this.A03);
                return;
        }
    }
}
