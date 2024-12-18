package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LXC implements InterfaceC58027PoD {
    public final int A00;
    public final Object A01;

    public LXC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58027PoD
    public final void DE4(Activity activity) {
        switch (this.A00) {
            case 0:
                C38334GtU.A00(activity, (C38334GtU) this.A01, C05F.A01);
                return;
            case 1:
                UserSession A0r = AbstractC166987dD.A0r(((C45466KBb) this.A01).A1V);
                C14360o3.A0B(A0r, 1);
                C146106i8 A0K = AbstractC31171DnF.A0K();
                AbstractC31172DnG.A1H(activity.getApplicationContext().getResources(), A0K, 2131974354);
                A0K.A0L = true;
                A0K.A0G = AbstractC166997dE.A0q(activity.getApplicationContext().getResources(), 2131965278);
                C49494Lu7.A00(A0K, activity, A0r, 3);
                AbstractC31178DnM.A1S(A0K);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC58027PoD
    public final void Dpj(Activity activity) {
        switch (this.A00) {
            case 0:
                C38334GtU c38334GtU = (C38334GtU) this.A01;
                C41027IEw c41027IEw = ((KZ8) c38334GtU.A04.getValue()).A00;
                if (c41027IEw != null) {
                    c38334GtU.ELq(activity, c41027IEw, c38334GtU.A01);
                    return;
                } else {
                    C38334GtU.A00(activity, c38334GtU, C05F.A01);
                    return;
                }
            case 1:
                C08730cb c08730cb = C17060sy.A01;
                C45466KBb c45466KBb = (C45466KBb) this.A01;
                InterfaceC09390do interfaceC09390do = c45466KBb.A1V;
                c08730cb.A01(AbstractC166987dD.A0r(interfaceC09390do)).A03.Eeh(true);
                C14360o3.A0B(AbstractC166987dD.A0r(interfaceC09390do), 1);
                C146106i8 A0K = AbstractC31171DnF.A0K();
                AbstractC31172DnG.A1H(activity.getApplicationContext().getResources(), A0K, 2131974355);
                AbstractC31178DnM.A1S(A0K);
                C45466KBb.A0R(c45466KBb, "notes_song_title");
                return;
            case 2:
                C45487KCc.A06((C45487KCc) this.A01, false);
                return;
            default:
                MYT myt = (MYT) this.A01;
                Integer num = C05F.A0Y;
                C50668MYm c50668MYm = myt.A07;
                if (c50668MYm != null) {
                    myt.A0A = true;
                    c50668MYm.A00(num, true);
                    C50668MYm c50668MYm2 = myt.A06;
                    if (c50668MYm2 != null) {
                        c50668MYm2.A00(num, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
