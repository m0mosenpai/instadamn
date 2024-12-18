package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.infocenter.model.ShareInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KrE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47057KrE {
    public static ShareInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ShareInfo shareInfo = new ShareInfo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("info_center_type".equals(A0s)) {
                    shareInfo.A05 = AbstractC47054KrB.A00(c16l.A1Q());
                } else if ("is_enabled".equals(A0s)) {
                    shareInfo.A0D = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if (DialogModule.KEY_TITLE.equals(A0s)) {
                        shareInfo.A0A = AbstractC167017dG.A0m(c16l);
                    } else if ("subtitle".equals(A0s)) {
                        shareInfo.A08 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(3226).equals(A0s)) {
                        shareInfo.A09 = AbstractC167017dG.A0m(c16l);
                    } else if ("bloks_tappable_id".equals(A0s)) {
                        shareInfo.A06 = AbstractC167017dG.A0m(c16l);
                    } else if ("background_gradient".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        shareInfo.A0B = arrayList;
                    } else if ("card_gradient".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        shareInfo.A0C = arrayList;
                    } else if ("background_image".equals(A0s)) {
                        shareInfo.A01 = C17Y.parseFromJson(c16l);
                    } else if ("logo_image".equals(A0s)) {
                        shareInfo.A02 = C17Y.parseFromJson(c16l);
                    } else if ("gradient_orientation".equals(A0s)) {
                        shareInfo.A04 = AbstractC47052Kr9.A00(c16l.A1Q());
                    } else if ("icon_image_url".equals(A0s)) {
                        shareInfo.A00 = AbstractC222616c.A00(c16l);
                    } else if ("story_background_image".equals(A0s)) {
                        shareInfo.A03 = C17Y.parseFromJson(c16l);
                    } else if ("deep_link_url".equals(A0s)) {
                        shareInfo.A07 = AbstractC167017dG.A0m(c16l);
                    }
                }
                c16l.A0z();
            }
            return shareInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
