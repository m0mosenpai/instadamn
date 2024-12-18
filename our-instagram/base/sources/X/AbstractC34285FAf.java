package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.FAf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC34285FAf {
    public static Map A00(InterfaceC37276GbT interfaceC37276GbT) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37276GbT.BPp() != null) {
            A1I.put("max_id", interfaceC37276GbT.BPp());
        }
        interfaceC37276GbT.BUt();
        A1I.put("more_available", Boolean.valueOf(interfaceC37276GbT.BUt()));
        if (interfaceC37276GbT.getPollId() != null) {
            A1I.put("poll_id", interfaceC37276GbT.getPollId());
        }
        if (interfaceC37276GbT.CH6() != null) {
            List<InterfaceC37275GbS> CH6 = interfaceC37276GbT.CH6();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC37275GbS interfaceC37275GbS : CH6) {
                if (interfaceC37275GbS != null) {
                    A1E.add(interfaceC37275GbS.F7o());
                }
            }
            A1I.put("voters", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
