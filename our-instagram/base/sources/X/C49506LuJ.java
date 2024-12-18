package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.ExampleContext;
import com.facebook.odin.model.FeatureData;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.LuJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49506LuJ implements InterfaceC57950Pmw {
    public final UserSession A00;

    @Override // X.InterfaceC57950Pmw
    public final void AIQ(C52C c52c, L0G l0g, List list) {
        ArrayList A0S = AbstractC001800i.A0S(c52c.A05, list);
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A0S, 10)));
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            IgSignalsFeature igSignalsFeature = (IgSignalsFeature) it.next();
            String valueOf = String.valueOf(igSignalsFeature.A01);
            A18.put(valueOf, new FeatureData(null, valueOf, null, null, igSignalsFeature.A00, 16374, 0L));
        }
        C3R9[] c3r9Arr = Example.A04;
        Example example = new Example(ExampleContext.A05, "identity", A18);
        new C2047794l(AbstractC40691uc.A01(this.A00)).A00(C05F.A0N, l0g.A00, String.valueOf(c52c.A02), AbstractC166987dD.A1J(example), null, null, c52c.A03);
    }

    public C49506LuJ(UserSession userSession) {
        this.A00 = userSession;
    }
}
