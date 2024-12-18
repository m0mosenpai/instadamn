package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VVO {
    public static C69713Vu8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69713Vu8 c69713Vu8 = new C69713Vu8();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_id".equals(A0s)) {
                    c69713Vu8.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("operation_type".equals(A0s)) {
                    c69713Vu8.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("timestamp_ms".equals(A0s)) {
                    c69713Vu8.A00 = c16l.A0y();
                } else if ("item_type".equals(A0s)) {
                    c69713Vu8.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("operation_metadata".equals(A0s)) {
                    c69713Vu8.A02 = VVN.parseFromJson(c16l);
                } else if ("item_metadata".equals(A0s)) {
                    c69713Vu8.A01 = VVM.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(493).equals(A0s)) {
                    c69713Vu8.A06 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c69713Vu8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
