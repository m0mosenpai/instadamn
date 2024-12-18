package X;

import android.content.Context;

/* renamed from: X.9FF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FF extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C905741s c905741s = (C905741s) obj;
            C75113Zb c75113Zb = (C75113Zb) obj2;
            C14360o3.A0B(c905741s, 0);
            C14360o3.A0B(c75113Zb, 1);
            ((C101024gI) this.A04).A01.Am7().Dmc(c905741s, (C38321qM) this.A03, null, c75113Zb, this.A02, this.A01);
            return C0eB.A00;
        }
        C905741s c905741s2 = (C905741s) obj;
        C75113Zb c75113Zb2 = (C75113Zb) obj2;
        C14360o3.A0B(c905741s2, 0);
        C14360o3.A0B(c75113Zb2, 1);
        Context context = c905741s2.A0F.getContext();
        C14360o3.A07(context);
        C101024gI c101024gI = (C101024gI) this.A04;
        InterfaceC101074gN Am7 = c101024gI.A01.Am7();
        int i = this.A02;
        int i2 = this.A01;
        return new C101094gP(context, Am7, c905741s2, (C38321qM) this.A03, c75113Zb2, i, i2, C18U.A06(C06090Tz.A05, c101024gI.A00, 36330514176623501L));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FF(Object obj, int i, Object obj2, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = obj2;
    }
}
