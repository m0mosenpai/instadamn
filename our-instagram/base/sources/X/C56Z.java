package X;

import java.io.IOException;

/* renamed from: X.56Z, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C56Z {
    /* JADX WARN: Type inference failed for: r0v7, types: [X.56d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.56a, java.lang.Object] */
    public static C1124756a parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("progressive".equals(A0q)) {
                    obj.A01 = AbstractC1124856b.parseFromJson(c16l);
                } else if ("segmented".equals(A0q)) {
                    obj.A02 = AbstractC54083Nvh.parseFromJson(c16l);
                } else if ("armadillo_express".equals(A0q)) {
                    obj.A00 = AbstractC54076Nva.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            AbstractC1125056d[] abstractC1125056dArr = {obj.A01, obj.A02, obj.A00};
            int i = 0;
            int i2 = 0;
            do {
                if (abstractC1125056dArr[i] != null) {
                    i2++;
                }
                i++;
            } while (i < 3);
            if (i2 != 1) {
                C1124756a.A00(new Object(), obj);
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
