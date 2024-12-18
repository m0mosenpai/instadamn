package X;

import com.instagram.leadgen.core.api.LeadForm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IQm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41316IQm {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.H9R, X.1um, X.1ul] */
    public static H9R parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC43591JPw.A00(786).equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            LeadForm parseFromJson = AbstractC40689I1v.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("error".equals(A0s)) {
                    c40791um.A02 = AbstractC40690I1w.parseFromJson(c16l);
                } else if ("page_info".equals(A0s)) {
                    c40791um.A01 = AbstractC40688I1u.parseFromJson(c16l);
                } else if ("suggested_media".equals(A0s)) {
                    c40791um.A03 = AbstractC40692I1y.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A04;
            c40791um.A00 = new C51839Mvh(c40791um.A01, c40791um.A02, c40791um.A03, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
