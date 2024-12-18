package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I7c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40826I7c {
    public static C26082BgB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C26082BgB c26082BgB = new C26082BgB();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("broadcast_wrapper".equals(A0s)) {
                    c26082BgB.A00 = AbstractC40838I7o.parseFromJson(c16l);
                } else if ("image".equals(A0s)) {
                    c26082BgB.A01 = AbstractC111144zV.parseFromJson(c16l);
                } else if ("media_dict".equals(A0s)) {
                    c26082BgB.A02 = C38321qM.A00(c16l);
                } else if ("media_slideshow".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    }
                    c26082BgB.A03 = arrayList;
                } else if ("showreel_native_animation".equals(A0s)) {
                    c26082BgB.A04 = C52l.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c26082BgB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
