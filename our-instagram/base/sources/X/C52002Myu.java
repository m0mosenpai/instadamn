package X;

import com.facebook.rsys.callmanager.callclient.gen.CallClient;
import com.facebook.rsys.callmanager.callclient.gen.SetupCallback;

/* renamed from: X.Myu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52002Myu extends SetupCallback {
    public final InterfaceC16660sJ A00;
    public final /* synthetic */ C54739OFq A01;

    @Override // com.facebook.rsys.callmanager.callclient.gen.SetupCallback
    public final void onSetup(CallClient callClient) {
        C14360o3.A0B(callClient, 0);
        if (callClient instanceof C52000Myq) {
            this.A00.invoke(callClient);
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public C52002Myu(C54739OFq c54739OFq, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = c54739OFq;
        this.A00 = interfaceC16660sJ;
    }
}
