package X;

import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* loaded from: classes8.dex */
public final /* synthetic */ class M70 implements Runnable {
    public final /* synthetic */ InterfaceC37261GbE A00;
    public final /* synthetic */ C1OW A01;
    public final /* synthetic */ InterfaceC31091eE A02;
    public final /* synthetic */ PendingMediaStore A03;
    public final /* synthetic */ PendingMediaStoreSerializer A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ M70(InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, InterfaceC31091eE interfaceC31091eE, PendingMediaStore pendingMediaStore, PendingMediaStoreSerializer pendingMediaStoreSerializer, String str) {
        this.A03 = pendingMediaStore;
        this.A04 = pendingMediaStoreSerializer;
        this.A01 = c1ow;
        this.A05 = str;
        this.A00 = interfaceC37261GbE;
        this.A02 = interfaceC31091eE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PendingMediaStore pendingMediaStore = this.A03;
        this.A04.A06(new RunnableC50022M6l(this.A00, this.A01, this.A02, pendingMediaStore, this.A05));
    }
}
