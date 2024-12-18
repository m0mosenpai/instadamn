package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FUV {
    public static C9CL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38321qM c38321qM = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media".equals(A0s)) {
                    c38321qM = C38321qM.A0h.A0C(c16l, true, true);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(497).equals(A0s)) {
                    String A1P = c16l.A1P();
                    Integer[] A00 = C05F.A00(2);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            if (!C14360o3.A0K(F7T.A00(num), A1P)) {
                                i++;
                            }
                        } else {
                            num = null;
                            break;
                        }
                    }
                } else if ("carousel_share_child_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (MSV.A00(109).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (c38321qM == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media", c16l, "DirectMediaShare");
                throw C00O.createAndThrow();
            }
            return new C9CL(c38321qM, num, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C9CL c9cl, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        C38321qM c38321qM = (C38321qM) c9cl.A00;
        if (c38321qM != null) {
            anonymousClass182.A0r("media");
            C38801rC c38801rC = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        String str = c9cl.A04;
        if (str != null) {
            anonymousClass182.A0S("text", str);
        }
        Integer num = (Integer) c9cl.A01;
        if (num != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(497), F7T.A00(num));
        }
        String str2 = c9cl.A02;
        if (str2 != null) {
            anonymousClass182.A0S("carousel_share_child_media_id", str2);
        }
        String str3 = c9cl.A03;
        if (str3 != null) {
            anonymousClass182.A0S(MSV.A00(109), str3);
        }
        anonymousClass182.A0a();
    }
}
