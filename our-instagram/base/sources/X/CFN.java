package X;

import com.instagram.api.schemas.CommentAudienceControlType;
import com.instagram.api.schemas.MediaCommentAudienceControlType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CFN {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        List list = c6fw.A00;
        Object obj = list.get(0);
        Object obj2 = null;
        if (obj instanceof String) {
            obj2 = obj;
        }
        Object obj3 = list.get(1);
        if ((obj3 instanceof String) && (str = (String) obj3) != null) {
            C38321qM A0h = AbstractC25229BEm.A0h(userSession, AnonymousClass001.A0T(str, userSession.userId, '_'));
            if (A0h != null) {
                MediaCommentAudienceControlType mediaCommentAudienceControlType = (MediaCommentAudienceControlType) MediaCommentAudienceControlType.A01.get(obj2);
                if (mediaCommentAudienceControlType == null) {
                    mediaCommentAudienceControlType = MediaCommentAudienceControlType.A09;
                }
                A0h.A0C.EYt(mediaCommentAudienceControlType);
            }
            return null;
        }
        User A10 = AbstractC166987dD.A10(userSession);
        CommentAudienceControlType commentAudienceControlType = (CommentAudienceControlType) CommentAudienceControlType.A01.get(obj2);
        if (commentAudienceControlType == null) {
            commentAudienceControlType = CommentAudienceControlType.A08;
        }
        A10.A03.EPY(commentAudienceControlType);
        return null;
    }
}
