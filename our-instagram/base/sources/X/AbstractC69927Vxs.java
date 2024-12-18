package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Vxs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69927Vxs {
    public static C69479Vo2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69479Vo2 c69479Vo2 = new C69479Vo2();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("ts_insertion".equals(A0s)) {
                        c69479Vo2.A04 = c16l.A0y();
                    } else if ("ts_eviction".equals(A0s)) {
                        c69479Vo2.A02 = c16l.A0y();
                    } else if ("ts_first_access".equals(A0s)) {
                        c69479Vo2.A03 = c16l.A0y();
                    } else if ("ts_last_access".equals(A0s)) {
                        c69479Vo2.A05 = c16l.A0y();
                    } else {
                        HashMap hashMap = null;
                        if ("module".equals(A0s)) {
                            c69479Vo2.A0D = AbstractC167017dG.A0m(c16l);
                        } else if ("size".equals(A0s)) {
                            c69479Vo2.A07 = c16l.A0y();
                        } else if ("insertion_reason".equals(A0s)) {
                            c69479Vo2.A0A = AbstractC167017dG.A0m(c16l);
                        } else if ("eviction_reason".equals(A0s)) {
                            c69479Vo2.A09 = AbstractC167017dG.A0m(c16l);
                        } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                            EnumC68203VFv enumC68203VFv = (EnumC68203VFv) EnumC68203VFv.A01.get(c16l.A1Q());
                            if (enumC68203VFv == null) {
                                enumC68203VFv = EnumC68203VFv.A06;
                            }
                            c69479Vo2.A08 = enumC68203VFv;
                        } else if ("num_hits".equals(A0s)) {
                            c69479Vo2.A00 = c16l.A1D();
                        } else if ("accessed".equals(A0s)) {
                            c69479Vo2.A0G = c16l.A0d();
                        } else if ("start_position".equals(A0s)) {
                            c69479Vo2.A06 = c16l.A0y();
                        } else if ("end_position".equals(A0s)) {
                            c69479Vo2.A01 = c16l.A0y();
                        } else if ("item_id".equals(A0s)) {
                            c69479Vo2.A0B = AbstractC167017dG.A0m(c16l);
                        } else if ("item_url".equals(A0s)) {
                            c69479Vo2.A0C = AbstractC167017dG.A0m(c16l);
                        } else if ("exif_data".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                hashMap = new HashMap();
                                while (c16l.A1J() != c16r2) {
                                    AbstractC31179DnN.A1F(c16l, hashMap);
                                }
                            }
                            c69479Vo2.A0F = hashMap;
                        } else if ("xmp_data".equals(A0s)) {
                            c69479Vo2.A0E = AbstractC167017dG.A0m(c16l);
                        }
                    }
                    c16l.A0z();
                } else {
                    return c69479Vo2;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C69479Vo2 c69479Vo2) {
        anonymousClass182.A0d();
        anonymousClass182.A0R("ts_insertion", c69479Vo2.A04);
        anonymousClass182.A0R("ts_eviction", c69479Vo2.A02);
        anonymousClass182.A0R("ts_first_access", c69479Vo2.A03);
        anonymousClass182.A0R("ts_last_access", c69479Vo2.A05);
        String str = c69479Vo2.A0D;
        if (str != null) {
            anonymousClass182.A0S("module", str);
        }
        anonymousClass182.A0R("size", c69479Vo2.A07);
        String str2 = c69479Vo2.A0A;
        if (str2 != null) {
            anonymousClass182.A0S("insertion_reason", str2);
        }
        String str3 = c69479Vo2.A09;
        if (str3 != null) {
            anonymousClass182.A0S("eviction_reason", str3);
        }
        EnumC68203VFv enumC68203VFv = c69479Vo2.A08;
        if (enumC68203VFv != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, enumC68203VFv.toString());
        }
        anonymousClass182.A0Q("num_hits", c69479Vo2.A00);
        anonymousClass182.A0T("accessed", c69479Vo2.A0G);
        anonymousClass182.A0R("start_position", c69479Vo2.A06);
        anonymousClass182.A0R("end_position", c69479Vo2.A01);
        String str4 = c69479Vo2.A0B;
        if (str4 != null) {
            anonymousClass182.A0S("item_id", str4);
        }
        String str5 = c69479Vo2.A0C;
        if (str5 != null) {
            anonymousClass182.A0S("item_url", str5);
        }
        if (c69479Vo2.A0F != null) {
            anonymousClass182.A0r("exif_data");
            anonymousClass182.A0d();
            Iterator A14 = AbstractC166997dE.A14(c69479Vo2.A0F);
            while (A14.hasNext()) {
                Map.Entry entry = (Map.Entry) A14.next();
                if (!C16V.A04(anonymousClass182, entry)) {
                    anonymousClass182.A0u((String) entry.getValue());
                }
            }
            anonymousClass182.A0a();
        }
        String str6 = c69479Vo2.A0E;
        if (str6 != null) {
            anonymousClass182.A0S("xmp_data", str6);
        }
        anonymousClass182.A0a();
    }
}
