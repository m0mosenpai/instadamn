package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Vyb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69960Vyb {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.UzJ, X.1um, X.1ul] */
    public static C67845UzJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    c40791um.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("phone".equals(A0s)) {
                    c40791um.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("website".equals(A0s)) {
                    c40791um.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("category".equals(A0s)) {
                    c40791um.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("price_range".equals(A0s)) {
                    c40791um.A03 = AbstractC166997dE.A0h(c16l);
                } else if ("location_address".equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("location_city".equals(A0s)) {
                    c40791um.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("location_region".equals(A0s)) {
                    c40791um.A04 = AbstractC166997dE.A0h(c16l);
                } else if ("location_zip".equals(A0s)) {
                    c40791um.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("ig_business".equals(A0s)) {
                    c40791um.A00 = VVI.parseFromJson(c16l);
                } else if ("hours".equals(A0s)) {
                    c40791um.A01 = VVJ.parseFromJson(c16l);
                } else if ("has_menu".equals(A0s)) {
                    c40791um.A0C = c16l.A0d();
                } else if ("facebook_places_id".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("num_guides".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0h(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
