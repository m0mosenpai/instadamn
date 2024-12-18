package X;

import androidx.fragment.app.Fragment;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;

/* renamed from: X.VwS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69842VwS {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2ba, java.lang.Object] */
    public static final UFU A00(Fragment fragment, ECPPaymentRequest eCPPaymentRequest, LoggingContext loggingContext) {
        InterfaceC58271PsP wbL;
        C14360o3.A0B(loggingContext, 1);
        XF6 A00 = W8Q.A00(fragment);
        if (A00 == null || (wbL = (InterfaceC58271PsP) ((C67729Uwv) A00).A08.getValue()) == null) {
            wbL = new WbL(fragment);
        }
        return (UFU) new C52942bb(new WR1((UFP) new C52942bb((InterfaceC52932ba) new Object(), wbL).A00(UFP.class), loggingContext, (UFS) new C52942bb(new UFA(wbL, eCPPaymentRequest), wbL).A01(UFS.class, "246423e6-8ba8-11ec-a8a3-0242ac120002")), wbL).A00(UFU.class);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.2ba, java.lang.Object] */
    public static final UFX A01(Fragment fragment, ECPPaymentRequest eCPPaymentRequest, LoggingContext loggingContext) {
        InterfaceC58271PsP wbL;
        C14360o3.A0B(loggingContext, 1);
        XF6 A00 = W8Q.A00(fragment);
        if (A00 == null || (wbL = (InterfaceC58271PsP) ((C67729Uwv) A00).A08.getValue()) == null) {
            wbL = new WbL(fragment);
        }
        UFS ufs = (UFS) new C52942bb(new UFA(wbL, eCPPaymentRequest), wbL).A01(UFS.class, "246423e6-8ba8-11ec-a8a3-0242ac120002");
        UFP ufp = (UFP) new C52942bb((InterfaceC52932ba) new Object(), wbL).A00(UFP.class);
        Q8g q8g = (Q8g) new C52942bb(new WR0(ufp, ufs), wbL).A00(Q8g.class);
        C66392UFd c66392UFd = (C66392UFd) new C52942bb(new C70316WQw(ufs), wbL).A00(C66392UFd.class);
        return (UFX) new C52942bb(new WR2((C66393UFe) new C52942bb(new C70313WQt(ufs), wbL).A00(C66393UFe.class), (UFC) new C52942bb(new C70314WQu(ufs), wbL).A00(UFC.class), (C66390UFb) new C52942bb(new C70315WQv(ufs), wbL).A00(C66390UFb.class), ufp, loggingContext, ufs, c66392UFd, q8g, (C66389UFa) new C52942bb(new C70317WQx(ufs), wbL).A00(C66389UFa.class), (C66391UFc) new C52942bb(new C70318WQy(ufs), wbL).A00(C66391UFc.class), (UFG) new C52942bb(new C70319WQz(ufs), wbL).A00(UFG.class)), wbL).A00(UFX.class);
    }
}
