package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EVU extends AbstractC60592pi implements InterfaceC60152ox, GYS, InterfaceC37294Gbv {
    public Dialog A01;
    public Dialog A02;
    public Dialog A03;
    public ViewGroup A04;
    public RecyclerView A05;
    public EnumC33498ErX A06;
    public C66362zD A07;
    public C35783FrL A08;
    public C36305G0a A09;
    public C36305G0a A0A;
    public C35151Fet A0B;
    public DirectShareTarget A0C;
    public InterfaceC169517hR A0D;
    public InterfaceC169517hR A0E;
    public FMW A0F;
    public Integer A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public Map A0N;
    public java.util.Set A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0Y;
    public boolean A0Z;
    public InterfaceC169517hR A0c;
    public boolean A0d;
    public boolean A0e;
    public final int A0f;
    public final UserSession A0g;
    public final C57112jm A0h;
    public final C142846ck A0i;
    public final C36299Fzu A0j;
    public final InterfaceC37289Gbq A0m;
    public final C35018Fbr A0n;
    public final C31600DuS A0o;
    public final C169487hO A0p;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final C3I9 A11;
    public final C35004Fbb A12;
    public final boolean A15;
    public final boolean A16;
    public final Map A0r = AbstractC166987dD.A1I();
    public boolean A0W = true;
    public boolean A0X = false;
    public int A00 = 0;
    public int A0a = 0;
    public boolean A0S = false;
    public int A0b = -1;
    public final HashSet A0q = AbstractC166987dD.A1H();
    public final C1I4 A0z = new E0L(this, 5);
    public final InterfaceC28041Xi A10 = new C35880Fsu(this, 2);
    public final InterfaceViewOnFocusChangeListenerC37281Gbi A13 = new C36464G6o(this);
    public final InterfaceC37293Gbu A0l = new G29(this);
    public final InterfaceC37223GaY A0k = new G28(this);
    public final InterfaceC62612t0 A14 = new G7M(this, 3);

    public final void A0R(List list) {
        if (this.A0d) {
            C35004Fbb c35004Fbb = this.A12;
            C14360o3.A0B(list, 0);
            List list2 = c35004Fbb.A02;
            list2.clear();
            list2.addAll(list);
            ArrayList A05 = A05(this, c35004Fbb.A01());
            this.A08.A05(A05);
            A0E(this, A05);
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
                A09(this, directShareTarget, directShareTarget.A04(this.A0g.userId, false), 6, i, i, false);
                i++;
            }
            C35151Fet c35151Fet = this.A0B;
            if (c35151Fet != null) {
                List list3 = c35151Fet.A06;
                list3.clear();
                list3.addAll(list);
                c35151Fet.A02.FCP(null, list3, true, false);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A0A(this, AbstractC31172DnG.A0m(it2), true);
        }
        A0F(this, false);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
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
    public final void DgJ(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e3, code lost:
    
        if (X.AbstractC31177DnL.A1Z(X.AbstractC47132Ef.A00(r27).A0V) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0107, code lost:
    
        if (X.AbstractC31177DnL.A1Z(X.AbstractC47132Ef.A00(r27).A0U) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0118, code lost:
    
        if (X.C18U.A06(r5, r27, 36313042254890667L) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0236, code lost:
    
        if (r25.A0Q == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00a4, code lost:
    
        if (X.C18U.A06(r5, r27, 36313042255218351L) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02a1, code lost:
    
        if ((r28 instanceof X.C32324ELs) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b9, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r27, 36318887700339456L) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [X.2zJ] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.2zG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EVU(X.EnumC33498ErX r26, com.instagram.common.session.UserSession r27, X.InterfaceC37289Gbq r28, X.C31600DuS r29, java.lang.String r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVU.<init>(X.ErX, com.instagram.common.session.UserSession, X.Gbq, X.DuS, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36319368739429623L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.instagram.model.direct.DirectShareTarget A01(X.EVU r5, X.InterfaceC169517hR r6) {
        /*
            com.instagram.common.session.UserSession r3 = r5.A0g
            r4 = 0
            boolean r0 = X.AbstractC31268Doq.A01(r3)
            if (r0 == 0) goto L17
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319368739429623(0x810846002e1cf7, double:3.031853264950102E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L18
        L17:
            r0 = 0
        L18:
            r3 = 0
            if (r0 == 0) goto L57
            boolean r0 = r5.A0y
            if (r0 == 0) goto L57
            boolean r0 = r5.A0T
            if (r0 != 0) goto L57
            java.lang.Object r1 = r6.B3l()
            boolean r0 = r1 instanceof java.util.HashMap
            if (r0 == 0) goto L57
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            if (r1 == 0) goto L57
            java.lang.String r0 = "agents"
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L57
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L57
            java.util.Iterator r2 = r1.iterator()
        L43:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L57
            com.instagram.model.direct.DirectShareTarget r1 = X.AbstractC31172DnG.A0m(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = X.AbstractC31178DnM.A0R(r1, r4)
            boolean r0 = r0.A0X
            if (r0 == 0) goto L43
            r3 = r1
            goto L43
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVU.A01(X.EVU, X.7hR):com.instagram.model.direct.DirectShareTarget");
    }

    private void A06(int i, int i2) {
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            InterfaceC37289Gbq interfaceC37289Gbq = this.A0m;
            if (interfaceC37289Gbq.getContext() != null) {
                AbstractC166997dE.A18(interfaceC37289Gbq.requireContext(), viewGroup.requireViewById(i), i2);
            }
        }
    }

    public static void A07(EVU evu, int i, int i2) {
        int i3 = 2;
        if (i2 != 11) {
            i3 = 1;
        }
        RecyclerView recyclerView = evu.A05;
        if (evu.A0W && !evu.A0X && recyclerView != null) {
            recyclerView.postDelayed(new GQ9(recyclerView, evu, i, i3), 75L);
        }
        evu.A0X = false;
    }

    public static void A08(EVU evu, int i, boolean z) {
        final ViewGroup viewGroup = evu.A04;
        if (viewGroup != null && viewGroup.findViewById(i) != null) {
            View requireViewById = viewGroup.requireViewById(i);
            int A05 = AbstractC167007dF.A05(z ? 1 : 0);
            if (requireViewById.getVisibility() != A05) {
                LayoutTransition layoutTransition = new LayoutTransition();
                requireViewById.setVisibility(A05);
                if (!C18U.A06(C06090Tz.A06, evu.A0g, 36318887700339456L)) {
                    viewGroup.setLayoutTransition(layoutTransition);
                    Runnable runnable = new Runnable() { // from class: X.GLB
                        @Override // java.lang.Runnable
                        public final void run() {
                            viewGroup.setLayoutTransition(null);
                        }
                    };
                    int i2 = 3;
                    if (z) {
                        i2 = 2;
                    }
                    viewGroup.postDelayed(runnable, layoutTransition.getDuration(i2));
                }
            }
        }
    }

    public static void A09(EVU evu, DirectSearchResult directSearchResult, Integer num, int i, int i2, int i3, boolean z) {
        String str;
        E9O e9o = new E9O(directSearchResult, num, evu.A0L, evu.A0I, A04(evu), i, i2, i3);
        C31600DuS c31600DuS = evu.A0o;
        UserSession userSession = evu.A0g;
        InterfaceC37289Gbq interfaceC37289Gbq = evu.A0m;
        List A0N = evu.A0N();
        if (evu.A0V) {
            str = "UNKNOWN";
        } else {
            str = "DIRECT";
        }
        c31600DuS.A06(interfaceC37289Gbq, userSession, e9o, str, A0N, z);
    }

    public static void A0A(EVU evu, DirectShareTarget directShareTarget, boolean z) {
        int i;
        int i2;
        Map map = evu.A0r;
        String A09 = directShareTarget.A09();
        if (z) {
            map.put(A09, directShareTarget);
            if (directShareTarget.A0J() && !directShareTarget.A0Z(evu.A0g.userId)) {
                if (directShareTarget.A0b(evu.A0x) && !directShareTarget.A0a(evu.A0t)) {
                    i2 = evu.A0a + 1;
                    evu.A0a = i2;
                }
            } else {
                i = evu.A00 + 1;
                evu.A00 = i;
            }
        } else {
            map.remove(A09);
            if (directShareTarget.A0J() && !directShareTarget.A0Z(evu.A0g.userId)) {
                if (directShareTarget.A0b(evu.A0x) && !directShareTarget.A0a(evu.A0t)) {
                    i2 = evu.A0a - 1;
                    evu.A0a = i2;
                }
            } else {
                i = evu.A00 - 1;
                evu.A00 = i;
            }
        }
        if (evu.A0V) {
            boolean A0I = directShareTarget.A0I();
            if (z) {
                if (A0I && directShareTarget.A0P != null) {
                    evu.A0N.put(directShareTarget.A09(), directShareTarget);
                    Iterator it = directShareTarget.A0P.iterator();
                    while (it.hasNext()) {
                        evu.A0O.add(it.next().toString());
                    }
                    return;
                }
                if (!A0I) {
                    evu.A0O.add(directShareTarget.A09());
                    return;
                }
                return;
            }
            if (A0I && AbstractC31174DnI.A1W(directShareTarget, evu.A0N)) {
                List list = directShareTarget.A0P;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String obj = it2.next().toString();
                        if (!map.containsKey(obj)) {
                            evu.A0O.remove(obj);
                        }
                    }
                    return;
                }
                return;
            }
            Iterator A16 = AbstractC166997dE.A16(evu.A0N);
            while (A16.hasNext()) {
                List list2 = AbstractC31172DnG.A0m(A16).A0P;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (directShareTarget.A09().equalsIgnoreCase(it3.next().toString())) {
                            return;
                        }
                    }
                }
            }
            evu.A0O.remove(directShareTarget.A09());
        }
    }

    public static void A0B(EVU evu, Integer num) {
        C35783FrL c35783FrL = evu.A08;
        C14360o3.A0B(num, 0);
        c35783FrL.A00 = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r6 = X.AbstractC166987dD.A1E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        A0B(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r7 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r3.A0d == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r1 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r3.A0M().isEmpty() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r3.A0M == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r3.A0V == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r1 = r3.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        r1.A0n(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r3.A0V == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r6.isEmpty() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r3.A0M != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        r3.A0M = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        r2 = r3.A08;
        r1 = r3.A0M();
        X.C14360o3.A0B(r1, 0);
        r2.A01();
        r2.A04(r1, r6);
        A0E(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        r3.A08.A04(r3.A0M(), r6);
        r1 = r3.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
    
        r1.addAll(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0016, code lost:
    
        if (r5 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r5.isEmpty() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r3.A16 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(X.EVU r3, java.lang.Integer r4, java.lang.String r5, java.util.List r6, boolean r7) {
        /*
            X.Fet r0 = r3.A0B
            if (r0 == 0) goto L12
            if (r5 == 0) goto L12
            X.Gah r0 = r0.A02
            java.lang.String r0 = r0.BrI()
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 != 0) goto L18
        L12:
            boolean r0 = r3.A0V
            if (r0 == 0) goto L5d
            if (r5 == 0) goto L1f
        L18:
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L28
        L1f:
            r1 = 1
            boolean r0 = r3.A16
            if (r0 != 0) goto L28
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
        L28:
            A0B(r3, r4)
            if (r7 == 0) goto L72
            boolean r0 = r3.A0d
            if (r0 == 0) goto L33
            if (r1 != 0) goto L72
        L33:
            java.lang.String r0 = r3.A0M()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5e
            java.util.List r0 = r3.A0M
            if (r0 == 0) goto L5e
            boolean r0 = r3.A0V
            if (r0 == 0) goto L5e
        L45:
            androidx.recyclerview.widget.RecyclerView r1 = r3.A05
            if (r1 == 0) goto L4d
            r0 = 0
            r1.A0n(r0)
        L4d:
            boolean r0 = r3.A0V
            if (r0 == 0) goto L5d
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L5d
            java.util.List r0 = r3.A0M
            if (r0 != 0) goto L5d
            r3.A0M = r6
        L5d:
            return
        L5e:
            X.FrL r2 = r3.A08
            java.lang.String r1 = r3.A0M()
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r2.A01()
            r2.A04(r1, r6)
            A0E(r3, r6)
            goto L45
        L72:
            X.FrL r1 = r3.A08
            java.lang.String r0 = r3.A0M()
            r1.A04(r0, r6)
            java.util.HashSet r1 = r3.A0q
            monitor-enter(r1)
            r1.addAll(r6)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
            goto L4d
        L83:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVU.A0C(X.EVU, java.lang.Integer, java.lang.String, java.util.List, boolean):void");
    }

    public static void A0D(EVU evu, Object obj, boolean z) {
        FMW fmw = evu.A0F;
        if (evu.A0V && obj != null && fmw != null) {
            evu.A0S = z;
            evu.A0K = evu.A0J;
            evu.A0J = obj.toString();
            fmw.A01 = evu.A0S;
            fmw.A00 = null;
            evu.A0R = false;
        }
    }

    public static void A0E(EVU evu, List list) {
        String A0n;
        HashSet hashSet = evu.A0q;
        synchronized (hashSet) {
            hashSet.clear();
            hashSet.addAll(list);
            C35783FrL c35783FrL = evu.A08;
            String A0M = evu.A0M();
            C14360o3.A0B(A0M, 0);
            c35783FrL.A01();
            c35783FrL.A04(A0M, list);
            InterfaceC169517hR A02 = A02(evu);
            if (A02 != null) {
                C31600DuS c31600DuS = evu.A0o;
                String BjQ = A02.BjQ();
                C32872EdE c32872EdE = c31600DuS.A02;
                if (c32872EdE != null) {
                    if (AbstractC13670mt.A0B(BjQ)) {
                        A0n = null;
                    } else {
                        if (c32872EdE.A01 == null) {
                            A0n = AbstractC166997dE.A0n();
                        }
                        c32872EdE.A00 = BjQ;
                    }
                    c32872EdE.A01 = A0n;
                    c32872EdE.A00 = BjQ;
                }
            }
        }
    }

    public static void A0F(EVU evu, boolean z) {
        C35151Fet c35151Fet = evu.A0B;
        if (c35151Fet != null) {
            ArrayList A0n = AbstractC31180DnO.A0n(evu.A0r);
            List list = c35151Fet.A06;
            list.clear();
            list.addAll(A0n);
            c35151Fet.A02.FCP(null, list, z, false);
        }
        evu.A08.A02();
        evu.A0m.DdR();
    }

    private boolean A0G() {
        Integer num;
        if (AbstractC2051396d.A01(this.A0g)) {
            if (!(this.A0m instanceof C32324ELs)) {
                num = C05F.A0C;
            } else if (!this.A0U) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            if (num != C05F.A0C) {
                return true;
            }
        }
        return false;
    }

    private boolean A0H() {
        if ((this.A0m instanceof C32324ELs) && C5SJ.A01(this.A0g) && !this.A0T && !this.A0V && !this.A0U) {
            return true;
        }
        return false;
    }

    private boolean A0I() {
        if ((this.A0m instanceof C32324ELs) && AbstractC2051496e.A01(this.A0g) && !this.A0T && !this.A0V && !this.A0U) {
            return true;
        }
        return false;
    }

    public static boolean A0J(EVU evu) {
        UserSession userSession;
        if ((evu.A0m instanceof C32324ELs) && A00(evu) == 0 && evu.A0M().isEmpty() && (userSession = evu.A0g) != null && !evu.A0T && !evu.A0V && C18U.A06(C06090Tz.A05, userSession, 36318887700142845L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (X.AbstractC31177DnL.A1Z(X.AbstractC47132Ef.A00(r3).A0H) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0L(X.EVU r6, com.instagram.model.direct.DirectShareTarget r7) {
        /*
            boolean r0 = r6.A0U
            boolean r0 = X.AbstractC25230BEn.A1Q(r0)
            r2 = 0
            if (r0 == 0) goto L68
            int r0 = r6.A0a
            if (r0 <= 0) goto L16
            java.util.Map r0 = r6.A0r
            boolean r0 = X.AbstractC31174DnI.A1W(r7, r0)
            r0 = r0 ^ 1
            return r0
        L16:
            boolean r5 = r6.A0x
            boolean r3 = r6.A0t
            java.util.Map r0 = r6.A0r
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L24
            r1 = 0
        L24:
            boolean r0 = r7.A0O()
            r4 = 0
            if (r0 == 0) goto L31
            if (r1 == 0) goto L83
            boolean r4 = r7.A0a(r3)
        L31:
            com.instagram.common.session.UserSession r3 = r6.A0g
            java.lang.String r0 = r3.userId
            boolean r0 = r7.A0Z(r0)
            if (r0 == 0) goto L62
            boolean r0 = r7.A0O()
            if (r0 == 0) goto L4d
            java.util.List r0 = r7.A0Q
            java.lang.Object r0 = r0.get(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            boolean r0 = r0.A0O
            if (r0 != 0) goto L62
        L4d:
            java.util.List r0 = r7.A0Q
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L69
            java.util.List r0 = r7.A0Q
            java.lang.Object r0 = r0.get(r2)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            boolean r0 = r0.A0e
            if (r0 == 0) goto L69
        L62:
            r1 = 1
        L63:
            if (r4 == 0) goto L67
            if (r1 != 0) goto L68
        L67:
            r2 = 1
        L68:
            return r2
        L69:
            X.2Eg r0 = X.AbstractC47132Ef.A00(r3)
            X.2Ei r0 = r0.A0G
            boolean r0 = X.AbstractC31177DnL.A1Z(r0)
            if (r0 == 0) goto L62
            X.2Eg r0 = X.AbstractC47132Ef.A00(r3)
            X.2Ei r0 = r0.A0H
            boolean r0 = X.AbstractC31177DnL.A1Z(r0)
            r1 = 0
            if (r0 != 0) goto L63
            goto L62
        L83:
            boolean r0 = r7.A0b(r5)
            if (r0 != 0) goto L8f
            boolean r0 = r7.A0a(r3)
            if (r0 == 0) goto L31
        L8f:
            r4 = 1
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVU.A0L(X.EVU, com.instagram.model.direct.DirectShareTarget):boolean");
    }

    public final String A0M() {
        C35151Fet c35151Fet = this.A0B;
        if (c35151Fet != null) {
            return c35151Fet.A02.BrI();
        }
        return "";
    }

    public final List A0N() {
        C35151Fet c35151Fet = this.A0B;
        if (c35151Fet != null) {
            return Collections.unmodifiableList(c35151Fet.A06);
        }
        return Collections.EMPTY_LIST;
    }

    public final void A0O() {
        List list;
        boolean z = this.A0V;
        Integer num = C05F.A01;
        if (!z) {
            A0B(this, num);
            list = this.A12.A01();
        } else {
            A0B(this, num);
            list = this.A0M;
            if (list == null) {
                return;
            }
        }
        ArrayList A05 = A05(this, list);
        this.A08.A05(A05);
        A0E(this, A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r2.A0V != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0P() {
        /*
            r2 = this;
            boolean r0 = r2.A0y
            if (r0 == 0) goto L28
            int r0 = A00(r2)
            if (r0 != 0) goto L21
            java.lang.String r0 = r2.A0M()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            boolean r0 = r2.A0U
            if (r0 != 0) goto L21
            boolean r0 = r2.A0T
            if (r0 != 0) goto L21
            boolean r0 = r2.A0V
            r1 = 1
            if (r0 == 0) goto L22
        L21:
            r1 = 0
        L22:
            r0 = 2131431561(0x7f0b1089, float:1.8484855E38)
            A08(r2, r0, r1)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVU.A0P():void");
    }

    public final boolean A0S() {
        if (!this.A0U) {
            if (this.A0Y) {
                List A0N = A0N();
                if (A0N.size() != 1 && this.A0P) {
                    Iterator it = A0N.iterator();
                    while (it.hasNext()) {
                        DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
                        if (!A0m.A0O() || A0m.A0Q.size() != 1 || ((PendingRecipient) A0m.A0Q.get(0)).A00 != 4 || !((PendingRecipient) A0m.A0Q.get(0)).A0D) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean A0T() {
        ViewGroup viewGroup;
        C35151Fet c35151Fet = this.A0B;
        if (c35151Fet != null) {
            this.A0o.A07(this.A0m, this.A0g, c35151Fet.A02.BrI());
        }
        C35151Fet c35151Fet2 = this.A0B;
        if (c35151Fet2 != null && (viewGroup = c35151Fet2.A00) != null && viewGroup.getVisibility() == 0) {
            this.A0B.A02.CMc();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        return AbstractC55112ObW.A02(this.A0g, new C51642MrZ(str, "direct_recipient_list_page", null, null, null, null, 50, false, false, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0146, code lost:
    
        if (r0 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c5, code lost:
    
        if (X.C18U.A06(r5, r7, 36311560487502448L) == false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, X.FOr] */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.1GL, X.Gbq] */
    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D8S(android.view.View r42) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVU.D8S(android.view.View):void");
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        A0B(this, C05F.A0Y);
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        List items = ((C168027ex) interfaceC40821up).getItems();
        ArrayList A0q = AbstractC167017dG.A0q(items);
        Iterator it = items.iterator();
        while (it.hasNext()) {
            AbstractC31178DnM.A1V(A0q, it);
        }
        A0C(this, C05F.A01, str, A0q, false);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        C35151Fet c35151Fet = this.A0B;
        if (c35151Fet != null) {
            InterfaceC37232Gah interfaceC37232Gah = c35151Fet.A02;
            if (interfaceC37232Gah != null) {
                interfaceC37232Gah.AHQ();
            }
            this.A0B = null;
        }
        InterfaceC169517hR interfaceC169517hR = this.A0E;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.DEw();
        }
        InterfaceC169517hR interfaceC169517hR2 = this.A0c;
        if (interfaceC169517hR2 != null) {
            interfaceC169517hR2.DEw();
        }
        InterfaceC169517hR interfaceC169517hR3 = this.A0D;
        if (interfaceC169517hR3 != null) {
            interfaceC169517hR3.DEw();
            this.A0D = null;
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.dismiss();
            this.A01 = null;
        }
        Dialog dialog2 = this.A03;
        if (dialog2 != null) {
            dialog2.dismiss();
            this.A03 = null;
        }
        Dialog dialog3 = this.A02;
        if (dialog3 != null) {
            dialog3.dismiss();
            this.A02 = null;
        }
        C3I9 c3i9 = this.A11;
        c3i9.EFx(this);
        c3i9.onStop();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C3I9 c3i9 = this.A11;
        c3i9.Dnr((Activity) this.A0m.requireContext());
        c3i9.A9e(this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
        C35151Fet c35151Fet = this.A0B;
        if (c35151Fet != null) {
            bundle.putSerializable("RecipientPickerController.SELECTED_RECIPIENTS", AbstractC166987dD.A1F(Collections.unmodifiableList(c35151Fet.A06)));
        }
        bundle.putSerializable("RecipientPickerController.SELECTED_RECIPIENTS_LIST", AbstractC31180DnO.A0n(this.A0r));
        if (this.A0V) {
            bundle.putSerializable("RecipientPickerController.UNIQUE_SELECTED_CHANNEL_INVITE_LIST", AbstractC166987dD.A1F(this.A0O));
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C1I4 c1i4;
        C35151Fet c35151Fet;
        this.A05.getClass();
        this.A05.setAdapter(this.A07);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        this.A05.setLayoutManager(linearLayoutManager);
        boolean z = this.A0V;
        RecyclerView recyclerView = this.A05;
        if (z) {
            c1i4 = new C153156uj(linearLayoutManager, this.A14, C153146ui.A0A);
        } else {
            c1i4 = this.A0z;
        }
        recyclerView.A14(c1i4);
        ArrayList A05 = A05(this, this.A12.A01());
        this.A08.A05(A05);
        A0E(this, A05);
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("RecipientPickerController.SELECTED_RECIPIENTS");
            if (serializable != null) {
                ArrayList arrayList = (ArrayList) serializable;
                C35151Fet c35151Fet2 = this.A0B;
                if (c35151Fet2 != null && arrayList != null) {
                    List list = c35151Fet2.A06;
                    list.clear();
                    list.addAll(arrayList);
                    c35151Fet2.A02.FCP(null, list, true, false);
                }
            }
            AbstractCollection abstractCollection = (AbstractCollection) bundle.getSerializable("RecipientPickerController.SELECTED_RECIPIENTS_LIST");
            ArrayList arrayList2 = (ArrayList) bundle.getSerializable("RecipientPickerController.UNIQUE_SELECTED_CHANNEL_INVITE_LIST");
            if (abstractCollection != null) {
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
                    this.A0r.put(A0m.A09(), A0m);
                }
            }
            if (z && arrayList2 != null) {
                this.A0O.addAll(arrayList2);
            }
        }
        if (A0M().isEmpty()) {
            if (C18U.A06(C06090Tz.A05, this.A0g, 36318887700404993L) && (c35151Fet = this.A0B) != null) {
                c35151Fet.A02.EJ5();
                c35151Fet.A02.El3();
            }
        }
        this.A0h.A06(this.A05, C71163Hc.A00(this.A0m));
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
        InterfaceC37232Gah interfaceC37232Gah;
        C35151Fet c35151Fet = this.A0B;
        if (c35151Fet != null && (interfaceC37232Gah = c35151Fet.A02) != null) {
            interfaceC37232Gah.E0x();
        }
    }

    public static int A00(EVU evu) {
        return evu.A0N().size();
    }

    public static InterfaceC169517hR A02(EVU evu) {
        if (!evu.A0M().isEmpty() && evu.A0V) {
            return evu.A0c;
        }
        return evu.A0E;
    }

    public static Integer A03(EVU evu, InterfaceC169517hR interfaceC169517hR) {
        Integer num;
        List A0m = AbstractC31171DnF.A0m(interfaceC169517hR);
        if (interfaceC169517hR.isLoading()) {
            return C05F.A00;
        }
        if (interfaceC169517hR.CUG()) {
            if (evu.A0u && A0m.isEmpty()) {
                ViewGroup viewGroup = evu.A04;
                viewGroup.getClass();
                if (!AbstractC15820qc.A0F(viewGroup.getContext())) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A0j;
                }
                C31600DuS c31600DuS = evu.A0o;
                int i = 3;
                if (num == C05F.A0N) {
                    i = 2;
                }
                c31600DuS.A05(i);
                return num;
            }
            return C05F.A0Y;
        }
        if (A0m != null && !A0m.isEmpty()) {
            return C05F.A01;
        }
        Integer num2 = C05F.A0C;
        evu.A0o.A05(1);
        return num2;
    }

    public static ArrayList A04(EVU evu) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!evu.A0V) {
            Iterator it = evu.A0N().iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R(AbstractC31172DnG.A0m(it).A09(), A1E);
            }
        } else {
            Iterator it2 = AbstractC166987dD.A1F(evu.A0O).iterator();
            while (it2.hasNext()) {
                AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it2), A1E);
            }
        }
        return A1E;
    }

    public static ArrayList A05(EVU evu, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            if (!A0m.A0H()) {
                A1E.add(A0m);
            }
        }
        ArrayList arrayList = A1E;
        if (!evu.A0s) {
            A1E = AbstractC166987dD.A1E();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                DirectShareTarget A0m2 = AbstractC31172DnG.A0m(it2);
                if (A0m2.A0R) {
                    A1E.add(A0m2);
                }
            }
            arrayList = A1E;
        }
        if (evu.A0V) {
            arrayList = AbstractC166987dD.A1E();
            Iterator it3 = A1E.iterator();
            while (it3.hasNext()) {
                DirectShareTarget A0m3 = AbstractC31172DnG.A0m(it3);
                if (A0m3.A04(evu.A0g.userId, false) == C05F.A00 || A0m3.A0B != null || AbstractC31178DnM.A0R(A0m3, 0).A0X) {
                    arrayList.add(A0m3);
                }
            }
        }
        return arrayList;
    }

    public static boolean A0K(EVU evu, DirectShareTarget directShareTarget) {
        if (AbstractC31172DnG.A18(directShareTarget).isEmpty()) {
            return false;
        }
        UserSession userSession = evu.A0g;
        User A00 = C4GO.A00(userSession, AbstractC31178DnM.A0R(directShareTarget, 0));
        if (evu.A0r.isEmpty() || A00.A29()) {
            return false;
        }
        return AbstractC31176DnK.A1a(C06090Tz.A05, userSession, 36325330151093247L);
    }

    public final void A0Q() {
        boolean z;
        boolean z2;
        if (A00(this) == 0 && !this.A0U && A0M().isEmpty()) {
            if (A0H() && (A0I() || A0G())) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = true;
            if (z2) {
                A08(this, R.id.direct_chooser_channel_entry_point, true);
                C36299Fzu c36299Fzu = this.A0j;
                ChannelCreationSource channelCreationSource = ChannelCreationSource.A08;
                c36299Fzu.A06(channelCreationSource);
                this.A0i.A0E(channelCreationSource, this.A0f);
                return;
            }
            if (A0H()) {
                A08(this, R.id.direct_broadcast_chats_entry_point, true);
                C142846ck c142846ck = this.A0i;
                int i = this.A0f;
                c142846ck.A01 = AbstractC166997dE.A0n();
                C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
                if (!AbstractC25226BEj.A1Z(A0I)) {
                    return;
                }
                AbstractC31175DnJ.A1B(A0I, c142846ck);
                AbstractC31174DnI.A1J(A0I, "broadcast_chat_option_viewed");
                A0I.A0o("omnipicker_view");
                AbstractC31178DnM.A1H(A0I, "dm_creation_omnipicker", i);
                A0I.A0u(c142846ck.A01);
                A0I.Cht();
                return;
            }
            if (!A0I()) {
                return;
            }
            C36299Fzu c36299Fzu2 = this.A0j;
            C25531Mh A00 = C36299Fzu.A00(c36299Fzu2);
            if (AbstractC25226BEj.A1Z(A00)) {
                AbstractC31178DnM.A1F(A00, c36299Fzu2.A03);
                AbstractC31174DnI.A1J(A00, "create_social_channel_button_rendered");
                A00.A0o("omnipicker_view");
                AbstractC31175DnJ.A1D(A00, "dm_creation_omnipicker");
                A00.Cht();
            }
        } else {
            z = false;
            A08(this, R.id.direct_broadcast_chats_entry_point, false);
            A08(this, R.id.direct_chooser_channel_entry_point, false);
        }
        A08(this, R.id.direct_social_channel_entry_point, z);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        AbstractC167007dF.A0J().post(new RunnableC36897GNs(this, i));
    }

    @Override // X.GYS
    public final void Dvu() {
        InterfaceC169517hR A02 = A02(this);
        A02.getClass();
        A02.EKu();
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}
