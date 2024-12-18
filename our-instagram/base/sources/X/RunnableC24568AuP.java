package X;

import java.util.List;

/* renamed from: X.AuP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24568AuP implements Runnable {
    public final /* synthetic */ C208979Mf A00;
    public final /* synthetic */ List A01;

    public RunnableC24568AuP(C208979Mf c208979Mf, List list) {
        this.A00 = c208979Mf;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC174807qG) list.get(i)).Dal();
        }
    }
}
