package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class FRX {
    public final Activity A00;
    public final UserSession A01;
    public final C36297Fzr A02;
    public final InterfaceC11380iw A03;
    public final FGT A04;

    public FRX(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, FGT fgt) {
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A01 = userSession;
        this.A00 = activity;
        this.A03 = interfaceC11380iw;
        this.A04 = fgt;
        this.A02 = new C36297Fzr(userSession);
    }

    public final void A01(EnumC33364Eox enumC33364Eox, EnumC33420Epr enumC33420Epr, E6W e6w, DirectThreadKey directThreadKey, int i, int i2) {
        C14360o3.A0B(enumC33420Epr, 0);
        UserSession userSession = this.A01;
        C7FQ A00 = C7FP.A00(this.A03, userSession);
        String str = directThreadKey.A00;
        String str2 = directThreadKey.A01;
        DirectPromptTypes A01 = C7D2.A01(AbstractC167007dF.A0h(enumC33420Epr.toString()));
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    ((FRk) A00.A05.getValue()).A04(A01, false, null);
                }
            } else {
                C36288Fzi A0N = AbstractC31179DnN.A0N(A00);
                if (A01 == DirectPromptTypes.A07) {
                    C36288Fzi.A00(A0N, Integer.valueOf(i2), str, str2, "direct_composer_tap_question", "tap", "ama_questions_button", null);
                } else {
                    C0w9.A01.EmN("prompt_broadcast_logger", AnonymousClass001.A0R("Invalid prompt type ", A01.A01));
                }
            }
            if (enumC33420Epr.ordinal() != 2 && !AbstractC166987dD.A0x(userSession).getBoolean(AbstractC111324zv.A00(767), false)) {
                EKR A002 = FU8.A00(userSession, EnumC33364Eox.A03, new G21(enumC33420Epr, this, directThreadKey, i, i2), null, null, null, true);
                C189448aO A0X = AbstractC31177DnL.A0X(userSession, false);
                A0X.A1P = true;
                A0X.A00().A02(this.A00, A002);
                return;
            }
            if (enumC33420Epr != EnumC33420Epr.A06 && C159227Ci.A00.A02(userSession, e6w, directThreadKey)) {
                Bundle A0D = AbstractC31174DnI.A0D(userSession);
                A0D.putParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, directThreadKey);
                A0D.putSerializable("prompts_tab", enumC33420Epr);
                A0D.putInt("direct_thread_sub_type", i);
                A0D.putInt("direct_thread_audience_type", i2);
                if (enumC33364Eox != null) {
                    A0D.putSerializable("prompts_entry_point", enumC33364Eox);
                }
                AbstractC31177DnL.A0o(this.A00, A0D, userSession, AbstractC111324zv.A00(4270));
                return;
            }
            A02(enumC33364Eox, enumC33420Epr, directThreadKey, i, i2);
        }
        C36293Fzn A0O = AbstractC31179DnN.A0O(A00);
        if (A01 == DirectPromptTypes.A07) {
            C36293Fzn.A00(EnumC33514Ern.A04, EnumC33512Erl.THREAD_VIEW, A0O, "direct_composer_tap_question", "tap", null);
        } else {
            C18950wb.A01.AEp(AnonymousClass001.A0R("Invalid prompt type ", A01.A01), 20134884);
        }
        if (enumC33420Epr.ordinal() != 2) {
        }
        if (enumC33420Epr != EnumC33420Epr.A06) {
        }
        A02(enumC33364Eox, enumC33420Epr, directThreadKey, i, i2);
    }

    public final void A02(EnumC33364Eox enumC33364Eox, EnumC33420Epr enumC33420Epr, DirectThreadKey directThreadKey, int i, int i2) {
        AbstractC32348EMv c32735Eb1;
        int i3;
        ComponentActivity componentActivity;
        C14360o3.A0B(enumC33420Epr, 0);
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = this.A01;
        AbstractC03240Dh.A00(A0b, userSession);
        A0b.putParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, directThreadKey);
        A0b.putSerializable("prompts_tab", enumC33420Epr);
        A0b.putInt("direct_thread_sub_type", i);
        A0b.putInt("direct_thread_audience_type", i2);
        if (enumC33364Eox != null) {
            A0b.putSerializable("prompts_entry_point", enumC33364Eox);
        }
        int ordinal = enumC33420Epr.ordinal();
        if (ordinal != 2) {
            if (ordinal != 1) {
                if (ordinal == 3) {
                    c32735Eb1 = new C32736Eb2();
                } else {
                    throw B4Z.A00();
                }
            } else {
                c32735Eb1 = new AbstractC32348EMv();
            }
        } else {
            c32735Eb1 = new C32735Eb1();
        }
        c32735Eb1.setArguments(A0b);
        if (enumC33420Epr != EnumC33420Epr.A06) {
            if (enumC33420Epr == EnumC33420Epr.A07) {
                i3 = 2252;
            } else {
                C189448aO A0X = AbstractC31177DnL.A0X(userSession, true);
                A0X.A0T = c32735Eb1;
                A0X.A03 = 1.0f;
                C189478aR A00 = A0X.A00();
                FGT fgt = this.A04;
                Activity activity = this.A00;
                if ((activity instanceof FragmentActivity) && (componentActivity = (ComponentActivity) activity) != null) {
                    AbstractC31172DnG.A0D((FragmentActivity) activity).A0u(new C35758Fqv(fgt, 4), componentActivity, "DirectPromptsFragment.CONVERSATION_STARTERS_QUESTIONS_PROMPT_REQUEST_KEY");
                }
                A00.A02(activity, c32735Eb1);
                return;
            }
        } else {
            i3 = 2249;
        }
        AbstractC31177DnL.A0o(this.A00, A0b, userSession, AbstractC111324zv.A00(i3));
    }

    public final void A00(EnumC33364Eox enumC33364Eox, EnumC33420Epr enumC33420Epr, C32067E6t c32067E6t, C2EE c2ee, DirectThreadKey directThreadKey) {
        boolean A1a = AbstractC31175DnJ.A1a(c32067E6t);
        UserSession userSession = this.A01;
        int i = 2131958982;
        if (C7HD.A02(userSession)) {
            i = 2131958981;
        }
        int i2 = 2131958975;
        if (C7HD.A02(userSession)) {
            i2 = 2131958974;
        }
        Activity activity = this.A00;
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        AbstractC31172DnG.A1C(activity, A0H, i);
        A0H.A0S(new DialogInterfaceOnClickListenerC35450Fk7(11, c32067E6t, this, c2ee), EnumC193348hE.A03, 2131958976);
        A0H.A0H(new DialogInterfaceOnClickListenerC35359Fia(0, enumC33364Eox, directThreadKey, enumC33420Epr, c2ee, this), i2);
        A0H.A0D(DialogInterfaceOnClickListenerC35455FkC.A00(c2ee, this, 25));
        AbstractC31178DnM.A1R(A0H, A1a);
    }
}
