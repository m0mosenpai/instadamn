package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebook.systrace.Systrace;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6vL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153506vL extends AbstractC59962oe implements C1M1, InterfaceC60442pS, InterfaceC152836uD, InterfaceC152846uE, InterfaceC101554hQ, InterfaceC153516vM, InterfaceC153526vN {
    public static final String __redex_internal_original_name = "ClipsProfileTabFragment";
    public RecyclerView A00;
    public ShimmerFrameLayout A01;
    public C154836xY A02;
    public C75E A03;
    public IgdsEmptyState A04;
    public UserDetailTabController A05;
    public C154056wE A06;
    public C153766vl A07;
    public C154066wG A08;
    public C153656va A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public C25671My A0K;
    public C57112jm A0L;
    public MWZ A0M;
    public C62882tR A0N;
    public C155996zT A0O;
    public C1M1 A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public long A0J = -1;
    public final InterfaceC41501vz A0W = new InterfaceC42271xH() { // from class: X.6vU
        @Override // X.InterfaceC42271xH
        public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
            C154096wJ c154096wJ = (C154096wJ) obj;
            C14360o3.A0B(c154096wJ, 0);
            return C2TN.A05(C153506vL.this.getSession(), c154096wJ.A00);
        }

        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            C154056wE c154056wE;
            String str;
            int A03 = C0f9.A03(1977258983);
            C154096wJ c154096wJ = (C154096wJ) obj;
            int A032 = C0f9.A03(1000255409);
            C14360o3.A0B(c154096wJ, 0);
            C153506vL c153506vL = C153506vL.this;
            C62832tM A00 = AbstractC62822tL.A00(c153506vL.getSession());
            String str2 = c153506vL.A0B;
            if (str2 == null) {
                str = "gridKey";
            } else {
                C125605m6 c125605m6 = (C125605m6) A00.A01.get(str2);
                if (c125605m6 != null) {
                    c125605m6.A07 = true;
                }
                if (c154096wJ.A01) {
                    C153656va c153656va = c153506vL.A09;
                    if (c153656va == null) {
                        str = "clipsProfileTabFetcher";
                    } else {
                        c153656va.A01();
                    }
                } else {
                    c153506vL.A0I = true;
                }
                if (c153506vL.A0H && c154096wJ.A02 && (c154056wE = c153506vL.A06) != null) {
                    c154056wE.A00();
                }
                C0f9.A0A(709465347, A032);
                C0f9.A0A(-1237371320, A03);
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public final InterfaceC41501vz A0U = new InterfaceC42271xH() { // from class: X.6vV
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(-1457259519);
            C154106wK c154106wK = (C154106wK) obj;
            int A032 = C0f9.A03(261613605);
            C14360o3.A0B(c154106wK, 0);
            C154066wG c154066wG = C153506vL.this.A08;
            if (c154066wG == null) {
                C14360o3.A0F("clipsGridItemsStoreFragmentLifecycleListener");
                throw C00O.createAndThrow();
            }
            c154066wG.A00(c154106wK.A00, EnumC125615m7.A03, c154106wK.A01, true);
            C0f9.A0A(1841781414, A032);
            C0f9.A0A(510649658, A03);
        }

        @Override // X.InterfaceC42271xH
        public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
            return true;
        }
    };
    public final InterfaceC41501vz A0V = new InterfaceC41501vz() { // from class: X.6vW
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            C38321qM c38321qM;
            int A03 = C0f9.A03(-1728250572);
            C154086wI c154086wI = (C154086wI) obj;
            int A032 = C0f9.A03(-707959638);
            C14360o3.A0B(c154086wI, 0);
            C153506vL c153506vL = C153506vL.this;
            C153766vl c153766vl = c153506vL.A07;
            if (c153766vl == null) {
                C14360o3.A0F("clipsGridAdapter");
                throw C00O.createAndThrow();
            }
            Iterator it = c153766vl.A01().iterator();
            int i = 0;
            while (it.hasNext() && ((c38321qM = ((C154026wB) it.next()).A03.A02) == null || !c38321qM.A6n(c153506vL.getSession().userId) || (i = i + 1) < 3)) {
            }
            c154086wI.A00.invoke(Integer.valueOf(i));
            C0f9.A0A(-1686219688, A032);
            C0f9.A0A(1060006965, A03);
        }
    };
    public final InterfaceC41501vz A0X = new InterfaceC41501vz() { // from class: X.6vX
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            String str;
            int A03 = C0f9.A03(1563155501);
            C154116wL c154116wL = (C154116wL) obj;
            int A032 = C0f9.A03(1916392803);
            C14360o3.A0B(c154116wL, 0);
            C153506vL c153506vL = C153506vL.this;
            C153656va c153656va = c153506vL.A09;
            if (c153656va == null) {
                str = "clipsProfileTabFetcher";
            } else {
                ((AbstractC153666vb) c153656va).A00 = c154116wL.A00;
                C153766vl c153766vl = c153506vL.A07;
                if (c153766vl == null) {
                    str = "clipsGridAdapter";
                } else {
                    c153766vl.A03();
                    c153506vL.A0E = false;
                    C153506vL.A02(c153506vL, true);
                    C0f9.A0A(-621172498, A032);
                    C0f9.A0A(-365882905, A03);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public final InterfaceC09390do A0Y = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC152836uD, X.InterfaceC152846uE
    public final String Bi9() {
        return "profile_clips";
    }

    @Override // X.InterfaceC153566vR
    public final void D51(View view) {
        C14360o3.A0B(view, 0);
        C153936w2 A01 = AbstractC153926w1.A01(this, getSession(), getSessionId());
        A01.A06(true);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            DH2 dh2 = new DH2(33, A01, view, this);
            D8J d8j = new D8J(10, A01, this);
            C32240EHy c32240EHy = new C32240EHy();
            c32240EHy.A00 = dh2;
            c32240EHy.A01 = d8j;
            UserSession session = getSession();
            C14360o3.A0B(session, 0);
            new C189448aO(session).A00().A02(activity, c32240EHy);
            C153936w2.A05(A01, DexOptimization.OPT_KEY_CLIENT, "self_profile_action_sheet", "impression");
        }
    }

    @Override // X.InterfaceC153536vO
    public final /* synthetic */ void D55(User user) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r1 != false) goto L26;
     */
    @Override // X.InterfaceC153536vO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5T(X.C120985dq r17, int r18) {
        /*
            r16 = this;
            r15 = 0
            r2 = r17
            X.C14360o3.A0B(r2, r15)
            r6 = r16
            X.6xY r1 = r6.A02
            if (r1 != 0) goto L16
            java.lang.String r0 = "clipsProfileTabPerfLogger"
        Le:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L16:
            java.lang.String r0 = "thumbnail_preview_click_attempt"
            r1.A0E(r0)
            X.3DO r1 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.3DN r1 = r1.A00(r0)
            if (r1 == 0) goto L32
            X.3DP r1 = (X.C3DP) r1
            boolean r0 = r1.A0h
            if (r0 == 0) goto L32
            boolean r0 = r1.A0o
            r1 = 1
            if (r0 != 0) goto L33
        L32:
            r1 = 0
        L33:
            X.1qM r5 = r2.A02
            if (r5 == 0) goto L89
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            com.instagram.common.session.UserSession r4 = r6.getSession()
            java.lang.String r8 = r6.getModuleName()
            boolean r13 = r6.A0H
            java.lang.String r9 = r6.A0C
            if (r9 != 0) goto L4c
            java.lang.String r0 = "profileUserId"
            goto Le
        L4c:
            java.lang.String r10 = r6.A0B
            if (r10 != 0) goto L53
            java.lang.String r0 = "gridKey"
            goto Le
        L53:
            boolean r0 = r6.A0S
            if (r0 != 0) goto L5a
            r14 = 0
            if (r1 == 0) goto L5b
        L5a:
            r14 = 1
        L5b:
            java.lang.String r2 = r6.A0A
            r7 = 0
            if (r2 == 0) goto L82
            r0 = 408(0x198, float:5.72E-43)
            java.lang.String r1 = X.MSV.A00(r0)
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            boolean r0 = r2.startsWith(r1)
            if (r0 == 0) goto L82
            java.lang.String r1 = r6.A0D
            if (r1 == 0) goto L82
            X.1rC r0 = X.C38321qM.A0h     // Catch: java.lang.NumberFormatException -> L82
            java.lang.String r0 = X.C38801rC.A06(r1)     // Catch: java.lang.NumberFormatException -> L82
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L82
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L82
        L82:
            java.lang.String r11 = r6.A0Q
            r12 = r18
            X.AbstractC41751IeQ.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153506vL.D5T(X.5dq, int):void");
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        C14360o3.A0B(c120985dq, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(motionEvent, 2);
        C154836xY c154836xY = this.A02;
        C38N c38n = null;
        if (c154836xY == null) {
            C14360o3.A0F("clipsProfileTabPerfLogger");
            throw C00O.createAndThrow();
        }
        c154836xY.A0E("thumbnail_preview_peek_attempt");
        InterfaceC08430c6 interfaceC08430c6 = this.mParentFragment;
        if (interfaceC08430c6 instanceof C38N) {
            c38n = (C38N) interfaceC08430c6;
        }
        C38321qM c38321qM = c120985dq.A02;
        if (c38n != null && c38321qM != null) {
            return c38n.DJk(motionEvent, view, c38321qM, i);
        }
        return false;
    }

    @Override // X.InterfaceC152846uE
    public final void DXk(int i, ViewGroup viewGroup) {
        int i2;
        C14360o3.A0B(viewGroup, 1);
        View requireViewById = viewGroup.requireViewById(R.id.use_in_camera_button_scene_root);
        C14360o3.A07(requireViewById);
        View requireViewById2 = viewGroup.requireViewById(R.id.profile_header_container);
        C14360o3.A07(requireViewById2);
        requireViewById.measure(0, 0);
        int measuredHeight = requireViewById.getMeasuredHeight();
        Rect rect = new Rect();
        Resources resources = viewGroup.getContext().getResources();
        requireViewById2.getDrawingRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(requireViewById2, rect);
        int i3 = rect.bottom;
        IgdsEmptyState igdsEmptyState = this.A04;
        if (igdsEmptyState != null) {
            i2 = Math.max(igdsEmptyState.getHeight(), 0);
        } else {
            i2 = 0;
        }
        if (this.A0H && this.A0G && i3 > 0 && !this.A0F && viewGroup.getHeight() - i3 >= i2 + measuredHeight + resources.getDimensionPixelOffset(R.dimen.abc_dialog_padding_material)) {
            if (requireViewById.getVisibility() == 8) {
                C18920wW A02 = AbstractC12220kQ.A02(getSession());
                InterfaceC02590Ai A00 = A02.A00(A02.A00, "ig_camera_clips_tab_camera_button_impression");
                if (A00.isSampled()) {
                    A00.A8R(EnumC114925Hg.CLIPS, "camera_destination");
                    A00.A8p("entity_type", 8);
                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                    A00.Cht();
                }
            }
            requireViewById.setVisibility(0);
            return;
        }
        requireViewById.setVisibility(8);
    }

    @Override // X.InterfaceC101554hQ
    public final void DXz() {
    }

    @Override // X.InterfaceC101554hQ
    public final void DY1() {
    }

    @Override // X.InterfaceC152836uD
    public final void DcV(UserDetailTabController userDetailTabController) {
        C154056wE c154056wE;
        String str;
        C14360o3.A0B(userDetailTabController, 0);
        if (this.A05 == null) {
            this.A05 = userDetailTabController;
            C62832tM A00 = AbstractC62822tL.A00(getSession());
            String str2 = this.A0B;
            if (str2 == null) {
                str = "gridKey";
            } else {
                C125605m6 c125605m6 = (C125605m6) A00.A01.get(str2);
                if (c125605m6 != null) {
                    c125605m6.A07 = true;
                }
                C153656va c153656va = this.A09;
                if (c153656va == null) {
                    str = "clipsProfileTabFetcher";
                } else {
                    c153656va.A01();
                    if (this.A0H && (c154056wE = this.A06) != null) {
                        c154056wE.A00();
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC152846uE
    public final void Dfk(int i) {
    }

    @Override // X.InterfaceC152846uE
    public final void Dix(boolean z) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drw() {
        this.A0G = false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        C14360o3.A0B(configuration, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ClipsProfileTabFragment.onConfigurationChanged", -978647287);
        }
        try {
            super.onConfigurationChanged(configuration);
            Configuration configuration2 = requireContext().getResources().getConfiguration();
            C14360o3.A07(configuration2);
            if (AbstractC68606VXh.A00(configuration2, configuration) && (recyclerView = this.A00) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC23265ATa(this));
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-720662836);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1606711703);
            }
            throw th;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC70663Fe abstractC70663Fe;
        Boolean BBu;
        RecyclerView recyclerView;
        C14360o3.A0B(view, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ClipsProfileTabFragment.onViewCreated", 1256633514);
        }
        try {
            super.onViewCreated(view, bundle);
            Context requireContext = requireContext();
            FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext, 3);
            C153766vl c153766vl = this.A07;
            if (c153766vl != null) {
                ((GridLayoutManager) fastScrollingGridLayoutManager).A01 = (AbstractC154146wP) c153766vl.A0P.getValue();
                this.A01 = (ShimmerFrameLayout) view.requireViewById(R.id.clips_grid_shimmer_container);
                RecyclerView recyclerView2 = (RecyclerView) view.requireViewById(R.id.clips_grid_recyclerview);
                this.A00 = recyclerView2;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutManager(fastScrollingGridLayoutManager);
                }
                RecyclerView recyclerView3 = this.A00;
                if (recyclerView3 != null) {
                    C153766vl c153766vl2 = this.A07;
                    if (c153766vl2 != null) {
                        recyclerView3.setAdapter(c153766vl2.A0I);
                    }
                }
                UserSession session = getSession();
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, session, 36322980804242217L) && (recyclerView = this.A00) != null) {
                    recyclerView.setItemAnimator(null);
                }
                IgdsEmptyState igdsEmptyState = (IgdsEmptyState) view.requireViewById(R.id.clips_profile_tab_empty_view);
                this.A04 = igdsEmptyState;
                if (igdsEmptyState != null) {
                    igdsEmptyState.setHeadline(2131955684);
                }
                IgdsEmptyState igdsEmptyState2 = this.A04;
                if (igdsEmptyState2 != null) {
                    igdsEmptyState2.setIsEmphasized(true);
                }
                IgdsEmptyState igdsEmptyState3 = this.A04;
                if (igdsEmptyState3 != null) {
                    igdsEmptyState3.EPC(new View.OnClickListener() { // from class: X.6wQ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int A05 = C0f9.A05(783466770);
                            C153506vL.this.D1P();
                            C0f9.A0C(646475011, A05);
                        }
                    }, 2131955683);
                }
                IgdsEmptyState igdsEmptyState4 = this.A04;
                int i = 0;
                if (igdsEmptyState4 != null) {
                    int i2 = 8;
                    if (this.A0F) {
                        i2 = 0;
                    }
                    igdsEmptyState4.setVisibility(i2);
                }
                C18A A00 = AnonymousClass189.A00(getSession());
                String str = this.A0C;
                if (str != null) {
                    User A02 = A00.A02(str);
                    C153766vl c153766vl3 = this.A07;
                    if (c153766vl3 != null) {
                        if (C153766vl.A00(c153766vl3).size() != 0 || (A02 != null && A02.A06() == 0)) {
                            ShimmerFrameLayout shimmerFrameLayout = this.A01;
                            if (shimmerFrameLayout != null) {
                                shimmerFrameLayout.A05();
                            }
                        } else {
                            if (!C18U.A06(c06090Tz, getSession(), 36324673022865773L)) {
                                C153766vl c153766vl4 = this.A07;
                                if (c153766vl4 != null) {
                                    c153766vl4.A04(9);
                                }
                            }
                            ShimmerFrameLayout shimmerFrameLayout2 = this.A01;
                            if (shimmerFrameLayout2 != null) {
                                shimmerFrameLayout2.A02();
                            }
                        }
                        C153656va c153656va = this.A09;
                        if (c153656va == null) {
                            C14360o3.A0F("clipsProfileTabFetcher");
                        } else {
                            C153146ui c153146ui = C153146ui.A06;
                            RecyclerView recyclerView4 = this.A00;
                            if (recyclerView4 != null && (abstractC70663Fe = recyclerView4.A0D) != null) {
                                C153156uj c153156uj = new C153156uj(abstractC70663Fe, c153656va, c153146ui, true, false);
                                int i3 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                                C62882tR c62882tR = new C62882tR(requireActivity(), this, getSession(), 23608081);
                                this.A0N = c62882tR;
                                c62882tR.A03 = C05F.A01;
                                RecyclerView recyclerView5 = this.A00;
                                if (recyclerView5 != null) {
                                    recyclerView5.A14(c62882tR);
                                }
                                registerLifecycleListener(c62882tR);
                                RecyclerView recyclerView6 = this.A00;
                                if (recyclerView6 != null) {
                                    recyclerView6.A14(c153156uj);
                                }
                                if (this.A0H) {
                                    AbstractC23641Du.A03(C05F.A00, C12L.A00.CPG(480314591, 3), new C206629Ct(this, null, 46), AbstractC57302k5.A00(getLifecycle()));
                                }
                                C57112jm c57112jm = this.A0L;
                                if (c57112jm == null) {
                                    C14360o3.A0F("viewpointManager");
                                } else {
                                    c57112jm.A08(this.A00, C71163Hc.A00(this), new InterfaceC57142jp[0]);
                                    if (this.A0H) {
                                        C75E c75e = this.A03;
                                        if (c75e == null) {
                                            C14360o3.A0F("clipsDraftListViewModel");
                                        } else {
                                            c75e.A01.A06(getViewLifecycleOwner(), new C152256tB(new C9E2(this, 19)));
                                            C07S c07s = C07S.STARTED;
                                            C07X viewLifecycleOwner = getViewLifecycleOwner();
                                            C57312k6 A002 = C07Y.A00(viewLifecycleOwner);
                                            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C9DM(c07s, requireContext, this, viewLifecycleOwner, (InterfaceC23621Ds) null, 18), A002);
                                        }
                                    }
                                    if (A02 != null && (BBu = A02.A03.BBu()) != null && BBu.booleanValue()) {
                                        UserSession session2 = getSession();
                                        C14360o3.A0B(session2, 0);
                                        if (!C18U.A06(c06090Tz, session2, 36323547739598176L)) {
                                            C153766vl c153766vl5 = this.A07;
                                            if (c153766vl5 != null) {
                                                if (!c153766vl5.A09) {
                                                    c153766vl5.A07 = false;
                                                }
                                                c153766vl5.A09 = true;
                                                c153766vl5.update();
                                                UserSession session3 = getSession();
                                                String str2 = this.A0C;
                                                if (str2 != null) {
                                                    this.A0M = new MWZ(getViewLifecycleOwner(), session3, this, str2);
                                                    i = 1;
                                                }
                                            }
                                        }
                                    }
                                    RecyclerView recyclerView7 = this.A00;
                                    if (recyclerView7 != null) {
                                        recyclerView7.A10(AbstractC154166wR.A00(requireContext, i, true));
                                    }
                                    if (Systrace.A0E(1L)) {
                                        C0fO.A00(1320532527);
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                }
                C14360o3.A0F("profileUserId");
            }
            C14360o3.A0F("clipsGridAdapter");
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(708552364);
            }
            throw th;
        }
    }

    public static final void A02(C153506vL c153506vL, boolean z) {
        Integer num;
        if (Systrace.A0E(1L)) {
            C0fO.A01("ClipsProfileTabFragment.maybeFetch", -745797197);
        }
        try {
            if (!c153506vL.A0E || c153506vL.A0I) {
                C154836xY c154836xY = c153506vL.A02;
                if (c154836xY == null) {
                    C14360o3.A0F("clipsProfileTabPerfLogger");
                } else {
                    Context requireContext = c153506vL.requireContext();
                    String str = c153506vL.A0C;
                    if (str == null) {
                        C14360o3.A0F("profileUserId");
                    } else {
                        if (!c154836xY.A01) {
                            c154836xY.A01 = true;
                            c154836xY.A0P(requireContext, C55772hI.A00(c154836xY.A02), c153506vL, true);
                            c154836xY.A0M();
                            c154836xY.A0T(str);
                            if ("profile_clips".length() != 0) {
                                ((C154846xZ) c154836xY).A01 = "profile_clips";
                            }
                        }
                        if (c153506vL.A0I) {
                            C153656va c153656va = c153506vL.A09;
                            if (c153656va != null) {
                                c153656va.A01();
                                c153506vL.A0I = false;
                            }
                            C14360o3.A0F("clipsProfileTabFetcher");
                        } else {
                            UserSession session = c153506vL.getSession();
                            C14360o3.A0B(session, 0);
                            C06090Tz c06090Tz = C06090Tz.A05;
                            if (C18U.A06(c06090Tz, session, 36323745308225098L)) {
                                if (z) {
                                    UserSession session2 = c153506vL.getSession();
                                    C14360o3.A0B(session2, 0);
                                    if (C18U.A06(c06090Tz, session2, 36323745308880467L)) {
                                        C153656va c153656va2 = c153506vL.A09;
                                        if (c153656va2 != null) {
                                            c153656va2.A04(null, null, C16930sl.A00, false);
                                            c153506vL.A0E = true;
                                        }
                                        C14360o3.A0F("clipsProfileTabFetcher");
                                    }
                                }
                                C153656va c153656va3 = c153506vL.A09;
                                if (c153656va3 != null) {
                                    C153646vZ c153646vZ = c153656va3.A01;
                                    if (c153646vZ != null) {
                                        num = c153646vZ.A00;
                                    } else {
                                        num = null;
                                    }
                                    Integer num2 = C05F.A00;
                                    if (num != num2) {
                                        UserSession session3 = c153506vL.getSession();
                                        C14360o3.A0B(session3, 0);
                                        if (!C18U.A06(c06090Tz, session3, 36323745308880467L)) {
                                            C153656va c153656va4 = c153506vL.A09;
                                            if (c153656va4 != null) {
                                                C153646vZ c153646vZ2 = c153656va4.A01;
                                                if (c153646vZ2 != null) {
                                                    c153646vZ2.A00 = num2;
                                                }
                                                c153656va4.A04(null, null, C16930sl.A00, false);
                                                c153506vL.A0E = true;
                                            }
                                        }
                                    }
                                }
                                C14360o3.A0F("clipsProfileTabFetcher");
                            } else {
                                C153656va c153656va5 = c153506vL.A09;
                                if (c153656va5 != null) {
                                    c153656va5.A04(null, null, C16930sl.A00, false);
                                    c153506vL.A0E = true;
                                }
                                C14360o3.A0F("clipsProfileTabFetcher");
                            }
                        }
                    }
                }
                throw C00O.createAndThrow();
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(528817958);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1471114068);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r1 != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C153506vL r6, boolean r7) {
        /*
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r6.getSession()
            com.instagram.user.model.User r5 = r1.A01(r0)
            r4 = 0
            if (r7 == 0) goto L55
            com.instagram.common.session.UserSession r2 = r6.getSession()
            X.C14360o3.A0B(r2, r4)
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36318110311126923(0x8107210002178b, double:3.031057429824191E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 != 0) goto L40
            com.instagram.common.session.UserSession r2 = r6.getSession()
            boolean r0 = r5.A1X()
            X.C14360o3.A0B(r2, r4)
            if (r0 != 0) goto L55
            r0 = 36318110311782292(0x810721000c1794, double:3.031057430238649E-306)
            boolean r1 = X.C18U.A06(r3, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C14360o3.A0A(r0)
            if (r1 == 0) goto L55
        L40:
            r2 = 1
        L41:
            r6.A0F = r2
            com.instagram.igds.components.emptystate.IgdsEmptyState r1 = r6.A04
            if (r1 == 0) goto L54
            boolean r0 = r6.A0H
            if (r0 == 0) goto L4f
            if (r7 == 0) goto L4f
            if (r2 != 0) goto L51
        L4f:
            r4 = 8
        L51:
            r1.setVisibility(r4)
        L54:
            return
        L55:
            r2 = 0
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153506vL.A03(X.6vL, boolean):void");
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        return (UserSession) this.A0Y.getValue();
    }

    @Override // X.InterfaceC152836uD
    public final Fragment ACb() {
        return this;
    }

    @Override // X.InterfaceC153516vM
    public final List AoI() {
        List singletonList = Collections.singletonList(new InterfaceC62852tO() { // from class: X.6wM
            @Override // X.InterfaceC62852tO
            public final void D5C(C120985dq c120985dq, Integer num, int i) {
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
            
                if (r8.BUt() != true) goto L22;
             */
            @Override // X.InterfaceC62852tO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void D5D(X.InterfaceC111084zP r8, java.util.List r9, boolean r10, boolean r11) {
                /*
                    r7 = this;
                    r0 = 0
                    X.C14360o3.A0B(r9, r0)
                    X.6vL r2 = X.C153506vL.this
                    com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A01
                    if (r0 == 0) goto Ld
                    r0.A05()
                Ld:
                    java.lang.String r6 = "clipsGridAdapter"
                    if (r10 == 0) goto L2b
                    X.6vl r0 = r2.A07
                    if (r0 == 0) goto L94
                    r0.A03()
                    boolean r0 = r9.isEmpty()
                    java.lang.String r3 = "clipsProfileTabPerfLogger"
                    if (r0 == 0) goto L7c
                    X.6xY r0 = r2.A02
                    if (r0 == 0) goto L57
                    X.3Av r1 = r0.A00
                    java.lang.String r0 = "empty_page"
                    r1.A07(r0)
                L2b:
                    com.instagram.common.session.UserSession r4 = r2.getSession()
                    java.util.Map r3 = r7.A00(r9)
                    X.6vl r0 = r2.A07
                    if (r0 == 0) goto L94
                    X.6vi r1 = r0.A0L
                    java.lang.String r0 = r2.A0D
                    java.util.ArrayList r5 = X.AbstractC37873GlS.A00(r4, r1, r0, r9, r3)
                    X.6vl r4 = r2.A07
                    if (r4 == 0) goto L94
                    r3 = 1
                    if (r8 == 0) goto L4d
                    boolean r1 = r8.BUt()
                    r0 = 1
                    if (r1 == r3) goto L4e
                L4d:
                    r0 = 0
                L4e:
                    r4.A05(r5, r0)
                    X.6va r0 = r2.A09
                    if (r0 != 0) goto L5f
                    java.lang.String r3 = "clipsProfileTabFetcher"
                L57:
                    X.C14360o3.A0F(r3)
                L5a:
                    X.00O r0 = X.C00O.createAndThrow()
                    throw r0
                L5f:
                    r0.A02(r8)
                    X.6vl r0 = r2.A07
                    if (r0 == 0) goto L94
                    java.util.List r0 = X.C153766vl.A00(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L7a
                    boolean r0 = r9.isEmpty()
                    if (r0 == 0) goto L7a
                L76:
                    X.C153506vL.A03(r2, r3)
                    return
                L7a:
                    r3 = 0
                    goto L76
                L7c:
                    X.6xY r1 = r2.A02
                    if (r1 == 0) goto L57
                    int r0 = r9.size()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r1.A00 = r0
                    X.6xY r0 = r2.A02
                    if (r0 == 0) goto L57
                    X.3Av r0 = r0.A00
                    r0.A05()
                    goto L2b
                L94:
                    X.C14360o3.A0F(r6)
                    goto L5a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C154126wM.D5D(X.4zP, java.util.List, boolean, boolean):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
            
                if (r8.BUt() != true) goto L10;
             */
            @Override // X.InterfaceC62852tO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void D5I(X.InterfaceC111084zP r8, java.util.List r9, boolean r10, boolean r11) {
                /*
                    r7 = this;
                    r0 = 0
                    X.C14360o3.A0B(r9, r0)
                    X.6vL r5 = X.C153506vL.this
                    com.instagram.common.session.UserSession r3 = r5.getSession()
                    java.util.Map r2 = r7.A00(r9)
                    X.6vl r0 = r5.A07
                    java.lang.String r6 = "clipsGridAdapter"
                    if (r0 == 0) goto L55
                    X.6vi r1 = r0.A0L
                    java.lang.String r0 = r5.A0D
                    java.util.ArrayList r4 = X.AbstractC37873GlS.A00(r3, r1, r0, r9, r2)
                    X.6vl r3 = r5.A07
                    if (r3 == 0) goto L55
                    r2 = 1
                    if (r8 == 0) goto L2a
                    boolean r1 = r8.BUt()
                    r0 = 1
                    if (r1 == r2) goto L2b
                L2a:
                    r0 = 0
                L2b:
                    r3.A06(r4, r0)
                    boolean r0 = r9.isEmpty()
                    if (r0 == 0) goto L3b
                    X.6vl r0 = r5.A07
                    if (r0 == 0) goto L55
                    r0.A02()
                L3b:
                    X.6vl r0 = r5.A07
                    if (r0 == 0) goto L55
                    java.util.List r0 = X.C153766vl.A00(r0)
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L53
                    boolean r0 = r9.isEmpty()
                    if (r0 == 0) goto L53
                L4f:
                    X.C153506vL.A03(r5, r2)
                    return
                L53:
                    r2 = 0
                    goto L4f
                L55:
                    X.C14360o3.A0F(r6)
                    X.00O r0 = X.C00O.createAndThrow()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C154126wM.D5I(X.4zP, java.util.List, boolean, boolean):void");
            }

            private final Map A00(List list) {
                if (C153506vL.this.A0H) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C120985dq) obj).A0I == EnumC76383bi.A08) {
                            arrayList.add(obj);
                        }
                    }
                    int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(arrayList, 10));
                    if (A0L < 16) {
                        A0L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(((C120985dq) it.next()).A0D(), new C69749Vuj(new Object[0], 2131962752));
                    }
                    return linkedHashMap;
                }
                return AbstractC06930Yk.A0E();
            }
        });
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC153516vM
    public final /* bridge */ /* synthetic */ AbstractC153666vb AoO() {
        C153656va c153656va = this.A09;
        if (c153656va == null) {
            C14360o3.A0F("clipsProfileTabFetcher");
            throw C00O.createAndThrow();
        }
        return c153656va;
    }

    @Override // X.InterfaceC153516vM
    public final String BAK() {
        String str = this.A0B;
        if (str == null) {
            C14360o3.A0F("gridKey");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.InterfaceC152836uD
    public final ViewGroup Br5() {
        return this.A00;
    }

    @Override // X.InterfaceC152836uD
    public final void Drq(boolean z) {
        if (this.A0T) {
            A02(this, z);
        }
    }

    @Override // X.InterfaceC152836uD
    public final void Drv(boolean z) {
        String str;
        if (!this.A0T) {
            A02(this, z);
        }
        if (this.A0H) {
            C75E c75e = this.A03;
            if (c75e == null) {
                str = "clipsDraftListViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            c75e.A0E();
            C154056wE c154056wE = this.A06;
            if (c154056wE != null) {
                c154056wE.A00();
            }
        }
        C155996zT c155996zT = this.A0O;
        if (c155996zT == null) {
            str = "dataProvider";
        } else {
            C155886zI c155886zI = c155996zT.A09;
            C153766vl c153766vl = this.A07;
            if (c153766vl == null) {
                str = "clipsGridAdapter";
            } else {
                c155886zI.A00 = new WeakReference(c153766vl);
                this.A0G = true;
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC153586vT
    public final void Dzr() {
        MWZ mwz = this.A0M;
        if (mwz != null) {
            FragmentActivity requireActivity = requireActivity();
            C14360o3.A07(requireActivity.getSupportFragmentManager());
            C54687ODn c54687ODn = new C54687ODn(mwz.A02);
            c54687ODn.A02 = new C31335Dq0(2131964235);
            Resources resources = requireActivity.getResources();
            C14360o3.A07(resources);
            c54687ODn.A00 = (resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen) * 3) + (resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) * 2);
            c54687ODn.A01 = new PHU(mwz);
            OAM oam = new OAM(c54687ODn, c54687ODn.A04);
            C189478aR c189478aR = oam.A00;
            N50 n50 = oam.A02;
            c189478aR.A03(requireActivity, n50);
            C54687ODn c54687ODn2 = oam.A01;
            C31335Dq0 c31335Dq0 = c54687ODn2.A02;
            if (c31335Dq0 != null) {
                C51146Mip c51146Mip = n50.A07;
                c51146Mip.A01 = c31335Dq0;
                c51146Mip.notifyDataSetChanged();
            }
            List list = c54687ODn2.A05;
            C14360o3.A0B(list, 0);
            C51146Mip c51146Mip2 = n50.A07;
            c51146Mip2.A02 = list;
            c51146Mip2.notifyDataSetChanged();
            mwz.A00 = oam;
            MWZ.A00(mwz);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        ClipsViewerSource clipsViewerSource;
        if (this.A0H) {
            clipsViewerSource = ClipsViewerSource.A2E;
        } else if (this.A0R) {
            clipsViewerSource = ClipsViewerSource.A1a;
        } else {
            clipsViewerSource = ClipsViewerSource.A20;
        }
        return clipsViewerSource.A00;
    }

    @Override // X.C1M1
    public final String getSessionId() {
        C1M1 c1m1 = this.A0P;
        if (c1m1 == null) {
            C14360o3.A0F("sessionIdProvider");
            throw C00O.createAndThrow();
        }
        return c1m1.getSessionId();
    }

    public static final void A00(C153506vL c153506vL) {
        UserSession session = c153506vL.getSession();
        C6XJ c6xj = new C6XJ(c153506vL.getActivity(), AbstractC61636Rr0.A00(new C09530e4("trial_page_session_id_key", c153506vL.getSessionId())), session, ModalActivity.class, "clips_trials");
        c6xj.A08();
        c6xj.A0C(c153506vL.getActivity());
    }

    public static final void A01(C153506vL c153506vL, List list) {
        SimpleImageUrl simpleImageUrl;
        C115525Km c115525Km;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9J0 c9j0 = (C9J0) it.next();
            String str = c9j0.A08;
            if (str != null || ((c115525Km = c9j0.A05) != null && (str = c115525Km.A0E) != null)) {
                simpleImageUrl = AbstractC81033jX.A02(new File(str), -1, -1);
                break;
            }
        }
        simpleImageUrl = null;
        C153766vl c153766vl = c153506vL.A07;
        if (c153766vl != null) {
            c153766vl.A02();
            ShimmerFrameLayout shimmerFrameLayout = c153506vL.A01;
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.A05();
            }
            boolean A06 = C18U.A06(C06090Tz.A05, c153506vL.getSession(), 36324110380314505L);
            C153766vl c153766vl2 = c153506vL.A07;
            if (c153766vl2 != null) {
                if (A06) {
                    c153766vl2.A04 = new CQ9(list.size(), simpleImageUrl);
                } else {
                    c153766vl2.A05 = new C9JH(simpleImageUrl);
                }
                c153766vl2.A07 = false;
                c153766vl2.update();
                C1571673v.A02(null, null, c153506vL, c153506vL.getSession(), EnumC1571773w.A05, null, null, null, null, null, null, "impression_drafts_entry_point", c153506vL.getSession().userId, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                return;
            }
        }
        C14360o3.A0F("clipsGridAdapter");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC153556vQ
    public final void D1P() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A0J > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
            getSession();
            C6XJ A02 = C6XJ.A02(requireActivity(), AbstractC86593tX.A0C(C22P.A3u).A00(), getSession(), TransparentModalActivity.class, "clips_camera");
            A02.A07();
            A02.A0C(requireActivity());
            this.A0J = currentTimeMillis;
        }
    }

    @Override // X.InterfaceC153546vP
    public final void D52(View view) {
        AbstractC208269Jl.A00(getSession()).A07(C22P.A0z, true);
        UserSession session = getSession();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, session, 36323401710775500L)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MSV.A00(82), C18U.A06(c06090Tz, getSession(), 36323401710709963L));
            bundle.putBoolean(MSV.A00(947), true);
            C6XJ c6xj = new C6XJ(getActivity(), bundle, getSession(), ModalActivity.class, "clips_drafts");
            c6xj.A08();
            c6xj.A0C(getActivity());
            return;
        }
        C140966Yy c140966Yy = new C140966Yy(requireActivity(), getSession());
        c140966Yy.A0F = true;
        c140966Yy.A0B(null, AbstractC54311NzV.A00(null, getSession(), true));
        c140966Yy.A04();
    }

    @Override // X.InterfaceC153576vS
    public final void D5V(View view) {
        AbstractC153926w1.A01(this, getSession(), getSessionId()).A06(false);
        A00(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0099, code lost:
    
        if (r0 == false) goto L14;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153506vL.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int i;
        int A02 = C0f9.A02(-1907740637);
        C14360o3.A0B(layoutInflater, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ClipsProfileTabFragment.onCreateView", -466480879);
        }
        try {
            InterfaceC08430c6 requireParentFragment = requireParentFragment();
            C14360o3.A0C(requireParentFragment, "null cannot be cast to non-null type com.instagram.profile.fragment.ProfileTabDataProviders.ProvidesMediaTabDataProvider");
            this.A0O = ((C53R) requireParentFragment).Avm();
            if (C18U.A06(C06090Tz.A05, getSession(), 36323406011247830L)) {
                inflate = C50802Vb.A00(layoutInflater, null, viewGroup, R.layout.layout_profile_tab_fragment, 0, false, true);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(2030263494);
                }
                i = 141158940;
            } else {
                inflate = layoutInflater.inflate(R.layout.layout_profile_tab_fragment, viewGroup, false);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-162437903);
                }
                i = -964359552;
            }
            C0f9.A09(i, A02);
            return inflate;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-535780366);
            }
            C0f9.A09(-1172408133, A02);
            throw th;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1833987941);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ClipsProfileTabFragment.onDestroy", -89352492);
        }
        try {
            super.onDestroy();
            C25671My c25671My = this.A0K;
            if (c25671My != null) {
                c25671My.A02(this.A0W, C154096wJ.class);
                C25671My c25671My2 = this.A0K;
                if (c25671My2 != null) {
                    c25671My2.A02(this.A0V, C154086wI.class);
                    C25671My c25671My3 = this.A0K;
                    if (c25671My3 != null) {
                        c25671My3.A02(this.A0U, C154106wK.class);
                        C25671My c25671My4 = this.A0K;
                        if (c25671My4 != null) {
                            c25671My4.A02(this.A0X, C154116wL.class);
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(592621241);
                            }
                            C0f9.A09(1362909439, A02);
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F("igEventBus");
            throw C00O.createAndThrow();
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1979131662);
            }
            C0f9.A09(442145982, A02);
            throw th;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-453201612);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ClipsProfileTabFragment.onDestroyView", -144517091);
        }
        try {
            super.onDestroyView();
            unregisterLifecycleListener(this.A0N);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.A0a();
            }
            C153766vl c153766vl = this.A07;
            if (c153766vl == null) {
                C14360o3.A0F("clipsGridAdapter");
                throw C00O.createAndThrow();
            }
            c153766vl.A02();
            this.A01 = null;
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(null);
            }
            this.A00 = null;
            this.A04 = null;
            this.A0N = null;
            this.A0G = false;
            this.A0E = false;
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1471667910);
            }
            C0f9.A09(1768897308, A02);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-796369341);
            }
            C0f9.A09(1921179349, A02);
            throw th;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        AbstractC70663Fe abstractC70663Fe;
        AnonymousClass715 anonymousClass715;
        IgdsEmptyState igdsEmptyState;
        int A02 = C0f9.A02(411210325);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ClipsProfileTabFragment.onResume", 1354766968);
        }
        try {
            super.onResume();
            if (this.A0F && (igdsEmptyState = this.A04) != null) {
                C153766vl c153766vl = this.A07;
                if (c153766vl != null) {
                    int size = C153766vl.A00(c153766vl).size();
                    int i = 8;
                    if (size == 0) {
                        i = 0;
                    }
                    igdsEmptyState.setVisibility(i);
                }
                C14360o3.A0F("clipsGridAdapter");
                throw C00O.createAndThrow();
            }
            C62832tM A00 = AbstractC62822tL.A00(getSession());
            String str = this.A0B;
            if (str == null) {
                C14360o3.A0F("gridKey");
                throw C00O.createAndThrow();
            }
            C125605m6 c125605m6 = (C125605m6) A00.A01.get(str);
            if (c125605m6 != null) {
                int i2 = c125605m6.A00;
                c125605m6.A00 = -1;
                if (i2 > 2) {
                    C153766vl c153766vl2 = this.A07;
                    if (c153766vl2 != null) {
                        if (C153766vl.A00(c153766vl2).size() >= i2) {
                            if (C18U.A06(C06090Tz.A05, getSession(), 36326773260040308L)) {
                                Fragment fragment = this.mParentFragment;
                                C14360o3.A0C(fragment, "null cannot be cast to non-null type com.instagram.profile.intf.tabs.PinContentToTopFragment");
                                UserDetailFragment userDetailFragment = (UserDetailFragment) fragment;
                                if (userDetailFragment.mView != null && (anonymousClass715 = userDetailFragment.A0z.mViewHolder) != null) {
                                    anonymousClass715.A0B.setExpanded(false);
                                }
                                RecyclerView recyclerView = this.A00;
                                if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null) {
                                    abstractC70663Fe.A1O(i2 - 3);
                                }
                            }
                        }
                    }
                    C14360o3.A0F("clipsGridAdapter");
                    throw C00O.createAndThrow();
                }
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(948539400);
            }
            C0f9.A09(1890268535, A02);
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1384482298);
            }
            C0f9.A09(-784523884, A02);
            throw th;
        }
    }
}
