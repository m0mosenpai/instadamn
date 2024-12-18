package X;

import com.instagram.clips.model.ClipsCreationToolsResponse$ContentFundingDeal;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nrx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53869Nrx {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.OBb, java.lang.Object] */
    public static C54626OBb parseFromJson(C16L c16l) {
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
                if ("selected_deal_description".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("selected_deal_program".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("is_selected_deal_bonus".equals(A0s)) {
                    obj.A03 = c16l.A0d();
                } else if ("deals".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ClipsCreationToolsResponse$ContentFundingDeal parseFromJson = AbstractC53868Nrw.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
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
