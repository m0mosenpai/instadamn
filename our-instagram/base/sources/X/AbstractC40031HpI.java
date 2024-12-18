package X;

import com.instagram.api.schemas.InlineStyleAtRangeDict;
import java.io.IOException;

/* renamed from: X.HpI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40031HpI {
    public static InlineStyleAtRangeDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC58317Pt9.A00(110).equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("length".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, "offset");
                }
                c16l.A0z();
            }
            return new InlineStyleAtRangeDict(num, num2, num3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
