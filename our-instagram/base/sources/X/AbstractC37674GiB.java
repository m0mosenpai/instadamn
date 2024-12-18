package X;

import java.util.Map;

/* renamed from: X.GiB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37674GiB {
    public static C09530e4 A00;
    public static C09530e4 A01;
    public static C09530e4 A02;

    public static final void A00(C37729Gj4 c37729Gj4, C37648Ghh c37648Ghh) {
        Throwable th;
        C14360o3.A0B(c37729Gj4, 2);
        if (!c37729Gj4.A01 && (th = c37729Gj4.A00) != null) {
            C18950wb c18950wb = C18950wb.A01;
            Class<?> cls = th.getClass();
            Map map = C0YZ.A03;
            C14360o3.A0B(cls, 1);
            C0f5 AEp = c18950wb.AEp(AbstractC13230m9.A01(cls), 630203803);
            AEp.ERI(th);
            StringBuilder sb = new StringBuilder();
            for (C37651Ghk c37651Ghk = c37648Ghh.A02; c37651Ghk != null; c37651Ghk = c37651Ghk.A00) {
                sb.append(c37651Ghk.A01.toString());
                sb.append('\n');
            }
            String obj = sb.toString();
            C14360o3.A07(obj);
            AEp.ABW("timeline", obj);
            c37648Ghh.A06.getValue();
            AEp.report();
        }
    }
}
