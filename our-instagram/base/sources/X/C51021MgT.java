package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.MgT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51021MgT extends AbstractC52922bZ {
    public boolean A00;
    public final int A01;
    public final C2GT A02;
    public final C2GT A03;
    public final C2GT A04;
    public final UserSession A05;
    public final O3S A06;
    public final LeadGenFormData A07;
    public final String A08;
    public final List A09;
    public final InterfaceC24731Iq A0A;
    public final InterfaceC19390xP A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final boolean A0E;
    public final C05A[] A0F;
    public final C05A[] A0G;
    public final InterfaceC19390xP A0H;

    public C51021MgT(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        int size;
        LeadFormCustomQuestion leadFormCustomQuestion;
        this.A05 = userSession;
        this.A06 = new O3S(p4x);
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A00;
            this.A07 = leadGenFormData;
            Number number = (Number) c152406tQ.A00("args_custom_question_index");
            if (number != null) {
                size = number.intValue();
            } else {
                size = leadGenFormData.A06.size();
            }
            this.A01 = size;
            int i = 0;
            this.A0E = AbstractC167007dF.A1Q(size, leadGenFormData.A06.size());
            this.A08 = MSZ.A0t(leadGenFormData.A01);
            this.A00 = true;
            Integer num = C05F.A00;
            C24721Ip A0q = MSX.A0q();
            this.A0A = A0q;
            this.A0B = AbstractC07080Za.A03(A0q);
            EnumC53203Nfz enumC53203Nfz = EnumC53203Nfz.A03;
            C008002u A1H = AbstractC25225BEi.A1H(enumC53203Nfz);
            this.A0D = A1H;
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            this.A03 = AbstractC58232lf.A00(anonymousClass191, A1H);
            C008002u A1H2 = AbstractC25225BEi.A1H("");
            this.A0C = A1H2;
            MV5 A002 = MV5.A00(this, A1H2, 12);
            this.A0H = A002;
            this.A04 = AbstractC58232lf.A00(anonymousClass191, A002);
            C05A[] c05aArr = new C05A[4];
            int i2 = 0;
            do {
                c05aArr[i2] = AbstractC25225BEi.A1H("");
                i2++;
            } while (i2 < 4);
            this.A0F = c05aArr;
            C05A[] c05aArr2 = new C05A[4];
            int i3 = 0;
            do {
                c05aArr2[i3] = AbstractC25225BEi.A1H(new C51753Mtc(20, num));
                i3++;
            } while (i3 < 4);
            this.A0G = c05aArr2;
            ArrayList A17 = AbstractC25225BEi.A17(4);
            int i4 = 0;
            do {
                A17.add(AbstractC58232lf.A00(anonymousClass191, c05aArr2[i4]));
                i4++;
            } while (i4 < 4);
            this.A09 = A17;
            C05A c05a = this.A0D;
            ArrayList A172 = AbstractC25225BEi.A17(2);
            A172.add(this.A0H);
            AbstractC15480q3.A00(this.A0G, A172);
            this.A02 = AbstractC58232lf.A00(anonymousClass191, C10Q.A03(new C57182PaB(this, (InterfaceC23621Ds) null, 30, 42), c05a, new MZP(A172.toArray(new InterfaceC19390xP[A172.size()]), 5)));
            this.A0D.Egh(AbstractC50523MSb.A1Z(c152406tQ, "args_is_multiple_choice") ? enumC53203Nfz : EnumC53203Nfz.A04);
            C05A[] c05aArr3 = this.A0F;
            AbstractC18560vj.A03(AbstractC141776au.A00(this), MV5.A00(this, Arrays.copyOf(c05aArr3, c05aArr3.length), 11));
            if (this.A0E && (leadFormCustomQuestion = (LeadFormCustomQuestion) AbstractC001800i.A0O(this.A07.A06, this.A01)) != null) {
                this.A0C.Egh(leadFormCustomQuestion.A01);
                for (Object obj : leadFormCustomQuestion.A02) {
                    int i5 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    C05A[] c05aArr4 = this.A0F;
                    if (i < c05aArr4.length) {
                        c05aArr4[i].Egh(obj);
                    }
                    i = i5;
                }
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final List A00(C51021MgT c51021MgT) {
        C05A[] c05aArr = c51021MgT.A0F;
        ArrayList A17 = AbstractC25225BEi.A17(c05aArr.length);
        for (C05A c05a : c05aArr) {
            A17.add(c05a.getValue());
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A17) {
            AbstractC25228BEl.A1Q(obj, A1E, AbstractC001900j.A0T((String) obj) ? 1 : 0);
        }
        return A1E;
    }

    public final void A01() {
        EnumC53203Nfz enumC53203Nfz;
        String str;
        if (AbstractC31177DnL.A1b(this.A02.A02())) {
            String A15 = MSW.A15(this.A0C);
            C05A c05a = this.A0D;
            Object value = c05a.getValue();
            EnumC53203Nfz enumC53203Nfz2 = EnumC53203Nfz.A03;
            if (value == enumC53203Nfz2) {
                enumC53203Nfz = enumC53203Nfz2;
            } else {
                enumC53203Nfz = EnumC53203Nfz.A04;
            }
            LeadFormCustomQuestion leadFormCustomQuestion = new LeadFormCustomQuestion(enumC53203Nfz, A15, A00(this));
            boolean z = this.A0E;
            ArrayList arrayList = this.A07.A06;
            if (z) {
                arrayList.set(this.A01, leadFormCustomQuestion);
            } else {
                arrayList.add(leadFormCustomQuestion);
            }
            this.A00 = false;
            Object value2 = c05a.getValue();
            O3S o3s = this.A06;
            String str2 = this.A08;
            C14360o3.A0B(str2, 0);
            InterfaceC58268PsC interfaceC58268PsC = o3s.A00;
            if (value2 == enumC53203Nfz2) {
                str = "custom_multiple_choice_question_done";
            } else {
                str = "custom_short_answer_question_done";
            }
            interfaceC58268PsC.Ci4(null, str2, "lead_gen_custom_question", str, "click");
            PZF.A02(this, AbstractC141776au.A00(this), 4);
        }
    }
}
