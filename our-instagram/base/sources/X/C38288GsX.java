package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.GsX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38288GsX extends AbstractC59962oe implements C1M1, InterfaceC62602sz, InterfaceC60682pr, AnonymousClass309, InterfaceC60072op, InterfaceC62612t0, InterfaceC60092or, InterfaceC11480j6, JPT, InterfaceC37211GaM, InterfaceC60122ou, JPR {
    public static final String __redex_internal_original_name = "SavedMediaGridFragment";
    public int A00;
    public MTJ A01;
    public C25671My A02;
    public UserSession A03;
    public C66095TzW A04;
    public C39410Hau A05;
    public C65823Tug A06;
    public HKK A07;
    public C154796xU A08;
    public EnumC39551HdN A09;
    public HHH A0A;
    public IF9 A0B;
    public SavedCollection A0C;
    public C41198ILm A0D;
    public EmptyStateView A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public AnonymousClass308 A0I;
    public C41130IIv A0J;
    public C38U A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final InterfaceC71925XAj A0Z = new C42419IqM(this, 0);
    public final InterfaceC1571373s A0T = new J10(this, 2);
    public final InterfaceC43406JFw A0a = new C42426IqT(this, 1);
    public final JIB A0S = new C42816Iws(this);
    public final InterfaceC41501vz A0Y = new C36155FxU(this, 9);
    public final InterfaceC41501vz A0X = new C36155FxU(this, 7);
    public final C36155FxU A0V = new C36155FxU(this, 8);
    public final C37816GkW A0W = C37816GkW.A00(this, 13);
    public final C31702Dw7 A0Q = new C31702Dw7(this, 35);
    public final InterfaceC09390do A0U = C1XM.A00(new C37016GSx(this, 26));
    public final C37330GcY A0R = new C37330GcY();
    public final Handler A0P = new Handler();
    public final HashMap A0c = AbstractC166987dD.A1G();
    public final HashMap A0b = AbstractC166987dD.A1G();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r8.A03 == false) goto L14;
     */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.ICf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C33136Ejf r8, X.C38288GsX r9, boolean r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38288GsX.A05(X.Ejf, X.GsX, boolean, boolean, boolean):void");
    }

    public static final void A06(C38288GsX c38288GsX) {
        FragmentActivity activity = c38288GsX.getActivity();
        if (activity != null) {
            AbstractC31175DnJ.A0j(activity, false);
        }
        C9GR.A0C(c38288GsX.requireContext(), "add_to_collection_failed");
    }

    private final void A08(boolean z, boolean z2) {
        UserSession userSession;
        String str;
        Object[] objArr;
        String str2;
        C32954Eel c32954Eel = new C32954Eel(this, 1, z2, z);
        C154796xU c154796xU = this.A08;
        String str3 = "feedNetworkSource";
        String str4 = null;
        if (c154796xU != null) {
            if (!z) {
                str4 = c154796xU.A03.A07;
            }
            EnumC39551HdN enumC39551HdN = this.A09;
            str3 = "savedFeedMode";
            if (enumC39551HdN != null) {
                if (enumC39551HdN != EnumC39551HdN.A05 && enumC39551HdN != EnumC39551HdN.A03 && enumC39551HdN != EnumC39551HdN.A04 && enumC39551HdN != EnumC39551HdN.A02) {
                    SavedCollection savedCollection = this.A0C;
                    str3 = "collection";
                    if (savedCollection != null) {
                        if (savedCollection.A07 != EnumC33416Epn.A05) {
                            boolean z3 = this.A0H;
                            String str5 = savedCollection.A0F;
                            userSession = this.A03;
                            if (z3) {
                                if (userSession != null) {
                                    objArr = new Object[]{str5};
                                    str2 = "feed/collection/%s/posts/";
                                    str = AbstractC13670mt.A06(str2, objArr);
                                    C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                                    A0M.A0E = str;
                                    AbstractC37302Gc3.A1M(A0M, userSession, FXI.class);
                                    A0M.A0A = AnonymousClass001.A0R(str, str4);
                                    A0M.A04();
                                    AbstractC2044893h.A06(A0M, str4);
                                    c154796xU.A03(A0M.A0N(), c32954Eel);
                                    return;
                                }
                                C14360o3.A0F("userSession");
                                throw C00O.createAndThrow();
                            }
                            if (userSession != null) {
                                objArr = new Object[]{str5};
                                str2 = "feed/collection/%s/";
                                str = AbstractC13670mt.A06(str2, objArr);
                                C25621Ms A0M2 = AbstractC31177DnL.A0M(userSession);
                                A0M2.A0E = str;
                                AbstractC37302Gc3.A1M(A0M2, userSession, FXI.class);
                                A0M2.A0A = AnonymousClass001.A0R(str, str4);
                                A0M2.A04();
                                AbstractC2044893h.A06(A0M2, str4);
                                c154796xU.A03(A0M2.A0N(), c32954Eel);
                                return;
                            }
                            C14360o3.A0F("userSession");
                            throw C00O.createAndThrow();
                        }
                    }
                }
                boolean z4 = this.A0H;
                userSession = this.A03;
                if (z4) {
                    if (userSession != null) {
                        str = "feed/saved/posts/";
                        C25621Ms A0M22 = AbstractC31177DnL.A0M(userSession);
                        A0M22.A0E = str;
                        AbstractC37302Gc3.A1M(A0M22, userSession, FXI.class);
                        A0M22.A0A = AnonymousClass001.A0R(str, str4);
                        A0M22.A04();
                        AbstractC2044893h.A06(A0M22, str4);
                        c154796xU.A03(A0M22.A0N(), c32954Eel);
                        return;
                    }
                    C14360o3.A0F("userSession");
                } else {
                    if (userSession != null) {
                        str = "feed/saved/";
                        C25621Ms A0M222 = AbstractC31177DnL.A0M(userSession);
                        A0M222.A0E = str;
                        AbstractC37302Gc3.A1M(A0M222, userSession, FXI.class);
                        A0M222.A0A = AnonymousClass001.A0R(str, str4);
                        A0M222.A04();
                        AbstractC2044893h.A06(A0M222, str4);
                        c154796xU.A03(A0M222.A0N(), c32954Eel);
                        return;
                    }
                    C14360o3.A0F("userSession");
                }
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    public final void A0C() {
        if (!isLoading()) {
            if (CUG()) {
                C19280xC A00 = C19280xC.A00(this, "action_bar_feed_retry");
                C150856qj.A03(requireContext(), A00);
                UserSession userSession = this.A03;
                if (userSession == null) {
                    AbstractC31171DnF.A0y();
                    throw C00O.createAndThrow();
                }
                AbstractC31173DnH.A1S(A00, userSession);
            }
            this.A0F = AbstractC166997dE.A0n();
            A08(true, true);
        }
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A08(false, false);
    }

    @Override // X.InterfaceC43449JHn
    public final void DKV(C38321qM c38321qM) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (java.lang.Boolean.TRUE.equals(X.AbstractC25226BEj.A14(r22).A0J()) == false) goto L24;
     */
    @Override // X.JPT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DLL(android.view.View r19, X.C5qT r20, X.AbstractC127945qN r21, X.C38321qM r22) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38288GsX.DLL(android.view.View, X.5qT, X.5qN, X.1qM):void");
    }

    @Override // X.JPT
    public final /* synthetic */ void DLV(C38321qM c38321qM) {
    }

    @Override // X.JPT
    public final /* synthetic */ void DLY(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC43449JHn
    public final /* synthetic */ void DRu(C38321qM c38321qM, Integer num, int i, int i2) {
    }

    @Override // X.InterfaceC43449JHn
    public final /* synthetic */ void DRw(C38321qM c38321qM, Integer num, int i, int i2) {
    }

    @Override // X.JPR
    public final void DXQ() {
    }

    @Override // X.JPR
    public final void DXZ() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x00a2. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38288GsX.configureActionBar(X.2iU):void");
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
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        DiscoveryRecyclerView discoveryRecyclerView;
        C33136Ejf c33136Ejf;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0A().A05(view, isLoading());
        A0A().A06(this);
        C41130IIv c41130IIv = this.A0J;
        ViewParent viewParent = null;
        if (c41130IIv == null) {
            str = "feedPillHelper";
        } else {
            ViewOnClickListenerC42033Ik2 viewOnClickListenerC42033Ik2 = new ViewOnClickListenerC42033Ik2(this, 10);
            ViewStub viewStub = (ViewStub) AbstractC166987dD.A0c(view, R.id.feed_pill_stub);
            c41130IIv.A00 = viewOnClickListenerC42033Ik2;
            ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(viewStub);
            Context context = c41130IIv.A02;
            A0G.setMargins(0, 0, 0, AbstractC167017dG.A0E(context));
            viewStub.setLayoutResource(R.layout.feed_pill);
            IgTextView igTextView = (IgTextView) viewStub.inflate().requireViewById(R.id.feed_pill);
            c41130IIv.A01 = igTextView;
            if (igTextView != null) {
                C0fQ.A00(c41130IIv.A00, igTextView);
            }
            IgTextView igTextView2 = c41130IIv.A01;
            if (igTextView2 != null) {
                C44332JiX c44332JiX = new C44332JiX(context.getColor(R.color.badge_color));
                RectF rectF = AbstractC13880nE.A01;
                igTextView2.setBackground(c44332JiX);
            }
            AbstractC167007dF.A0x(c41130IIv.A01);
            EmptyStateView A01 = A01();
            this.A0E = A01;
            ViewOnClickListenerC42033Ik2.A00(A01, 11, this);
            EmptyStateView emptyStateView = this.A0E;
            if (emptyStateView != null) {
                emptyStateView.A0I();
            }
            A07(this);
            EnumC39551HdN enumC39551HdN = this.A09;
            str = "savedFeedMode";
            if (enumC39551HdN != null) {
                if (enumC39551HdN == EnumC39551HdN.A06) {
                    A0A().A04.getClass();
                    HHH A0B = A0B();
                    DiscoveryRecyclerView discoveryRecyclerView2 = A0A().A04;
                    if (discoveryRecyclerView2 != null) {
                        viewParent = discoveryRecyclerView2.getParent();
                    }
                    viewParent.getClass();
                    ViewGroup viewGroup = (ViewGroup) viewParent;
                    LinearLayout linearLayout = (LinearLayout) AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.save_collection_bulk_edit_actions, viewGroup, true).requireViewById(R.id.bulk_actions_container);
                    C14360o3.A0B(linearLayout, 1);
                    INJ inj = new INJ(linearLayout, false);
                    A0B.A01 = inj;
                    inj.A01(A0B.A03.requireContext(), A0B.A0E.A07, A0B);
                } else if (enumC39551HdN == EnumC39551HdN.A05 || enumC39551HdN == EnumC39551HdN.A03 || enumC39551HdN == EnumC39551HdN.A04 || enumC39551HdN == EnumC39551HdN.A02) {
                    A0B().A01();
                }
                if (this.A0N) {
                    this.A0N = false;
                    UserSession userSession = this.A03;
                    if (userSession == null) {
                        str = "userSession";
                    } else {
                        LinkedList linkedList = FXK.A00(userSession).A01;
                        if (!linkedList.isEmpty() && (c33136Ejf = (C33136Ejf) linkedList.remove(0)) != null) {
                            A05(c33136Ejf, this, true, false, true);
                            C154796xU c154796xU = this.A08;
                            if (c154796xU == null) {
                                str = "feedNetworkSource";
                            } else {
                                String str2 = ((HB2) c33136Ejf).A01;
                                C154806xV c154806xV = c154796xU.A03;
                                c154806xV.A07 = str2;
                                c154806xV.A0A = true;
                                c154806xV.A03 = C05F.A0C;
                                C65823Tug.A00(A0A(), false, true);
                                MTJ mtj = this.A01;
                                if (mtj == null) {
                                    str = "navigationPerfLogger";
                                } else {
                                    mtj.A00.A02();
                                }
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
                C25671My c25671My = this.A02;
                if (c25671My == null) {
                    str = "igEventBus";
                } else {
                    c25671My.A01(this.A0W, C3HW.class);
                    if (this.A0L && (discoveryRecyclerView = A0A().A04) != null) {
                        discoveryRecyclerView.setPadding(0, 0, 0, (int) AbstractC13880nE.A04(requireContext(), 64));
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final AbstractC127945qN A00(C38321qM c38321qM) {
        HashMap hashMap = this.A0c;
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) hashMap.get(c38321qM);
        if (abstractC127945qN == null) {
            HKb hKb = new HKb(AbstractC127905qJ.A02(1, 1), c38321qM, (User) this.A0b.get(c38321qM.A38()));
            hashMap.put(c38321qM, hKb);
            return hKb;
        }
        return abstractC127945qN;
    }

    private final EmptyStateView A01() {
        ViewParent viewParent;
        if (this.A0E == null) {
            float f = NestedScrollView.A0T;
            EmptyStateView emptyStateView = new EmptyStateView(requireContext());
            emptyStateView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (A09(this)) {
                EnumC153216up enumC153216up = EnumC153216up.A02;
                emptyStateView.A0T(enumC153216up, 2131972748);
                Resources A0N = AbstractC166997dE.A0N(this);
                SavedCollection savedCollection = this.A0C;
                if (savedCollection != null) {
                    emptyStateView.A0V(enumC153216up, AbstractC166997dE.A0r(A0N, savedCollection.A0G, 2131972745));
                    SavedCollection savedCollection2 = this.A0C;
                    if (savedCollection2 != null) {
                        if (savedCollection2.A07 == EnumC33416Epn.A0A) {
                            emptyStateView.A0Q(enumC153216up, 2131972732);
                            emptyStateView.A0O(this.A0T, enumC153216up);
                        }
                    }
                }
                C14360o3.A0F("collection");
                throw C00O.createAndThrow();
            }
            EnumC153216up enumC153216up2 = EnumC153216up.A02;
            emptyStateView.A0T(enumC153216up2, 2131972726);
            emptyStateView.A0S(enumC153216up2, 2131972725);
            AbstractC40788I5q.A00(new ViewOnClickListenerC42033Ik2(this, 9), emptyStateView, false, false);
            this.A0E = emptyStateView;
            A0A().A04.getClass();
            DiscoveryRecyclerView discoveryRecyclerView = A0A().A04;
            if (discoveryRecyclerView != null) {
                viewParent = discoveryRecyclerView.getParent();
            } else {
                viewParent = null;
            }
            viewParent.getClass();
            ((ViewGroup) viewParent).addView(this.A0E);
        }
        EmptyStateView emptyStateView2 = this.A0E;
        if (emptyStateView2 != null) {
            return emptyStateView2;
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A03() {
        if (this.A0O) {
            C41130IIv c41130IIv = this.A0J;
            if (c41130IIv == null) {
                C14360o3.A0F("feedPillHelper");
                throw C00O.createAndThrow();
            }
            IgTextView igTextView = c41130IIv.A01;
            if (igTextView != null && igTextView.getVisibility() == 8) {
                IgTextView igTextView2 = c41130IIv.A01;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                }
                IgTextView igTextView3 = c41130IIv.A01;
                if (igTextView3 != null) {
                    igTextView3.clearAnimation();
                }
                IgTextView igTextView4 = c41130IIv.A01;
                if (igTextView4 != null) {
                    C40981IDc c40981IDc = c41130IIv.A03;
                    AnimationSet animationSet = new AnimationSet(true);
                    c40981IDc.A00 = animationSet;
                    animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                    c40981IDc.A00.addAnimation(new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f));
                    c40981IDc.A00.setInterpolator(new OvershootInterpolator());
                    c40981IDc.A00.setStartOffset(250L);
                    c40981IDc.A00.setDuration(350L);
                    igTextView4.startAnimation(c40981IDc.A00);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C38321qM r5, X.C38288GsX r6, java.lang.String r7) {
        /*
            com.instagram.save.model.SavedCollection r4 = r6.A0C
            java.lang.String r2 = "collection"
            if (r4 == 0) goto L56
            X.Epn r1 = r4.A07
            X.Epn r0 = X.EnumC33416Epn.A0A
            java.lang.String r3 = "dataSource"
            if (r1 != r0) goto L35
            java.lang.String r0 = r4.A0F
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 == 0) goto L35
            java.util.List r1 = r5.BqL()
            com.instagram.save.model.SavedCollection r0 = r6.A0C
            if (r0 == 0) goto L56
            java.lang.String r0 = r0.A0F
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L45
            X.HKK r1 = r6.A07
            if (r1 == 0) goto L5a
            X.5qN r0 = r6.A00(r5)
            r1.A05(r0)
        L31:
            A07(r6)
        L34:
            return
        L35:
            com.instagram.save.model.SavedCollection r0 = r6.A0C
            if (r0 == 0) goto L56
            X.Epn r1 = r0.A07
            X.Epn r0 = X.EnumC33416Epn.A05
            if (r1 != r0) goto L34
            boolean r0 = r5.CcN()
            if (r0 != 0) goto L34
        L45:
            X.HKK r2 = r6.A07
            if (r2 == 0) goto L5a
            X.5qN r1 = r6.A00(r5)
            java.util.List r0 = r2.A02
            r0.remove(r1)
            r2.A03()
            goto L31
        L56:
            X.C14360o3.A0F(r2)
            goto L5d
        L5a:
            X.C14360o3.A0F(r3)
        L5d:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38288GsX.A04(X.1qM, X.GsX, java.lang.String):void");
    }

    public static final boolean A09(C38288GsX c38288GsX) {
        EnumC39551HdN enumC39551HdN = c38288GsX.A09;
        if (enumC39551HdN == null) {
            C14360o3.A0F("savedFeedMode");
            throw C00O.createAndThrow();
        }
        if (enumC39551HdN != EnumC39551HdN.A06 && enumC39551HdN != EnumC39551HdN.A07) {
            return false;
        }
        return true;
    }

    public final C65823Tug A0A() {
        C65823Tug c65823Tug = this.A06;
        if (c65823Tug != null) {
            return c65823Tug;
        }
        C14360o3.A0F("saveGrid");
        throw C00O.createAndThrow();
    }

    public final HHH A0B() {
        HHH hhh = this.A0A;
        if (hhh != null) {
            return hhh;
        }
        C14360o3.A0F("gridViewController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C154796xU c154796xU = this.A08;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        if (c154796xU.A06()) {
            this.A0G = true;
            A08(false, false);
        }
    }

    @Override // X.JPT
    public final /* synthetic */ boolean BWN() {
        return false;
    }

    @Override // X.InterfaceC37211GaM
    public final List Bse() {
        C39410Hau c39410Hau = this.A05;
        if (c39410Hau == null) {
            C14360o3.A0F("selectStateProvider");
            throw C00O.createAndThrow();
        }
        return c39410Hau.A04();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        C154796xU c154796xU = this.A08;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        return c154796xU.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C154796xU c154796xU = this.A08;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        return AbstractC37303Gc4.A1b(c154796xU);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0021. Please report as an issue. */
    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str;
        EnumC39551HdN enumC39551HdN = this.A09;
        if (enumC39551HdN == null) {
            str = "savedFeedMode";
        } else {
            int ordinal = enumC39551HdN.ordinal();
            String A00 = AbstractC111324zv.A00(2370);
            str = "userSession";
            String A002 = AbstractC111324zv.A00(2369);
            switch (ordinal) {
                case 2:
                    return "collection_cover_editor";
                case 3:
                case 4:
                case 5:
                case 6:
                    return "feed_saved_add_to_collection";
                default:
                    SavedCollection savedCollection = this.A0C;
                    if (savedCollection != null && savedCollection.A06()) {
                        UserSession userSession = this.A03;
                        if (userSession != null) {
                            if (!savedCollection.A07(userSession.userId)) {
                                return A00;
                            }
                        }
                    }
                    return A002;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A03;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.C1M1
    public final String getSessionId() {
        String str = this.A0F;
        if (str == null) {
            C14360o3.A0F("_sessionId");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C154796xU c154796xU = this.A08;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        return AbstractC37303Gc4.A1a(c154796xU);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AnonymousClass308 anonymousClass308 = this.A0I;
        if (anonymousClass308 != null && anonymousClass308.onBackPressed()) {
            return true;
        }
        if (!A0B().onBackPressed()) {
            return false;
        }
        A03();
        return true;
    }

    private final ArrayList A02(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38321qM c38321qM = ((C40958ICf) it.next()).A00;
            C14360o3.A07(c38321qM);
            A1E.add(A00(c38321qM));
        }
        return A1E;
    }

    public static final void A07(C38288GsX c38288GsX) {
        if (c38288GsX.isAdded() && c38288GsX.mView != null) {
            boolean isLoading = c38288GsX.isLoading();
            if (c38288GsX.CUG()) {
                c38288GsX.A01().setVisibility(0);
                c38288GsX.A01().A0J();
                return;
            }
            if (!isLoading) {
                HKK hkk = c38288GsX.A07;
                if (hkk == null) {
                    C14360o3.A0F("dataSource");
                    throw C00O.createAndThrow();
                }
                if (!hkk.A04().hasNext()) {
                    c38288GsX.A01().setVisibility(0);
                    EmptyStateView A01 = c38288GsX.A01();
                    A01.A0P(EnumC153216up.A02);
                    A01.A0I();
                    return;
                }
            }
            c38288GsX.A01().setVisibility(8);
        }
    }

    @Override // X.InterfaceC37211GaM
    public final void ASr() {
        A0B().A01();
    }

    @Override // X.InterfaceC37211GaM
    public final void ATl() {
        A0B().A03();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return A0A().A0A();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (isLoading()) {
            return this.A0G;
        }
        return true;
    }

    @Override // X.InterfaceC43449JHn
    public final boolean DSM(MotionEvent motionEvent, View view, C5qT c5qT, C38321qM c38321qM) {
        AnonymousClass308 anonymousClass308;
        AbstractC167027dH.A12(c38321qM, c5qT, view);
        C14360o3.A0B(motionEvent, 3);
        HHH A0B = A0B();
        int i = c5qT.A01;
        int i2 = c5qT.A00;
        if (!A0B.A06.A01 && A0B.A0B != EnumC39551HdN.A08 && (anonymousClass308 = A0B.A07) != null) {
            anonymousClass308.DuC(motionEvent, view, c38321qM, (i * 3) + i2);
        }
        return false;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB A0B = AbstractC37300Gc1.A0B();
        C11500j9 c11500j9 = AbstractC37486Gf4.A00;
        SavedCollection savedCollection = this.A0C;
        if (savedCollection != null) {
            A0B.A04(c11500j9, savedCollection.A0F);
            C11500j9 c11500j92 = AbstractC37486Gf4.A01;
            SavedCollection savedCollection2 = this.A0C;
            if (savedCollection2 != null) {
                A0B.A04(c11500j92, savedCollection2.A0G);
                if (this.A0H) {
                    A0B.A04(AbstractC37486Gf4.A02, EnumC39557HdT.A04.A00);
                }
                return A0B;
            }
        }
        C14360o3.A0F("collection");
        throw C00O.createAndThrow();
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        return E6P();
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB A0B = AbstractC37300Gc1.A0B();
        UserSession userSession = this.A03;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        A0B.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId);
        return A0B;
    }

    @Override // X.InterfaceC37211GaM
    public final void EFj(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
            A0A();
        }
        A07(this);
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        A0A().A03();
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        C3FQ c3fq = A0A().A06;
        if (c3fq != null) {
            return c3fq;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r0v77, types: [X.ICf, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        AbstractC10360h2 abstractC10360h2;
        boolean z;
        int i;
        int A02 = C0f9.A02(-1043183704);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable(AbstractC111324zv.A00(687));
        serializable.getClass();
        this.A09 = (EnumC39551HdN) serializable;
        super.onCreate(bundle);
        this.A0K = C38U.A00;
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A03 = A0S;
        if (A0S != null) {
            MTJ mtj = new MTJ(A0S, "saved_media_grid", 31785002);
            this.A01 = mtj;
            Context requireContext = requireContext();
            UserSession userSession = this.A03;
            if (userSession != null) {
                mtj.A0N(requireContext, C55772hI.A00(userSession), this, this);
                UserSession userSession2 = this.A03;
                if (userSession2 != null) {
                    this.A02 = AbstractC25651Mw.A00(userSession2);
                    Parcelable parcelable = requireArguments.getParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION");
                    parcelable.getClass();
                    SavedCollection savedCollection = (SavedCollection) parcelable;
                    this.A0C = savedCollection;
                    if (savedCollection != null) {
                        UserSession userSession3 = this.A03;
                        if (userSession3 != null) {
                            savedCollection.A03(userSession3);
                            requireArguments.getString("prior_module");
                            this.A00 = requireArguments.getInt(AbstractC111324zv.A00(1485));
                            this.A0H = requireArguments.getBoolean(AbstractC111324zv.A00(1793));
                            this.A0L = requireArguments.getBoolean(AbstractC111324zv.A00(1792), false);
                            this.A0F = AbstractC166997dE.A0n();
                            UserSession userSession4 = this.A03;
                            if (userSession4 != null) {
                                HLK hlk = new HLK(userSession4, this);
                                this.A0J = new C41130IIv(requireContext());
                                C57112jm A0E = AbstractC37301Gc2.A0E();
                                UserSession userSession5 = this.A03;
                                if (userSession5 != null) {
                                    SavedCollection savedCollection2 = this.A0C;
                                    if (savedCollection2 != null) {
                                        this.A0B = new IF9(userSession5, A0E, this, savedCollection2);
                                        C60462pV c60462pV = new C60462pV();
                                        FragmentActivity requireActivity = requireActivity();
                                        UserSession userSession6 = this.A03;
                                        if (userSession6 != null) {
                                            String str2 = this.A0F;
                                            if (str2 == null) {
                                                str = "_sessionId";
                                            } else {
                                                P2J p2j = new P2J(requireActivity, userSession6, this, str2, -1L);
                                                C38U c38u = this.A0K;
                                                str = "gridConfiguration";
                                                if (c38u != null) {
                                                    HKK hkk = new HKK(new J69(hlk), c38u);
                                                    this.A07 = hkk;
                                                    this.A05 = new C39410Hau(hkk);
                                                    C66392zG A0R = AbstractC31174DnI.A0R(this);
                                                    InterfaceC43406JFw interfaceC43406JFw = this.A0a;
                                                    UserSession userSession7 = this.A03;
                                                    if (userSession7 != null) {
                                                        HKK hkk2 = this.A07;
                                                        if (hkk2 != null) {
                                                            C38093GpM c38093GpM = new C38093GpM(this, userSession7, hkk2, interfaceC43406JFw, false, false);
                                                            C39410Hau c39410Hau = this.A05;
                                                            if (c39410Hau != null) {
                                                                A0R.A01(new C39079HId(this, this, c38093GpM, c39410Hau));
                                                                Context requireContext2 = requireContext();
                                                                UserSession userSession8 = this.A03;
                                                                if (userSession8 != null) {
                                                                    HKK hkk3 = this.A07;
                                                                    if (hkk3 != null) {
                                                                        c60462pV.A0E(new HHI(this, userSession8, new C128025qW(userSession8, requireContext2, getModuleName()), hkk3, hkk3));
                                                                        FragmentActivity requireActivity2 = requireActivity();
                                                                        HKK hkk4 = this.A07;
                                                                        if (hkk4 != null) {
                                                                            UserSession userSession9 = this.A03;
                                                                            if (userSession9 != null) {
                                                                                EM6 em6 = null;
                                                                                C66095TzW c66095TzW = new C66095TzW(requireActivity2, this, A0R, userSession9, hkk4, null, null, null, null, this, true, false);
                                                                                this.A04 = c66095TzW;
                                                                                C39410Hau c39410Hau2 = this.A05;
                                                                                if (c39410Hau2 != null) {
                                                                                    ((AbstractC153816vq) c39410Hau2).A00 = c66095TzW;
                                                                                    UserSession userSession10 = this.A03;
                                                                                    if (userSession10 != null) {
                                                                                        C66101Tzc c66101Tzc = new C66101Tzc(userSession10);
                                                                                        c66101Tzc.A01(this.A0Z);
                                                                                        C66095TzW c66095TzW2 = this.A04;
                                                                                        if (c66095TzW2 == null) {
                                                                                            C14360o3.A0F("adapter");
                                                                                        } else {
                                                                                            c66101Tzc.A06 = c66095TzW2;
                                                                                            HKK hkk5 = this.A07;
                                                                                            if (hkk5 != null) {
                                                                                                c66101Tzc.A08 = hkk5;
                                                                                                c66101Tzc.A0A = p2j;
                                                                                                c66101Tzc.A04 = this;
                                                                                                C38U c38u2 = this.A0K;
                                                                                                if (c38u2 != null) {
                                                                                                    c66101Tzc.A0G = c38u2;
                                                                                                    c66101Tzc.A00(A0E);
                                                                                                    c66101Tzc.A0P = new V5X[]{new C38124Gpr(EnumC38183Gqo.A0B)};
                                                                                                    c66101Tzc.A0I = true;
                                                                                                    EnumC39551HdN enumC39551HdN = this.A09;
                                                                                                    if (enumC39551HdN != null) {
                                                                                                        EnumC39551HdN enumC39551HdN2 = EnumC39551HdN.A08;
                                                                                                        c66101Tzc.A0N = AbstractC25229BEm.A1a(enumC39551HdN, enumC39551HdN2);
                                                                                                        this.A06 = new C65823Tug(c66101Tzc);
                                                                                                        FragmentActivity requireActivity3 = requireActivity();
                                                                                                        Fragment fragment = this.mParentFragment;
                                                                                                        if (fragment != null) {
                                                                                                            abstractC10360h2 = fragment.mFragmentManager;
                                                                                                        } else {
                                                                                                            abstractC10360h2 = this.mFragmentManager;
                                                                                                        }
                                                                                                        abstractC10360h2.getClass();
                                                                                                        UserSession userSession11 = this.A03;
                                                                                                        if (userSession11 != null) {
                                                                                                            AnonymousClass308 anonymousClass308 = new AnonymousClass308(requireActivity3, this, abstractC10360h2, userSession11, null, this, A0A().A0E, this, false, true, false);
                                                                                                            this.A0I = anonymousClass308;
                                                                                                            UserSession userSession12 = this.A03;
                                                                                                            if (userSession12 != null) {
                                                                                                                SavedCollection savedCollection3 = this.A0C;
                                                                                                                if (savedCollection3 != null) {
                                                                                                                    EnumC39551HdN enumC39551HdN3 = this.A09;
                                                                                                                    if (enumC39551HdN3 != null) {
                                                                                                                        C39410Hau c39410Hau3 = this.A05;
                                                                                                                        if (c39410Hau3 != null) {
                                                                                                                            C38U c38u3 = this.A0K;
                                                                                                                            if (c38u3 != null) {
                                                                                                                                C41130IIv c41130IIv = this.A0J;
                                                                                                                                if (c41130IIv == null) {
                                                                                                                                    str = "feedPillHelper";
                                                                                                                                } else {
                                                                                                                                    boolean z2 = this.A0H;
                                                                                                                                    if (z2) {
                                                                                                                                        Fragment fragment2 = this.mParentFragment;
                                                                                                                                        if (fragment2 instanceof EM6) {
                                                                                                                                            em6 = (EM6) fragment2;
                                                                                                                                        } else {
                                                                                                                                            em6 = null;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    this.A0A = new HHH(this, this, userSession12, c39410Hau3, anonymousClass308, this, c41130IIv, this, enumC39551HdN3, this, em6, savedCollection3, c38u3, z2);
                                                                                                                                    UserSession userSession13 = this.A03;
                                                                                                                                    if (userSession13 != null) {
                                                                                                                                        InterfaceC60602pj c3co = new C3CO(userSession13, new C38287GsW(this, 4), false, false);
                                                                                                                                        Context requireContext3 = requireContext();
                                                                                                                                        JIB jib = this.A0S;
                                                                                                                                        UserSession userSession14 = this.A03;
                                                                                                                                        if (userSession14 != null) {
                                                                                                                                            this.A0D = new C41198ILm(requireContext3, this, userSession14, jib);
                                                                                                                                            c60462pV.A0E(A0B());
                                                                                                                                            c60462pV.A0E(c3co);
                                                                                                                                            InterfaceC60602pj interfaceC60602pj = this.A0I;
                                                                                                                                            if (interfaceC60602pj != null) {
                                                                                                                                                c60462pV.A0E(interfaceC60602pj);
                                                                                                                                            }
                                                                                                                                            UserSession userSession15 = this.A03;
                                                                                                                                            if (userSession15 != null) {
                                                                                                                                                c60462pV.A0E(new C675132q(this, userSession15, this));
                                                                                                                                                registerLifecycleListenerSet(c60462pV);
                                                                                                                                                Context requireContext4 = requireContext();
                                                                                                                                                UserSession userSession16 = this.A03;
                                                                                                                                                if (userSession16 != null) {
                                                                                                                                                    this.A08 = AbstractC37302Gc3.A0L(requireContext4, this, userSession16);
                                                                                                                                                    C25671My c25671My = this.A02;
                                                                                                                                                    if (c25671My == null) {
                                                                                                                                                        str = "igEventBus";
                                                                                                                                                    } else {
                                                                                                                                                        c25671My.A01(this.A0Y, C36110Fwk.class);
                                                                                                                                                        c25671My.A01(this.A0X, C36116Fwq.class);
                                                                                                                                                        c25671My.A01(this.A0V, C36117Fwr.class);
                                                                                                                                                        ArrayList<String> stringArrayList = requireArguments.getStringArrayList(AbstractC111324zv.A00(160));
                                                                                                                                                        EnumC39551HdN enumC39551HdN4 = this.A09;
                                                                                                                                                        if (enumC39551HdN4 != null) {
                                                                                                                                                            if (enumC39551HdN4 == enumC39551HdN2 && stringArrayList != null) {
                                                                                                                                                                ArrayList A1E = AbstractC166987dD.A1E();
                                                                                                                                                                Iterator<String> it = stringArrayList.iterator();
                                                                                                                                                                while (it.hasNext()) {
                                                                                                                                                                    String A1B = AbstractC166987dD.A1B(it);
                                                                                                                                                                    UserSession userSession17 = this.A03;
                                                                                                                                                                    if (userSession17 != null) {
                                                                                                                                                                        C38321qM A0h = AbstractC25229BEm.A0h(userSession17, A1B);
                                                                                                                                                                        if (A0h == null) {
                                                                                                                                                                            C0w9.A03("SavedMediaFeedFragment#onCreate()", "Cache miss while attempting to display cover photo selection grid");
                                                                                                                                                                            onBackPressed();
                                                                                                                                                                            i = -1566863437;
                                                                                                                                                                            break;
                                                                                                                                                                        } else {
                                                                                                                                                                            ?? obj = new Object();
                                                                                                                                                                            obj.A00 = A0h;
                                                                                                                                                                            A1E.add(obj);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                HKK hkk6 = this.A07;
                                                                                                                                                                if (hkk6 != null) {
                                                                                                                                                                    hkk6.A06(A02(A1E));
                                                                                                                                                                    i = -2078737943;
                                                                                                                                                                    C0f9.A09(i, A02);
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                if (A09(this)) {
                                                                                                                                                                    FXK fxk = C42345Ip7.A02;
                                                                                                                                                                    UserSession userSession18 = this.A03;
                                                                                                                                                                    if (userSession18 != null) {
                                                                                                                                                                        synchronized (fxk) {
                                                                                                                                                                            z = false;
                                                                                                                                                                            C42345Ip7 c42345Ip7 = (C42345Ip7) userSession18.A00(C42345Ip7.class);
                                                                                                                                                                            if (c42345Ip7 != null) {
                                                                                                                                                                                if (!c42345Ip7.A01.isEmpty()) {
                                                                                                                                                                                    z = true;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        if (z) {
                                                                                                                                                                            this.A0N = true;
                                                                                                                                                                            i = -2078737943;
                                                                                                                                                                            C0f9.A09(i, A02);
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                A08(true, false);
                                                                                                                                                                i = -2078737943;
                                                                                                                                                                C0f9.A09(i, A02);
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    C14360o3.A0F("savedFeedMode");
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        throw C00O.createAndThrow();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            C14360o3.A0F("selectStateProvider");
                                                            throw C00O.createAndThrow();
                                                        }
                                                        C14360o3.A0F("dataSource");
                                                        throw C00O.createAndThrow();
                                                    }
                                                }
                                            }
                                            C14360o3.A0F(str);
                                            throw C00O.createAndThrow();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F("collection");
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1952759205);
        C14360o3.A0B(layoutInflater, 0);
        A0A();
        View inflate = layoutInflater.inflate(R.layout.layout_grid_recyclerview_wrapper, viewGroup, false);
        C0f9.A09(1548803562, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-603226056);
        super.onDestroy();
        C25671My c25671My = this.A02;
        if (c25671My == null) {
            C14360o3.A0F("igEventBus");
            throw C00O.createAndThrow();
        }
        c25671My.A02(this.A0Y, C36110Fwk.class);
        c25671My.A02(this.A0X, C36116Fwq.class);
        c25671My.A02(this.A0V, C36117Fwr.class);
        C0f9.A09(1925069459, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-627261371);
        super.onDestroyView();
        A0A().A01();
        this.A0E = null;
        C25671My c25671My = this.A02;
        if (c25671My == null) {
            str = "igEventBus";
        } else {
            c25671My.A02(this.A0W, C3HW.class);
            C41130IIv c41130IIv = this.A0J;
            if (c41130IIv == null) {
                str = "feedPillHelper";
            } else {
                IgTextView igTextView = c41130IIv.A01;
                if (igTextView != null) {
                    igTextView.setOnClickListener(null);
                }
                c41130IIv.A01 = null;
                c41130IIv.A00 = null;
                C0f9.A09(1977694902, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(503979905);
        super.onResume();
        A03();
        if (this.A0H) {
            UserSession userSession = this.A03;
            String str = "userSession";
            if (userSession != null) {
                boolean z = FXK.A00(userSession).A00;
                UserSession userSession2 = this.A03;
                if (userSession2 != null) {
                    C42345Ip7 A00 = FXK.A00(userSession2);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    LinkedList linkedList = A00.A01;
                    A1E.addAll(linkedList);
                    linkedList.clear();
                    A00.A00 = false;
                    if (!A1E.isEmpty()) {
                        str = "dataSource";
                        if (z) {
                            HKK hkk = this.A07;
                            if (hkk != null) {
                                hkk.A02.clear();
                                hkk.A03();
                            }
                        }
                        Iterator it = A1E.iterator();
                        while (it.hasNext()) {
                            C33136Ejf c33136Ejf = (C33136Ejf) it.next();
                            HKK hkk2 = this.A07;
                            if (hkk2 != null) {
                                List list = c33136Ejf.A01;
                                C14360o3.A07(list);
                                hkk2.A06(A02(list));
                                C154796xU c154796xU = this.A08;
                                if (c154796xU == null) {
                                    str = "feedNetworkSource";
                                } else {
                                    String str2 = ((HB2) c33136Ejf).A01;
                                    C154806xV c154806xV = c154796xU.A03;
                                    c154806xV.A07 = str2;
                                    c154806xV.A0A = true;
                                    c154806xV.A03 = C05F.A0C;
                                }
                            }
                        }
                        C65823Tug.A00(A0A(), false, true);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (this.A0H || !isLoading()) {
            A07(this);
        }
        C0f9.A09(1680593865, A02);
    }
}
