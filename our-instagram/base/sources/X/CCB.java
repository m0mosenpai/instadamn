package X;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class CCB {
    public static final C5C8 A00(C5W3 c5w3, String str, String str2) {
        C14360o3.A0B(str, 0);
        C6C7 A0g = AbstractC25228BEl.A0g();
        int A01 = A0g.A01("web_url_span", str2);
        try {
            C6El c6El = new C6El(new C25789Bb6(new C28222CcS(c5w3, null, null, null), str2), "", A0g.A00.length(), Integer.MIN_VALUE);
            List list = A0g.A03;
            list.add(c6El);
            A0g.A01.add(c6El);
            int A05 = AbstractC25226BEj.A05(list);
            try {
                A0g.A09(str);
                A0g.A04(A01);
                return A0g.A02();
            } finally {
                A0g.A04(A05);
            }
        } catch (Throwable th) {
            A0g.A04(A01);
            throw th;
        }
    }
}
