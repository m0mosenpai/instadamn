package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126465nh {
    public static C206209Bd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            HashMap hashMap = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    if ("visible".equals(A0q)) {
                        bool = Boolean.valueOf(c16l.A0d());
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                        num = Integer.valueOf(c16l.A1D());
                    } else if ("data".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            hashMap = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap.put(A1P, null);
                                } else {
                                    String A1P2 = c16l.A1P();
                                    if (A1P2 != null) {
                                        hashMap.put(A1P, A1P2);
                                    }
                                }
                            }
                        } else {
                            hashMap = null;
                        }
                    }
                    c16l.A0z();
                } else {
                    return new C206209Bd(6, num, bool, hashMap);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C206209Bd c206209Bd, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        Boolean bool = (Boolean) c206209Bd.A02;
        if (bool != null) {
            anonymousClass182.A0T("visible", bool.booleanValue());
        }
        Number number = (Number) c206209Bd.A01;
        if (number != null) {
            anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, number.intValue());
        }
        AbstractMap abstractMap = (AbstractMap) c206209Bd.A00;
        if (abstractMap != null) {
            anonymousClass182.A0r("data");
            anonymousClass182.A0d();
            for (Map.Entry entry : abstractMap.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry)) {
                    anonymousClass182.A0u((String) entry.getValue());
                }
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
