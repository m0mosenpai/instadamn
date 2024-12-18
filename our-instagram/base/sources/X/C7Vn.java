package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.7Vn, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Vn {
    public final /* synthetic */ AnonymousClass983 A00;

    public final void A01(EnumC223459tc enumC223459tc, String str, String str2, boolean z) {
        AnonymousClass983 anonymousClass983 = this.A00;
        UserSession userSession = anonymousClass983.A10;
        String A00 = A00(this);
        String A07 = AnonymousClass983.A07(anonymousClass983);
        boolean z2 = anonymousClass983.A0b instanceof MsysThreadId;
        InterfaceC60442pS interfaceC60442pS = anonymousClass983.A1Q;
        C14360o3.A0B(interfaceC60442pS, 6);
        C162337Ov.A05(enumC223459tc, null, interfaceC60442pS, userSession, A00, A07, 2, z2, z);
        int ordinal = enumC223459tc.ordinal();
        if (ordinal != 37) {
            if (ordinal != 6) {
                if (ordinal == 16) {
                    AbstractC10360h2 supportFragmentManager = anonymousClass983.A0u.requireActivity().getSupportFragmentManager();
                    C14360o3.A07(supportFragmentManager);
                    supportFragmentManager.A0r(new LRV(supportFragmentManager, this));
                    Context context = anonymousClass983.A02;
                    if (context != null) {
                        Context applicationContext = context.getApplicationContext();
                        AbstractC192798gL A02 = C192108fB.A02(null, userSession, "com.instagram.branded_content.onboarding.creator.onboarding_handler", null);
                        A02.A00(new C32382EOi(applicationContext, anonymousClass983));
                        C1GJ.A03(A02);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                C63397SjR c63397SjR = new C63397SjR(anonymousClass983.A0u.requireActivity(), userSession, C2Fb.A2c, "https://help.instagram.com/477434105621119?helpref=page_content", false);
                c63397SjR.A0E(userSession.userId);
                c63397SjR.A0S = interfaceC60442pS.getModuleName();
                c63397SjR.A0A();
                return;
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("education_notice_safety_intervention_id_arg", str);
            bundle.putString("education_notice_safety_intervention_payload_arg", str2);
            C6XJ c6xj = new C6XJ(anonymousClass983.A0u.requireActivity(), bundle, userSession, ModalActivity.class, "mwb_education_notice");
            c6xj.A0J = ModalActivity.A07;
            Context context2 = anonymousClass983.A02;
            if (context2 != null) {
                c6xj.A0C(context2);
                return;
            }
        }
        C14360o3.A0F("context");
        throw C00O.createAndThrow();
    }

    public C7Vn(AnonymousClass983 anonymousClass983) {
        this.A00 = anonymousClass983;
    }

    public static final String A00(C7Vn c7Vn) {
        C81663kb A05 = AnonymousClass983.A05(c7Vn.A00);
        if (A05 != null && !A05.CVQ() && !A05.BSD().isEmpty()) {
            return (String) A05.BSD().get(0);
        }
        return null;
    }

    public final void A02(EnumC223459tc enumC223459tc, boolean z) {
        AbstractC31602DuU kWi;
        AnonymousClass983 anonymousClass983 = this.A00;
        UserSession userSession = anonymousClass983.A10;
        String A00 = A00(this);
        String A07 = AnonymousClass983.A07(anonymousClass983);
        boolean z2 = anonymousClass983.A0b instanceof MsysThreadId;
        InterfaceC60442pS interfaceC60442pS = anonymousClass983.A1Q;
        C14360o3.A0B(interfaceC60442pS, 6);
        C162337Ov.A05(enumC223459tc, null, interfaceC60442pS, userSession, A00, A07, 3, z2, z);
        C3o9 c3o9 = anonymousClass983.A0b;
        if (c3o9 != null) {
            boolean z3 = c3o9 instanceof DirectThreadKey;
            AbstractC59962oe abstractC59962oe = anonymousClass983.A0u;
            if (z3) {
                kWi = AbstractC46919Kp0.A00(abstractC59962oe.requireActivity(), userSession);
            } else {
                kWi = new KWi(abstractC59962oe.requireActivity(), userSession);
            }
            kWi.A02(c3o9, C05F.A08);
        }
    }
}
