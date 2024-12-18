package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.Vz8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69989Vz8 {
    public static C67842UzF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C67842UzF c67842UzF = new C67842UzF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("viewer_count".equals(A0s)) {
                    c67842UzF.A02 = c16l.A1D();
                } else {
                    HashSet hashSet = null;
                    ArrayList arrayList = null;
                    if (AbstractC111324zv.A00(557).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c67842UzF.A08 = arrayList;
                    } else if (AbstractC111324zv.A00(546).equals(A0s)) {
                        c67842UzF.A01 = c16l.A1D();
                    } else if ("broadcast_status".equals(A0s)) {
                        c67842UzF.A03 = AbstractC109124vc.A00(c16l.A1Q());
                    } else if ("is_policy_violation".equals(A0s)) {
                        c67842UzF.A0D = c16l.A0d();
                    } else if ("policy_violation_reason".equals(A0s)) {
                        c67842UzF.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("is_top_live_eligible".equals(A0s)) {
                        c67842UzF.A0F = c16l.A0d();
                    } else if ("cobroadcaster_ids".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, hashSet);
                            }
                        }
                        c67842UzF.A09 = hashSet;
                    } else if (MSV.A00(535).equals(A0s)) {
                        c67842UzF.A00 = c16l.A1D();
                    } else if ("live_resource".equals(A0s)) {
                        c67842UzF.A06 = AbstractC54257Nyc.parseFromJson(c16l);
                    } else if ("request_to_join_enabled".equals(A0s)) {
                        c67842UzF.A0G = c16l.A0d();
                    } else if ("cmp_policy_violation".equals(A0s)) {
                        c67842UzF.A0A = c16l.A0d();
                    } else if (AbstractC111324zv.A00(455).equals(A0s)) {
                        c67842UzF.A0C = c16l.A0d();
                    } else if ("is_moderated_session".equals(A0s)) {
                        c67842UzF.A0B = c16l.A0d();
                    } else if ("sup_active".equals(A0s)) {
                        c67842UzF.A0E = c16l.A0d();
                    } else if ("charity".equals(A0s)) {
                        c67842UzF.A04 = VXL.parseFromJson(c16l);
                    } else if ("user_pay_info".equals(A0s)) {
                        c67842UzF.A05 = IAO.parseFromJson(c16l);
                    } else if ("user_pay_max_amount_reached".equals(A0s)) {
                        c67842UzF.A0H = c16l.A0d();
                    } else {
                        C55702hA.A01(c16l, c67842UzF, A0s);
                    }
                }
                c16l.A0z();
            }
            return c67842UzF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
