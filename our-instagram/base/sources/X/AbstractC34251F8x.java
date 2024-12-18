package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F8x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34251F8x {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.G9p, java.lang.Object] */
    public static C36540G9p parseFromJson(C16L c16l) {
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
                if ("item_id".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("participant_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("timestamp".equals(A0s)) {
                    c16l.A0y();
                } else if ("client_context".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if ("canonical".equals(A0s)) {
                    c16l.A0d();
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
