package X;

import java.util.Calendar;
import java.util.Date;

/* renamed from: X.Ozi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56321Ozi implements InterfaceC58115Ppe {
    public boolean A00;
    public final /* synthetic */ OIO A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    @Override // X.InterfaceC58115Ppe
    public final void D9K(Date date) {
    }

    @Override // X.InterfaceC58115Ppe
    public final void DBG(Date date) {
        this.A00 = true;
        OIO oio = this.A01;
        OWa oWa = oio.A00;
        if (oWa != null) {
            oWa.A01();
        }
        oio.A00 = null;
        if (date == null) {
            this.A02.invoke();
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, (5 - (calendar.get(12) % 5)) + 20);
        Date time = calendar.getTime();
        C14360o3.A07(time);
        if (date.compareTo(time) < 0) {
            date = time;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, 29);
        Date time2 = calendar2.getTime();
        C14360o3.A07(time2);
        if (date.compareTo(time2) > 0) {
            date = time2;
        }
        this.A03.invoke(date);
    }

    public C56321Ozi(OIO oio, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = oio;
        this.A02 = interfaceC16820sZ;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC58115Ppe
    public final void DB6() {
        this.A01.A00 = null;
        if (!this.A00) {
            this.A02.invoke();
        }
    }
}
