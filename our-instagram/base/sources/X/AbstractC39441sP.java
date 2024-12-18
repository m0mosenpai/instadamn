package X;

import java.io.IOException;
import java.util.List;

/* renamed from: X.1sP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39441sP {
    public static C39511sW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C39491sU c39491sU = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("instruction".equals(A0q)) {
                    c39491sU = AbstractC39451sQ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C39511sW(c39491sU);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C39511sW c39511sW) {
        anonymousClass182.A0d();
        C39491sU c39491sU = c39511sW.A00;
        if (c39491sU != null) {
            anonymousClass182.A0r("instruction");
            anonymousClass182.A0d();
            List<InterfaceC39481sT> list = c39491sU.A01;
            if (list != null) {
                C16V.A03(anonymousClass182, "conditions");
                for (InterfaceC39481sT interfaceC39481sT : list) {
                    if (interfaceC39481sT != null) {
                        C39471sS F6b = interfaceC39481sT.F6b();
                        anonymousClass182.A0d();
                        String str = F6b.A01;
                        if (str != null) {
                            anonymousClass182.A0S("comparator", str);
                        }
                        String str2 = F6b.A02;
                        if (str2 != null) {
                            anonymousClass182.A0S("lhs", str2);
                        }
                        Long l = F6b.A00;
                        if (l != null) {
                            anonymousClass182.A0R("rhs", l.longValue());
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            String str3 = c39491sU.A00;
            if (str3 != null) {
                anonymousClass182.A0S("signal", str3);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
