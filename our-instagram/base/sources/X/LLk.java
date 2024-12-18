package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.direct.store.InboxNetworkSource;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LLk {
    public int A00;
    public EnumC46220Kcw A02;
    public C43782JXv A03;
    public KWM A04;
    public KDI A05;
    public C45527KDs A06;
    public C47438KxT A07;
    public C49371Ls4 A08;
    public C189478aR A09;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
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
    public boolean A0S;
    public C49369Ls2 A0U;
    public C49372Ls5 A0V;
    public C49370Ls3 A0W;
    public String A0X;
    public final Context A0Y;
    public final AnonymousClass935 A0a;
    public final AbstractC59962oe A0b;
    public final InterfaceC11380iw A0c;
    public final C006802i A0d;
    public final C18920wW A0e;
    public final C41761wQ A0g;
    public final UserSession A0h;
    public final C46922Dg A0j;
    public final C2DS A0k;
    public final C31594DuM A0l;
    public final LEW A0m;
    public final C44180Jfj A0n;
    public final KXD A0o;
    public final LAH A0p;
    public final C54685ODl A0q;
    public final L8U A0r;
    public final C2056398n A0s;
    public final boolean A17;
    public final java.util.Set A16 = AbstractC166987dD.A1H();
    public final HashSet A0v = AbstractC166987dD.A1H();
    public final HashMap A1R = AbstractC166987dD.A1G();
    public final List A12 = Collections.synchronizedList(AbstractC166987dD.A1E());
    public final List A0w = AbstractC166987dD.A1E();
    public final List A0y = AbstractC166987dD.A1E();
    public final Map A14 = AbstractC166987dD.A1G();
    public final List A11 = AbstractC166987dD.A1E();
    public final List A0x = AbstractC166987dD.A1E();
    public final HashMap A0u = AbstractC166987dD.A1G();
    public final List A0z = AbstractC166987dD.A1E();
    public final List A10 = AbstractC166987dD.A1E();
    public final C41761wQ A0f = new C41761wQ(null);
    public final java.util.Set A15 = AbstractC166987dD.A1H();
    public final Map A13 = AbstractC166987dD.A1G();
    public final Handler A0Z = AbstractC167007dF.A0J();
    public long A01 = 0;
    public boolean A0C = false;
    public boolean A0B = false;
    public Long A0A = 0L;
    public boolean A0T = false;
    public boolean A0I = false;
    public final InterfaceC41501vz A1A = new C44288Jhe(this, 15);
    public final InterfaceC41501vz A19 = new C44288Jhe(this, 17);
    public final InterfaceC41501vz A18 = new C44288Jhe(this, 16);
    public final L8T A1M = new L8T(this);
    public final L6V A1E = new L6V(this);
    public final C47431KxM A1F = new C47431KxM(this);
    public final C47432KxN A1G = new C47432KxN(this);
    public final C47433KxO A1H = new C47433KxO(this);
    public final C47437KxS A1N = new C47437KxS(this);
    public final InterfaceC50464MPs A1C = new C48743LhB(this);
    public final C48742LhA A1O = new C48742LhA(this);
    public final InterfaceC1571373s A1Q = new C44110Jea(this, 3);
    public final LE4 A1P = new LE4(this);
    public final InterfaceC1571373s A0t = new GHN(this, 1);
    public final MP3 A1D = new C49367Ls0(this);
    public final C47434KxP A1J = new C47434KxP(this);
    public final C47435KxQ A1K = new C47435KxQ(this);
    public final C47436KxR A1L = new C47436KxR(this);
    public final MRG A0i = new C48744LhC(this);
    public final L6W A1I = new L6W(this);
    public final InterfaceC66382zF A1B = new JWZ(this, 0);

    public static void A0I(LLk lLk) {
        lLk.A0M = true;
        lLk.A0l(false);
        L8U l8u = lLk.A0r;
        KCO kco = l8u.A00;
        if (kco.isResumed()) {
            C46049Ka2 c46049Ka2 = new C46049Ka2();
            Bundle A0B = AbstractC31177DnL.A0B(kco);
            A0B.putString("IgSessionManager.SESSION_TOKEN_KEY", kco.getSession().userId);
            c46049Ka2.setArguments(A0B);
            c46049Ka2.A01 = new C47440KxV(kco);
            C14240no A0F = AbstractC43593JPy.A0F(kco);
            A0F.A0I("filter_customization");
            A0F.A07(R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out);
            A0F.A0D(c46049Ka2, "filter_customization", R.id.thread_list_container);
            A0F.A00();
        }
        l8u.A01();
    }

    public static void A0O(LLk lLk, String str, List list) {
        A0N(lLk, str, "bulk_action", null, list, -1);
    }

    public final void A0k(C3o9 c3o9) {
        String str;
        InterfaceC50518MRv A01 = A01(this, c3o9);
        if (A01 != null && !A01.CVQ()) {
            UserSession userSession = this.A0h;
            AbstractC59962oe abstractC59962oe = this.A0b;
            boolean A1a = AbstractC167017dG.A1a(userSession, abstractC59962oe);
            C14360o3.A0B(c3o9, 3);
            Context requireContext = abstractC59962oe.requireContext();
            AnonymousClass172 A00 = AbstractC35214Fg7.A00(A01);
            if (A00 != null) {
                boolean CYY = A00.CYY();
                int i = 2131958760;
                if (CYY) {
                    i = 2131958762;
                }
                str = requireContext.getString(i);
            } else {
                str = null;
            }
            String[] strArr = {str, AbstractC166997dE.A0p(requireContext, 2131960355)};
            C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
            A0I.A0f(new DialogInterfaceOnClickListenerC35448Fk5(A1a ? 1 : 0, abstractC59962oe, userSession, A01, c3o9), strArr);
            AbstractC31178DnM.A1R(A0I, A1a);
            A0N(this, AbstractC111324zv.A00(4289), "swipe", null, ImmutableList.of((Object) c3o9), -1);
        }
    }

    public LLk(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, L8U l8u) {
        EnumC46220Kcw enumC46220Kcw;
        this.A0h = userSession;
        C46493Khs A00 = AbstractC46782Kmd.A00(userSession);
        if (AbstractC1337462f.A0C(userSession, true)) {
            enumC46220Kcw = AbstractC47860LCg.A01(C125575m3.A00, A00.A00.A02);
        } else {
            enumC46220Kcw = A00.A00;
        }
        this.A02 = enumC46220Kcw;
        LAH lah = new LAH(userSession);
        this.A0p = lah;
        this.A0g = AbstractC31173DnH.A0S();
        if (AbstractC1337462f.A09(userSession)) {
            C49210LpR c49210LpR = new C49210LpR(this);
            UserSession userSession2 = this.A0h;
            C43632JRq c43632JRq = new C43632JRq(userSession2, c49210LpR, AbstractC44015Jd2.A00(EnumC31648DvE.A08), -1, false);
            C43632JRq c43632JRq2 = new C43632JRq(userSession2, c49210LpR, AbstractC44015Jd2.A00(EnumC31648DvE.A0B), -1, false);
            C41761wQ c41761wQ = this.A0g;
            C42221xC c42221xC = c43632JRq.A05.A01;
            C43619JRc c43619JRc = C43619JRc.A00;
            C49795Lz2.A00(c42221xC.A0K(c43619JRc), c41761wQ, this, 1);
            C49795Lz2.A00(c43632JRq2.A05.A01.A0K(c43619JRc), c41761wQ, this, 2);
            c43632JRq.start();
            c43632JRq2.start();
            LAH lah2 = this.A0p;
            lah2.A01 = c43632JRq;
            lah2.A02 = c43632JRq2;
        }
        lah.A05(this.A02.A01);
        if (lah.A00 != interfaceC11380iw) {
            lah.A00 = null;
            InboxNetworkSource inboxNetworkSource = lah.A04;
            if (inboxNetworkSource == null) {
                C14360o3.A0F("directCurrentSource");
                throw C00O.createAndThrow();
            }
            inboxNetworkSource.A00 = null;
            lah.A00 = interfaceC11380iw;
            inboxNetworkSource.A00 = interfaceC11380iw;
        }
        this.A0d = C006802i.A0p;
        this.A0o = AbstractC47017Kqa.A00(userSession);
        this.A0n = AbstractC44179Jfi.A00(userSession);
        KWM kwm = new KWM(userSession, AbstractC166987dD.A10(userSession).A2I(), true);
        this.A04 = kwm;
        kwm.A0Q(abstractC59962oe.requireContext(), C55772hI.A00(userSession), abstractC59962oe);
        this.A0b = abstractC59962oe;
        Context requireContext = abstractC59962oe.requireContext();
        this.A0Y = requireContext;
        this.A0c = interfaceC11380iw;
        this.A0r = l8u;
        C2DS A002 = AbstractC28761aE.A00(userSession);
        this.A0k = A002;
        this.A0j = ((C2DU) A002).A0C;
        this.A17 = C2E8.A07(userSession);
        this.A0e = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A0a = new C45391K8e(userSession, this);
        this.A0s = AbstractC2056298m.A00(userSession);
        this.A03 = new C43782JXv(userSession);
        this.A0l = AbstractC31593DuL.A00(requireContext, interfaceC11380iw, userSession);
        this.A0q = new C54685ODl(abstractC59962oe, interfaceC11380iw, userSession, new C54413O2t(this));
        this.A0m = (LEW) userSession.A01(LEW.class, new C50171MDy(17, interfaceC11380iw, userSession));
        C45527KDs c45527KDs = (C45527KDs) new C52942bb(new C45574KFo(userSession), abstractC59962oe.requireActivity()).A00(C45527KDs.class);
        this.A06 = c45527KDs;
        c45527KDs.A01.A06(abstractC59962oe.requireActivity(), new C44145JfA(this, 8));
    }

    public static int A00(LLk lLk, List list) {
        int i;
        if (lLk.A0O) {
            return 0;
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            InterfaceC50518MRv A01 = A01(lLk, (C3o9) it.next());
            if (A01 != null) {
                boolean Cf6 = A01.Cf6();
                i = 1;
                if (Cf6) {
                    i2 += i;
                }
            }
            i = 0;
            i2 += i;
        }
        return i2;
    }

    public static InterfaceC50518MRv A01(LLk lLk, C3o9 c3o9) {
        HashMap hashMap;
        if (c3o9 instanceof DirectThreadKey) {
            hashMap = lLk.A1R;
        } else if (c3o9 instanceof MsysThreadId) {
            hashMap = lLk.A0u;
        } else {
            return null;
        }
        return (InterfaceC50518MRv) hashMap.get(c3o9);
    }

    private void A08() {
        FragmentActivity activity = this.A0b.getActivity();
        if (activity != null && C1VN.A00 != null) {
            C1VN A00 = AbstractC31282Dp4.A00();
            UserSession userSession = this.A0h;
            String str = this.A0X;
            if (str == null) {
                str = "";
            }
            A00.A00(activity, userSession, "687473233153548", AbstractC167017dG.A0r("nua_target_id", str));
        }
    }

    public static void A0A(ImmutableSet immutableSet, LLk lLk) {
        Map map = lLk.A14;
        for (Object obj : ImmutableSet.A03(map.keySet())) {
            List<C2ED> A12 = AbstractC43592JPx.A12(obj, map);
            if (A12 != null) {
                ImmutableList.Builder builder = ImmutableList.builder();
                for (C2ED c2ed : A12) {
                    if (!immutableSet.contains(c2ed.BKb())) {
                        builder.add((Object) c2ed);
                    }
                }
                map.put(obj, builder.build());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (X.InterfaceC50518MRv.A00(r8) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0B(X.C31446Drq r17, X.LLk r18, X.C3o9 r19) {
        /*
            r1 = r19
            com.instagram.model.direct.DirectThreadKey r3 = X.JRE.A02(r1)
            r0 = r18
            if (r3 == 0) goto Ld0
            X.2DS r2 = r0.A0k
            X.2DU r2 = (X.C2DU) r2
            X.3kb r4 = X.C2DU.A03(r2, r3)
            if (r4 == 0) goto L67
            java.util.List r3 = r4.BSH()
        L18:
            com.instagram.common.session.UserSession r5 = r0.A0h
            X.0wW r2 = r0.A0e
            X.C75R.A07(r2, r5, r4, r3)
            X.MRv r8 = A01(r0, r1)
            r4 = 0
            r2 = r17
            if (r8 == 0) goto L64
            boolean r3 = r8.CVQ()
            if (r3 == 0) goto L71
            boolean r7 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            android.content.Context r10 = r0.A0Y
            if (r7 == 0) goto L68
            X.Lqs r3 = new X.Lqs
            r3.<init>(r5)
        L39:
            X.0iw r6 = r0.A0c
            X.Dp8 r9 = new X.Dp8
            r9.<init>(r10, r6, r5, r3)
            java.util.List r14 = r8.Bl6()
            java.lang.String r13 = r8.Asv()
            int r15 = r8.BI1()
            int r16 = r8.C7g()
            boolean r18 = r8.CX1()
            X.Lrs r11 = new X.Lrs
            r11.<init>(r2, r0)
            r12 = r1
            r17 = r4
            r19 = r7
            boolean r3 = r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L62:
            if (r3 != 0) goto L67
        L64:
            A0C(r2, r0, r1)
        L67:
            return
        L68:
            X.C14360o3.A0B(r5, r4)
            X.7TR r3 = new X.7TR
            r3.<init>(r5)
            goto L39
        L71:
            X.DuM r6 = r0.A0l
            X.2oe r7 = r0.A0b
            boolean r3 = r8.CVQ()
            if (r3 != 0) goto Lce
            java.util.List r3 = r8.Bl6()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Lce
            java.util.List r3 = r8.Bl6()
            java.lang.Object r9 = r3.get(r4)
            X.172 r9 = (X.AnonymousClass172) r9
        L8f:
            boolean r14 = r8.isPending()
            boolean r15 = r8.CVQ()
            java.util.List r4 = r8.Aa2()
            java.lang.String r3 = r5.userId
            boolean r16 = r4.contains(r3)
            boolean r3 = r8.isPending()
            if (r3 == 0) goto Laf
            boolean r3 = X.InterfaceC50518MRv.A00(r8)
            r17 = 1
            if (r3 == 0) goto Lb1
        Laf:
            r17 = 0
        Lb1:
            int r12 = r8.C7g()
            r3 = 1
            X.Lrr r8 = new X.Lrr
            r8.<init>(r3, r0, r2, r1)
            java.lang.String r10 = "pending_inbox"
            r3 = 2
            X.C14360o3.A0B(r1, r3)
            if (r9 == 0) goto L64
            boolean r13 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            java.lang.String r11 = X.JRE.A06(r1)
            boolean r3 = r6.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L62
        Lce:
            r9 = 0
            goto L8f
        Ld0:
            r4 = 0
            java.util.List r3 = java.util.Collections.emptyList()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLk.A0B(X.Drq, X.LLk, X.3o9):void");
    }

    public static void A0C(C31446Drq c31446Drq, LLk lLk, C3o9 c3o9) {
        int i;
        KXD kxd = lLk.A0o;
        kxd.A02 = true;
        AbstractC44190Jft.A00(kxd, new C50159MDm(kxd, 15));
        AbstractC59962oe abstractC59962oe = lLk.A0b;
        FragmentActivity activity = abstractC59962oe.getActivity();
        activity.getClass();
        lLk.A0X = lLk.A03(c3o9);
        A01(lLk, c3o9);
        lLk.A0q.A02 = true;
        UserSession userSession = lLk.A0h;
        C36881nl A01 = C36881nl.A01(activity, lLk.A0c, userSession, "pending_inbox");
        A01.A00 = abstractC59962oe;
        A01.A09(c3o9);
        A01.A0x = true;
        A01.A0Y = lLk.A02.A01.toString();
        A01.A0G = Integer.valueOf(c31446Drq.A00);
        A01.A0y = true;
        A01.A0s = true;
        A01.A0X = c31446Drq.A02;
        if (!lLk.A0O && (C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36314060157028747L) || (!C2E7.A03(AbstractC166997dE.A0Y(userSession))))) {
            i = 512340;
        } else {
            if (!lLk.A0O) {
                i = 512342;
            }
            A01.A06();
        }
        A01.A0F = Integer.valueOf(i);
        A01.A06();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if ((!r3.contains(r6)) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0D(X.EnumC46220Kcw r6, X.LLk r7) {
        /*
            X.Kcw r4 = r7.A02
            r7.A02 = r6
            com.instagram.common.session.UserSession r2 = r7.A0h
            X.Khs r0 = X.AbstractC46782Kmd.A00(r2)
            r0.A00 = r6
            X.LAH r1 = r7.A0p
            X.Kcw r0 = r7.A02
            X.2EB r0 = r0.A01
            r1.A05(r0)
            A0K(r7)
            r5 = 1
            boolean r0 = X.AbstractC1337462f.A0C(r2, r5)
            if (r0 == 0) goto L3a
            java.util.Set r3 = r7.A15
            boolean r0 = r3.contains(r6)
            if (r0 == 0) goto L32
            X.JXv r0 = r7.A03
            X.02i r2 = r0.A01
            r1 = 20125924(0x13318e4, float:3.2894966E-38)
            r0 = 2
            r2.markerEnd(r1, r0)
        L32:
            boolean r0 = r3.contains(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L3e
        L3a:
            r0 = 0
            r7.A0m(r0, r5)
        L3e:
            X.LEW r1 = r7.A0m
            X.2Dg r0 = r7.A0j
            int r6 = r0.A05()
            X.4I3 r0 = r4.A02
            java.lang.String r3 = r0.A00
            X.Kcw r0 = r7.A02
            X.4I3 r0 = r0.A02
            java.lang.String r4 = r0.A00
            java.lang.String r2 = "filter_select"
            r5 = 0
            X.LEW.A00(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLk.A0D(X.Kcw, X.LLk):void");
    }

    public static void A0F(LLk lLk) {
        lLk.A0S = A0V(lLk, lLk.A0O);
    }

    public static void A0G(LLk lLk) {
        LAH lah = lLk.A0p;
        InboxNetworkSource inboxNetworkSource = lah.A04;
        if (inboxNetworkSource == null) {
            C14360o3.A0F("directCurrentSource");
            throw C00O.createAndThrow();
        }
        boolean z = inboxNetworkSource.A03;
        C43782JXv c43782JXv = lLk.A03;
        if (z) {
            c43782JXv.A01();
        } else {
            c43782JXv.A01.markerEnd(20125924, (short) 2);
        }
        lah.A02(lLk.A02, null);
    }

    public static void A0H(LLk lLk) {
        KWM kwm = lLk.A04;
        kwm.A02.A03();
        kwm.A01.A03();
        ((C98O) kwm).A08.A01(lLk.A12.size());
    }

    public static void A0J(LLk lLk) {
        AbstractC59962oe abstractC59962oe = lLk.A0b;
        if (abstractC59962oe != null && abstractC59962oe.getActivity() != null) {
            A0L(lLk);
            A0K(lLk);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r6, 0), r6, 2342156163132753714L) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
    
        if (r11.isEmpty() == false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0K(X.LLk r21) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLk.A0K(X.LLk):void");
    }

    public static void A0L(LLk lLk) {
        List<C2EC> list;
        Comparator comparator;
        int i;
        C2DS c2ds = lLk.A0k;
        C46922Dg c46922Dg = ((C2DU) c2ds).A0C;
        C2057498z c2057498z = C2057498z.A00;
        EnumC46220Kcw enumC46220Kcw = lLk.A02;
        List<C2EC> A0G = c46922Dg.A0G(c2057498z, enumC46220Kcw.A01, enumC46220Kcw.A02);
        C43782JXv c43782JXv = lLk.A03;
        int size = A0G.size();
        C006802i c006802i = c43782JXv.A01;
        c006802i.markerAnnotate(20125924, "thread_count", size);
        List list2 = lLk.A12;
        synchronized (list2) {
            list2.clear();
            list = lLk.A0w;
            list.clear();
            for (C2EC c2ec : A0G) {
                if (c2ec.Aqm()) {
                    list.add(c2ec);
                } else {
                    list2.add(c2ec);
                }
            }
        }
        MRG mrg = lLk.A0i;
        if (mrg.Bsj() != C2057398y.A00 && !lLk.A0N) {
            Map map = lLk.A14;
            if (map.containsKey(mrg.Bsj()) && list.size() != ((AbstractCollection) map.get(mrg.Bsj())).size()) {
                UserSession userSession = lLk.A0h;
                if (AbstractC1337462f.A08(userSession)) {
                    AbstractC46972Dl Bsj = mrg.Bsj();
                    int i2 = 0;
                    for (C2EC c2ec2 : list) {
                        if (c2ec2.Cf8(userSession) && A02(c2ec2, lLk).booleanValue()) {
                            i2++;
                        }
                    }
                    Map map2 = lLk.A13;
                    Number A0Q = AbstractC37300Gc1.A0Q(Bsj, map2);
                    if (A0Q != null) {
                        i = A0Q.intValue() - i2;
                    } else {
                        i = 0;
                    }
                    AbstractC37301Gc2.A1T(Bsj, map2, Math.max(i, 0));
                    A0K(lLk);
                }
            }
        }
        Map map3 = lLk.A14;
        map3.put(mrg.Bsj(), ImmutableList.copyOf((Collection) list));
        if (lLk.A0O) {
            List Byz = c2ds.Byz(lLk.A02.A01);
            c006802i.markerAnnotate(20125924, "thread_count", Byz.size());
            List list3 = lLk.A11;
            list3.clear();
            if (!Byz.isEmpty()) {
                list3.addAll(Byz);
            }
            List list4 = lLk.A0x;
            list4.clear();
            UserSession userSession2 = lLk.A0h;
            if (!AbstractC1337462f.A03(userSession2)) {
                list4.addAll(list);
            } else {
                HashSet A1H = AbstractC166987dD.A1H();
                Iterator A16 = AbstractC166997dE.A16(map3);
                while (A16.hasNext()) {
                    Iterator A1J = AbstractC25226BEj.A1J(A16.next());
                    while (A1J.hasNext()) {
                        C2EC c2ec3 = (C2EC) A1J.next();
                        if (!A1H.contains(c2ec3.BKb()) && A02(c2ec3, lLk).booleanValue()) {
                            list4.add(c2ec3);
                            A1H.add(c2ec3.BKb());
                        }
                    }
                }
            }
            list4.addAll(list3);
            if (lLk.A02.A02 == C4I3.A0M && AbstractC1337462f.A0A(userSession2, true)) {
                comparator = C2EC.A02;
            } else {
                comparator = C2EB.A04.A01;
            }
            Collections.sort(list4, comparator);
        }
        HashMap hashMap = lLk.A1R;
        hashMap.putAll(lLk.A07(list2));
        hashMap.putAll(lLk.A07(list));
        hashMap.putAll(lLk.A07(lLk.A11));
    }

    public static void A0P(LLk lLk, List list, List list2, List list3, int i, boolean z, boolean z2) {
        A0O(lLk, "direct_requests_delete_multiple_confirm", list);
        Context context = lLk.A0Y;
        UserSession userSession = lLk.A0h;
        C35250Fgj.A02(context, userSession, C05F.A0u, A06(list2), list3, z);
        int size = list.size();
        boolean z3 = lLk.A0O;
        C46922Dg c46922Dg = lLk.A0j;
        if (z3) {
            c46922Dg.A0J(size);
        } else {
            c46922Dg.A0I(size);
        }
        c46922Dg.A0N(lLk.A0i.Bsj(), i, lLk.A0O);
        if (lLk.A0O) {
            A0A(ImmutableSet.A03(list2), lLk);
        }
        list.size();
        if (list.size() == 1) {
            lLk.A03((C3o9) AbstractC166987dD.A16(list));
        }
        lLk.A0d.markerStart(190449529);
        AbstractC47180KtF.A00(lLk.A0b, userSession, C05F.A0C, lLk.A0O, z2);
        lLk.A08();
    }

    private boolean A0R() {
        UserSession userSession = this.A0h;
        if (AbstractC1337462f.A04(userSession) && System.currentTimeMillis() - AbstractC31175DnJ.A03(AbstractC166987dD.A0x(userSession), "last_pending_inbox_cache_update_timestamp") < AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36598614626077943L) * 1000) {
            return true;
        }
        return false;
    }

    private boolean A0S() {
        UserSession userSession = this.A0h;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36317139649106749L) && System.currentTimeMillis() - AbstractC31175DnJ.A03(AbstractC166987dD.A0x(userSession), "last_message_requests_prefetch_timestamp") < AbstractC25225BEi.A07(r2, userSession, 36598614625881334L) * 1000) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0T(X.LLk r2) {
        /*
            boolean r0 = r2.A0O
            r1 = 0
            if (r0 == 0) goto L1f
            java.util.List r0 = r2.A0x
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            java.util.List r0 = r2.A10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            java.util.List r0 = r2.A0y
        L17:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1e
        L1d:
            r1 = 1
        L1e:
            return r1
        L1f:
            java.util.List r0 = r2.A12
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            java.util.List r0 = r2.A0z
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLk.A0T(X.LLk):boolean");
    }

    public static boolean A0U(LLk lLk) {
        if (C2E9.A01(lLk.A0h) && lLk.A02 == EnumC46220Kcw.A06) {
            return true;
        }
        return false;
    }

    public static boolean A0V(LLk lLk, boolean z) {
        List<C2EC> list;
        List list2;
        if (z) {
            list = lLk.A0x;
            list2 = lLk.A10;
        } else {
            list = lLk.A12;
            list2 = lLk.A0z;
        }
        ArrayList A1F = AbstractC166987dD.A1F(list2);
        if (AbstractC43805JYs.A04(lLk.A0h)) {
            A1F.addAll(lLk.A0y);
        }
        if (!list.isEmpty() || !A1F.isEmpty()) {
            for (C2EC c2ec : list) {
                if (!AbstractC31224Do7.A03(c2ec.BSH(), c2ec.CVQ())) {
                    return true;
                }
            }
            Iterator it = A1F.iterator();
            while (it.hasNext()) {
                if (!InterfaceC50518MRv.A00((InterfaceC50518MRv) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final EnumC31648DvE A0W() {
        if (this.A0O) {
            return EnumC31648DvE.A0B;
        }
        if (this.A0P) {
            return EnumC31648DvE.A09;
        }
        if (this.A0N) {
            return EnumC31648DvE.A05;
        }
        return EnumC31648DvE.A08;
    }

    public final C49369Ls2 A0X() {
        C49369Ls2 c49369Ls2 = this.A0U;
        if (c49369Ls2 == null) {
            Context context = this.A0Y;
            UserSession userSession = this.A0h;
            InterfaceC11380iw interfaceC11380iw = this.A0c;
            boolean z = this.A0H;
            C48742LhA c48742LhA = this.A1O;
            C49369Ls2 c49369Ls22 = new C49369Ls2(context, interfaceC11380iw, userSession, this.A1C, this.A1I, this.A1M, c48742LhA, this.A0t, z);
            this.A0U = c49369Ls22;
            return c49369Ls22;
        }
        return c49369Ls2;
    }

    public final C49372Ls5 A0Y() {
        C49372Ls5 c49372Ls5 = this.A0V;
        if (c49372Ls5 == null) {
            Context context = this.A0Y;
            UserSession userSession = this.A0h;
            InterfaceC11380iw interfaceC11380iw = this.A0c;
            L7L l7l = new L7L(context, userSession);
            C54685ODl c54685ODl = this.A0q;
            L8T l8t = this.A1M;
            C48742LhA c48742LhA = this.A1O;
            InterfaceC50464MPs interfaceC50464MPs = this.A1C;
            InterfaceC1571373s interfaceC1571373s = this.A1Q;
            LE4 le4 = this.A1P;
            boolean z = this.A0H;
            EnumC46220Kcw enumC46220Kcw = this.A02;
            C47437KxS c47437KxS = this.A1N;
            L6W l6w = this.A1I;
            L6V l6v = this.A1E;
            boolean A02 = AbstractC1337462f.A02(userSession);
            C47431KxM c47431KxM = this.A1F;
            C47432KxN c47432KxN = this.A1G;
            MP3 mp3 = this.A1D;
            C47434KxP c47434KxP = this.A1J;
            C49372Ls5 c49372Ls52 = new C49372Ls5(context, interfaceC11380iw, this.A1B, userSession, interfaceC50464MPs, this.A0i, enumC46220Kcw, c54685ODl, mp3, l7l, l6v, c47431KxM, c47432KxN, l6w, c47434KxP, this.A1K, this.A1L, l8t, c47437KxS, c48742LhA, le4, interfaceC1571373s, z, A02, AbstractC1337462f.A01(userSession));
            this.A0V = c49372Ls52;
            return c49372Ls52;
        }
        return c49372Ls5;
    }

    public final C49370Ls3 A0Z() {
        C49370Ls3 c49370Ls3 = this.A0W;
        if (c49370Ls3 == null) {
            Context context = this.A0Y;
            UserSession userSession = this.A0h;
            InterfaceC11380iw interfaceC11380iw = this.A0c;
            boolean z = this.A0H;
            C48742LhA c48742LhA = this.A1O;
            InterfaceC50464MPs interfaceC50464MPs = this.A1C;
            L8T l8t = this.A1M;
            C49370Ls3 c49370Ls32 = new C49370Ls3(context, interfaceC11380iw, userSession, interfaceC50464MPs, this.A1H, this.A1I, l8t, c48742LhA, this.A0t, z);
            this.A0W = c49370Ls32;
            return c49370Ls32;
        }
        return c49370Ls3;
    }

    public final C49371Ls4 A0a() {
        if (this.A08 == null) {
            UserSession userSession = this.A0h;
            if (AbstractC1337462f.A07(userSession)) {
                Context context = this.A0Y;
                InterfaceC11380iw interfaceC11380iw = this.A0c;
                L7L l7l = new L7L(context, userSession);
                L8T l8t = this.A1M;
                C48742LhA c48742LhA = this.A1O;
                InterfaceC50464MPs interfaceC50464MPs = this.A1C;
                InterfaceC1571373s interfaceC1571373s = this.A1Q;
                LE4 le4 = this.A1P;
                boolean z = this.A0H;
                this.A08 = new C49371Ls4(context, interfaceC11380iw, this.A1B, userSession, interfaceC50464MPs, l7l, this.A1I, l8t, c48742LhA, le4, interfaceC1571373s, z);
            }
        }
        return this.A08;
    }

    public final void A0c() {
        if (this.A0O) {
            A0G(this);
            return;
        }
        if (this.A0G) {
            A0G(this);
            if (this.A0F) {
                return;
            }
            this.A0F = true;
            A0K(this);
            return;
        }
        this.A03.A01.markerEnd(20125924, (short) 2);
    }

    public final void A0d() {
        Integer num;
        String str;
        KXD kxd = this.A0o;
        if (kxd.A01) {
            kxd.A04("return_from_reachability_settings", null);
            kxd.A01 = false;
        } else if (kxd.A00) {
            kxd.A04("return_from_enter_hidden_words_settings", null);
            kxd.A00 = false;
        } else {
            if (kxd.A02) {
                kxd.A02 = false;
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            if (!KXD.A02(kxd, num)) {
                return;
            }
        }
        if (EnumC31648DvE.A08 == A0W()) {
            str = "open_pending";
        } else {
            str = "open_other";
        }
        kxd.A04(str, null);
    }

    public final void A0e() {
        LAH lah = this.A0p;
        lah.A00 = null;
        InboxNetworkSource inboxNetworkSource = lah.A04;
        if (inboxNetworkSource != null) {
            inboxNetworkSource.A00 = null;
            AnonymousClass935 anonymousClass935 = this.A0a;
            C14360o3.A0B(anonymousClass935, 0);
            lah.A0F.remove(anonymousClass935);
            InboxNetworkSource inboxNetworkSource2 = lah.A04;
            if (inboxNetworkSource2 != null) {
                inboxNetworkSource2.A0C.remove(anonymousClass935);
                C43632JRq c43632JRq = lah.A01;
                if (c43632JRq != null) {
                    c43632JRq.stop();
                }
                C43632JRq c43632JRq2 = lah.A02;
                if (c43632JRq2 != null) {
                    c43632JRq2.stop();
                }
                this.A0q.A05.onDestroyView();
                this.A0Z.removeCallbacksAndMessages(null);
                return;
            }
        }
        C14360o3.A0F("directCurrentSource");
        throw C00O.createAndThrow();
    }

    public final void A0f() {
        this.A0n.A05();
        C25671My A00 = AbstractC25651Mw.A00(this.A0h);
        A00.A02(this.A19, C48032Iq.class);
        A00.A02(this.A1A, C2Io.class);
        A00.A02(this.A18, LYB.class);
        LAH lah = this.A0p;
        AnonymousClass935 anonymousClass935 = this.A0a;
        C14360o3.A0B(anonymousClass935, 0);
        lah.A0F.remove(anonymousClass935);
        InboxNetworkSource inboxNetworkSource = lah.A04;
        if (inboxNetworkSource == null) {
            C14360o3.A0F("directCurrentSource");
            throw C00O.createAndThrow();
        }
        inboxNetworkSource.A0C.remove(anonymousClass935);
        C43632JRq c43632JRq = lah.A01;
        if (c43632JRq != null) {
            c43632JRq.A02 = false;
        }
        C43632JRq c43632JRq2 = lah.A02;
        if (c43632JRq2 != null) {
            c43632JRq2.A02 = false;
        }
        this.A03.A04("LEAVE_SURFACE");
        A0Y().A02.A01();
        C49371Ls4 c49371Ls4 = this.A08;
        if (c49371Ls4 != null) {
            c49371Ls4.A01.A01();
        }
        this.A0q.A05.onPause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        if (r25.A0i.Bsj() == X.C2057398y.A00) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, X.Fcd] */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.FPL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [X.FPL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [X.Kqe, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0g() {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLk.A0g():void");
    }

    public final void A0h() {
        this.A04.A08();
        this.A0n.A05();
        this.A0O = true;
        this.A0p.A00();
        A0l(false);
        A0F(this);
        L8U l8u = this.A0r;
        l8u.A01();
        KCO kco = l8u.A00;
        if (kco.isResumed()) {
            KCO.A00(EnumC31648DvE.A0B, kco);
        }
        LEW.A00(this.A0m, "filtered_folder_clicked", this.A02.A02.A00, null, null, this.A0j.A05());
    }

    public final void A0i() {
        if (!C2E9.A0E(this.A0h)) {
            LAH lah = this.A0p;
            lah.A05(this.A02.A01);
            lah.A01(this.A0a);
            C49372Ls5 A0Y = A0Y();
            C49795Lz2.A00(A0Y.A0E, A0Y.A02, A0Y, 4);
        }
    }

    public final void A0j() {
        LEW lew = this.A0m;
        boolean z = this.A0O;
        C46922Dg c46922Dg = this.A0j;
        int A06 = c46922Dg.A06();
        int A05 = c46922Dg.A05();
        String obj = this.A02.A01.toString();
        int A07 = c46922Dg.A07();
        C14360o3.A0B(obj, 3);
        UserSession userSession = lew.A01;
        if (z) {
            A05 = A06;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(lew.A00, userSession), "direct_requests_enter_pending_inbox");
        A0f.A9K("total_requests", AbstractC31171DnF.A0V(A05));
        A0f.A9T("e_counter_channel", "");
        A0f.A7v("is_spam", AbstractC31173DnH.A0e(A0f, "selected_filter", obj, z));
        if (z) {
            A07 = 0;
        }
        A0f.A9K("unread_requests", AbstractC31171DnF.A0V(A07));
        A0f.Cht();
    }

    public final void A0l(boolean z) {
        this.A0H = z;
        if (!z) {
            this.A0v.clear();
        }
        AbstractC31178DnM.A0v(this.A0b);
        A0K(this);
        KCO.A04(this.A0r.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r14 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        if (X.AbstractC1337462f.A0A(r13.A0h, true) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        if (X.AbstractC1337462f.A0A(r13.A0h, true) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0134, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r5, 0), r5, 36317139649631040L) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0136, code lost:
    
        A0H(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0172, code lost:
    
        if (X.C18U.A06(r5, r8, 36317139649696577L) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (X.C2E8.A00(r13.A0h) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b0, code lost:
    
        if (X.C18U.A06(X.AbstractC25225BEi.A0j(r4, 0), r4, 36311912674755381L) != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0m(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLk.A0m(boolean, boolean):void");
    }

    public static Boolean A02(C2EC c2ec, LLk lLk) {
        boolean z;
        java.util.Set A1H = AbstractC166987dD.A1H();
        C45527KDs c45527KDs = lLk.A06;
        boolean z2 = false;
        if (c45527KDs != null) {
            A1H = (java.util.Set) c45527KDs.A04.getValue();
            z = A1H.stream().anyMatch(new C31424DrU(c2ec, 6));
        } else {
            z = false;
        }
        if (A1H.isEmpty() || z) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    private String A03(C3o9 c3o9) {
        C17D c17d;
        InterfaceC50518MRv A01 = A01(this, c3o9);
        if (A01 != null && !A01.Bl6().isEmpty()) {
            if (A01.CVQ()) {
                c17d = A01.BJU();
            } else {
                c17d = (C17D) AbstractC166987dD.A16(A01.Bl6());
            }
            if (c17d != null) {
                return c17d.getId();
            }
            return null;
        }
        return null;
    }

    public static ArrayList A04(C46h c46h, LLk lLk) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if ((c46h instanceof C4JL) && c46h.A03() != null) {
            InterfaceC50517MRu interfaceC50517MRu = (InterfaceC50517MRu) c46h.A03();
            for (int i = 0; i < interfaceC50517MRu.getCount(); i++) {
                A1E.add(C49173Loq.A0W.A00(lLk.A0h, interfaceC50517MRu, i));
            }
        }
        return A1E;
    }

    private ArrayList A05(List list) {
        List Axh;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            C2DU c2du = (C2DU) this.A0k;
            C14360o3.A0B(A1B, 0);
            C81663kb A0N = c2du.A0N(A1B);
            if (A0N != null && (Axh = A0N.Axh()) != null && !Axh.isEmpty()) {
                A1E.add(A0N.Axh());
            }
        }
        return A1E;
    }

    public static ArrayList A06(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(JRE.A07((C3o9) it.next()));
        }
        return A1E;
    }

    private HashMap A07(List list) {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2EC c2ec = (C2EC) it.next();
            C83403nh A01 = C4GQ.A01(c2ec);
            UserSession userSession = this.A0h;
            A1G.put(c2ec.BKb(), new C31233DoG(userSession, A01, c2ec, AbstractC31273Dov.A00(this.A0Y, userSession)));
        }
        return A1G;
    }

    public static void A09(C32071E6x c32071E6x, LLk lLk, List list, int i) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A0Q(list, A1E, A1E2);
        Context context = lLk.A0Y;
        UserSession userSession = lLk.A0h;
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            C3o9 c3o9 = (C3o9) it.next();
            InterfaceC50518MRv A01 = A01(lLk, c3o9);
            if (c3o9 != null) {
                A1E3.add(A01);
            }
        }
        int size = lLk.A12.size() + lLk.A0u.size();
        KXA kxa = new KXA(lLk, C05F.A00, list);
        InterfaceC11380iw interfaceC11380iw = lLk.A0c;
        String obj = lLk.A02.A01.toString();
        ArrayList A05 = lLk.A05(A06(A1E));
        ArrayList A1E4 = AbstractC166987dD.A1E();
        Iterator it2 = A1E2.iterator();
        while (it2.hasNext()) {
            C3o9 c3o92 = (C3o9) it2.next();
            InterfaceC50518MRv A012 = A01(lLk, c3o92);
            if (c3o92 != null) {
                A1E4.add(A012);
            }
        }
        AbstractC167007dF.A1K(context, userSession);
        AbstractC25229BEm.A1I(c32071E6x, 4, interfaceC11380iw);
        if (A1E3.isEmpty() && A1E4.isEmpty()) {
            C0w9.A03("DirectPermissionControls", "No implementation exists to accept all threads.");
            return;
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E3);
        Iterator it3 = A1E3.iterator();
        while (it3.hasNext()) {
            String A06 = JRE.A06(((InterfaceC50518MRv) it3.next()).CCb());
            if (A06 == null) {
                A06 = "";
            }
            A0q.add(A06);
        }
        int A00 = FUH.A00(userSession, A0q);
        int size2 = A1E3.size();
        boolean A1M = AbstractC167007dF.A1M(A00);
        int i2 = c32071E6x.A00;
        C19280xC A002 = C19280xC.A00(interfaceC11380iw, "direct_requests_allow_multiple_confirm");
        A002.A08(Integer.valueOf(size), "num_requests_visible");
        A002.A09("all_used", false);
        A002.A08(Integer.valueOf(size2), "num_selected");
        if (i2 != -1) {
            A002.A08(Integer.valueOf(i2), "folder");
        }
        if (obj != null) {
            A002.A0C("selected_filter", obj);
        }
        if (AbstractC25226BEj.A1b(A05)) {
            A002.A0C("labels", A05.toString());
        }
        A002.A09(AbstractC111324zv.A00(2617), Boolean.valueOf(A1M));
        A002.A08(Integer.valueOf(A00), "interop_thread_count");
        A002.A08(Integer.valueOf(i), AbstractC111324zv.A00(5529));
        AbstractC31173DnH.A1S(A002, userSession);
        C35250Fgj.A01(context, c32071E6x, userSession, kxa, obj, A0q, A1E4, i);
    }

    public static void A0E(final InterfaceC50518MRv interfaceC50518MRv, final LLk lLk, final C3o9 c3o9, final int i, boolean z) {
        InterfaceC37071o5 A00 = C37091o7.A00();
        UserSession userSession = lLk.A0h;
        if (!A00.EjT(userSession, EnumC39589Hdz.A0M) && z) {
            if (AbstractC35214Fg7.A04(lLk.A0b.requireActivity(), userSession, new InterfaceC37122GXh() { // from class: X.Lrw
                @Override // X.InterfaceC37122GXh
                public final void D3R(boolean z2) {
                    LLk lLk2 = lLk;
                    C3o9 c3o92 = c3o9;
                    InterfaceC50518MRv interfaceC50518MRv2 = interfaceC50518MRv;
                    LLk.A0M(lLk2, c3o92, C05F.A1F, i, interfaceC50518MRv2.Cf6(), z2);
                }
            }, 1, lLk.A0O)) {
                return;
            }
        }
        A0M(lLk, c3o9, C05F.A15, i, interfaceC50518MRv.Cf6(), false);
    }

    public static void A0M(LLk lLk, C3o9 c3o9, Integer num, int i, boolean z, boolean z2) {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        boolean z3 = c3o9 instanceof DirectThreadKey;
        if (z3) {
            String A15 = AbstractC31172DnG.A15(c3o9);
            if (A15 != null) {
                A1E.add(A15);
            }
        } else if (c3o9 instanceof MsysThreadId) {
            A1E2.add(c3o9);
        }
        A0N(lLk, "direct_requests_delete_thread", "swipe", null, ImmutableList.of((Object) c3o9), i);
        Context context = lLk.A0Y;
        UserSession userSession = lLk.A0h;
        C35250Fgj.A02(context, userSession, num, A1E, A1E2, z2);
        if (z3) {
            if (z && !lLk.A0O) {
                lLk.A0j.A0N(lLk.A0i.Bsj(), 1, false);
            } else {
                boolean z4 = lLk.A0O;
                C46922Dg c46922Dg = lLk.A0j;
                if (z4) {
                    c46922Dg.A0J(1);
                } else {
                    c46922Dg.A0I(1);
                }
            }
            if (lLk.A0O) {
                A0A(new SingletonImmutableSet(c3o9), lLk);
            }
        }
        lLk.A0d.markerStart(190449529);
        AbstractC47180KtF.A00(lLk.A0b, userSession, C05F.A00, lLk.A0O, false);
        lLk.A08();
    }

    public static void A0N(LLk lLk, String str, String str2, String str3, List list, int i) {
        ArrayList A1E = AbstractC166987dD.A1E();
        A0Q(list, A1E, AbstractC166987dD.A1E());
        ArrayList A06 = A06(A1E);
        LEW lew = lLk.A0m;
        String obj = lLk.A02.A01.toString();
        ArrayList A05 = lLk.A05(A06);
        int A00 = A00(lLk, list);
        C14360o3.A0B(obj, 2);
        C162337Ov.A0T(lew.A00, lew.A01, str, lew.A02, obj, str2, str3, A06, A05, i, A00);
    }

    public static void A0Q(List list, List list2, List list3) {
        for (Object obj : list) {
            if (obj instanceof DirectThreadKey) {
                list2.add(obj);
            } else if (obj instanceof MsysThreadId) {
                list3.add(obj);
            }
        }
    }

    public final HashSet A0b() {
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = this.A0v.iterator();
        while (it.hasNext()) {
            InterfaceC50518MRv A01 = A01(this, (C3o9) it.next());
            if (A01 != null) {
                A1H.add(A01);
            }
        }
        return A1H;
    }
}
