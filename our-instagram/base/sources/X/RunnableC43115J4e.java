package X;

import java.util.Collection;

/* renamed from: X.J4e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43115J4e implements Runnable {
    public final /* synthetic */ InterfaceC674632l A00;
    public final /* synthetic */ C15370ps A01;

    public RunnableC43115J4e(InterfaceC674632l interfaceC674632l, C15370ps c15370ps) {
        this.A00 = interfaceC674632l;
        this.A01 = c15370ps;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.DHK(!((Collection) this.A01.A00).isEmpty());
    }
}
