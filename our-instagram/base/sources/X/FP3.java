package X;

import android.R;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public abstract class FP3 {
    public static final FP3 A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, X.Etf] */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.0iw, androidx.fragment.app.Fragment, X.2oe] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.FP3] */
    public final void A00(AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, InterfaceC37225Gaa interfaceC37225Gaa, InterfaceC37104GWp interfaceC37104GWp, EnumC31713DwI enumC31713DwI) {
        Object obj;
        C1ON A0U;
        C1P1 c32971Efc;
        boolean z;
        if (this instanceof EgX) {
            EgX egX = (EgX) this;
            EgQ egQ = (EgQ) interfaceC37225Gaa;
            AtomicReference atomicReference = egQ.A02;
            Object obj2 = atomicReference.get();
            obj2.getClass();
            int ordinal = ((EnumC33323EoI) obj2).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        C193328hC A0c = AbstractC31176DnK.A0c(abstractC59962oe);
                        A0c.A09(2131961882);
                        AbstractC31176DnK.A17(null, A0c, R.string.ok);
                        return;
                    }
                    return;
                }
            } else if (egX.A00 == null) {
                C67858Uzp c67858Uzp = new C67858Uzp();
                ?? obj3 = new Object();
                obj3.A00 = abstractC59962oe;
                obj3.A01 = c67858Uzp;
                egX.A00 = obj3;
                obj3.A01();
            }
            C35881Fsv c35881Fsv = new C35881Fsv(abstractC59962oe, c07270a1, interfaceC37227Gac, interfaceC37104GWp, egX);
            synchronized (atomicReference) {
                z = true;
                if (atomicReference.get() == EnumC33323EoI.PENDING) {
                    z = false;
                    egQ.A01.add(c35881Fsv);
                }
            }
            if (!z) {
                return;
            }
            c35881Fsv.apply(egQ);
            return;
        }
        if (this instanceof EgV) {
            EgN egN = (EgN) interfaceC37225Gaa;
            AbstractC167017dG.A1N(c07270a1, egN);
            C14360o3.A0B(enumC31713DwI, 3);
            Context requireContext = abstractC59962oe.requireContext();
            C83803oP c83803oP = egN.A00;
            A0U = AbstractC35276FhB.A04(requireContext, c07270a1, c83803oP.A05, c83803oP.A06, c83803oP.A02());
            c32971Efc = new C32990Efw(abstractC59962oe, c07270a1, interfaceC37227Gac, interfaceC37104GWp, enumC31713DwI, c83803oP.A07, c83803oP.A06);
        } else if (this instanceof EgU) {
            EgO egO = (EgO) interfaceC37225Gaa;
            boolean A1a = AbstractC167017dG.A1a(c07270a1, egO);
            C14360o3.A0B(enumC31713DwI, 3);
            C6WQ c6wq = new C6WQ(abstractC59962oe.requireContext(), A1a);
            c6wq.A00(abstractC59962oe.getString(2131965724));
            Context requireContext2 = abstractC59962oe.requireContext();
            String str = egO.A01;
            String str2 = egO.A00.A0G;
            C25621Ms A0c2 = AbstractC167017dG.A0c(c07270a1);
            A0c2.A0B("accounts/google_token_login/");
            AbstractC31178DnM.A0n(requireContext2, A0c2, AbstractC31189DnY.A02(), C16030qx.A00(requireContext2));
            A0c2.A9s("nonce", str);
            AbstractC31171DnF.A1J(A0c2, str2);
            AbstractC31175DnJ.A1J(A0c2);
            A0U = AbstractC31172DnG.A0U(A0c2, A1a);
            c32971Efc = new C32971Efc(AbstractC31525Dt9.A01(abstractC59962oe), abstractC59962oe.getActivity(), abstractC59962oe, c07270a1, interfaceC37227Gac, interfaceC37104GWp, c6wq, enumC31713DwI, C05F.A00);
        } else {
            if (this instanceof EgW) {
                EgP egP = (EgP) interfaceC37225Gaa;
                AbstractC167017dG.A1N(c07270a1, egP);
                ((EgW) this).A00.A0A(C4JK.A00, AbstractC31174DnI.A0J("login_username_prefill"), c07270a1, egP.A02, egP.A01, egP.A00.A0G, null);
                return;
            }
            AbstractC167017dG.A1N(c07270a1, interfaceC37225Gaa);
            C14360o3.A0B(enumC31713DwI, 3);
            Class<?> cls = interfaceC37225Gaa.getClass();
            if (C14360o3.A0K(cls, EgP.class)) {
                obj = new EgW(new EVQ(abstractC59962oe, abstractC59962oe, c07270a1, null, enumC31713DwI, null));
            } else if (C14360o3.A0K(cls, EgO.class)) {
                obj = new Object();
            } else if (C14360o3.A0K(cls, EgN.class)) {
                obj = new Object();
            } else if (C14360o3.A0K(cls, EgQ.class)) {
                obj = new Object();
            } else {
                throw AbstractC166997dE.A0g();
            }
            obj.A00(abstractC59962oe, c07270a1, interfaceC37227Gac, interfaceC37225Gaa, interfaceC37104GWp, enumC31713DwI);
            return;
        }
        A0U.A00 = c32971Efc;
        abstractC59962oe.schedule(A0U);
    }
}
