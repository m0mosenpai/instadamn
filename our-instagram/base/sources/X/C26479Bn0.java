package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bn0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26479Bn0 extends AbstractC51572Yf {
    public final InterfaceC30988Djn A00;
    public final C120985dq A01;
    public final C37644Ghd A02;
    public final UserSession A03;
    public final InterfaceC31069DlB A04;
    public final boolean A05;
    public final boolean A06;

    public C26479Bn0(InterfaceC30988Djn interfaceC30988Djn, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31069DlB interfaceC31069DlB, boolean z, boolean z2) {
        AbstractC167007dF.A1F(userSession, 1, interfaceC31069DlB);
        this.A03 = userSession;
        this.A01 = c120985dq;
        this.A02 = c37644Ghd;
        this.A04 = interfaceC31069DlB;
        this.A00 = interfaceC30988Djn;
        this.A05 = z;
        this.A06 = z2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        AbstractC50812Vc c26440BmN;
        AbstractC50812Vc c25557BRu;
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        Integer num = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, enumC77683ds, 3));
        long A04 = AbstractC77623dm.A04(c76223bS);
        C51722Yv A0a = AbstractC25233BEq.A0a(AbstractC25233BEq.A0S(A0h, AbstractC25227BEk.A0a(A1Z ? 1 : 0, A04), A1Z ? 1 : 0, AbstractC77623dm.A04(c76223bS)), C05F.A0C, 0.0f);
        boolean z = this.A05;
        if (z) {
            A0a = A0a.A00(C9CU.A00(null, C05F.A0A, A1Z ? 1 : 0, AbstractC77623dm.A0D(c76223bS, R.dimen.audio_bar_margin_bottom)));
        }
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        boolean z2 = this.A06;
        UserSession userSession = this.A03;
        C120985dq c120985dq = this.A01;
        C37644Ghd c37644Ghd = this.A02;
        InterfaceC31069DlB interfaceC31069DlB = this.A04;
        if (z2) {
            c26440BmN = new C26441BmO(c120985dq, c37644Ghd, userSession, interfaceC31069DlB, z);
        } else {
            c26440BmN = new C26440BmN(c120985dq, c37644Ghd, userSession, interfaceC31069DlB, z);
        }
        A12.A00(c26440BmN);
        InterfaceC30988Djn interfaceC30988Djn = this.A00;
        if (interfaceC30988Djn == null) {
            c25557BRu = new C75723ad();
        } else {
            c25557BRu = new C25557BRu(C9CV.A00(AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0m(num, 100.0f, A1Z ? 1 : 0), A1Z ? 1 : 0), C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), interfaceC30988Djn, c120985dq, c37644Ghd);
        }
        return AbstractC25227BEk.A0W(c25557BRu, A12, c76223bS, A0a);
    }
}
