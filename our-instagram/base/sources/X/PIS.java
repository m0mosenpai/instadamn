package X;

import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes9.dex */
public final class PIS implements JHX {
    public final /* synthetic */ C50920Mep A00;
    public final /* synthetic */ UpcomingEvent A01;
    public final /* synthetic */ boolean A02;

    public PIS(C50920Mep c50920Mep, UpcomingEvent upcomingEvent, boolean z) {
        this.A00 = c50920Mep;
        this.A02 = z;
        this.A01 = upcomingEvent;
    }

    @Override // X.JHX
    public final void Dq7(UpcomingEvent upcomingEvent) {
        Object value;
        C51736MtJ c51736MtJ;
        C05A c05a = this.A00.A04;
        boolean z = this.A02;
        do {
            value = c05a.getValue();
            c51736MtJ = (C51736MtJ) value;
        } while (!c05a.AIi(value, C51736MtJ.A01(c51736MtJ, C05F.A01, AbstractC001800i.A0T(new P4E(z), c51736MtJ.A04), c51736MtJ.A05)));
    }

    @Override // X.JHX
    public final void onFailure() {
        Object value;
        C51736MtJ c51736MtJ;
        C05A c05a = this.A00.A04;
        UpcomingEvent upcomingEvent = this.A01;
        do {
            value = c05a.getValue();
            c51736MtJ = (C51736MtJ) value;
        } while (!c05a.AIi(value, C51736MtJ.A01(c51736MtJ, C05F.A01, AbstractC001800i.A0T(P4G.A00, c51736MtJ.A04), upcomingEvent.getReminderEnabled())));
    }
}
