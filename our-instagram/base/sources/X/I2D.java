package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I2D {
    public static C51851Mvt parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            String str2 = null;
            User user = null;
            String str3 = null;
            String str4 = null;
            MediaKitVisibility mediaKitVisibility = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cover_media".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC37300Gc1.A1Q(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_draft".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("owner".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("share_link".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("visibility".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    mediaKitVisibility = (MediaKitVisibility) MediaKitVisibility.A01.get(A1P);
                    if (mediaKitVisibility == null) {
                        mediaKitVisibility = MediaKitVisibility.A06;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("cover_media", c16l, "MediaKitSummary");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (user == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("owner", c16l, "MediaKitSummary");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "MediaKitSummary");
                } else if (mediaKitVisibility == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("visibility", c16l, "MediaKitSummary");
                } else {
                    return new C51851Mvt(mediaKitVisibility, user, str, str2, str3, str4, arrayList, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("is_draft", c16l, "MediaKitSummary");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
