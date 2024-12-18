package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadFormIntf;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MgG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51009MgG extends AbstractC52922bZ {
    public int A00;
    public LeadForm A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final LeadGenEntryPoint A06;
    public final UserSession A07;
    public final OH3 A08;
    public final LeadGenBaseFormList A09;
    public final EnumC53251Ngp A0A;
    public final String A0B;
    public final String A0C;
    public final ArrayList A0D;
    public final InterfaceC24731Iq A0E;
    public final InterfaceC19390xP A0F;

    public C51009MgG(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        this.A07 = userSession;
        Object A00 = c152406tQ.A00("args_entry_point");
        if (A00 != null) {
            EnumC53251Ngp valueOf = EnumC53251Ngp.valueOf((String) A00);
            this.A0A = valueOf;
            this.A06 = valueOf.A01;
            Object A002 = c152406tQ.A00("args_form_list_data");
            if (A002 != null) {
                LeadGenBaseFormList leadGenBaseFormList = (LeadGenBaseFormList) A002;
                this.A09 = leadGenBaseFormList;
                this.A0C = leadGenBaseFormList.A03;
                this.A0B = MSZ.A0t(valueOf);
                this.A08 = new OH3(p4x);
                this.A04 = true;
                this.A0D = AbstractC166987dD.A1E();
                C24721Ip A0q = MSX.A0q();
                this.A0E = A0q;
                this.A0F = AbstractC07080Za.A03(A0q);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A00(C51009MgG c51009MgG, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LeadFormIntf leadFormIntf = (LeadFormIntf) it.next();
                boolean A0K = C14360o3.A0K(leadFormIntf.B7u(), AbstractC50523MSb.A0V(c51009MgG.A09));
                ArrayList arrayList = c51009MgG.A0D;
                if (A0K) {
                    arrayList.add(0, leadFormIntf.F51());
                } else {
                    arrayList.add(leadFormIntf.F51());
                }
            }
        }
    }
}
