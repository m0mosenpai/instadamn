package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37387GdT {
    public static Map A00(InterfaceC39301sB interfaceC39301sB) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC39301sB.An3() != null) {
            A1I.put(AbstractC111324zv.A00(2042), interfaceC39301sB.An3());
        }
        if (interfaceC39301sB.BFW() != null) {
            A1I.put("ig_channel_id", interfaceC39301sB.BFW());
        }
        if (interfaceC39301sB.BJP() != null) {
            A1I.put("invite_link", interfaceC39301sB.BJP());
        }
        if (interfaceC39301sB.BYF() != null) {
            A1I.put("number_of_members", interfaceC39301sB.BYF());
        }
        if (interfaceC39301sB.Bvo() != null) {
            A1I.put("should_skip_channel_suffix_bool", interfaceC39301sB.Bvo());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
