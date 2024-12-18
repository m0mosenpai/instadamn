package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class K30 extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final UserSession A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String str;
        C14360o3.A0B(c76223bS, 0);
        C1R0 C98 = C26661Qv.A00(this.A01).C98();
        C14360o3.A07(C98);
        C5QE A00 = AbstractC47124KsJ.A00(C98, "");
        C50355MLh c50355MLh = new C50355MLh(c76223bS, 1);
        C50355MLh c50355MLh2 = new C50355MLh(c76223bS, 0);
        if (A00 != null) {
            Context context = c76223bS.A05.A0C;
            C14360o3.A07(context);
            str = BHX.A00(context, A00).toString();
        } else {
            str = null;
        }
        return new C26642Bpd(this.A00, str, c50355MLh, c50355MLh2, C2Z3.A00(c76223bS.BoZ(), Float.floatToRawIntBits(11.0f) | 9221683186994511872L), 1.0f, R.drawable.spinsta_data_white, AbstractC77623dm.A03(c76223bS, R.color.design_dark_default_color_on_background));
    }

    public K30(C51722Yv c51722Yv, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, c51722Yv);
        this.A01 = userSession;
        this.A00 = c51722Yv;
    }
}
