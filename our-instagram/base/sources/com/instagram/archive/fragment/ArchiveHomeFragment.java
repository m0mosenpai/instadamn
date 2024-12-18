package com.instagram.archive.fragment;

import X.AbstractC18680vv;
import X.AbstractC25233BEq;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC43593JPy;
import X.AbstractC59962oe;
import X.C05F;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.C3DH;
import X.C3LO;
import X.C56026Otx;
import X.EnumC53243Ngg;
import X.EnumC53271Nh9;
import X.HD6;
import X.HDF;
import X.InterfaceC08430c6;
import X.InterfaceC42271xH;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.N4Y;
import X.ViewOnClickListenerC55467OkM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public class ArchiveHomeFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public InterfaceC56362iU A00;
    public EnumC53271Nh9 A01;
    public UserSession A02;
    public Fragment A03;
    public Fragment A04;
    public Fragment A05;
    public Fragment A06;
    public View mCalendarActionBarButton;
    public boolean A08 = false;
    public boolean A07 = false;
    public final InterfaceC42271xH A09 = new C56026Otx(this, 0);

    public static void A00(ArchiveHomeFragment archiveHomeFragment) {
        Fragment fragment;
        EnumC53271Nh9 enumC53271Nh9 = archiveHomeFragment.A01;
        if (enumC53271Nh9 == EnumC53271Nh9.A09) {
            fragment = archiveHomeFragment.A06;
            if (fragment == null) {
                Bundle requireArguments = archiveHomeFragment.requireArguments();
                AbstractC31173DnH.A1C(requireArguments, archiveHomeFragment.A02);
                requireArguments.putSerializable("highlight_management_source", EnumC53243Ngg.A04);
                fragment = new ArchiveReelTabbedFragment();
                fragment.setArguments(requireArguments);
                archiveHomeFragment.A06 = fragment;
            }
        } else if (enumC53271Nh9 == EnumC53271Nh9.A07) {
            fragment = archiveHomeFragment.A03;
            if (fragment == null) {
                String str = archiveHomeFragment.A02.token;
                C14360o3.A0B(str, 0);
                fragment = new HDF();
                AbstractC25233BEq.A15(fragment, "IgSessionManager.SESSION_TOKEN_KEY", str);
                archiveHomeFragment.A03 = fragment;
            }
        } else if (enumC53271Nh9 == EnumC53271Nh9.A06) {
            fragment = archiveHomeFragment.A04;
            if (fragment == null) {
                String str2 = archiveHomeFragment.A02.token;
                C14360o3.A0B(str2, 0);
                fragment = new HD6();
                AbstractC25233BEq.A15(fragment, "IgSessionManager.SESSION_TOKEN_KEY", str2);
                archiveHomeFragment.A04 = fragment;
            }
        } else if (enumC53271Nh9 == EnumC53271Nh9.A08) {
            fragment = archiveHomeFragment.A05;
            if (fragment == null) {
                String str3 = archiveHomeFragment.A02.token;
                C14360o3.A0B(str3, 0);
                fragment = new N4Y();
                AbstractC25233BEq.A15(fragment, "IgSessionManager.SESSION_TOKEN_KEY", str3);
                archiveHomeFragment.A05 = fragment;
            }
        } else {
            fragment = null;
        }
        C14240no A0F = AbstractC43593JPy.A0F(archiveHomeFragment);
        fragment.getClass();
        A0F.A0A(fragment, R.id.archive_home_fragment_container);
        A0F.A01();
        InterfaceC56362iU interfaceC56362iU = archiveHomeFragment.A00;
        if (interfaceC56362iU != null) {
            interfaceC56362iU.Efu(archiveHomeFragment.A01.A00);
            interfaceC56362iU.Efw(new ViewOnClickListenerC55467OkM(archiveHomeFragment, 7));
            interfaceC56362iU.Eka(true);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        this.A00 = interfaceC56362iU;
        this.mCalendarActionBarButton = null;
        if (interfaceC56362iU != null) {
            interfaceC56362iU.Efu(this.A01.A00);
            interfaceC56362iU.Efw(new ViewOnClickListenerC55467OkM(this, 7));
            interfaceC56362iU.Eka(true);
        }
        interfaceC56362iU.EkS(true);
        if (!this.A07) {
            boolean z = this.A08;
            C3LO A0B = AbstractC31171DnF.A0B();
            if (!z) {
                A0B.A02(C05F.A00);
                i = 5;
            } else {
                A0B.A06 = R.drawable.instagram_settings_pano_outline_24;
                A0B.A05 = 2131973348;
                i = 6;
            }
            AbstractC31176DnK.A1B(new ViewOnClickListenerC55467OkM(this, i), A0B, interfaceC56362iU);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        Fragment fragment;
        if (isAdded()) {
            fragment = getChildFragmentManager().A0O(R.id.archive_home_fragment_container);
        } else {
            fragment = null;
        }
        if (fragment instanceof AbstractC59962oe) {
            return ((AbstractC59962oe) fragment).getModuleName();
        }
        return this.A01.A02;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC08430c6 interfaceC08430c6;
        if (isAdded()) {
            interfaceC08430c6 = getChildFragmentManager().A0O(R.id.archive_home_fragment_container);
        } else {
            interfaceC08430c6 = null;
        }
        if (interfaceC08430c6 instanceof InterfaceC60072op) {
            return ((InterfaceC60072op) interfaceC08430c6).onBackPressed();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0068, code lost:
    
        if (r7 == false) goto L11;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 2050385586(0x7a3666b2, float:2.3677023E35)
            int r4 = X.C0f9.A02(r0)
            super.onCreate(r9)
            com.instagram.common.session.UserSession r0 = X.AbstractC31176DnK.A0S(r8)
            r8.A02 = r0
            X.C55197Oe4.A04(r0)
            com.instagram.common.session.UserSession r2 = r8.A02
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36319068088769442(0x81080000011ba2, double:3.031663132261981E-306)
            boolean r0 = X.AbstractC31178DnM.A1X(r3, r2, r0)
            r8.A08 = r0
            com.instagram.common.session.UserSession r2 = r8.A02
            r0 = 36319068088703905(0x81080000001ba1, double:3.031663132220535E-306)
            boolean r0 = X.AbstractC31178DnM.A1X(r3, r2, r0)
            r8.A07 = r0
            com.instagram.common.session.UserSession r0 = r8.A02
            boolean r0 = X.AbstractC70443Ed.A04(r0)
            r7 = r0 ^ 1
            com.instagram.common.session.UserSession r0 = r8.A02
            X.1Ai r3 = X.AbstractC23021Ah.A00(r0)
            X.0ry r2 = r3.A87
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 211(0xd3, float:2.96E-43)
            java.lang.Object r6 = X.AbstractC31171DnF.A0Y(r3, r2, r1, r0)
            r5 = r6
            android.os.Bundle r2 = r8.mArguments
            if (r2 == 0) goto L5d
            java.lang.String r1 = "archive_home_tab_mode"
            java.io.Serializable r0 = r2.getSerializable(r1)
            if (r0 == 0) goto L5d
            java.io.Serializable r0 = r2.getSerializable(r1)
            X.Nh9 r0 = (X.EnumC53271Nh9) r0
            java.lang.String r6 = r0.A01
            r5 = r6
        L5d:
            X.Nh9 r0 = X.EnumC53271Nh9.A08
            java.lang.String r0 = r0.A01
            boolean r0 = X.C2I7.A00(r6, r0)
            if (r0 == 0) goto L6a
            r3 = 1
            if (r7 != 0) goto L6b
        L6a:
            r3 = 0
        L6b:
            X.Nh9 r2 = X.EnumC53271Nh9.A09
            java.lang.String r1 = r2.A01
            boolean r0 = X.C2I7.A00(r6, r1)
            if (r0 == 0) goto L9a
            boolean r0 = r8.A07
            if (r0 == 0) goto L9a
        L79:
            boolean r0 = r8.A07
            if (r0 == 0) goto L81
            X.Nh9 r0 = X.EnumC53271Nh9.A07
            java.lang.String r1 = r0.A01
        L81:
            r5 = r1
        L82:
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.util.HashMap r0 = X.EnumC53271Nh9.A03
            java.lang.Object r0 = r0.get(r5)
            X.Nh9 r0 = (X.EnumC53271Nh9) r0
            if (r0 != 0) goto L91
            r0 = r2
        L91:
            r8.A01 = r0
            r0 = 644233110(0x26663796, float:7.9872613E-16)
            X.C0f9.A09(r0, r4)
            return
        L9a:
            if (r3 != 0) goto L79
            if (r6 != 0) goto L82
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.ArchiveHomeFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1307781194);
        AbstractC25651Mw.A00(this.A02).A01(this.A09, C3DH.class);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.archive_home_fragment);
        C0f9.A09(44997564, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(451334250);
        super.onDestroyView();
        this.mCalendarActionBarButton = null;
        AbstractC25651Mw.A00(this.A02).A02(this.A09, C3DH.class);
        C0f9.A09(-293445653, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A00(this);
    }
}
