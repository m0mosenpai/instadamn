package X;

import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NyG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54235NyG {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.NnM, java.lang.Object] */
    public static C53615NnM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("upload_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (!"media_id".equals(A0s) && !AbstractC111324zv.A00(233).equals(A0s)) {
                    if ("detected_products".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                MediaSuggestedProductTag parseFromJson = AbstractC54234NyF.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    }
                } else {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_id", c16l, "MediaSuggestedProductTagsContainer");
            } else if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("detected_products", c16l, "MediaSuggestedProductTagsContainer");
            } else {
                int intValue = num.intValue();
                ?? obj = new Object();
                obj.A01 = str;
                obj.A00 = intValue;
                obj.A02 = arrayList;
                return obj;
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
