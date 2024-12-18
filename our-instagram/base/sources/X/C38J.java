package X;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.38J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38J extends C38K implements InterfaceC11380iw, InterfaceC62602sz, AnonymousClass309, InterfaceC60072op, InterfaceC62612t0, InterfaceC11480j6, AbsListView.OnScrollListener, C38M, InterfaceC60122ou, InterfaceC60132ov, InterfaceC60162oy, C38N, C38O {
    public static final String __redex_internal_original_name = "SingleMediaFeedFragment";
    public int A00;
    public C11520jB A01;
    public C154796xU A02;
    public C123835ix A03;
    public EnumC40111tc A04;
    public C64842wi A05;
    public C64742wY A06;
    public InterfaceC70513Em A07;
    public EnumC114765Gh A08;
    public C38977HEf A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public View A0J;
    public ViewOnTouchListenerC60632pm A0K;
    public C3MJ A0L;
    public C3MT A0M;
    public InterfaceC114705Ga A0N;
    public C3CO A0O;
    public AnonymousClass308 A0P;
    public EmptyStateView A0R;
    public String A0S;
    public String A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final InterfaceC09390do A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final C61372qz A0c = new C61372qz();
    public final C37330GcY A0j = new C37330GcY();
    public final InterfaceC09390do A0l = AbstractC60492pY.A02(this);
    public final ArrayList A0k = new ArrayList();
    public final java.util.Set A0d = new HashSet();
    public AnonymousClass341 A0Q = AnonymousClass341.A0U;
    public Handler A0I = new Handler(Looper.getMainLooper());
    public final InterfaceC41501vz A0i = new C42265Inp(this);

    private final void A03(C38321qM c38321qM) {
        String str;
        if (!this.A0U) {
            InterfaceC09390do interfaceC09390do = this.A0h;
            String str2 = (String) interfaceC09390do.getValue();
            if (str2 != null && str2.length() != 0 && (str = this.A0A) != null && str.length() != 0 && c38321qM != null) {
                this.A0U = true;
                C28195Cbp c28195Cbp = C28195Cbp.A00;
                Context requireContext = requireContext();
                UserSession A01 = A01(this);
                Object value = this.A0f.getValue();
                C14360o3.A07(value);
                C39G c39g = (C39G) value;
                String str3 = (String) interfaceC09390do.getValue();
                if (str3 != null) {
                    UserSession A012 = A01(this);
                    String str4 = this.A0A;
                    if (str4 != null) {
                        C38977HEf c38977HEf = this.A09;
                        if (c38977HEf == null) {
                            C14360o3.A0F("adapter");
                            throw C00O.createAndThrow();
                        }
                        c28195Cbp.A00(requireContext, A01, new C904841i(A012, c38977HEf.BRZ(c38321qM), str4), c39g, c38321qM, this, str3, false);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
    
        r0 = r38.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
    
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012e, code lost:
    
        r38.A00 = r3.A17(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r38.A00 == (-1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0139, code lost:
    
        r0 = r38.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
    
        r0.BRZ(r3).A0A(r38.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0146, code lost:
    
        r0 = r38.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
    
        r1 = r0.BRZ(r3);
        r0 = r38.A0Q;
        X.C14360o3.A0B(r0, 0);
        r1.A0o = r0;
        r0 = r38.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0157, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0159, code lost:
    
        r0.BRZ(r3).A2u = r38.A0Z;
        r0 = r38.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0163, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0165, code lost:
    
        r0.BRZ(r3).A2t = r38.A0Y;
        r0 = r38.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016f, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0171, code lost:
    
        r2 = r0.BRZ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        if (r38.A08 != X.EnumC114765Gh.A04) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017c, code lost:
    
        r2.A27 = r5;
        r2 = r38.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0180, code lost:
    
        if (r2 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0182, code lost:
    
        r1 = java.util.Collections.singletonList(r3);
        X.C14360o3.A07(r1);
        r2.A04.A0B(r1);
        X.C38977HEf.A00(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0195, code lost:
    
        if (r3.A5Q() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0197, code lost:
    
        r0 = r3.A1d().BRp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019f, code lost:
    
        r38.A04 = r0;
        r0 = r3.A5K();
        r38.A0X = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a7, code lost:
    
        if (r0 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a9, code lost:
    
        X.VRC.A00(A01(r38)).A03("promotion_media", r38.A0A);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bc, code lost:
    
        if (isResumed() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01be, code lost:
    
        X.C56352iT.A0L(X.C56352iT.A0t.A03(requireActivity()), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cc, code lost:
    
        A03(r3);
        A05(r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d3, code lost:
    
        r0 = r3.BRp();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0b(X.C74293Vk r39) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38J.A0b(X.3Vk):void");
    }

    @Override // X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        C14360o3.A0B(c193328hC, 0);
        c193328hC.A0m(this, A01(this));
        return c193328hC;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return false;
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return true;
    }

    @Override // X.C38M
    public final void D4P(SparseArray sparseArray, Integer num) {
    }

    @Override // X.C38M
    public final void D4Q() {
    }

    @Override // X.C38M
    public final void D4R() {
    }

    @Override // X.C38M
    public final void D4T(SparseArray sparseArray) {
    }

    @Override // X.C38N
    public final void DJj(View view, C38321qM c38321qM, int i) {
        int i2;
        C14360o3.A0B(c38321qM, 0);
        C140966Yy c140966Yy = new C140966Yy(requireActivity(), A01(this));
        IgFragmentFactoryImpl.A00();
        String id = c38321qM.getId();
        if (id != null) {
            C35028Fc1 c35028Fc1 = new C35028Fc1();
            c35028Fc1.A0B = id;
            c35028Fc1.A0O = true;
            c35028Fc1.A01 = this.A01;
            c140966Yy.A0D(c35028Fc1.A02());
            if (c38321qM.Cff()) {
                i2 = 5560;
            } else {
                i2 = 5053;
            }
            c140966Yy.A0B = AbstractC111324zv.A00(i2);
            c140966Yy.A04();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C38N
    public final boolean DJk(MotionEvent motionEvent, View view, InterfaceC38411qV interfaceC38411qV, int i) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(motionEvent, 1);
        C14360o3.A0B(interfaceC38411qV, 2);
        AnonymousClass308 anonymousClass308 = this.A0P;
        if (anonymousClass308 == null) {
            C14360o3.A0F("peekMediaController");
            throw C00O.createAndThrow();
        }
        return anonymousClass308.DuC(motionEvent, view, interfaceC38411qV, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x001d, code lost:
    
        if (requireArguments().getBoolean(X.AbstractC111324zv.A00(2127)) != false) goto L8;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r5) {
        /*
            r4 = this;
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            X.0h2 r0 = r4.mFragmentManager
            if (r0 == 0) goto Le
            int r0 = r0.A0L()
            if (r0 > 0) goto L1f
        Le:
            android.os.Bundle r1 = r4.requireArguments()
            r0 = 2127(0x84f, float:2.98E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            r2 = 0
            if (r0 == 0) goto L20
        L1f:
            r2 = 1
        L20:
            r1 = r5
            X.2iT r1 = (X.C56352iT) r1
            r0 = 0
            r1.EkT(r0, r2)
            android.os.Bundle r1 = r4.requireArguments()
            r0 = 2133(0x855, float:2.989E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L3b
            r5.setTitle(r0)
        L3a:
            return
        L3b:
            boolean r0 = r4.A0X
            if (r0 == 0) goto L46
            r1 = 2131971019(0x7f134bcb, float:1.9579005E38)
        L42:
            r5.Efu(r1)
            return
        L46:
            X.1tc r0 = r4.A04
            if (r0 == 0) goto L3a
            int r1 = r0.ordinal()
            if (r1 == r3) goto L65
            r0 = 1
            if (r1 == r0) goto L5a
            r0 = 4
            if (r1 != r0) goto L3a
            r1 = 2131969835(0x7f13472b, float:1.9576604E38)
            goto L42
        L5a:
            boolean r0 = r4.A0W
            r1 = 2131976620(0x7f1361ac, float:1.9590366E38)
            if (r0 == 0) goto L42
            r1 = 2131955208(0x7f130e08, float:1.9546937E38)
            goto L42
        L65:
            r1 = 2131969575(0x7f134627, float:1.9576077E38)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38J.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0K;
        if (viewOnTouchListenerC60632pm == null) {
            str = "_helper";
        } else {
            C3FQ scrollingViewProxy = getScrollingViewProxy();
            C38977HEf c38977HEf = this.A09;
            if (c38977HEf == null) {
                str = "adapter";
            } else {
                viewOnTouchListenerC60632pm.A06(c38977HEf, scrollingViewProxy, C3HB.A00(requireContext()));
                AbstractC05560Rg.A00(this);
                ((AbstractC05560Rg) this).A04.setOnScrollListener(this);
                AbstractC05560Rg.A00(this);
                View emptyView = ((AbstractC05560Rg) this).A04.getEmptyView();
                C14360o3.A0C(emptyView, MSV.A00(14));
                EmptyStateView emptyStateView = (EmptyStateView) emptyView;
                this.A0R = emptyStateView;
                if (emptyStateView != null) {
                    emptyStateView.A0N(new ViewOnClickListenerC35528FmJ(this), EnumC153216up.A04);
                    A05(this);
                    C71313Hs.A00(A01(this)).A05(view, EnumC71343Hv.A0M);
                    AbstractC25651Mw.A00(A01(this)).A01(this.A0i, C3HW.class);
                    InterfaceC114705Ga interfaceC114705Ga = this.A0N;
                    if (interfaceC114705Ga != null) {
                        Application application = requireActivity().getApplication();
                        C14360o3.A07(application);
                        AbstractC35068Fcf.A00(this, (C44451JlJ) new C52942bb(new JnC(application, A01(this), interfaceC114705Ga), this).A00(C44451JlJ.class));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final UserSession A01(C38J c38j) {
        return (UserSession) c38j.A0l.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a6, code lost:
    
        if (r58.CdW() != true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r58.A63() != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00be, code lost:
    
        if (r58.A4t() != true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(android.app.Activity r56, X.EnumC120785dO r57, X.C38321qM r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, boolean r62, boolean r63) {
        /*
            r55 = this;
            r1 = r55
            r29 = r62
            java.lang.String r16 = r1.getModuleName()
            r2 = r58
            if (r58 == 0) goto L14
            com.instagram.common.session.UserSession r0 = A01(r1)
            boolean r29 = X.C2TN.A02(r0, r2)
        L14:
            r3 = 1
            r31 = 0
            r8 = 0
            int r0 = r1.A00
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r31)
            if (r58 == 0) goto L2c
            boolean r0 = r2.A63()
            r37 = 1
            if (r0 == r3) goto Lb4
        L2c:
            r37 = 0
            if (r58 != 0) goto Lb4
            r28 = 0
        L32:
            r46 = 0
        L34:
            X.BfE r6 = new X.BfE
            r7 = r57
            r14 = r59
            r17 = r60
            r20 = r61
            r48 = r63
            r11 = r8
            r12 = r8
            r13 = r8
            r15 = r8
            r18 = r8
            r19 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r8
            r26 = r8
            r27 = r8
            r30 = r3
            r32 = r31
            r33 = r31
            r34 = r31
            r35 = r31
            r36 = r31
            r38 = r31
            r39 = r31
            r40 = r31
            r41 = r31
            r42 = r31
            r43 = r31
            r44 = r31
            r45 = r31
            r47 = r31
            r49 = r31
            r50 = r31
            r51 = r31
            r52 = r31
            r53 = r31
            r54 = r31
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            X.1XD r0 = X.AnonymousClass548.A00()
            X.CUa r9 = r0.A00()
            com.instagram.common.session.UserSession r13 = A01(r1)
            com.instagram.common.session.UserSession r5 = A01(r1)
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36318741671516604(0x8107b4000519bc, double:3.031456704676909E-306)
            boolean r16 = X.C18U.A06(r4, r5, r0)
            if (r58 == 0) goto La8
            boolean r0 = r2.CdW()
            r18 = 1
            if (r0 == r3) goto Laa
        La8:
            r18 = 0
        Laa:
            r10 = r56
            r12 = r6
            r14 = r8
            r17 = r31
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        Lb4:
            int r28 = r2.A0s()
            boolean r0 = r2.A4t()
            r46 = 1
            if (r0 == r3) goto L34
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38J.A02(android.app.Activity, X.5dO, X.1qM, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public static final void A04(C38J c38j) {
        C1ON A04;
        C25621Ms A00;
        String str;
        String str2 = c38j.A0A;
        if (str2 != null) {
            C154796xU c154796xU = c38j.A02;
            if (c154796xU == null) {
                C14360o3.A0F("feedNetworkSource");
                throw C00O.createAndThrow();
            }
            String str3 = c38j.A0C;
            if (str3 != null) {
                A00 = AbstractC2044893h.A00(A01(c38j), C05F.A00, str2);
                A00.A9s("preview_comment_id", str3);
            } else {
                if (c38j.A0F) {
                    A00 = AbstractC2044893h.A00(A01(c38j), C05F.A00, str2);
                    str = "preview_gating_reason";
                } else if (c38j.A0E) {
                    A00 = AbstractC2044893h.A00(A01(c38j), C05F.A00, str2);
                    str = "should_send_only_user_owned_media";
                } else {
                    if (c38j.A0H) {
                        A04 = AbstractC2044893h.A03(A01(c38j), str2);
                    } else {
                        A04 = AbstractC2044893h.A04(A01(c38j), str2);
                    }
                    c154796xU.A03(A04, new HL7(c38j));
                }
                A00.A9s(str, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            A04 = A00.A0N();
            c154796xU.A03(A04, new HL7(c38j));
        }
    }

    public static final void A05(C38J c38j) {
        EmptyStateView emptyStateView = c38j.A0R;
        if (emptyStateView != null) {
            if (c38j.isLoading()) {
                emptyStateView.A0L();
            } else {
                if (!c38j.CUG()) {
                    return;
                }
                emptyStateView.A0J();
            }
        }
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C154796xU c154796xU = this.A02;
        if (c154796xU == null) {
            C14360o3.A0F("feedNetworkSource");
            throw C00O.createAndThrow();
        }
        if (c154796xU.A06()) {
            A04(this);
        }
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0K;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("_helper");
            throw C00O.createAndThrow();
        }
        return viewOnTouchListenerC60632pm;
    }

    @Override // X.InterfaceC60162oy
    public final Integer BRW() {
        return C05F.A00;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        if (this.A09 == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        return !((AbstractC65332xV) r0.A04).A01.isEmpty();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C154796xU c154796xU = this.A02;
        if (c154796xU == null) {
            C14360o3.A0F("feedNetworkSource");
            throw C00O.createAndThrow();
        }
        if (c154796xU.A03.A03 != C05F.A01) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (this.A09 == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        return !(!((AbstractC65332xV) r0.A04).A01.isEmpty());
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A06(this.A0j.A00);
        return c11520jB;
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        return this.A01;
    }

    @Override // X.InterfaceC60162oy
    public final String getMediaId() {
        return this.A0A;
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C154796xU c154796xU = this.A02;
        if (c154796xU == null) {
            C14360o3.A0F("feedNetworkSource");
            throw C00O.createAndThrow();
        }
        if (c154796xU.A03.A03 != C05F.A00) {
            return false;
        }
        return true;
    }

    public C38J() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0f = AbstractC09440dt.A00(enumC09460dv, new C9EN(this, 34));
        this.A0h = AbstractC09440dt.A00(enumC09460dv, new C9EN(this, 39));
        this.A0g = AbstractC09440dt.A01(new C9EN(this, 35));
        C9EN c9en = new C9EN(this, 33);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C9EN(new C9EN(this, 36), 37));
        this.A0e = new C60842q8(new C9EN(A00, 38), c9en, new C9F2(1, null, A00), new C0YZ(Object.class));
    }

    @Override // X.InterfaceC60162oy
    public final String BkH() {
        C38321qM A02 = C1DW.A00(A01(this)).A02(this.A0A);
        if (A02 != null) {
            return A02.A0C.Bk6();
        }
        return null;
    }

    @Override // X.C38M
    public final void D4S() {
        C140966Yy c140966Yy = new C140966Yy(requireActivity(), A01(this));
        C1XQ c1xq = AbstractC31412DrH.A00().A00;
        UserSession A01 = A01(this);
        String str = this.A0D;
        if (str != null) {
            c140966Yy.A0B(null, c1xq.CsY(A01, str, null, this.A0k, null, false));
            c140966Yy.A04();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        return E6P();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        if (X.AbstractC001900j.A0a(r4, r7, false) != false) goto L41;
     */
    @Override // X.InterfaceC11380iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getModuleName() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38J.getModuleName():java.lang.String");
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C38321qM A02 = C1DW.A00(A01(this)).A02(this.A0A);
        if (this.A0Z && A02 != null) {
            Intent intent = new Intent();
            intent.putExtra(AbstractC111324zv.A00(2372), this.A0A);
            C38977HEf c38977HEf = this.A09;
            if (c38977HEf == null) {
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            }
            intent.putExtra(AbstractC111324zv.A00(2371), c38977HEf.BRZ(A02).A2t);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(-1, intent);
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x04bc, code lost:
    
        if (r2 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a5, code lost:
    
        if (X.C57582kX.A00(r11).A0N(r8) != com.instagram.user.model.FollowStatus.A06) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x045c, code lost:
    
        if (r2.A2E(A01(r33)) != null) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0238  */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.2fr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, X.392] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 1509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38J.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1148352055);
        C14360o3.A0B(layoutInflater, 0);
        this.A0J = layoutInflater.inflate(R.layout.layout_feed_refresh_options, viewGroup, false);
        A01(this);
        View view = this.A0J;
        if (view != null) {
            J1O j1o = new J1O(view, new GHt(this));
            C3HB.A00(requireContext());
            this.A07 = j1o;
            View view2 = this.A0J;
            C0f9.A09(-2071834424, A02);
            return view2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        C0f9.A09(985825258, A02);
        throw illegalStateException;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-947839675);
        super.onDestroy();
        this.A0I = null;
        C0f9.A09(-192455228, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(159590246);
        super.onDestroyView();
        this.A0R = null;
        this.A0J = null;
        Handler handler = this.A0I;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        AbstractC25651Mw.A00(A01(this)).A02(this.A0i, C3HW.class);
        C0f9.A09(-357769751, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        String str;
        int A02 = C0f9.A02(1080314887);
        super.onPause();
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0K;
        if (viewOnTouchListenerC60632pm == null) {
            str = "_helper";
        } else {
            C3FQ scrollingViewProxy = getScrollingViewProxy();
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            viewOnTouchListenerC60632pm.A09(scrollingViewProxy);
            C3MJ c3mj = this.A0L;
            if (c3mj != null) {
                str = "screenshotDetector";
                c3mj.A06(this.A0M);
                C3MJ c3mj2 = this.A0L;
                if (c3mj2 != null) {
                    c3mj2.A04();
                    this.A0M = null;
                }
            }
            C0f9.A09(-1155233952, A02);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.3Lq] */
    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        AbstractC10360h2 abstractC10360h2;
        int A02 = C0f9.A02(-1316296566);
        super.onResume();
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0K;
        if (viewOnTouchListenerC60632pm == 0) {
            str = "_helper";
        } else {
            viewOnTouchListenerC60632pm.A04(C56352iT.A0t.A03(requireActivity()).A0P, new Object(), C3HB.A00(requireContext()));
            if (this.A0G && (abstractC10360h2 = this.mFragmentManager) != null) {
                abstractC10360h2.A0b();
            }
            FragmentActivity requireActivity = requireActivity();
            C1OU c1ou = C1OU.$redex_init_class;
            C3M4 A05 = C3M4.A05(requireActivity);
            if (A05 != null && A05.A0a() && A05.A0G == C3G2.A1q) {
                A05.A0Y(this);
            }
            C3MJ c3mj = this.A0L;
            str = "screenshotDetector";
            if (c3mj != null) {
                c3mj.A03();
                if (this.A0L != null) {
                    C3MT A00 = C3MJ.A00(new C3MQ(A01(this), this, this, this.A0S));
                    C3MJ c3mj2 = this.A0L;
                    if (c3mj2 != null) {
                        c3mj2.A05(A00);
                        this.A0M = A00;
                        C0f9.A09(520820108, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        InterfaceC70513Em interfaceC70513Em;
        InterfaceC70513Em interfaceC70513Em2;
        int A03 = C0f9.A03(-715024831);
        C14360o3.A0B(absListView, 0);
        if (!C2U7.A00 || isVisible()) {
            C38321qM A02 = C1DW.A00(A01(this)).A02(this.A0A);
            if (A02 != null) {
                C38977HEf c38977HEf = this.A09;
                if (c38977HEf == null) {
                    C14360o3.A0F("adapter");
                    throw C00O.createAndThrow();
                }
                C75113Zb BRZ = c38977HEf.BRZ(A02);
                AbstractC05560Rg.A00(this);
                ListView listView = ((AbstractC05560Rg) this).A04;
                C14360o3.A0C(listView, "null cannot be cast to non-null type com.instagram.ui.widget.refresh.RefreshableListView");
                if (((RefreshableListView) listView).A08) {
                    if (BRZ.Ceb() && (interfaceC70513Em2 = this.A07) != null) {
                        interfaceC70513Em2.APU();
                    }
                } else if (!BRZ.Ceb() && (interfaceC70513Em = this.A07) != null) {
                    interfaceC70513Em.ARj();
                }
            }
            this.A0c.onScroll(absListView, i, i2, i3);
        }
        C0f9.A0A(313882293, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C0f9.A03(217967744);
        C14360o3.A0B(absListView, 0);
        this.A0c.onScrollStateChanged(absListView, i);
        C0f9.A0A(1484898509, A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(799163283);
        super.onStart();
        if (this.A0V && (getRootActivity() instanceof InterfaceC53712dA)) {
            ComponentCallbacks2 rootActivity = getRootActivity();
            C14360o3.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((InterfaceC53712dA) rootActivity).EfL(8);
        }
        C0f9.A09(-2023687670, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1072100185);
        super.onStop();
        if (this.A0V && (getRootActivity() instanceof InterfaceC53712dA)) {
            ComponentCallbacks2 rootActivity = getRootActivity();
            C14360o3.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((InterfaceC53712dA) rootActivity).EfL(0);
        }
        C0f9.A09(-701544073, A02);
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A04(this);
    }
}
