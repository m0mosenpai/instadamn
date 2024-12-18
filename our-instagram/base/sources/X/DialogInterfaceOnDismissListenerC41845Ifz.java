package X;

import android.content.DialogInterface;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.Ifz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnDismissListenerC41845Ifz implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DialogInterfaceOnDismissListenerC41845Ifz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (2 - this.A00 != 0) {
            C37609Gh4 c37609Gh4 = (C37609Gh4) this.A01;
            if (!c37609Gh4.A00) {
                ((UserFlowLoggerImpl) this.A02).flowEndCancel(658062002L, CancelReason.USER_CANCELLED);
            }
            c37609Gh4.A05.A00();
            return;
        }
        C37607Gh2 c37607Gh2 = (C37607Gh2) this.A02;
        c37607Gh2.A0E.A00();
        C37608Gh3 c37608Gh3 = c37607Gh2.A0H;
        c37608Gh3.A0G.A0K((C120985dq) this.A01, new C147066ji(c37608Gh3.A0B, c37608Gh3.A04));
    }
}
