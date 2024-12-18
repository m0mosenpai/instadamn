package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Eyf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33939Eyf {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str = (String) c6fw.A03(0);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1P(A0B, A04);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("igUserId", str);
        AbstractC27401Ut.getInstance();
        C64501TGn A01 = new C64501TGn(A0B).A01("IgFundraiserLandingRoute");
        A01.A00(A0b);
        A01.A02(A04);
        return null;
    }
}
