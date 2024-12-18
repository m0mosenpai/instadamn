package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Eyj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33943Eyj {
    public static final Object A00(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C6FG c6fg = (C6FG) A01;
        Object obj = c6fw.A00.get(1);
        HashMap A1G = AbstractC166987dD.A1G();
        if (obj != null) {
            A1G.put("deeplink_params", obj);
        }
        A1G.put("should_dismiss", "true");
        HashMap A012 = AbstractC191768eY.A01(A1G);
        C35205Ffx c35205Ffx = new C35205Ffx();
        c35205Ffx.A02 = U6G.A05;
        c35205Ffx.A03 = U6H.A08;
        C65981Txa A03 = c35205Ffx.A03();
        C102874kO c102874kO = new C102874kO(13784);
        c102874kO.A0Q(45, "tyi.home_page");
        IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(C6BQ.A0A(c6fg)).A00;
        igBloksScreenConfig.A0R = "com.bloks.www.fx.settings.tyi.home_page";
        igBloksScreenConfig.A0C = A03;
        C66277U6x A02 = C66277U6x.A02("com.bloks.www.fx.settings.tyi.home_page", A012, Collections.emptyMap());
        c102874kO.A0P();
        A02.A03 = c102874kO;
        A02.A06 = "tyi.home_page";
        A02.A06(c6fg.A00, igBloksScreenConfig);
        return null;
    }
}
