package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CreatorViewerInsightInfoImpl;
import com.instagram.api.schemas.CreatorViewerSignalInfoImpl;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfoImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hmb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39888Hmb {
    public static CreatorViewerSignalWithInsightsInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreatorViewerSignalInfoImpl creatorViewerSignalInfoImpl = null;
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("image".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("insights".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            CreatorViewerInsightInfoImpl parseFromJson = AbstractC39871HmK.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("signal".equals(A0s)) {
                    creatorViewerSignalInfoImpl = AbstractC39880HmT.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (creatorViewerSignalInfoImpl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("signal", c16l, "CreatorViewerSignalWithInsightsInfoImpl");
                throw C00O.createAndThrow();
            }
            return new CreatorViewerSignalWithInsightsInfoImpl(creatorViewerSignalInfoImpl, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
