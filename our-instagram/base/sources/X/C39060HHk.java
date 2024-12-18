package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HHk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39060HHk extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C41741IeF A02;
    public final HCI A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C39060HHk(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41741IeF c41741IeF, HCI hci, String str, String str2, boolean z, boolean z2, boolean z3) {
        AbstractC25229BEm.A1I(userSession, 1, c41741IeF);
        this.A01 = userSession;
        this.A06 = "instagram_shopping_reconsideration_destination";
        this.A04 = str;
        this.A05 = str2;
        this.A08 = z;
        this.A02 = c41741IeF;
        this.A09 = z2;
        this.A00 = interfaceC11380iw;
        this.A03 = hci;
        this.A07 = z3;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        String str = this.A06;
        String str2 = this.A04;
        String str3 = this.A05;
        boolean z = this.A08;
        return new C38331GtQ(this.A00, userSession, this.A02, this.A03, str, str2, str3, z, this.A09, this.A07);
    }
}
