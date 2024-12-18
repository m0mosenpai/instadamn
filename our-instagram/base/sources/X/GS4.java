package X;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class GS4 extends HashMap {
    public final int A00;
    public final Object A01;

    public GS4(C34944FaU c34944FaU, int i) {
        String str;
        this.A00 = i;
        this.A01 = c34944FaU;
        switch (i) {
            case 0:
                str = "open_help_center";
                break;
            case 1:
                str = "report_a_problem";
                break;
            default:
                str = "open_creator_support";
                break;
        }
        put("action", str);
    }
}
