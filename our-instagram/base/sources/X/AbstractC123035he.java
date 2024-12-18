package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123035he {
    public static C206259Bi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            Long l2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("content_id".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("mentioned_user_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf = Long.valueOf(c16l.A0y());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("mentioned_content_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf2 = Long.valueOf(c16l.A0y());
                            if (valueOf2 != null) {
                                arrayList2.add(valueOf2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("ad_id".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            return new C206259Bi(9, arrayList2, arrayList, l, l2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
