package X;

/* renamed from: X.KkN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46646KkN {
    public static String A00(C6FW c6fw) {
        int i;
        String str;
        C102884kP c102884kP = (C102884kP) c6fw.A00.get(0);
        C6FG c6fg = (C6FG) c6fw.A02();
        if (c102884kP != null && ((i = c102884kP.A05) == 13616 || i == 13697)) {
            C46501Ki0 c46501Ki0 = (C46501Ki0) AnonymousClass634.A06(c6fg, c102884kP);
            if (c46501Ki0 == null || (str = c46501Ki0.A02) == null) {
                return "";
            }
            return str;
        }
        throw AbstractC166987dD.A12("Incorrect component type for bk.action.search_bar.GetText");
    }
}
