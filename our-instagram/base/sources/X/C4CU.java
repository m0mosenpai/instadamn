package X;

import com.instagram.api.schemas.AppreciationUFIEntryActionType;
import java.io.IOException;

/* renamed from: X.4CU, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4CU {
    public static C116725Qb parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AppreciationUFIEntryActionType appreciationUFIEntryActionType = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("action_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    appreciationUFIEntryActionType = (AppreciationUFIEntryActionType) AppreciationUFIEntryActionType.A01.get(A1P);
                    if (appreciationUFIEntryActionType == null) {
                        appreciationUFIEntryActionType = AppreciationUFIEntryActionType.A05;
                    }
                } else if ("gift_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (appreciationUFIEntryActionType == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("action_type", "AppreciationUFIEntryObject");
            } else if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("gift_count", "AppreciationUFIEntryObject");
            } else {
                return new C116725Qb(appreciationUFIEntryActionType, num.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
