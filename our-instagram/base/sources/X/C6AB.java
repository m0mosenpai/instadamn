package X;

import com.facebook.msys.mci.NetworkSession;

/* renamed from: X.6AB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AB extends AbstractRunnableC94874Os {
    public final /* synthetic */ C6A9 A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6AB(C6A9 c6a9, boolean z) {
        super("setNetWorkState");
        this.A01 = z;
        this.A00 = c6a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A01;
        NetworkSession networkSession = this.A00.A00;
        if (z) {
            networkSession.setNetworkStateConnected();
        } else {
            networkSession.setNetworkStateDisconnected();
        }
    }
}
