package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.I9m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40888I9m {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.IJq, java.lang.Object] */
    public static C41151IJq parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if (AbstractC43591JPw.A00(73).equals(A0s)) {
                        obj.A00 = c16l.A0y();
                    } else {
                        HashMap hashMap = null;
                        if (AbstractC111324zv.A00(3042).equals(A0s)) {
                            obj.A04 = AbstractC167017dG.A0m(c16l);
                        } else if (AbstractC111324zv.A00(3036).equals(A0s)) {
                            obj.A03 = AbstractC167017dG.A0m(c16l);
                        } else if ("radio_type".equals(A0s)) {
                            obj.A02 = AbstractC167017dG.A0m(c16l);
                        } else if (AbstractC111324zv.A00(3043).equals(A0s)) {
                            String A1Q = c16l.A1Q();
                            if (A1Q.equals("MEDIA")) {
                                num = C05F.A00;
                            } else if (A1Q.equals("PRODUCT")) {
                                num = C05F.A01;
                            } else if (A1Q.equals("LOCATION")) {
                                num = C05F.A0C;
                            } else if (A1Q.equals("EFFECT")) {
                                num = C05F.A0N;
                            } else {
                                throw AbstractC166987dD.A12(A1Q);
                            }
                            obj.A01 = num;
                        } else if ("params".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                hashMap = AbstractC166987dD.A1G();
                                while (c16l.A1J() != c16r2) {
                                    AbstractC31179DnN.A1F(c16l, hashMap);
                                }
                            }
                            obj.A05 = hashMap;
                        }
                    }
                    c16l.A0z();
                } else {
                    return obj;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
