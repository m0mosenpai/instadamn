package X;

import java.util.Iterator;
import java.util.regex.Matcher;

/* loaded from: classes5.dex */
public abstract class CZ9 {
    public static final C5C8 A01(String str, long j) {
        C14360o3.A0B(str, 0);
        C6C7 A0U = AbstractC25231BEo.A0U(str);
        Matcher A09 = AbstractC13670mt.A09(str);
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                int start = A09.start(1);
                int end = A09.end(1);
                A0U.A06(new C5W3(null, null, null, null, null, 65534, j, 0L, 0L), start, end);
                A0U.A0A(AbstractC43591JPw.A00(1404), group, start, end);
            }
        }
        return A0U.A02();
    }

    public static final int A00(String str, InterfaceC16660sJ interfaceC16660sJ, int i) {
        Object obj;
        Iterator it = new C17v(i - 1, 0, -1).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC25231BEo.A1a(Character.valueOf(str.charAt(AbstractC166987dD.A0H(obj))), interfaceC16660sJ)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Number number = (Number) obj;
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }
}
