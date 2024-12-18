package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class EOI extends AbstractC43842Ja5 implements InterfaceC60122ou, InterfaceC60152ox, InterfaceC169467hM {
    public static final String __redex_internal_original_name = "DiscoverPeopleQuickFriendingFragment";
    public ViewGroup A00;
    public LinearLayout A01;
    public ShimmerFrameLayout A02;
    public ShimmerFrameLayout A03;
    public InterfaceC11380iw A04;
    public C31823Dyh A05;
    public InterfaceC37264GbH A06;
    public C32122E9v A07;
    public GFV A08;
    public C65974TxR A09;
    public ProgressButton A0A;
    public SearchEditText A0B;
    public C63702ur A0C;
    public boolean A0E;
    public int A0F;
    public TextView A0G;
    public InterfaceC56362iU A0H;
    public C3I9 A0I;
    public C35121FeO A0J;
    public final InterfaceC09390do A0R = AbstractC60492pY.A02(this);
    public final ArrayList A0L = AbstractC166987dD.A1E();
    public final LinkedHashSet A0Q = AbstractC31171DnF.A0l();
    public final HashSet A0O = AbstractC166987dD.A1H();
    public final HashMap A0M = AbstractC166987dD.A1G();
    public final HashMap A0N = AbstractC166987dD.A1G();
    public final HashSet A0P = AbstractC166987dD.A1H();
    public HashSet A0D = AbstractC166987dD.A1H();
    public final String A0K = "dp_nux_quick_friending";

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        C14360o3.A0B(str, 0);
        InterfaceC09390do interfaceC09390do = this.A0R;
        return IS1.A00(AbstractC55112ObW.A00(AbstractC166987dD.A0r(interfaceC09390do)), AbstractC166987dD.A0r(interfaceC09390do), str, "discover_people_nux_quick_friending");
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Object obj;
        C14360o3.A0B(interfaceC56362iU, 0);
        this.A0H = interfaceC56362iU;
        interfaceC56362iU.setTitle(getString(2131961157));
        this.A06 = AbstractC34275F9v.A00(this);
        interfaceC56362iU.EkS(false);
        C229419w A02 = C18U.A02(AbstractC166987dD.A0o(this.A0R), 37167457274102213L);
        if (A02 != null) {
            obj = Double.valueOf(A02.AzB(C06090Tz.A04, 37167457274102213L));
        } else {
            obj = 0;
        }
        AbstractC167007dF.A0J().postDelayed(new RunnableC36850GLx(this), TimeUnit.SECONDS.toMillis(AbstractC166987dD.A0N(obj)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "discover_people_nux_quick_friending";
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOI.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C6PG A00(E8F e8f, int i) {
        User user = e8f.A00;
        if (user != null) {
            C6PG c6pg = new C6PG("discover_people_nux_quick_friending", user.getId(), "discover_people_nux_quick_friending");
            String str = e8f.A05;
            if (str != null) {
                c6pg.A07 = str;
            }
            c6pg.A00 = i;
            String str2 = e8f.A02;
            if (str2 != null) {
                c6pg.A04 = str2;
            }
            return c6pg;
        }
        return null;
    }

    public static final void A03(EOI eoi) {
        ArrayList arrayList;
        if (!eoi.A0Q.isEmpty()) {
            arrayList = A02(eoi);
        } else {
            arrayList = eoi.A0L;
        }
        eoi.A0B(arrayList);
    }

    public static final void A04(EOI eoi) {
        C32122E9v c32122E9v = eoi.A07;
        if (c32122E9v == null) {
            C14360o3.A0F("perfLogger");
            throw C00O.createAndThrow();
        }
        c32122E9v.A0E("fetch_request_start");
        C1ON A01 = AbstractC31513Dsx.A01(AbstractC166987dD.A0r(eoi.A0R), null, null, null, true, false);
        A01.A00 = new C32509ETk(eoi);
        eoi.schedule(A01);
    }

    public static final void A05(EOI eoi) {
        C32122E9v c32122E9v = eoi.A07;
        String str = "perfLogger";
        if (c32122E9v != null) {
            ((MTJ) c32122E9v).A00.A08(null);
            C32122E9v c32122E9v2 = eoi.A07;
            if (c32122E9v2 != null) {
                c32122E9v2.A0E("get_users_start");
                C31823Dyh c31823Dyh = eoi.A05;
                str = "suggestionsViewModel";
                if (c31823Dyh != null) {
                    if (AbstractC31176DnK.A1b(c31823Dyh.A01)) {
                        InterfaceC09390do interfaceC09390do = eoi.A0R;
                        C229419w A02 = C18U.A02(AbstractC166987dD.A0o(interfaceC09390do), 36323032343718771L);
                        if (A02 != null && A02.AhE(C06090Tz.A04, 36323032343718771L)) {
                            C31823Dyh c31823Dyh2 = eoi.A05;
                            if (c31823Dyh2 != null) {
                                boolean A1b = AbstractC31176DnK.A1b(c31823Dyh2.A00);
                                interfaceC09390do.getValue();
                                if (!A1b) {
                                    eoi.A0C(1001137806);
                                } else {
                                    eoi.A0C(1001144203);
                                    eoi.updateUi(MXS.A04, C16930sl.A00);
                                    AbstractC166987dD.A1Z(new PZG(eoi, (InterfaceC23621Ds) null, 12), C07Y.A00(eoi));
                                    return;
                                }
                            }
                        }
                    }
                    A04(eoi);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A06(EOI eoi) {
        String str;
        if (eoi.A0E) {
            ProgressButton progressButton = eoi.A0A;
            if (progressButton != null) {
                AbstractC31173DnH.A0z(eoi.requireContext(), progressButton, R.drawable.reg_blue_button_background__filled_blue_disabled_progress);
                progressButton.setText(2131962676);
                progressButton.setEnabled(A0A(eoi));
            }
            TextView textView = eoi.A0G;
            if (textView == null) {
                str = "progressSubtitle";
            } else {
                textView.setBackground(null);
                AbstractC25227BEk.A12(textView, eoi, 2131961155);
                ShimmerFrameLayout shimmerFrameLayout = eoi.A02;
                if (shimmerFrameLayout == null) {
                    str = "progressContainer";
                } else {
                    shimmerFrameLayout.A03();
                    shimmerFrameLayout.A04(null);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A07(EOI eoi) {
        String str;
        if (eoi.A0E) {
            ShimmerFrameLayout shimmerFrameLayout = eoi.A03;
            if (shimmerFrameLayout == null) {
                str = "searchBarContainer";
            } else {
                shimmerFrameLayout.A03();
                shimmerFrameLayout.A04(null);
                SearchEditText searchEditText = eoi.A0B;
                if (searchEditText == null) {
                    str = "searchEditText";
                } else {
                    searchEditText.setSearchIconEnabled(true);
                    searchEditText.setHint(2131961156);
                    searchEditText.setEnabled(true);
                    ViewGroup viewGroup = eoi.A00;
                    if (viewGroup == null) {
                        str = "searchBar";
                    } else {
                        AbstractC31173DnH.A0z(eoi.requireContext(), viewGroup, R.drawable.searchbar_background);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A08(EOI eoi) {
        InterfaceC56362iU interfaceC56362iU = eoi.A0H;
        if (interfaceC56362iU != null) {
            interfaceC56362iU.Ehb(new ViewOnClickListenerC35667Fp2(eoi, 61), Integer.valueOf(AbstractC31173DnH.A04(eoi)), AbstractC25227BEk.A0p(), 2131974116);
            eoi.A0H = null;
        }
    }

    public static final boolean A0A(EOI eoi) {
        return AbstractC167007dF.A1O(eoi.A0O.size() + eoi.A0Q.size());
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (i == 0) {
            AbstractC167007dF.A0w(this.A01);
            SearchEditText searchEditText = this.A0B;
            if (searchEditText == null) {
                C14360o3.A0F("searchEditText");
                throw C00O.createAndThrow();
            }
            searchEditText.clearFocus();
        }
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        C65974TxR c65974TxR = this.A09;
        if (c65974TxR == null) {
            C14360o3.A0F("typeaheadManager");
            throw C00O.createAndThrow();
        }
        if (!c65974TxR.A04()) {
            updateUi(MXS.A02, C16930sl.A00);
        }
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
        GFV gfv = this.A08;
        if (gfv == null) {
            C14360o3.A0F("searchBarController");
            throw C00O.createAndThrow();
        }
        if (gfv.A01.length() > 0) {
            updateUi(MXS.A04, C16930sl.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r17.A0O.contains(r1) != false) goto L23;
     */
    @Override // X.InterfaceC169457hL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DgS(X.InterfaceC40821up r18, java.lang.String r19) {
        /*
            r17 = this;
            r1 = r18
            X.Ejg r1 = (X.C33137Ejg) r1
            r0 = r19
            boolean r4 = X.AbstractC167017dG.A1a(r0, r1)
            r5 = r17
            X.TxR r0 = r5.A09
            if (r0 != 0) goto L1a
            java.lang.String r0 = "typeaheadManager"
        L12:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1a:
            boolean r0 = r0.A04()
            if (r0 != 0) goto L96
            X.GFV r0 = r5.A08
            if (r0 != 0) goto L27
            java.lang.String r0 = "searchBarController"
            goto L12
        L27:
            java.lang.String r0 = r0.A01
            int r0 = r0.length()
            if (r0 <= 0) goto L96
            java.util.List r0 = r1.A01
            if (r0 == 0) goto L96
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r7 = r0.iterator()
        L3b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L93
            com.instagram.user.model.User r1 = X.AbstractC25226BEj.A15(r7)
            java.lang.String r11 = r1.getFullName()
            java.lang.String r12 = r1.getUsername()
            com.instagram.common.typedurl.ImageUrl r9 = r1.Bhu()
            java.lang.String r13 = X.AbstractC31171DnF.A0e(r1)
            X.FKz r10 = new X.FKz
            r10.<init>(r5, r1, r4)
            java.util.LinkedHashSet r0 = r5.A0Q
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L6b
            java.util.HashSet r0 = r5.A0O
            boolean r0 = r0.contains(r1)
            r15 = 0
            if (r0 == 0) goto L6c
        L6b:
            r15 = 1
        L6c:
            boolean r0 = r1.isVerified()
            if (r0 == 0) goto L87
            X.0do r0 = r5.A0R
            X.0ll r6 = X.AbstractC166987dD.A0o(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327288656116190(0x810f7a000039de, double:3.036861852153632E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            r16 = 1
            if (r0 != 0) goto L89
        L87:
            r16 = 0
        L89:
            r14 = -1
            X.E8o r8 = new X.E8o
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r3.add(r8)
            goto L3b
        L93:
            r5.A0B(r3)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOI.DgS(X.1up, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new Object(), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37082GVr.A00);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0R);
    }

    private final ArrayList A01() {
        boolean z;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A13 = AbstractC166997dE.A13(this.A0Q);
        while (A13.hasNext()) {
            User user = (User) AbstractC166997dE.A0l(A13);
            String fullName = user.getFullName();
            String username = user.getUsername();
            ImageUrl Bhu = user.Bhu();
            String A0e = AbstractC31171DnF.A0e(user);
            C34565FKz c34565FKz = new C34565FKz(this, user, true);
            if (user.isVerified()) {
                z = true;
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A0R), 36327288656116190L)) {
                    A1E.add(new C32090E8o(Bhu, c34565FKz, fullName, username, A0e, -1, true, z));
                }
            }
            z = false;
            A1E.add(new C32090E8o(Bhu, c34565FKz, fullName, username, A0e, -1, true, z));
        }
        return A1E;
    }

    public static final ArrayList A02(EOI eoi) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A01 = eoi.A01();
        A1E.addAll(eoi.A01());
        ArrayList A0q = AbstractC167017dG.A0q(A01);
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            A0q.add(((C32090E8o) it.next()).A06);
        }
        HashSet A0k = AbstractC31171DnF.A0k(A0q);
        ArrayList arrayList = eoi.A0L;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!A0k.contains(((C32090E8o) next).A06)) {
                A1E2.add(next);
            }
        }
        A1E.addAll(A1E2);
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0o(r20.A0R), 36327288656116190L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A09(X.EOI r20, java.util.List r21) {
        /*
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r10 = r21.iterator()
            r6 = 0
        L9:
            boolean r0 = r10.hasNext()
            r5 = r20
            if (r0 == 0) goto L84
            int r9 = r6 + 1
            java.lang.Object r3 = r10.next()
            X.E8F r3 = (X.E8F) r3
            com.instagram.user.model.User r4 = r3.A00
            if (r4 == 0) goto L82
            int r0 = r5.A0F
            boolean r18 = X.AbstractC167007dF.A1Q(r6, r0)
            java.lang.String r14 = r4.getFullName()
            java.lang.String r15 = r4.getUsername()
            com.instagram.common.typedurl.ImageUrl r12 = r4.Bhu()
            java.lang.String r16 = X.AbstractC31171DnF.A0e(r4)
            r0 = 0
            X.FKz r13 = new X.FKz
            r13.<init>(r5, r4, r0)
            boolean r0 = r4.isVerified()
            if (r0 == 0) goto L54
            X.0do r0 = r5.A0R
            X.0ll r8 = X.AbstractC166987dD.A0o(r0)
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36327288656116190(0x810f7a000039de, double:3.036861852153632E-306)
            boolean r0 = X.C18U.A06(r7, r8, r0)
            r19 = 1
            if (r0 != 0) goto L56
        L54:
            r19 = 0
        L56:
            X.E8o r11 = new X.E8o
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r2.add(r11)
            if (r18 == 0) goto L79
            java.util.HashSet r0 = r5.A0O
            r0.add(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r1 = r5.A0M
            java.lang.String r0 = r4.getUsername()
            r1.put(r0, r6)
            java.util.HashSet r0 = r5.A0D
            r0.add(r4)
        L79:
            java.util.HashMap r1 = r5.A0N
            java.lang.String r0 = r4.getUsername()
            r1.put(r0, r3)
        L82:
            r6 = r9
            goto L9
        L84:
            java.util.ArrayList r0 = r5.A0L
            r0.clear()
            r0.addAll(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOI.A09(X.EOI, java.util.List):void");
    }

    public final void A0C(int i) {
        C0f5 A00 = C18950wb.A00(AbstractC31173DnH.A0q(this), i, true);
        A00.ABW("ci_nux_qf_iterations", "Checking whether cache results are available on load.");
        A00.report();
    }

    @Override // X.InterfaceC169467hM
    public final C1GL BqZ() {
        return C1GJ.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0064, code lost:
    
        if (r6.AhE(X.C06090Tz.A04, 36323032343784308L) != true) goto L9;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.E9v, X.MTJ, X.JQS] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = -962525116(0xffffffffc6a10844, float:-20612.133)
            int r3 = X.C0f9.A02(r0)
            r10 = r15
            r0 = r16
            super.onCreate(r0)
            X.0do r5 = r15.A0R
            X.0ll r0 = X.AbstractC166987dD.A0o(r5)
            r1 = 36604507320226895(0x820b9b0000144f, double:3.212176051607204E-306)
            X.19w r4 = X.C18U.A02(r0, r1)
            if (r4 == 0) goto L27
            X.0Tz r0 = X.C06090Tz.A04
            long r1 = r4.BPF(r0, r1)
            int r0 = (int) r1
            r15.A0F = r0
        L27:
            com.instagram.common.session.UserSession r8 = X.AbstractC166987dD.A0r(r5)
            r9 = 0
            X.7hO r12 = new X.7hO
            r12.<init>()
            r14 = 0
            r7 = 1
            java.lang.Integer r13 = X.C05F.A00
            r11 = r9
            X.TxR r0 = X.AbstractC65980TxZ.A01(r8, r9, r10, r11, r12, r13, r14)
            r15.A09 = r0
            java.lang.String r1 = X.AbstractC167017dG.A0j()
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r5)
            X.8c6 r0 = X.AbstractC190468c4.A00(r15, r0, r1)
            X.GFU r8 = new X.GFU
            r8.<init>(r15, r0)
            X.0ll r2 = X.AbstractC166987dD.A0o(r5)
            r0 = 36323032343784308(0x810b9b00042b74, double:3.0341701430961557E-306)
            X.19w r6 = X.C18U.A02(r2, r0)
            r4 = 0
            if (r6 == 0) goto L66
            X.0Tz r2 = X.C06090Tz.A04
            boolean r1 = r6.AhE(r2, r0)
            r0 = 1
            if (r1 == r7) goto L67
        L66:
            r0 = 0
        L67:
            r15.A0E = r0
            if (r0 != 0) goto L6e
            r4 = 2131961156(0x7f132544, float:1.9559E38)
        L6e:
            X.GFV r0 = new X.GFV
            r0.<init>(r8, r4)
            r15.A08 = r0
            X.3I8 r0 = X.C3I7.A01(r15, r14, r7)
            r15.A0I = r0
            r0.A9e(r15)
            X.Fu9 r0 = new X.Fu9
            r0.<init>()
            r15.A04 = r0
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r5)
            X.0iw r1 = r15.A04
            java.lang.String r6 = "analyticsModule"
            if (r1 == 0) goto Ld4
            X.2ur r0 = new X.2ur
            r0.<init>(r1, r2)
            r15.A0C = r0
            com.instagram.common.session.UserSession r4 = X.AbstractC166987dD.A0r(r5)
            java.lang.String r2 = "quick_friending"
            r0 = 31800709(0x1e53d85, float:8.420959E-38)
            X.C14360o3.A0B(r4, r7)
            X.E9v r1 = new X.E9v
            r1.<init>(r4, r2, r0)
            r15.A07 = r1
            android.content.Context r0 = r15.requireContext()
            X.AbstractC31178DnM.A0m(r0, r1, r15, r5)
            X.2bb r1 = X.AbstractC31175DnJ.A0A(r15)
            java.lang.Class<X.Dyh> r0 = X.C31823Dyh.class
            X.2bZ r0 = r1.A00(r0)
            X.Dyh r0 = (X.C31823Dyh) r0
            r15.A05 = r0
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r5)
            X.0iw r1 = r15.A04
            if (r1 == 0) goto Ld4
            X.FeO r0 = new X.FeO
            r0.<init>(r1, r2)
            r15.A0J = r0
            r0 = 670287899(0x27f3c81b, float:6.7663004E-15)
            X.C0f9.A09(r0, r3)
            return
        Ld4:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOI.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC43842Ja5, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1443094475);
        C14360o3.A0B(layoutInflater, 0);
        C35203Ffv.A01(AbstractC166987dD.A0o(this.A0R), this.A0K);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C0f9.A09(951250910, A02);
        return onCreateView;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(23101998);
        super.onDestroyView();
        this.A01 = null;
        C3I9 c3i9 = this.A0I;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.EFx(this);
        C0f9.A09(538422257, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1928137893);
        super.onStart();
        C3I9 c3i9 = this.A0I;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.Dnr(requireActivity());
        C0f9.A09(-974460664, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-843188977);
        super.onStop();
        C3I9 c3i9 = this.A0I;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        C0f9.A09(-1086315825, A02);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}
