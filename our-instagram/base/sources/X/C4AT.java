package X;

import java.util.HashSet;

/* renamed from: X.4AT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AT implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C41461vv A01;
    public final /* synthetic */ InterfaceC42241xE A02;

    public C4AT(C41461vv c41461vv, InterfaceC42241xE interfaceC42241xE, int i) {
        this.A01 = c41461vv;
        this.A00 = i;
        this.A02 = interfaceC42241xE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object orDefault;
        C41461vv c41461vv = this.A01;
        int i = this.A00;
        if (i == -1) {
            orDefault = new HashSet();
        } else {
            orDefault = c41461vv.A04.getOrDefault(Integer.valueOf(i), new HashSet());
        }
        this.A02.accept(orDefault);
    }
}
