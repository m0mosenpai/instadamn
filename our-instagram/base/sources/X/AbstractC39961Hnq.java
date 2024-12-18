package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hnq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39961Hnq {
    public static Map A00(InterfaceC1816483t interfaceC1816483t) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC1816483t.getColor() != null) {
            A1I.put("color", interfaceC1816483t.getColor());
        }
        interfaceC1816483t.B7R();
        A1I.put("follower_count", Integer.valueOf(interfaceC1816483t.B7R()));
        if (interfaceC1816483t.BAt() != null) {
            A1I.put("hallpass_id", interfaceC1816483t.BAt());
        }
        interfaceC1816483t.BSB();
        A1I.put(AbstractC111324zv.A00(472), Integer.valueOf(interfaceC1816483t.BSB()));
        if (interfaceC1816483t.getName() != null) {
            AbstractC37300Gc1.A14(interfaceC1816483t.getName(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
