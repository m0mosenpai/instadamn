package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.We3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70625We3 implements XA6 {
    public final int A00;
    public final Object A01;

    public C70625We3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.XA6
    public final void onComplete() {
        FragmentActivity requireActivity;
        UserSession session;
        String A01;
        C70399WUb A0N;
        String str;
        switch (this.A00) {
            case 0:
                C67889V0w c67889V0w = (C67889V0w) this.A01;
                String str2 = c67889V0w.A02;
                if (str2 == null) {
                    str = "previousStep";
                } else {
                    if (str2.equals(VG4.A1E.toString())) {
                        requireActivity = c67889V0w.requireActivity();
                        session = c67889V0w.A01;
                        if (session != null) {
                            A01 = ((UFE) c67889V0w.A04.getValue()).A00.A01(VG4.A1T.toString(), "update_account_spend_limit_before_prevalidation");
                            C14360o3.A07(A01);
                            A0N = AbstractC65702TsY.A0N(c67889V0w.A03);
                            AbstractC70398WUa.A00(requireActivity, session, A01, A0N.A03);
                            return;
                        }
                    } else {
                        if (!str2.equals(VG4.A1Q.toString()) && !str2.equals(VG4.A0P.toString())) {
                            return;
                        }
                        FragmentActivity requireActivity2 = c67889V0w.requireActivity();
                        UserSession userSession = c67889V0w.A01;
                        if (userSession != null) {
                            InterfaceC09390do interfaceC09390do = c67889V0w.A04;
                            String A012 = ((UFE) interfaceC09390do.getValue()).A00.A01(VG4.A1T.toString(), "update_account_spend_limit_before_boost");
                            C14360o3.A07(A012);
                            String str3 = AbstractC65702TsY.A0N(c67889V0w.A03).A03;
                            Bundle bundle = new Bundle();
                            bundle.putString("entryPoint", "instagram");
                            bundle.putString("paymentAccountID", A012);
                            bundle.putString("externalFlowID", str3);
                            AbstractC27401Ut.getInstance();
                            C64501TGn c64501TGn = new C64501TGn(userSession);
                            c64501TGn.A07 = requireActivity2.getString(2131970441);
                            c64501TGn.A00(bundle);
                            c64501TGn.A01("BillingASLDisplayIGRoute");
                            C140966Yy EqV = c64501TGn.EqV(requireActivity2);
                            EqV.A0D = false;
                            EqV.A04();
                            ((UFE) interfaceC09390do.getValue()).A01.A2A = true;
                            return;
                        }
                    }
                    str = "session";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                V12 v12 = (V12) this.A01;
                requireActivity = v12.requireActivity();
                session = v12.getSession();
                W6E w6e = v12.A04;
                if (w6e == null) {
                    str = "promoteDataFetcher";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A01 = w6e.A01(VG4.A0T.toString(), "ad_account_budget_limit_warning");
                C14360o3.A07(A01);
                A0N = AbstractC65702TsY.A0N(v12.A0T);
                AbstractC70398WUa.A00(requireActivity, session, A01, A0N.A03);
                return;
            default:
                V0Y v0y = (V0Y) this.A01;
                FragmentActivity requireActivity3 = v0y.requireActivity();
                UserSession A013 = V0Y.A01(v0y);
                String str4 = v0y.A08;
                if (str4 != null) {
                    String str5 = v0y.A0B;
                    if (str5 != null) {
                        String str6 = AbstractC65702TsY.A0N(v0y.A0G).A03;
                        Bundle A0E = AbstractC31174DnI.A0E(A013, 1);
                        A0E.putString("paymentAccountID", str4);
                        A0E.putString("wizardName", "RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION");
                        A0E.putString("placement", "ig_boost");
                        A0E.putString("paymentMethodID", str5);
                        A0E.putString("externalFlowID", str6);
                        AbstractC27401Ut.getInstance();
                        C64501TGn c64501TGn2 = new C64501TGn(A013);
                        c64501TGn2.A07 = requireActivity3.getString(2131970724);
                        c64501TGn2.A00(A0E);
                        c64501TGn2.A01("BillingWizardIGRoute");
                        c64501TGn2.EqV(requireActivity3).A04();
                        return;
                    }
                    throw new IllegalStateException("payment method ID is non-null for DD flow");
                }
                throw new IllegalStateException("ad account ID is non-null for DD flow");
        }
    }
}
