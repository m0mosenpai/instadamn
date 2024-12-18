package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ds1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31457Ds1 extends AbstractC31658DvO {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final int A04;
    public final InterfaceC16820sZ A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31457Ds1(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        super(-1L);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A05 = interfaceC16820sZ;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A06 = C18U.A06(c06090Tz, userSession, 36315846866112127L);
        this.A04 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597321842756388L);
        this.A01 = AbstractC09440dt.A01(new C37055GUl(this, 48));
        this.A02 = AbstractC09440dt.A01(C31657DvN.A00);
        this.A03 = AbstractC09440dt.A01(new C37055GUl(this, 49));
    }

    public final boolean A02() {
        int i;
        long A03 = AbstractC31175DnJ.A03(((C2056398n) this.A01.getValue()).A00, AnonymousClass001.A0O("broadcast_channel_inbox_last_synced_time_millis_", 3));
        if (!this.A06 || (i = this.A04) <= 0 || AbstractC166987dD.A1a(this.A05.invoke())) {
            return false;
        }
        this.A02.getValue();
        if (System.currentTimeMillis() - A03 < i * 1000) {
            return false;
        }
        return true;
    }
}
