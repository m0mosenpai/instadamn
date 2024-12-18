package X;

import android.os.Bundle;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;

/* renamed from: X.Mgb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51028Mgb extends AbstractC52922bZ {
    public XIGIGBoostCallToAction A00;
    public LeadForm A01;
    public boolean A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C55017OWq A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;
    public final C05A A09;

    public AbstractC51028Mgb(C55017OWq c55017OWq) {
        this.A05 = c55017OWq;
        C24721Ip A0q = MSX.A0q();
        this.A06 = A0q;
        this.A07 = AbstractC07080Za.A03(A0q);
        C008002u A1A = AbstractC25235BEs.A1A(true);
        this.A08 = A1A;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A03 = AbstractC58232lf.A00(anonymousClass191, A1A);
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A09 = A0o;
        this.A04 = AbstractC58232lf.A00(anonymousClass191, A0o);
    }

    public final UserSession A01() {
        if (this instanceof NP7) {
            return ((NP7) this).A02;
        }
        return ((NP6) this).A02;
    }

    public final LeadGenBaseFormList A02() {
        if (this instanceof NP7) {
            return ((NP7) this).A03;
        }
        return ((NP6) this).A03;
    }

    public final String A03() {
        if (this instanceof NP7) {
            return ((NP7) this).A07;
        }
        return ((NP6) this).A04;
    }

    public final void A04() {
        C55017OWq c55017OWq = this.A05;
        String A03 = A03();
        String A0V = AbstractC50523MSb.A0V(A02());
        InterfaceC58268PsC A00 = C55017OWq.A00(c55017OWq, A03);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("form_id", A0V);
        InterfaceC58268PsC.A00(A0b, A00, A03, "lead_gen_manage_lead_forms_and_cta", "done");
    }

    public static final void A00(AbstractC51028Mgb abstractC51028Mgb, String str) {
        LeadGenEntryPoint leadGenEntryPoint;
        abstractC51028Mgb.A02().A03 = str;
        OMD omd = new OMD(abstractC51028Mgb.A01());
        if (abstractC51028Mgb instanceof NP7) {
            leadGenEntryPoint = ((NP7) abstractC51028Mgb).A01;
        } else {
            leadGenEntryPoint = ((NP6) abstractC51028Mgb).A00;
        }
        AbstractC25232BEp.A1J(abstractC51028Mgb, new PZM(abstractC51028Mgb, null, 11), omd.A00(leadGenEntryPoint, str, null));
    }
}
