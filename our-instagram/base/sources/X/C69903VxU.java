package X;

import java.io.IOException;

/* renamed from: X.VxU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69903VxU {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.UzA, X.1um, X.1ul] */
    public static C67837UzA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("prevalidation_success".equals(A0s)) {
                    c40791um.A06 = c16l.A0d();
                } else if ("prevalidation_error".equals(A0s)) {
                    c40791um.A04 = AbstractC40540HyM.parseFromJson(c16l);
                } else if ("init_info".equals(A0s)) {
                    c40791um.A03 = AbstractC68449VRf.parseFromJson(c16l);
                } else if ("prefill_info".equals(A0s)) {
                    c40791um.A05 = AbstractC68450VRg.parseFromJson(c16l);
                } else if ("coupon_info".equals(A0s)) {
                    c40791um.A02 = C69919Vxk.parseFromJson(c16l);
                } else if (AbstractC58317Pt9.A00(905).equals(A0s)) {
                    c40791um.A00 = AbstractC40136Hr4.parseFromJson(c16l);
                } else if ("error".equals(A0s)) {
                    c40791um.A01 = AbstractC40190HsA.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
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
