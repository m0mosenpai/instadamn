package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.IGCTAStickerPositioningStrategyEnum;
import java.io.IOException;

/* renamed from: X.406, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass406 {
    public static C40B parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AnonymousClass408 anonymousClass408 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("customPositionInfo".equals(A0q)) {
                    anonymousClass408 = AnonymousClass407.parseFromJson(c16l);
                } else if ("overlapsBottom10Percent".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("overlapsBottom20Percent".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGCTAStickerPositioningStrategyEnum = (IGCTAStickerPositioningStrategyEnum) IGCTAStickerPositioningStrategyEnum.A01.get(A1P);
                    if (iGCTAStickerPositioningStrategyEnum == null) {
                        iGCTAStickerPositioningStrategyEnum = IGCTAStickerPositioningStrategyEnum.A0C;
                    }
                }
                c16l.A0z();
            }
            return new C40B(anonymousClass408, iGCTAStickerPositioningStrategyEnum, bool, bool2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
