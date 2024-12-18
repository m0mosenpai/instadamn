package X;

import com.instagram.api.schemas.AppInstallCTAInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HkF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39743HkF {
    public static Map A00(AppInstallCTAInfoIntf appInstallCTAInfoIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (appInstallCTAInfoIntf.Abn() != null) {
            A1I.put("android_package", appInstallCTAInfoIntf.Abn());
        }
        if (appInstallCTAInfoIntf.BJX() != null) {
            A1I.put("ios_content_id", appInstallCTAInfoIntf.BJX());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
