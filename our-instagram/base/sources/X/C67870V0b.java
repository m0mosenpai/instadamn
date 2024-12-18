package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;

/* renamed from: X.V0b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67870V0b extends AbstractC59962oe implements InterfaceC60122ou, XAF {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsFragment";
    public ViewPager A00;
    public TabLayout A01;
    public C70399WUb A02;
    public W6E A03;
    public FRW A04;
    public PromoteData A05;
    public PromoteState A06;
    public UserSession A07;
    public SpinnerImageView A08;
    public boolean A09;
    public WDA A0A;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006c  */
    @Override // X.XAF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dc7(com.instagram.business.promote.model.PromoteState r10, java.lang.Integer r11) {
        /*
            r9 = this;
            r0 = 1
            X.C14360o3.A0B(r11, r0)
            java.lang.Integer r0 = X.C05F.A1I
            java.lang.String r8 = "actionBarButtonController"
            java.lang.String r5 = "Required value was null."
            java.lang.String r7 = "audiencePotentialReachController"
            r3 = 0
            java.lang.String r6 = "promoteData"
            if (r11 != r0) goto L3a
            com.instagram.business.promote.model.PromoteData r0 = r9.A05
            if (r0 == 0) goto L87
            com.instagram.business.promote.model.PendingLocation r1 = r0.A0o
            java.util.List r4 = r1.A05
            java.util.ArrayList r0 = X.AbstractC001800i.A0U(r4)
            r1.A04 = r0
            X.WDA r2 = r9.A0A
            if (r2 == 0) goto L83
            boolean r1 = r9.A09
            com.instagram.business.promote.model.PromoteData r0 = r9.A05
            if (r1 == 0) goto L35
            if (r0 == 0) goto L87
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0p
        L2d:
            if (r0 != 0) goto L8b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L35:
            if (r0 == 0) goto L87
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            goto L2d
        L3a:
            java.lang.Integer r0 = X.C05F.A02
            if (r11 != r0) goto Lb5
            com.instagram.business.promote.model.PromoteData r0 = r9.A05
            if (r0 == 0) goto L87
            com.instagram.business.promote.model.PendingLocation r1 = r0.A0o
            boolean r0 = r1.A00()
            if (r0 == 0) goto L80
            com.instagram.business.promote.model.AudienceGeoLocation r1 = r1.A01
        L4c:
            if (r1 != 0) goto L77
            X.0sl r4 = X.C16930sl.A00
        L50:
            com.instagram.business.promote.model.PromoteData r0 = r9.A05
            if (r0 == 0) goto L87
            com.instagram.business.promote.model.PendingLocation r1 = r0.A0o
            java.util.ArrayList r0 = X.AbstractC001800i.A0U(r4)
            r1.A04 = r0
            X.WDA r2 = r9.A0A
            if (r2 == 0) goto L83
            boolean r1 = r9.A09
            com.instagram.business.promote.model.PromoteData r0 = r9.A05
            if (r1 == 0) goto L72
            if (r0 == 0) goto L87
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0p
        L6a:
            if (r0 != 0) goto L8b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L72:
            if (r0 == 0) goto L87
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            goto L6a
        L77:
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.A07
            r1.A03 = r0
            java.util.List r4 = X.AbstractC166987dD.A1J(r1)
            goto L50
        L80:
            com.instagram.business.promote.model.AudienceGeoLocation r1 = r1.A02
            goto L4c
        L83:
            X.C14360o3.A0F(r7)
            goto La3
        L87:
            X.C14360o3.A0F(r6)
            goto La3
        L8b:
            X.Vsq r1 = X.AbstractC68446VRc.A00(r0)
            java.util.ArrayList r0 = X.AbstractC001800i.A0U(r4)
            r1.A07 = r0
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r1.A00()
            r2.A02(r0)
            X.FRW r1 = r9.A04
            if (r1 != 0) goto La8
            X.C14360o3.A0F(r8)
        La3:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        La8:
            boolean r0 = r9.A09
            if (r0 != 0) goto Lb6
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lb6
        Lb2:
            r1.A01(r3)
        Lb5:
            return
        Lb6:
            r3 = 1
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67870V0b.Dc7(com.instagram.business.promote.model.PromoteState, java.lang.Integer):void");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970516);
        AbstractC31179DnN.A1G(interfaceC56362iU);
        boolean z = true;
        interfaceC56362iU.EkS(true);
        FRW frw = new FRW(requireContext(), interfaceC56362iU);
        this.A04 = frw;
        WNT.A01(frw, C05F.A1F, this, 16);
        FRW frw2 = this.A04;
        if (frw2 == null) {
            str = "actionBarButtonController";
        } else {
            if (!this.A09) {
                PromoteData promoteData = this.A05;
                if (promoteData == null) {
                    str = "promoteData";
                } else if (promoteData.A0o.A04.isEmpty()) {
                    z = false;
                }
            }
            frw2.A01(z);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_create_audience_locations";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r2 = 0
            X.C14360o3.A0B(r9, r2)
            super.onViewCreated(r9, r10)
            r0 = 2131435744(0x7f0b20e0, float:1.8493339E38)
            android.view.View r0 = r9.requireViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r8.A00 = r0
            r0 = 2131435743(0x7f0b20df, float:1.8493337E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            r8.A01 = r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = X.AbstractC31180DnO.A0V(r9)
            r8.A08 = r0
            boolean r0 = r8.A09
            java.lang.String r7 = "promoteData"
            if (r0 == 0) goto Lad
            com.instagram.business.promote.model.PromoteData r1 = r8.A05
            if (r1 == 0) goto Lb3
            java.util.List r0 = r1.A1m
            boolean r0 = X.AbstractC83893oY.A00(r0)
            if (r0 != 0) goto Lad
            java.util.List r0 = r1.A1m
            java.lang.Object r0 = r0.get(r2)
            com.instagram.business.promote.model.PromoteAudience r0 = (com.instagram.business.promote.model.PromoteAudience) r0
            java.util.List r0 = r0.A09
            boolean r0 = X.AbstractC83893oY.A00(r0)
            if (r0 != 0) goto Lad
            java.lang.String r6 = "ads/promote/audience_edit_screen_v2/"
            int r0 = r6.length()
            int r0 = r0 + (-1)
            java.lang.String r2 = X.AbstractC65702TsY.A0V(r0, r6)
            X.WUb r1 = r8.A02
            r0 = 3
            X.V26 r5 = new X.V26
            r5.<init>(r1, r8, r2, r0)
            X.W6E r4 = r8.A03
            if (r4 == 0) goto Lb1
            com.instagram.common.session.UserSession r1 = r4.A08
            com.instagram.business.promote.model.PromoteData r0 = r4.A03
            java.lang.String r3 = r0.A1A
            X.1Ms r2 = X.AbstractC31173DnH.A0M(r1)
            r2.A0B(r6)
            com.instagram.api.schemas.BoostedPostAudienceOption r0 = com.instagram.api.schemas.BoostedPostAudienceOption.A0K
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "audience_type"
            r2.A9s(r0, r1)
            java.lang.String r1 = "audience_id"
            java.lang.String r0 = "0"
            r2.A9s(r1, r0)
            java.lang.String r0 = "fb_auth_token"
            r2.A9s(r0, r3)
            java.lang.Class<com.instagram.business.promote.model.PromoteAudienceInfo> r1 = com.instagram.business.promote.model.PromoteAudienceInfo.class
            java.lang.Class<X.Vxh> r0 = X.C69916Vxh.class
            X.1ON r1 = X.AbstractC31172DnG.A0S(r2, r1, r0)
            r1.A00 = r5
            X.2ry r0 = r4.A07
            r0.schedule(r1)
        L90:
            X.VG4 r3 = X.VG4.A0z
            r0 = 2131428248(0x7f0b0398, float:1.8478135E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r9, r0)
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            com.instagram.business.promote.model.PromoteData r5 = r8.A05
            if (r5 == 0) goto Lb3
            X.W6E r4 = r8.A03
            if (r4 == 0) goto Lb1
            X.WDA r0 = new X.WDA
            r0.<init>(r1, r2, r3, r4, r5)
            r8.A0A = r0
            return
        Lad:
            A00(r8)
            goto L90
        Lb1:
            java.lang.String r7 = "dataFetcher"
        Lb3:
            X.C14360o3.A0F(r7)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67870V0b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final boolean A01() {
        PromoteData promoteData = this.A05;
        if (promoteData != null) {
            PendingLocation pendingLocation = promoteData.A0o;
            if (pendingLocation.A02 == null && pendingLocation.A05.isEmpty()) {
                PromoteData promoteData2 = this.A05;
                if (promoteData2 != null) {
                    if (promoteData2.A0o.A01 == null) {
                        return true;
                    }
                }
            }
            return false;
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A07;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r1.A07 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        r3 = r1.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r2 = r2.A0o;
        r0 = X.VZI.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (X.C70179WFe.A04(r3) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r2.A02 = (com.instagram.business.promote.model.AudienceGeoLocation) r3.get(0);
        r2.A00 = ((com.instagram.business.promote.model.AudienceGeoLocation) r3.get(0)).A02;
        r2.A03 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f2, code lost:
    
        r2.A05 = new java.util.ArrayList(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
    
        if (r1.A07 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.UF6, X.08i, X.0h1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C67870V0b r6) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67870V0b.A00(X.V0b):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        boolean z;
        int A02 = C0f9.A02(-146578689);
        super.onCreate(bundle);
        this.A05 = InterfaceC72021XFj.A00(this);
        PromoteState A00 = XFZ.A00(this);
        this.A06 = A00;
        A00.A0A(this);
        PromoteData promoteData = this.A05;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            UserSession userSession = promoteData.A0y;
            this.A07 = userSession;
            if (userSession != null) {
                this.A03 = new W6E(requireActivity(), this, userSession);
                UserSession userSession2 = this.A07;
                if (userSession2 != null) {
                    this.A02 = C70399WUb.A00(userSession2);
                    Bundle bundle2 = this.mArguments;
                    if (bundle2 != null) {
                        z = bundle2.getBoolean("is_automatic_audience");
                    } else {
                        z = false;
                    }
                    this.A09 = z;
                    C0f9.A09(-1653895911, A02);
                    return;
                }
            }
            str = "session";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1368365844);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_create_audience_locations_view, false);
        C0f9.A09(614387154, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        int A02 = C0f9.A02(355003823);
        super.onDestroy();
        PromoteState promoteState = this.A06;
        if (promoteState == null) {
            str = "promoteState";
        } else {
            promoteState.A0B(this);
            PromoteData promoteData = this.A05;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                PendingLocation pendingLocation = promoteData.A0o;
                pendingLocation.A05 = new ArrayList();
                pendingLocation.A00 = 5;
                pendingLocation.A01 = null;
                pendingLocation.A02 = null;
                pendingLocation.A03 = null;
                pendingLocation.A04 = new ArrayList();
                C0f9.A09(-208524286, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1102927375);
        super.onDestroyView();
        this.A02 = null;
        WDA wda = this.A0A;
        if (wda == null) {
            C14360o3.A0F("audiencePotentialReachController");
            throw C00O.createAndThrow();
        }
        wda.A0A.A00();
        wda.A00 = C70121W4x.A01;
        C0f9.A09(-1548855665, A02);
    }
}
