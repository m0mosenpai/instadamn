package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class FUD {
    public static final boolean A01(Map map) {
        if (map == null || map.size() < 2) {
            return false;
        }
        List A0a = AbstractC001800i.A0a(map.values());
        return AbstractC25225BEi.A1a(C00Q.A03(AbstractC25226BEj.A1I(A0a, 0), 2), C00Q.A03((String) AbstractC25227BEk.A0t(A0a), 2));
    }

    public static final boolean A00(C7TT c7tt) {
        C3o9 c3o9;
        InterfaceC83733oI interfaceC83733oI = c7tt.A0P;
        if (interfaceC83733oI != null) {
            c3o9 = AbstractC1345466e.A05(interfaceC83733oI);
        } else {
            c3o9 = null;
        }
        if (!(c3o9 instanceof MsysThreadId) && !c7tt.A0r && !c7tt.A0x && !c7tt.A0y && !c7tt.A0j && c7tt.A0O != EnumC46982Dm.A07) {
            return true;
        }
        return false;
    }
}
