package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadFormIntf;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MgF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51008MgF extends AbstractC52922bZ {
    public int A00;
    public LeadForm A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A06;
    public final LeadGenEntryPoint A07;
    public final UserSession A08;
    public final OH3 A09;
    public final LeadGenBaseFormList A0A;
    public final EnumC53251Ngp A0B;
    public final String A0C;
    public final InterfaceC24731Iq A0E;
    public final InterfaceC19390xP A0F;
    public boolean A05 = true;
    public final ArrayList A0D = AbstractC166987dD.A1E();

    public C51008MgF(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        this.A09 = new OH3(p4x);
        C24721Ip A0q = MSX.A0q();
        this.A0E = A0q;
        this.A0F = AbstractC07080Za.A03(A0q);
        this.A08 = userSession;
        Object A00 = c152406tQ.A00("args_entry_point");
        if (A00 != null) {
            EnumC53251Ngp valueOf = EnumC53251Ngp.valueOf((String) A00);
            this.A0B = valueOf;
            this.A07 = valueOf.A01;
            Object A002 = c152406tQ.A00("args_form_list_data");
            if (A002 != null) {
                LeadGenBaseFormList leadGenBaseFormList = (LeadGenBaseFormList) A002;
                this.A0A = leadGenBaseFormList;
                this.A02 = leadGenBaseFormList.A03;
                this.A0C = MSZ.A0t(valueOf);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A00(C51008MgF c51008MgF, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LeadFormIntf leadFormIntf = (LeadFormIntf) it.next();
                boolean A0K = C14360o3.A0K(leadFormIntf.B7u(), AbstractC50523MSb.A0V(c51008MgF.A0A));
                ArrayList arrayList = c51008MgF.A0D;
                if (A0K) {
                    arrayList.add(0, leadFormIntf.F51());
                } else {
                    arrayList.add(leadFormIntf.F51());
                }
            }
        }
    }
}
