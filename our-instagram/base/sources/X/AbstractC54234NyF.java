package X;

import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NyF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54234NyF {
    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.tagging.api.model.MediaSuggestedProductTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    public static MediaSuggestedProductTag parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                String str = null;
                ArrayList arrayList = null;
                if (AbstractC43591JPw.A00(90).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            MediaSuggestedProductTagProductItemContainer parseFromJson = AbstractC54233NyE.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                } else if ("dot_coordinates".equals(A0s)) {
                    obj.A00 = C55X.A00(c16l);
                } else if ("tag_mode".equals(A0s)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    EnumC53230NgS enumC53230NgS = (EnumC53230NgS) EnumC53230NgS.A01.get(str);
                    if (enumC53230NgS == null) {
                        enumC53230NgS = EnumC53230NgS.A06;
                    }
                    obj.A01 = enumC53230NgS;
                } else if ("position".equals(A0s)) {
                    obj.A00 = C55X.A00(c16l);
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
