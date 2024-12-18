package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import java.io.IOException;

/* renamed from: X.Vxx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69932Vxx {
    public static US9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            US9 us9 = new US9();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("written".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    us9.A06 = A0m;
                } else if ("confidence".equals(A0s)) {
                    us9.A00 = (float) c16l.A0U();
                } else if ("startTimeMs".equals(A0s)) {
                    us9.A04 = c16l.A1D();
                } else if ("endTimeMs".equals(A0s)) {
                    us9.A02 = c16l.A1D();
                } else if ("profanity".equals(A0s)) {
                    us9.A07 = c16l.A0d();
                } else if ("offset".equals(A0s)) {
                    us9.A03 = c16l.A1D();
                } else if (Location.SPEED.equals(A0s)) {
                    us9.A01 = (float) c16l.A0U();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    us9.A05 = A0m2;
                }
                c16l.A0z();
            }
            return us9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, US9 us9) {
        anonymousClass182.A0d();
        String str = us9.A06;
        if (str != null) {
            anonymousClass182.A0S("written", str);
        }
        anonymousClass182.A0P("confidence", us9.A00);
        anonymousClass182.A0Q("startTimeMs", us9.A04);
        anonymousClass182.A0Q("endTimeMs", us9.A02);
        anonymousClass182.A0T("profanity", us9.A07);
        anonymousClass182.A0Q("offset", us9.A03);
        anonymousClass182.A0P(Location.SPEED, us9.A01);
        AbstractC37301Gc2.A1D(anonymousClass182, us9.A05);
        anonymousClass182.A0a();
    }
}
