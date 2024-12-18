package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hxj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40501Hxj {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC77173d3 enumC77173d3;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A02;
        Object A032 = c6fw.A03(2);
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) A032;
        Object obj = c6fw.A00.get(3);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (A0B instanceof UserSession) {
            UserSession userSession = (UserSession) A0B;
            boolean A1R = AbstractC167007dF.A1R(0, userSession, str);
            C14360o3.A0B(str2, 2);
            C14360o3.A0B(str3, 3);
            if (str.equals("media")) {
                C1DX A00 = C1DW.A00(userSession);
                C38321qM A022 = A00.A02(str2);
                if (A022 == null) {
                    C38801rC c38801rC = C38321qM.A0h;
                    C38821rE parseFromJson = AbstractC38811rD.parseFromJson(C16V.A00(AnonymousClass001.A0g("{\"id\": \"", str2, "\"}")));
                    C14360o3.A07(parseFromJson);
                    A022 = C38801rC.A02(parseFromJson);
                    if (A022 != null) {
                        A00.A01(A022, A1R, false);
                    }
                }
                if (str3.equals("has_liked")) {
                    C14360o3.A0C(obj, AbstractC111324zv.A00(11));
                    if (AbstractC166987dD.A1a(obj)) {
                        enumC77173d3 = EnumC77173d3.A02;
                    } else {
                        enumC77173d3 = EnumC77173d3.A03;
                    }
                    if (A022 != null) {
                        I0H.A00(userSession, A022.A1c(), enumC77173d3, A022);
                        return null;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
