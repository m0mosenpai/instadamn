package X;

import com.instagram.api.schemas.OpenDraftGalleryCommandImpl;
import com.instagram.api.schemas.OpenInspirationHubCommandImpl;
import java.io.IOException;

/* renamed from: X.Ev5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33717Ev5 {
    public static C26135BhM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            C26139BhQ c26139BhQ = null;
            BWW bww = null;
            H4P h4p = null;
            C26140BhR c26140BhR = null;
            OpenDraftGalleryCommandImpl openDraftGalleryCommandImpl = null;
            C26141BhS c26141BhS = null;
            OpenInspirationHubCommandImpl openInspirationHubCommandImpl = null;
            C26142BhT c26142BhT = null;
            String str = null;
            String str2 = null;
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("no_op".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (MSV.A00(538).equals(A0s)) {
                    c26139BhQ = AbstractC33721Ev9.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(2832).equals(A0s)) {
                    bww = AbstractC225509xF.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(2833).equals(A0s)) {
                    h4p = AbstractC40122Hqp.parseFromJson(c16l);
                } else if ("open_draft".equals(A0s)) {
                    c26140BhR = AbstractC33722EvA.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(2834).equals(A0s)) {
                    openDraftGalleryCommandImpl = AbstractC33723EvB.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(2836).equals(A0s)) {
                    c26141BhS = AbstractC33724EvC.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(2837).equals(A0s)) {
                    openInspirationHubCommandImpl = AbstractC40123Hqq.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1158).equals(A0s)) {
                    c26142BhT = AbstractC33725EvD.parseFromJson(c16l);
                } else if ("open_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(2839).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (MSV.A00(259).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new C26135BhM(c26139BhQ, bww, h4p, c26140BhR, openDraftGalleryCommandImpl, c26141BhS, openInspirationHubCommandImpl, c26142BhT, bool, bool2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
