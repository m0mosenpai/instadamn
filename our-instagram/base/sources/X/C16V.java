package X;

import java.io.IOException;
import java.util.Map;

/* renamed from: X.16V, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C16V {
    public static final C16L A00(String str) {
        C14360o3.A0B(str, 0);
        C16L A03 = AbstractC221915u.A00.A03(str);
        A03.A1J();
        return A03;
    }

    public static final Object A01(C16L c16l, C1EH c1eh) {
        C14360o3.A0B(c16l, 0);
        try {
            return c1eh.invoke(c16l);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static final void A03(AnonymousClass182 anonymousClass182, String str) {
        C14360o3.A0B(anonymousClass182, 0);
        anonymousClass182.A0r(str);
        anonymousClass182.A0c();
    }

    public static final boolean A04(AnonymousClass182 anonymousClass182, Map.Entry entry) {
        C14360o3.A0B(entry, 1);
        anonymousClass182.A0r(String.valueOf(entry.getKey()));
        if (entry.getValue() == null) {
            anonymousClass182.A0b();
            return true;
        }
        return false;
    }

    public static final String A02(C16L c16l) {
        String A0q = c16l.A0q();
        c16l.A1J();
        return A0q;
    }
}
