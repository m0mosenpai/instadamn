package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.model.HallPassMemberViewModel;

/* loaded from: classes6.dex */
public final class GJJ implements InterfaceC37142GYd {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public GJJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37142GYd
    public final void Dy6(String str) {
        Context requireContext;
        UserSession A0r;
        EOM eom;
        switch (this.A00) {
            case 0:
                C9GR.A07(AbstractC13110lx.A00((Activity) this.A01), 2131952099);
                ((C31539DtP) this.A02).A03.Ch3();
                return;
            case 1:
                EOM eom2 = (EOM) this.A02;
                requireContext = eom2.requireContext();
                A0r = AbstractC166987dD.A0r(eom2.A05);
                eom = eom2;
                FDP.A00(eom.requireActivity(), requireContext, A0r, ((HallPassMemberViewModel) this.A01).A00.getUsername());
                return;
            default:
                EON eon = (EON) this.A02;
                requireContext = eon.requireContext();
                A0r = AbstractC166987dD.A0r(eon.A0A);
                eom = eon;
                FDP.A00(eom.requireActivity(), requireContext, A0r, ((HallPassMemberViewModel) this.A01).A00.getUsername());
                return;
        }
    }
}
