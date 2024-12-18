package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class FRA {
    public String A00;
    public String A01;
    public List A02;
    public List A03;

    public final String A00(int i) {
        List list = this.A02;
        if (list != null && list.size() > i) {
            return ((FJB) list.get(i)).A01;
        }
        return "";
    }

    public final String A01(int i) {
        List list = this.A03;
        if (list != null && list.size() > i) {
            return ((FJB) list.get(i)).A01;
        }
        return "";
    }
}
