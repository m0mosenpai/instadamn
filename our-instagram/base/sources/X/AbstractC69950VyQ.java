package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.VyQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69950VyQ {
    public static C69006Vfi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69006Vfi c69006Vfi = new C69006Vfi();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("text".equals(A0s)) {
                    c69006Vfi.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("ranges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69126ViH parseFromJson = VV0.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69006Vfi.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c69006Vfi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C69006Vfi c69006Vfi) {
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1E(anonymousClass182, c69006Vfi.A00);
        if (c69006Vfi.A01 != null) {
            C16V.A03(anonymousClass182, "ranges");
            for (C69126ViH c69126ViH : c69006Vfi.A01) {
                if (c69126ViH != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("length", c69126ViH.A00);
                    anonymousClass182.A0Q("offset", c69126ViH.A01);
                    if (c69126ViH.A02 != null) {
                        anonymousClass182.A0r("entity");
                        C69358Vm4 c69358Vm4 = c69126ViH.A02;
                        anonymousClass182.A0d();
                        String str = c69358Vm4.A03;
                        if (str != null) {
                            anonymousClass182.A0S("__typename", str);
                        }
                        AbstractC37301Gc2.A1D(anonymousClass182, c69358Vm4.A00);
                        String str2 = c69358Vm4.A01;
                        if (str2 != null) {
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
                        }
                        String str3 = c69358Vm4.A02;
                        if (str3 != null) {
                            anonymousClass182.A0S("tag", str3);
                        }
                        String str4 = c69358Vm4.A04;
                        if (str4 != null) {
                            anonymousClass182.A0S("url", str4);
                        }
                        if (c69358Vm4.A05 != null) {
                            C16V.A03(anonymousClass182, "android_urls");
                            Iterator it = c69358Vm4.A05.iterator();
                            while (it.hasNext()) {
                                AbstractC167017dG.A1F(anonymousClass182, it);
                            }
                            anonymousClass182.A0Z();
                        }
                        anonymousClass182.A0a();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
