package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes5.dex */
public final class D1G implements Runnable {
    public final /* synthetic */ C25943Bdk A00;

    public D1G(C25943Bdk c25943Bdk) {
        this.A00 = c25943Bdk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int A1c;
        C38514GwZ c38514GwZ;
        C25943Bdk c25943Bdk = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View view = c25943Bdk.A00;
        if (view.getVisibility() == 0) {
            InterfaceC31005Dk4 interfaceC31005Dk4 = c25943Bdk.A03;
            if (interfaceC31005Dk4.CcY(view) && (A1c = ((LinearLayoutManager) c25943Bdk.A06.getValue()).A1c()) != -1) {
                C3OO A0V = c25943Bdk.A01.A0V(A1c);
                if (A0V != null && (A0V instanceof C38514GwZ)) {
                    c38514GwZ = (C38514GwZ) A0V;
                } else {
                    c38514GwZ = null;
                }
                interfaceC31005Dk4.DIf(c38514GwZ);
            }
        }
    }
}
