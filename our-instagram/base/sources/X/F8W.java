package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F8W {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.FbZ, java.lang.Object] */
    public static C35002FbZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("resend_sms_delay_sec".equals(A0s)) {
                    obj.A02 = c16l.A1D();
                } else if ("max_sms_count".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("robocall_count_down_time_sec".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("robocall_after_max_sms".equals(A0s)) {
                    obj.A03 = c16l.A0d();
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
}
