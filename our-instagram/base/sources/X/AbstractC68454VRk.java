package X;

import com.instagram.business.promote.model.RejectionReason;
import com.instagram.business.promote.model.RejectionReasonRanges;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VRk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68454VRk {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.business.promote.model.RejectionReason, java.lang.Object] */
    public static RejectionReason parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("text".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A00 = A0m;
                } else if ("ranges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            RejectionReasonRanges parseFromJson = AbstractC68453VRj.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    obj.A01 = arrayList;
                } else if ("is_rejected_due_to_hec".equals(A0s)) {
                    obj.A02 = c16l.A0d();
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
