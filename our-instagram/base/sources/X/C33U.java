package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.ui.listview.StickyHeaderListView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.33U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33U implements InterfaceC57132jo {
    public float A00;
    public int A01;
    public C66290U7l A02;
    public C3A4 A03;
    public C3FQ A04;
    public StickyHeaderListView A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final float A0B;
    public final Context A0C;
    public final Handler A0D;
    public final Fragment A0E;
    public final UserSession A0F;
    public final InterfaceC60442pS A0G;
    public final InterfaceC65282xQ A0H;
    public final C57462kL A0I;
    public final C33X A0J;
    public final C33Y A0K;
    public final C33N A0L;
    public final C30E A0M;
    public final C33T A0N;
    public final Map A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final float A0R;
    public final C33P A0S;
    public final C33V A0T;
    public final List A0U;
    public final boolean A0V;
    public final boolean A0W;

    public C33U(Context context, Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, C33N c33n, C33P c33p, C30E c30e, C33T c33t, boolean z) {
        this.A0C = context;
        this.A0F = userSession;
        this.A0G = interfaceC60442pS;
        this.A0M = c30e;
        this.A0H = interfaceC65282xQ;
        this.A0S = c33p;
        this.A0L = c33n;
        this.A0N = c33t;
        this.A0P = z;
        this.A0E = fragment;
        HashMap hashMap = new HashMap();
        this.A0O = hashMap;
        ArrayList arrayList = new ArrayList();
        this.A0U = arrayList;
        this.A01 = -1;
        this.A00 = -1.0f;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0V = C18U.A06(c06090Tz, userSession, 36315116718984220L);
        this.A0Q = C18U.A06(c06090Tz, userSession, 36315116719115293L);
        C33V c33v = new C33V(this);
        this.A0T = c33v;
        this.A0W = C18U.A06(c06090Tz, userSession, 36320111766216776L);
        final Looper mainLooper = Looper.getMainLooper();
        this.A0D = new Handler(mainLooper) { // from class: X.33W
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int B6q;
                int BM3;
                View BQt;
                C38321qM A00;
                Comparator comparator;
                boolean z2;
                C38321qM c38321qM;
                C3Y7 c3y7;
                C75113Zb BRY;
                FragmentActivity activity;
                C3DN A002;
                C14360o3.A0B(message, 0);
                if (message.what == 0) {
                    C33U c33u = this;
                    if (c33u.A04 != null && c33u.A0A) {
                        C30E c30e2 = c33u.A0M;
                        C3Q0 A0J = c30e2.A0J();
                        C14360o3.A0B(A0J, 0);
                        if ((A0J == C3Q0.IDLE || A0J == C3Q0.PAUSED) && !c30e2.A0Z()) {
                            Fragment fragment2 = c33u.A0E;
                            if (fragment2 != null && (activity = fragment2.getActivity()) != null && (A002 = C3DN.A00.A00(activity)) != null) {
                                C3DP c3dp = (C3DP) A002;
                                if (c3dp.A0h && c3dp.A0c) {
                                    return;
                                }
                            }
                            C4S6 c4s6 = c30e2.A02;
                            if (c4s6 != null && (c3y7 = c4s6.A08) != null && (BRY = c3y7.BRY()) != null && BRY.A25) {
                                return;
                            }
                            if (c33u.A02 != null) {
                                C4QN A02 = C33U.A02(c33u);
                                if (A02 != null) {
                                    InterfaceC65282xQ interfaceC65282xQ2 = c33u.A0H;
                                    C38321qM c38321qM2 = A02.A00;
                                    if (!C3Q5.A04(c33u.A0F, interfaceC65282xQ2, c38321qM2)) {
                                        C33X c33x = c33u.A0J;
                                        if (c33x == null || c33x.A01 == c38321qM2) {
                                            return;
                                        }
                                        CountDownTimer countDownTimer = c33x.A00;
                                        if (countDownTimer != null) {
                                            countDownTimer.cancel();
                                        }
                                        c33x.A01 = c38321qM2;
                                        C3Y7 c3y72 = A02.A01;
                                        c33x.A02 = c3y72.BRY();
                                        InterfaceC74323Vo B62 = c3y72.B62();
                                        if (B62 != null) {
                                            B62.setVisibility(0);
                                            B62.setVideoIconState(EnumC74373Vt.A0C);
                                            B62.EcU(5000, false);
                                        } else {
                                            B62 = null;
                                        }
                                        c33x.A03 = B62;
                                        U91 u91 = new U91(c38321qM2, c33x);
                                        u91.start();
                                        c33x.A00 = u91;
                                        return;
                                    }
                                }
                                C33X c33x2 = c33u.A0J;
                                if (c33x2 != null) {
                                    CountDownTimer countDownTimer2 = c33x2.A00;
                                    if (countDownTimer2 != null) {
                                        countDownTimer2.cancel();
                                    }
                                    InterfaceC74323Vo interfaceC74323Vo = c33x2.A03;
                                    if (interfaceC74323Vo != null) {
                                        interfaceC74323Vo.setVideoIconState(EnumC74373Vt.A06);
                                    }
                                    C75113Zb c75113Zb = c33x2.A02;
                                    if (c75113Zb != null) {
                                        c75113Zb.A0m(false, false);
                                    }
                                    c33x2.A00 = null;
                                    c33x2.A01 = null;
                                    c33x2.A02 = null;
                                    c33x2.A03 = null;
                                }
                                if (A02 == null || (c38321qM = A02.A00) == null) {
                                    return;
                                }
                                c33u.A0A(c38321qM, A02.A01, c33u.A0H.BRZ(c38321qM), C33U.A04(c33u, false, false));
                                return;
                            }
                            if (c33u.A0L.A04) {
                                C3FQ c3fq = c33u.A04;
                                if (c3fq == null) {
                                    return;
                                }
                                UserSession userSession2 = c33u.A0F;
                                C06090Tz c06090Tz2 = C06090Tz.A05;
                                if (C18U.A06(c06090Tz2, userSession2, 36325257136714681L)) {
                                    comparator = AbstractC73263Qc.A02;
                                } else {
                                    comparator = AbstractC73263Qc.A00;
                                }
                                C4QN A03 = C33U.A03(c33u, comparator, c3fq.B6q(), c3fq.BM3());
                                boolean z3 = false;
                                if (A03 == null || A03.A03 != C33U.A00(c33u, c3fq)) {
                                    c30e2.A0V("scroll", true, false);
                                    if (A03 == null) {
                                        return;
                                    }
                                }
                                C38321qM c38321qM3 = A03.A00;
                                if (c38321qM3 == null) {
                                    return;
                                }
                                C33Y c33y = c33u.A0K;
                                C4HV c4hv = (C4HV) c33y.A07.get(c38321qM3);
                                if (c4hv != null) {
                                    Object obj = c4hv.A03;
                                    if (obj instanceof C76403bk) {
                                        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego");
                                        if (!((C76403bk) obj).A0O && C18U.A06(c06090Tz2, userSession2, 36318170441127927L) && c33y.A02.A00()) {
                                            c33y.A01();
                                            return;
                                        }
                                    }
                                }
                                C4HV c4hv2 = (C4HV) c33u.A0O.get(c38321qM3);
                                C75113Zb BRZ = c33u.A0H.BRZ(c38321qM3);
                                C3Y7 c3y73 = A03.A01;
                                if (c4hv2 != null) {
                                    z2 = c4hv2.A05;
                                    z3 = c4hv2.A06;
                                } else {
                                    z2 = false;
                                }
                                c33u.A0A(c38321qM3, c3y73, BRZ, C33U.A04(c33u, z2, z3));
                                return;
                            }
                            C3FQ c3fq2 = c33u.A04;
                            if (c3fq2 == null || (B6q = c3fq2.B6q()) > (BM3 = c3fq2.BM3())) {
                                return;
                            }
                            while (true) {
                                InterfaceC65282xQ interfaceC65282xQ3 = c33u.A0H;
                                C3Y7 A01 = C3Q5.A01(c33u.A0F, interfaceC65282xQ3, c3fq2, B6q);
                                if (A01 != null && (BQt = A01.BQt()) != null) {
                                    int height = (int) (BQt.getHeight() * c33u.A0B);
                                    StickyHeaderListView stickyHeaderListView = c33u.A05;
                                    ViewGroup CFj = c3fq2.CFj();
                                    C14360o3.A07(CFj);
                                    if (C81203jp.A01(CFj, BQt, stickyHeaderListView) >= height && (A00 = C3Q5.A00(interfaceC65282xQ3, c3fq2, B6q)) != null) {
                                        c33u.A0A(A00, A01, interfaceC65282xQ3.BRZ(A00), C33U.A04(c33u, false, false));
                                        return;
                                    }
                                }
                                if (B6q == BM3) {
                                    return;
                                } else {
                                    B6q++;
                                }
                            }
                        }
                    }
                }
            }
        };
        this.A0J = new C33X(c33v);
        this.A0I = new C57462kL(userSession);
        this.A0B = ((int) C18U.A01(c06090Tz, userSession, 36598825078492467L)) / 100.0f;
        this.A0R = ((int) C18U.A01(c06090Tz, userSession, 36598825078558004L)) / 100.0f;
        this.A0K = new C33Y(context, fragment, userSession, interfaceC60442pS, interfaceC65282xQ, this, c30e, interfaceC60442pS.getModuleName(), arrayList, hashMap);
    }

    private final C4QN A01(C38321qM c38321qM, C4HV c4hv, float f, int i, int i2) {
        C3Y7 A09;
        int[] modelIndex = this.A0H.getModelIndex(c4hv.A03);
        if (modelIndex == null || modelIndex.length == 0) {
            return null;
        }
        int i3 = modelIndex[0];
        if (i3 < i) {
            i3 = i;
        }
        int i4 = modelIndex[1] + i3;
        int i5 = i2 + 1;
        if (i4 > i5) {
            i4 = i5;
        }
        while (i3 < i4) {
            C3FQ c3fq = this.A04;
            if (c3fq != null && (A09 = C81203jp.A09(c38321qM, c3fq, i3)) != null) {
                return new C4QN(c38321qM, A09, f, i3);
            }
            i3++;
        }
        return null;
    }

    public static final C4QN A03(C33U c33u, Comparator comparator, int i, int i2) {
        float f;
        C38321qM A1e;
        List<Map.Entry> list = c33u.A0U;
        list.clear();
        list.addAll(c33u.A0O.entrySet());
        C01T.A1D(list, comparator);
        for (Map.Entry entry : list) {
            C38321qM c38321qM = (C38321qM) entry.getKey();
            InterfaceC65282xQ interfaceC65282xQ = c33u.A0H;
            C75113Zb BRZ = interfaceC65282xQ.BRZ(c38321qM);
            float f2 = ((C4HV) entry.getValue()).A00;
            C14360o3.A0B(BRZ, 0);
            C14360o3.A0B(c38321qM, 1);
            if (c33u.A06(c38321qM)) {
                f = 0.65f;
            } else if (BRZ.A2p) {
                f = 0.666f;
            } else {
                f = c33u.A0L.A00;
            }
            if (f2 >= f && (!c38321qM.A5M() || ((A1e = c38321qM.A1e(interfaceC65282xQ.BRZ(c38321qM).A03)) != null && (A1e.Cff() || A1e.A4z())))) {
                C4QN A01 = c33u.A01(c38321qM, (C4HV) entry.getValue(), f2, i, i2);
                if (A01 == null) {
                    C33Y c33y = c33u.A0K;
                    boolean A03 = c33y.A03(c38321qM);
                    C3FQ c3fq = c33u.A04;
                    if (!A03 || c33y.A03(c38321qM)) {
                        C3Y7 A00 = c33y.A00(c38321qM, c3fq);
                        if (A00 != null) {
                            return new C4QN(c38321qM, A00, f2, BRZ.getPosition());
                        }
                    }
                } else {
                    return A01;
                }
            }
        }
        return null;
    }

    public final C4QN A08(C38321qM c38321qM, C4HV c4hv) {
        int i;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c4hv, 1);
        C3FQ c3fq = this.A04;
        int i2 = -1;
        if (c3fq != null) {
            i2 = c3fq.B6q();
            i = c3fq.BM3();
        } else {
            i = -1;
        }
        C66290U7l c66290U7l = this.A02;
        if (c66290U7l != null) {
            int A04 = c66290U7l.A04();
            if (i2 < A04) {
                i2 = A04;
            }
            int A03 = c66290U7l.A03();
            if (i > A03) {
                i = A03;
            }
        }
        return A01(c38321qM, c4hv, 0.0f, i2, i);
    }

    public final void A0A(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb, C4QP c4qp) {
        int ordinal;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(c3y7, 2);
        if (!c75113Zb.Ceb()) {
            C3A4 c3a4 = this.A03;
            if (c3a4 != null && c3a4.A02 && !c38321qM.equals(c3a4.A00)) {
                return;
            }
            View BQt = c3y7.BQt();
            if (BQt != null && BQt.getVisibility() != 0) {
                return;
            }
            C76183bN c76183bN = C76173bM.A04;
            UserSession userSession = this.A0F;
            InterfaceC60442pS interfaceC60442pS = this.A0G;
            if (c76183bN.A01(userSession, c38321qM, c75113Zb, interfaceC60442pS.getModuleName()) && !c75113Zb.A2p && (ordinal = c75113Zb.A0l.ordinal()) != 0 && ordinal != 4) {
                if (ordinal != 3) {
                    if ((ordinal == 2 && AbstractC41071vF.A0T(userSession, c38321qM) && this.A0M.A0J() == C3Q0.IDLE) || c76183bN.A02(userSession, c38321qM, interfaceC60442pS.getModuleName())) {
                        return;
                    }
                } else {
                    c75113Zb.A0K(EnumC75203Zn.A04);
                    c75113Zb.A0Q = 0;
                    if (c38321qM.A1z() == ProductType.IGTV || c38321qM.CdW()) {
                        c75113Zb.A0E(0, c75113Zb.A03);
                        c75113Zb.A0Y = (int) c38321qM.A1C();
                        C4QW c4qw = this.A0M.A05;
                        if (c4qw != null) {
                            c4qw.EMg(0, true);
                        }
                        c75113Zb.A0C(0);
                    }
                    this.A0H.CtR(c38321qM);
                }
            }
            C30E c30e = this.A0M;
            if (c30e.A0J() == C3Q0.PAUSED && c38321qM.equals(c30e.A0G()) && (!C18U.A06(C06090Tz.A05, userSession, 36323281451691145L) || c75113Zb.A0l == EnumC75203Zn.A05)) {
                c30e.A0M();
            } else {
                this.A0S.A09(c38321qM, c3y7, c75113Zb, c4qp, false);
            }
            this.A07 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
    
        if (r4 < r3) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0B(android.view.View r11, X.C38321qM r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33U.A0B(android.view.View, X.1qM, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.C33U r18, X.C3FQ r19) {
        /*
            r7 = r18
            X.30E r0 = r7.A0M
            X.1qM r5 = r0.A0G()
            r6 = r19
            int r12 = r6.BDJ()
            int r4 = r6.B6q()
            int r3 = r6.BM3()
            if (r5 == 0) goto L1b
            r2 = r4
            if (r4 <= r3) goto L1d
        L1b:
            r2 = -1
            return r2
        L1d:
            int r9 = r2 - r12
            android.view.View r0 = X.C81203jp.A04(r5, r6, r2)
            if (r0 == 0) goto L6f
            X.2xQ r10 = r7.A0H
            int r0 = r10.getCount()
            if (r9 >= r0) goto L6f
            java.lang.Object r1 = r10.getItem(r9)
            boolean r0 = r1 instanceof X.C38321qM
            r19 = 0
            if (r0 == 0) goto L75
            r0 = r1
            X.1qM r0 = (X.C38321qM) r0
        L3a:
            if (r0 != 0) goto L8f
        L3c:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            int r0 = r3 - r4
            int r0 = r0 + 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            X.3kI r18 = X.C81203jp.A0B(r6, r2)
            if (r1 == 0) goto L64
            java.lang.Class r0 = r1.getClass()
            if (r0 == 0) goto L64
            java.lang.String r19 = r0.getName()
        L64:
            java.lang.Object[] r8 = new java.lang.Object[]{r13, r14, r15, r16, r17, r18, r19}
            java.lang.String r1 = "FeedVideoModule"
            java.lang.String r0 = "unexpected view type, index:%d, firstVisibleItem:%d, visibleItemCount:%d, mediaIndex:%d, headerCount:%d, mediaType:%s, class:%s"
            X.C0K8.A0Q(r1, r0, r8)
        L6f:
            r0 = r2
            int r2 = r2 + 1
            if (r0 != r3) goto L1d
            goto L1b
        L75:
            boolean r0 = r1 instanceof X.InterfaceC38371qR
            if (r0 == 0) goto L81
            r0 = r1
            X.1qR r0 = (X.InterfaceC38371qR) r0
            X.1qM r0 = r0.BQN()
            goto L3a
        L81:
            boolean r0 = r1 instanceof X.InterfaceC76413bl
            if (r0 == 0) goto Lc6
            r0 = r1
            X.3bl r0 = (X.InterfaceC76413bl) r0
            boolean r0 = r0.AJk(r5)
            if (r0 == 0) goto Lc6
            r0 = r5
        L8f:
            boolean r1 = r0.A5M()
            if (r1 == 0) goto Lb7
            X.3Zb r8 = r10.BRZ(r0)
            boolean r1 = r0.A5p()
            if (r1 == 0) goto Lb0
            com.instagram.common.session.UserSession r8 = r7.A0F
            X.1qM r1 = r5.A1g(r8)
            X.1qM r0 = r0.A1g(r8)
            boolean r0 = X.C14360o3.A0K(r1, r0)
        Lad:
            if (r0 == 0) goto L6f
            return r2
        Lb0:
            int r1 = r8.A03
            X.1qM r0 = r0.A1e(r1)
            goto Lc1
        Lb7:
            boolean r1 = r0.A5Q()
            if (r1 == 0) goto Lc1
            X.1qM r0 = r0.A1d()
        Lc1:
            boolean r0 = r5.equals(r0)
            goto Lad
        Lc6:
            boolean r0 = r1 instanceof X.C1121854m
            if (r0 == 0) goto L3c
            boolean r0 = r10 instanceof X.C65192xH
            if (r0 == 0) goto L3c
            r8 = r1
            X.54m r8 = (X.C1121854m) r8
            r11 = r10
            X.2xH r11 = (X.C65192xH) r11
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            r0 = 1
            X.C14360o3.A0B(r11, r0)
            X.4gj r8 = r8.A00
            X.2rd r0 = r11.A0T
            X.5IV r0 = r0.A02(r8)
            X.1qM r0 = r0.A06
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33U.A00(X.33U, X.3FQ):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r10.BRZ(r11).A35 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110 A[LOOP:0: B:22:0x0045->B:81:0x0110, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C4QN A02(X.C33U r17) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33U.A02(X.33U):X.4QN");
    }

    public static final void A05(C38321qM c38321qM, C75113Zb c75113Zb, C33U c33u) {
        UserSession userSession = c33u.A0F;
        InterfaceC60442pS interfaceC60442pS = c33u.A0G;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_clips_end_of_preview");
        A00.A8R(BQL.A0z, "action");
        A00.A8R(EnumC120795dP.A0M, "action_source");
        A00.AAP("containermodule", interfaceC60442pS.getModuleName());
        String id = c38321qM.getId();
        if (id != null) {
            A00.AAP(AbstractC43591JPw.A00(1162), id);
            A00.A9K("media_index", Long.valueOf(c75113Zb.getPosition()));
            A00.AAP("viewer_session_id", c33u.A0M.A0N);
            A00.AAP("nav_chain", String.valueOf(C1QM.A00.A02.A00));
            A00.AAP(MSV.A00(125), c38321qM.getId());
            A00.AAP("mezql_token", c38321qM.A0C.getMezqlToken());
            A00.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
            A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A00.Cht();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r9.A0V != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A07(X.C33U r9) {
        /*
            boolean r0 = r9.A07
            r2 = 0
            if (r0 != 0) goto La
            boolean r0 = r9.A0V
            r1 = 0
            if (r0 == 0) goto Lb
        La:
            r1 = 1
        Lb:
            X.33N r0 = r9.A0L
            boolean r0 = r0.A04
            if (r0 != 0) goto L13
            if (r1 == 0) goto L31
        L13:
            X.30E r0 = r9.A0M
            X.3Q0 r4 = r0.A0J()
            X.U7l r3 = r9.A02
            X.33T r0 = r9.A0N
            long r5 = r0.A04
            boolean r7 = r9.A09
            boolean r8 = r9.A0P
            boolean r0 = X.C3Q5.A05(r3, r4, r5, r7, r8)
            if (r0 == 0) goto L31
            java.util.Map r0 = r9.A0O
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
        L31:
            r2 = 1
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33U.A07(X.33U):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33U.A09():void");
    }

    @Override // X.InterfaceC57132jo
    public final void DiQ() {
        EnumC75203Zn enumC75203Zn;
        C38321qM A1e;
        if (this.A08) {
            C33N c33n = this.A0L;
            if (c33n.A06) {
                C30E c30e = this.A0M;
                C3Q0 A0J = c30e.A0J();
                C14360o3.A0B(A0J, 0);
                if ((A0J == C3Q0.PLAYING || A0J == C3Q0.PREPARING) && c30e.A0G() != null) {
                    A09();
                }
            }
            if (this.A0A && (!this.A09 || !this.A06)) {
                if (c33n.A07 && this.A04 != null) {
                    C30E c30e2 = this.A0M;
                    C3Q0 A0J2 = c30e2.A0J();
                    C14360o3.A0B(A0J2, 0);
                    if ((A0J2 == C3Q0.IDLE || A0J2 == C3Q0.PAUSED) && c30e2.A0Z()) {
                        for (Map.Entry entry : this.A0O.entrySet()) {
                            C38321qM c38321qM = (C38321qM) entry.getKey();
                            if (!c38321qM.A5M() || ((A1e = c38321qM.A1e(this.A0H.BRZ(c38321qM).A03)) != null && A1e.Cff())) {
                                C4QN A08 = A08(c38321qM, (C4HV) entry.getValue());
                                if (A08 != null) {
                                    C3Y7 c3y7 = A08.A01;
                                    C3Q5.A02(this.A0F, c3y7, c30e2);
                                    C3Q5.A03(c3y7, EnumC79303gb.A03);
                                }
                            }
                        }
                    }
                }
                if (c33n.A05 && this.A04 != null) {
                    for (Map.Entry entry2 : this.A0O.entrySet()) {
                        C38321qM c38321qM2 = (C38321qM) entry2.getKey();
                        InterfaceC65282xQ interfaceC65282xQ = this.A0H;
                        C75113Zb BRZ = interfaceC65282xQ.BRZ(c38321qM2);
                        UserSession userSession = this.A0F;
                        if (C3Q5.A04(userSession, interfaceC65282xQ, c38321qM2) && C76173bM.A04.A01(userSession, c38321qM2, BRZ, this.A0G.getModuleName()) && !BRZ.A2p && ((enumC75203Zn = BRZ.A0l) == EnumC75203Zn.A06 || enumC75203Zn == EnumC75203Zn.A03)) {
                            C4QN A082 = A08(c38321qM2, (C4HV) entry2.getValue());
                            if (A082 != null && A0B(A082.A01.BQt(), c38321qM2, A082.A03, true)) {
                                BRZ.A0K(EnumC75203Zn.A05);
                            }
                        }
                    }
                }
                if (!A07(this)) {
                    this.A0D.sendEmptyMessage(0);
                }
            }
            this.A08 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A0F, 36327889951538108L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C4QP A04(X.C33U r4, boolean r5, boolean r6) {
        /*
            X.1KH r0 = X.AbstractC25061Kk.A00()
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L14
            X.1KH r0 = X.AbstractC25061Kk.A00()
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L24
        L14:
            com.instagram.common.session.UserSession r3 = r4.A0F
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327889951538108(0x81100600003bbc, double:3.037242113799675E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r2 = 1
            if (r0 != 0) goto L25
        L24:
            r2 = 0
        L25:
            com.instagram.common.session.UserSession r0 = r4.A0F
            boolean r1 = X.C4QO.A00(r0)
            X.4QP r0 = new X.4QP
            r0.<init>(r2, r5, r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33U.A04(X.33U, boolean, boolean):X.4QP");
    }

    private final boolean A06(C38321qM c38321qM) {
        if (c38321qM.A6I()) {
            Map map = this.A0O;
            C4HV c4hv = (C4HV) map.get(c38321qM);
            if (c4hv != null) {
                int i = c4hv.A02;
                int i2 = Integer.MAX_VALUE;
                Iterator it = map.entrySet().iterator();
                Object obj = null;
                C4HV c4hv2 = null;
                boolean z = false;
                while (it.hasNext()) {
                    C4HV c4hv3 = (C4HV) ((Map.Entry) it.next()).getValue();
                    int i3 = c4hv3.A02 - i;
                    if (i3 > 0 && i3 < i2) {
                        c4hv2 = c4hv3;
                        i2 = i3;
                    }
                    if ((c4hv3.A03 instanceof C76403bk) && c4hv3.A00 >= 0.95f) {
                        z = true;
                    }
                }
                if (c4hv2 != null) {
                    obj = c4hv2.A03;
                }
                if ((obj instanceof C76403bk) && z) {
                    return true;
                }
            }
        }
        return false;
    }
}
