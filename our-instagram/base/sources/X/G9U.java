package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G9U implements InterfaceC65457TkT {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public G9U(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC65457TkT
    public final /* bridge */ /* synthetic */ void D6e(Object obj) {
        if (this.A00 != 0) {
            G9Y g9y = (G9Y) this.A01;
            Efi.A01((UserSession) this.A02, (Efi) g9y.A01, (User) this.A03);
            return;
        }
        ((C32972Efd) this.A03).A05((UserSession) this.A02, (User) this.A01);
    }
}
