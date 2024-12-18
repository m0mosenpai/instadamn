package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hxn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40505Hxn {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        EnumC39619HeT enumC39619HeT;
        String str = (String) c6fw.A01();
        int A0H = AbstractC166987dD.A0H(c6fw.A02());
        int A0H2 = AbstractC166987dD.A0H(c6fw.A00());
        int A0H3 = AbstractC166987dD.A0H(c6fw.A03(3));
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        String valueOf = String.valueOf(A0H3);
        EnumC39619HeT[] values = EnumC39619HeT.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC39619HeT = values[i];
                if (C14360o3.A0K(enumC39619HeT.A00, valueOf)) {
                    break;
                }
                i++;
            } else {
                enumC39619HeT = null;
                break;
            }
        }
        enumC39619HeT.getClass();
        AbstractC69883VxA.A01(A04, A08, A0K, enumC39619HeT, str, A0H, A0H2);
        return null;
    }
}
