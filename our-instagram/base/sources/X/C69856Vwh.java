package X;

import java.io.IOException;

/* renamed from: X.Vwh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69856Vwh {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.UyV, X.1um, X.1ul] */
    public static C67796UyV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_id".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("ads_group_id".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("campaign_control".equals(A0s)) {
                    c40791um.A01 = VOH.parseFromJson(c16l);
                } else if (AbstractC43591JPw.A00(1057).equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("should_banner_dismissed".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A03;
            String str2 = c40791um.A04;
            c40791um.A00 = new UP9(c40791um.A01, c40791um.A02, str, str2, c40791um.A05);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
