package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LGY {
    public final UserSession A00;
    public final C48519LdH A01;
    public final java.util.Set A02;
    public final InterfaceC09390do A03;

    public LGY(UserSession userSession, C48519LdH c48519LdH) {
        int A06 = AbstractC167007dF.A06(1, userSession, c48519LdH);
        this.A00 = userSession;
        this.A01 = c48519LdH;
        this.A03 = MHK.A00(this, EnumC09460dv.A02, A06);
        this.A02 = AbstractC16830sb.A07(EnumC46208Kck.A0H, EnumC46208Kck.A0I);
    }

    public static void A00(Activity activity, EnumC46208Kck enumC46208Kck, EnumC46149Kbn enumC46149Kbn, LGY lgy, Integer num) {
        lgy.A01(activity, new Bundle(), enumC46208Kck, enumC46149Kbn, num, C05F.A00, null);
    }

    public final void A01(Activity activity, Bundle bundle, EnumC46208Kck enumC46208Kck, EnumC46149Kbn enumC46149Kbn, Integer num, Integer num2, Integer num3) {
        AbstractC167027dH.A0a(0, activity, num, enumC46149Kbn, num2);
        C14360o3.A0B(bundle, 6);
        if (((C6CF) this.A03.getValue()).A00()) {
            C11T.A03(new M7B(activity, bundle, enumC46208Kck, enumC46149Kbn, this, num, num2, num3));
        }
    }

    public final void A02(Activity activity, Bundle bundle, EnumC46149Kbn enumC46149Kbn, Integer num, Integer num2) {
        AbstractC43594JPz.A1P(enumC46149Kbn, bundle);
        if (((C6CF) this.A03.getValue()).A00()) {
            C11T.A03(new RunnableC50030M6t(activity, bundle, enumC46149Kbn, this, num, num2));
        }
    }
}
