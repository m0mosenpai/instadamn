package X;

import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nqv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53805Nqv {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP2 = (C102884kP) A02;
        int A032 = c102884kP.A03(38, Integer.MIN_VALUE);
        if (A032 != Integer.MIN_VALUE) {
            String A0F = c102884kP.A0F();
            if (A0F != null) {
                String A0L = c102884kP.A0L(44);
                if (A0L != null) {
                    boolean A0S = c102884kP.A0S(41, false);
                    String A0G = c102884kP.A0G();
                    if (A0G != null) {
                        String A0K = c102884kP.A0K();
                        if (A0K != null) {
                            String A0E = c102884kP.A0E();
                            if (A0E != null) {
                                List A0O = c102884kP.A0O(42);
                                C14360o3.A07(A0O);
                                ArrayList A0q = AbstractC167017dG.A0q(A0O);
                                Iterator it = A0O.iterator();
                                while (it.hasNext()) {
                                    AbstractC166997dE.A1S(it.next(), A0q);
                                }
                                NewFundraiserInfo newFundraiserInfo = new NewFundraiserInfo(null, A0F, A0L, A0G, A0K, A0E, FundraiserCampaignTypeEnum.A0E.toString(), null, A0q, A032, A0S);
                                String str = "";
                                String str2 = "";
                                String A0G2 = c102884kP2.A0G();
                                if (A0G2 != null) {
                                    str2 = A0G2;
                                }
                                String A0E2 = c102884kP2.A0E();
                                String str3 = "";
                                String A0I = c102884kP2.A0I();
                                if (A0I != null) {
                                    str3 = A0I;
                                }
                                String A0F2 = c102884kP2.A0F();
                                String A0L2 = c102884kP2.A0L(41);
                                if (A0L2 != null) {
                                    str = A0L2;
                                }
                                AbstractC25651Mw.A00(C6BQ.A0B(c6fq)).E4s(new C171427kY(new FundraiserDisplayInfoModel(str2, A0E2, str3, A0F2, str), newFundraiserInfo));
                                return null;
                            }
                            throw AbstractC166987dD.A12("Requires charity id");
                        }
                        throw AbstractC166987dD.A12("Requires source name");
                    }
                    throw AbstractC166987dD.A12("Requires description");
                }
                throw AbstractC166987dD.A12("Requires title");
            }
            throw AbstractC166987dD.A12("Requires goal currency");
        }
        throw AbstractC166987dD.A12("Requires goal amount");
    }
}
