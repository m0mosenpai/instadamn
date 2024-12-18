package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LCX {
    public static final String A00(C38321qM c38321qM, String str) {
        String str2;
        InterfaceC87503vI A1M;
        List ByM;
        C14360o3.A0B(c38321qM, 1);
        int ordinal = SocialContextType.A04.ordinal();
        if (ordinal != 1) {
            if (ordinal != 15) {
                str2 = null;
            } else {
                str2 = "SPOTLIGHT";
            }
        } else {
            str2 = "BLEND";
        }
        if (!C14360o3.A0K(str2, str) || (A1M = c38321qM.A1M()) == null || (ByM = A1M.ByM()) == null) {
            return null;
        }
        return AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, ByM, C50339MKr.A00);
    }

    public static final boolean A01(MNP mnp, AbstractC29011ae abstractC29011ae, C2DS c2ds) {
        AbstractC167027dH.A12(c2ds, abstractC29011ae, mnp);
        List<DirectThreadKey> C7R = abstractC29011ae.C7R();
        C14360o3.A07(C7R);
        if (!(C7R instanceof Collection) || !C7R.isEmpty()) {
            for (DirectThreadKey directThreadKey : C7R) {
                C14360o3.A0A(directThreadKey);
                C14360o3.A0B(directThreadKey, 3);
                if (C2DU.A03((C2DU) c2ds, directThreadKey) != null) {
                    C83403nh BSf = c2ds.BSf(directThreadKey, abstractC29011ae.Ar9(), abstractC29011ae.A06());
                    if (BSf == null || BSf.A0h() == null) {
                        return true;
                    }
                } else {
                    String str = ((JTV) mnp).A02;
                    if (!"upload_failed_permanent".equals(str) && !"upload_failed_transient".equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
