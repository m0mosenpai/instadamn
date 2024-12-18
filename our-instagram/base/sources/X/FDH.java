package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FDH {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.83s] */
    public static C1816383s parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1a(A0s)) {
                    obj.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("subtitle".equals(A0s)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("fundraiser_creator".equals(A0s)) {
                    obj.A03 = AbstractC23050AEg.parseFromJson(c16l);
                } else if ("fundraiser_id".equals(A0s)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                } else if (MSV.A00(112).equals(A0s)) {
                    obj.A01 = OY1.parseFromJson(c16l);
                } else if ("cover_photo_url".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("beneficiary".equals(A0s)) {
                    obj.A02 = AbstractC23050AEg.parseFromJson(c16l);
                } else if (CacheBehaviorLogger.SOURCE.equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("cohosts_count".equals(A0s)) {
                    obj.A00 = c16l.A1D();
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
