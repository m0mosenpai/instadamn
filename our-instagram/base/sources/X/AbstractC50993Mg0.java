package X;

import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Mg0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50993Mg0 extends AbstractC52922bZ {
    public boolean A00;
    public final C2GT A01;
    public final C2GT A02;
    public final C2GT A03;
    public final O3S A04;
    public final List A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A[] A0A;
    public final C05A[] A0B;
    public final InterfaceC19390xP A0C;

    public AbstractC50993Mg0(C152406tQ c152406tQ, O3S o3s) {
        this.A04 = o3s;
        Integer num = C05F.A00;
        C24721Ip A0q = MSX.A0q();
        this.A06 = A0q;
        this.A07 = AbstractC07080Za.A03(A0q);
        this.A00 = true;
        EnumC53203Nfz enumC53203Nfz = EnumC53203Nfz.A03;
        C008002u A1H = AbstractC25225BEi.A1H(enumC53203Nfz);
        this.A09 = A1H;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A02 = AbstractC58232lf.A00(anonymousClass191, A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H("");
        this.A08 = A1H2;
        MV5 A00 = MV5.A00(this, A1H2, 10);
        this.A0C = A00;
        this.A03 = AbstractC58232lf.A00(anonymousClass191, A00);
        C05A[] c05aArr = new C05A[4];
        int i = 0;
        do {
            c05aArr[i] = AbstractC25225BEi.A1H("");
            i++;
        } while (i < 4);
        this.A0A = c05aArr;
        C05A[] c05aArr2 = new C05A[4];
        int i2 = 0;
        do {
            c05aArr2[i2] = AbstractC25225BEi.A1H(new C51753Mtc(19, num));
            i2++;
        } while (i2 < 4);
        this.A0B = c05aArr2;
        ArrayList A17 = AbstractC25225BEi.A17(4);
        int i3 = 0;
        do {
            A17.add(AbstractC58232lf.A00(anonymousClass191, c05aArr2[i3]));
            i3++;
        } while (i3 < 4);
        this.A05 = A17;
        C05A c05a = this.A09;
        ArrayList A172 = AbstractC25225BEi.A17(2);
        A172.add(this.A0C);
        AbstractC15480q3.A00(this.A0B, A172);
        this.A01 = AbstractC58232lf.A00(anonymousClass191, C10Q.A03(new C57182PaB(this, (InterfaceC23621Ds) null, 29, 42), c05a, new MZP(A172.toArray(new InterfaceC19390xP[A172.size()]), 4)));
        Boolean A0e = AbstractC50522MSa.A0e(c152406tQ, "args_is_multiple_choice");
        this.A09.Egh(A0e != null ? A0e.booleanValue() : false ? enumC53203Nfz : EnumC53203Nfz.A04);
        C05A[] c05aArr3 = this.A0A;
        AbstractC18560vj.A03(AbstractC141776au.A00(this), MV5.A00(this, Arrays.copyOf(c05aArr3, c05aArr3.length), 9));
    }

    public final String A00() {
        if (this instanceof C52596NOr) {
            return ((C52596NOr) this).A03;
        }
        return ((C52597NOs) this).A03;
    }

    public final List A01() {
        C05A[] c05aArr = this.A0A;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void A02() {
        EnumC53203Nfz enumC53203Nfz;
        C52597NOs c52597NOs;
        String str;
        EnumC53203Nfz enumC53203Nfz2;
        if (this instanceof C52596NOr) {
            C52596NOr c52596NOr = (C52596NOr) this;
            if (AbstractC31177DnL.A1b(((AbstractC50993Mg0) c52596NOr).A01.A02())) {
                String A15 = MSW.A15(c52596NOr.A08);
                Object value = c52596NOr.A09.getValue();
                enumC53203Nfz = EnumC53203Nfz.A03;
                if (value == enumC53203Nfz) {
                    enumC53203Nfz2 = enumC53203Nfz;
                } else {
                    enumC53203Nfz2 = EnumC53203Nfz.A04;
                }
                LeadFormCustomQuestion leadFormCustomQuestion = new LeadFormCustomQuestion(enumC53203Nfz2, A15, c52596NOr.A01());
                boolean z = c52596NOr.A04;
                ArrayList arrayList = c52596NOr.A02.A06;
                if (z) {
                    arrayList.set(c52596NOr.A00, leadFormCustomQuestion);
                    c52597NOs = c52596NOr;
                } else {
                    arrayList.add(leadFormCustomQuestion);
                    c52597NOs = c52596NOr;
                }
            } else {
                return;
            }
        } else {
            C52597NOs c52597NOs2 = (C52597NOs) this;
            if (!AbstractC31177DnL.A1b(((AbstractC50993Mg0) c52597NOs2).A01.A02())) {
                return;
            }
            String A152 = MSW.A15(c52597NOs2.A08);
            LeadGenInfoFieldTypes leadGenInfoFieldTypes = LeadGenInfoFieldTypes.A07;
            Object value2 = c52597NOs2.A09.getValue();
            enumC53203Nfz = EnumC53203Nfz.A03;
            List list = null;
            if (value2 == enumC53203Nfz) {
                list = c52597NOs2.A01();
            }
            MUW muw = new MUW(leadGenInfoFieldTypes, A152, list);
            boolean z2 = c52597NOs2.A05;
            List list2 = c52597NOs2.A01.A1t;
            if (z2) {
                list2.set(c52597NOs2.A00, muw);
                c52597NOs = c52597NOs2;
            } else {
                list2.add(muw);
                c52597NOs = c52597NOs2;
            }
        }
        ((AbstractC50993Mg0) c52597NOs).A00 = false;
        Object value3 = c52597NOs.A09.getValue();
        O3S o3s = ((AbstractC50993Mg0) c52597NOs).A04;
        String A00 = c52597NOs.A00();
        C14360o3.A0B(A00, 0);
        InterfaceC58268PsC interfaceC58268PsC = o3s.A00;
        if (value3 == enumC53203Nfz) {
            str = "custom_multiple_choice_question_done";
        } else {
            str = "custom_short_answer_question_done";
        }
        interfaceC58268PsC.Ci4(null, A00, "lead_gen_custom_question", str, "click");
        AbstractC31177DnL.A1Q(c52597NOs, AbstractC141776au.A00(c52597NOs), 43);
    }
}
