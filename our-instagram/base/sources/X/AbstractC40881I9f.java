package X;

import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl;
import com.instagram.sponsored.signals.model.AdsTextTrustInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I9f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40881I9f {
    public static AdsTextTrustInfo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AdsBizBadgeInfoImpl adsBizBadgeInfoImpl = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("info_data".equals(A0s)) {
                    adsBizBadgeInfoImpl = I9Z.parseFromJson(c16l);
                } else if ("info_type_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum = (IGAdsTrustInfoTypeEnum) IGAdsTrustInfoTypeEnum.A01.get(A1P);
                            if (iGAdsTrustInfoTypeEnum == null) {
                                iGAdsTrustInfoTypeEnum = IGAdsTrustInfoTypeEnum.A0D;
                            }
                            arrayList.add(iGAdsTrustInfoTypeEnum);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new AdsTextTrustInfo(adsBizBadgeInfoImpl, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
