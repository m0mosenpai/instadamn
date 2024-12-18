package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Do0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31217Do0 {
    public static Map A00(InterfaceC81183jn interfaceC81183jn) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC81183jn.BCU() != null) {
            A1I.put("has_public_channels", interfaceC81183jn.BCU());
        }
        if (interfaceC81183jn.BdF() != null) {
            List<C44Q> BdF = interfaceC81183jn.BdF();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (C44Q c44q : BdF) {
                if (c44q != null) {
                    A1E.add(c44q.F7o());
                }
            }
            A1I.put("pinned_channels_list", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
