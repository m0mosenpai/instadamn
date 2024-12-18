package X;

import com.instagram.model.androidlink.AndroidLink;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gdc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37396Gdc {
    public static Map A00(AndroidLink androidLink) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (androidLink.Abj() != null) {
            A1I.put("androidClass", androidLink.Abj());
        }
        if (androidLink.AcH() != null) {
            A1I.put("appId", androidLink.AcH());
        }
        if (androidLink.AcK() != null) {
            A1I.put("appInstallObjectiveInvalidationBehavior", androidLink.AcK());
        }
        if (androidLink.getAppName() != null) {
            A1I.put("appName", androidLink.getAppName());
        }
        if (androidLink.Ajo() != null) {
            A1I.put("callToActionTitle", androidLink.Ajo());
        }
        if (androidLink.AlR() != null) {
            A1I.put("canvasData", androidLink.AlR());
        }
        if (androidLink.AlS() != null) {
            A1I.put("canvasDocId", androidLink.AlS());
        }
        if (androidLink.Ar1() != null) {
            A1I.put("contentId", androidLink.Ar1());
        }
        if (androidLink.Aw8() != null) {
            A1I.put("deeplinkUri", androidLink.Aw8());
        }
        if (androidLink.Ax1() != null) {
            A1I.put(AbstractC111324zv.A00(4259), androidLink.Ax1());
        }
        if (androidLink.B9G() != null) {
            A1I.put("funnelId", androidLink.B9G());
        }
        if (androidLink.B9H() != null) {
            A1I.put("funnelPurpose", androidLink.B9H());
        }
        if (androidLink.BGG() != null) {
            A1I.put("igUserId", androidLink.BGG());
        }
        if (androidLink.CPt() != null) {
            A1I.put("isAndroidAppLink", androidLink.CPt());
        }
        if (androidLink.CcE() != null) {
            A1I.put("isSKOverlayEnabled", androidLink.CcE());
        }
        if (androidLink.Cf2() != null) {
            A1I.put("isUniversalLink", androidLink.Cf2());
        }
        if (androidLink.Cg8() != null) {
            A1I.put("isVtOdirEligible", androidLink.Cg8());
        }
        if (androidLink.BMm() != null) {
            A1I.put("leadGenFormId", androidLink.BMm());
        }
        if (androidLink.BNX() != null) {
            A1I.put("linkType", androidLink.BNX());
        }
        if (androidLink.CIt() != null) {
            A1I.put("package", androidLink.CIt());
        }
        if (androidLink.Bdp() != null) {
            A1I.put("playableUri", androidLink.Bdp());
        }
        if (androidLink.BhG() != null) {
            A1I.put("productPageId", androidLink.BhG());
        }
        if (androidLink.Bka() != null) {
            A1I.put("rawWebUri", androidLink.Bka());
        }
        if (androidLink.BlN() != null) {
            A1I.put("redirectUri", androidLink.BlN());
        }
        if (androidLink.Bm5() != null) {
            A1I.put("referrerData", androidLink.Bm5());
        }
        if (androidLink.C5F() != null) {
            A1I.put("tapAndHoldContext", androidLink.C5F());
        }
        if (androidLink.CHN() != null) {
            A1I.put("webUri", androidLink.CHN());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
