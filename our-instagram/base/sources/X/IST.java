package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class IST {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.HAn, X.1um, X.1ul] */
    public static C38891HAn parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("pending_request_content".equals(A0s)) {
                    C41191ILf parseFromJson = I6Y.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c40791um.A02 = parseFromJson;
                } else if ("declined_request_content".equals(A0s)) {
                    C41191ILf parseFromJson2 = I6Y.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c40791um.A01 = parseFromJson2;
                } else if ("recently_edited_content".equals(A0s)) {
                    C41191ILf parseFromJson3 = I6Y.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson3, 0);
                    c40791um.A03 = parseFromJson3;
                } else if ("approved_media_content".equals(A0s)) {
                    IFR parseFromJson4 = I6W.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson4, 0);
                    c40791um.A00 = parseFromJson4;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
