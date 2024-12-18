package X;

import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nui, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54032Nui {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.instagram.igtv.persistence.draft.IGTVBrandedContentTags] */
    public static IGTVBrandedContentTags parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("branded_content_tags".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            BrandedContentTag parseFromJson = AbstractC54880OPb.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    obj.A01 = arrayList;
                } else if ("branded_content_project_metadata".equals(A0s)) {
                    obj.A00 = ONL.parseFromJson(c16l);
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
