package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class LCQ {
    public static K8O parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            K8O k8o = new K8O();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("has_newer".equals(A0s)) {
                        k8o.A01 = AbstractC166997dE.A0d(c16l);
                    } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C83403nh A00 = C83403nh.A00(c16l, null, false);
                                if (A00 != null) {
                                    arrayList.add(A00);
                                }
                            }
                        }
                        k8o.A04 = arrayList;
                    } else if ("unseen_count".equals(A0s)) {
                        k8o.A00 = c16l.A1D();
                    } else if ("last_activity_at".equals(A0s)) {
                        c16l.A0y();
                    } else if ("oldest_cursor".equals(A0s)) {
                        k8o.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("newest_cursor".equals(A0s)) {
                        k8o.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("prev_cursor".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("next_cursor".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else {
                        C55702hA.A01(c16l, k8o, A0s);
                    }
                    c16l.A0z();
                }
            }
            Iterator it = k8o.A04.iterator();
            while (it.hasNext()) {
                AbstractC43592JPx.A0e(it).A1m(C05F.A0j);
            }
            return k8o;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
