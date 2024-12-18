package X;

import com.facebook.R;
import com.instagram.settings2.core.model.EqualsValue;
import com.instagram.settings2.core.model.FbtLiteralValue;
import com.instagram.settings2.core.model.FbtTextTokenValue;
import com.instagram.settings2.core.model.FbtWithTokensValue;
import com.instagram.settings2.core.model.IfValue;
import com.instagram.settings2.core.model.ModalActionValue$Navigate;
import com.instagram.settings2.core.model.ModalBodyItemValue;
import com.instagram.settings2.core.model.ModalButtonValue;
import com.instagram.settings2.core.model.ModalValue;
import com.instagram.settings2.core.model.ServerValue;

/* renamed from: X.Pes, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57456Pes extends C0YY implements InterfaceC16820sZ {
    public static final C57456Pes A00 = new C57456Pes();

    public C57456Pes() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C09530e4 A1L = AbstractC166987dD.A1L("nido_supervised2", new ModalValue(new FbtLiteralValue(new ServerValue("supervised_modal_title", AbstractC25225BEi.A1D(String.class))), null, new ModalButtonValue(C51759Mti.A02(2131974972), C52738NVe.A00), null, C51759Mti.A02(2131963260), ModalBodyItemValue.A00(new NVA(new C51759Mti(new C51918Mx0(2131974967))), true)));
        C09530e4 A1L2 = AbstractC166987dD.A1L("nido_in_supervision_cooldown2", new ModalValue(new FbtLiteralValue(new ServerValue("cooldown_supervision_modal_title", AbstractC25225BEi.A1D(String.class))), null, new ModalButtonValue(C51759Mti.A02(2131974972), NVd.A00), null, C51759Mti.A02(2131963260), ModalBodyItemValue.A00(new FbtLiteralValue(new ServerValue("cooldown_supervision_modal_body", AbstractC25225BEi.A1D(String.class))), true)));
        C09530e4 A1L3 = AbstractC166987dD.A1L("nido_blocking_supervisor2", new ModalValue(new FbtLiteralValue(new ServerValue("blocked_supervisor_modal_title", AbstractC25225BEi.A1D(String.class))), null, null, null, C51759Mti.A02(2131968948), ModalBodyItemValue.A00(new FbtLiteralValue(new ServerValue("blocked_supervisor_modal_body", AbstractC25225BEi.A1D(String.class))), true)));
        C09530e4 A1L4 = AbstractC166987dD.A1L("nido_unsupervised2", new ModalValue(C51759Mti.A02(2131968541), new NVA(Integer.valueOf(R.drawable.ig_illustrations_illo_2fac_off_refresh)), new ModalButtonValue(C51759Mti.A02(2131952337), new ModalActionValue$Navigate(new NVA(new C32104E9c(C51759Mti.A01("Supervision"), null, "com.bloks.www.yp.supervision_onboarding", AbstractC167017dG.A0r("entrypoint", "guardian_pairing_upsell"), true, true)))), null, C51759Mti.A02(2131974968), ModalBodyItemValue.A00(C51759Mti.A02(2131968540), true)));
        NVA A02 = C51759Mti.A02(2131968549);
        ServerValue serverValue = new ServerValue("supervision_guardian_username", AbstractC25225BEi.A1D(String.class));
        return AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L("nido_rsv_only2", new ModalValue(A02, null, new ModalButtonValue(C51759Mti.A02(2131956794), new ModalActionValue$Navigate(new NVA(new C32104E9c(C51759Mti.A01("Supervision"), null, "com.bloks.www.yp.supervision_onboarding", null, false, true)))), null, C51759Mti.A02(2131974968), ModalBodyItemValue.A00(new FbtWithTokensValue(2131968548, AbstractC166987dD.A1J(new FbtTextTokenValue(new IfValue(new EqualsValue(serverValue, new NVA("")), C51759Mti.A02(2131968546), new FbtLiteralValue(serverValue)), "parent"))), true))), AbstractC166987dD.A1L("nido_pending_supervision_request2", new ModalValue(C51759Mti.A02(2131968539), null, new ModalButtonValue(C51759Mti.A02(2131956237), NVc.A00), new ModalButtonValue(C51759Mti.A02(2131969492), new ModalActionValue$Navigate(new NVA(new C32104E9c(C51759Mti.A01("Supervision"), null, "com.bloks.www.yp.supervision_onboarding", null, false, true)))), null, ModalBodyItemValue.A00(C51759Mti.A02(2131976955), true))));
    }
}
