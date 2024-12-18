package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hpl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40059Hpl {
    public static Map A00(InterfaceC43539JKz interfaceC43539JKz) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43539JKz.BXd() != null) {
            A1I.put("num_earned_achievements", interfaceC43539JKz.BXd());
        }
        interfaceC43539JKz.getShowAchievements();
        A1I.put("show_achievements", Boolean.valueOf(interfaceC43539JKz.getShowAchievements()));
        interfaceC43539JKz.Bw6();
        return AbstractC37301Gc2.A0r("show_challenges_toast", Boolean.valueOf(interfaceC43539JKz.Bw6()), A1I);
    }
}
