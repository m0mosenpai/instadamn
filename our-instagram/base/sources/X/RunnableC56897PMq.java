package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.PMq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56897PMq implements Runnable {
    public final /* synthetic */ StellaIpcDirectMessagingServiceClient A00;

    public RunnableC56897PMq(StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient) {
        this.A00 = stellaIpcDirectMessagingServiceClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.disconnect();
    }
}
