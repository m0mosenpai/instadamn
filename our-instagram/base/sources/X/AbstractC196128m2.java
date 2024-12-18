package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.8m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196128m2 {
    public static C130295uZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C130295uZ c130295uZ = new C130295uZ();
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
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    HashMap hashMap = null;
                    String str = null;
                    ArrayList arrayList = null;
                    if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        c130295uZ.A01 = str;
                    } else if ("identity_mapping".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C196148m4 parseFromJson = AbstractC196138m3.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c130295uZ.A03 = arrayList;
                    } else if ("custom_data".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    String A1P2 = c16l.A1P();
                                    if (A1P2 != null) {
                                        hashMap2.put(A1P, A1P2);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        C14360o3.A0B(hashMap, 0);
                        c130295uZ.A02 = hashMap;
                    } else if ("last_update_time_ms".equals(A0q)) {
                        c130295uZ.A00 = c16l.A0y();
                    }
                    c16l.A0z();
                } else {
                    return c130295uZ;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
