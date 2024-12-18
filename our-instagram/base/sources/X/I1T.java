package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1T {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.IEk, java.lang.Object] */
    public static C41015IEk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("tile_tap_target".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1H(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            String str = obj.A01;
            C14360o3.A0B(str, 0);
            EnumC39561HdX.A01.get(str);
            EnumC39560HdW.A01.get(obj.A00);
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
