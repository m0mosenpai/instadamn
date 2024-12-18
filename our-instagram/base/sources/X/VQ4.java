package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VQ4 {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.1oF] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC11380iw A08;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        List list = c6fw.A00;
        String str = (String) list.get(1);
        String str2 = (String) list.get(2);
        String str3 = (String) list.get(5);
        if (str != null && str.length() != 0) {
            A08 = new C19270xB(str);
        } else {
            A08 = C6BQ.A08(c6fq);
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (A04 != null) {
            AbstractC31176DnK.A12(A04, C3DN.A00);
        }
        if (C37171oF.A00 == null) {
            C37171oF.A00 = new Object();
        }
        C37171oF A00 = VXN.A00();
        FragmentActivity A042 = C6BQ.A04(c6fq);
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        EnumC72410Xcy enumC72410Xcy = (EnumC72410Xcy) EnumHelper.A00(A0d, EnumC72410Xcy.A1F);
        C14360o3.A07(enumC72410Xcy);
        C14360o3.A0B(A042, 0);
        AbstractC167007dF.A1D(userSession, 1, A08);
        C37171oF.A00(A042, A08, userSession, enumC72410Xcy, A00, str2, str3).A05();
        return null;
    }
}
