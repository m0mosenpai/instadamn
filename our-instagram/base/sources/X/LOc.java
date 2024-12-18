package X;

import android.view.View;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* loaded from: classes8.dex */
public final class LOc implements View.OnClickListener {
    public final /* synthetic */ C9C0 A00;
    public final /* synthetic */ C7SI A01;

    public LOc(C9C0 c9c0, C7SI c7si) {
        this.A01 = c7si;
        this.A00 = c9c0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1715149943);
        C7SI c7si = this.A01;
        InterfaceC164907Zd interfaceC164907Zd = c7si.A09;
        if (!((InterfaceC165507ad) interfaceC164907Zd).CQu()) {
            C9C0 c9c0 = this.A00;
            DirectMessageIdentifier directMessageIdentifier = (DirectMessageIdentifier) c9c0.A03;
            interfaceC164907Zd.CIv(directMessageIdentifier);
            c7si.A07.setVisibility(8);
            String str = directMessageIdentifier.A02;
            if (str != null) {
                c7si.A08.A01(c9c0.A04, str);
            }
        }
        C0f9.A0C(2114440384, A05);
    }
}
