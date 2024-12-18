package X;

import java.util.concurrent.Executor;

/* renamed from: X.1us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40851us {
    public final C40841ur A00;
    public final Executor A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public C40851us(C40841ur c40841ur, C40831uq c40831uq, Executor executor, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3) {
        C14360o3.A0B(executor, 3);
        this.A02 = interfaceC09390do2;
        this.A01 = executor;
        this.A00 = c40841ur;
        this.A04 = AbstractC09440dt.A01(new C9F8(16, interfaceC09390do, this));
        this.A03 = AbstractC09440dt.A01(new C9F8(15, interfaceC09390do, this));
        this.A05 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9FP(6, c40831uq, this, interfaceC09390do));
        this.A06 = AbstractC09440dt.A01(new C9F8(17, interfaceC09390do3, this));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, X.2Jo] */
    public static final C1Df A00(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk, C40851us c40851us, Executor executor, final InterfaceC09390do interfaceC09390do) {
        Object obj;
        final C207279Fg c207279Fg = new C207279Fg(0, c1Dk, c40851us, interfaceC48192Ji, interfaceC48212Jk, executor);
        if (!interfaceC09390do.CWa()) {
            final ?? obj2 = new Object();
            c40851us.A01.execute(new Runnable() { // from class: X.2Jp
                @Override // java.lang.Runnable
                public final void run() {
                    C1Df c1Df = (C1Df) c207279Fg.invoke(interfaceC09390do.getValue());
                    C48252Jo c48252Jo = obj2;
                    synchronized (c48252Jo) {
                        C14360o3.A0B(c1Df, 0);
                        c48252Jo.A00 = c1Df;
                        if (c48252Jo.A01) {
                            c1Df.cancel();
                        }
                    }
                }
            });
            obj = obj2;
        } else {
            obj = c207279Fg.invoke(interfaceC09390do.getValue());
        }
        return (C1Df) obj;
    }
}
