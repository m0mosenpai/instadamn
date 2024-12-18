package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VWB {
    public static Wm4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Wm4 wm4 = new Wm4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("poll_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    wm4.A03 = A0m;
                } else if ("question".equals(A0s)) {
                    wm4.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("viewer_vote".equals(A0s)) {
                    wm4.A01 = AbstractC166997dE.A0h(c16l);
                } else if ("viewer_can_vote".equals(A0s)) {
                    wm4.A07 = c16l.A0d();
                } else if ("is_shared_result".equals(A0s)) {
                    wm4.A08 = c16l.A0d();
                } else if ("tallies".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C101374gu parseFromJson = AbstractC101364gt.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    wm4.A06 = arrayList;
                } else if ("option_tally_ratios".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC65702TsY.A1L(c16l, arrayList);
                        }
                    }
                    wm4.A05 = arrayList;
                } else if ("color".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    wm4.A02 = A0m2;
                }
                c16l.A0z();
            }
            return wm4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
