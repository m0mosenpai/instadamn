package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VSQ {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.VmT, java.lang.Object] */
    public static C69383VmT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("batch_size".equals(A0s)) {
                    obj.A00 = AbstractC166997dE.A0h(c16l);
                } else if ("field_setting".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("max_concurrent_batches".equals(A0s)) {
                    obj.A01 = AbstractC166997dE.A0h(c16l);
                } else if ("max_num_contacts".equals(A0s)) {
                    obj.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("max_num_retries".equals(A0s)) {
                    obj.A05 = AbstractC166997dE.A0h(c16l);
                } else if ("max_num_emails_in_contact".equals(A0s)) {
                    obj.A03 = AbstractC166997dE.A0h(c16l);
                } else if ("max_num_phones_in_contact".equals(A0s)) {
                    obj.A04 = AbstractC166997dE.A0h(c16l);
                } else if ("upload_interval".equals(A0s)) {
                    obj.A06 = AbstractC166997dE.A0h(c16l);
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
}
