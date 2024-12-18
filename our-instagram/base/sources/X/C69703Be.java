package X;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.listview.StickyHeaderListView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.3Be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69703Be implements InterfaceC60602pj {
    public final C69773Bl A00;
    public final C69733Bh A01;
    public final C69793Bn A02;
    public final C69793Bn A03;
    public final C69793Bn A04;
    public final InterfaceC41501vz A05;
    public final InterfaceC41501vz A06;
    public final InterfaceC41501vz A07;
    public final InterfaceC41501vz A08;
    public final InterfaceC41501vz A09;
    public final InterfaceC41501vz A0A;
    public final InterfaceC41501vz A0B;
    public final InterfaceC41501vz A0C;
    public final InterfaceC41501vz A0D;
    public final InterfaceC41501vz A0E;
    public final InterfaceC41501vz A0F;
    public final InterfaceC41501vz A0G;
    public final InterfaceC41501vz A0H;
    public final InterfaceC41501vz A0I;
    public final InterfaceC41501vz A0J;
    public final InterfaceC41501vz A0K;
    public final InterfaceC41501vz A0L;
    public final InterfaceC41501vz A0M;
    public final InterfaceC41501vz A0N;
    public final InterfaceC41501vz A0O;
    public final InterfaceC41501vz A0P;
    public final InterfaceC41501vz A0Q;
    public final InterfaceC41501vz A0R;
    public final InterfaceC41501vz A0S;
    public final UserSession A0T;
    public final C69713Bf A0U;
    public final C63352uI A0V;
    public final InterfaceC60442pS A0W;
    public final C69723Bg A0X;
    public final C1M1 A0Y;
    public final C69783Bm A0Z;
    public final C69693Bd A0a;
    public final WeakReference A0b;

    public C69703Be(UserSession userSession, C63352uI c63352uI, InterfaceC60442pS interfaceC60442pS, C64842wi c64842wi, C1M1 c1m1, final C60662pp c60662pp, C69693Bd c69693Bd) {
        C14360o3.A0B(c64842wi, 2);
        C14360o3.A0B(c1m1, 7);
        this.A0a = c69693Bd;
        this.A0V = c63352uI;
        this.A0T = userSession;
        this.A0W = interfaceC60442pS;
        this.A0Y = c1m1;
        this.A0U = new C69713Bf();
        this.A0X = new C69723Bg(c60662pp, userSession, c64842wi);
        this.A0b = new WeakReference(c60662pp);
        this.A01 = new C69733Bh(c60662pp.requireContext(), c60662pp, interfaceC60442pS, userSession);
        this.A00 = new C69773Bl(c60662pp.requireContext(), c60662pp, userSession);
        this.A0Z = new C69783Bm(c60662pp, userSession);
        this.A04 = new C69793Bn(AbstractC25651Mw.A00(userSession));
        this.A03 = new C69793Bn(AbstractC25651Mw.A00(userSession));
        this.A02 = new C69793Bn(AbstractC25651Mw.A00(userSession));
        this.A09 = new InterfaceC41501vz() { // from class: X.3Bo
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                C5GM c5gm;
                V80 v80;
                C65192xH c65192xH;
                int A03 = C0f9.A03(-1712401835);
                int A032 = C0f9.A03(2105654571);
                AbstractC60672pq abstractC60672pq = (AbstractC60672pq) C69703Be.this.A0b.get();
                if (abstractC60672pq == null) {
                    i = 807535879;
                } else {
                    C65192xH c65192xH2 = (C65192xH) abstractC60672pq.getAdapter();
                    if (c65192xH2 != null && (c5gm = c65192xH2.A08) != null && (v80 = c5gm.A02) != null && AbstractC111324zv.A00(2175).equalsIgnoreCase(v80.A0F) && (c65192xH = (C65192xH) abstractC60672pq.getAdapter()) != null) {
                        c65192xH.A0D(null);
                    }
                    i = -2070580672;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(407667644, A03);
            }
        };
        this.A0M = new InterfaceC41501vz() { // from class: X.3Bp
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                C5GM c5gm;
                V80 v80;
                C65192xH c65192xH;
                int A03 = C0f9.A03(-1715880120);
                int A032 = C0f9.A03(1289657378);
                AbstractC60672pq abstractC60672pq = (AbstractC60672pq) C69703Be.this.A0b.get();
                if (abstractC60672pq == null) {
                    i = -1378456269;
                } else {
                    C65192xH c65192xH2 = (C65192xH) abstractC60672pq.getAdapter();
                    if (c65192xH2 != null && (c5gm = c65192xH2.A08) != null && (v80 = c5gm.A02) != null && "confirm_phone".equalsIgnoreCase(v80.A0F) && (c65192xH = (C65192xH) abstractC60672pq.getAdapter()) != null) {
                        c65192xH.A0D(null);
                    }
                    i = -647892869;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(819289472, A03);
            }
        };
        this.A0K = new InterfaceC41501vz() { // from class: X.3Bq
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                int A03 = C0f9.A03(-1105245546);
                C3HU c3hu = (C3HU) obj;
                int A032 = C0f9.A03(-1306294802);
                C14360o3.A0B(c3hu, 0);
                C69703Be c69703Be = C69703Be.this;
                ImmutableList copyOf = ImmutableList.copyOf((Collection) c3hu.A00);
                C14360o3.A07(copyOf);
                WeakReference weakReference = c69703Be.A0b;
                C60662pp c60662pp2 = (C60662pp) weakReference.get();
                if (c60662pp2 != null) {
                    C54822fg A08 = c60662pp2.A08();
                    if (A08 != null) {
                        str = A08.A02;
                    } else {
                        str = "";
                    }
                    if (c60662pp2.mView == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("triggered without view in MainFeedFragment  isDetatched: ");
                        sb.append(c60662pp2.mDetached);
                        sb.append(" isInLayout ");
                        sb.append(c60662pp2.mInLayout);
                        sb.append(" isResumed ");
                        sb.append(c60662pp2.isResumed());
                        sb.append(" isRemoving ");
                        sb.append(c60662pp2.mRemoving);
                        C0w9.A03("quick_capture_camera_animation_error", sb.toString());
                        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) weakReference.get();
                        if (abstractC59962oe != null) {
                            if (abstractC59962oe.getActivity() == null) {
                                abstractC59962oe.getRootActivity();
                            }
                            ComponentCallbacks componentCallbacks = abstractC59962oe.mParentFragment;
                            if (!(componentCallbacks instanceof InterfaceC53742dD)) {
                                componentCallbacks = abstractC59962oe.getRootActivity();
                                C14360o3.A0C(componentCallbacks, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgNavigator");
                            }
                            C54762fZ c54762fZ = ((InstagramMainActivity) ((InterfaceC53742dD) componentCallbacks)).A09;
                            c54762fZ.getClass();
                            C23476Aap c23476Aap = c54762fZ.A02.A0E;
                            if (c23476Aap != null) {
                                c23476Aap.A02(str);
                            }
                        }
                    } else {
                        c60662pp2.getScrollingViewProxy().EdY(0);
                        ViewGroup CFj = c60662pp2.getScrollingViewProxy().CFj();
                        if (CFj != null) {
                            CFj.post(new GQ3(c60662pp2, str, copyOf));
                        }
                    }
                }
                C0f9.A0A(-302173139, A032);
                C0f9.A0A(1491537643, A03);
            }
        };
        this.A0C = new InterfaceC41501vz() { // from class: X.3Br
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                int A03 = C0f9.A03(-767336820);
                int A032 = C0f9.A03(932841690);
                C69703Be c69703Be = C69703Be.this;
                AbstractC60672pq abstractC60672pq = (AbstractC60672pq) c69703Be.A0b.get();
                if (abstractC60672pq == null) {
                    i = -2111847719;
                } else {
                    C65192xH c65192xH = (C65192xH) abstractC60672pq.getAdapter();
                    if (c65192xH != null) {
                        c65192xH.A0Q.A02 = true;
                        c65192xH.A0A(-1);
                    }
                    C69693Bd c69693Bd2 = c69703Be.A0a;
                    C14360o3.A0B("MainFeedFragment.DismissAllRecommendations", 0);
                    Object value = c69693Bd2.A00.getValue();
                    C14360o3.A07(value);
                    ((C70013Cl) value).A03("MainFeedFragment.DismissAllRecommendations");
                    i = -2143848095;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(-1692616868, A03);
            }
        };
        this.A0O = new InterfaceC41501vz() { // from class: X.3Bs
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                int A03 = C0f9.A03(2027897);
                int A032 = C0f9.A03(-272508361);
                AbstractC60672pq abstractC60672pq = (AbstractC60672pq) C69703Be.this.A0b.get();
                if (abstractC60672pq == null) {
                    i = 1142939328;
                } else {
                    C2UU c2uu = (C2UU) abstractC60672pq.getAdapter();
                    if (c2uu != null) {
                        c2uu.notifyDataSetChanged();
                    }
                    i = -1356942424;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(-1880718054, A03);
            }
        };
        this.A0H = new InterfaceC42271xH() { // from class: X.3Bt
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C70033Cn c70033Cn = (C70033Cn) obj;
                C14360o3.A0B(c70033Cn, 0);
                return c70033Cn.A01;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                String str;
                Hashtag B7K;
                int A03 = C0f9.A03(-1270675955);
                C70033Cn c70033Cn = (C70033Cn) obj;
                int A032 = C0f9.A03(-1301795844);
                C14360o3.A0B(c70033Cn, 0);
                AbstractC60672pq abstractC60672pq = (AbstractC60672pq) C69703Be.this.A0b.get();
                if (abstractC60672pq == null) {
                    i = -342129213;
                } else {
                    C65192xH c65192xH = (C65192xH) abstractC60672pq.getAdapter();
                    if (c65192xH != null) {
                        Hashtag hashtag = c70033Cn.A00;
                        AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) c65192xH).A00;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = abstractC65332xV.A02.iterator();
                        C14360o3.A07(it);
                        while (it.hasNext()) {
                            Object next = it.next();
                            C3XG c3xg = (C3XG) next;
                            C14360o3.A0B(c3xg, 0);
                            if (c3xg.A06 == C1XV.A0Y) {
                                C38321qM A02 = C3XH.A02(c3xg.A05);
                                if (A02 != null && (B7K = A02.A0C.B7K()) != null) {
                                    str = B7K.getId();
                                } else {
                                    str = null;
                                }
                                if (C14360o3.A0K(str, hashtag.getId())) {
                                    arrayList.add(next);
                                }
                            }
                            arrayList2.add(next);
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            abstractC65332xV.A0D(it2.next());
                        }
                        abstractC65332xV.A01 = Collections.unmodifiableList(arrayList2);
                        AbstractC65332xV.A00(abstractC65332xV);
                        c65192xH.A0A(-1);
                    }
                    i = 516946586;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(-1035361079, A03);
            }
        };
        this.A0P = new InterfaceC42271xH() { // from class: X.3Bu
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                Context context;
                C14360o3.A0B(obj, 0);
                C69703Be c69703Be = C69703Be.this;
                Fragment fragment = (Fragment) c69703Be.A0b.get();
                if (fragment == null || (context = fragment.getContext()) == null || C54P.A00(context, c69703Be.A0T)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                int A03 = C0f9.A03(946914763);
                int A032 = C0f9.A03(-527147372);
                C14360o3.A0B(obj, 0);
                AbstractC60672pq abstractC60672pq = (AbstractC60672pq) C69703Be.this.A0b.get();
                if (abstractC60672pq == null) {
                    i = 1320429505;
                } else {
                    C65192xH c65192xH = (C65192xH) abstractC60672pq.getAdapter();
                    if (c65192xH != null) {
                        C47R c47r = C47R.A04;
                        C47K c47k = c65192xH.A05;
                        if (c47k != null) {
                            C114385Ef A00 = c65192xH.A0T.A00(c47k);
                            if (A00.A00 >= 0 && !c47k.A08()) {
                                List list = c47k.A0P;
                                if (list != null) {
                                    ListIterator listIterator = list.listIterator();
                                    while (true) {
                                        if (!listIterator.hasNext()) {
                                            break;
                                        }
                                        if (((C47L) listIterator.next()).A07 == c47r) {
                                            listIterator.remove();
                                            A00.A06 = true;
                                            c65192xH.notifyDataSetChangedSmart();
                                            break;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        }
                    }
                    i = 2011621188;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(1969101644, A03);
            }
        };
        this.A0L = new InterfaceC41501vz() { // from class: X.3Bv
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                int A03 = C0f9.A03(-495019505);
                int A032 = C0f9.A03(-812520403);
                C60662pp c60662pp2 = (C60662pp) C69703Be.this.A0b.get();
                if (c60662pp2 == null) {
                    i = 588227326;
                } else {
                    c60662pp2.A09 = C1EN.A05;
                    i = -346838008;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(-189507866, A03);
            }
        };
        this.A0S = new InterfaceC42271xH() { // from class: X.3Bw
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C14360o3.A0B(obj, 0);
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                C65192xH c65192xH;
                int A03 = C0f9.A03(892610178);
                C70063Cq c70063Cq = (C70063Cq) obj;
                int A032 = C0f9.A03(1504553163);
                C14360o3.A0B(c70063Cq, 0);
                C69703Be c69703Be = C69703Be.this;
                C60662pp c60662pp2 = (C60662pp) c69703Be.A0b.get();
                if (c60662pp2 == null) {
                    i = -1950891054;
                } else {
                    if (c70063Cq.A03) {
                        User user = c70063Cq.A00;
                        if (user.A1p() && c70063Cq.A02 && (c65192xH = (C65192xH) c60662pp2.getAdapter()) != null) {
                            c65192xH.A0E(user);
                        }
                    }
                    if (c70063Cq.A04) {
                        if (C18U.A06(C06090Tz.A05, c69703Be.A0T, 36317491840619785L)) {
                            c60662pp2.A0A().A0O().A0C(null, C05F.A0j);
                        }
                        boolean z = false;
                        if (c70063Cq.A00.A1r()) {
                            z = true;
                        }
                        c60662pp2.A0A().A0O().A0D(!z);
                    }
                    if (c70063Cq.A01) {
                        UserSession userSession2 = c69703Be.A0T;
                        C4F0 A00 = C4Ez.A00(userSession2);
                        C65192xH c65192xH2 = (C65192xH) c60662pp2.getAdapter();
                        if (c65192xH2 != null) {
                            C29912DHa c29912DHa = new C29912DHa(19, A00, c69703Be, c70063Cq);
                            List BRE = c65192xH2.BRE();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : BRE) {
                                if (((Boolean) c29912DHa.invoke(obj2)).booleanValue()) {
                                    arrayList.add(obj2);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C4F0.A00(userSession2, (C38321qM) it.next(), c70063Cq.A00);
                            }
                        }
                    }
                    i = 683324592;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(-2047260894, A03);
            }
        };
        this.A0R = new InterfaceC42271xH() { // from class: X.3Bx
            /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
            
                if (r0.A0A(r1) != false) goto L16;
             */
            @Override // X.InterfaceC42271xH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ boolean A79(java.lang.Object r7) {
                /*
                    r6 = this;
                    X.3Cr r7 = (X.C70073Cr) r7
                    r0 = 0
                    X.C14360o3.A0B(r7, r0)
                    X.3Be r0 = X.C69703Be.this
                    java.lang.ref.WeakReference r5 = r0.A0b
                    java.lang.Object r4 = r5.get()
                    X.2pq r4 = (X.AbstractC60672pq) r4
                    r3 = 0
                    if (r4 == 0) goto L48
                    com.instagram.user.model.User r2 = r7.A00
                    com.instagram.common.session.UserSession r0 = r0.A0T
                    X.2kX r0 = X.C57582kX.A00(r0)
                    boolean r0 = r0.A0Q(r2)
                    if (r0 == 0) goto L49
                    com.instagram.user.model.FollowStatus r1 = r2.A0F()
                    com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
                    if (r1 == r0) goto L31
                    com.instagram.user.model.FollowStatus r1 = r2.A0F()
                    com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
                    if (r1 != r0) goto L49
                L31:
                    java.lang.Object r0 = r5.get()
                    X.2pq r0 = (X.AbstractC60672pq) r0
                    if (r0 == 0) goto L49
                    X.2xM r0 = r0.getAdapter()
                    X.2xH r0 = (X.C65192xH) r0
                    if (r0 == 0) goto L49
                    int r0 = r0.B5m()
                    if (r0 != 0) goto L49
                L47:
                    r3 = 1
                L48:
                    return r3
                L49:
                    X.2xM r0 = r4.getAdapter()
                    X.2xH r0 = (X.C65192xH) r0
                    if (r0 == 0) goto L5f
                    java.lang.String r1 = r2.getId()
                    X.47K r0 = r0.A05
                    if (r0 == 0) goto L5f
                    boolean r0 = r0.A0A(r1)
                    if (r0 != 0) goto L47
                L5f:
                    boolean r0 = r7.A01
                    if (r0 == 0) goto L48
                    goto L47
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C69883Bx.A79(java.lang.Object):boolean");
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                boolean z;
                C65192xH c65192xH;
                int i;
                AbstractC60672pq abstractC60672pq;
                C65192xH c65192xH2;
                Integer B7X;
                ViewParent viewParent;
                int A03 = C0f9.A03(1123299276);
                C70073Cr c70073Cr = (C70073Cr) obj;
                int A032 = C0f9.A03(-2082659848);
                C14360o3.A0B(c70073Cr, 0);
                C69703Be c69703Be = C69703Be.this;
                WeakReference weakReference = c69703Be.A0b;
                C60662pp c60662pp2 = (C60662pp) weakReference.get();
                if (c60662pp2 == null) {
                    i = 554705679;
                } else {
                    User user = c70073Cr.A00;
                    UserSession userSession2 = c69703Be.A0T;
                    if (C57582kX.A00(userSession2).A0Q(user) && (user.A0F() == FollowStatus.A06 || user.A0F() == FollowStatus.A07)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (abstractC60672pq = (AbstractC60672pq) weakReference.get()) != null && (c65192xH2 = (C65192xH) abstractC60672pq.getAdapter()) != null && c65192xH2.B5m() == 0) {
                        C65192xH c65192xH3 = (C65192xH) c60662pp2.getAdapter();
                        if (c65192xH3 != null) {
                            String id = user.getId();
                            C47K c47k = c65192xH3.A05;
                            if (c47k == null || !c47k.A0A(id)) {
                                c60662pp2.A09 = C1EN.A0F;
                            }
                        }
                        C08730cb c08730cb = C17060sy.A01;
                        if (c08730cb.A01(userSession2).A03.B7X() != null && (B7X = c08730cb.A01(userSession2).A03.B7X()) != null && B7X.intValue() == 3) {
                            C3BC A0E = c60662pp2.A0A().A0E();
                            StickyHeaderListView stickyHeaderListView = c60662pp2.A0D;
                            if (stickyHeaderListView != null) {
                                C3BD c3bd = A0E.A00;
                                View view = c3bd.A02;
                                if (view != null) {
                                    viewParent = view.getParent();
                                } else {
                                    viewParent = null;
                                }
                                if (!AbstractC50102Ry.A00(viewParent, stickyHeaderListView)) {
                                    c3bd.A07(stickyHeaderListView);
                                }
                            }
                            c60662pp2.A0A().A0E().A00();
                            c60662pp2.A0A().A0E().A00.A06(null);
                        }
                    } else {
                        C65192xH c65192xH4 = (C65192xH) c60662pp2.getAdapter();
                        if (c65192xH4 != null) {
                            String id2 = user.getId();
                            C47K c47k2 = c65192xH4.A05;
                            if (c47k2 != null && c47k2.A0A(id2)) {
                                C65192xH c65192xH5 = (C65192xH) c60662pp2.getAdapter();
                                if (c65192xH5 != null) {
                                    c65192xH5.A0A(-1);
                                }
                            }
                        }
                        if (c70073Cr.A01 && (c65192xH = (C65192xH) c60662pp2.getAdapter()) != null) {
                            c65192xH.A0E(user);
                        }
                    }
                    i = -1809761701;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(-1155713994, A03);
            }
        };
        this.A0J = new InterfaceC41501vz() { // from class: X.3By
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0203, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r12.A02, 36315241272904820L) != false) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0205, code lost:
            
                r13 = r10.A03;
                r12 = new X.C25621Ms(r13, -2);
                r12.A09(X.C05F.A0N);
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0212, code lost:
            
                if (r11 == false) goto L62;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0214, code lost:
            
                r0 = "clips/check_clips_celebration_eligibility/";
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0216, code lost:
            
                r12.A0B(r0);
                r12.A02 = new X.C25581Mo(new X.C07510aQ(r13), X.C69886VxD.class);
                r1 = r12.A0N();
                r1.A00 = new X.C67942V3h(r10, r7, r14);
                X.C1GJ.A03(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0237, code lost:
            
                r0 = "feed/check_post_celebration_eligibility/";
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x024a, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, ((X.C69773Bl) r10).A01, 36316697266754157L) == false) goto L65;
             */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r23) {
                /*
                    Method dump skipped, instructions count: 691
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C69893By.onEvent(java.lang.Object):void");
            }
        };
        this.A05 = new InterfaceC41501vz() { // from class: X.3Bz
            /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0182  */
            /* JADX WARN: Type inference failed for: r7v0, types: [X.S3l, java.lang.Object] */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 729
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C69903Bz.onEvent(java.lang.Object):void");
            }
        };
        this.A0E = new InterfaceC41501vz() { // from class: X.3C0
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1529172937);
                int A032 = C0f9.A03(-418485656);
                AbstractC60672pq abstractC60672pq = (AbstractC60672pq) C69703Be.this.A0b.get();
                if (abstractC60672pq != null && abstractC60672pq.getAdapter() != null) {
                    throw new NullPointerException("getFeedItem");
                }
                C0f9.A0A(1778628423, A032);
                C0f9.A0A(1512509978, A03);
            }
        };
        this.A0N = new InterfaceC41501vz() { // from class: X.3C1
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1664279012);
                int A032 = C0f9.A03(-205538297);
                C60662pp c60662pp2 = (C60662pp) C69703Be.this.A0b.get();
                if (c60662pp2 != null) {
                    c60662pp2.A0P = true;
                }
                C0f9.A0A(-817129071, A032);
                C0f9.A0A(48087379, A03);
            }
        };
        this.A0A = new InterfaceC41501vz() { // from class: X.3C2
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                C65192xH c65192xH;
                int A03 = C0f9.A03(1081445006);
                int A032 = C0f9.A03(-254383972);
                AbstractC60672pq abstractC60672pq = (AbstractC60672pq) C69703Be.this.A0b.get();
                if (abstractC60672pq != null && (c65192xH = (C65192xH) abstractC60672pq.getAdapter()) != null) {
                    c65192xH.A0A(-1);
                }
                C0f9.A0A(1177996603, A032);
                C0f9.A0A(985112426, A03);
            }
        };
        this.A0D = new InterfaceC41501vz() { // from class: X.3C3
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                C65192xH c65192xH;
                int A03 = C0f9.A03(-243462436);
                int A032 = C0f9.A03(-459492171);
                AbstractC60672pq abstractC60672pq = (AbstractC60672pq) C69703Be.this.A0b.get();
                if (abstractC60672pq != null && (c65192xH = (C65192xH) abstractC60672pq.getAdapter()) != null) {
                    c65192xH.A0A(-1);
                }
                C0f9.A0A(2033366874, A032);
                C0f9.A0A(-1252850676, A03);
            }
        };
        this.A07 = new InterfaceC41501vz() { // from class: X.3C4
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                int A03 = C0f9.A03(-1180468601);
                int A032 = C0f9.A03(-1815098108);
                C60662pp c60662pp2 = (C60662pp) C69703Be.this.A0b.get();
                if (c60662pp2 == null) {
                    i = -1411515900;
                } else if (c60662pp2.mView == null) {
                    i = 800239781;
                } else {
                    ViewGroup CFj = c60662pp2.getScrollingViewProxy().CFj();
                    if (CFj != null) {
                        CFj.post(new GNK(c60662pp2));
                    }
                    i = -1777322298;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(-1930627899, A03);
            }
        };
        this.A0Q = new InterfaceC41501vz() { // from class: X.3C5
            /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r12) {
                /*
                    r11 = this;
                    r0 = 2035859220(0x7958bf14, float:7.033823E34)
                    int r4 = X.C0f9.A03(r0)
                    X.3Cy r12 = (X.C70143Cy) r12
                    r0 = -997893626(0xffffffffc4855a06, float:-1066.8132)
                    int r3 = X.C0f9.A03(r0)
                    r0 = 0
                    X.C14360o3.A0B(r12, r0)
                    X.1qM r10 = r12.A00
                    X.3Be r5 = X.C69703Be.this
                    java.lang.ref.WeakReference r0 = r5.A0b
                    java.lang.Object r2 = r0.get()
                    X.2pq r2 = (X.AbstractC60672pq) r2
                    if (r2 == 0) goto L2e
                    X.2xM r1 = r2.getAdapter()
                    X.2xH r1 = (X.C65192xH) r1
                    if (r1 == 0) goto L2e
                    r0 = -1
                    r1.A0A(r0)
                L2e:
                    com.instagram.common.typedurl.ImageUrl r9 = r10.A1S()
                    java.lang.String r8 = "Required value was null."
                    if (r9 == 0) goto L92
                    com.instagram.common.session.UserSession r7 = r5.A0T
                    r6 = 0
                    if (r2 == 0) goto L8f
                    androidx.fragment.app.FragmentActivity r5 = r2.getActivity()
                    android.content.Context r0 = r2.getContext()
                    if (r0 == 0) goto L90
                    android.content.res.Resources r1 = r0.getResources()
                    if (r1 == 0) goto L90
                    r0 = 2131972421(0x7f135145, float:1.958185E38)
                    java.lang.String r0 = r1.getString(r0)
                L52:
                    java.lang.String r2 = r10.getId()
                    if (r2 == 0) goto L9b
                    X.6i8 r1 = new X.6i8
                    r1.<init>()
                    r1.A0D = r6
                    r1.A09 = r9
                    r1.A03()
                    r1.A01()
                    if (r0 != 0) goto L6b
                    java.lang.String r0 = ""
                L6b:
                    r1.A0G = r0
                    X.Iun r0 = new X.Iun
                    r0.<init>(r5, r7, r2)
                    r1.A0A = r0
                    X.1vu r2 = X.C41451vu.A01
                    X.DqE r1 = r1.A00()
                    X.3KD r0 = new X.3KD
                    r0.<init>(r1)
                    r2.E4s(r0)
                    r0 = 1638090222(0x61a345ee, float:3.7648228E20)
                    X.C0f9.A0A(r0, r3)
                    r0 = -100769205(0xfffffffff9fe624b, float:-1.6510463E35)
                    X.C0f9.A0A(r0, r4)
                    return
                L8f:
                    r5 = r6
                L90:
                    r0 = r6
                    goto L52
                L92:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    r1.<init>(r8)
                    r0 = 84308629(0x5067295, float:6.321695E-36)
                    goto La3
                L9b:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    r1.<init>(r8)
                    r0 = -978925183(0xffffffffc5a6c981, float:-5337.188)
                La3:
                    X.C0f9.A0A(r0, r3)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3C5.onEvent(java.lang.Object):void");
            }
        };
        this.A0F = new InterfaceC41501vz() { // from class: X.3C6
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                C65192xH c65192xH;
                int A03 = C0f9.A03(-984136436);
                int A032 = C0f9.A03(-1021930191);
                AbstractC60672pq abstractC60672pq = (AbstractC60672pq) C69703Be.this.A0b.get();
                if (abstractC60672pq != null && (c65192xH = (C65192xH) abstractC60672pq.getAdapter()) != null) {
                    c65192xH.A0A(-1);
                }
                C0f9.A0A(-732222681, A032);
                C0f9.A0A(893033122, A03);
            }
        };
        this.A0I = new InterfaceC41501vz() { // from class: X.3C7
            /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
            
                if (r2 != X.C05F.A00) goto L18;
             */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r9) {
                /*
                    r8 = this;
                    r0 = -913061674(0xffffffffc993c8d6, float:-1210650.8)
                    int r6 = X.C0f9.A03(r0)
                    X.3MB r9 = (X.C3MB) r9
                    r0 = 1859434303(0x6ed4b73f, float:3.2916177E28)
                    int r5 = X.C0f9.A03(r0)
                    r0 = 0
                    X.C14360o3.A0B(r9, r0)
                    java.lang.String r1 = r9.A02
                    java.lang.String r0 = "main_feed"
                    boolean r0 = r0.equals(r1)
                    if (r0 != 0) goto L2b
                    r0 = -284970146(0xffffffffef03b35e, float:-4.075938E28)
                L21:
                    X.C0f9.A0A(r0, r5)
                    r0 = -1311690125(0xffffffffb1d13273, float:-6.088436E-9)
                    X.C0f9.A0A(r0, r6)
                    return
                L2b:
                    X.3qg r1 = r9.A00
                    java.util.List r7 = r1.A0M
                    if (r7 != 0) goto L35
                    r0 = 1166921246(0x458dce1e, float:4537.7646)
                    goto L21
                L35:
                    X.3Be r4 = X.C69703Be.this
                    java.lang.ref.WeakReference r0 = r4.A0b
                    java.lang.Object r0 = r0.get()
                    androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
                    if (r0 == 0) goto L70
                    androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
                    if (r3 == 0) goto L70
                    java.lang.Integer r2 = r1.A09
                    if (r2 == 0) goto L50
                    java.lang.Integer r0 = X.C05F.A00
                    r1 = 1
                    if (r2 == r0) goto L51
                L50:
                    r1 = 0
                L51:
                    com.instagram.common.session.UserSession r0 = r4.A0T
                    X.8hC r2 = X.AbstractC35239FgY.A00(r3, r3, r0, r7, r1)
                    r1 = 2131966315(0x7f13396b, float:1.9569465E38)
                    X.IfE r0 = new X.IfE
                    r0.<init>(r9, r4)
                    r2.A0H(r0, r1)
                    r2.A07()
                    android.app.Dialog r0 = r2.A02()
                    X.C0fJ.A00(r0)
                    r0 = 1657758972(0x62cf64fc, float:1.9128764E21)
                    goto L21
                L70:
                    r0 = -1645725438(0xffffffff9de83902, float:-6.1468833E-21)
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3C7.onEvent(java.lang.Object):void");
            }
        };
        this.A06 = new InterfaceC41501vz() { // from class: X.3C8
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                FragmentActivity activity;
                int A03 = C0f9.A03(-1619317533);
                C3HX c3hx = (C3HX) obj;
                int A032 = C0f9.A03(167090113);
                C14360o3.A0B(c3hx, 0);
                if (c3hx.A01) {
                    C38321qM c38321qM = c3hx.A00;
                    if (c38321qM.A5H()) {
                        C69703Be c69703Be = C69703Be.this;
                        Fragment fragment = (Fragment) c69703Be.A0b.get();
                        if (fragment != null && (activity = fragment.getActivity()) != null) {
                            AbstractC50558MTp.A08(activity, c69703Be.A0T, c38321qM, 0);
                        } else {
                            i = -1124072785;
                            C0f9.A0A(i, A032);
                            C0f9.A0A(-1247527177, A03);
                        }
                    }
                }
                i = 1193865808;
                C0f9.A0A(i, A032);
                C0f9.A0A(-1247527177, A03);
            }
        };
        this.A08 = new InterfaceC41501vz() { // from class: X.3C9
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-671668225);
                int A032 = C0f9.A03(1698942314);
                C69703Be c69703Be = C69703Be.this;
                Fragment fragment = (Fragment) c69703Be.A0b.get();
                if (fragment != null && C1VN.A00 != null) {
                    AbstractC31282Dp4.A00().A02(c69703Be.A0T, fragment.getActivity(), "950407163107461");
                }
                C0f9.A0A(1120898652, A032);
                C0f9.A0A(626939453, A03);
            }
        };
        this.A0G = new InterfaceC41501vz() { // from class: X.3CA
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-482732872);
                int A032 = C0f9.A03(465115765);
                C60662pp c60662pp2 = (C60662pp) C69703Be.this.A0b.get();
                if (c60662pp2 != null) {
                    c60662pp2.A0A().A0O().A08(true);
                }
                C0f9.A0A(-1205726763, A032);
                C0f9.A0A(931603913, A03);
            }
        };
        this.A0B = new InterfaceC41501vz() { // from class: X.3CB
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1404146989);
                int A032 = C0f9.A03(909279354);
                C3K4 A00 = C60662pp.this.A09().A00();
                C3K4.A03(A00);
                C3K4.A04(C1EN.A07, C3FZ.A05, A00);
                C0f9.A0A(-1228521066, A032);
                C0f9.A0A(-1144949883, A03);
            }
        };
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        C69793Bn c69793Bn = this.A03;
        c69793Bn.A9E(this.A0H, C70033Cn.class);
        c69793Bn.A9E(this.A0P, C70043Co.class);
        c69793Bn.A9E(this.A0L, C70053Cp.class);
        c69793Bn.A9E(this.A0S, C70063Cq.class);
        c69793Bn.A9E(this.A0R, C70073Cr.class);
        c69793Bn.A9E(this.A0J, C70083Cs.class);
        c69793Bn.A9E(this.A0X, C70083Cs.class);
        c69793Bn.A9E(this.A0E, AbstractC70093Ct.class);
        c69793Bn.A9E(this.A0N, C70103Cu.class);
        c69793Bn.A9E(this.A0A, C70113Cv.class);
        c69793Bn.A9E(this.A0D, C70123Cw.class);
        c69793Bn.A9E(this.A07, C70133Cx.class);
        c69793Bn.A9E(this.A0Q, C70143Cy.class);
        c69793Bn.A9E(this.A05, C70153Cz.class);
        c69793Bn.A9E(this.A08, C3D0.class);
        c69793Bn.A9E(this.A0G, C3D1.class);
        c69793Bn.A9E(this.A0B, C3D2.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        C69793Bn c69793Bn = this.A04;
        C25671My c25671My = c69793Bn.A00;
        if (c25671My != null) {
            c25671My.A04(c69793Bn.A01);
        }
        c69793Bn.A00 = null;
        C69793Bn c69793Bn2 = this.A03;
        C25671My c25671My2 = c69793Bn2.A00;
        if (c25671My2 != null) {
            c25671My2.A04(c69793Bn2.A01);
        }
        c69793Bn2.A00 = null;
        C69793Bn c69793Bn3 = this.A02;
        C25671My c25671My3 = c69793Bn3.A00;
        if (c25671My3 != null) {
            c25671My3.A04(c69793Bn3.A01);
        }
        c69793Bn3.A00 = null;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C69793Bn c69793Bn = this.A04;
        C25671My c25671My = c69793Bn.A00;
        if (c25671My != null) {
            c25671My.A04(c69793Bn.A01);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C69793Bn c69793Bn = this.A04;
        c69793Bn.A9E(this.A09, C3HR.class);
        c69793Bn.A9E(this.A0M, C3HS.class);
        c69793Bn.A9E(this.A0U, C3HT.class);
        c69793Bn.A9E(this.A0K, C3HU.class);
        c69793Bn.A9E(this.A0C, C3HV.class);
        c69793Bn.A9E(this.A0O, C3HW.class);
        c69793Bn.A9E(this.A06, C3HX.class);
    }
}
