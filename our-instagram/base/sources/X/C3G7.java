package X;

import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.3G7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3G7 implements InterfaceC13000lm {
    public C51R A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final java.util.Set A04;
    public final java.util.Set A05;
    public final Comparator A06;

    public final void A05(C3G5 c3g5, InterfaceC114885Gz interfaceC114885Gz, String str, String str2, List list) {
        C14360o3.A0B(str, 3);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C81943lE(c3g5, (String) list.get(i), 0, -1, -1));
        }
        A09(interfaceC114885Gz, str, str2, arrayList, false);
    }

    public final void A06(C3G5 c3g5, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            int i = reel.A02;
            if (i > 0) {
                String id = reel.getId();
                C14360o3.A07(id);
                arrayList.add(new C81943lE(c3g5, id, i, -1, -1));
            }
        }
        A09(null, "reel_feed_timeline", null, arrayList, true);
    }

    public final void A07(InterfaceC147106jm interfaceC147106jm) {
        C14360o3.A0B(interfaceC147106jm, 0);
        java.util.Set<Reference> set = this.A04;
        for (Reference reference : set) {
            Object obj = reference.get();
            if (obj == null) {
                set.remove(reference);
            } else if (obj == interfaceC147106jm) {
                return;
            }
        }
        set.add(new WeakReference(interfaceC147106jm));
    }

    public final void A08(InterfaceC147106jm interfaceC147106jm) {
        C14360o3.A0B(interfaceC147106jm, 0);
        java.util.Set<Reference> set = this.A04;
        for (Reference reference : set) {
            Object obj = reference.get();
            if (obj == null) {
                set.remove(reference);
            } else if (obj == interfaceC147106jm) {
                set.remove(reference);
                return;
            }
        }
    }

    public final void A09(InterfaceC114885Gz interfaceC114885Gz, String str, String str2, List list, boolean z) {
        if (!this.A01) {
            if (list.isEmpty()) {
                if (interfaceC114885Gz != null) {
                    interfaceC114885Gz.onFinish();
                }
            } else {
                if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(this.A03).A00, 36317491838194923L)) {
                    C14120nc.A00().ATO(new C52389NGk(interfaceC114885Gz, this, str, str2, list, z));
                } else {
                    A02(interfaceC114885Gz, this, str, str2, list, z);
                }
            }
        }
    }

    public final void A0A(String str, String str2, List list) {
        C14360o3.A0B(str, 1);
        A09(null, str, str2, list, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (X.AbstractC81973lH.A00(r32.A03, r33, false) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.model.reels.Reel r29, X.C81953lF r30, X.C81943lE r31, X.C3G7 r32, java.lang.String r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3G7.A00(com.instagram.model.reels.Reel, X.3lF, X.3lE, X.3G7, java.lang.String, boolean):void");
    }

    public static final void A02(InterfaceC114885Gz interfaceC114885Gz, final C3G7 c3g7, final String str, String str2, List list, final boolean z) {
        C82013lN A00;
        C51R c51r;
        AbstractC001800i.A0g(list, c3g7.A06);
        final C81953lF c81953lF = new C81953lF(interfaceC114885Gz, list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = new ArrayList(c81953lF.A03.values()).iterator();
        while (it.hasNext()) {
            C81943lE c81943lE = (C81943lE) it.next();
            UserSession userSession = c3g7.A03;
            Reel A0M = ReelStore.A03(userSession).A0M(c81943lE.A04);
            if (A0M != null && A0M.A0z(userSession)) {
                A00(A0M, c81953lF, c81943lE, c3g7, str, z);
            } else {
                linkedHashSet.add(c81943lE);
            }
        }
        UserSession userSession2 = c3g7.A03;
        if (AbstractC81973lH.A00(userSession2, str, false)) {
            C42411xV.A00(userSession2).A0B.Enk(C05F.A00);
        }
        if (!linkedHashSet.isEmpty()) {
            LinkedHashSet<C81943lE> linkedHashSet2 = new LinkedHashSet(linkedHashSet);
            if (!c3g7.A01 && !linkedHashSet2.isEmpty()) {
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                C3G5 c3g5 = ((C81943lE) linkedHashSet2.iterator().next()).A03;
                Iterator it2 = linkedHashSet2.iterator();
                while (it2.hasNext()) {
                    linkedHashSet3.add(((C81943lE) it2.next()).A04);
                }
                AbstractC13670mt.A05(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, linkedHashSet3);
                for (final C81943lE c81943lE2 : linkedHashSet2) {
                    InterfaceC81993lL interfaceC81993lL = new InterfaceC81993lL() { // from class: X.3lJ
                        @Override // X.InterfaceC81993lL
                        public final void DPm(String str3) {
                            C3G7 c3g72 = c3g7;
                            if (!c3g72.A01) {
                                c3g72.A05.remove(this);
                                AbstractC82003lM.A00(c3g72.A03).A04(this, str3);
                                c81953lF.A00(str3);
                                if (str3 != null) {
                                    java.util.Set<Reference> set = c3g72.A04;
                                    for (Reference reference : set) {
                                        InterfaceC147106jm interfaceC147106jm = (InterfaceC147106jm) reference.get();
                                        if (interfaceC147106jm == null) {
                                            set.remove(reference);
                                        } else {
                                            interfaceC147106jm.DOA(str3);
                                        }
                                    }
                                }
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
                        @Override // X.InterfaceC81993lL
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void DPz(java.lang.String r8, boolean r9) {
                            /*
                                r7 = this;
                                X.3G7 r4 = r3
                                boolean r0 = r4.A01
                                if (r0 != 0) goto L57
                                java.util.Set r0 = r4.A05
                                r0.remove(r7)
                                com.instagram.common.session.UserSession r1 = r4.A03
                                X.3lN r0 = X.AbstractC82003lM.A00(r1)
                                r0.A04(r7, r8)
                                com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r1)
                                com.instagram.model.reels.Reel r1 = r0.A0M(r8)
                                if (r1 == 0) goto L51
                                X.3lE r3 = r2
                                int r0 = r3.A01
                                if (r0 <= 0) goto L51
                                X.3lF r2 = r1
                                java.lang.String r5 = r4
                                boolean r6 = r5
                                X.C3G7.A00(r1, r2, r3, r4, r5, r6)
                            L2d:
                                if (r8 == 0) goto L57
                                java.util.Set r3 = r4.A04
                                java.util.Iterator r2 = r3.iterator()
                            L35:
                                boolean r0 = r2.hasNext()
                                if (r0 == 0) goto L57
                                java.lang.Object r1 = r2.next()
                                java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
                                java.lang.Object r0 = r1.get()
                                X.6jm r0 = (X.InterfaceC147106jm) r0
                                if (r0 != 0) goto L4d
                                r3.remove(r1)
                                goto L35
                            L4d:
                                r0.DOC(r8, r9)
                                goto L35
                            L51:
                                X.3lF r0 = r1
                                r0.A00(r8)
                                goto L2d
                            L57:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C81983lJ.DPz(java.lang.String, boolean):void");
                        }
                    };
                    java.util.Set<Reference> set = c3g7.A04;
                    for (Reference reference : set) {
                        InterfaceC147106jm interfaceC147106jm = (InterfaceC147106jm) reference.get();
                        if (interfaceC147106jm == null) {
                            set.remove(reference);
                        } else {
                            interfaceC147106jm.DOB(c81943lE2.A04);
                        }
                    }
                    c3g7.A05.add(interfaceC81993lL);
                    AbstractC82003lM.A00(userSession2).A05(interfaceC81993lL, c81943lE2.A04, null, false);
                }
                HashMap hashMap = new HashMap();
                if (str2 != null) {
                    hashMap.put(AbstractC43591JPw.A00(199), str2);
                }
                if (AbstractC81973lH.A00(userSession2, str, false)) {
                    if (c3g7.A00 == null) {
                        c3g7.A00 = new C51R() { // from class: X.51Q
                            @Override // X.C51R
                            public final void onFailure() {
                            }

                            @Override // X.C51R
                            public final void DqI(Map map) {
                                C42411xV.A00(C3G7.this.A03).A0B.Enk(C05F.A00);
                            }
                        };
                    }
                    A00 = AbstractC82003lM.A00(userSession2);
                    c51r = c3g7.A00;
                } else {
                    A00 = AbstractC82003lM.A00(userSession2);
                    c51r = null;
                }
                A00.A01(c3g5, c51r, str, hashMap, linkedHashSet3);
            }
            linkedHashSet.clear();
        }
    }

    public static final boolean A03(C81953lF c81953lF, C3G7 c3g7, String str, java.util.Set set, java.util.Set set2, java.util.Set set3) {
        if (!c3g7.A01) {
            if (set.isEmpty() && set2.isEmpty() && set3.isEmpty()) {
                c81953lF.A00(str);
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (X.C3G6.A01(r12, r13.getId(), r6) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C902940o A04(com.instagram.model.reels.Reel r54, java.lang.String r55, int r56) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3G7.A04(com.instagram.model.reels.Reel, java.lang.String, int):X.40o");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (!this.A01) {
            this.A01 = true;
            C82013lN A00 = AbstractC82003lM.A00(this.A03);
            java.util.Set set = this.A05;
            C14360o3.A0B(set, 0);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A00.A03((InterfaceC81993lL) it.next());
            }
            set.clear();
            this.A04.clear();
        }
    }

    public C3G7(UserSession userSession) {
        this.A03 = userSession;
        this.A02 = userSession.deviceSession.A06();
        userSession.A04(C3G7.class, this);
        this.A05 = new HashSet();
        this.A04 = new CopyOnWriteArraySet();
        this.A06 = C3G8.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        if (r5.A1o() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.model.reels.Reel r18, final X.C81953lF r19, final X.C3G7 r20, java.lang.String r21, final java.lang.String r22, java.util.Map r23, java.util.Map r24, java.util.Map r25, java.util.Map r26, final java.util.Set r27, final java.util.Set r28, final java.util.Set r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3G7.A01(com.instagram.model.reels.Reel, X.3lF, X.3G7, java.lang.String, java.lang.String, java.util.Map, java.util.Map, java.util.Map, java.util.Map, java.util.Set, java.util.Set, java.util.Set, boolean):void");
    }
}
