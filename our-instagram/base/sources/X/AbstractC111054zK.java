package X;

import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.api.schemas.RIXUCoverChainingType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4zK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC111054zK {
    public static C206309Bn parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            RIXUCoverChainingType rIXUCoverChainingType = null;
            RIXUChainingSourceType rIXUChainingSourceType = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("chaining_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    rIXUCoverChainingType = (RIXUCoverChainingType) RIXUCoverChainingType.A01.get(A1P2);
                    if (rIXUCoverChainingType == null) {
                        rIXUCoverChainingType = RIXUCoverChainingType.A06;
                    }
                } else if ("contextual_path".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    rIXUChainingSourceType = (RIXUChainingSourceType) RIXUChainingSourceType.A01.get(A1P);
                    if (rIXUChainingSourceType == null) {
                        rIXUChainingSourceType = RIXUChainingSourceType.A0B;
                    }
                } else if ("disable_android_flash_cache_read".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("disable_ios_shared_cache".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("enable_prefetch".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("injected_clips".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C111034zF parseFromJson = AbstractC111024zE.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("prefetch_page_size".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("injected_clips", "RIXUChainingBehaviorDefinition");
                throw C00O.createAndThrow();
            }
            return new C206309Bn(rIXUChainingSourceType, rIXUCoverChainingType, bool, bool2, bool3, num, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
