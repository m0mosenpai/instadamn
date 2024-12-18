package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.schools.management.data.SchoolOnboardingParcelData;
import com.instagram.schools.management.data.SendOtpMutationResponseImpl;
import go.Seq;

/* renamed from: X.DGa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29886DGa extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29886DGa(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C29886DGa A00(C5Tl c5Tl, Object obj, int i) {
        C29886DGa c29886DGa = new C29886DGa(obj, i);
        c5Tl.FBy(c29886DGa);
        return c29886DGa;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC09390do interfaceC09390do;
        UserSession A03;
        AbstractC26821Bsj abstractC26821Bsj;
        EnumC39642HiX enumC39642HiX;
        C8n A00;
        String str;
        C18920wW A002;
        String str2;
        AbstractC26821Bsj abstractC26821Bsj2;
        switch (this.A00) {
            case 2:
                C27894CRf c27894CRf = ((C26731BrC) this.A01).A00;
                if (c27894CRf != null) {
                    c27894CRf.A02.A00 = true;
                    c27894CRf.A00.A07();
                }
                return C0eB.A00;
            case 3:
                C27894CRf c27894CRf2 = ((C26731BrC) this.A01).A00;
                if (c27894CRf2 != null) {
                    c27894CRf2.A00.A07();
                    C26823Bsl.A01(c27894CRf2.A01);
                }
                return C0eB.A00;
            case 4:
                C27894CRf c27894CRf3 = ((C26731BrC) this.A01).A00;
                if (c27894CRf3 != null) {
                    C26823Bsl c26823Bsl = c27894CRf3.A01;
                    X30 x30 = new X30(c26823Bsl, 11);
                    C189478aR c189478aR = c27894CRf3.A00;
                    String str3 = c26823Bsl.A01;
                    C29367Cx0 c29367Cx0 = new C29367Cx0(c189478aR, x30);
                    EnumC39642HiX enumC39642HiX2 = c26823Bsl.A00;
                    AbstractC167017dG.A1O(str3, enumC39642HiX2);
                    C26746BrS c26746BrS = new C26746BrS();
                    c26746BrS.A02 = str3;
                    c26746BrS.A01 = c29367Cx0;
                    c26746BrS.A00 = enumC39642HiX2;
                    c189478aR.A0G(c26746BrS, AbstractC25231BEo.A0g(c26823Bsl.A0B), false, true);
                }
                return C0eB.A00;
            case 5:
                interfaceC09390do = ((C26731BrC) this.A01).A04;
                A03 = AbstractC166987dD.A0r(interfaceC09390do);
                return new C29138Ct5(A03);
            case 6:
                interfaceC09390do = ((C26736BrH) this.A01).A05;
                A03 = AbstractC166987dD.A0r(interfaceC09390do);
                return new C29138Ct5(A03);
            case 7:
                abstractC26821Bsj = (AbstractC26821Bsj) this.A01;
                abstractC26821Bsj.A07();
                abstractC26821Bsj.A09();
                return C0eB.A00;
            case 8:
            case 34:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C6WQ(((Fragment) this.A01).requireActivity(), true);
            case 9:
                A03 = ((AbstractC26821Bsj) this.A01).A03();
                return new C29138Ct5(A03);
            case 10:
            case 44:
            case 48:
                return this.A01;
            case 11:
            case 45:
            case 49:
                return AbstractC25226BEj.A1C(this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC167027dH.A0B(this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC26821Bsj abstractC26821Bsj3 = (AbstractC26821Bsj) this.A01;
                return new C27022Bw1(abstractC26821Bsj3.A03(), (SchoolOnboardingParcelData) abstractC26821Bsj3.A02.getValue());
            case 14:
                AbstractC25235BEs.A1Q(((AbstractC26821Bsj) this.A01).A00);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                AbstractC26821Bsj abstractC26821Bsj4 = (AbstractC26821Bsj) this.A01;
                C29138Ct5 A0z = AbstractC25228BEl.A0z(abstractC26821Bsj4);
                enumC39642HiX = C25873BcV.A00(abstractC26821Bsj4).A00;
                A00 = AbstractC26821Bsj.A00(abstractC26821Bsj4);
                str = C25873BcV.A00(abstractC26821Bsj4).A0E;
                AbstractC167027dH.A12(enumC39642HiX, A00, str);
                A002 = C29138Ct5.A00(A0z);
                str2 = "ig_school_registration_code_field";
                AbstractC25234BEr.A0v(enumC39642HiX, A00, A002, str2, str);
                return C0eB.A00;
            case 16:
            case 32:
            case 33:
            case 37:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 17:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                abstractC26821Bsj = (AbstractC26821Bsj) this.A01;
                AbstractC25235BEs.A1Q(abstractC26821Bsj.A00);
                abstractC26821Bsj.A09();
                return C0eB.A00;
            case 18:
                AbstractC26821Bsj abstractC26821Bsj5 = (AbstractC26821Bsj) this.A01;
                AbstractC25235BEs.A1Q(abstractC26821Bsj5.A00);
                abstractC26821Bsj5.A0A(EnumC53374NjP.UNKNOWN, "failed to send otp email");
                C9GR.A0B(abstractC26821Bsj5.getContext(), MSV.A00(234));
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                abstractC26821Bsj2 = (AbstractC26821Bsj) this.A01;
                if (C25873BcV.A00(abstractC26821Bsj2).A07 != null && C25873BcV.A00(abstractC26821Bsj2).A08 != null) {
                    AbstractC25229BEm.A1Q(abstractC26821Bsj2.A00);
                    C25873BcV A05 = abstractC26821Bsj2.A05();
                    C29886DGa c29886DGa = new C29886DGa(abstractC26821Bsj2, 17);
                    C29886DGa c29886DGa2 = new C29886DGa(abstractC26821Bsj2, 18);
                    C26075Bg4 A01 = C25873BcV.A01(A05);
                    String str4 = A01.A0C;
                    String str5 = A01.A09;
                    String str6 = A01.A0D;
                    Integer num = A01.A07;
                    Integer num2 = A01.A08;
                    if (str4 != null && str5 != null && str6 != null && num != null && num2 != null) {
                        C27962CUh c27962CUh = A05.A00;
                        int intValue = num.intValue();
                        int intValue2 = num2.intValue();
                        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str4, "school_uid");
                        C0CA.A00(A0T, str5, "affiliation_id");
                        C0CA.A00(A0T, str6, MSV.A00(271));
                        C0CA.A00(A0T, String.valueOf(intValue), "grad_month");
                        C0CA.A00(A0T, String.valueOf(intValue2), "grad_year");
                        C26075Bg4.A03(A0T, c27962CUh.A01);
                        C2JM A0b = AbstractC25225BEi.A0b();
                        C28909CpI.A00(new C64018Sxp(7, c29886DGa, c29886DGa2), new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "SendOtpMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), SendOtpMutationResponseImpl.class, true, null, 0, null, "xdt_send_otp_email", AbstractC166987dD.A1E()), AbstractC40691uc.A01(c27962CUh.A00), c29886DGa2, 9);
                    } else {
                        c29886DGa2.invoke();
                    }
                } else {
                    abstractC26821Bsj2.A0A(EnumC53374NjP.UNKNOWN, "user tried to continue without entering graduation date");
                    C9GR.A01(abstractC26821Bsj2.getContext(), MSV.A00(234), 2131969695, 0);
                }
                abstractC26821Bsj2.A07();
                return C0eB.A00;
            case 20:
                AbstractC26821Bsj abstractC26821Bsj6 = (AbstractC26821Bsj) this.A01;
                if (abstractC26821Bsj6.A04().ordinal() == 4) {
                    C140966Yy A0S = AbstractC25236BEt.A0S(abstractC26821Bsj6);
                    SchoolOnboardingParcelData A012 = AbstractC26821Bsj.A01(abstractC26821Bsj6);
                    C25 c25 = new C25();
                    Bundle A0b2 = AbstractC166987dD.A0b();
                    A0b2.putParcelable(AbstractC111324zv.A00(311), A012);
                    c25.setArguments(A0b2);
                    A0S.A0D(c25);
                    A0S.A04();
                }
                C29138Ct5 A0z2 = AbstractC25228BEl.A0z(abstractC26821Bsj6);
                enumC39642HiX = C25873BcV.A00(abstractC26821Bsj6).A00;
                A00 = AbstractC26821Bsj.A00(abstractC26821Bsj6);
                str = C25873BcV.A00(abstractC26821Bsj6).A0E;
                AbstractC167027dH.A12(enumC39642HiX, A00, str);
                A002 = C29138Ct5.A00(A0z2);
                str2 = "ig_school_registration_edit_school_button_tap";
                AbstractC25234BEr.A0v(enumC39642HiX, A00, A002, str2, str);
                return C0eB.A00;
            case 21:
                AbstractC26821Bsj abstractC26821Bsj7 = (AbstractC26821Bsj) this.A01;
                C29138Ct5 A0z3 = AbstractC25228BEl.A0z(abstractC26821Bsj7);
                enumC39642HiX = C25873BcV.A00(abstractC26821Bsj7).A00;
                A00 = AbstractC26821Bsj.A00(abstractC26821Bsj7);
                str = C25873BcV.A00(abstractC26821Bsj7).A0E;
                AbstractC167027dH.A12(enumC39642HiX, A00, str);
                A002 = C29138Ct5.A00(A0z3);
                str2 = "ig_school_registration_grad_date_picker_dismiss";
                AbstractC25234BEr.A0v(enumC39642HiX, A00, A002, str2, str);
                return C0eB.A00;
            case 22:
                AbstractC26821Bsj abstractC26821Bsj8 = (AbstractC26821Bsj) this.A01;
                C29138Ct5 A0z4 = AbstractC25228BEl.A0z(abstractC26821Bsj8);
                enumC39642HiX = C25873BcV.A00(abstractC26821Bsj8).A00;
                A00 = AbstractC26821Bsj.A00(abstractC26821Bsj8);
                str = C25873BcV.A00(abstractC26821Bsj8).A0E;
                AbstractC167027dH.A12(enumC39642HiX, A00, str);
                A002 = C29138Ct5.A00(A0z4);
                str2 = "ig_school_registration_multi_school_search_bar_tapped";
                AbstractC25234BEr.A0v(enumC39642HiX, A00, A002, str2, str);
                return C0eB.A00;
            case 23:
            case 24:
                AbstractC25227BEk.A1A(((CPN) this.A01).A00, false);
                return C0eB.A00;
            case 25:
                AbstractC26821Bsj abstractC26821Bsj9 = (AbstractC26821Bsj) this.A01;
                C29138Ct5 A0z5 = AbstractC25228BEl.A0z(abstractC26821Bsj9);
                enumC39642HiX = C25873BcV.A00(abstractC26821Bsj9).A00;
                A00 = AbstractC26821Bsj.A00(abstractC26821Bsj9);
                str = C25873BcV.A00(abstractC26821Bsj9).A0E;
                AbstractC167027dH.A12(enumC39642HiX, A00, str);
                A002 = C29138Ct5.A00(A0z5);
                str2 = "ig_school_registration_email_editor_tap";
                AbstractC25234BEr.A0v(enumC39642HiX, A00, A002, str2, str);
                return C0eB.A00;
            case 26:
                C29 c29 = (C29) this.A01;
                AbstractC25235BEs.A1Q(((AbstractC26821Bsj) c29).A00);
                c29.A00 = true;
                C29.A02(c29);
                return C0eB.A00;
            case 27:
                AbstractC26821Bsj abstractC26821Bsj10 = (AbstractC26821Bsj) this.A01;
                AbstractC25235BEs.A1Q(abstractC26821Bsj10.A00);
                abstractC26821Bsj10.A0A(EnumC53374NjP.UNKNOWN, "failed to remove user from school during switching");
                return C0eB.A00;
            case 28:
                AbstractC25229BEm.A1Q(((AbstractC26821Bsj) this.A01).A00);
                return C0eB.A00;
            case 30:
                abstractC26821Bsj2 = (AbstractC26821Bsj) this.A01;
                abstractC26821Bsj2.A09();
                abstractC26821Bsj2.A07();
                return C0eB.A00;
            case 31:
                ((AbstractC26821Bsj) this.A01).A06();
                return C0eB.A00;
            case 35:
                C26746BrS c26746BrS2 = (C26746BrS) this.A01;
                C29138Ct5 A12 = AbstractC25226BEj.A12(c26746BrS2.A04);
                EnumC39642HiX enumC39642HiX3 = c26746BrS2.A00;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(C29138Ct5.A01(A12, enumC39642HiX3, 0), "ig_school_reliability_remove_school_cancel_button_tap");
                if (A0f.isSampled()) {
                    AbstractC25225BEi.A1L(enumC39642HiX3, A0f);
                    AbstractC25234BEr.A0w(C8n.REMOVE_SCHOOL, A0f);
                }
                InterfaceC30999Djy interfaceC30999Djy = c26746BrS2.A01;
                if (interfaceC30999Djy != null) {
                    interfaceC30999Djy.DAI();
                }
                return C0eB.A00;
            case 36:
                interfaceC09390do = ((C26746BrS) this.A01).A05;
                A03 = AbstractC166987dD.A0r(interfaceC09390do);
                return new C29138Ct5(A03);
            case 43:
                interfaceC09390do = ((C26802BsQ) this.A01).A03;
                A03 = AbstractC166987dD.A0r(interfaceC09390do);
                return new C29138Ct5(A03);
            case 47:
                return new C27002Bvh(AbstractC166987dD.A0r(((C26802BsQ) this.A01).A03));
        }
    }
}
