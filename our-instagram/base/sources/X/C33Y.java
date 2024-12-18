package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.33Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33Y {
    public InterfaceC81443kE A00;
    public final long A01;
    public final C33Z A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C33U A05;
    public final List A06;
    public final Map A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final boolean A0A;
    public final Context A0B;
    public final Fragment A0C;
    public final InterfaceC65282xQ A0D;
    public final C30E A0E;
    public final List A0F;

    public C33Y(Context context, Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, C33U c33u, C30E c30e, String str, List list, Map map) {
        C14360o3.A0B(str, 7);
        this.A07 = map;
        this.A0F = list;
        this.A0D = interfaceC65282xQ;
        this.A04 = interfaceC60442pS;
        this.A03 = userSession;
        this.A0B = context;
        this.A05 = c33u;
        this.A0E = c30e;
        this.A0C = fragment;
        this.A09 = AbstractC09440dt.A01(new C9EJ(this, 46));
        this.A08 = AbstractC09440dt.A01(new C9EJ(this, 45));
        this.A01 = C18U.A01(C06090Tz.A06, userSession, 36594349731415746L);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318170441127927L);
        this.A0A = A06;
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        this.A02 = new C33Z(context, userSession);
        if (A06) {
            arrayList.add(c30e);
            String str2 = c30e.A0N;
            while (this.A06.size() < 3) {
                List list2 = this.A06;
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                list2.add(new C30E(context, fragment, userSession, interfaceC60442pS, null, str3, false, true, true, false, false));
            }
        }
    }

    public final C3Y7 A00(C38321qM c38321qM, C3FQ c3fq) {
        if (c3fq == null) {
            return null;
        }
        InterfaceC81443kE interfaceC81443kE = this.A00;
        if (interfaceC81443kE == null) {
            C81203jp c81203jp = C81203jp.A01;
            ViewGroup CFj = c3fq.CFj();
            C14360o3.A07(CFj);
            interfaceC81443kE = C81203jp.A06(CFj, c38321qM, c81203jp);
            this.A00 = interfaceC81443kE;
        }
        C3Y7 A0A = C81203jp.A0A(c38321qM, interfaceC81443kE);
        if (A0A == null) {
            this.A00 = null;
        }
        return A0A;
    }

    public final boolean A03(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C4HV c4hv = (C4HV) this.A07.get(c38321qM);
        if (c4hv != null) {
            Object obj = c4hv.A03;
            if (obj instanceof C76403bk) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego");
                if (((C76403bk) obj).A0O) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A04(C38321qM c38321qM) {
        Object obj;
        C14360o3.A0B(c38321qM, 0);
        C4HV c4hv = (C4HV) this.A07.get(c38321qM);
        if (c4hv != null) {
            obj = c4hv.A03;
        } else {
            obj = null;
        }
        if (!(obj instanceof C76403bk) || ((C76403bk) obj).A03 != ClipsIFUType.A07) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r0 = r17.A05.A08(r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r10 = r0.A01;
        r4 = r17.A0D.BRZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r2 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        if (r2.hasNext() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        r7 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (((X.C30E) r7).A0J() != X.C3Q0.IDLE) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        r7 = (X.C30E) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (r7 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        if (r4.A0p() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        r12 = r4.getPosition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        r7.A0S(r8, r17.A04, r10, new X.C4QP(false, false, false, X.C4QO.A00(r17.A03)), r12, r4.A03, r4.A01(), r4.A21, r4.A2G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0042, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A01() {
        /*
            r17 = this;
            r3 = r17
            monitor-enter(r3)
            java.util.Map r0 = r3.A07     // Catch: java.lang.Throwable -> Ld5
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Ld5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld5
            r5.<init>()     // Catch: java.lang.Throwable -> Ld5
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> Ld5
        L12:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto L3e
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> Ld5
            r1 = r2
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r0 = r1.getKey()     // Catch: java.lang.Throwable -> Ld5
            X.1qM r0 = (X.C38321qM) r0     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Ld5
            X.4HV r1 = (X.C4HV) r1     // Catch: java.lang.Throwable -> Ld5
            boolean r0 = r3.A04(r0)     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto L12
            float r1 = r1.A00     // Catch: java.lang.Throwable -> Ld5
            r0 = 1059749626(0x3f2a7efa, float:0.666)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            r5.add(r2)     // Catch: java.lang.Throwable -> Ld5
            goto L12
        L3e:
            java.util.Iterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> Ld7
        L42:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto Ld3
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> Ld7
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object r8 = r0.getKey()     // Catch: java.lang.Throwable -> Ld7
            X.1qM r8 = (X.C38321qM) r8     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object r4 = r0.getValue()     // Catch: java.lang.Throwable -> Ld7
            X.4HV r4 = (X.C4HV) r4     // Catch: java.lang.Throwable -> Ld7
            java.util.List r5 = r3.A06     // Catch: java.lang.Throwable -> Ld7
            java.util.Iterator r2 = r5.iterator()     // Catch: java.lang.Throwable -> Ld7
        L60:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L79
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Ld7
            r0 = r1
            X.30E r0 = (X.C30E) r0     // Catch: java.lang.Throwable -> Ld7
            X.1qM r0 = r0.A0G()     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = X.C14360o3.A0K(r0, r8)     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L60
            if (r1 != 0) goto L42
        L79:
            X.33U r0 = r3.A05     // Catch: java.lang.Throwable -> Ld7
            X.4QN r0 = r0.A08(r8, r4)     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L42
            X.3Y7 r10 = r0.A01     // Catch: java.lang.Throwable -> Ld7
            X.2xQ r0 = r3.A0D     // Catch: java.lang.Throwable -> Ld7
            X.3Zb r4 = r0.BRZ(r8)     // Catch: java.lang.Throwable -> Ld7
            java.util.Iterator r2 = r5.iterator()     // Catch: java.lang.Throwable -> Ld5
        L8d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto Ld1
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> Ld5
            r0 = r7
            X.30E r0 = (X.C30E) r0     // Catch: java.lang.Throwable -> Ld5
            X.3Q0 r1 = r0.A0J()     // Catch: java.lang.Throwable -> Ld5
            X.3Q0 r0 = X.C3Q0.IDLE     // Catch: java.lang.Throwable -> Ld5
            if (r1 != r0) goto L8d
        La2:
            X.30E r7 = (X.C30E) r7     // Catch: java.lang.Throwable -> Ld5
            if (r7 == 0) goto L42
            boolean r0 = r4.A0p()     // Catch: java.lang.Throwable -> Ld5
            if (r0 == 0) goto Lcf
            int r12 = r4.getPosition()     // Catch: java.lang.Throwable -> Ld5
        Lb0:
            int r13 = r4.A03     // Catch: java.lang.Throwable -> Ld5
            int r14 = r4.A01()     // Catch: java.lang.Throwable -> Ld5
            boolean r15 = r4.A21     // Catch: java.lang.Throwable -> Ld5
            boolean r2 = r4.A2G     // Catch: java.lang.Throwable -> Ld5
            X.2pS r9 = r3.A04     // Catch: java.lang.Throwable -> Ld5
            com.instagram.common.session.UserSession r0 = r3.A03     // Catch: java.lang.Throwable -> Ld5
            boolean r1 = X.C4QO.A00(r0)     // Catch: java.lang.Throwable -> Ld5
            r0 = 0
            X.4QP r11 = new X.4QP     // Catch: java.lang.Throwable -> Ld5
            r11.<init>(r0, r0, r0, r1)     // Catch: java.lang.Throwable -> Ld5
            r16 = r2
            r7.A0S(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Ld5
            goto L42
        Lcf:
            r12 = -1
            goto Lb0
        Ld1:
            r7 = 0
            goto La2
        Ld3:
            monitor-exit(r3)
            return
        Ld5:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33Y.A01():void");
    }

    public final void A02(C38321qM c38321qM, C75113Zb c75113Zb, C3FQ c3fq) {
        C3Y7 c3y7;
        List<Map.Entry> list = this.A0F;
        list.clear();
        Map map = this.A07;
        C4HV c4hv = (C4HV) map.get(c38321qM);
        if (c4hv != null) {
            Object obj = c4hv.A03;
            if (!(obj instanceof C38321qM)) {
                list.addAll(AbstractC001800i.A0g(map.entrySet(), AbstractC73263Qc.A00));
                boolean z = false;
                C3Y7 c3y72 = null;
                C38321qM c38321qM2 = null;
                for (Map.Entry entry : list) {
                    C38321qM c38321qM3 = (C38321qM) entry.getKey();
                    C4HV c4hv2 = (C4HV) entry.getValue();
                    C75113Zb BRZ = this.A0D.BRZ(c38321qM3);
                    if (BRZ.A2p || BRZ.A2o) {
                        if (c4hv2.A00 >= 0.666f && C14360o3.A0K(c4hv2.A03, obj)) {
                            if (C14360o3.A0K(c38321qM3, c38321qM)) {
                                z = true;
                            } else {
                                C33U c33u = this.A05;
                                C4QN A08 = c33u.A08(c38321qM3, c4hv2);
                                if (A08 != null) {
                                    c3y7 = A08.A01;
                                } else if (A03(c38321qM3)) {
                                    C14360o3.A0B(c38321qM3, 0);
                                    if (A03(c38321qM3) && (c3y7 = A00(c38321qM3, c3fq)) != null) {
                                    }
                                } else {
                                    continue;
                                }
                                if (z) {
                                    c33u.A0A(c38321qM3, c3y7, BRZ, new C4QP(false, false, false, C4QO.A00(this.A03)));
                                    return;
                                } else if (c3y72 == null) {
                                    c3y72 = c3y7;
                                    c38321qM2 = c38321qM3;
                                }
                            }
                        }
                    }
                }
                if (c3y72 != null && c3y72.BRY() != null && c38321qM2 != null) {
                    this.A05.A0A(c38321qM2, c3y72, c75113Zb, new C4QP(false, false, false, C4QO.A00(this.A03)));
                }
            }
        }
    }
}
