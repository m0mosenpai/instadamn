package X;

import com.instagram.api.schemas.NativeInfoCardTextAlignment;
import java.io.IOException;

/* renamed from: X.IOa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41259IOa {
    public static H4N parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            NativeInfoCardTextAlignment nativeInfoCardTextAlignment = null;
            Float f = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("alignment".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    nativeInfoCardTextAlignment = (NativeInfoCardTextAlignment) NativeInfoCardTextAlignment.A01.get(A1P);
                    if (nativeInfoCardTextAlignment == null) {
                        nativeInfoCardTextAlignment = NativeInfoCardTextAlignment.A04;
                    }
                } else if ("font_size".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("max_number_of_lines".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H4N(nativeInfoCardTextAlignment, f, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H4N h4n) {
        anonymousClass182.A0d();
        NativeInfoCardTextAlignment nativeInfoCardTextAlignment = h4n.A00;
        if (nativeInfoCardTextAlignment != null) {
            anonymousClass182.A0S("alignment", nativeInfoCardTextAlignment.A00);
        }
        Float f = h4n.A01;
        if (f != null) {
            anonymousClass182.A0P("font_size", f.floatValue());
        }
        Integer num = h4n.A02;
        if (num != null) {
            anonymousClass182.A0Q("max_number_of_lines", num.intValue());
        }
        AbstractC37301Gc2.A1E(anonymousClass182, h4n.A03);
        String str = h4n.A04;
        if (str != null) {
            anonymousClass182.A0S("text_color", str);
        }
        anonymousClass182.A0a();
    }
}
