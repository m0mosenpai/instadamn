package X;

import android.view.View;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* loaded from: classes8.dex */
public final class LOd implements View.OnClickListener {
    public final /* synthetic */ C9C0 A00;
    public final /* synthetic */ C7SI A01;

    public LOd(C9C0 c9c0, C7SI c7si) {
        this.A01 = c7si;
        this.A00 = c9c0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(858668049);
        C7SI c7si = this.A01;
        InterfaceC164907Zd interfaceC164907Zd = c7si.A09;
        if (!((InterfaceC165507ad) interfaceC164907Zd).CQu()) {
            C9C0 c9c0 = this.A00;
            interfaceC164907Zd.CIu((DirectMessageIdentifier) c9c0.A03, new MHU(8, c9c0, c7si));
        }
        C0f9.A0C(914037020, A05);
    }
}
