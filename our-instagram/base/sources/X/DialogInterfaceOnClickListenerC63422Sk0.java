package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.webkit.GeolocationPermissions;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Sk0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnClickListenerC63422Sk0 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public DialogInterfaceOnClickListenerC63422Sk0(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        QEC qec;
        Activity activity;
        switch (this.A00) {
            case 0:
                ((GeolocationPermissions.Callback) this.A02).invoke(this.A03, false, false);
                return;
            case 1:
                ((GeolocationPermissions.Callback) this.A02).invoke(this.A03, true, false);
                return;
            case 2:
                QEC qec2 = (QEC) this.A02;
                W39 w39 = (W39) this.A01;
                String str = this.A03;
                qec2.A0D = AbstractC25227BEk.A0p();
                qec2.A00 = qec2.A0H(null, w39, C05F.A01, null, null, null, str);
                qec = qec2;
                break;
            case 3:
                QEE qee = (QEE) this.A02;
                W39 w392 = (W39) this.A01;
                String str2 = this.A03;
                qee.A0G = AbstractC25227BEk.A0p();
                qee.A00 = qee.A0H(null, w392, C05F.A01, null, null, null, null, str2);
                qec = qee;
                break;
            case 4:
                C64480TFq c64480TFq = (C64480TFq) this.A02;
                C64480TFq.A01(c64480TFq, "ctc_confirmation_dialog_call");
                Activity activity2 = (Activity) this.A01;
                boolean A07 = AbstractC23451Ch.A07(activity2, "android.permission.CALL_PHONE");
                String str3 = this.A03;
                if (A07) {
                    C64480TFq.A01(c64480TFq, "ctc_call_initiated_directly");
                    Intent data = AbstractC58318PtA.A0E("android.intent.action.CALL").setData(AbstractC08820cl.A03(str3));
                    C14360o3.A07(data);
                    C12260kU.A00(activity2, data);
                    return;
                }
                C64480TFq.A01(c64480TFq, "ctc_permission_request");
                AbstractC43592JPx.A1C(activity2, new C36163Fxd(activity2, c64480TFq, str3, 0), "android.permission.CALL_PHONE");
                return;
            case 5:
                C58766Q7v c58766Q7v = (C58766Q7v) this.A02;
                W39 w393 = (W39) this.A01;
                String str4 = this.A03;
                FragmentActivity activity3 = c58766Q7v.getActivity();
                if (activity3 != null) {
                    activity3.setResult(0, C58766Q7v.A00(null, c58766Q7v, w393, C05F.A01, null, null, null, null, str4));
                }
                activity = c58766Q7v.getActivity();
                if (activity == null) {
                    return;
                }
                activity.finish();
                return;
            default:
                String str5 = this.A03;
                Context context = (Context) this.A02;
                activity = (Activity) this.A01;
                Intent A0C = AbstractC58318PtA.A0C();
                A0C.setData(AbstractC08820cl.A03(str5));
                AbstractC58322PtE.A0Z().A0G(context, A0C);
                activity.finish();
                return;
        }
        Dialog dialog = ((C0SG) qec).A01;
        if (dialog == null) {
            return;
        }
        dialog.cancel();
    }
}
