package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.60I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60I {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Jk, java.lang.Object] */
    public final void A00(AbstractC12990ll abstractC12990ll, String str, InterfaceC16620sF interfaceC16620sF) {
        UserSession userSession;
        String str2;
        C14360o3.A0B(abstractC12990ll, 0);
        if ((abstractC12990ll instanceof UserSession) && (userSession = (UserSession) abstractC12990ll) != null) {
            List BOe = C0BQ.A00(userSession).BOe();
            if (!BOe.isEmpty()) {
                str2 = ((User) BOe.get(0)).getId();
            } else {
                str2 = userSession.userId;
            }
            if (str != null && str2 != null && !str2.equals(str)) {
                if (!C023409i.A0A.A0A(new Object(), null, new C49583Lvc(interfaceC16620sF), str)) {
                    C0K8.A0C("ArmadilloNotificationLogger", "Failed to insert operation for the background account");
                    return;
                }
                return;
            }
        }
        interfaceC16620sF.invoke(abstractC12990ll, false);
    }

    public final void A01(String str, JSONObject jSONObject, boolean z) {
        String valueOf = String.valueOf(z);
        C14360o3.A0B(valueOf, 2);
        try {
            jSONObject.put(str, valueOf);
        } catch (JSONException unused) {
            C0K8.A0C("ArmadilloNotificationLogger", "Failed to insert field into JSONObject");
        }
    }
}
