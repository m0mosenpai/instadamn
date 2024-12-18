package X;

import java.io.IOException;

/* renamed from: X.A1z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22755A1z {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.AlH] */
    public static C24025AlH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2739).equals(A0s)) {
                    obj.A04 = A21.A00(c16l.A1Q());
                } else if ("music_sticker_model".equals(A0s)) {
                    obj.EZN(C4A1.parseFromJson(c16l));
                } else if (AbstractC111324zv.A00(1117).equals(A0s)) {
                    C38059Gom parseFromJson = AbstractC38058Gol.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    obj.A01 = parseFromJson;
                } else if ("text_color".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
