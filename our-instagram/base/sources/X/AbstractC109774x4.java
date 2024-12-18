package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.4x4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109774x4 {
    public static C109784x5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("privacy_disclaimer".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("privacy_disclaimer_link".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("privacy_disclaimer_link_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(DevServerEntity.COLUMN_DESCRIPTION, "LiveUserPayConsumptionSheetConfig");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("privacy_disclaimer_link", "LiveUserPayConsumptionSheetConfig");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("privacy_disclaimer_link_text", "LiveUserPayConsumptionSheetConfig");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(DialogModule.KEY_TITLE, "LiveUserPayConsumptionSheetConfig");
                } else {
                    return new C109784x5(str, str2, str3, str4, str5);
                }
            } else {
                ((C07950bF) c16l).A03.A00("privacy_disclaimer", "LiveUserPayConsumptionSheetConfig");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
