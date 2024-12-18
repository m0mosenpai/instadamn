package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;
import java.io.IOException;

/* renamed from: X.Ev4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33716Ev4 {
    public static C26132BhJ parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MidCardClipsClickedAction midCardClipsClickedAction = null;
            C26140BhR c26140BhR = null;
            C26142BhT c26142BhT = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    midCardClipsClickedAction = (MidCardClipsClickedAction) MidCardClipsClickedAction.A01.get(A1P);
                    if (midCardClipsClickedAction == null) {
                        midCardClipsClickedAction = MidCardClipsClickedAction.A09;
                    }
                } else if ("open_draft".equals(A0s)) {
                    c26140BhR = AbstractC33722EvA.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1158).equals(A0s)) {
                    c26142BhT = AbstractC33725EvD.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (midCardClipsClickedAction == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("action", c16l, "MidCardClipsClickedActionInfoImpl");
                throw C00O.createAndThrow();
            }
            return new C26132BhJ(midCardClipsClickedAction, c26140BhR, c26142BhT);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
