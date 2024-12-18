package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IQG {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.75n, java.lang.Object] */
    public static C1575375n parseFromJson(C16L c16l) {
        C37469Gen A01;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("clip".equals(A0s)) {
                    obj.A01 = C38321qM.A00(c16l);
                } else if ("emoji_reaction".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("ad".equals(A0s)) {
                    obj.A00 = AbstractC38251Gru.parseFromJson(c16l);
                } else if (MSV.A00(109).equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            C38252Grv c38252Grv = obj.A00;
            if (c38252Grv != null) {
                c38252Grv.A02();
                if (c38252Grv.A02().size() == 0) {
                    A01 = null;
                } else {
                    A01 = c38252Grv.A01();
                }
                obj.A02 = A01;
                if (A01 != null) {
                    obj.A01 = A01.A0K;
                }
            }
            if (obj.A01 == null) {
                C0w9.A04("DirectClipShare_media_isNull", "media is expected to be non-null", 1);
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C1575375n c1575375n) {
        anonymousClass182.A0d();
        if (c1575375n.A01 != null) {
            anonymousClass182.A0r("clip");
            C38321qM c38321qM = c1575375n.A01;
            C38801rC c38801rC = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        String str = c1575375n.A03;
        if (str != null) {
            anonymousClass182.A0S("emoji_reaction", str);
        }
        if (c1575375n.A00 != null) {
            anonymousClass182.A0r("ad");
            AbstractC38251Gru.A00(anonymousClass182, c1575375n.A00);
        }
        String str2 = c1575375n.A04;
        if (str2 != null) {
            anonymousClass182.A0S(MSV.A00(109), str2);
        }
        anonymousClass182.A0a();
    }
}
