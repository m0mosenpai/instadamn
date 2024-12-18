package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectVisualMessageTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.NvD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54053NvD {
    /* JADX WARN: Type inference failed for: r2v0, types: [com.instagram.model.direct.DirectVisualMessageTarget, java.lang.Object] */
    public static DirectVisualMessageTarget parseFromJson(C16L c16l) {
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
                if ("pending_recipients".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            PendingRecipient parseFromJson = C7NT.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(1338).equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(2597).equals(A0s)) {
                    obj.A03 = c16l.A0d();
                }
                c16l.A0z();
            }
            List list = obj.A02;
            if (list != null) {
                Collections.sort(list, DirectVisualMessageTarget.A04);
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
