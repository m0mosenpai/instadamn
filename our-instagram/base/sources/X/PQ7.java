package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class PQ7 implements Runnable {
    public final /* synthetic */ C51165Mj8 A00;
    public final /* synthetic */ List A01;

    public PQ7(C51165Mj8 c51165Mj8, List list) {
        this.A01 = list;
        this.A00 = c51165Mj8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A01;
        C51165Mj8 c51165Mj8 = this.A00;
        AbstractC66552zX.A00(new C51088Mhn(list, c51165Mj8.A03, false)).A03(c51165Mj8);
    }
}
