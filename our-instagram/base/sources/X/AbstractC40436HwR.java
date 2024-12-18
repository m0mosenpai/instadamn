package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HwR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40436HwR {
    public static Map A00(InterfaceC43544JLe interfaceC43544JLe) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43544JLe.BxG() != null) {
            A1I.put("signal_item", interfaceC43544JLe.BxG());
        }
        if (interfaceC43544JLe.BxJ() != null) {
            A1I.put("signal_type", interfaceC43544JLe.BxJ());
        }
        if (interfaceC43544JLe.C8M() != null) {
            A1I.put("time_based_insertion_gap_in_seconds", interfaceC43544JLe.C8M());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
