package X;

import java.io.IOException;

/* renamed from: X.Kpk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46965Kpk {
    public static C30011cH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30011cH c30011cH = new C30011cH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(4036).equals(A0s)) {
                    c30011cH.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("live_username".equals(A0s)) {
                    c30011cH.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("live_viewer_invite".equals(A0s)) {
                    c30011cH.A01 = IQH.parseFromJson(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c30011cH.A00 = FUT.parseFromJson(c16l);
                } else if ("is_x_transport_forward".equals(A0s)) {
                    c30011cH.A05 = c16l.A0d();
                } else {
                    AbstractC47856LCb.A01(c16l, c30011cH, A0s);
                }
                c16l.A0z();
            }
            return c30011cH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
