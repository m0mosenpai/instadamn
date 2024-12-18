package X;

import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ewy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33834Ewy {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        String A00 = MSV.A00(10);
        C14360o3.A0C(A03, A00);
        C102884kP c102884kP = (C102884kP) A03;
        String A002 = MSV.A00(844);
        int A032 = c102884kP.A03(38, Integer.MIN_VALUE);
        if (A032 != Integer.MIN_VALUE) {
            String A003 = MSV.A00(845);
            String A0F = c102884kP.A0F();
            if (A0F != null) {
                String A004 = MSV.A00(847);
                String A0L = c102884kP.A0L(44);
                if (A0L != null) {
                    boolean A0S = c102884kP.A0S(41, false);
                    String A005 = MSV.A00(843);
                    String A0G = c102884kP.A0G();
                    if (A0G != null) {
                        String A006 = MSV.A00(846);
                        String A0K = c102884kP.A0K();
                        if (A0K != null) {
                            String A007 = MSV.A00(842);
                            String A0L2 = c102884kP.A0L(35);
                            if (A0L2 != null) {
                                List A0O = c102884kP.A0O(42);
                                C14360o3.A07(A0O);
                                ArrayList A0q = AbstractC167017dG.A0q(A0O);
                                Iterator it = A0O.iterator();
                                while (it.hasNext()) {
                                    A0q.add(it.next().toString());
                                }
                                NewFundraiserInfo newFundraiserInfo = new NewFundraiserInfo(null, A0F, A0L, A0G, A0K, A0L2, null, null, A0q, A032, A0S);
                                Object A02 = c6fw.A02();
                                C14360o3.A0C(A02, A00);
                                C102884kP c102884kP2 = (C102884kP) A02;
                                C102884kP A08 = c102884kP2.A08(40);
                                if (A08 != null) {
                                    AHE ahe = null;
                                    String str = "";
                                    String A0L3 = c102884kP2.A0L(42);
                                    if (A0L3 != null) {
                                        str = A0L3;
                                    }
                                    String A0G2 = c102884kP2.A0G();
                                    AHE A008 = FDI.A00(A08);
                                    String A0L4 = c102884kP2.A0L(41);
                                    int A033 = c102884kP2.A03(35, 0);
                                    C102884kP A082 = c102884kP2.A08(38);
                                    if (A082 != null) {
                                        ahe = FDI.A00(A082);
                                    }
                                    AbstractC25651Mw.A00(C6BQ.A0B(c6fq)).E4s(new C8P9(new C1816383s(newFundraiserInfo, ahe, A008, A0L4, null, A0G2, null, "", str, A033)));
                                    return null;
                                }
                                throw AbstractC166987dD.A12("Requires valid creator model");
                            }
                            throw AbstractC166987dD.A12(A007);
                        }
                        throw AbstractC166987dD.A12(A006);
                    }
                    throw AbstractC166987dD.A12(A005);
                }
                throw AbstractC166987dD.A12(A004);
            }
            throw AbstractC166987dD.A12(A003);
        }
        throw AbstractC166987dD.A12(A002);
    }
}
