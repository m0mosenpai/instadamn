package X;

import androidx.fragment.app.FragmentActivity;
import java.util.Map;

/* renamed from: X.PzI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC58645PzI implements Runnable {
    public final /* synthetic */ C58606PyZ A00;
    public final /* synthetic */ Map A01;

    public /* synthetic */ RunnableC58645PzI(C58606PyZ c58606PyZ, Map map) {
        this.A00 = c58606PyZ;
        this.A01 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C58606PyZ c58606PyZ = this.A00;
        Map map = this.A01;
        FragmentActivity activity = c58606PyZ.getActivity();
        if (activity != null) {
            C14240no A0G = MSY.A0G(activity);
            A0G.A03(c58606PyZ);
            A0G.A01();
        }
        InterfaceC23471Cj interfaceC23471Cj = c58606PyZ.A00;
        if (interfaceC23471Cj != null) {
            interfaceC23471Cj.DYE(map);
        }
        C23461Ci c23461Ci = c58606PyZ.A01;
        if (c23461Ci != null) {
            c23461Ci.DYE(map);
        }
    }
}
