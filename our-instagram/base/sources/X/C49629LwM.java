package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.LwM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49629LwM implements InterfaceC1571373s {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C49629LwM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        if (this.A00 != 0) {
            C42824Ix0 c42824Ix0 = ((C41745IeJ) this.A02).A09;
            User user = (User) this.A01;
            C14360o3.A0A(user);
            c42824Ix0.A06(user, "merchant_shopping_bag_empty_state_action");
            return;
        }
        UserSession userSession = (UserSession) this.A02;
        KXD.A02(AbstractC47017Kqa.A00(userSession), C05F.A0C);
        AbstractC44179Jfi.A00(userSession).A06(EnumC31648DvE.A08, C05F.A0N);
        ((LE4) this.A01).A00.A0m(true, false);
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }
}
