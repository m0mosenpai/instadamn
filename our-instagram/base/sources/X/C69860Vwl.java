package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vwl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69860Vwl {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.UyS, X.1um, X.1ul] */
    public static C67793UyS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("daily_time_limit_without_extensions_seconds".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("guardian_daily_limit".equals(A0s)) {
                    c40791um.A03 = AbstractC166997dE.A0h(c16l);
                } else if ("latest_valid_time_limit_extension_request".equals(A0s)) {
                    c40791um.A01 = AbstractC128115qf.parseFromJson(c16l);
                } else if ("quiet_time_intervals".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            URF parseFromJson = HsL.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A00 = new UQq(c40791um.A01, c40791um.A02, c40791um.A03, c40791um.A04);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
