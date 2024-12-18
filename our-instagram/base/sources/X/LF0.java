package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LF0 {
    public final C42221xC A00;
    public final UserSession A01;
    public final LGY A02;
    public final LF2 A03;
    public final C44100JeP A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public /* synthetic */ LF0(UserSession userSession) {
        C42221xC A00 = AbstractC47843LBl.A00(userSession, "EncryptedBackupsBlockNuxManager");
        LGY A002 = AbstractC46741Kly.A00(userSession);
        LF2 lf2 = new LF2(userSession);
        C44100JeP c44100JeP = new C44100JeP(userSession);
        AbstractC167027dH.A13(userSession, A00, A002);
        this.A01 = userSession;
        this.A00 = A00;
        this.A02 = A002;
        this.A03 = lf2;
        this.A04 = c44100JeP;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = MHK.A00(this, enumC09460dv, 13);
        this.A08 = AbstractC09440dt.A00(enumC09460dv, MFW.A00);
        this.A05 = MHK.A00(this, enumC09460dv, 12);
        this.A07 = AbstractC09440dt.A00(enumC09460dv, MFV.A00);
    }

    public static final void A00(Activity activity, Fragment fragment, LF0 lf0, boolean z, boolean z2) {
        EnumC46208Kck enumC46208Kck;
        Bundle A0b;
        InterfaceC09390do interfaceC09390do = lf0.A06;
        if (AbstractC43594JPz.A1a(interfaceC09390do) && ((C6CF) interfaceC09390do.getValue()).A01(activity)) {
            enumC46208Kck = EnumC46208Kck.A07;
        } else {
            enumC46208Kck = EnumC46208Kck.A0O;
        }
        if (z) {
            A0b = AbstractC31178DnM.A06("BUNDLE_IS_HARDBLOCK_RELEASE", AbstractC166997dE.A0b());
        } else {
            A0b = AbstractC166987dD.A0b();
        }
        A0b.putBoolean("BUNDLE_HAS_IMPLICIT_BACKUP", z2);
        LGY lgy = lf0.A02;
        Integer num = C05F.A1I;
        Integer num2 = C05F.A0j;
        if (((C6CF) lgy.A03.getValue()).A00()) {
            C11T.A03(new RunnableC50029M6s(A0b, fragment, enumC46208Kck, lgy, num, num2));
        }
    }
}
