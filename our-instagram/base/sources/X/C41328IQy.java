package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IQy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41328IQy {
    public static HA2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HA2 ha2 = new HA2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("thumbnails".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    ha2.A00 = arrayList;
                } else if ("title_prefill".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else {
                    C55702hA.A01(c16l, ha2, A0s);
                }
                c16l.A0z();
            }
            return ha2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
