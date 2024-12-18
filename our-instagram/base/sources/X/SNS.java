package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class SNS {
    public final List A00 = AbstractC25225BEi.A17(20);

    public final void A00(String str) {
        int i = 0;
        while (true) {
            List list = this.A00;
            if (i < list.size()) {
                if (str.equalsIgnoreCase(AbstractC25226BEj.A1I(list, i))) {
                    list.remove(i);
                    list.remove(i);
                    i -= 2;
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    public final void A01(String str, String str2) {
        List list = this.A00;
        list.add(str);
        list.add(str2.trim());
    }
}
