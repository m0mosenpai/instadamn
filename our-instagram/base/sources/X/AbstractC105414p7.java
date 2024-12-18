package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfo;
import com.instagram.model.showreel.IgShowreelCompositionAssetType;
import java.io.IOException;

/* renamed from: X.4p7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105414p7 {
    public static IgShowreelCompositionAssetInfo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IgShowreelCompositionAssetType igShowreelCompositionAssetType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    igShowreelCompositionAssetType = (IgShowreelCompositionAssetType) IgShowreelCompositionAssetType.A01.get(A1P);
                    if (igShowreelCompositionAssetType == null) {
                        igShowreelCompositionAssetType = IgShowreelCompositionAssetType.A05;
                    }
                } else if ("url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new IgShowreelCompositionAssetInfo(igShowreelCompositionAssetType, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, IgShowreelCompositionAssetInfo igShowreelCompositionAssetInfo) {
        anonymousClass182.A0d();
        IgShowreelCompositionAssetType igShowreelCompositionAssetType = igShowreelCompositionAssetInfo.A00;
        if (igShowreelCompositionAssetType != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, igShowreelCompositionAssetType.A00);
        }
        String str = igShowreelCompositionAssetInfo.A01;
        if (str != null) {
            anonymousClass182.A0S("url", str);
        }
        anonymousClass182.A0a();
    }
}
