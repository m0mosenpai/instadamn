package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ct5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29138Ct5 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "SchoolsLogger";
    public final UserSession A00;
    public final List A01;

    public C29138Ct5(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC16960so.A1M(C8n.ADD_SCHOOL, C8n.CONFIRM_ENROLLMENT, C8n.CONFIRM_SCHOOL, C8n.MULTI_SCHOOL, C8n.GRADUATION_DATE);
    }

    public final void A05(EnumC39642HiX enumC39642HiX, C8n c8n) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01(this, enumC39642HiX, 0), "ig_school_reliability_remove_school_button_tap");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1L(enumC39642HiX, A0f);
            AbstractC25234BEr.A0w(c8n, A0f);
        }
    }

    public static C18920wW A00(C29138Ct5 c29138Ct5) {
        return AbstractC12220kQ.A01(c29138Ct5, c29138Ct5.A00);
    }

    public static C18920wW A01(C29138Ct5 c29138Ct5, Object obj, int i) {
        C14360o3.A0B(obj, i);
        return AbstractC12220kQ.A01(c29138Ct5, c29138Ct5.A00);
    }

    public static final void A02(EnumC39642HiX enumC39642HiX, C8n c8n, C29138Ct5 c29138Ct5, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(c29138Ct5), "ig_school_registration_link_tap");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1L(enumC39642HiX, A0f);
            A0f.A8R(c8n, "surface");
            A0f.AAP("waterfall_id", str);
            AbstractC25232BEp.A1L(A0f, AbstractC111324zv.A00(2670), str2);
        }
    }

    public final void A03(EnumC39642HiX enumC39642HiX, C8n c8n) {
        AbstractC167017dG.A1N(c8n, enumC39642HiX);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this), "ig_school_reliability_page_impression");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1L(enumC39642HiX, A0f);
            AbstractC25234BEr.A0w(c8n, A0f);
        }
    }

    public final void A04(EnumC39642HiX enumC39642HiX, C8n c8n) {
        AbstractC167017dG.A1N(c8n, enumC39642HiX);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this), "ig_school_reliability_back_button_tap");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1L(enumC39642HiX, A0f);
            AbstractC25234BEr.A0w(c8n, A0f);
        }
    }

    public final void A06(EnumC39642HiX enumC39642HiX, C8n c8n, String str) {
        AbstractC167027dH.A12(enumC39642HiX, c8n, str);
        if (this.A01.contains(c8n)) {
            A02(enumC39642HiX, c8n, this, str, "learn_more");
            return;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this), "ig_school_reliability_intro_page_learn_more");
        if (!A0f.isSampled()) {
            return;
        }
        AbstractC25225BEi.A1L(enumC39642HiX, A0f);
        AbstractC25234BEr.A0w(c8n, A0f);
    }

    public final void A07(String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this), "ig_school_client_error");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1L(EnumC39642HiX.QP, A0f);
            A0f.A8R(C8n.ADD_SCHOOL, "surface");
            A0f.AAP("waterfall_id", "");
            A0f.A8R(EnumC53374NjP.UNKNOWN, "error");
            AbstractC25232BEp.A1L(A0f, AbstractC111324zv.A00(718), str);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "schools";
    }
}
