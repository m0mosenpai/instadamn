package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99274ct {
    public static C99284cu parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            Boolean bool2 = null;
            Integer num3 = null;
            Integer num4 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("enqueued_for_federation".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("federated_like_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("fediverse_reply_count".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("is_federated".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("liked_instance_count".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("reply_instance_count".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("reply_owner_profile_pic_uris".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new C99284cu(bool, bool2, num, num2, num3, num4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
