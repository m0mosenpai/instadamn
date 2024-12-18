package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F94 {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.FGs, java.lang.Object] */
    public static C34454FGs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            SimpleImageUrl simpleImageUrl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(1102).equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if (MSV.A00(230).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (simpleImageUrl != null) {
                obj.A00 = simpleImageUrl;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
