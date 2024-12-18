package X;

import java.io.IOException;

/* renamed from: X.I7m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40836I7m {
    public static C38688GzT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38688GzT c38688GzT = new C38688GzT(21);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("content".equals(A0s)) {
                    C38685GzQ parseFromJson = AbstractC40835I7l.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c38688GzT.A00 = parseFromJson;
                } else if ("metadata".equals(A0s)) {
                    C51759Mti parseFromJson2 = AbstractC40831I7h.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c38688GzT.A02 = parseFromJson2;
                } else if ("rich_destination".equals(A0s)) {
                    C41163IKc parseFromJson3 = I82.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson3, 0);
                    c38688GzT.A03 = parseFromJson3;
                } else if ("logging_info".equals(A0s)) {
                    C38685GzQ parseFromJson4 = AbstractC40832I7i.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson4, 0);
                    c38688GzT.A01 = parseFromJson4;
                }
                c16l.A0z();
            }
            return c38688GzT;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
