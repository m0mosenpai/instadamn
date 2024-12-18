package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VT5 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.VfH] */
    public static C68979VfH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("conditions".equals(A0s)) {
                    VEG veg = (VEG) VEG.A01.get(c16l.A1Q());
                    if (veg == null) {
                        veg = VEG.A0g;
                    }
                    obj.A00 = veg;
                } else if ("temp_celsius".equals(A0s)) {
                    obj.A01 = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
