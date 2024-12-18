package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I5M {
    public static QuestionResponseModel parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            QuestionMediaResponseModel questionMediaResponseModel = null;
            MusicQuestionResponseModel musicQuestionResponseModel = null;
            String str2 = null;
            QuestionResponseType questionResponseType = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_shared_response".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("media_response".equals(A0s)) {
                    questionMediaResponseModel = AbstractC41340IRl.parseFromJson(c16l);
                } else if ("music_response".equals(A0s)) {
                    musicQuestionResponseModel = AbstractC41338IRj.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("response_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    questionResponseType = AbstractC201648vt.A00(A1P);
                } else if ("seen".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("should_enable_reply_creation".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("ts".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("has_shared_response", c16l, "QuestionResponseModel");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (questionResponseType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("response_type", c16l, "QuestionResponseModel");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("ts", c16l, "QuestionResponseModel");
                } else if (user == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c16l, "QuestionResponseModel");
                } else {
                    return new QuestionResponseModel(musicQuestionResponseModel, questionResponseType, questionMediaResponseModel, user, bool2, bool3, str, str2, num.intValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "QuestionResponseModel");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
