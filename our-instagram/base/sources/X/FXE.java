package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class FXE {
    public static EC2 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            EC2 ec2 = new EC2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("story_item_to_share_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    ec2.A00 = A1P;
                } else {
                    C55702hA.A01(c16l, ec2, A0s);
                }
                c16l.A0z();
            }
            return ec2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
