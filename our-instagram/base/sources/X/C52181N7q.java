package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.N7q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52181N7q extends AbstractC43842Ja5 implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou {
    public static final String A08 = C52181N7q.class.getName();
    public static final String __redex_internal_original_name = "VideoAdvancedSettingsFragment";
    public OAL A00;
    public C23031Ai A01;
    public C196208mB A02;
    public C25671My A03;
    public InterfaceC41501vz A04;
    public InterfaceC41501vz A05;
    public final InterfaceC09390do A07 = C57551PgP.A00(this, new C57551PgP(this, 6), new C57251PbZ(33, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 7);
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_upload_adv_settings";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0B(A02(this));
    }

    public static final IGTVUploadViewModel A01(C52181N7q c52181N7q) {
        return MSW.A0b(c52181N7q.A07);
    }

    public static void A03(View.OnClickListener onClickListener, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C56090OvA(onClickListener, i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new Object(), new Object(), new Object(), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57639Php.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        MSW.A0b(this.A07).A04(this, C52528NMa.A00);
        return false;
    }

    public static OER A00(C52181N7q c52181N7q) {
        return ((OES) A01(c52181N7q).A0I.getValue()).A02;
    }

    public static final ArrayList A02(C52181N7q c52181N7q) {
        String A0v;
        ArrayList A1E = AbstractC166987dD.A1E();
        ViewOnClickListenerC55445Oju viewOnClickListenerC55445Oju = ViewOnClickListenerC55445Oju.A00;
        A03(viewOnClickListenerC55445Oju, A1E, 2131964243);
        if (!A00(c52181N7q).A06 && A00(c52181N7q).A03) {
            A1E.add(new C56100OvK(ViewOnClickListenerC55455Ok9.A00(c52181N7q, 29), null, 2131964188));
        }
        A1E.add(new C56100OvK(ViewOnClickListenerC55455Ok9.A00(c52181N7q, 30), null, 2131964189));
        A1E.add(new C56101OvL(2131964244, null));
        InterfaceC09390do interfaceC09390do = c52181N7q.A07;
        MSW.A0b(interfaceC09390do).A0I.getValue();
        A03(viewOnClickListenerC55445Oju, A1E, 2131964174);
        A1E.add(new C56107OvR(new P3T(c52181N7q, 32), 2131964255, MSW.A0b(interfaceC09390do).A0M.A0R, true));
        if (!A00(c52181N7q).A06 && A00(c52181N7q).A01) {
            A03(viewOnClickListenerC55445Oju, A1E, 2131964169);
            ViewOnClickListenerC55455Ok9 A00 = ViewOnClickListenerC55455Ok9.A00(c52181N7q, 32);
            InterfaceC09390do interfaceC09390do2 = c52181N7q.A06;
            interfaceC09390do2.getValue();
            A1E.add(new C56100OvK(A00, AbstractC55150OdD.A00(c52181N7q.requireContext(), MSW.A0b(interfaceC09390do).A0M.A08, MSW.A0b(interfaceC09390do).A0M.A0O, MSW.A0b(interfaceC09390do).A0M.A0f), 2131952336));
            MSZ.A1L(c52181N7q, AbstractC166987dD.A0r(interfaceC09390do2), C05F.A0F, C05F.A0u, interfaceC09390do2);
        }
        if (!A00(c52181N7q).A06 && A00(c52181N7q).A04) {
            A03(viewOnClickListenerC55445Oju, A1E, 2131964198);
            A1E.add(new C56107OvR(new P3T(c52181N7q, 33), 2131964201, MSW.A0b(interfaceC09390do).A0M.A0a, true));
            A1E.add(new C56101OvL(2131964199, null));
        }
        if (A00(c52181N7q).A02) {
            A03(viewOnClickListenerC55445Oju, A1E, 2131964162);
            A1E.add(new C56107OvR(new P3T(c52181N7q, 34), 2131954804, MSW.A0b(interfaceC09390do).A0M.A0Q, true));
            String A0v2 = AbstractC25227BEk.A0v(c52181N7q, 2131976680);
            String A0v3 = AbstractC25227BEk.A0v(c52181N7q, 2131965064);
            SpannableStringBuilder A09 = AbstractC31178DnM.A09(A0v2, A0v3);
            NY0 ny0 = new NY0(c52181N7q, AbstractC25233BEq.A04(c52181N7q));
            C14360o3.A0A(A09);
            AnonymousClass773.A05(A09, ny0, A0v3);
            int i = 2131976681;
            if (A00(c52181N7q).A06) {
                i = 2131955361;
            }
            Integer valueOf = Integer.valueOf(i);
            C14360o3.A0B(A09, 1);
            C56101OvL c56101OvL = new C56101OvL(-1, valueOf);
            c56101OvL.A00 = A09;
            A1E.add(c56101OvL);
        }
        if (!A00(c52181N7q).A06 && A00(c52181N7q).A05) {
            A03(viewOnClickListenerC55445Oju, A1E, 2131964168);
            ViewOnClickListenerC55455Ok9 A002 = ViewOnClickListenerC55455Ok9.A00(c52181N7q, 31);
            C23031Ai c23031Ai = c52181N7q.A01;
            if (c23031Ai != null) {
                if (c23031Ai.A25("feed")) {
                    C23031Ai c23031Ai2 = c52181N7q.A01;
                    if (c23031Ai2 != null) {
                        A0v = AbstractC167017dG.A0k(AbstractC166997dE.A0N(c52181N7q), c23031Ai2.A0I("feed").size(), R.plurals.on_x_countries);
                        C14360o3.A0A(A0v);
                    }
                } else {
                    A0v = AbstractC25227BEk.A0v(c52181N7q, 2131973623);
                }
                A1E.add(new C56100OvK(A002, A0v, 2131973624));
                A1E.add(new C56101OvL(2131973622, null));
            }
            C14360o3.A0F("userPreferences");
            throw C00O.createAndThrow();
        }
        if (!A00(c52181N7q).A06 && A00(c52181N7q).A00) {
            A03(viewOnClickListenerC55445Oju, A1E, 2131969903);
            boolean z = MSW.A0b(interfaceC09390do).A0M.A0X;
            boolean z2 = !MSW.A0b(interfaceC09390do).A0M.A0W;
            if (z2) {
                z = false;
            }
            A1E.add(new C56107OvR(new P3T(c52181N7q, 35), 2131962421, z, !z2));
            C56365P1a c56365P1a = new C56365P1a(c52181N7q);
            C131975xX c131975xX = C131965xW.A05;
            SpannableStringBuilder A03 = MSZ.A0a(c52181N7q.A06).A03(c52181N7q.requireContext(), c52181N7q.requireActivity(), c56365P1a, "video_advanced_setting_description");
            if (z2) {
                C56101OvL c56101OvL2 = new C56101OvL(-1, 2131973884);
                c56101OvL2.A00 = A03;
                A1E.add(c56101OvL2);
            }
        }
        return A1E;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(getString(2131964259));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        if (X.C196218mC.A00(X.AbstractC166987dD.A0r(r5)) == false) goto L18;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = -1700024129(0xffffffff9aabb0bf, float:-7.100949E-23)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r7)
            android.os.Bundle r2 = r6.requireArguments()
            X.0do r5 = r6.A06
            X.1Ai r0 = X.AbstractC25230BEn.A0l(r5)
            r6.A01 = r0
            X.1My r0 = X.AbstractC31176DnK.A0Q(r5)
            r6.A03 = r0
            java.lang.String r1 = X.AbstractC167017dG.A0j()
            java.lang.String r0 = "igtv_creation_session_id_arg"
            java.lang.String r4 = r2.getString(r0, r1)
            java.lang.String r1 = "igtv_viewer_session_id_arg"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r5)
            X.C14360o3.A0A(r4)
            X.OAK r0 = new X.OAK
            r0.<init>(r1, r4, r2)
            com.instagram.common.session.UserSession r4 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A02
            X.OAL r0 = new X.OAL
            r0.<init>(r4, r2, r1)
            r6.A00 = r0
            java.lang.String r0 = "igtv_upload_adv_settings"
            r6.setModuleNameV2(r0)
            X.OER r0 = A00(r6)
            boolean r0 = r0.A01
            java.lang.String r4 = "eventBus"
            if (r0 == 0) goto L66
            r0 = 17
            X.Ou6 r2 = X.C56034Ou6.A00(r6, r0)
            X.1My r1 = r6.A03
            if (r1 == 0) goto Ld6
            java.lang.Class<X.Ots> r0 = X.C56021Ots.class
            r1.A01(r2, r0)
            r6.A04 = r2
        L66:
            X.OER r0 = A00(r6)
            boolean r0 = r0.A05
            if (r0 == 0) goto L7f
            r0 = 18
            X.Ou6 r2 = X.C56034Ou6.A00(r6, r0)
            X.1My r1 = r6.A03
            if (r1 == 0) goto Ld6
            java.lang.Class<X.Ot7> r0 = X.C55974Ot7.class
            r1.A01(r2, r0)
            r6.A05 = r2
        L7f:
            X.OER r0 = A00(r6)
            boolean r0 = r0.A00
            if (r0 == 0) goto Lc3
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r5)
            X.8mB r0 = X.OQ9.A00(r0)
            r6.A02 = r0
            X.0do r4 = r6.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.MSW.A0b(r4)
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r5)
            boolean r0 = X.C180377zR.A07(r0)
            if (r0 == 0) goto Lac
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r5)
            boolean r0 = X.C196218mC.A00(r0)
            r1 = 1
            if (r0 != 0) goto Lad
        Lac:
            r1 = 0
        Lad:
            X.P45 r0 = r2.A0M
            r0.A0X = r1
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.MSW.A0b(r4)
            X.5xX r0 = X.C131965xW.A05
            X.5xW r0 = X.MSZ.A0a(r5)
            boolean r1 = r0.A0B()
            X.P45 r0 = r2.A0M
            r0.A0W = r1
        Lc3:
            r0 = 35
            X.DRw r1 = new X.DRw
            r1.<init>(r6, r0)
            java.lang.String r0 = "request_key_audience_restrictions"
            X.C06C.A01(r6, r0, r1)
            r0 = 63558368(0x3c9d2e0, float:1.1862133E-36)
            X.C0f9.A09(r0, r3)
            return
        Ld6:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52181N7q.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-400551161);
        InterfaceC41501vz interfaceC41501vz = this.A04;
        if (interfaceC41501vz != null) {
            C25671My c25671My = this.A03;
            if (c25671My != null) {
                c25671My.A02(interfaceC41501vz, C56021Ots.class);
            }
            C14360o3.A0F("eventBus");
            throw C00O.createAndThrow();
        }
        InterfaceC41501vz interfaceC41501vz2 = this.A05;
        if (interfaceC41501vz2 != null) {
            C25671My c25671My2 = this.A03;
            if (c25671My2 != null) {
                c25671My2.A02(interfaceC41501vz2, C55974Ot7.class);
            }
            C14360o3.A0F("eventBus");
            throw C00O.createAndThrow();
        }
        super.onDestroy();
        C0f9.A09(-2130197642, A02);
    }
}
