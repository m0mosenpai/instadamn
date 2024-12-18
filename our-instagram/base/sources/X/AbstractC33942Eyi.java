package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Eyi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33942Eyi {
    public static final Object A00(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C6FG c6fg = (C6FG) A01;
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        AbstractC31171DnF.A1Q(A0A);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("dyi_ui_source", "standalone");
        A1G.put("should_dismiss", "true");
        HashMap A012 = AbstractC191768eY.A01(A1G);
        C35205Ffx c35205Ffx = new C35205Ffx();
        c35205Ffx.A02 = U6G.A05;
        c35205Ffx.A03 = U6H.A08;
        C65981Txa A03 = c35205Ffx.A03();
        C102874kO c102874kO = new C102874kO(13784);
        c102874kO.A0Q(45, "unified_dyi.landing_page");
        IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(A0A).A00;
        igBloksScreenConfig.A0R = "com.bloks.www.fx.settings.unified_dyi.landing_page";
        igBloksScreenConfig.A0C = A03;
        C66277U6x A02 = C66277U6x.A02("com.bloks.www.fx.settings.unified_dyi.landing_page", A012, Collections.emptyMap());
        c102874kO.A0P();
        A02.A03 = c102874kO;
        A02.A06 = "unified_dyi.landing_page";
        A02.A06(c6fg.A00, igBloksScreenConfig);
        return null;
    }
}
