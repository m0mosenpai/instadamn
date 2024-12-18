package X;

import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.M4d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49962M4d implements Runnable {
    public final /* synthetic */ C47Z A00;
    public final /* synthetic */ C40121td A01;

    public RunnableC49962M4d(C47Z c47z, C40121td c40121td) {
        this.A01 = c40121td;
        this.A00 = c47z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Set set = this.A01.A06;
        C47Z c47z = this.A00;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC53852dP interfaceC53852dP = (InterfaceC53852dP) ((Reference) it.next()).get();
            if (interfaceC53852dP != null) {
                interfaceC53852dP.DHI(c47z);
            }
        }
    }
}
