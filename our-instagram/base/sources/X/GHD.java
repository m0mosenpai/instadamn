package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GHD implements C7XU {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C36722GGr A02;
    public final /* synthetic */ C64752wZ A03;
    public final /* synthetic */ V1C A04;

    @Override // X.C7XU
    public final void DB3() {
    }

    public GHD(Activity activity, UserSession userSession, C36722GGr c36722GGr, C64752wZ c64752wZ, V1C v1c) {
        this.A03 = c64752wZ;
        this.A01 = userSession;
        this.A02 = c36722GGr;
        this.A00 = activity;
        this.A04 = v1c;
    }

    @Override // X.C7XU
    public final void DAy() {
        UserSession userSession = this.A01;
        C36722GGr c36722GGr = this.A02;
        Activity activity = this.A00;
        V1C v1c = this.A04;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0U = c36722GGr;
        AbstractC31173DnH.A0w(activity, v1c, A0y);
        C3DN A0r = AbstractC31172DnG.A0r(activity);
        if (A0r != null) {
            A0r.A0Q(null);
        }
    }
}
