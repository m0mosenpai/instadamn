package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* renamed from: X.MfI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50949MfI extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final UserSession A02;
    public final OH4 A03;
    public final EnumC53251Ngp A04;
    public final LeadGenFormData A05;
    public final String A06;
    public final C05A A07;
    public final C05A A08;

    public C50949MfI(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        this.A02 = userSession;
        this.A03 = new OH4(p4x);
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A00;
            this.A05 = leadGenFormData;
            EnumC53251Ngp enumC53251Ngp = leadGenFormData.A01;
            this.A04 = enumC53251Ngp;
            this.A06 = MSZ.A0t(enumC53251Ngp);
            C008002u A1H = AbstractC25225BEi.A1H(EnumC53267Nh5.A06);
            this.A07 = A1H;
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            this.A00 = AbstractC58232lf.A00(anonymousClass191, A1H);
            C008002u A0y = MSZ.A0y();
            this.A08 = A0y;
            this.A01 = AbstractC58232lf.A00(anonymousClass191, A0y);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
