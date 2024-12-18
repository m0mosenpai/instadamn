package X;

import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallLaunchConfig;

/* renamed from: X.EiW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33073EiW extends AbstractC151906sa {
    @Override // X.AbstractC151906sa
    public final InterfaceC37108GWt A01() {
        InterfaceC37108GWt interfaceC37108GWt;
        C70D c70d = this.A01;
        if (c70d.A04() > 0) {
            interfaceC37108GWt = new C36585GBj(c70d.A04());
        } else {
            interfaceC37108GWt = C36584GBi.A00;
        }
        return interfaceC37108GWt;
    }

    @Override // X.AbstractC151906sa
    public final void A02() {
        C70D c70d = this.A01;
        User user = c70d.A0E;
        if (user != null) {
            String id = user.getId();
            ((C28391Za) C28411Zc.A00()).Cgt(c70d.A06, c70d.A09, new WallLaunchConfig(null, id));
        }
    }
}
