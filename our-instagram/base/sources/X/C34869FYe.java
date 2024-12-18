package X;

import com.instagram.api.schemas.ScreenTimeScreenType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FYe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34869FYe {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.ECy, X.1um, X.1ul] */
    public static C32203ECy parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("aggregated_screen_time_per_day".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Long A0h = AbstractC31173DnH.A0h(c16l);
                            if (A0h != null) {
                                arrayList.add(A0h);
                            }
                        }
                    }
                    c40791um.A02 = arrayList;
                } else if ("screen_time_by_screen_keys".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            ScreenTimeScreenType screenTimeScreenType = (ScreenTimeScreenType) ScreenTimeScreenType.A01.get(A1P);
                            if (screenTimeScreenType == null) {
                                screenTimeScreenType = ScreenTimeScreenType.A05;
                            }
                            A1E.add(screenTimeScreenType);
                        }
                        arrayList = A1E;
                    }
                    c40791um.A00 = arrayList;
                } else if ("screen_time_by_screen_values".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Long A0h2 = AbstractC31173DnH.A0h(c16l);
                            if (A0h2 != null) {
                                arrayList.add(A0h2);
                            }
                        }
                    }
                    c40791um.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
