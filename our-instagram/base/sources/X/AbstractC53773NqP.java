package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.venue.LocationDict;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NqP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53773NqP {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.N2R, X.1um, X.1ul] */
    public static N2R parseFromJson(C16L c16l) {
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
                if ("rank_token".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if (TraceFieldType.RequestID.equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("venues".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            LocationDict parseFromJson = AbstractC84373pU.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A03 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A01;
            C14360o3.A0A(str);
            String str2 = c40791um.A02;
            C14360o3.A0A(str2);
            List list = c40791um.A03;
            C14360o3.A0A(list);
            c40791um.A00 = new C51594Mqm(str, str2, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
