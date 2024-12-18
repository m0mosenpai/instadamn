package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.List;

/* loaded from: classes4.dex */
public final class AUG implements InterfaceC58362lv {
    public final /* synthetic */ C191478dz A00;

    public AUG(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C8KC c8kc;
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            C191478dz c191478dz = this.A00;
            UserSession userSession = c191478dz.A0b;
            C183348Bh A00 = AbstractC183338Bg.A00(userSession);
            C22P c22p = c191478dz.A0Y;
            int size = list.size();
            String str = C1810981l.A02(c191478dz.A0d).A02;
            C5JK c5jk = c191478dz.A0w;
            A00.A05(c22p, c5jk, str, AbstractC166997dE.A0t(userSession), size);
            ClipsCreationViewModel clipsCreationViewModel = c191478dz.A0s;
            if (c22p.ordinal() == 357) {
                c8kc = C218649la.A00;
            } else {
                c8kc = C218589lU.A00;
            }
            clipsCreationViewModel.A0X(c8kc);
            C191478dz.A05(c191478dz.A0h.A02, c191478dz, c5jk, list);
        }
    }
}
