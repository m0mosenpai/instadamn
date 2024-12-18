package X;

import com.instagram.api.schemas.Phrase;
import com.instagram.api.schemas.WordOffsetImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HrB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40142HrB {
    public static Phrase parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(915).equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("phrase".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("start_time_in_ms".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("word_offsets".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            WordOffsetImpl parseFromJson = AbstractC40456Hwl.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new Phrase(num, num2, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
