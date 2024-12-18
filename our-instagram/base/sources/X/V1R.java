package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class V1R extends AbstractC59962oe implements C1M1, InterfaceC60682pr, AnonymousClass309, InterfaceC60072op, InterfaceC114465Eq, InterfaceC60092or, InterfaceC11480j6, InterfaceC60122ou, InterfaceC60132ov {
    public static final String __redex_internal_original_name = "HashtagPageFragment";
    public EnumC39652Hih A00;
    public ViewOnTouchListenerC60632pm A01;
    public C154846xZ A02;
    public C153756vk A03;
    public C18920wW A04;
    public C38085GpE A05;
    public C66095TzW A06;
    public C65823Tug A07;
    public C68034V7f A08;
    public C70112W4k A09;
    public JIG A0A;
    public C3CO A0B;
    public AnonymousClass308 A0C;
    public C69302VlA A0D;
    public C70105W4c A0E;
    public V7n A0F;
    public C32968Eez A0G;
    public FOB A0H;
    public W4b A0I;
    public C69359Vm5 A0J;
    public C3BD A0K;
    public C64842wi A0L;
    public C64742wY A0M;
    public String A0N;
    public C25671My A0Q;
    public EnumC68206VFy A0R;
    public HHI A0S;
    public C69133ViO A0T;
    public C70587WdO A0U;
    public String A0V;
    public String A0W;
    public boolean A0X;
    public final C68809VcQ A0d;
    public final String A0g;
    public final InterfaceC09390do A0h;
    public final InterfaceC153536vO A0k;
    public final InterfaceC12870lZ A0o;
    public final InterfaceC71926XAk A0t;
    public final InterfaceC101554hQ A0w;
    public final InterfaceC37200GaB A0x;
    public final C69534Vqy A10;
    public final InterfaceC09390do A16;
    public final C71073WnV A0y = new C71073WnV(this);
    public final C145036gO A0a = new C145036gO(true);
    public final WG5 A0c = new WG5();
    public final Handler A0Y = AbstractC167007dF.A0J();
    public final C70720Wfl A14 = new C70720Wfl();
    public final C38U A0e = C38U.A00;
    public final C37330GcY A0Z = new C37330GcY();
    public final C1I2 A15 = new C39170HLy(this, 1);
    public boolean A0P = true;
    public String A0O = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    public final InterfaceC71918XAc A0q = new WjZ(this);
    public final XA3 A0i = new C70586WdN(this);
    public final InterfaceC41501vz A0n = new C70717Wfi(this, 3);
    public final C68810VcR A0z = new C68810VcR(this);
    public final C68811VcS A11 = new C68811VcS(this);
    public final XLN A0r = new C70889Wji(this, 2);
    public final XAq A0v = new Wk0(this, 2);
    public final InterfaceC71951XCd A0p = new WjW(this);
    public final InterfaceC41501vz A0l = new C70717Wfi(this, 1);
    public final InterfaceC41501vz A0m = new C70717Wfi(this, 2);
    public final C53S A0j = new WdQ(this, 0);
    public final InterfaceC71925XAj A0s = new C70895Wjo(this, 1);
    public final AbstractC42425IqS A0b = new C68036V7h(this, 1);
    public final InterfaceC43406JFw A0u = new C42426IqT(this, 0);
    public final C68812VcT A12 = new C68812VcT(this);
    public final C68813VcU A13 = new C68813VcU(this);
    public final String A0f = AbstractC111324zv.A00(935);
    public final InterfaceC09390do A18 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A17 = C1XM.A00(new C57241PbP(this, 22));

    public static final void A08(V1R v1r, String str, int i, boolean z, boolean z2) {
        W4b w4b = v1r.A0I;
        String str2 = "feedRequestController";
        if (w4b != null) {
            EnumC68206VFy enumC68206VFy = w4b.A00;
            C14360o3.A07(enumC68206VFy);
            C68046V7y c68046V7y = new C68046V7y(enumC68206VFy, v1r, i, z, z2);
            String str3 = v1r.A0W;
            if (z && str3 != null) {
                C68034V7f c68034V7f = v1r.A08;
                if (c68034V7f == null) {
                    str2 = "dataSource";
                } else {
                    EnumC68206VFy enumC68206VFy2 = c68034V7f.A00;
                    EnumC68206VFy enumC68206VFy3 = v1r.A0R;
                    if (enumC68206VFy3 == null) {
                        str2 = "initialTab";
                    } else if (enumC68206VFy2 == enumC68206VFy3) {
                        W4b w4b2 = v1r.A0I;
                        if (w4b2 != null) {
                            w4b2.A01(c68046V7y, str3, true, z2, v1r.A0X);
                            return;
                        }
                    }
                }
            }
            W4b w4b3 = v1r.A0I;
            if (w4b3 != null) {
                w4b3.A01(c68046V7y, str, z, z2, v1r.A0X);
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (X.AbstractC166997dE.A1Z(r1.A01.BXF(), true) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        if (r14.length() == 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r33) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1R.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1R.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final UserSession A00(V1R v1r) {
        return (UserSession) v1r.A18.getValue();
    }

    public static final W31 A01(V1R v1r) {
        return (W31) v1r.A16.getValue();
    }

    public static final void A04(V1R v1r) {
        WG5 wg5 = v1r.A0c;
        C68034V7f c68034V7f = v1r.A08;
        if (c68034V7f == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        String obj = c68034V7f.A00.toString();
        C14360o3.A0B(obj, 0);
        WG5.A03(wg5, obj, 20643843);
        A08(v1r, v1r.A0O, 20643843, false, false);
    }

    public static final void A06(V1R v1r, int i) {
        C69133ViO c69133ViO = v1r.A0T;
        if (c69133ViO == null) {
            C14360o3.A0F("headerRequestController");
            throw C00O.createAndThrow();
        }
        c69133ViO.A01.A04(new C67957V3w(v1r, i), c69133ViO.A00, c69133ViO.A02);
    }

    public static final void A07(V1R v1r, String str) {
        if (str != null) {
            FragmentActivity requireActivity = v1r.requireActivity();
            String str2 = v1r.A0f;
            if (!C63357SiE.A03(requireActivity, A00(v1r), str, str2)) {
                android.net.Uri A03 = AbstractC08820cl.A03(str);
                C14360o3.A07(A03);
                C14J A00 = C14J.A04.A00();
                if (A00 != null && A00.A00(A00(v1r), str) != null) {
                    Intent A04 = C14H.A03.A00().A04(requireActivity, A03);
                    A04.putExtra(AbstractC111324zv.A00(193), true);
                    C12260kU.A0C(requireActivity, A04);
                    return;
                }
                AbstractC35275FhA.A04(requireActivity, A00(v1r), C2Fb.A1x, str, str2);
            }
        }
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A01;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("scrollableNavigationHelper");
            throw C00O.createAndThrow();
        }
        return viewOnTouchListenerC60632pm;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB c11520jB = new C11520jB();
        WE1.A03(c11520jB, A01(this).A01);
        C68034V7f c68034V7f = this.A08;
        if (c68034V7f == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        EnumC68206VFy enumC68206VFy = c68034V7f.A00;
        int A05 = c68034V7f.A05();
        c11520jB.A04(AbstractC129005sL.A00, enumC68206VFy.toString());
        c11520jB.A04(AbstractC128225qr.A01, Long.valueOf(A05));
        AnonymousClass729.A00(A00(this)).A00(c11520jB);
        return c11520jB;
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        C65823Tug c65823Tug = this.A07;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        c65823Tug.A03();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0f;
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        C65823Tug c65823Tug = this.A07;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        C3FQ c3fq = c65823Tug.A06;
        if (c3fq != null) {
            return c3fq;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A17.getValue();
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return this.A0g;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AnonymousClass308 anonymousClass308 = this.A0C;
        if (anonymousClass308 == null) {
            C14360o3.A0F("peekMediaController");
            throw C00O.createAndThrow();
        }
        if (anonymousClass308.onBackPressed()) {
            return true;
        }
        List list = this.A14.A00;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((XA3) list.get(size)).DEr(null, true);
            } else {
                return false;
            }
        }
    }

    public V1R() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        String A00 = AbstractC111324zv.A00(156);
        this.A0h = AbstractC09440dt.A00(enumC09460dv, new DH5(this, A00, A00, 29));
        this.A16 = C1XM.A00(new C57241PbP(this, 21));
        this.A0g = AbstractC167017dG.A0j();
        this.A0d = new C68809VcQ(this);
        this.A10 = new C69534Vqy(this);
        this.A0t = new C70898Wjr(this);
        this.A0k = new C70670Weq(this);
        this.A0w = new Wk9(this, 2);
        this.A0o = new YEY(this, 3);
        this.A0x = new C70929WkY(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.EnumC68206VFy r9, X.C69445VnU r10, X.V1R r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1R.A02(X.VFy, X.VnU, X.V1R, boolean, boolean):void");
    }

    public static final void A03(V1R v1r) {
        if (v1r.isResumed()) {
            AbstractC31178DnM.A0v(v1r);
        }
    }

    public static final void A05(V1R v1r) {
        if (A01(v1r).A02 != null) {
            ICQ icq = A01(v1r).A02;
            if (icq != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("timezone_offset", String.valueOf(C23831Eq.A00()));
                C66277U6x A01 = C66277U6x.A01(icq.A00, hashMap);
                IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(A00(v1r));
                igBloksScreenConfig.A0U = AbstractC166997dE.A0N(v1r).getString(2131962828);
                igBloksScreenConfig.A0l = true;
                C72743Nv A02 = W6d.A02(igBloksScreenConfig, A01);
                C140966Yy A0P = AbstractC31173DnH.A0P(v1r.requireActivity(), A00(v1r));
                A0P.A0D(A02);
                A0P.A07 = v1r.A0j;
                A0P.A04();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC114465Eq
    public final Hashtag BD4() {
        return A01(this).A01;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        return E6P();
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        Hashtag hashtag = A01(this).A01;
        C11520jB c11520jB = new C11520jB();
        String id = hashtag.getId();
        String name = hashtag.getName();
        if (id != null && id.length() != 0) {
            c11520jB.A0A("hashtag_id", id);
        }
        if (name != null && name.length() != 0) {
            c11520jB.A0A("hashtag_name", name);
        }
        AnonymousClass729.A00(A00(this)).A00(c11520jB);
        return c11520jB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /* JADX WARN: Type inference failed for: r2v21, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r33v2, types: [X.2y7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [X.2fr, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r56) {
        /*
            Method dump skipped, instructions count: 1670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1R.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1876916992);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A07 == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        View inflate = layoutInflater.inflate(R.layout.layout_grid_recyclerview_wrapper, viewGroup, false);
        C0f9.A09(309415142, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        int A02 = C0f9.A02(543418706);
        super.onDestroy();
        C41451vu c41451vu = C41451vu.A01;
        C70720Wfl c70720Wfl = this.A14;
        c41451vu.A03(c70720Wfl, C42661xu.class);
        C25671My c25671My = this.A0Q;
        if (c25671My != null) {
            c25671My.A02(this.A0l, C70033Cn.class);
            c25671My.A02(this.A0n, C70073Cr.class);
            c25671My.A02(this.A0m, C42251Inb.class);
        }
        C70587WdO c70587WdO = this.A0U;
        if (c70587WdO == null) {
            str = "rapidFeedbackPresenter";
        } else {
            List list = c70720Wfl.A00;
            list.remove(c70587WdO);
            list.remove(this.A0i);
            C218914p.A06(this.A0o);
            WG5.A02(this.A0c, null);
            HHI hhi = this.A0S;
            if (hhi == null) {
                str = "gridPrefetchController";
            } else {
                unregisterLifecycleListener(hhi);
                C0f9.A09(1747853706, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-484653384);
        super.onDestroyView();
        C145036gO c145036gO = this.A0a;
        Dialog dialog = c145036gO.A00;
        if (dialog != null) {
            dialog.dismiss();
            c145036gO.A00 = null;
        }
        C65823Tug c65823Tug = this.A07;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        c65823Tug.A01();
        C3BD c3bd = this.A0K;
        if (c3bd != null) {
            c3bd.A01();
            this.A0K = null;
        }
        C0f9.A09(604512660, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1845318138);
        C65823Tug c65823Tug = this.A07;
        String str = "grid";
        if (c65823Tug != null) {
            c65823Tug.A0D.AGc();
            JIG jig = this.A0A;
            if (jig == null) {
                str = "videoPlayerManager";
            } else {
                jig.EE9();
                super.onPause();
                ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A01;
                if (viewOnTouchListenerC60632pm == null) {
                    str = "scrollableNavigationHelper";
                } else {
                    C65823Tug c65823Tug2 = this.A07;
                    if (c65823Tug2 != null) {
                        C3FQ c3fq = c65823Tug2.A06;
                        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        viewOnTouchListenerC60632pm.A09(c3fq);
                        C0f9.A09(-1404040112, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        View view;
        String str;
        int A02 = C0f9.A02(45358158);
        super.onResume();
        V7n v7n = this.A0F;
        if (v7n == null) {
            str = "actionBarController";
        } else {
            v7n.A02();
            this.A0a.A03 = false;
            C65823Tug c65823Tug = this.A07;
            if (c65823Tug == null) {
                str = "grid";
            } else {
                c65823Tug.A0D.EJ1();
                C70105W4c c70105W4c = this.A0E;
                if (c70105W4c == null) {
                    str = "useHashtagController";
                } else {
                    C68034V7f c68034V7f = this.A08;
                    if (c68034V7f == null) {
                        str = "dataSource";
                    } else {
                        EnumC68206VFy enumC68206VFy = c68034V7f.A00;
                        C14360o3.A07(enumC68206VFy);
                        c70105W4c.A00(enumC68206VFy);
                        UserSession A00 = A00(this);
                        C14360o3.A0B(A00, 0);
                        C71774X4b c71774X4b = C71774X4b.A00;
                        AbstractC69735VuV abstractC69735VuV = (AbstractC69735VuV) A00.A01(V7W.class, c71774X4b);
                        String str2 = this.A0g;
                        C14360o3.A0B(str2, 0);
                        if (abstractC69735VuV.A00.containsKey(str2)) {
                            UserSession A002 = A00(this);
                            C14360o3.A0B(A002, 0);
                            AbstractC69385VmV abstractC69385VmV = (AbstractC69385VmV) ((AbstractC69735VuV) A002.A01(V7W.class, c71774X4b)).A00.remove(str2);
                            if (abstractC69385VmV != null) {
                                V7Y v7y = (V7Y) abstractC69385VmV;
                                if (v7y.A04) {
                                    W4b w4b = this.A0I;
                                    if (w4b == null) {
                                        str = "feedRequestController";
                                    } else {
                                        EnumC68206VFy enumC68206VFy2 = v7y.A00;
                                        if (enumC68206VFy2 != null) {
                                            w4b.A06.put(enumC68206VFy2, new C69132ViN(W4b.A00(enumC68206VFy2, w4b).A02.A00(((AbstractC69385VmV) v7y).A00), v7y.A01, v7y.A03));
                                        }
                                        str = "tab";
                                    }
                                }
                                List list = v7y.A06;
                                if (!list.isEmpty()) {
                                    int size = list.size();
                                    for (int i = 0; i < size; i++) {
                                        C69445VnU c69445VnU = (C69445VnU) list.get(i);
                                        boolean booleanValue = ((Boolean) v7y.A05.get(i)).booleanValue();
                                        EnumC68206VFy enumC68206VFy3 = v7y.A00;
                                        if (enumC68206VFy3 != null) {
                                            A02(enumC68206VFy3, c69445VnU, this, booleanValue, false);
                                        } else {
                                            str = "tab";
                                        }
                                    }
                                }
                                String str3 = v7y.A02;
                                if (str3 != null && str3.length() != 0 && (view = this.mView) != null) {
                                    view.post(new RunnableC71512WvH(v7y, this));
                                }
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        C0f9.A09(-1623127209, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
