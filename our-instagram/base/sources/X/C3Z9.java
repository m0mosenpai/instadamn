package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Z9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z9 {
    public W5F A00;
    public final List A01 = new ArrayList();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();

    public final void A04(List list, int i, String str) {
        C14360o3.A0B(str, 2);
        String A0O = AnonymousClass001.A0O("Position ", i);
        List list2 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(A0O);
        sb.append(' ');
        sb.append(list);
        list2.add(sb.toString());
        W5F w5f = this.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    public final void A00(double d) {
        this.A02.put("Elapsed time to insertion", String.valueOf(d));
        W5F w5f = this.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    public final void A01(double d, int i, int i2, int i3, int i4) {
        Map map = this.A03;
        map.put("Media gap to previous ad", String.valueOf(i));
        map.put("Media gap to previous netego", String.valueOf(i2));
        map.put("Highest position rule", String.valueOf(i3));
        map.put("Min gap to previous item", String.valueOf(i4));
        map.put("Time gap to previous item", String.valueOf(d));
    }

    public final void A02(int i) {
        this.A02.put("Max index seen", String.valueOf(i));
        W5F w5f = this.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    public final void A03(int i, int i2, int i3) {
        Map map = this.A02;
        map.put("Media gap to previous ad", String.valueOf(i));
        map.put("Media gap to previous netego", String.valueOf(i2));
        map.put("Current viewer position", String.valueOf(i3));
        W5F w5f = this.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }
}
