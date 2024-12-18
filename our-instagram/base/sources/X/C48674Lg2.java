package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lg2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48674Lg2 implements MQZ {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final EnumC46164Kc2 A03 = EnumC46164Kc2.A05;
    public final Integer A04;
    public final InterfaceC09390do A05;

    @Override // X.MQZ
    public final C45122Jxr BUI() {
        return (C45122Jxr) this.A05.getValue();
    }

    @Override // X.MQZ
    public final void DAt() {
        UserSession userSession = this.A01;
        AbstractC46740Klx.A00(userSession).A0D(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C44100JeP.A03(new C44100JeP(userSession), C05F.A0N, num);
        }
    }

    @Override // X.MQZ
    public final void Daq() {
        EnumC46208Kck enumC46208Kck;
        UserSession userSession = this.A01;
        AbstractC46740Klx.A00(userSession).A0C(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C44100JeP.A03(new C44100JeP(userSession), C05F.A0N, num);
        }
        InterfaceC09390do interfaceC09390do = this.A02;
        if (AbstractC43594JPz.A1a(interfaceC09390do) && ((C6CF) interfaceC09390do.getValue()).A01(this.A00)) {
            enumC46208Kck = EnumC46208Kck.A08;
        } else {
            enumC46208Kck = EnumC46208Kck.A05;
        }
        LGY A00 = AbstractC46741Kly.A00(userSession);
        Activity activity = this.A00;
        Integer num2 = C05F.A03;
        A00.A01(activity, AbstractC166987dD.A0b(), enumC46208Kck, EnumC46149Kbn.A02, num2, C05F.A0N, num);
    }

    public C48674Lg2(Activity activity, UserSession userSession, Integer num) {
        this.A04 = num;
        this.A00 = activity;
        this.A01 = userSession;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = MHL.A00(this, enumC09460dv, 30);
        this.A05 = MHL.A00(this, enumC09460dv, 31);
    }
}
