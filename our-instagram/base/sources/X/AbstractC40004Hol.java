package X;

import com.instagram.api.schemas.IGNativeTextOverlayTextBoxAlignmentEnum;
import java.io.IOException;

/* renamed from: X.Hol, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40004Hol {
    public static C38727H3p parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            IGNativeTextOverlayTextBoxAlignmentEnum iGNativeTextOverlayTextBoxAlignmentEnum = null;
            Integer num3 = null;
            Integer num4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bottom_right_x_pct".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("bottom_right_y_pct".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("box_alignment".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGNativeTextOverlayTextBoxAlignmentEnum = (IGNativeTextOverlayTextBoxAlignmentEnum) IGNativeTextOverlayTextBoxAlignmentEnum.A01.get(A1P);
                    if (iGNativeTextOverlayTextBoxAlignmentEnum == null) {
                        iGNativeTextOverlayTextBoxAlignmentEnum = IGNativeTextOverlayTextBoxAlignmentEnum.A05;
                    }
                } else if ("top_left_x_pct".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else {
                    num4 = AbstractC31178DnM.A0V(c16l, num4, A0s, "top_left_y_pct");
                }
                c16l.A0z();
            }
            return new C38727H3p(iGNativeTextOverlayTextBoxAlignmentEnum, num, num2, num3, num4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
