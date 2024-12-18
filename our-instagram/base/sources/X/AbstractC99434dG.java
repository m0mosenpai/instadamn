package X;

import com.instagram.api.schemas.TIFUAppDestinationEnum;
import java.io.IOException;

/* renamed from: X.4dG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99434dG {
    public static C4dL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C99454dJ c99454dJ = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C99454dJ c99454dJ2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("installed_destination".equals(A0q)) {
                    c99454dJ = AbstractC99444dH.parseFromJson(c16l);
                } else if ("uninstalled_destination".equals(A0q)) {
                    c99454dJ2 = AbstractC99444dH.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C4dL(c99454dJ, c99454dJ2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C4dL c4dL) {
        anonymousClass182.A0d();
        InterfaceC99464dK interfaceC99464dK = c4dL.A00;
        if (interfaceC99464dK != null) {
            anonymousClass182.A0r("installed_destination");
            C99454dJ F2m = interfaceC99464dK.F2m();
            anonymousClass182.A0d();
            TIFUAppDestinationEnum tIFUAppDestinationEnum = F2m.A00;
            if (tIFUAppDestinationEnum != null) {
                anonymousClass182.A0S("landing_site", tIFUAppDestinationEnum.A00);
            }
            String str = F2m.A01;
            if (str != null) {
                anonymousClass182.A0S("url", str);
            }
            anonymousClass182.A0a();
        }
        InterfaceC99464dK interfaceC99464dK2 = c4dL.A01;
        if (interfaceC99464dK2 != null) {
            anonymousClass182.A0r("uninstalled_destination");
            C99454dJ F2m2 = interfaceC99464dK2.F2m();
            anonymousClass182.A0d();
            TIFUAppDestinationEnum tIFUAppDestinationEnum2 = F2m2.A00;
            if (tIFUAppDestinationEnum2 != null) {
                anonymousClass182.A0S("landing_site", tIFUAppDestinationEnum2.A00);
            }
            String str2 = F2m2.A01;
            if (str2 != null) {
                anonymousClass182.A0S("url", str2);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
