package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class ADM {
    public static AGB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            AGB agb = new AGB();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    agb.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("uri".equals(A0s)) {
                    agb.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("cache_key".equals(A0s)) {
                    agb.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("string_identifiers".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    agb.A03 = arrayList;
                }
                c16l.A0z();
            }
            return agb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AGB agb) {
        anonymousClass182.A0d();
        String str = agb.A01;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        String str2 = agb.A02;
        if (str2 != null) {
            anonymousClass182.A0S("uri", str2);
        }
        String str3 = agb.A00;
        if (str3 != null) {
            anonymousClass182.A0S("cache_key", str3);
        }
        if (agb.A03 != null) {
            C16V.A03(anonymousClass182, "string_identifiers");
            Iterator it = agb.A03.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
