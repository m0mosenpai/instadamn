package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VxO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69897VxO {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.UzC, X.1um, X.1ul] */
    public static C67839UzC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_next".equals(A0s)) {
                    c40791um.A07 = c16l.A0d();
                } else if ("has_created_lead_ad".equals(A0s)) {
                    c40791um.A06 = c16l.A0d();
                } else if ("error".equals(A0s)) {
                    c40791um.A03 = AbstractC40190HsA.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("promotions".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C70654Wea parseFromJson = AbstractC68452VRi.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A05 = arrayList;
                    } else if ("draft_promotions".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C70653WeZ parseFromJson2 = AbstractC68444VRa.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c40791um.A04 = arrayList;
                    } else if ("total_promotions_for_section".equals(A0s)) {
                        c40791um.A00 = c16l.A1D();
                    } else if ("total_promotions_for_user".equals(A0s)) {
                        c40791um.A01 = c16l.A1D();
                    } else if ("total_unread_leads_count".equals(A0s)) {
                        c40791um.A02 = c16l.A1D();
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
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
