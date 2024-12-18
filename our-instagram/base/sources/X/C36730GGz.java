package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GGz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36730GGz implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C36730GGz(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        String str;
        switch (this.A00) {
            case 0:
                EnumC33519Ers enumC33519Ers = null;
                AbstractC162267Oo.A01((UserSession) this.A02, true);
                C7F3 c7f3 = (C7F3) this.A01;
                Comparable comparable = this.A03;
                if (comparable instanceof EnumC33519Ers) {
                    enumC33519Ers = (EnumC33519Ers) comparable;
                }
                c7f3.A08(enumC33519Ers);
                return;
            case 1:
                C32735Eb1 c32735Eb1 = (C32735Eb1) this.A02;
                if (C31839Dyy.A00(c32735Eb1).A01 == EnumC33423Epu.A06 && AbstractC001900j.A0T(C31839Dyy.A00(c32735Eb1).A02)) {
                    c32735Eb1.A04().A01((EnumC33423Epu) this.A01, this.A03);
                    return;
                }
                C36298Fzs A0e = AbstractC31172DnG.A0e(c32735Eb1.A00);
                String str2 = c32735Eb1.A06().A00;
                String str3 = c32735Eb1.A06().A01;
                int i = ((AbstractC32348EMv) c32735Eb1).A00;
                String str4 = ((EnumC33423Epu) C31839Dyy.A00(c32735Eb1).A01).A03;
                if (str4 == null) {
                    str4 = C31839Dyy.A00(c32735Eb1).A02;
                }
                boolean A1O = AbstractC167007dF.A1O(C31839Dyy.A00(c32735Eb1).A02.length());
                C14360o3.A0B(str4, 3);
                Integer valueOf = Integer.valueOf(i);
                C09530e4 A1L = AbstractC166987dD.A1L("selected_prize", str4);
                if (A1O) {
                    str = "True";
                } else {
                    str = "False";
                }
                C36298Fzs.A03(null, A0e, valueOf, str2, str3, "challenge_prize_selected", "tap", "done_button", "prize_bottom_sheet", AbstractC25233BEq.A0p("custom_prize", str, A1L));
                return;
            case 2:
                ((OH5) this.A02).A00((Integer) ((C26086BgF) this.A01).A00, this.A03);
                return;
            case 3:
                C29138Ct5 c29138Ct5 = new C29138Ct5((UserSession) this.A02);
                C8n c8n = C8n.ADD_SCHOOL;
                EnumC39642HiX enumC39642HiX = (EnumC39642HiX) this.A01;
                String str5 = this.A03;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c29138Ct5, c29138Ct5.A00), "ig_school_registration_success_dismiss_action");
                if (!A0f.isSampled()) {
                    return;
                }
                A0f.A8R(enumC39642HiX, "entrypoint");
                A0f.A8R(c8n, "surface");
                AbstractC25232BEp.A1L(A0f, "waterfall_id", str5);
                return;
            default:
                OLM olm = (OLM) this.A02;
                String str6 = this.A03;
                EnumC39589Hdz enumC39589Hdz = (EnumC39589Hdz) this.A01;
                Integer num = C05F.A01;
                olm.A00(enumC39589Hdz, EnumC72375XcB.A08, num, num, str6, AbstractC166987dD.A1I());
                return;
        }
    }
}
