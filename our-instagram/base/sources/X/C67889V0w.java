package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.V0w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67889V0w extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, XA8 {
    public static final String __redex_internal_original_name = "PromoteUpdateAccountSpendLimitFragment";
    public W65 A00;
    public UserSession A01;
    public String A02;
    public final InterfaceC09390do A03 = C1XM.A00(new X31(this, 9));
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131971001);
        AbstractC31179DnN.A1G(interfaceC56362iU);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_update_account_spend_limit_view";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00db  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            java.lang.String r1 = r4.A02
            if (r1 != 0) goto L12
            java.lang.String r0 = "previousStep"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L12:
            X.VG4 r0 = X.VG4.A1E
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.equals(r0)
            r2 = 8
            if (r0 == 0) goto L77
            r0 = 2131434590(0x7f0b1c5e, float:1.8490998E38)
            X.AbstractC31172DnG.A1J(r5, r0, r3)
            r0 = 2131438765(0x7f0b2cad, float:1.8499466E38)
            X.AbstractC31172DnG.A1J(r5, r0, r2)
            r0 = 2131438697(0x7f0b2c69, float:1.8499328E38)
            android.view.View r1 = r5.requireViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131971006(0x7f134bbe, float:1.957898E38)
            r1.setText(r0)
            r0 = 2131438698(0x7f0b2c6a, float:1.849933E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131971004(0x7f134bbc, float:1.9578975E38)
        L47:
            r0.setText(r1)
        L4a:
            X.VG4 r1 = X.VG4.A1T
            X.W65 r0 = new X.W65
            r0.<init>(r5, r1)
            r4.A00 = r0
            r0.A01()
            X.W65 r2 = r4.A00
            if (r2 == 0) goto Ldb
            android.content.Context r1 = r4.requireContext()
            r0 = 2131971002(0x7f134bba, float:1.9578971E38)
            java.lang.String r0 = r1.getString(r0)
            X.AbstractC69913Vxe.A01(r4, r2, r0)
            X.W65 r1 = r4.A00
            if (r1 == 0) goto L70
            r0 = 1
            r1.A04(r0)
        L70:
            X.AbstractC65703TsZ.A1K(r4)
            super.onViewCreated(r5, r6)
            return
        L77:
            X.VG4 r0 = X.VG4.A1Q
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8f
            X.VG4 r0 = X.VG4.A0P
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4a
        L8f:
            r0 = 2131438059(0x7f0b29eb, float:1.8498034E38)
            android.view.View r0 = r5.requireViewById(r0)
            X.2iX r0 = X.AbstractC56372iV.A01(r0, r3, r3)
            android.view.View r1 = r0.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            X.0do r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            X.UFE r0 = (X.UFE) r0
            com.instagram.business.promote.model.PromoteData r0 = r0.A01
            com.instagram.common.typedurl.ImageUrl r0 = r0.A11
            X.C14360o3.A06(r0)
            r1.setUrl(r0, r4)
            r0 = 2131438765(0x7f0b2cad, float:1.8499466E38)
            X.AbstractC31172DnG.A1J(r5, r0, r3)
            r0 = 2131434590(0x7f0b1c5e, float:1.8490998E38)
            X.AbstractC31172DnG.A1J(r5, r0, r2)
            r0 = 2131438697(0x7f0b2c69, float:1.8499328E38)
            android.view.View r1 = r5.requireViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131971005(0x7f134bbd, float:1.9578977E38)
            r1.setText(r0)
            r0 = 2131438698(0x7f0b2c6a, float:1.849933E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131971003(0x7f134bbb, float:1.9578973E38)
            goto L47
        Ldb:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67889V0w.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str = this.A02;
        if (str == null) {
            C14360o3.A0F("previousStep");
            throw C00O.createAndThrow();
        }
        if (str.equals(VG4.A1E.toString())) {
            ((UFE) this.A04.getValue()).A01.A2x = true;
            C70399WUb A0N = AbstractC65702TsY.A0N(this.A03);
            if (A0N != null) {
                A0N.A0G(VG4.A1D, "cancel_button");
            }
            AbstractC25227BEk.A1B(this);
            return false;
        }
        return false;
    }

    public C67889V0w() {
        X31 x31 = new X31(this, 13);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X31(new X31(this, 10), 11));
        this.A04 = new C60842q8(new X31(A00, 12), x31, new C57253Pbb(18, null, A00), new C0YZ(UFE.class));
    }

    @Override // X.XA8
    public final void CuW() {
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = this.A01;
        if (userSession != null) {
            W6f.A02(requireActivity, new C70625We3(this, 0), userSession, true);
        } else {
            C14360o3.A0F("session");
            throw C00O.createAndThrow();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-337398522);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString(OptSvcAnalyticsStore.LOGGING_KEY_STEP);
            if (string != null) {
                this.A02 = string;
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(989727707, A02);
                throw A0g;
            }
        }
        this.A01 = ((UFE) this.A04.getValue()).A01.A0y;
        C0f9.A09(553764036, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1038611858);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_update_account_spend_limit_view, viewGroup, false);
        C0f9.A09(-1804638645, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-93126396);
        super.onDestroyView();
        C0f9.A09(-2013533565, A02);
    }
}
