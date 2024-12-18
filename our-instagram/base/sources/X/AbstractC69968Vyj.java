package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Vyj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69968Vyj {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Vvd, java.lang.Object] */
    public static C69794Vvd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("location".equals(A0s)) {
                    obj.A01 = AbstractC84373pU.parseFromJson(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("subtitle".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("search_subtitle".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("header_media".equals(A0s)) {
                    obj.A00 = VVZ.parseFromJson(c16l);
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

    public static void A00(AnonymousClass182 anonymousClass182, C69794Vvd c69794Vvd) {
        anonymousClass182.A0d();
        if (c69794Vvd.A01 != null) {
            anonymousClass182.A0r("location");
            AbstractC84373pU.A00(anonymousClass182, c69794Vvd.A01);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, c69794Vvd.A04);
        String str = c69794Vvd.A03;
        if (str != null) {
            anonymousClass182.A0S("subtitle", str);
        }
        String str2 = c69794Vvd.A02;
        if (str2 != null) {
            anonymousClass182.A0S("search_subtitle", str2);
        }
        if (c69794Vvd.A00 != null) {
            anonymousClass182.A0r("header_media");
            C67820Uyt c67820Uyt = c69794Vvd.A00;
            anonymousClass182.A0d();
            if (c67820Uyt.A00 != null) {
                C16V.A03(anonymousClass182, "media");
                for (C38321qM c38321qM : c67820Uyt.A00) {
                    if (c38321qM != null) {
                        C38801rC c38801rC = C38321qM.A0h;
                        C38801rC.A07(anonymousClass182, c38321qM);
                    }
                }
                anonymousClass182.A0Z();
            }
            C55702hA.A00(anonymousClass182, c67820Uyt);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
