package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.C2c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27277C2c extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DonationOptionsFragment";
    public UserSession A00;
    public C1GL A01;
    public User A02;
    public boolean A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "donation_settings";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i = 2131954411;
        if (this.A03) {
            i = 2131954415;
        }
        AbstractC25229BEm.A1G(interfaceC56362iU, i);
    }

    public static ArrayList A00(C27277C2c c27277C2c) {
        ArrayList A1E = AbstractC166987dD.A1E();
        int i = 2131954410;
        if (c27277C2c.A03) {
            i = 2131954423;
        }
        A1E.add(new C36731GHa(new C28693Clf(c27277C2c, 3), i, AbstractC167007dF.A1T(c27277C2c.A02.A03.BB1())));
        int i2 = 2131954409;
        if (c27277C2c.A03) {
            i2 = 2131954422;
        }
        A1E.add(new C35246Fgf(c27277C2c.getString(i2)));
        return A1E;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(916069966);
        super.onCreate(bundle);
        this.A00 = AbstractC166987dD.A0r(AbstractC60492pY.A02(this));
        this.A01 = C1GJ.A01();
        this.A02 = AbstractC166987dD.A10(this.A00);
        this.A03 = AbstractC166997dE.A0c(C06090Tz.A06, this.A00, 36313849703434511L).booleanValue();
        C0f9.A09(453372704, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1981996584);
        super.onResume();
        setItems(A00(this));
        C0f9.A09(-1781490095, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        setItems(A00(this));
        UserSession userSession = this.A00;
        Boolean BB1 = this.A02.A03.BB1();
        if (BB1 != null && BB1.booleanValue()) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("profile_fundraiser_initial_state", str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, userSession), "ig_cg_view_donation_settings");
        A0f.A9M("attributes", A1G);
        A0f.Cht();
    }
}
