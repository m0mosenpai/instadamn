package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CfF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28355CfF {
    public final C26025BfE A00;
    public final MediaCommentListRepository A01;
    public final C166027bU A02;
    public final C28212CcA A03;
    public final UserSession A04;
    public final C166217bp A05;

    public C28355CfF(C26025BfE c26025BfE, MediaCommentListRepository mediaCommentListRepository, C166027bU c166027bU, C28212CcA c28212CcA, UserSession userSession, C166217bp c166217bp) {
        C14360o3.A0B(c28212CcA, 4);
        this.A01 = mediaCommentListRepository;
        this.A04 = userSession;
        this.A00 = c26025BfE;
        this.A03 = c28212CcA;
        this.A02 = c166027bU;
        this.A05 = c166217bp;
    }

    public static final JSONObject A00(List list) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            if (list.size() == 1) {
                jSONObject.put("comment_id", ((C167297di) AbstractC001800i.A0I(list)).A0K);
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C167297di) it.next()).A0K);
                }
                jSONObject.put(AbstractC43591JPw.A00(322), jSONArray);
            }
            jSONObject.put("surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
            return jSONObject;
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    public static final boolean A01(C28355CfF c28355CfF, User user) {
        C166217bp c166217bp;
        if (!c28355CfF.A00.A0f || C14360o3.A0K(C17060sy.A01.A01(c28355CfF.A04), user) || C28151Xt.A02 == null || (c166217bp = c28355CfF.A05) == null || !c166217bp.A00) {
            return false;
        }
        return true;
    }
}
