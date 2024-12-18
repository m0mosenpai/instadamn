package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VW7 {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.VnX, java.lang.Object] */
    public static C69448VnX parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    obj.A09 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                } else if (!DevServerEntity.COLUMN_DESCRIPTION.equals(A0s) && !DialogModule.KEY_MESSAGE.equals(A0s)) {
                    if ("learn_more_action_title".equals(A0s)) {
                        obj.A04 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(124).equals(A0s)) {
                        obj.A05 = AbstractC167017dG.A0m(c16l);
                    } else if ("learn_more_action_style".equals(A0s)) {
                        obj.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("bottom_notice".equals(A0s)) {
                        obj.A01 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC58317Pt9.A00(960).equals(A0s)) {
                        obj.A06 = AbstractC167017dG.A0m(c16l);
                    } else if ("secondary_action_url".equals(A0s)) {
                        obj.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("hide_dismiss".equals(A0s)) {
                        obj.A00 = AbstractC166997dE.A0d(c16l);
                    } else if ("is_bloks".equals(A0s)) {
                        obj.A0A = c16l.A0d();
                    } else if ("tag".equals(A0s)) {
                        AbstractC31178DnM.A1I(c16l);
                    }
                } else {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
