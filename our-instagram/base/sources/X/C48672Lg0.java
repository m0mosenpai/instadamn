package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lg0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48672Lg0 implements MQZ {
    public final Activity A00;
    public final C45122Jxr A01;
    public final UserSession A02;
    public final EnumC46164Kc2 A03 = EnumC46164Kc2.A04;
    public final Integer A04;

    @Override // X.MQZ
    public final C45122Jxr BUI() {
        return this.A01;
    }

    @Override // X.MQZ
    public final void DAt() {
        UserSession userSession = this.A02;
        AbstractC46740Klx.A00(userSession).A0D(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C44100JeP.A03(new C44100JeP(userSession), C05F.A01, num);
        }
    }

    @Override // X.MQZ
    public final void Daq() {
        UserSession userSession = this.A02;
        AbstractC46740Klx.A00(userSession).A0C(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C44100JeP.A03(new C44100JeP(userSession), C05F.A01, num);
        }
        LGY A00 = AbstractC46741Kly.A00(userSession);
        Activity activity = this.A00;
        EnumC46208Kck enumC46208Kck = EnumC46208Kck.A06;
        Integer num2 = C05F.A03;
        A00.A01(activity, AbstractC166987dD.A0b(), enumC46208Kck, EnumC46149Kbn.A02, num2, C05F.A01, num);
    }

    public C48672Lg0(Activity activity, UserSession userSession, Integer num) {
        this.A04 = num;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = new C45122Jxr(AbstractC166997dE.A0p(activity, 2131961287), activity.getString(2131961776), activity.getString(2131961288), C05F.A01, R.drawable.ig_illustrations_illo_lock_confirmation_refresh);
    }
}
