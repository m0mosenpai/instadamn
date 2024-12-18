package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;

/* renamed from: X.Lre, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49346Lre implements MQ6 {
    @Override // X.MQ6
    public final void ADY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C45093JxN c45093JxN, C49574LvT c49574LvT, C47424KxF c47424KxF) {
        C14360o3.A0B(context, 0);
        JQ0.A1O(c47424KxF, c45093JxN, userSession, interfaceC11380iw, c49574LvT);
        C101594hU c101594hU = c45093JxN.A07;
        if (c101594hU != null) {
            CreativeConfigIntf creativeConfigIntf = c101594hU.A00;
            String str = (String) c101594hU.A03.get();
            C143786eM c143786eM = c47424KxF.A00.A0R;
            ViewGroup viewGroup = c143786eM.A00;
            if (viewGroup != null) {
                new C141146Zs(context, viewGroup, interfaceC11380iw, userSession, creativeConfigIntf, c49574LvT, c143786eM, str).A04();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.MQ6
    public final boolean AFU(Context context, UserSession userSession, C45093JxN c45093JxN) {
        AbstractC167027dH.A12(context, c45093JxN, userSession);
        C101594hU c101594hU = c45093JxN.A07;
        if (c101594hU != null && AbstractC141396aI.A01(context, userSession, c101594hU.A00)) {
            return true;
        }
        return false;
    }
}
