package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NrA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53820NrA {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        Integer num2;
        Integer num3;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        String A0Z = AbstractC31175DnJ.A0Z(c6fw, "null cannot be cast to non-null type kotlin.String");
        int A0D = AbstractC25230BEn.A0D(c6fw.A03(2), AbstractC111324zv.A00(38));
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        InterfaceC09390do interfaceC09390do = C55452gl.A02;
        C49G A00 = C55462gm.A00(A0S, String.valueOf(A0D));
        boolean A1R = AbstractC167007dF.A1R(0, str, A0Z);
        int hashCode = A0Z.hashCode();
        if (hashCode != -817598092) {
            if (hashCode != -314765822) {
                if (hashCode == 1671672458 && A0Z.equals("dismiss")) {
                    num = C05F.A0N;
                } else {
                    return null;
                }
            } else {
                if (!A0Z.equals("primary")) {
                    return null;
                }
                num = C05F.A01;
            }
        } else {
            if (!A0Z.equals("secondary")) {
                return null;
            }
            num = C05F.A0C;
        }
        int intValue = num.intValue();
        if (intValue != A1R) {
            if (intValue != 2) {
                C49G.A02(A00, C05F.A1F, C05F.A1I, C05F.A01, str);
                return null;
            }
            num2 = C05F.A0u;
            num3 = C05F.A15;
        } else {
            num2 = C05F.A0Y;
            num3 = C05F.A0j;
        }
        C49G.A02(A00, num2, num3, null, str);
        return null;
    }
}
