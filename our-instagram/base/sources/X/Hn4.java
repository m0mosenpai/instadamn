package X;

import com.instagram.api.schemas.FBTagType;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class Hn4 {
    public static H3F parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            FBTagType fBTagType = null;
            H4F h4f = null;
            ArrayList arrayList = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (MSV.A00(382).equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("fb_tag_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    fBTagType = (FBTagType) FBTagType.A01.get(A1P);
                    if (fBTagType == null) {
                        fBTagType = FBTagType.A06;
                    }
                } else if ("fb_user".equals(A0s)) {
                    h4f = AbstractC40080Hq6.parseFromJson(c16l);
                } else if ("position".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(AbstractC167007dF.A0a(c16l));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("tag_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("position", c16l, "FBUserTagInfoDict");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("tag_id", c16l, "FBUserTagInfoDict");
            } else {
                return new H3F(fBTagType, h4f, bool, str, arrayList);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
