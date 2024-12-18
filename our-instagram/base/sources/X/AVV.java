package X;

import android.os.Handler;
import java.util.List;

/* loaded from: classes4.dex */
public final class AVV implements InterfaceC176207sd {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ InterfaceC176207sd A01;
    public final /* synthetic */ InterfaceC25159BBe A02;
    public final /* synthetic */ C176097sS A03;
    public final /* synthetic */ List A04;

    public AVV(Handler handler, InterfaceC176207sd interfaceC176207sd, InterfaceC25159BBe interfaceC25159BBe, C176097sS c176097sS, List list) {
        this.A03 = c176097sS;
        this.A01 = interfaceC176207sd;
        this.A00 = handler;
        this.A02 = interfaceC25159BBe;
        this.A04 = list;
    }

    @Override // X.InterfaceC176207sd
    public final void onError(Throwable th) {
        this.A03.A06(new C23420AZt(this));
    }

    @Override // X.InterfaceC176207sd
    public final void onSuccess() {
        AbstractC72880XqE.A00(this.A00, this.A01);
        InterfaceC25159BBe interfaceC25159BBe = this.A02;
        if (interfaceC25159BBe != null) {
            interfaceC25159BBe.onFinished();
        }
    }
}
