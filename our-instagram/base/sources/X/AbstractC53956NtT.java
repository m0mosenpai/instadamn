package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectVisualMessageTarget;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.NtT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53956NtT {
    /* JADX WARN: Type inference failed for: r7v0, types: [X.OTT, java.lang.Object] */
    public static OTT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                HashSet hashSet = null;
                if ("direct_share_targets".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        hashSet = AbstractC166987dD.A1H();
                        while (c16l.A1J() != C16R.A08) {
                            DirectShareTarget parseFromJson = C7NS.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                hashSet.add(parseFromJson);
                            }
                        }
                    }
                    obj.A00 = hashSet;
                } else if ("targets".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        hashSet = AbstractC166987dD.A1H();
                        while (c16l.A1J() != C16R.A08) {
                            DirectVisualMessageTarget parseFromJson2 = AbstractC54053NvD.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                hashSet.add(parseFromJson2);
                            }
                        }
                    }
                    obj.A01 = hashSet;
                }
                c16l.A0z();
            }
            java.util.Set<DirectVisualMessageTarget> set = obj.A01;
            if (set != null) {
                obj.A00 = AbstractC166987dD.A1H();
                C14360o3.A0A(set);
                for (DirectVisualMessageTarget directVisualMessageTarget : set) {
                    java.util.Set set2 = obj.A00;
                    if (set2 != null) {
                        List list = directVisualMessageTarget.A02;
                        set2.add(new DirectShareTarget(AbstractC31232DoF.A00(directVisualMessageTarget.A00, list), directVisualMessageTarget.A01, list, directVisualMessageTarget.A03));
                    }
                }
                obj.A01 = null;
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
