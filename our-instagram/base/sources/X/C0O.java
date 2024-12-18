package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* loaded from: classes5.dex */
public final class C0O extends AbstractC26782Bs6 implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "OpalFragment";
    public MotionEvent A00;
    public AnonymousClass308 A01;
    public CSY A02;
    public C38E A03;
    public C1M1 A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C56039OuB A0E;
    public final C37330GcY A0F;
    public final String A0G = AbstractC167017dG.A0j();
    public final String A0H;
    public final InterfaceC09390do A0I;
    public final MV0 A0J;
    public final C56026Otx A0K;
    public final C56026Otx A0L;
    public final InterfaceC09390do A0M;

    public static final void A04(C0O c0o, String str) {
        String A01 = A01(c0o);
        String str2 = c0o.A05;
        if (str2 == null) {
            str2 = "";
        }
        AbstractC34277F9x.A00(c0o, AbstractC166987dD.A0r(((AbstractC26782Bs6) c0o).A00), str, AbstractC43591JPw.A00(130), A01, str2, null);
    }

    public static final void A05(C0O c0o, String str) {
        String A01 = A01(c0o);
        String str2 = c0o.A05;
        if (str2 == null) {
            str2 = "";
        }
        AbstractC34277F9x.A00(c0o, AbstractC166987dD.A0r(((AbstractC26782Bs6) c0o).A00), "tap", str, A01, str2, null);
    }

    public static final void A06(C0O c0o, String str) {
        String A01 = A01(c0o);
        String str2 = c0o.A05;
        if (str2 == null) {
            str2 = "";
        }
        AbstractC34277F9x.A00(c0o, AbstractC166987dD.A0r(((AbstractC26782Bs6) c0o).A00), str, "empty", A01, str2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r4 == false) goto L6;
     */
    @Override // X.AbstractC26782Bs6, X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r6) {
        /*
            r5 = this;
            r3 = 0
            X.C14360o3.A0B(r6, r3)
            super.configureActionBar(r6)
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L4c
            r0 = 1934(0x78e, float:2.71E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r4 = r1.getBoolean(r0)
            if (r4 != 0) goto L35
        L17:
            r1 = 1
            r0 = 13
            X.ClE r0 = X.ViewOnClickListenerC28666ClE.A00(r5, r0)
            r6.EkT(r0, r1)
            r0 = -1
            android.graphics.ColorFilter r1 = X.C3DY.A00(r0)
            r0 = r6
            X.2iT r0 = (X.C56352iT) r0
            android.widget.ImageView r0 = r0.A0Q()
            r0.setColorFilter(r1)
            java.lang.String r0 = "impression"
            A04(r5, r0)
        L35:
            r0 = 17
            X.DS9 r2 = new X.DS9
            r2.<init>(r0, r5, r4)
            r0 = 721916716(0x2b07932c, float:4.8165877E-13)
            r1 = 1
            X.5TR r0 = X.C5UA.A04(r2, r0, r1)
            androidx.compose.ui.platform.ComposeView r0 = X.AbstractC25319BIo.A02(r5, r0, r1, r3)
            r6.ESo(r0, r3, r3, r3)
            return
        L4c:
            r4 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "opal_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        CSY csy = this.A02;
        if (csy != null) {
            csy.A00.onSaveInstanceState(bundle);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = new CSY(requireContext(), AbstractC166987dD.A0r(super.A00), new C29337CwW(this));
        view.requestFocus();
        CSY csy = this.A02;
        if (csy != null) {
            csy.A00.Dgs(bundle);
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 5), C07Y.A00(viewLifecycleOwner));
        this.A0D.postDelayed(new D1B(this), 1000L);
    }

    public static final C51030Mgd A00(C0O c0o) {
        return (C51030Mgd) c0o.A0M.getValue();
    }

    public static final String A01(C0O c0o) {
        if (C2TN.A05(AbstractC166987dD.A0r(((AbstractC26782Bs6) c0o).A00), c0o.A05)) {
            return "opal_self_profile";
        }
        return "opal_profile";
    }

    public static final void A02(C0O c0o) {
        Object value;
        if (c0o.A0C) {
            c0o.A0C = false;
            C51030Mgd A00 = A00(c0o);
            if (AbstractC166987dD.A0x(A00.A01).getInt(MSV.A00(537), 0) < 1) {
                C05A c05a = A00.A05;
                do {
                    value = c05a.getValue();
                } while (!c05a.AIi(value, C26073Bg2.A02((C26073Bg2) value, C05F.A01)));
                return;
            }
            C51030Mgd.A00(A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        if (r10 > 0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.Bs6, X.C0K, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v53, types: [X.Bs6, X.C0K, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C0O r17) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O.A03(X.C0O):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(super.A00);
    }

    public C0O() {
        DH3 dh3 = new DH3(this, 34);
        DH3 dh32 = new DH3(this, 31);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new DH3(dh32, 32));
        this.A0M = AbstractC25225BEi.A0a(new DH3(A00, 33), dh3, new C57255Pbd(17, null, A00), AbstractC25225BEi.A1D(C51030Mgd.class));
        this.A0I = AbstractC09440dt.A00(enumC09460dv, new D64(this));
        this.A09 = true;
        this.A0C = true;
        this.A0H = AbstractC167017dG.A0j();
        this.A0D = AbstractC167007dF.A0J();
        this.A0F = new C37330GcY();
        this.A0E = new C56039OuB(this, 0);
        this.A0J = new MV0(this, 1);
        this.A0L = new C56026Otx(this, 3);
        this.A0K = new C56026Otx(this, 2);
    }

    @Override // X.AbstractC26782Bs6, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String str2;
        int A02 = C0f9.A02(2123976406);
        InterfaceC09390do interfaceC09390do = super.A00;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        this.A08 = C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36321043774710882L);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean(AbstractC111324zv.A00(1942));
        } else {
            z = false;
        }
        this.A0B = z;
        super.onCreate(bundle);
        this.A04 = C1M3.A00();
        FragmentActivity requireActivity = requireActivity();
        AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        C1M1 c1m1 = this.A04;
        String str3 = null;
        if (c1m1 == null) {
            C14360o3.A0F("sessionIdProvider");
            throw C00O.createAndThrow();
        }
        this.A01 = new AnonymousClass308(requireActivity, this, parentFragmentManager, A0r2, null, this, null, c1m1, true, true, true);
        this.A03 = new C38E(this, AbstractC166987dD.A0r(interfaceC09390do), new C38C(this, 60574));
        FragmentActivity requireActivity2 = requireActivity();
        if (requireActivity2 instanceof BaseFragmentActivity) {
            ((IgFragmentActivity) requireActivity2).registerOnActivityResultListener(this.A0E);
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString(AbstractC111324zv.A00(1938));
        } else {
            str = null;
        }
        this.A05 = str;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str2 = bundle4.getString(AbstractC111324zv.A00(1943));
        } else {
            str2 = null;
        }
        this.A06 = str2;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str3 = bundle5.getString("argument_source_ranking_info_token");
        }
        this.A07 = str3;
        String str4 = this.A05;
        if (str4 != null) {
            C51030Mgd A00 = A00(this);
            A00.A00 = str4;
            AbstractC166987dD.A1Z(new PZ1(A00, str4, null, 12), AbstractC141776au.A00(A00));
        }
        if (C2TN.A05(AbstractC166987dD.A0r(interfaceC09390do), this.A05)) {
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do)));
            A0w.E7D(MSV.A00(243), 2);
            A0w.apply();
            C25671My A002 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do));
            A002.A01(this.A0J, C70083Cs.class);
            A002.A01(this.A0L, C3DH.class);
            A002.A01(this.A0K, C55993OtQ.class);
        }
        A06(this, "surface_appear");
        C0f9.A09(1598464890, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-58126569);
        FrameLayout frameLayout = new FrameLayout(requireContext());
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A04(new C30487DbW(32, this, this, frameLayout), 126459618, true), true, false);
        A022.setTag("opal_content_view");
        frameLayout.addView(A022);
        InterfaceC09390do interfaceC09390do = super.A00;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C06090Tz A0j = AbstractC25225BEi.A0j(A0r, 0);
        if (C18U.A06(A0j, A0r, 36321043774710882L)) {
            DH3 dh3 = new DH3(this, 19);
            String str = this.A05;
            if (str == null) {
                str = "";
            }
            frameLayout.addView(CJZ.A00(this, this, str, dh3, true, true, false));
        }
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r2, 0);
        if (AbstractC25225BEi.A07(A0j, A0r2, 36602518751154842L) == 1) {
            frameLayout.setCameraDistance(20000.0f * AbstractC167007dF.A0K(requireContext()).density);
        }
        C0f9.A09(2019827986, A02);
        return frameLayout;
    }

    @Override // X.AbstractC26782Bs6, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1866608669);
        super.onDestroy();
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            ((IgFragmentActivity) requireActivity).unregisterOnActivityResultListener(this.A0E);
        }
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(super.A00));
        A00.A02(this.A0J, C70083Cs.class);
        A00.A02(this.A0L, C3DH.class);
        A00.A02(this.A0K, C55993OtQ.class);
        A06(this, "surface_disappear");
        C0f9.A09(-1290403091, A02);
    }

    @Override // X.AbstractC26782Bs6, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Reel reel;
        Object value;
        C26073Bg2 c26073Bg2;
        C51745MtU c51745MtU;
        int A02 = C0f9.A02(1822906500);
        super.onResume();
        this.A09 = true;
        C51030Mgd A00 = A00(this);
        C51745MtU c51745MtU2 = ((C26073Bg2) A00.A06.getValue()).A01;
        if (c51745MtU2 != null && (reel = (Reel) c51745MtU2.A01) != null) {
            C05A c05a = A00.A05;
            do {
                value = c05a.getValue();
                c26073Bg2 = (C26073Bg2) value;
                C51745MtU c51745MtU3 = c26073Bg2.A01;
                if (c51745MtU3 != null) {
                    boolean z = true;
                    if (!reel.A16(A00.A01)) {
                        z = false;
                    }
                    c51745MtU = new C51745MtU(c51745MtU3.A01, c51745MtU3.A00, 4, z);
                } else {
                    c51745MtU = null;
                }
            } while (!c05a.AIi(value, C26073Bg2.A00(c51745MtU, null, null, null, c26073Bg2, null, 0, 2031, false, false)));
        }
        C0f9.A09(2049771795, A02);
    }
}
