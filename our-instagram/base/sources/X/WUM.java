package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WUM implements InterfaceC71948XBz {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C69402Vmm A01;
    public final /* synthetic */ WGO A02;

    public WUM(Bundle bundle, C69402Vmm c69402Vmm, WGO wgo) {
        this.A02 = wgo;
        this.A01 = c69402Vmm;
        this.A00 = bundle;
    }

    @Override // X.InterfaceC71948XBz
    public final /* bridge */ /* synthetic */ void DqR(Bundle bundle, Object obj) {
        WGO wgo = this.A02;
        SKN skn = wgo.A0U;
        C69402Vmm c69402Vmm = this.A01;
        skn.A00(c69402Vmm.A07);
        Bundle bundle2 = this.A00;
        bundle2.putLong("time_spent", System.currentTimeMillis() - wgo.A07);
        bundle2.putString("family_device_id", null);
        Iterator it = wgo.A0Q.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC71991XEe) it.next()).CzC(bundle2);
        }
        WGO.A02(c69402Vmm, wgo);
    }

    @Override // X.InterfaceC71948XBz
    public final void onFailure(Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putString(TraceFieldType.FailureReason, "upload_batch_fail");
        WGO wgo = this.A02;
        bundle.putString("family_device_id", null);
        bundle.putString("failure_message", th.getMessage());
        C69402Vmm c69402Vmm = this.A01;
        bundle.putInt("num_of_retries", !c69402Vmm.A00 ? 1 : 0);
        C69541Vr5 c69541Vr5 = wgo.A0Q;
        WGO.A01(bundle, wgo);
        Iterator it = c69541Vr5.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC71991XEe) it.next()).CzB(bundle);
        }
        if (!c69402Vmm.A00) {
            c69402Vmm.A00 = true;
            WGO.A03(c69402Vmm, wgo);
        } else {
            wgo.A05++;
            wgo.A0S.A01("batch_upload_failed", String.valueOf(true));
            WGO.A02(c69402Vmm, wgo);
        }
    }
}
