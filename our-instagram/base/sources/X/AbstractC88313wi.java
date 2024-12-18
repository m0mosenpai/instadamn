package X;

import com.instagram.model.mediasize.SpriteSheetInfoCandidatesImpl;
import com.instagram.model.mediasize.SpritesheetInfoImpl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;

/* renamed from: X.3wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88313wi {
    public static SpriteSheetInfoCandidatesImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            SpritesheetInfoImpl spritesheetInfoImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(A0q)) {
                    spritesheetInfoImpl = AbstractC88323wj.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new SpriteSheetInfoCandidatesImpl(spritesheetInfoImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
