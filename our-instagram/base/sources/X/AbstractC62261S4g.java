package X;

import java.util.Map;

/* renamed from: X.S4g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62261S4g {
    public static final Map A00(Q08 q08, Integer num) {
        String str;
        Q03 q03;
        AbstractC167017dG.A1N(num, q08);
        switch (num.intValue()) {
            case 0:
                str = "resolved_sync";
                break;
            case 1:
                str = "resolved_async";
                break;
            default:
                str = "failed";
                break;
        }
        C09530e4 A1L = AbstractC166987dD.A1L("resolution_type", str);
        if (q08 instanceof Q09) {
            q03 = ((Q09) q08).A00;
        } else {
            q03 = q08.A00;
        }
        return AbstractC25233BEq.A0p("response_summary", AbstractC25233BEq.A0p("annotations", q03.A00, AbstractC166987dD.A1L("points", q03.A01)), A1L);
    }
}
