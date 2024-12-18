package X;

import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VPQ {
    public static URV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            UR4 ur4 = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            UR5 ur5 = null;
            URB urb = null;
            URC urc = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AppStateModule.APP_STATE_BACKGROUND.equals(A0s)) {
                    ur4 = AbstractC69870Vwv.parseFromJson(c16l);
                } else if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT.equals(A0s)) {
                    ur5 = AbstractC69871Vww.parseFromJson(c16l);
                } else if ("page_name".equals(A0s)) {
                    urb = AbstractC69872Vwx.parseFromJson(c16l);
                } else if ("thumbnail".equals(A0s)) {
                    urc = AbstractC69873Vwy.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new URV(ur4, ur5, urb, urc);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
