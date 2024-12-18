package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HlK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39810HlK {
    public static Map A00(C5HF c5hf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5hf.Act() != null) {
            List<InterfaceC43553JLn> Act = c5hf.Act();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC43553JLn interfaceC43553JLn : Act) {
                if (interfaceC43553JLn != null) {
                    A1E.add(interfaceC43553JLn.F7o());
                }
            }
            A1I.put(AbstractC111324zv.A00(3965), A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
