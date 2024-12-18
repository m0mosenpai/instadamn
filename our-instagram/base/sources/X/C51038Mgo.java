package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.leadgen.organic.model.LeadGenFormData;

/* renamed from: X.Mgo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51038Mgo extends AbstractC52922bZ {
    public final C2GT A00;
    public final C50634MWv A01;
    public final UserSession A02;
    public final LeadGenBaseFormList A03;
    public final P4X A04;
    public final EnumC53251Ngp A05;
    public final LeadGenFormData A06;
    public final Long A07;
    public final String A08;
    public final InterfaceC24731Iq A09;
    public final InterfaceC19390xP A0A;
    public final C05A A0B;
    public final boolean A0C;
    public final OMD A0D;

    public final void A04(EnumC53203Nfz enumC53203Nfz, int i, boolean z) {
        String str;
        if (!AbstractC31176DnK.A1b(this.A0B)) {
            if (z) {
                if (enumC53203Nfz.ordinal() != 0) {
                    str = "add_custom_multiple_choice_question";
                } else {
                    str = "add_custom_short_answer_question";
                }
                P4X p4x = this.A04;
                Long l = this.A07;
                String str2 = this.A08;
                C14360o3.A0B(str2, 1);
                P4X.A02(p4x, l, "lead_gen_create_form", str, str2);
            }
            A01(this);
            AbstractC166987dD.A1Z(new C50530MSj(this, enumC53203Nfz, null, i, 17), AbstractC141776au.A00(this));
        }
    }

    public static final void A01(C51038Mgo c51038Mgo) {
        LeadGenFormData leadGenFormData = c51038Mgo.A06;
        C50634MWv c50634MWv = c51038Mgo.A01;
        leadGenFormData.A09 = c50634MWv.A01;
        leadGenFormData.A07 = c50634MWv.A00;
        leadGenFormData.A0A = c50634MWv.A02;
    }

    public final void A02() {
        LeadGenFormData leadGenFormData = this.A06;
        leadGenFormData.A05 = "";
        leadGenFormData.A02 = null;
        leadGenFormData.A00 = null;
        leadGenFormData.A07 = false;
        leadGenFormData.A09 = false;
        leadGenFormData.A0A = false;
        C14360o3.A0B("", 0);
        leadGenFormData.A04 = "";
        leadGenFormData.A06.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r14.A05 == X.EnumC53251Ngp.A06) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.content.Context r15, java.lang.String r16, boolean r17) {
        /*
            r14 = this;
            com.instagram.common.session.UserSession r0 = r14.A02
            com.instagram.user.model.User r4 = X.AbstractC166997dE.A0Y(r0)
            com.instagram.leadgen.organic.model.LeadGenFormData r3 = r14.A06
            java.lang.String r6 = X.C55218Oeh.A02(r15, r3)
            boolean r0 = r14.A0C
            if (r0 == 0) goto L17
            X.Ngp r2 = r14.A05
            X.Ngp r0 = X.EnumC53251Ngp.A06
            r1 = 1
            if (r2 != r0) goto L18
        L17:
            r1 = 0
        L18:
            X.17P r0 = r4.A03
            r0.Baz()
            java.lang.String r4 = r3.A03
            java.lang.String r5 = r3.A04
            X.Ngp r0 = r14.A05
            com.instagram.api.schemas.LeadGenEntryPoint r3 = r0.A01
            r13 = r1 ^ 1
            r8 = 0
            java.lang.String r7 = ""
            X.AbstractC167017dG.A1R(r4, r5)
            r0 = 6
            X.C14360o3.A0B(r3, r0)
            X.OMD r2 = r14.A0D
            r10 = r16
            r12 = r17
            r9 = r8
            r11 = r8
            X.MWG r2 = r2.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 31
            X.MBt r0 = new X.MBt
            r0.<init>(r14, r15, r8, r1)
            X.AbstractC25232BEp.A1J(r14, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51038Mgo.A03(android.content.Context, java.lang.String, boolean):void");
    }

    public C51038Mgo(C152406tQ c152406tQ, UserSession userSession, P4X p4x) {
        this.A02 = userSession;
        this.A04 = p4x;
        Object A00 = c152406tQ.A00("args_form_data");
        if (A00 != null) {
            LeadGenFormData leadGenFormData = (LeadGenFormData) A00;
            this.A06 = leadGenFormData;
            EnumC53251Ngp enumC53251Ngp = leadGenFormData.A01;
            this.A05 = enumC53251Ngp;
            this.A08 = MSZ.A0t(enumC53251Ngp);
            this.A07 = AbstractC37302Gc3.A0W(AbstractC50522MSa.A0k(userSession));
            LeadGenBaseFormList leadGenBaseFormList = (LeadGenBaseFormList) c152406tQ.A00("args_form_list_data");
            this.A03 = leadGenBaseFormList == null ? new LeadGenBaseFormList(null, null, null, "", AbstractC166987dD.A1E(), false) : leadGenBaseFormList;
            this.A0C = AbstractC167007dF.A1T(AbstractC50522MSa.A0e(c152406tQ, "args_is_from_one_tap_onboarding_custom_form_flow"));
            this.A0D = new OMD(userSession);
            this.A01 = new C50634MWv(7, 6, false, false);
            C008002u A1A = AbstractC25235BEs.A1A(false);
            this.A0B = A1A;
            this.A00 = AbstractC31172DnG.A0E(A1A);
            C24721Ip A0q = MSX.A0q();
            this.A09 = A0q;
            this.A0A = AbstractC07080Za.A03(A0q);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static LeadGenFormData A00(InterfaceC09390do interfaceC09390do) {
        return ((C51038Mgo) interfaceC09390do.getValue()).A06;
    }
}
