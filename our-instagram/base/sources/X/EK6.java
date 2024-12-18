package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class EK6 extends AbstractC59962oe implements InterfaceC60112ot, InterfaceC1571373s, GYM, GWV {
    public static final String __redex_internal_original_name = "DiscoverPeopleFragment";
    public boolean A00;
    public boolean A01;
    public GZY A02;
    public final InterfaceC41501vz A05 = C31650DvG.A00(this, 42);
    public final InterfaceC41501vz A06 = C31650DvG.A00(this, 43);
    public boolean A03 = true;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final boolean A07 = true;

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return false;
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        this.A03 = false;
        C28301Yr A00 = AbstractC34213F7l.A00();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A04);
        GZY gzy = this.A02;
        if (gzy == null) {
            C14360o3.A0F("linkingCallback");
            throw C00O.createAndThrow();
        }
        A00.A01(this, A0o, gzy).A06(AbstractC31172DnG.A16(Locale.ROOT, "IG_FB_DISCOVER_ACCOUNTS"), null);
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC35666Fp0(this, 66), AbstractC31174DnI.A0K(), interfaceC56362iU);
        String string = requireArguments().getString("ExplorePeopleFragment.ARGUMENT_TYPE");
        String string2 = requireArguments().getString("ExplorePeopleFragment.ARGUMENT_FRAGMENT_TITLE");
        if ("suggested_businesses".equals(string) && string2 != null && string2.length() != 0) {
            interfaceC56362iU.setTitle(string2);
        } else {
            interfaceC56362iU.Efu(2131960982);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "discover_people";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.GYM
    public final void CK9() {
        C28301Yr A00 = AbstractC34213F7l.A00();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A04);
        GZY gzy = this.A02;
        if (gzy == null) {
            C14360o3.A0F("linkingCallback");
            throw C00O.createAndThrow();
        }
        A00.A01(this, A0o, gzy).A06(AbstractC31172DnG.A16(Locale.ROOT, "IG_FB_DISCOVER_ACCOUNTS"), null);
    }

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return this.A07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (X.AbstractC31174DnI.A1a(X.EnumC33444EqG.A0I, r2) != false) goto L8;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -522974507(0xffffffffe0d40ad5, float:-1.2223407E20)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r5)
            r1 = 1
            X.GJd r0 = new X.GJd
            r0.<init>(r1)
            r4.A02 = r0
            android.os.Bundle r1 = r4.requireArguments()
            r0 = 84
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            r4.A00 = r0
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_ENTRY_POINT"
            java.lang.String r2 = r1.getString(r0)
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "ExplorePeopleFragment.ARGUMENT_TYPE"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "suggested_businesses"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            X.EqG r0 = X.EnumC33444EqG.A0L
            boolean r0 = X.AbstractC31174DnI.A1a(r0, r2)
            if (r0 != 0) goto L4f
            X.EqG r0 = X.EnumC33444EqG.A0I
            boolean r1 = X.AbstractC31174DnI.A1a(r0, r2)
            r0 = 0
            if (r1 == 0) goto L50
        L4f:
            r0 = 1
        L50:
            r4.A01 = r0
            X.0h2 r0 = r4.getChildFragmentManager()
            X.0no r2 = new X.0no
            r2.<init>(r0)
            r1 = 2131430695(0x7f0b0d27, float:1.8483098E38)
            android.os.Bundle r0 = r4.requireArguments()
            X.ENa r0 = X.F7G.A00(r0)
            r2.A09(r0, r1)
            r2.A00()
            r0 = 318876957(0x1301ad1d, float:1.636744E-27)
            X.C0f9.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EK6.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-569786789);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_discover_people, viewGroup, false);
        C0f9.A09(-1598141473, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1678797001);
        super.onPause();
        if (this.A03) {
            AbstractC31179DnN.A1J(this, 0);
        }
        C0f9.A09(-1907500723, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(513274251);
        super.onResume();
        this.A03 = true;
        AbstractC31179DnN.A1J(this, 8);
        if (!this.A01) {
            Context requireContext = requireContext();
            InterfaceC09390do interfaceC09390do = this.A04;
            if (C54P.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do))) {
                C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                InterfaceC19630xq interfaceC19630xq = A0l.A01;
                String A00 = AbstractC111324zv.A00(489);
                int i = interfaceC19630xq.getInt(A00, 0);
                long millis = TimeUnit.HOURS.toMillis(24L);
                if (i < 6) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String A002 = AbstractC111324zv.A00(464);
                    if (currentTimeMillis - AbstractC31175DnJ.A03(interfaceC19630xq, A002) >= millis || this.A00) {
                        this.A00 = false;
                        A0l.A1R(true);
                        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                        ARD.E7G(A002, currentTimeMillis);
                        ARD.apply();
                        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                        ARD2.E7G("last_time_seen_contact_import_weekly_upsell", currentTimeMillis);
                        ARD2.apply();
                        AbstractC167007dF.A18(interfaceC19630xq, A00, i + 1);
                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                        Fragment fragment = this.mParentFragment;
                        if (fragment == null) {
                            fragment = this;
                        }
                        C35233FgQ c35233FgQ = new C35233FgQ(fragment, this, A0r, null, null);
                        EnumC33444EqG enumC33444EqG = EnumC33444EqG.A05;
                        c35233FgQ.A05(null, enumC33444EqG, false, true, false);
                        new C147036jf(this, AbstractC166987dD.A0r(interfaceC09390do)).A01(false, null, enumC33444EqG.toString());
                    }
                }
            }
        }
        C0f9.A09(1115096063, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-958773003);
        super.onStart();
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A04);
        A0Q.A01(this.A05, C36062Fvy.class);
        A0Q.A01(this.A06, C36073Fw9.class);
        C0f9.A09(607649755, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-939759594);
        super.onStop();
        C25671My A0Q = AbstractC31176DnK.A0Q(this.A04);
        A0Q.A02(this.A05, C36062Fvy.class);
        A0Q.A02(this.A06, C36073Fw9.class);
        C0f9.A09(-1953177401, A02);
    }
}
