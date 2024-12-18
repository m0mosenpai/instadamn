package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ImageURIDictImpl;
import com.instagram.api.schemas.StoryUnlockableStickerDataImpl;
import com.instagram.api.schemas.UnlockableStickerStatus;
import java.io.IOException;

/* renamed from: X.Huw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40352Huw {
    public static StoryUnlockableStickerDataImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ImageURIDictImpl imageURIDictImpl = null;
            UnlockableStickerStatus unlockableStickerStatus = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("thumbnail_image".equals(A0q)) {
                    imageURIDictImpl = AbstractC40027HpE.parseFromJson(c16l);
                } else if ("unlock_status".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    unlockableStickerStatus = (UnlockableStickerStatus) UnlockableStickerStatus.A01.get(A1P);
                    if (unlockableStickerStatus == null) {
                        unlockableStickerStatus = UnlockableStickerStatus.A06;
                    }
                }
                c16l.A0z();
            }
            return new StoryUnlockableStickerDataImpl(imageURIDictImpl, unlockableStickerStatus, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
