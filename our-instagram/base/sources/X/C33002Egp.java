package X;

import android.content.Context;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Egp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33002Egp extends AbstractC36003Fv1 implements InterfaceC11380iw, InterfaceC37264GbH {
    public static final C35036Fc9 A03 = new Object();
    public static final HashMap A04 = AbstractC166987dD.A1G();
    public static final String __redex_internal_original_name = "OnboardingControllerBusinessLogic";
    public boolean A00;
    public final Context A01;
    public final AbstractC12990ll A02;

    public final void A03(UserSession userSession, C35781FrJ c35781FrJ, EnumC33445EqI enumC33445EqI) {
        if (C18U.A06(C06090Tz.A06, userSession, 36317689404265941L) && !this.A00) {
            super.A02(new C33010Egx(c35781FrJ, enumC33445EqI), false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.FN1] */
    @Override // X.AbstractC36003Fv1, X.InterfaceC37264GbH
    public final void CnE(int i) {
        List<AbstractC34718FRf> A1E;
        String str;
        C35781FrJ c35781FrJ = (C35781FrJ) this.A03;
        UserSession userSession = c35781FrJ.A00;
        if (userSession != null && i != -2 && i != -1) {
            AbstractC34718FRf abstractC34718FRf = super.A00;
            if (abstractC34718FRf == null || (str = ((EnumC33522Erv) abstractC34718FRf.A00).name()) == null) {
                str = "";
            }
            String valueOf = String.valueOf(i);
            double A01 = AbstractC31171DnF.A01();
            double A00 = AbstractC31171DnF.A00();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "nux_step_completed");
            if (A0f.isSampled()) {
                AbstractC31177DnL.A1B(A0f, A01, A00);
                AbstractC31178DnM.A19(A0f, str);
                AbstractC31176DnK.A1K(A0f, A01);
                AbstractC31177DnL.A1G(A0f, "module", "waterfall_log_in", A00);
                A0f.AAP(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, valueOf);
                AbstractC35274Fh9.A0D(A0f, "extra", null);
                A0f.Cht();
            }
        }
        super.CnE(i);
        UserSession userSession2 = c35781FrJ.A00;
        if (userSession2 != null) {
            C3BI c3bi = new C3BI(userSession2);
            AbstractC34714FQz abstractC34714FQz = super.A01;
            int i2 = abstractC34714FQz.A00;
            if (i2 <= 0) {
                i2 = 0;
            }
            List list = abstractC34714FQz.A01;
            if (i2 < list.size()) {
                A1E = list.subList(i2, list.size());
            } else {
                A1E = AbstractC166987dD.A1E();
            }
            EnumC33445EqI enumC33445EqI = c35781FrJ.A01;
            if (A1E != null && !A1E.isEmpty() && enumC33445EqI != null) {
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (AbstractC34718FRf abstractC34718FRf2 : A1E) {
                    A1E2.add(new C34954Fae((EnumC33522Erv) abstractC34718FRf2.A00, abstractC34718FRf2.A01));
                }
                ?? obj = new Object();
                obj.A04 = A1E2;
                obj.A01 = enumC33445EqI;
                obj.A03 = 0;
                try {
                    C23031Ai c23031Ai = c3bi.A01;
                    AbstractC31171DnF.A1S(c23031Ai, FWP.A00(obj), c23031Ai.A7B, C23031Ai.A8c, 251);
                    return;
                } catch (IOException e) {
                    C0w9.A07("Onboarding Persistence Failure", e);
                    c3bi.A00();
                    return;
                }
            }
            c3bi.A00();
        }
    }

    public C33002Egp(Context context, AbstractC12990ll abstractC12990ll, C35781FrJ c35781FrJ, AbstractC34714FQz abstractC34714FQz) {
        super(abstractC34714FQz, c35781FrJ);
        this.A02 = abstractC12990ll;
        this.A01 = AbstractC166987dD.A0O(context);
    }

    @Override // X.AbstractC36003Fv1
    public final void A02(AbstractC34714FQz abstractC34714FQz, boolean z) {
        super.A02(abstractC34714FQz, z);
        this.A00 = true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "nux_controller_business_logic";
    }
}
