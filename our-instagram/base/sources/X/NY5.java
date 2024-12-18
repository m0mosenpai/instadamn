package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventLiveMetadata;

/* loaded from: classes9.dex */
public final class NY5 extends ILS {
    public final C39414Hay A00;
    public final UpcomingEventLiveMetadata A01;
    public final InterfaceC09390do A02;

    @Override // X.ILS
    public final /* bridge */ /* synthetic */ AbstractC41110IIb A00() {
        return this.A00;
    }

    public final void A01(C38321qM c38321qM) {
        C39414Hay c39414Hay = this.A00;
        C146076i5 c146076i5 = (C146076i5) super.A00.getValue();
        UpcomingEvent upcomingEvent = c39414Hay.A00;
        c146076i5.A04(upcomingEvent, c38321qM.getId(), "watch_igtv", c39414Hay.A02.getModuleName());
        String Bf3 = this.A01.Bf3();
        if (Bf3 != null) {
            UserSession userSession = c39414Hay.A01;
            FragmentActivity fragmentActivity = ((AbstractC41110IIb) c39414Hay).A00;
            C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1z, userSession);
            c116875Qr.A1D = AnonymousClass001.A0T(Bf3, AbstractC25231BEo.A0t(upcomingEvent.Bah()), '_');
            c116875Qr.A1S = true;
            AbstractC86593tX.A0Y(fragmentActivity, c116875Qr.A00(), userSession);
        }
    }

    public final void A02(C38321qM c38321qM) {
        C39414Hay c39414Hay = this.A00;
        ((C146076i5) super.A00.getValue()).A04(c39414Hay.A00, c38321qM.getId(), "start_live", c39414Hay.A02.getModuleName());
        AbstractC22762A2g.A00();
        FragmentActivity fragmentActivity = ((AbstractC41110IIb) c39414Hay).A00;
        UserSession userSession = c39414Hay.A01;
        C22P c22p = C22P.A5O;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(AbstractC111324zv.A00(16), C82R.A00(C81S.A00, new C81W[0]));
        A0b.putSerializable("camera_entry_point", c22p);
        AbstractC31176DnK.A0w(fragmentActivity, A0b, userSession, AbstractC111324zv.A00(31));
    }

    public final void A03(C38321qM c38321qM, InterfaceC43427JGr interfaceC43427JGr) {
        C39414Hay c39414Hay = this.A00;
        ((C146076i5) super.A00.getValue()).A04(c39414Hay.A00, c38321qM.getId(), "watch_igtv", c39414Hay.A02.getModuleName());
        String AiJ = this.A01.AiJ();
        if (AiJ != null) {
            C41053IFw c41053IFw = (C41053IFw) this.A02.getValue();
            C1ON A05 = AbstractC55182Odn.A05(c41053IFw.A01, AiJ, true);
            A05.A00 = new C37484Gf2(21, interfaceC43427JGr, c41053IFw);
            C1GJ.A03(A05);
        }
    }

    public NY5(C39414Hay c39414Hay, UpcomingEventLiveMetadata upcomingEventLiveMetadata) {
        super(c39414Hay);
        this.A00 = c39414Hay;
        this.A01 = upcomingEventLiveMetadata;
        this.A02 = AbstractC09440dt.A01(new C43204J8b(this, 10));
    }
}
