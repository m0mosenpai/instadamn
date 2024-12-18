package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V9M extends V9N {
    public final /* synthetic */ C67900V1k A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.2gX, java.lang.Object] */
    public V9M(ViewGroup viewGroup, UserSession userSession, C67900V1k c67900V1k, QuickPromotionSlot quickPromotionSlot) {
        super(c67900V1k, null, c67900V1k, userSession, C70974Wli.A00, new Object(), quickPromotionSlot, new C64832wh(c67900V1k, c67900V1k, userSession));
        this.A00 = c67900V1k;
        C14360o3.A0B(userSession, 4);
        AbstractC54912fq.A00();
        FAZ();
        ((V9N) this).A00 = (IgTextView) viewGroup.findViewById(R.id.qp_preview_action_content);
    }

    @Override // X.V9N, X.AbstractC55352ga, X.InterfaceC55362gb
    public final void Dco(C4NL c4nl, Integer num, Map map) {
        C14360o3.A0B(c4nl, 0);
        super.Dco(c4nl, num, null);
        View view = this.A00.A00;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // X.V9N, X.AbstractC55352ga, X.InterfaceC55362gb
    public final void Dcp(C4NL c4nl) {
        C14360o3.A0B(c4nl, 0);
        super.Dcp(c4nl);
        View view = this.A00.A00;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
