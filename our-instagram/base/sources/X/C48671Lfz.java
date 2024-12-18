package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lfz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48671Lfz implements MQZ {
    public final Activity A00;
    public final C45122Jxr A01;
    public final UserSession A02;
    public final EnumC46164Kc2 A03 = EnumC46164Kc2.A03;
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
            C44100JeP.A03(new C44100JeP(userSession), C05F.A0u, num);
        }
    }

    @Override // X.MQZ
    public final void Daq() {
        UserSession userSession = this.A02;
        AbstractC46740Klx.A00(userSession).A0C(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C44100JeP.A03(new C44100JeP(userSession), C05F.A0u, num);
        }
        LGY A00 = AbstractC46741Kly.A00(userSession);
        Activity activity = this.A00;
        EnumC46208Kck enumC46208Kck = EnumC46208Kck.A0B;
        Integer num2 = C05F.A03;
        A00.A01(activity, AbstractC166987dD.A0b(), enumC46208Kck, EnumC46149Kbn.A04, num2, C05F.A0u, num);
    }

    public C48671Lfz(Activity activity, UserSession userSession, Integer num) {
        this.A04 = num;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = new C45122Jxr(AbstractC166997dE.A0p(activity, 2131966653), activity.getString(2131966654), activity.getString(2131966655), C05F.A01, R.drawable.ig_illustrations_qp_warning2_refresh);
    }
}
