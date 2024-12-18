package X;

import com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.Nrw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53868Nrw {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal] */
    public static ClipsCreationToolsResponse$ContentFundingDeal parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("deal_id".equals(A0s)) {
                    obj.A00 = c16l.A0y();
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("deal_program".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
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
