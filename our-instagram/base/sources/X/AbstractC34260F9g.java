package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent;
import java.io.IOException;

/* renamed from: X.F9g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34260F9g {
    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent, java.lang.Object] */
    public static FXCalAgeRestrictionScreenContent parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1a(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC58317Pt9.A00(125).equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("source_age_info".equals(A0s)) {
                    obj.A00 = AbstractC34259F9f.parseFromJson(c16l);
                } else if ("target_age_info".equals(A0s)) {
                    obj.A01 = AbstractC34259F9f.parseFromJson(c16l);
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
