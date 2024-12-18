package X;

import com.instagram.api.schemas.ClipsSpinSwappableElementType;
import java.io.IOException;

/* renamed from: X.INq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41250INq {
    public static C38699H2k parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ClipsSpinSwappableElementType clipsSpinSwappableElementType = null;
            C38700H2l c38700H2l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("element_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("element_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsSpinSwappableElementType = (ClipsSpinSwappableElementType) ClipsSpinSwappableElementType.A01.get(A1P);
                    if (clipsSpinSwappableElementType == null) {
                        clipsSpinSwappableElementType = ClipsSpinSwappableElementType.A05;
                    }
                } else if ("swappable_text".equals(A0s)) {
                    c38700H2l = AbstractC41251INr.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38699H2k(clipsSpinSwappableElementType, c38700H2l, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38699H2k c38699H2k) {
        anonymousClass182.A0d();
        String str = c38699H2k.A02;
        if (str != null) {
            anonymousClass182.A0S("element_id", str);
        }
        ClipsSpinSwappableElementType clipsSpinSwappableElementType = c38699H2k.A00;
        if (clipsSpinSwappableElementType != null) {
            anonymousClass182.A0S("element_type", clipsSpinSwappableElementType.A00);
        }
        InterfaceC43579JMn interfaceC43579JMn = c38699H2k.A01;
        if (interfaceC43579JMn != null) {
            anonymousClass182.A0r("swappable_text");
            AbstractC41251INr.A00(anonymousClass182, interfaceC43579JMn.Es6());
        }
        anonymousClass182.A0a();
    }
}
