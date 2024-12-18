package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V9L extends V9N {
    public final /* synthetic */ C67899V1j A00;

    @Override // X.V9N, X.AbstractC55352ga, X.InterfaceC55362gb
    public final void Dco(C4NL c4nl, Integer num, Map map) {
        C14360o3.A0B(c4nl, 0);
        super.Dco(c4nl, num, null);
        View view = this.A00.A00;
        if (view == null) {
            C14360o3.A0F("megaphoneView");
            throw C00O.createAndThrow();
        }
        view.setVisibility(0);
    }

    @Override // X.V9N, X.AbstractC55352ga, X.InterfaceC55362gb
    public final void Dcp(C4NL c4nl) {
        C14360o3.A0B(c4nl, 0);
        super.Dcp(c4nl);
        View view = this.A00.A00;
        if (view == null) {
            C14360o3.A0F("megaphoneView");
            throw C00O.createAndThrow();
        }
        view.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V9L(UserSession userSession, C67899V1j c67899V1j, QuickPromotionSlot quickPromotionSlot) {
        super(c67899V1j, c67899V1j, userSession, quickPromotionSlot);
        this.A00 = c67899V1j;
    }
}
