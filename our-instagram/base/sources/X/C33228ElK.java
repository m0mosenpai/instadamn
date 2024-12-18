package X;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.ElK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33228ElK extends AbstractC33235ElU implements InterfaceC60122ou, C53U {
    public static final String __redex_internal_original_name = "AccountSecurityFragment";
    public Dialog A00;
    public UserSession A01;
    public C36731GHa A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = new Handler();
    public final C1P1 A09 = EV0.A00(this, 25);

    @Override // X.C53U
    public final boolean CK6() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_security";
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r5.A08 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.EDU r5, X.C33228ElK r6) {
        /*
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            if (r5 == 0) goto L16
            java.lang.String r0 = r5.A03
            r6.A05 = r0
            java.lang.String r0 = r5.A00
            r6.A03 = r0
            java.lang.String r0 = r5.A02
            r6.A04 = r0
            boolean r0 = r5.A0F
            r6.A07 = r0
        L16:
            r3 = 2131975400(0x7f135ce8, float:1.9587891E38)
            if (r5 == 0) goto L20
            boolean r0 = r5.A08
            r2 = 1
            if (r0 != 0) goto L21
        L20:
            r2 = 0
        L21:
            r0 = 30
            X.Fqd r1 = new X.Fqd
            r1.<init>(r6, r0)
            r0 = 23
            X.GHa r0 = X.C36731GHa.A03(r1, r6, r0, r3, r2)
            r6.A02 = r0
            r4.add(r0)
            androidx.fragment.app.FragmentActivity r3 = r6.getActivity()
            r2 = 217(0xd9, float:3.04E-43)
            r1 = 52
            r0 = 60
            java.lang.String r0 = X.AbstractC31182DnR.A05(r2, r1, r0)
            java.lang.String r0 = X.AbstractC63260SgI.A01(r3, r0)
            android.net.Uri r2 = X.AbstractC08820cl.A03(r0)
            r0 = 2131965052(0x7f13347c, float:1.9566903E38)
            java.lang.String r1 = r6.getString(r0)
            r0 = 2131975401(0x7f135ce9, float:1.9587893E38)
            X.AbstractC33235ElU.A07(r2, r6, r1, r4, r0)
            if (r5 == 0) goto L79
            boolean r0 = r5.A08
            if (r0 == 0) goto L79
            r0 = 2131953602(0x7f1307c2, float:1.954368E38)
            X.C31335Dq0.A03(r4, r0)
            android.content.Context r3 = r6.requireContext()
            r2 = 2131953600(0x7f1307c0, float:1.9543676E38)
            r1 = 46
            X.DuJ r0 = new X.DuJ
            r0.<init>(r1, r5, r6)
            X.AbstractC25235BEs.A1C(r3, r0, r4, r2)
            r0 = 2131953601(0x7f1307c1, float:1.9543678E38)
            X.C35246Fgf.A01(r6, r4, r0)
        L79:
            r6.setItems(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33228ElK.A00(X.EDU, X.ElK):void");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(2131965774));
        interfaceC56362iU.EkH(null, this.A06);
        interfaceC56362iU.setIsLoading(this.A06);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-139107681);
        super.onCreate(bundle);
        this.A01 = AbstractC31176DnK.A0S(this);
        C0f9.A09(1662160527, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1019084957);
        super.onPause();
        AbstractC31179DnN.A1K(this, 0);
        C0f9.A09(9862761, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-30142207);
        super.onResume();
        AbstractC31179DnN.A1K(this, 8);
        C0f9.A09(-1097043455, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int i;
        int A02 = C0f9.A02(793775239);
        super.onStart();
        Dialog dialog = this.A00;
        if (dialog != null && dialog.isShowing()) {
            i = 719474574;
        } else {
            C1ON A01 = AbstractC35177FfU.A01(getContext(), this.A01);
            A01.A00 = new EUB(this);
            schedule(A01);
            i = 1786576759;
        }
        C0f9.A09(i, A02);
    }
}
