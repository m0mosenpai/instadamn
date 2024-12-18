package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LI9 {
    public static final C51740MtP A06 = new C51740MtP("INSTAGRAM_FAN_SUBS", 0);
    public final Context A00;
    public final C41761wQ A01;
    public final UserSession A02;
    public final C27611Vo A03;
    public final NRG A04;
    public final InterfaceC09390do A05;

    public static final void A00(FragmentActivity fragmentActivity, QIo qIo, LI9 li9, InterfaceC71543Iw interfaceC71543Iw) {
        interfaceC71543Iw.F8s(C32936EeH.A00);
        li9.A01.A02(((C56138Ovy) li9.A05.getValue()).A00(fragmentActivity, A06), new C36795GJu(1, qIo, interfaceC71543Iw, li9, fragmentActivity));
    }

    public LI9(Context context, UserSession userSession, C27611Vo c27611Vo, NRG nrg) {
        AbstractC167027dH.A13(userSession, nrg, context);
        this.A02 = userSession;
        this.A04 = nrg;
        this.A00 = context;
        this.A03 = c27611Vo;
        this.A01 = AbstractC31173DnH.A0S();
        this.A05 = AbstractC09440dt.A01(new C37049GUf(this, 27));
    }
}
