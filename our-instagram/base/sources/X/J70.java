package X;

import com.instagram.realtimeclient.requeststream.SubscriptionHandler;

/* loaded from: classes7.dex */
public final /* synthetic */ class J70 extends C03E implements InterfaceC16820sZ {
    public J70(Object obj) {
        super(0, obj, SubscriptionHandler.class, "cancel", "cancel()V", 0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ((SubscriptionHandler) this.receiver).cancel();
        return C0eB.A00;
    }
}
