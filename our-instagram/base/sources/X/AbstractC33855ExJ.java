package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.ExJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33855ExJ {
    public static final C189478aR A00(C6FQ c6fq, C6FW c6fw) {
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
        Object A03 = c6fw.A03(0);
        String A0f = AbstractC31171DnF.A0f(A03);
        String str = (String) A03;
        String A0Z = AbstractC31175DnJ.A0Z(c6fw, A0f);
        Object A032 = c6fw.A03(2);
        C14360o3.A0C(A032, A0f);
        String str2 = (String) A032;
        C189448aO A0y = AbstractC25225BEi.A0y(A0J);
        A0y.A01();
        A0y.A02();
        C189478aR A00 = A0y.A00();
        FVI.A01().A00();
        AbstractC167007dF.A1K(A0J, str);
        AbstractC167007dF.A1E(A0Z, 2, str2);
        EIU eiu = new EIU();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A03(A0b, A0J);
        A0b.putString("creator_user_id", str);
        A0b.putString("recipient_user_id", A0Z);
        A0b.putString("origin", str2);
        eiu.setArguments(A0b);
        return A00.A02(A04, eiu);
    }
}
