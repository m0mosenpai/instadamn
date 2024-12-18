package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;

/* renamed from: X.MgI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51011MgI extends AbstractC52922bZ {
    public XIGIGBoostCallToAction A00;
    public LeadForm A01;
    public String A02;
    public boolean A03;
    public final C2GT A04;
    public final C2GT A05;
    public final UserSession A06;
    public final C55017OWq A07;
    public final LeadGenBaseFormList A08;
    public final P4X A09;
    public final EnumC53251Ngp A0A;
    public final Long A0B;
    public final String A0C;
    public final InterfaceC24731Iq A0D;
    public final InterfaceC19390xP A0E;
    public final C05A A0F;
    public final C05A A0G;
    public final boolean A0H;
    public final LeadGenEntryPoint A0I;
    public final Object A0J;

    public C51011MgI(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        EnumC53251Ngp enumC53251Ngp;
        this.A06 = userSession;
        this.A09 = p4x;
        Object A00 = c152406tQ.A00("args_entry_point");
        if (A00 != null) {
            this.A0J = A00;
            boolean equals = A00.equals("lead_gen_support_link_fragment_entrypoint");
            this.A0H = equals;
            if (equals) {
                enumC53251Ngp = EnumC53251Ngp.A05;
            } else {
                enumC53251Ngp = EnumC53251Ngp.A04;
            }
            this.A0A = enumC53251Ngp;
            this.A0C = MSZ.A0t(enumC53251Ngp);
            this.A0B = AbstractC37302Gc3.A0W(AbstractC50522MSa.A0k(userSession));
            this.A0I = enumC53251Ngp.A01;
            Object A002 = c152406tQ.A00("args_form_list_data");
            if (A002 != null) {
                this.A08 = (LeadGenBaseFormList) A002;
                this.A07 = new C55017OWq(p4x);
                C24721Ip A0q = MSX.A0q();
                this.A0D = A0q;
                this.A0E = AbstractC07080Za.A03(A0q);
                C008002u A1A = AbstractC25235BEs.A1A(true);
                this.A0F = A1A;
                AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                this.A04 = AbstractC58232lf.A00(anonymousClass191, A1A);
                C008002u A0o = AbstractC31171DnF.A0o();
                this.A0G = A0o;
                this.A05 = AbstractC58232lf.A00(anonymousClass191, A0o);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A00(C51011MgI c51011MgI, String str) {
        c51011MgI.A08.A03 = str;
        AbstractC25232BEp.A1J(c51011MgI, new PZM(c51011MgI, null, 15), new OMD(c51011MgI.A06).A00(c51011MgI.A0I, str, null));
    }
}
