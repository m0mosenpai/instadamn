package X;

import android.content.Context;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EVW extends AbstractC60592pi implements InterfaceC63982vJ {
    public final Context A00;

    public EVW(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    public final void A00(RectF rectF, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Reel reel, C3G2 c3g2) {
        AbstractC25233BEq.A0x(3, fragmentActivity, userSession, c3g2);
        C14360o3.A0B(interfaceC11380iw, 6);
        C3M4 A06 = C1OU.A06(fragmentActivity, userSession);
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(reel.getId());
        A06.A0U(null, rectF, interfaceC11380iw, reel, c3g2, new GF0(0, rectF, fragmentActivity, this, userSession, reel, c3g2, A06, A1E), 0);
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }
}
