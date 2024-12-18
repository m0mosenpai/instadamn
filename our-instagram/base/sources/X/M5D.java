package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class M5D implements Runnable {
    public final /* synthetic */ C44564Jnl A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public M5D(C44564Jnl c44564Jnl, List list, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c44564Jnl;
        this.A01 = list;
        this.A02 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44564Jnl c44564Jnl = this.A00;
        AbstractC66552zX.A00(new JnH(this.A01, c44564Jnl.A00)).A03(c44564Jnl);
        this.A02.invoke();
    }
}
