package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Nyb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54256Nyb {
    public static C56803PIu parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            C56803PIu c56803PIu = new C56803PIu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (!"pk".equals(A0s) && !PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if ("created_at".equals(A0s)) {
                        c56803PIu.A03 = c16l.A0y();
                    } else if ("text".equals(A0s)) {
                        c56803PIu.A0D = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                        int A1D = c16l.A1D();
                        if (A1D != 0 && A1D == 1) {
                            num = C05F.A01;
                        } else {
                            num = C05F.A00;
                        }
                        C14360o3.A0B(num, 0);
                    } else if (!PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s) && !"owner".equals(A0s)) {
                        if ("comment_like_count".equals(A0s)) {
                            c56803PIu.A02 = c16l.A1D();
                        } else if (AbstractC111324zv.A00(428).equals(A0s)) {
                            c56803PIu.A0F = c16l.A0d();
                        } else if ("did_report_as_spam".equals(A0s)) {
                            c56803PIu.A0E = c16l.A0d();
                        } else if ("idempotence_token".equals(A0s)) {
                            c56803PIu.A0B = AbstractC167017dG.A0m(c16l);
                        } else if ("parent_comment_id".equals(A0s)) {
                            c56803PIu.A0C = AbstractC167017dG.A0m(c16l);
                        } else if ("supporter_info".equals(A0s)) {
                            c56803PIu.A05 = AbstractC54258Nyd.parseFromJson(c16l);
                        } else if ("is_goal_setting_message".equals(A0s)) {
                            c56803PIu.A0G = c16l.A0d();
                        }
                    } else {
                        Parcelable.Creator creator = User.CREATOR;
                        c56803PIu.A08 = AbstractC38851rI.A00(c16l, false);
                    }
                } else {
                    c56803PIu.A0A = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c56803PIu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
