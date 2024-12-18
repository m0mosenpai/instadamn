package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.INm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41246INm {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.H9M, X.1um, X.1ul] */
    public static H9M parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("carousel_medias".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("more_carousel_media_available".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("total_carousel_media_count".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("validated_product_cursor".equals(A0s)) {
                    c40791um.A03 = AbstractC166997dE.A0h(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A04;
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A01);
            Integer num = c40791um.A02;
            C14360o3.A0A(num);
            c40791um.A00 = new H2Y(c40791um.A03, list, num.intValue(), A1b);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
