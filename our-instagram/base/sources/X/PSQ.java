package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class PSQ implements Runnable {
    public final /* synthetic */ C51164Mj7 A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;

    public PSQ(C51164Mj7 c51164Mj7, List list, boolean z) {
        this.A01 = list;
        this.A00 = c51164Mj7;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A01;
        C51164Mj7 c51164Mj7 = this.A00;
        AbstractC66552zX.A00(new C51088Mhn(list, c51164Mj7.A01, this.A02)).A03(c51164Mj7);
    }
}
