package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37380GdM {
    public static Map A00(InterfaceC83973oh interfaceC83973oh) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC83973oh.BXd() != null) {
            A1I.put("num_earned_achievements", interfaceC83973oh.BXd());
        }
        if (interfaceC83973oh.Bvv() != null) {
            A1I.put("show_achievements", interfaceC83973oh.Bvv());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
