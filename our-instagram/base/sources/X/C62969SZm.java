package X;

import android.preference.PreferenceManager;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;

/* renamed from: X.SZm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62969SZm {
    public InterfaceC25601Mq A00;
    public Integer A01;
    public String A02;
    public String A03;
    public final C1Ee A04 = new C1Ee();

    public static C26461Qb A00(C62969SZm c62969SZm) {
        c62969SZm.A01.getClass();
        C1Ee c1Ee = c62969SZm.A04;
        c1Ee.A05("access_token", c62969SZm.A02);
        String A0R = AnonymousClass001.A0R(AbstractC13670mt.A06("https://graph.%s/", PreferenceManager.getDefaultSharedPreferences(AbstractC12290kX.A00).getString("com.instagram.common.api.facebook.FacebookURLBuilder.KEY_FACEBOOK_ENDPOINT", IGPixelRequestBuffer.URL_PREFIX)), c62969SZm.A03);
        C26371Ps A0e = AbstractC58319PtB.A0e();
        A0e.A01(c62969SZm.A01);
        int intValue = c62969SZm.A01.intValue();
        if (intValue != 3 && intValue != 4) {
            if (intValue == 1) {
                A0e.A02(A0R);
                A0e.A00 = c1Ee.A00(true);
            } else {
                throw AbstractC43592JPx.A11();
            }
        } else {
            A0e.A02(c1Ee.A01(A0R));
        }
        C1QW A00 = A0e.A00();
        C1QX A0J = MSY.A0J();
        A0J.A03 = C1Ef.OnScreen;
        A0J.A0A = "FacebookGraphApi";
        return AbstractC58319PtB.A0d(A00, A0J);
    }

    public final C1ON A01() {
        this.A03.getClass();
        this.A00.getClass();
        C1OK c1ok = new C1OK();
        C908342w A02 = AbstractC24481Hr.A06.A00(new CallableC58499PwS(this, 5), 223, 2, false, true).A02(new C26561Ql(c1ok.A00), 349, 2, true, true).A02(this.A00, 350, 2, false, true);
        String str = this.A03;
        C14360o3.A0B(str, 3);
        return new C1ON(c1ok, AbstractC908442x.A00(A02), "FacebookGraphApi", str);
    }

    public final void A02(Class cls) {
        C52073N1y c52073N1y = C52073N1y.A00;
        C222015v c222015v = AbstractC221915u.A00;
        C14360o3.A08(c222015v);
        this.A00 = new C25591Mp(c222015v, new C25611Mr(null), cls, false);
    }
}
