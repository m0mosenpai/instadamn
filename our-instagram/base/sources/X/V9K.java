package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* loaded from: classes11.dex */
public final class V9K extends V9N {
    public final /* synthetic */ V0D A00;

    @Override // X.V9N, X.AbstractC55352ga, X.InterfaceC55362gb
    public final void Dcp(C4NL c4nl) {
        C14360o3.A0B(c4nl, 0);
        super.Dcp(c4nl);
        C1571173q c1571173q = this.A00.A01;
        if (c1571173q == null) {
            C14360o3.A0F("controller");
            throw C00O.createAndThrow();
        }
        C1571173q.A00(c1571173q);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V9K(UserSession userSession, V0D v0d, QuickPromotionSlot quickPromotionSlot) {
        super(v0d, v0d, userSession, quickPromotionSlot);
        this.A00 = v0d;
    }
}
