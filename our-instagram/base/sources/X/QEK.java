package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes10.dex */
public final class QEK extends AbstractC63952Swb {
    public static QEK A01;
    public final SDR A00;

    public QEK(Context context, Intent intent, InterfaceC172717mh interfaceC172717mh, InterfaceC172727mi interfaceC172727mi) {
        super(intent, interfaceC172717mh, interfaceC172727mi);
        Object obj;
        C62965SZi c62965SZi = C62965SZi.A04;
        if (c62965SZi != null) {
            obj = c62965SZi.A01.A02;
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        FragmentActivity activity = interfaceC172717mh.getActivity();
        if (activity != null) {
            super.A00 = new C62702SMq(intent, this.A03, new C63538Sp6(this, 0), activity, valueOf);
            this.A00 = new SDR(context, interfaceC172717mh);
            return;
        }
        throw AbstractC166987dD.A12("Required value was null.");
    }
}
