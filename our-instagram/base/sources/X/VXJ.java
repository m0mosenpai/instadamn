package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VXJ {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.Vmy, java.lang.Object] */
    public static C69414Vmy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("client_subscription_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if (TraceFieldType.BroadcastId.equals(A0s)) {
                        obj.A05 = AbstractC167017dG.A0m(c16l);
                    } else if ("video_timestamp".equals(A0s)) {
                        obj.A03 = AbstractC31173DnH.A0h(c16l);
                    } else if ("is_active".equals(A0s)) {
                        obj.A02 = AbstractC166997dE.A0d(c16l);
                    } else if ("question_id".equals(A0s)) {
                        obj.A04 = AbstractC31173DnH.A0h(c16l);
                    } else if ("story_question_id".equals(A0s)) {
                        obj.A00 = c16l.A0y();
                    } else if ("question_prompt".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("question_body".equals(A0s)) {
                        obj.A06 = AbstractC167017dG.A0m(c16l);
                    } else if (CacheBehaviorLogger.SOURCE.equals(A0s)) {
                        obj.A07 = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                        Parcelable.Creator creator = User.CREATOR;
                        obj.A01 = AbstractC38851rI.A00(c16l, false);
                    }
                    c16l.A0z();
                }
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
