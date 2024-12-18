package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.Gmt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37951Gmt {
    public static final C37952Gmu A00(Fragment fragment, UserSession userSession, IgImageView igImageView, InterfaceC38371qR interfaceC38371qR, InterfaceC60442pS interfaceC60442pS, SourceModelInfoParams sourceModelInfoParams, C2Fb c2Fb, String str) {
        Reel A0M;
        C14360o3.A0B(userSession, 1);
        AbstractC167007dF.A1E(interfaceC38371qR, 2, sourceModelInfoParams);
        String str2 = sourceModelInfoParams.A04;
        if (str2 != null && (A0M = AbstractC37301Gc2.A0M(userSession).A0M(str2)) != null) {
            C37952Gmu c37952Gmu = new C37952Gmu(fragment, userSession, new C130915ve(userSession, A0M, sourceModelInfoParams.A05, sourceModelInfoParams.A09, sourceModelInfoParams.A01, sourceModelInfoParams.A03), interfaceC60442pS, c2Fb);
            c37952Gmu.A02(sourceModelInfoParams);
            c37952Gmu.A0x = new int[]{0, 0};
            c37952Gmu.A0b = str;
            c37952Gmu.A0M = A0M;
            return c37952Gmu;
        }
        C5SE c5se = new C5SE(userSession, interfaceC38371qR);
        c5se.A00 = sourceModelInfoParams.A00;
        c5se.A01 = sourceModelInfoParams.A02;
        C37952Gmu c37952Gmu2 = new C37952Gmu(fragment, userSession, c5se, interfaceC60442pS, c2Fb);
        c37952Gmu2.A01(interfaceC38371qR.BQN());
        c37952Gmu2.A02(sourceModelInfoParams);
        c37952Gmu2.A00(igImageView, c5se, interfaceC38371qR.BQN());
        c37952Gmu2.A0b = str;
        if (!(interfaceC38371qR instanceof C40971v4)) {
            return c37952Gmu2;
        }
        c37952Gmu2.A0O = (C40971v4) interfaceC38371qR;
        return c37952Gmu2;
    }
}
