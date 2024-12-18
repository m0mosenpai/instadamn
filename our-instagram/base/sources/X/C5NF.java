package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5NF, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5NF {
    public static C5NG parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C5NG c5ng = new C5NG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("asset_type".equals(A0q)) {
                    c5ng.A01 = (C5NH) C5NH.A01.get(c16l.A1Q());
                } else {
                    String str = null;
                    String str2 = null;
                    ArrayList arrayList = null;
                    String str3 = null;
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c5ng.A03 = str2;
                    } else if ("ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList.add(A1P);
                                }
                            }
                        }
                        c5ng.A06 = arrayList;
                    } else if ("story_sticker_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        c5ng.A04 = str3;
                    } else if ("story_sticker_type".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c5ng.A05 = str;
                    } else if ("selected_index".equals(A0q)) {
                        c5ng.A00 = c16l.A1D();
                    } else if ("is_outside_suggested_margins".equals(A0q)) {
                        c5ng.A02 = Boolean.valueOf(c16l.A0d());
                    }
                }
                c16l.A0z();
            }
            return c5ng;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5NG c5ng) {
        anonymousClass182.A0d();
        C5NH c5nh = c5ng.A01;
        if (c5nh != null) {
            anonymousClass182.A0S("asset_type", c5nh.A00);
        }
        String str = c5ng.A03;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        if (c5ng.A06 != null) {
            C16V.A03(anonymousClass182, "ids");
            for (String str2 : c5ng.A06) {
                if (str2 != null) {
                    anonymousClass182.A0u(str2);
                }
            }
            anonymousClass182.A0Z();
        }
        String str3 = c5ng.A04;
        if (str3 != null) {
            anonymousClass182.A0S("story_sticker_id", str3);
        }
        String str4 = c5ng.A05;
        if (str4 != null) {
            anonymousClass182.A0S("story_sticker_type", str4);
        }
        anonymousClass182.A0Q("selected_index", c5ng.A00);
        Boolean bool = c5ng.A02;
        if (bool != null) {
            anonymousClass182.A0T("is_outside_suggested_margins", bool.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
