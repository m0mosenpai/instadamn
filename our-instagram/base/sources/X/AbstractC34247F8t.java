package X;

import java.io.IOException;

/* renamed from: X.F8t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34247F8t {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5GM, java.lang.Object] */
    public static C5GM parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fb_connect_upsell".equals(A0s)) {
                    obj.A04 = AbstractC34245F8r.parseFromJson(c16l);
                } else if ("vk_connect_upsell".equals(A0s)) {
                    obj.A05 = AbstractC34245F8r.parseFromJson(c16l);
                } else if ("ci_connect_upsell".equals(A0s)) {
                    obj.A03 = AbstractC34245F8r.parseFromJson(c16l);
                } else if ("generic_megaphone".equals(A0s)) {
                    obj.A02 = VVU.parseFromJson(c16l);
                } else if ("rux".equals(A0s)) {
                    obj.A01 = F7V.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            AbstractC33588Et0 abstractC33588Et0 = obj.A04;
            if (abstractC33588Et0 != null) {
                num = C05F.A01;
            } else {
                abstractC33588Et0 = obj.A05;
                if (abstractC33588Et0 != null) {
                    num = C05F.A0C;
                } else {
                    abstractC33588Et0 = obj.A03;
                    if (abstractC33588Et0 != null) {
                        num = C05F.A0N;
                    } else {
                        abstractC33588Et0 = obj.A02;
                        if (abstractC33588Et0 != null) {
                            num = C05F.A0j;
                        } else {
                            abstractC33588Et0 = obj.A01;
                            if (abstractC33588Et0 != null) {
                                num = C05F.A0Y;
                            } else {
                                return obj;
                            }
                        }
                    }
                }
            }
            obj.A06 = num;
            obj.A00 = abstractC33588Et0;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
