package X;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rc7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60948Rc7 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C64478TFo A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60948Rc7(C64478TFo c64478TFo) {
        super(147);
        this.A00 = c64478TFo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList A1F;
        try {
            C64478TFo c64478TFo = this.A00;
            synchronized (c64478TFo) {
                List list = c64478TFo.A00;
                A1F = AbstractC166987dD.A1F(list);
                list.clear();
            }
            Iterator it = A1F.iterator();
            while (it.hasNext()) {
                C62710SMy c62710SMy = (C62710SMy) ((Reference) it.next()).get();
                if (c62710SMy != null) {
                    c62710SMy.A00();
                }
            }
        } catch (Exception e) {
            C0K8.A0F("BleScannerFailsafe", "Error calling appBackgroundTriggered", e);
        }
    }
}
