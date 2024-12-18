package X;

import com.instagram.api.schemas.IGProjectPortalInfoDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hov, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40014Hov {
    public static Map A00(IGProjectPortalInfoDict iGProjectPortalInfoDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGProjectPortalInfoDict.AhU() != null) {
            A1I.put("bottomColor", iGProjectPortalInfoDict.AhU());
        }
        if (iGProjectPortalInfoDict.Alf() != null) {
            A1I.put("captionBackgroundColor", iGProjectPortalInfoDict.Alf());
        }
        if (iGProjectPortalInfoDict.Alg() != null) {
            A1I.put("captionBackgroundColorAlpha", iGProjectPortalInfoDict.Alg());
        }
        if (iGProjectPortalInfoDict.Alk() != null) {
            A1I.put("captionColor", iGProjectPortalInfoDict.Alk());
        }
        if (iGProjectPortalInfoDict.C5f() != null) {
            A1I.put("templateId", iGProjectPortalInfoDict.C5f());
        }
        if (iGProjectPortalInfoDict.C9T() != null) {
            A1I.put("topColor", iGProjectPortalInfoDict.C9T());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
