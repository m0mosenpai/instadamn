package X;

import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;

/* loaded from: classes9.dex */
public final class PIU implements InterfaceC58087PpC {
    public final int A00;
    public final Object A01;

    public PIU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58087PpC
    public final void DET(UpcomingEvent upcomingEvent) {
        C38321qM c38321qM;
        switch (this.A00) {
            case 0:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0t = true;
                c38321qM = editMediaInfoFragment.A0I;
                c38321qM.getClass();
                break;
            case 1:
                c38321qM = ((NMW) this.A01).A0C;
                if (c38321qM == null) {
                    C14360o3.A0F("editMedia");
                    throw C00O.createAndThrow();
                }
                break;
            case 2:
                C47Z A00 = NNE.A00((NMX) this.A01);
                UpcomingEventImpl upcomingEventImpl = null;
                if (upcomingEvent != null) {
                    upcomingEventImpl = upcomingEvent.F7b(null);
                }
                A00.A1p = upcomingEventImpl;
                return;
            default:
                ((C55037OZj) this.A01).A04.Dwp(upcomingEvent);
                return;
        }
        c38321qM.A0C.EgV(upcomingEvent);
    }

    @Override // X.InterfaceC58087PpC
    public final void DEU(UpcomingEvent upcomingEvent) {
        C38321qM c38321qM;
        UpcomingEvent upcomingEvent2;
        String id;
        switch (this.A00) {
            case 0:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                editMediaInfoFragment.A0t = true;
                c38321qM = editMediaInfoFragment.A0I;
                c38321qM.getClass();
                upcomingEvent2 = null;
                break;
            case 1:
                c38321qM = ((NMW) this.A01).A0C;
                upcomingEvent2 = null;
                if (c38321qM == null) {
                    C14360o3.A0F("editMedia");
                    throw C00O.createAndThrow();
                }
                break;
            case 2:
                NMX nmx = (NMX) this.A01;
                UpcomingEventImpl upcomingEventImpl = NNE.A00(nmx).A1p;
                if (upcomingEventImpl == null || (id = upcomingEventImpl.getId()) == null || !id.equals(upcomingEvent.getId())) {
                    return;
                }
                MSY.A0O(nmx).A02.A1p = null;
                return;
            default:
                ((C55037OZj) this.A01).A04.Dwq(upcomingEvent);
                return;
        }
        c38321qM.A0C.EgV(upcomingEvent2);
    }
}
