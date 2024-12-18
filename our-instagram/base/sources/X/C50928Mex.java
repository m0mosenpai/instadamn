package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Mex, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50928Mex extends AbstractC52922bZ {
    public final InterfaceC24731Iq A00;
    public final InterfaceC19390xP A01;
    public final C17060sy A02;
    public final C146076i5 A03;
    public final UpcomingEvent A04;
    public final OUK A05;

    public C50928Mex(C17060sy c17060sy, C146076i5 c146076i5, UpcomingEvent upcomingEvent, OUK ouk) {
        C14360o3.A0B(c17060sy, 1);
        this.A02 = c17060sy;
        this.A04 = upcomingEvent;
        this.A05 = ouk;
        this.A03 = c146076i5;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A00 = A12;
        this.A01 = AbstractC07080Za.A03(A12);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(ouk.A05), "upcoming_event_reshare_upsell_impression");
        AbstractC31171DnF.A1C(A0f, "impression");
        AbstractC37300Gc1.A0n(A0f, ouk.A03);
        OUK.A00(A0f, ouk, AbstractC25233BEq.A0n(ouk.A04));
    }
}
