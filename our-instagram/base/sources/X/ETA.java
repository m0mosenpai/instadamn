package X;

import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;

/* loaded from: classes6.dex */
public final class ETA extends C1P1 {
    public final /* synthetic */ SupportLinksFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public ETA(SupportLinksFragment supportLinksFragment, String str, String str2) {
        this.A00 = supportLinksFragment;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        SupportServiceEditUrlFragment A06;
        int A03 = C0f9.A03(384152553);
        EBI ebi = (EBI) obj;
        int A032 = C0f9.A03(353099871);
        super.onSuccess(ebi);
        FKE fke = (FKE) ebi.A00.get(0);
        SupportLinksFragment supportLinksFragment = this.A00;
        C35198Ffq c35198Ffq = supportLinksFragment.A01;
        String str = this.A02;
        InterfaceC02590Ai A00 = C35198Ffq.A00(c35198Ffq);
        AbstractC31171DnF.A1A(A00, "fetch_partners");
        C35198Ffq.A02(A00, c35198Ffq, "success", false);
        A00.AAP("service_type", str);
        A00.Cht();
        C140966Yy A0E = AbstractC31180DnO.A0E(supportLinksFragment);
        String str2 = this.A01;
        C34724FRn A0P = AbstractC31174DnI.A0P();
        String str3 = supportLinksFragment.A04;
        String str4 = fke.A00;
        String str5 = fke.A01;
        String A033 = AbstractC1566171j.A03(fke);
        String str6 = supportLinksFragment.A03;
        if (str2 != null) {
            A06 = A0P.A07(str3, str4, str5, A033, null, str6, str2);
        } else {
            A06 = A0P.A06(SMBPartnerType.A05, str3, str4, str5, A033, null, str6);
        }
        A0E.A0E(A06);
        A0E.A0A = SupportLinksFragment.A06;
        A0E.A04();
        C0f9.A0A(-1345047269, A032);
        C0f9.A0A(-1639540284, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(909322792);
        super.onFail(abstractC115105If);
        SupportLinksFragment supportLinksFragment = this.A00;
        C9GR.A05(supportLinksFragment.getContext());
        String A0h = AbstractC31180DnO.A0h(abstractC115105If);
        C35198Ffq c35198Ffq = supportLinksFragment.A01;
        String str = this.A02;
        InterfaceC02590Ai A00 = C35198Ffq.A00(c35198Ffq);
        AbstractC31171DnF.A1A(A00, "fetch_partners");
        C35198Ffq.A02(A00, c35198Ffq, "error", false);
        A00.AAP("service_type", str);
        A00.AAP("error_message", A0h);
        A00.Cht();
        C0f9.A0A(-786544269, A03);
    }
}
