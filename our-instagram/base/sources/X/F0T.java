package X;

import com.instagram.business.model.BoostGuidanceItemResponse;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F0T {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.FMc, java.lang.Object] */
    public static C34593FMc parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("num_steps_required".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("num_steps_left".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("target_user_id".equals(A0s)) {
                        obj.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("sub_items".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                FRF parseFromJson = F0U.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A04 = arrayList;
                    } else if ("boost_guidance_items".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                BoostGuidanceItemResponse parseFromJson2 = F0N.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        obj.A03 = arrayList;
                    }
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
