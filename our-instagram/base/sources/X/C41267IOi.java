package X;

import com.instagram.api.schemas.FundraiserCampaignStateEnum;
import java.io.IOException;

/* renamed from: X.IOi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41267IOi {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1um, X.H97, X.1ul] */
    public static H97 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fundraiser_id".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("fundraiser_state".equals(A0s)) {
                    FundraiserCampaignStateEnum fundraiserCampaignStateEnum = (FundraiserCampaignStateEnum) FundraiserCampaignStateEnum.A01.get(AbstractC167017dG.A0m(c16l));
                    if (fundraiserCampaignStateEnum == null) {
                        fundraiserCampaignStateEnum = FundraiserCampaignStateEnum.A08;
                    }
                    c40791um.A00 = fundraiserCampaignStateEnum;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A01 = new C38747H4n(c40791um.A00, c40791um.A02);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
