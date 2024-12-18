package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lg1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48673Lg1 implements MQZ {
    public final Activity A00;
    public final C45122Jxr A01;
    public final UserSession A02;
    public final EnumC46164Kc2 A03 = EnumC46164Kc2.A02;
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
            C44100JeP.A03(new C44100JeP(userSession), C05F.A15, num);
        }
    }

    @Override // X.MQZ
    public final void Daq() {
        AbstractC41776Ies.A03(this.A00, "instagram://encryptedbackups?type=settings");
        UserSession userSession = this.A02;
        AbstractC46740Klx.A00(userSession).A0C(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C44100JeP.A03(new C44100JeP(userSession), C05F.A15, num);
        }
    }

    public C48673Lg1(Activity activity, UserSession userSession, Integer num) {
        this.A04 = num;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = new C45122Jxr(AbstractC166997dE.A0p(activity, 2131966650), activity.getString(2131966652), activity.getString(2131966651), C05F.A01, R.drawable.ig_illustrations_qp_warning2_refresh);
    }
}
