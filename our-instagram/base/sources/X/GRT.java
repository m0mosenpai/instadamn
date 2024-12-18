package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.DirectInviteContactViewModel;
import java.util.List;

/* loaded from: classes6.dex */
public final class GRT implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(this.A02);
                return null;
            case 1:
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A02;
                List list = ((C6FW) obj).A00;
                interfaceC16620sF.invoke(list.get(0), AbstractC25227BEk.A0t(list));
                return null;
            case 2:
                C32324ELs.A0A((C32324ELs) this.A01, (C43707JUs) this.A02);
                break;
            case 3:
                C32324ELs.A0A((C32324ELs) this.A01, (C43707JUs) this.A02);
                C0K8.A0C(C32324ELs.__redex_internal_original_name, "Sending of channel invites flow api has failed");
                break;
            default:
                EVU evu = (EVU) this.A01;
                Context context = (Context) this.A02;
                DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj;
                UserSession userSession = evu.A0g;
                boolean A01 = C54P.A01(context, userSession);
                EnumC33510Erj enumC33510Erj = EnumC33510Erj.DIRECT_MESSAGE_OMNIPICKER;
                if (A01) {
                    EnumC33500ErZ enumC33500ErZ = EnumC33500ErZ.CONTACT_SMS;
                    AbstractC35249Fgi.A03(enumC33510Erj, enumC33500ErZ, userSession, A01);
                    Integer num = C05F.A0E;
                    EVU.A09(evu, directInviteContactViewModel, num, 43, directInviteContactViewModel.A00, directInviteContactViewModel.A03, true);
                    evu.A0o.A0B(C05F.A1F, num);
                    FYI.A01((Fragment) evu.A0m, enumC33510Erj, enumC33500ErZ, userSession, C05F.A0u, directInviteContactViewModel.A06);
                    return null;
                }
                AbstractC35249Fgi.A06(enumC33510Erj, userSession, A01);
                AbstractC35249Fgi.A03(enumC33510Erj, EnumC33500ErZ.SYSTEM_SHARE_SHEET, userSession, A01);
                Integer num2 = C05F.A0E;
                EVU.A09(evu, directInviteContactViewModel, num2, 6, directInviteContactViewModel.A00, directInviteContactViewModel.A03, true);
                evu.A0o.A0B(C05F.A1F, num2);
                EnumC33425Epw enumC33425Epw = EnumC33425Epw.A0J;
                InterfaceC37289Gbq interfaceC37289Gbq = evu.A0m;
                AbstractC31510Dsu.A0T((Fragment) interfaceC37289Gbq, enumC33510Erj, interfaceC37289Gbq, userSession, enumC33425Epw, new Runnable() { // from class: X.GKR
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
                return null;
        }
        return C0eB.A00;
    }

    public GRT(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
