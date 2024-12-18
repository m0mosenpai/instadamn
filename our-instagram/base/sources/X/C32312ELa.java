package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.ui.widget.spinner.RefreshSpinner;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;

/* renamed from: X.ELa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32312ELa extends AbstractC59962oe implements InterfaceC60072op, InterfaceC62892tS, InterfaceC37190Ga1 {
    public static final String __redex_internal_original_name = "SwitchToBusinessAccountFragment";
    public int A00;
    public int A01;
    public View A02;
    public ViewGroup A03;
    public TextView A04;
    public InterfaceC37222GaX A05;
    public EVM A06;
    public C31825Dyj A07;
    public AbstractC18680vv A08;
    public UserSession A09;
    public ReboundViewPager A0A;
    public IgdsBottomButtonLayout A0B;
    public RefreshSpinner A0C;
    public SpinnerImageView A0D;
    public boolean A0E;
    public CirclePageIndicator A0F;
    public User A0G;
    public String A0H;
    public final Handler A0I = AbstractC167007dF.A0J();

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "switch_to_business_account";
    }

    public static void A00(C32312ELa c32312ELa) {
        C31825Dyj c31825Dyj = c32312ELa.A07;
        c31825Dyj.A05.CjL(new Y7A("intro", c31825Dyj.A08, null, null, null, null, null, null));
        ((BusinessConversionActivity) c32312ELa.A05).CnD(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C32312ELa r12) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32312ELa.A01(X.ELa):void");
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        int i;
        if (this.A0A != null && (i = this.A00) != this.A01 - 1) {
            this.A07.A00("continue", i + 1);
            this.A0A.A0L(this.A00 + 1, 0.1f);
        } else {
            this.A07.A00("continue", -1);
            A00(this);
        }
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
        this.A05.AGf();
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
        int i3 = this.A01;
        if (i == i3 - 1 && i2 == i3) {
            this.A0I.post(new RunnableC36820GKt(this));
        } else {
            this.A07.A00("swipe", i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r2 != X.EnumC151596s5.A04) goto L6;
     */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r10 = this;
            X.Dyj r1 = r10.A07
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r1.A05
            java.lang.String r2 = "intro"
            r4 = 0
            java.lang.String r3 = r1.A08
            X.Y7A r1 = new X.Y7A
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.Cid(r1)
            X.GaX r0 = r10.A05
            if (r0 == 0) goto L23
            X.6s5 r2 = r0.B77()
            X.6s5 r1 = X.EnumC151596s5.A04
            r0 = 1
            if (r2 == r1) goto L24
        L23:
            r0 = 0
        L24:
            r2 = 1
            if (r0 == 0) goto L3d
            com.instagram.common.session.UserSession r0 = r10.A09
            if (r0 == 0) goto L3d
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r0)
            X.16a r1 = r0.A0I()
            X.16a r0 = X.EnumC222416a.A07
            if (r1 == r0) goto L3d
            X.GaX r0 = r10.A05
            r0.AGf()
            return r2
        L3d:
            X.GaX r0 = r10.A05
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            r0.EL3(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32312ELa.onBackPressed():boolean");
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        if (isResumed()) {
            this.A00 = i;
            EVM evm = this.A06;
            evm.getClass();
            boolean z = true;
            if (!this.A0E || this.A00 != this.A01 - 1) {
                z = false;
            }
            evm.A02(z);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A08;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        InterfaceC37222GaX interfaceC37222GaX;
        super.onAttach(context);
        C1UC requireActivity = requireActivity();
        if (requireActivity instanceof InterfaceC37222GaX) {
            interfaceC37222GaX = (InterfaceC37222GaX) requireActivity;
        } else {
            interfaceC37222GaX = null;
        }
        interfaceC37222GaX.getClass();
        this.A05 = interfaceC37222GaX;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0078, code lost:
    
        if (r5.A09 == null) goto L9;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -1399349909(0xffffffffac979d6b, float:-4.309155E-12)
            int r2 = X.C0f9.A02(r0)
            super.onCreate(r6)
            X.0vv r0 = X.AbstractC31176DnK.A0R(r5)
            r5.A08 = r0
            java.lang.String r4 = X.AbstractC31180DnO.A0b(r5)
            java.lang.String r0 = "entry_point should not be null"
            X.C18C.A07(r4, r0)
            r5.A0H = r4
            X.0vv r3 = r5.A08
            X.GaX r1 = r5.A05
            X.EWU r0 = new X.EWU
            r0.<init>(r1, r3, r4)
            X.2bb r1 = new X.2bb
            r1.<init>(r0, r5)
            java.lang.Class<X.Dyj> r0 = X.C31825Dyj.class
            X.2bZ r0 = r1.A00(r0)
            X.Dyj r0 = (X.C31825Dyj) r0
            r5.A07 = r0
            X.2pV r3 = new X.2pV
            r3.<init>()
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.EVO r0 = new X.EVO
            r0.<init>(r1)
            r3.A0E(r0)
            r5.registerLifecycleListenerSet(r3)
            X.0vv r1 = r5.A08
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L57
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r5.A09 = r1
            com.instagram.user.model.User r0 = X.AbstractC166987dD.A10(r1)
            r5.A0G = r0
        L57:
            android.os.Bundle r1 = r5.requireArguments()
            r0 = 917(0x395, float:1.285E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            int r0 = r1.getInt(r0)
            r5.A00 = r0
            java.lang.String r1 = r5.A0H
            r0 = 312(0x138, float:4.37E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7a
            com.instagram.common.session.UserSession r1 = r5.A09
            r0 = 1
            if (r1 != 0) goto L7b
        L7a:
            r0 = 0
        L7b:
            r5.A0E = r0
            r0 = -1753577522(0xffffffff977a87ce, float:-8.0950766E-25)
            X.C0f9.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32312ELa.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32312ELa.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1048415081);
        super.onDestroyView();
        unregisterLifecycleListener(this.A06);
        this.A02 = null;
        this.A0B = null;
        this.A06 = null;
        this.A0F = null;
        this.A0A = null;
        this.A0C = null;
        this.A04 = null;
        this.A03 = null;
        this.A0D = null;
        C0f9.A09(359349168, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(2033050891);
        super.onResume();
        if (this.A0A != null && !AbstractC35211Fg4.A04(this.A05) && this.A08 != null) {
            CallerContext callerContext = C35792FrU.A00;
        }
        C0f9.A09(-228071721, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C31825Dyj c31825Dyj = this.A07;
        c31825Dyj.A05.Clo(new Y7A("intro", c31825Dyj.A08, null, null, null, null, null, null));
        C2GS c2gs = this.A07.A04;
        C14360o3.A0C(c2gs, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.String>");
        C31470DsE.A00(this, c2gs, 0);
        C2GS c2gs2 = this.A07.A01;
        C14360o3.A0C(c2gs2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Boolean>");
        C31470DsE.A00(this, c2gs2, 1);
        C2GS c2gs3 = this.A07.A00;
        C14360o3.A0C(c2gs3, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>");
        C31470DsE.A00(this, c2gs3, 2);
        TextView textView = this.A04;
        if (textView != null) {
            C2GS c2gs4 = this.A07.A02;
            C14360o3.A0C(c2gs4, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.instagram.user.model.User>");
            C31470DsE.A00(this, c2gs4, 3);
            C2GS c2gs5 = this.A07.A03;
            C14360o3.A0C(c2gs5, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Boolean>");
            c2gs5.A06(this, new C35762Fqz(0, textView, this));
        }
    }
}
