package X;

import com.instagram.api.schemas.CreatorDigestSignalInfo;
import com.instagram.api.schemas.InspirationSignalType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39864HmD {
    public static Map A00(CreatorDigestSignalInfo creatorDigestSignalInfo) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (creatorDigestSignalInfo.BxI() != null) {
            InspirationSignalType BxI = creatorDigestSignalInfo.BxI();
            if (BxI != null) {
                str = BxI.A00;
            } else {
                str = null;
            }
            A1I.put("signal_type", str);
        }
        if (creatorDigestSignalInfo.getSubtitle() != null) {
            A1I.put("subtitle", creatorDigestSignalInfo.getSubtitle());
        }
        if (creatorDigestSignalInfo.getTitle() != null) {
            AbstractC37300Gc1.A17(creatorDigestSignalInfo.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
