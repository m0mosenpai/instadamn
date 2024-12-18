package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.OZi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55036OZi {
    public final OTD A00;
    public final O1L A01;
    public final OZV A02;
    public final C54560O8m A03;
    public final OMi A04;
    public final O5S A05;
    public final ScheduledExecutorService A06;
    public final boolean A07;

    public /* synthetic */ C55036OZi(OTD otd, O1L o1l, C54560O8m c54560O8m, OMi oMi, O5S o5s, ScheduledExecutorService scheduledExecutorService, boolean z) {
        OZV ozv = new OZV(OZV.A01);
        AbstractC167017dG.A1Q(scheduledExecutorService, o1l);
        C14360o3.A0B(oMi, 7);
        this.A06 = scheduledExecutorService;
        this.A03 = c54560O8m;
        this.A01 = o1l;
        this.A05 = o5s;
        this.A00 = otd;
        this.A02 = ozv;
        this.A04 = oMi;
        this.A07 = z;
    }

    public static final void A00(C55036OZi c55036OZi, O5R o5r, String str, List list) {
        OMi oMi = c55036OZi.A04;
        oMi.A01.markerPoint(533737437, oMi.A00, "google_start");
        InterfaceC57913PmJ A00 = AbstractC62226S2x.A00(c55036OZi.A01.A00);
        C14360o3.A07(A00);
        C5KS A02 = A00.EJA(new N26(str)).A02(C55796Oq6.A00, AbstractC58437PvG.A00);
        ScheduledExecutorService scheduledExecutorService = c55036OZi.A06;
        A02.A04(new T7C(1, new DHZ(24, o5r, c55036OZi, list)), scheduledExecutorService).A0B(new Oq8(c55036OZi, o5r, str, list), scheduledExecutorService);
    }

    public static final void A01(O5R o5r, String str, List list) {
        ArrayList A0S = AbstractC001800i.A0S(AbstractC166987dD.A1J(EnumC53331NiB.A0O), list);
        C14360o3.A0B(str, 0);
        o5r.A00.set(new MUD(0, "", str, A0S));
    }
}
