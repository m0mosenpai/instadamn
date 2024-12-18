package X;

import java.io.IOException;

/* renamed from: X.F5f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34155F5f {
    public static C32981hM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32981hM c32981hM = new C32981hM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("forward_media".equals(A0s)) {
                    c32981hM.A01 = AbstractC31176DnK.A0Y(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c32981hM.A00 = FUT.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c32981hM, A0s);
                }
                c16l.A0z();
            }
            return c32981hM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
