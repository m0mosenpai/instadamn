package X;

import java.io.IOException;

/* renamed from: X.5QN, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5QN {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.5QO, java.lang.Object] */
    public static C5QO parseFromJson(C16L c16l) {
        Integer num;
        String A1P;
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
                if ("span_start".equals(A0q)) {
                    obj.A02 = c16l.A1D();
                } else if ("span_end".equals(A0q)) {
                    obj.A00 = c16l.A1D();
                } else if ("span_flags".equals(A0q)) {
                    obj.A01 = c16l.A1D();
                } else if ("metadata_model".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    obj.A04 = A1P;
                } else if ("metadata_model_type".equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    Integer[] A00 = C05F.A00(24);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (C14360o3.A0K(C5QP.A00(num), A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            num = null;
                            break;
                        }
                    }
                    C14360o3.A0B(num, 0);
                    obj.A03 = num;
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
