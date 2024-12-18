package X;

import com.facebook.R;
import com.instagram.api.schemas.OnImpressionStyle;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BSW extends AbstractC51572Yf {
    public final InterfaceC30988Djn A00;
    public final C120985dq A01;
    public final C37644Ghd A02;
    public final InterfaceC104934o6 A03;
    public final UserSession A04;
    public final InterfaceC31069DlB A05;
    public final boolean A06;
    public final boolean A07;

    public BSW(InterfaceC104934o6 interfaceC104934o6, InterfaceC30988Djn interfaceC30988Djn, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31069DlB interfaceC31069DlB, boolean z, boolean z2) {
        AbstractC167007dF.A1G(userSession, 1, interfaceC31069DlB);
        this.A04 = userSession;
        this.A01 = c120985dq;
        this.A02 = c37644Ghd;
        this.A03 = interfaceC104934o6;
        this.A05 = interfaceC31069DlB;
        this.A00 = interfaceC30988Djn;
        this.A07 = z;
        this.A06 = z2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int ordinal;
        AbstractC50812Vc c25557BRu;
        C14360o3.A0B(c76223bS, 0);
        if (!this.A06 && this.A01.A01 == EnumC129395t1.A02) {
            return new C2WH(null, null, null, null, null, null, false);
        }
        InterfaceC104934o6 interfaceC104934o6 = this.A03;
        OnImpressionStyle C35 = interfaceC104934o6.C35();
        if (C35 == null) {
            ordinal = -1;
        } else {
            ordinal = C35.ordinal();
        }
        if (ordinal != 7 && ordinal != 3) {
            return null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        Integer num = C05F.A00;
        C51722Yv A00 = C9CV.A00(null, num, enumC77683ds, 3);
        long A04 = AbstractC77623dm.A04(c76223bS);
        C51722Yv A0S = AbstractC25233BEq.A0S(A00, AbstractC25227BEk.A0a(0, A04), 0, AbstractC77623dm.A04(c76223bS));
        UserSession userSession = this.A04;
        if (C18U.A06(C06090Tz.A05, userSession, 36326167669782239L)) {
            A0S = A0S.A00(AbstractC25233BEq.A0a(null, C05F.A0C, 0.0f));
        }
        boolean z = this.A07;
        if (z) {
            A0S = A0S.A00(C9CU.A00(null, C05F.A0A, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.audio_bar_margin_bottom)));
        }
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C120985dq c120985dq = this.A01;
        C37644Ghd c37644Ghd = this.A02;
        A12.A00(new BSX(interfaceC104934o6, c120985dq, c37644Ghd, userSession, this.A05, z));
        InterfaceC30988Djn interfaceC30988Djn = this.A00;
        if (interfaceC30988Djn == null) {
            c25557BRu = new C75723ad();
        } else {
            c25557BRu = new C25557BRu(C9CV.A00(AbstractC25234BEr.A0C(null, AbstractC25225BEi.A0m(num, 100.0f, 0), 0), C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), interfaceC30988Djn, c120985dq, c37644Ghd);
        }
        return AbstractC25227BEk.A0W(c25557BRu, A12, c76223bS, A0S);
    }
}
