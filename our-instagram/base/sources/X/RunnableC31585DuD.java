package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DuD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31585DuD implements Runnable {
    public final /* synthetic */ C31586DuE A00;
    public final /* synthetic */ C23461Ci A01;

    public RunnableC31585DuD(C31586DuE c31586DuE, C23461Ci c23461Ci) {
        this.A00 = c31586DuE;
        this.A01 = c23461Ci;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C31586DuE c31586DuE = this.A00;
        InterfaceC16660sJ interfaceC16660sJ = c31586DuE.A01;
        C14360o3.A0B(this.A01.A02, 0);
        List list = c31586DuE.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (!r4.contains(obj)) {
                A1E.add(obj);
            }
        }
        interfaceC16660sJ.invoke(A1E);
    }
}
