package X;

import java.util.LinkedList;

/* loaded from: classes10.dex */
public final class Rc2 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C89153yH A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rc2(C89153yH c89153yH) {
        super(552);
        this.A00 = c89153yH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C89143yG c89143yG;
        boolean remove;
        C89153yH c89153yH = this.A00;
        C24111Gg c24111Gg = c89153yH.A02;
        synchronized (c24111Gg.A02) {
            LinkedList linkedList = c24111Gg.A03;
            c89143yG = c89153yH.A01;
            remove = linkedList.remove(c89143yG);
        }
        if (remove) {
            c89143yG.A02.A04(c89153yH.A03, MSW.A0y("request cancelled"));
        }
    }
}
