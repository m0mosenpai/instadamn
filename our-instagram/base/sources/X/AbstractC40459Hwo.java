package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.XDTFloatingContextItemType;
import com.instagram.api.schemas.XDTLazyFloatingContextItemImpl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Hwo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40459Hwo {
    public static XDTLazyFloatingContextItemImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            XDTFloatingContextItemType xDTFloatingContextItemType = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("floating_context_item_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    xDTFloatingContextItemType = (XDTFloatingContextItemType) XDTFloatingContextItemType.A01.get(A1P);
                    if (xDTFloatingContextItemType == null) {
                        xDTFloatingContextItemType = XDTFloatingContextItemType.A08;
                    }
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                c16l.A0z();
            }
            return new XDTLazyFloatingContextItemImpl(xDTFloatingContextItemType, user);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
