package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FBW {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.FLJ, java.lang.Object] */
    public static FLJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("button_text".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A01 = A0m;
                } else if ("destination".equals(A0s)) {
                    EnumC33387EpK enumC33387EpK = (EnumC33387EpK) EnumC33387EpK.A01.get(AbstractC167017dG.A0m(c16l));
                    if (enumC33387EpK == null) {
                        enumC33387EpK = EnumC33387EpK.A04;
                    }
                    obj.A00 = enumC33387EpK;
                } else if ("url".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
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
