package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Id6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41677Id6 {
    public static final InterfaceC09390do A00 = AbstractC09440dt.A01(C43177J7a.A00);

    public static final List A00(String str) {
        C14360o3.A0B(str, 0);
        String A0d = AbstractC002300n.A0d(str, "\n", "", false);
        C225117n A04 = AbstractC224517h.A04(JCL.A00, AbstractC224517h.A09(JCK.A00, AbstractC224517h.A09(new AnonymousClass074(A0d, 1), AbstractC001900j.A0S(A0d, new char[]{',', 65292, 1548, 12289}, 0))));
        JCM jcm = JCM.A00;
        C14360o3.A0B(jcm, 1);
        return AbstractC224517h.A02(new C37488Gf6(jcm, A04));
    }

    public static final List A01(String str) {
        List A03 = ((C11L) A00.getValue()).A03(str);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A03) {
            String str2 = (String) obj;
            if (str2 != null && str2.length() >= 2) {
                A1E.add(obj);
            }
        }
        return A1E;
    }
}
