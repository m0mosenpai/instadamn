package X;

import android.telephony.TelephonyCallback;
import java.util.List;

/* renamed from: X.4gd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101224gd extends TelephonyCallback implements TelephonyCallback.CellInfoListener {
    public final /* synthetic */ C23441Cg A00;

    public /* synthetic */ C101224gd(C23441Cg c23441Cg) {
        this.A00 = c23441Cg;
    }

    @Override // android.telephony.TelephonyCallback.CellInfoListener
    public final void onCellInfoChanged(List list) {
        C23441Cg.A0V(this.A00, list);
    }
}
