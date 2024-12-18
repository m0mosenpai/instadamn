package X;

import android.view.View;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class P3J implements InterfaceC58152PqH {
    public final /* synthetic */ OW4 A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ boolean A02;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public P3J(OW4 ow4, User user, boolean z) {
        this.A00 = ow4;
        this.A01 = user;
        this.A02 = z;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        InterfaceC58041PoR interfaceC58041PoR = this.A00.A0B;
        if (interfaceC58041PoR != null) {
            interfaceC58041PoR.DwE(this.A01, this.A02);
        }
    }
}
