package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.ElM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33229ElM extends AbstractC33235ElU implements InterfaceC11380iw, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ManageSavedLoginFragment";
    public UserSession A00;
    public String A01;
    public boolean A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "manage_saved_login";
    }

    public static void A00(C33229ElM c33229ElM) {
        EV0 A00 = EV0.A00(c33229ElM, 30);
        C1ON A09 = AbstractC35276FhB.A09(c33229ElM.requireContext(), c33229ElM.A00, AbstractC166997dE.A0b());
        A09.A00 = A00;
        c33229ElM.schedule(A09);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (r1.equals("consented") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C33229ElM r9) {
        /*
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            com.instagram.common.session.UserSession r0 = r9.A00
            java.lang.String r8 = r0.userId
            X.253 r1 = X.AnonymousClass252.A00(r0)
            java.lang.String r0 = "ManageSavedLoginFragment"
            com.facebook.common.callercontext.CallerContext.A02(r0)
            boolean r7 = r1.A01
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r5 = 2131972758(0x7f135296, float:1.9582533E38)
            com.instagram.common.session.UserSession r0 = r9.A00
            X.3oJ r0 = X.C83743oJ.A01(r0)
            boolean r3 = r0.A0K(r8)
            r0 = 31
            X.Fqd r2 = new X.Fqd
            r2.<init>(r9, r0)
            X.G9D r1 = new X.G9D
            r1.<init>(r9, r6, r8)
            X.GHa r0 = new X.GHa
            r0.<init>(r2, r1, r5, r3)
            r4.add(r0)
            r0 = 2131972757(0x7f135295, float:1.958253E38)
            if (r7 == 0) goto L40
            r0 = 2131952990(0x7f13055e, float:1.9542438E38)
        L40:
            X.C35246Fgf.A01(r9, r4, r0)
            com.instagram.common.session.UserSession r3 = r9.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36315129603689508(0x81046b00000c24, double:3.029172418438424E-306)
            boolean r0 = X.AbstractC31178DnM.A1X(r2, r3, r0)
            if (r0 == 0) goto L80
            r3 = 2131972768(0x7f1352a0, float:1.9582553E38)
            java.lang.String r1 = r9.A01
            if (r1 == 0) goto L62
            java.lang.String r0 = "consented"
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L63
        L62:
            r2 = 0
        L63:
            r0 = 32
            X.Fqd r1 = new X.Fqd
            r1.<init>(r9, r0)
            r0 = 24
            X.GHa r0 = X.C36731GHa.A03(r1, r9, r0, r3, r2)
            r4.add(r0)
            boolean r1 = r9.A02
            r0 = 2131972766(0x7f13529e, float:1.9582549E38)
            if (r1 == 0) goto L7d
            r0 = 2131972767(0x7f13529f, float:1.958255E38)
        L7d:
            X.C35246Fgf.A01(r9, r4, r0)
        L80:
            r9.setItems(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33229ElM.A01(X.ElM):void");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Ehk(AbstractC166997dE.A0N(this).getString(2131966019));
        interfaceC56362iU.EkS(true);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-7482423);
        super.onCreate(bundle);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A00 = A0S;
        if (C18U.A06(C06090Tz.A06, A0S, 36315129603689508L)) {
            C47989LJs.A00.A02(this.A00, "manage_saved_login", "client_del_setting_opt_out_shown");
            A00(this);
        } else {
            A01(this);
        }
        C0f9.A09(541545386, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1210327061);
        super.onResume();
        if (AbstractC31178DnM.A1X(C06090Tz.A06, this.A00, 36315129603689508L)) {
            A00(this);
        } else {
            A01(this);
        }
        C0f9.A09(691635260, A02);
    }
}
