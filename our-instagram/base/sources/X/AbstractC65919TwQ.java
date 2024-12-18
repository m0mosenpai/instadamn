package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.TwQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65919TwQ extends AbstractC114495Et implements InterfaceC11380iw, InterfaceC60072op, InterfaceC50405MNh {
    public static final String __redex_internal_original_name = "BaseSearchChildFragment";
    public int A00;
    public C18920wW A02;
    public C44226JgW A03;
    public C66163U2e A04;
    public InterfaceC190488c6 A05;
    public U1U A06;
    public C65960TxC A07;
    public C65966TxJ A08;
    public MZF A09;
    public C65974TxR A0A;
    public InterfaceC169497hP A0B;
    public C66157U1y A0C;
    public C65973TxQ A0D;
    public C65964TxH A0E;
    public boolean A0H;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public long A0T;
    public InterfaceC41501vz A0V;
    public InterfaceC41501vz A0W;
    public InterfaceC41501vz A0X;
    public C66136U1d A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final Handler A0b = new HandlerC65967TxK(Looper.getMainLooper(), this, 9);
    public final XLN A0c = new C70889Wji(this, 3);
    public final XAq A0e = new Wk0(this, 3);
    public final XBD A0m = new U2A(this);
    public final InterfaceC72014XFc A0v = C66159U2a.A00;
    public final InterfaceC60602pj A0u = new C37766Gjh(this, 4);
    public long A0U = 200;
    public String A0F = "";
    public UQE A01 = new UQE("");
    public Map A0G = new ConcurrentHashMap();
    public final InterfaceC09390do A14 = AbstractC09440dt.A01(new X30(this, 49));
    public final InterfaceC09390do A0r = AbstractC09440dt.A01(new X30(this, 47));
    public final InterfaceC09390do A0q = AbstractC09440dt.A01(new X30(this, 46));
    public final InterfaceC09390do A15 = AbstractC60492pY.A02(this);
    public int A0S = Integer.MAX_VALUE;
    public final InterfaceC09390do A0s = AbstractC09440dt.A00(EnumC09460dv.A02, new X30(this, 48));
    public final U2B A0o = new U2B(this);
    public final XDv A0l = new U2C(this);
    public final GYT A0p = new C71062WnJ(this, 2);
    public final XB8 A0k = new C65925TwW(this, 1);
    public final XB7 A0j = new U2E(this);
    public final XB4 A0f = new U2F(this);
    public final InterfaceC72022XFk A0i = new U30(this, 0);
    public final XBA A0w = new U2D(this);
    public final U2H A0n = new U2H(this);
    public boolean A0I = true;
    public final XB5 A0g = new U2G(this);
    public final XAn A0d = new U2O(this);
    public final XBI A13 = new U2J(this);
    public final XBF A10 = new U2M(this);
    public final XBH A12 = new U2K(this);
    public final XBG A11 = new U2L(this);
    public final XBE A0z = new U2N(this);
    public final U2P A0y = new U2P(this);
    public final U2I A0x = new U2I(this);
    public final InterfaceC41501vz A0t = new C70723Wfo(this, 19);
    public final XB6 A0h = new MZQ(this, 3);

    public static final void A0B(AbstractC65919TwQ abstractC65919TwQ, String str) {
        A0D(abstractC65919TwQ, false);
        if (C14360o3.A0K(str, abstractC65919TwQ.A01.A01)) {
            Handler handler = abstractC65919TwQ.A0b;
            if (handler.hasMessages(1)) {
                handler.removeMessages(1);
                A0C(abstractC65919TwQ, str);
            }
        }
    }

    public C66158U1z A0G() {
        U2Q u2q = ((C65918TwP) this).A0b.A0a;
        if (u2q != null) {
            C208199Jd c208199Jd = u2q.A00;
            C66157U1y c66157U1y = new C66157U1y();
            A0E();
            return new C66158U1z(new C65966TxJ(), c208199Jd, c66157U1y);
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0L(java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC65919TwQ.A0L(java.lang.String, java.lang.String):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C25671My A00 = AbstractC25651Mw.A00(A0E());
        InterfaceC41501vz interfaceC41501vz = this.A0W;
        if (interfaceC41501vz == null) {
            str = "clearSearchesEventListener";
        } else {
            A00.A01(interfaceC41501vz, C70710WfZ.class);
            InterfaceC41501vz interfaceC41501vz2 = this.A0X;
            if (interfaceC41501vz2 == null) {
                str = "updatedSearchesEventListener";
            } else {
                A00.A01(interfaceC41501vz2, C70703WfS.class);
                A00.A01(this.A0t, C70043Co.class);
                InterfaceC41501vz interfaceC41501vz3 = this.A0V;
                if (interfaceC41501vz3 == null) {
                    str = "aiInitializedEventListener";
                } else {
                    A00.A01(interfaceC41501vz3, C54I.class);
                    C65960TxC c65960TxC = this.A07;
                    if (c65960TxC == null) {
                        str = "dataSource";
                    } else {
                        C65963TxG.A00(c65960TxC, this);
                        U1U u1u = this.A06;
                        if (u1u != null) {
                            u1u.A02();
                        }
                        U28 u28 = ((C65918TwP) this).A0b.A0c;
                        if (u28 != null) {
                            U1T A0H = A0H();
                            C66136U1d A0I = A0I();
                            RecyclerView recyclerView = A0H.A00;
                            if (recyclerView != null) {
                                A0I.A01.A08(recyclerView, C71163Hc.A00(this), new U1Y(recyclerView, u28));
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                        PZC.A02(this, AbstractC25235BEs.A0S(this), 26);
                        FragmentActivity requireActivity = requireActivity();
                        if (requireActivity instanceof IgFragmentActivity) {
                            ((IgFragmentActivity) requireActivity).registerOnActivityResultListener(this.A0u);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A09(UQE uqe, AbstractC65919TwQ abstractC65919TwQ) {
        String str;
        RecyclerView recyclerView;
        boolean z;
        RecyclerView recyclerView2;
        AbstractC70663Fe abstractC70663Fe;
        C65964TxH c65964TxH = abstractC65919TwQ.A0E;
        if (c65964TxH == null) {
            str = "searchResultsProvider";
        } else {
            String str2 = uqe.A01;
            c65964TxH.A00 = str2;
            C65960TxC c65960TxC = abstractC65919TwQ.A07;
            if (c65960TxC == null) {
                str = "dataSource";
            } else {
                c65960TxC.A04();
                A0A(abstractC65919TwQ);
                if (C14360o3.A0K(uqe.A00, "fbsearch/keyword_typeahead/")) {
                    C65963TxG c65963TxG = abstractC65919TwQ.A0H().A01;
                    c65963TxG.A05 = false;
                    c65963TxG.A01();
                }
                C65966TxJ c65966TxJ = abstractC65919TwQ.A08;
                if (c65966TxJ != null) {
                    if (c65966TxJ.A04(str2)) {
                        C65974TxR c65974TxR = abstractC65919TwQ.A0A;
                        if (c65974TxR == null) {
                            str = "queuedTypeaheadManager";
                        } else if (c65974TxR.A08 && c65974TxR.A05.A00) {
                            abstractC65919TwQ.A0K(str2, false);
                            recyclerView = abstractC65919TwQ.A0H().A00;
                            z = true;
                            if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null && ((LinearLayoutManager) abstractC70663Fe).A1a() != 0) {
                                z = false;
                            }
                            abstractC65919TwQ.A0H().A01.A01();
                            if (!z && (recyclerView2 = abstractC65919TwQ.A0H().A00) != null) {
                                recyclerView2.A0n(0);
                                return;
                            }
                            return;
                        }
                    }
                    C65963TxG c65963TxG2 = abstractC65919TwQ.A0H().A01;
                    c65963TxG2.A06 = false;
                    c65963TxG2.A01();
                    recyclerView = abstractC65919TwQ.A0H().A00;
                    z = true;
                    if (recyclerView != null) {
                        z = false;
                    }
                    abstractC65919TwQ.A0H().A01.A01();
                    if (!z) {
                        return;
                    } else {
                        return;
                    }
                }
                str = "informModuleController";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A0C(AbstractC65919TwQ abstractC65919TwQ, String str) {
        String str2;
        C65973TxQ c65973TxQ = abstractC65919TwQ.A0D;
        if (c65973TxQ == null) {
            str2 = "searchQueryPerfLogger";
        } else {
            C65960TxC c65960TxC = abstractC65919TwQ.A07;
            if (c65960TxC == null) {
                str2 = "dataSource";
            } else {
                int size = c65960TxC.A01.A00.size();
                C14360o3.A0B(str, 0);
                ConcurrentMap concurrentMap = c65973TxQ.A00;
                U1D u1d = (U1D) concurrentMap.get(str);
                if (u1d != null) {
                    u1d.A01("SEARCH_CACHED_RESULTS_DISPLAYED", null);
                }
                U1D u1d2 = (U1D) concurrentMap.get(str);
                if (u1d2 != null) {
                    u1d2.A03.put("cached_results_count", Integer.valueOf(size));
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public static final void A0D(AbstractC65919TwQ abstractC65919TwQ, boolean z) {
        String str;
        C65964TxH c65964TxH = abstractC65919TwQ.A0E;
        if (c65964TxH == null) {
            str = "searchResultsProvider";
        } else {
            c65964TxH.A01 = z;
            C65960TxC c65960TxC = abstractC65919TwQ.A07;
            if (c65960TxC == null) {
                str = "dataSource";
            } else {
                c65960TxC.A04();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final UserSession A0E() {
        return (UserSession) this.A15.getValue();
    }

    public final InterfaceC190488c6 A0F() {
        InterfaceC190488c6 interfaceC190488c6 = this.A05;
        if (interfaceC190488c6 != null) {
            return interfaceC190488c6;
        }
        C14360o3.A0F("searchLogger");
        throw C00O.createAndThrow();
    }

    public final U1T A0H() {
        return (U1T) this.A14.getValue();
    }

    public final C66136U1d A0I() {
        C66136U1d c66136U1d = this.A0Y;
        if (c66136U1d != null) {
            return c66136U1d;
        }
        C14360o3.A0F("searchHomeViewpointHelper");
        throw C00O.createAndThrow();
    }

    public void A0J(C51621MrE c51621MrE) {
        int i;
        String str;
        if (!c51621MrE.A05) {
            C65960TxC c65960TxC = this.A07;
            if (c65960TxC == null) {
                str = "dataSource";
            } else {
                if (c51621MrE.A04) {
                    i = c51621MrE.A01;
                } else {
                    i = c65960TxC.A02;
                }
                c65960TxC.A00 = i;
                c65960TxC.A03.DjE(c51621MrE);
                C65964TxH c65964TxH = this.A0E;
                if (c65964TxH == null) {
                    str = "searchResultsProvider";
                } else {
                    c65964TxH.DjE(c51621MrE);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        ((C2GT) this.A0s.getValue()).A05(this);
    }

    public final void A0K(CharSequence charSequence, boolean z) {
        int color;
        String A0f;
        boolean z2 = this.A0H;
        Context requireContext = requireContext();
        if (z2) {
            color = requireContext.getColor(R.color.badge_color);
            A0f = AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), charSequence, 2131973013);
        } else {
            color = requireContext.getColor(R.color.grey_5);
            A0f = AbstractC167007dF.A0f(requireContext(), charSequence, 2131973065);
        }
        U1T A0H = A0H();
        C14360o3.A0B(A0f, 0);
        C65963TxG c65963TxG = A0H.A01;
        c65963TxG.A0D.A00 = z;
        C31699Dw4 c31699Dw4 = c65963TxG.A0C;
        c31699Dw4.A01 = A0f;
        c31699Dw4.A00 = color;
        c65963TxG.A06 = true;
        c65963TxG.A01();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 15739) {
            VWZ.A00(A0E()).A00(requireActivity());
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        boolean z2 = C2U8.A03;
        return null;
    }

    public static final void A0A(AbstractC65919TwQ abstractC65919TwQ) {
        C65963TxG c65963TxG = abstractC65919TwQ.A0H().A01;
        c65963TxG.A04 = false;
        c65963TxG.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0176, code lost:
    
        if (X.C18U.A06(r5, r10, 36317431706227872L) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0197, code lost:
    
        if (X.C18U.A06(r5, r10, 36317431706227872L) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0432  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r45) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC65919TwQ.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(472468107);
        C14360o3.A0B(layoutInflater, 0);
        A0H();
        View inflate = layoutInflater.inflate(R.layout.layout_search_rv, viewGroup, false);
        U1T A0H = A0H();
        C14360o3.A0A(inflate);
        C14360o3.A0B(inflate, 0);
        RecyclerView A0F = AbstractC31176DnK.A0F(inflate);
        A0H.A00 = A0F;
        if (A0F != null) {
            AbstractC31174DnI.A15(inflate.getContext(), A0F);
            A0F.setAdapter(A0H.A01.A0A);
            A0F.A0S = true;
            A0F.setItemAnimator(null);
        }
        C61372qz c61372qz = new C61372qz();
        c61372qz.A03(new U1V(this.A0l));
        C66136U1d A0I = A0I();
        C65918TwP c65918TwP = ((C65918TwP) this).A0b;
        long j = c65918TwP.A01;
        c65918TwP.A01 = 0L;
        A0I.A00.sendEmptyMessageDelayed(0, j);
        RecyclerView recyclerView = A0H().A00;
        if (recyclerView != null) {
            recyclerView.A14(c61372qz);
            U1U u1u = this.A06;
            if (u1u != null) {
                u1u.D8R(layoutInflater, viewGroup);
            }
            C0f9.A09(-1649830619, A02);
            return inflate;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        int A02 = C0f9.A02(-313565539);
        super.onDestroy();
        C65974TxR c65974TxR = this.A0A;
        if (c65974TxR == null) {
            str = "queuedTypeaheadManager";
        } else {
            c65974TxR.onDestroy();
            C65973TxQ c65973TxQ = this.A0D;
            if (c65973TxQ == null) {
                str = "searchQueryPerfLogger";
            } else {
                ConcurrentMap concurrentMap = c65973TxQ.A00;
                Iterator A12 = AbstractC43593JPy.A12(concurrentMap);
                while (A12.hasNext()) {
                    String str2 = (String) A12.next();
                    C14360o3.A0A(str2);
                    C65973TxQ.A00(c65973TxQ, str2, null, 0, 0, false);
                    C65973TxQ.A02(c65973TxQ, str2, "SEARCH_EXIT_NAVIGATION", (short) 4);
                }
                concurrentMap.clear();
                AnonymousClass746.A00(A0E()).A00 = null;
                C0f9.A09(-1010341276, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(1129241245);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof IgFragmentActivity) {
            ((IgFragmentActivity) requireActivity).unregisterOnActivityResultListener(this.A0u);
        }
        C25671My A00 = AbstractC25651Mw.A00(A0E());
        InterfaceC41501vz interfaceC41501vz = this.A0W;
        if (interfaceC41501vz == null) {
            str = "clearSearchesEventListener";
        } else {
            A00.A02(interfaceC41501vz, C70710WfZ.class);
            InterfaceC41501vz interfaceC41501vz2 = this.A0X;
            if (interfaceC41501vz2 == null) {
                str = "updatedSearchesEventListener";
            } else {
                A00.A02(interfaceC41501vz2, C70703WfS.class);
                A00.A02(this.A0t, C70043Co.class);
                InterfaceC41501vz interfaceC41501vz3 = this.A0V;
                if (interfaceC41501vz3 == null) {
                    str = "aiInitializedEventListener";
                } else {
                    A00.A02(interfaceC41501vz3, C54I.class);
                    super.onDestroyView();
                    ((C43812JYz) ((C65918TwP) this).A0b.A0i.getValue()).A00();
                    U1T A0H = A0H();
                    RecyclerView recyclerView = A0H.A00;
                    if (recyclerView != null) {
                        recyclerView.setAdapter(null);
                        A0H.A00 = null;
                    }
                    C0f9.A09(1765831712, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int A02 = C0f9.A02(943573884);
        super.onPause();
        ((C43812JYz) ((C65918TwP) this).A0b.A0i.getValue()).A00();
        A0I().A00();
        U1U u1u = this.A06;
        if (u1u != null) {
            u1u.onPause();
        }
        C0f9.A09(-678411995, A02);
    }

    @Override // X.AbstractC114495Et, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-1613127668);
        super.onResume();
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null && A05.A0a()) {
            A05.A0Y(this);
        }
        AnonymousClass747 A00 = AnonymousClass746.A00(A0E());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            A00.A00(activity);
            UserSession A0E = A0E();
            if (C18U.A06(AbstractC166997dE.A0U(A0E), A0E, 36321082428368010L)) {
                A0H().A01.A01();
            }
            C0f9.A09(73897743, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-1170774014, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int A02 = C0f9.A02(-1343951991);
        super.onStart();
        C66152U1t c66152U1t = (C66152U1t) ((C65918TwP) this).A0b.A0f.getValue();
        if (c66152U1t != null) {
            XBI xbi = this.A13;
            C14360o3.A0B(xbi, 0);
            c66152U1t.A08.add(xbi);
            XBF xbf = this.A10;
            C14360o3.A0B(xbf, 0);
            c66152U1t.A04.add(xbf);
            XBH xbh = this.A12;
            C14360o3.A0B(xbh, 0);
            c66152U1t.A07.add(xbh);
            XBG xbg = this.A11;
            C14360o3.A0B(xbg, 0);
            c66152U1t.A05.add(xbg);
            XBE xbe = this.A0z;
            C14360o3.A0B(xbe, 0);
            c66152U1t.A03.add(xbe);
        }
        AbstractC65962TxF.A00(A0E()).A00 = this.A0y;
        AbstractC65975TxT.A00(A0E()).A03 = this.A0x;
        C0f9.A09(-1194302263, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int A02 = C0f9.A02(936656203);
        super.onStop();
        C66152U1t c66152U1t = (C66152U1t) ((C65918TwP) this).A0b.A0f.getValue();
        if (c66152U1t != null) {
            XBI xbi = this.A13;
            C14360o3.A0B(xbi, 0);
            c66152U1t.A08.remove(xbi);
            XBF xbf = this.A10;
            C14360o3.A0B(xbf, 0);
            c66152U1t.A04.remove(xbf);
            XBH xbh = this.A12;
            C14360o3.A0B(xbh, 0);
            c66152U1t.A07.remove(xbh);
            XBG xbg = this.A11;
            C14360o3.A0B(xbg, 0);
            c66152U1t.A05.remove(xbg);
            XBE xbe = this.A0z;
            C14360o3.A0B(xbe, 0);
            c66152U1t.A03.remove(xbe);
        }
        AbstractC65962TxF.A00(A0E()).A00 = null;
        AbstractC65975TxT.A00(A0E()).A03 = null;
        C0f9.A09(-361260084, A02);
    }
}
