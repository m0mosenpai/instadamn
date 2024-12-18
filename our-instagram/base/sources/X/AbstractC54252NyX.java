package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.NyX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54252NyX {
    public static OFD parseFromJson(C16L c16l) {
        EnumC223199sy enumC223199sy;
        C14360o3.A0B(c16l, 0);
        try {
            OFD ofd = new OFD();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    ofd.A03 = AbstractC38851rI.A00(c16l, false);
                } else if ("text".equals(A0s)) {
                    ofd.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("qid".equals(A0s)) {
                    ofd.A01 = c16l.A0y();
                } else if (CacheBehaviorLogger.SOURCE.equals(A0s)) {
                    ofd.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("supporter_info".equals(A0s)) {
                    ofd.A02 = AbstractC54258Nyd.parseFromJson(c16l);
                } else if ("timestamp".equals(A0s)) {
                    ofd.A05 = AbstractC31173DnH.A0h(c16l);
                } else if ("like_count".equals(A0s)) {
                    ofd.A00 = c16l.A1D();
                } else if ("is_liked_by_viewer".equals(A0s)) {
                    ofd.A08 = c16l.A0d();
                } else if ("answer_state".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    if (A1Q == null || (enumC223199sy = (EnumC223199sy) EnumC223199sy.A01.get(AbstractC167007dF.A0h(A1Q))) == null) {
                        enumC223199sy = EnumC223199sy.A06;
                    }
                    ofd.A04 = enumC223199sy;
                }
                c16l.A0z();
            }
            return ofd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
