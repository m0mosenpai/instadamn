package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F1G {
    public static MUD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C50679MYx c50679MYx = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("themed_image_url".equals(A0s)) {
                    c50679MYx = F1R.parseFromJson(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (c50679MYx == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("themed_image_url", c16l, "CoverComponent");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "CoverComponent");
            } else {
                return new MUD(c50679MYx, str2, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
