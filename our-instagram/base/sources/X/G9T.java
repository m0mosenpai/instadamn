package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G9T implements InterfaceC65457TkT {
    public final int A00;
    public final Object A01;

    public G9T(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65457TkT
    public final /* bridge */ /* synthetic */ void D6e(Object obj) {
        switch (this.A00) {
            case 0:
                C32369ENt.A00((C32369ENt) ((G9W) this.A01).A00.A01);
                return;
            case 1:
                C32318ELi.A00(((G9X) this.A01).A01);
                return;
            default:
                G9Y g9y = (G9Y) this.A01;
                C32975Efg.A01((UserSession) g9y.A03, (C32975Efg) g9y.A01, (User) g9y.A02);
                return;
        }
    }
}
