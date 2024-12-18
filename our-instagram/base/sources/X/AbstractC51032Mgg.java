package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mgg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51032Mgg extends AbstractC52922bZ {
    public final C2GT A00;
    public final C50634MWv A01;
    public final InterfaceC24731Iq A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final OMD A08;

    public final void A0A(Context context, EnumC53203Nfz enumC53203Nfz, int i, boolean z) {
        String str;
        String str2;
        if (!AbstractC31176DnK.A1b(this.A06)) {
            if (z) {
                if (this instanceof C52589NOk) {
                    C52589NOk c52589NOk = (C52589NOk) this;
                    if (enumC53203Nfz.ordinal() != 0) {
                        str2 = "add_custom_multiple_choice_question";
                    } else {
                        str2 = "add_custom_short_answer_question";
                    }
                    P4X.A02(c52589NOk.A02, c52589NOk.A05, "lead_gen_create_form", str2, A00(c52589NOk));
                } else {
                    C52590NOl c52590NOl = (C52590NOl) this;
                    if (enumC53203Nfz.ordinal() != 0) {
                        str = "add_custom_multiple_choice_question";
                    } else {
                        str = "add_custom_short_answer_question";
                    }
                    AbstractC43592JPx.A1Q(c52590NOl.A00, c52590NOl.A04, "lead_gen_create_form", str, "click");
                }
            }
            A09(context);
            AbstractC166987dD.A1Z(new C50530MSj(this, enumC53203Nfz, null, i, 16), AbstractC141776au.A00(this));
        }
    }

    public static String A00(C52589NOk c52589NOk) {
        String str = c52589NOk.A06;
        C14360o3.A0B(str, 1);
        return str;
    }

    public final int A01() {
        if (this instanceof C52589NOk) {
            return ((C52589NOk) this).A04.A06.size();
        }
        return ((C52590NOl) this).A02.A1t.size();
    }

    public final UserSession A02() {
        if (this instanceof C52589NOk) {
            return ((C52589NOk) this).A00;
        }
        return ((C52590NOl) this).A03;
    }

    public final String A03() {
        if (this instanceof C52589NOk) {
            return ((C52589NOk) this).A04.A05;
        }
        String str = ((C52590NOl) this).A02.A1O;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final void A04() {
        if (this instanceof C52589NOk) {
            LeadGenFormData leadGenFormData = ((C52589NOk) this).A04;
            leadGenFormData.A05 = "";
            leadGenFormData.A02 = null;
            leadGenFormData.A00 = null;
            leadGenFormData.A07 = false;
            leadGenFormData.A09 = false;
            leadGenFormData.A0A = false;
            C14360o3.A0B("", 0);
            leadGenFormData.A04 = "";
            leadGenFormData.A06.clear();
            return;
        }
        PromoteData promoteData = ((C52590NOl) this).A02;
        promoteData.A1t.clear();
        promoteData.A1s.clear();
        promoteData.A1O = null;
        promoteData.A1M = null;
        promoteData.A0z = null;
        promoteData.A1N = null;
    }

    public final void A05() {
        if (this instanceof C52589NOk) {
            C52589NOk c52589NOk = (C52589NOk) this;
            C50634MWv c50634MWv = ((AbstractC51032Mgg) c52589NOk).A01;
            LeadGenFormData leadGenFormData = c52589NOk.A04;
            c50634MWv.A01 = leadGenFormData.A09;
            c50634MWv.A00 = leadGenFormData.A07;
            c50634MWv.A02 = leadGenFormData.A0A;
            return;
        }
        C52590NOl c52590NOl = (C52590NOl) this;
        C50634MWv c50634MWv2 = ((AbstractC51032Mgg) c52590NOl).A01;
        c50634MWv2.A00 = false;
        c50634MWv2.A01 = false;
        c50634MWv2.A02 = false;
        List list = c52590NOl.A02.A1s;
        C14360o3.A06(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55205OeH.A04(c50634MWv2, (LeadGenInfoFieldTypes) ((MUW) it.next()).A01, true);
        }
    }

    public final void A06() {
        if (this instanceof C52589NOk) {
            C52589NOk c52589NOk = (C52589NOk) this;
            c52589NOk.A02.A07(c52589NOk.A05, c52589NOk.A06, false);
            return;
        }
        C52590NOl c52590NOl = (C52590NOl) this;
        P4U p4u = c52590NOl.A00;
        Long l = c52590NOl.A04;
        String str = c52590NOl.A06;
        C14360o3.A0B(str, 1);
        AbstractC43592JPx.A1Q(p4u, l, str, "create_form_mutation", RealtimeConstants.SEND_FAIL);
    }

    public final void A07() {
        if (this instanceof C52589NOk) {
            C52589NOk c52589NOk = (C52589NOk) this;
            c52589NOk.A02.A07(c52589NOk.A05, c52589NOk.A06, true);
            return;
        }
        C52590NOl c52590NOl = (C52590NOl) this;
        P4U p4u = c52590NOl.A00;
        Long l = c52590NOl.A04;
        String str = c52590NOl.A06;
        C14360o3.A0B(str, 1);
        AbstractC43592JPx.A1Q(p4u, l, str, "create_form_mutation", "success");
    }

    public final void A08() {
        if (this instanceof C52589NOk) {
            C52589NOk c52589NOk = (C52589NOk) this;
            P4X.A02(c52589NOk.A02, c52589NOk.A05, "lead_gen_create_form", "require_welcome_message_error", A00(c52589NOk));
        } else {
            C52590NOl c52590NOl = (C52590NOl) this;
            AbstractC43592JPx.A1Q(c52590NOl.A00, c52590NOl.A04, "lead_gen_create_form", "require_welcome_message_error", "click");
        }
    }

    public final void A09(Context context) {
        if (this instanceof C52589NOk) {
            C52589NOk c52589NOk = (C52589NOk) this;
            LeadGenFormData leadGenFormData = c52589NOk.A04;
            C50634MWv c50634MWv = ((AbstractC51032Mgg) c52589NOk).A01;
            leadGenFormData.A09 = c50634MWv.A01;
            leadGenFormData.A07 = c50634MWv.A00;
            leadGenFormData.A0A = c50634MWv.A02;
            return;
        }
        C52590NOl c52590NOl = (C52590NOl) this;
        PromoteData promoteData = c52590NOl.A02;
        ArrayList A1N = AbstractC16960so.A1N(AbstractC54047Nux.A00(context, EnumC53254Ngs.A05));
        C50634MWv c50634MWv2 = ((AbstractC51032Mgg) c52590NOl).A01;
        if (c50634MWv2.A01) {
            A1N.add(AbstractC54047Nux.A00(context, EnumC53254Ngs.A06));
        }
        if (c50634MWv2.A00) {
            A1N.add(AbstractC54047Nux.A00(context, EnumC53254Ngs.A04));
        }
        if (c50634MWv2.A02) {
            A1N.add(AbstractC54047Nux.A00(context, EnumC53254Ngs.A07));
        }
        List list = promoteData.A1t;
        C14360o3.A06(list);
        A1N.addAll(list);
        promoteData.A1s = A1N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r12 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r7.A03 == X.EnumC53251Ngp.A06) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(android.content.Context r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51032Mgg.A0B(android.content.Context, java.lang.String, boolean):void");
    }

    public final void A0C(Resources resources, LeadForm leadForm) {
        if (this instanceof C52589NOk) {
            C52589NOk c52589NOk = (C52589NOk) this;
            LeadGenFormData leadGenFormData = c52589NOk.A04;
            ArrayList A04 = C55218Oeh.A04(resources, leadGenFormData);
            String str = leadForm.A02;
            String str2 = leadForm.A03;
            Boolean bool = leadForm.A01;
            String str3 = leadForm.A04;
            ArrayList A0q = AbstractC167017dG.A0q(A04);
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) it.next();
                A0q.add(new LeadGenInfoFieldData(leadGenFormBaseQuestion.A0A, leadGenFormBaseQuestion.A0D, AbstractC167007dF.A1X(leadGenFormBaseQuestion.A03, VEF.A06)));
            }
            LeadForm A00 = AbstractC54046Nuw.A00(leadGenFormData.A00, bool, str, str2, str3, A0q);
            c52589NOk.A01.A01 = A00.F51();
            return;
        }
        String str4 = leadForm.A02;
        String str5 = leadForm.A03;
        Boolean bool2 = leadForm.A01;
        String str6 = leadForm.A04;
        PromoteData promoteData = ((C52590NOl) this).A02;
        List list = promoteData.A1s;
        C14360o3.A06(list);
        ArrayList A0q2 = AbstractC167017dG.A0q(list);
        Iterator it2 = list.iterator();
        while (true) {
            boolean z = false;
            if (it2.hasNext()) {
                MUW muw = (MUW) it2.next();
                if (muw.A01 == LeadGenInfoFieldTypes.A07) {
                    z = true;
                }
                A0q2.add(new LeadGenInfoFieldData(muw.A03, (List) muw.A00, z));
            } else {
                LeadForm A002 = AbstractC54046Nuw.A00(promoteData.A0z, bool2, str4, str5, str6, A0q2);
                promoteData.A16 = A002;
                promoteData.A1u.add(0, A002);
                return;
            }
        }
    }

    public AbstractC51032Mgg(OMD omd) {
        this.A08 = omd;
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A06 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A05 = A1H2;
        C008002u A00 = C10E.A00(null);
        this.A04 = A00;
        C008002u A1H3 = AbstractC25225BEi.A1H(false);
        this.A07 = A1H3;
        this.A01 = new C50634MWv(7, 6, false, false);
        this.A00 = AbstractC31172DnG.A0E(C10Q.A01(new C57187PaQ(0, null), A1H, A1H2, A00, A1H3));
        C24721Ip A0q = MSX.A0q();
        this.A02 = A0q;
        this.A03 = AbstractC07080Za.A03(A0q);
    }
}
