package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AEA {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.A64, java.lang.Object] */
    public static A64 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("media_location".equals(AbstractC166997dE.A0s(c16l))) {
                    obj.A00 = A1U.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, A64 a64) {
        anonymousClass182.A0d();
        if (a64.A00 != null) {
            anonymousClass182.A0r("media_location");
            A7Y a7y = a64.A00;
            anonymousClass182.A0d();
            anonymousClass182.A0O("lat", a7y.A00);
            anonymousClass182.A0O("lng", a7y.A01);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
