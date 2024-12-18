package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerContextCTA;
import com.instagram.api.schemas.CreatorViewerContextCTATarget;
import com.instagram.api.schemas.CreatorViewerContextCTAType;
import com.instagram.api.schemas.FormattedString;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39868HmH {
    public static Map A00(CreatorViewerContextCTA creatorViewerContextCTA) {
        TreeUpdaterJNI treeUpdaterJNI;
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (creatorViewerContextCTA.ArJ() != null) {
            CreatorViewerContextCTAType ArJ = creatorViewerContextCTA.ArJ();
            C14360o3.A0B(ArJ, 0);
            A1I.put("context_cta_type", ArJ.A00);
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (creatorViewerContextCTA.Ato() != null) {
            CreatorViewerContextCTATarget Ato = creatorViewerContextCTA.Ato();
            if (Ato != null) {
                str = Ato.A00;
            } else {
                str = null;
            }
            A1I.put("cta_target", str);
        }
        if (creatorViewerContextCTA.B3S() != null) {
            FormattedString B3S = creatorViewerContextCTA.B3S();
            if (B3S != null) {
                treeUpdaterJNI = B3S.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("extended_text", treeUpdaterJNI);
        }
        if (creatorViewerContextCTA.B8J() != null) {
            FormattedString B8J = creatorViewerContextCTA.B8J();
            if (B8J != null) {
                treeUpdaterJNI2 = B8J.F7o();
            }
            A1I.put("formatted_text", treeUpdaterJNI2);
        }
        if (creatorViewerContextCTA.BEi() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, creatorViewerContextCTA.BEi());
        }
        if (creatorViewerContextCTA.getText() != null) {
            AbstractC37300Gc1.A15(creatorViewerContextCTA.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
