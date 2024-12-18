package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.4y7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110354y7 {
    public static C110394yB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            Integer num = null;
            ArrayList arrayList = null;
            String str4 = null;
            C39561sd c39561sd = null;
            Boolean bool2 = null;
            HashMap hashMap = null;
            Integer num2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    if ("active_group_id".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str = null;
                        } else {
                            str = c16l.A1P();
                        }
                    } else if ("connected_group_id".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str2 = null;
                        } else {
                            str2 = c16l.A1P();
                        }
                    } else if ("enable_sticky_header".equals(A0q)) {
                        bool = Boolean.valueOf(c16l.A0d());
                    } else if ("format".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str3 = null;
                        } else {
                            str3 = c16l.A1P();
                        }
                    } else if ("global_position".equals(A0q)) {
                        num = Integer.valueOf(c16l.A1D());
                    } else if ("groups".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C110374y9 parseFromJson = AbstractC110364y8.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                            str4 = null;
                        } else {
                            str4 = c16l.A1P();
                        }
                    } else if ("item_client_gap_rules".equals(A0q)) {
                        c39561sd = AbstractC39551sc.parseFromJson(c16l);
                    } else if ("remember_group_choice".equals(A0q)) {
                        bool2 = Boolean.valueOf(c16l.A0d());
                    } else if ("style".equals(A0q)) {
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
                    } else if ("view_state_item_type".equals(A0q)) {
                        num2 = Integer.valueOf(c16l.A1D());
                    }
                    c16l.A0z();
                } else {
                    return new C110394yB(c39561sd, bool, bool2, num, num2, str, str2, str3, str4, hashMap, arrayList);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
