package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.selfiecaptcha.videoupload.IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1;

/* loaded from: classes10.dex */
public final class SXD {
    public final Context A00;
    public final Handler A01;
    public final SNJ A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public static final void A00(UserSession userSession, SXD sxd, Integer num) {
        EnumC40111tc enumC40111tc;
        boolean A1W = AbstractC167007dF.A1W(sxd.A06);
        Integer num2 = C05F.A00;
        boolean A1X = AbstractC167007dF.A1X(num, num2);
        String valueOf = String.valueOf(System.nanoTime());
        String A02 = C6WI.A02();
        C14360o3.A07(A02);
        if (A1X) {
            enumC40111tc = EnumC40111tc.A0I;
        } else {
            enumC40111tc = EnumC40111tc.A0J;
        }
        WVG wvg = new WVG(new OVd(userSession));
        int i = 1164305889;
        if (A1X) {
            i = 655;
        }
        C19K A01 = AbstractC24771Iv.A01(i, 3);
        AbstractC23641Du.A03(num2, AnonymousClass191.A00, new IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1(wvg, userSession, enumC40111tc, sxd, num, valueOf, A02, null, A1X, A1W), A01);
    }

    public SXD(Context context, SNJ snj, String str, String str2, String str3, String str4, String str5) {
        AbstractC43594JPz.A1P(str, str3);
        this.A00 = context;
        this.A03 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A04 = str5;
        this.A02 = snj;
        this.A01 = AbstractC167007dF.A0J();
    }
}
