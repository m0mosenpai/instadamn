package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class P8X implements InterfaceC58124Ppn {
    public final /* synthetic */ C69453Af A00;
    public final /* synthetic */ C15100pQ A01;

    @Override // X.InterfaceC58124Ppn
    public final void Dbk(float f) {
    }

    public P8X(C69453Af c69453Af, C15100pQ c15100pQ) {
        this.A01 = c15100pQ;
        this.A00 = c69453Af;
    }

    @Override // X.InterfaceC58124Ppn
    public final void DKY(boolean z, String str) {
        this.A00.A09(false, false);
    }

    @Override // X.InterfaceC58124Ppn
    public final void Da6(int i, String str, boolean z) {
        View A0e;
        this.A01.A00 = i;
        C69473Ah c69473Ah = this.A00.A0P;
        RecyclerView recyclerView = c69473Ah.A03;
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
            if (linearLayoutManager != null) {
                int A1c = linearLayoutManager.A1c();
                int A1d = linearLayoutManager.A1d();
                if (i >= A1c && i <= A1d) {
                    if (!C18U.A06(C06090Tz.A05, c69473Ah.A0B, 36328564261404296L)) {
                        return;
                    }
                }
                int i2 = 0;
                if (z && (A0e = linearLayoutManager.A0e(0)) != null) {
                    i2 = A0e.getWidth() / 4;
                }
                linearLayoutManager.A1p(i, i2);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
