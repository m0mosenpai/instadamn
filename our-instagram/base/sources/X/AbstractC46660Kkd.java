package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.business.promote.model.IGBoostPackage;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.Kkd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46660Kkd {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.instagram.business.promote.model.IGBoostPackage] */
    public static IGBoostPackage parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("badge_content".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("badge_description".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(543).equals(A0s)) {
                    obj.A00 = AbstractC222616c.A00(c16l);
                } else if ("duration_in_days".equals(A0s)) {
                    obj.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("daily_budget_with_offset".equals(A0s)) {
                    obj.A01 = AbstractC166997dE.A0h(c16l);
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
