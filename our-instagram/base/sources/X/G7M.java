package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;

/* loaded from: classes6.dex */
public final class G7M implements InterfaceC62612t0 {
    public final int A00;
    public final Object A01;

    public static void A00(RecyclerView recyclerView, AbstractC43842Ja5 abstractC43842Ja5, int i) {
        recyclerView.A14(new C153156uj(abstractC43842Ja5.getRecyclerView().A0D, new G7M(abstractC43842Ja5, i), C153146ui.A0A, false, false));
    }

    public G7M(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, X.FOr] */
    @Override // X.InterfaceC62612t0
    public final void AD4() {
        boolean z;
        switch (this.A00) {
            case 0:
                EOR eor = (EOR) this.A01;
                ((C32940EeL) eor.A0L.getValue()).A04(false, eor.A04);
                return;
            case 1:
                ((BroadcastChannelActivityFeedV2ViewModel) ((EOC) this.A01).A04.getValue()).A02();
                return;
            case 2:
                ((EOD) this.A01).A0C().A0B();
                return;
            case 3:
                EVU evu = (EVU) this.A01;
                FMW fmw = evu.A0F;
                if (!evu.A0V || !(z = evu.A0S) || fmw == null || !evu.A0W) {
                    return;
                }
                String str = evu.A0K;
                if ((str != null && str.equals(evu.A0J)) || evu.A0R) {
                    return;
                }
                evu.A0R = true;
                fmw.A02 = true;
                String str2 = null;
                fmw.A00 = null;
                UserSession userSession = evu.A0g;
                InterfaceC37289Gbq interfaceC37289Gbq = evu.A0m;
                C31641Dv7 c31641Dv7 = evu.A0o.A03;
                if (c31641Dv7 != null) {
                    str2 = c31641Dv7.A02;
                }
                String str3 = evu.A0J;
                AbstractC25230BEn.A15(1, userSession, interfaceC37289Gbq);
                C36688GFj c36688GFj = new C36688GFj(interfaceC37289Gbq, new Object(), new C169337h7(interfaceC37289Gbq, new C36694GFp(userSession, str2, str3, z)));
                evu.A0D = c36688GFj;
                c36688GFj.EYJ(new C36682GFc(evu, fmw));
                return;
            case 4:
                C32282EJt.A01((C32282EJt) this.A01);
                return;
            case 5:
                ((C31831Dyp) ((EOK) this.A01).A0K.getValue()).A01(false, false);
                return;
            case 6:
                ((C31846DzE) ((EOE) this.A01).A02.getValue()).Chd();
                return;
            case 7:
                FanClubMemberListViewModel fanClubMemberListViewModel = (FanClubMemberListViewModel) ((EOH) this.A01).A02.getValue();
                fanClubMemberListViewModel.A06.A01((String) fanClubMemberListViewModel.A0G.getValue());
                return;
            case 8:
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((EOF) this.A01).A02);
                AbstractC166987dD.A1Z(new MBp(A0Z, null, 15), AbstractC141776au.A00(A0Z));
                return;
            case 9:
                FQZ fqz = ((EJX) this.A01).A01;
                C14360o3.A0A(fqz);
                fqz.A00();
                return;
            default:
                return;
        }
    }
}
