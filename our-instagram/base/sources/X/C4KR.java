package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4KR, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4KR {
    public final int A00;
    public final Context A01;
    public final Handler A03;
    public final UserSession A04;
    public final C4KT A05;
    public final C4KW A06;
    public final C4KN A07;
    public final C4KV A08;
    public final C2DS A09;
    public final boolean A0E;
    public final Handler A0F;
    public final Looper A0G;
    public final InterfaceC09390do A0C = AbstractC09440dt.A01(new C9E3(this, 40));
    public final C4KH A0A = new C4KH(5);
    public final List A0B = new ArrayList();
    public final InterfaceC09390do A0D = AbstractC09440dt.A00(EnumC09460dv.A02, C4KX.A00);
    public final Handler A02 = new Handler(Looper.getMainLooper());

    public final C99J A03(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3, String str, String str2, long j, long j2) {
        C14360o3.A0B(abstractC46972Dl, 0);
        C99J A04 = A04(abstractC46972Dl, str);
        if (A04 == null) {
            C99J c99j = new C99J(this.A04, abstractC46972Dl, this, c4i3, str, str2, j, j2);
            this.A0B.add(c99j);
            A08();
            return c99j;
        }
        return A04;
    }

    public final C99J A04(AbstractC46972Dl abstractC46972Dl, String str) {
        Object obj;
        C14360o3.A0B(abstractC46972Dl, 0);
        List list = this.A0B;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C99J) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C99J c99j = (C99J) obj;
                if (C14360o3.A0K(c99j.A01, abstractC46972Dl) && C14360o3.A0K(c99j.A03, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C99J) obj;
    }

    public final C129095sU A05(ThreadFetchReason threadFetchReason, Long l, String str, String str2, boolean z) {
        Object obj;
        C14360o3.A0B(str, 0);
        Iterator it = A00(this).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C129095sU c129095sU = (C129095sU) obj;
                if (C14360o3.A0K(c129095sU.A02, str) && C14360o3.A0K(c129095sU.A01, str2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C129095sU c129095sU2 = (C129095sU) obj;
        if (c129095sU2 == null) {
            C129095sU c129095sU3 = new C129095sU(threadFetchReason, this, l, str, str2, z);
            this.A0B.add(c129095sU3);
            A08();
            return c129095sU3;
        }
        return c129095sU2;
    }

    public final C129095sU A06(String str) {
        Object obj;
        C14360o3.A0B(str, 0);
        Iterator it = A00(this).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C129095sU) obj).A02, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C129095sU) obj;
    }

    public static final List A00(C4KR c4kr) {
        List list = c4kr.A0B;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C129095sU) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.9o3, java.lang.Object] */
    public final C220179o3 A02(final String str, final long j) {
        List list = this.A0B;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C220179o3) {
                arrayList.add(obj);
            }
        }
        C220179o3 c220179o3 = (C220179o3) AbstractC001800i.A0J(arrayList);
        if (c220179o3 == null) {
            ?? r0 = new AbstractC1344165n(str, j) { // from class: X.9o3
                public final String A00;

                {
                    super(C4KR.this, Long.valueOf(j));
                    this.A00 = str;
                }

                @Override // X.AbstractC1344165n
                public final void A01() {
                    AnonymousClass776 anonymousClass776;
                    C4KR c4kr = C4KR.this;
                    C4KN c4kn = c4kr.A07;
                    if (c4kn != null) {
                        UserSession userSession = c4kr.A04;
                        Long l = this.A04;
                        boolean A00 = c4kr.A05.A00();
                        boolean A02 = AbstractC453326q.A02(userSession);
                        String str2 = this.A00;
                        int i = super.A00;
                        anonymousClass776 = c4kn.A01(userSession, null, null, l, 1038495724, A00, A02, true);
                        MarkerEditor withMarker = c4kn.A00.withMarker(anonymousClass776.A01, anonymousClass776.A00);
                        if (str2 != null) {
                            withMarker.annotate("fetch_reason", str2);
                        }
                        withMarker.annotate(TraceFieldType.RetryCount, i);
                        withMarker.markerEditingCompleted();
                    } else {
                        anonymousClass776 = null;
                    }
                    this.A03 = anonymousClass776;
                    C25621Ms c25621Ms = new C25621Ms(c4kr.A04);
                    c25621Ms.A06();
                    c25621Ms.A0B("direct_v2/get_folders/");
                    c25621Ms.A0S(C214369ea.class, C23040ADw.class);
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = this;
                    this.A02 = A0N;
                }

                @Override // X.AbstractC1344165n
                public final void A02() {
                    C4KN c4kn = C4KR.this.A07;
                    if (c4kn != null) {
                        c4kn.A0D(this.A03, null, false);
                    }
                }

                @Override // X.AbstractC1344165n
                public final void A04() {
                    C214369ea c214369ea;
                    AbstractC115105If abstractC115105If = super.A01;
                    if (abstractC115105If != null && (c214369ea = (C214369ea) abstractC115105If.A00()) != null && c214369ea.isOk()) {
                        C4KR c4kr = C4KR.this;
                        C4KN c4kn = c4kr.A07;
                        if (c4kn != null) {
                            c4kn.A04(this.A03);
                        }
                        ((C2DU) c4kr.A09).A0C.A0T(c214369ea.A00, true);
                        if (c4kn != null) {
                            c4kn.A03(this.A03);
                            c4kn.A0C(this.A03);
                            return;
                        }
                        return;
                    }
                    C4KN c4kn2 = C4KR.this.A07;
                    if (c4kn2 == null) {
                        return;
                    }
                    c4kn2.A0D(this.A03, null, false);
                }

                @Override // X.AbstractC1344165n
                public final void A08(boolean z) {
                    C4KN c4kn = C4KR.this.A07;
                    if (c4kn != null) {
                        c4kn.A0D(this.A03, Boolean.valueOf(z), true);
                    }
                }

                @Override // X.AbstractC1344165n
                public final boolean A09() {
                    return false;
                }

                @Override // X.AbstractC1344165n, X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    int A0N = AbstractC167017dG.A0N(abstractC115105If, 1617867634);
                    C4KN c4kn = C4KR.this.A07;
                    if (c4kn != null) {
                        c4kn.A02(abstractC115105If, this.A03);
                    }
                    super.onFail(abstractC115105If);
                    C0f9.A0A(1328314744, A0N);
                }

                @Override // X.AbstractC1344165n, X.C1P1
                public final void onStart() {
                    int A03 = C0f9.A03(-11079849);
                    super.onStart();
                    C4KN c4kn = C4KR.this.A07;
                    if (c4kn != null) {
                        c4kn.A05(this.A03);
                    }
                    C0f9.A0A(-398813209, A03);
                }
            };
            list.add(r0);
            A08();
            return r0;
        }
        return c220179o3;
    }

    public final String A07() {
        if (this instanceof C94374Lx) {
            return "octane";
        }
        return "iris";
    }

    public final void A08() {
        if (this instanceof C4KQ) {
            C4KQ c4kq = (C4KQ) this;
            C28811aJ c28811aJ = c4kq.A02;
            boolean z = c28811aJ.A0C;
            boolean z2 = c28811aJ.A0B;
            if (c28811aJ.A0D) {
                if (z && !c4kq.A01) {
                    C4KH c4kh = c4kq.A0A;
                    c4kh.A01 = 0;
                    c4kh.A00 = 0;
                }
                if (c4kq.A00 && !z2) {
                    C99L c99l = C99L.A00;
                    C14360o3.A0B(c99l, 1);
                    Iterator it = c4kq.A0B.iterator();
                    while (it.hasNext()) {
                        AbstractC1344165n abstractC1344165n = (AbstractC1344165n) it.next();
                        if ((abstractC1344165n instanceof C129095sU) && ((Boolean) c99l.invoke(abstractC1344165n)).booleanValue()) {
                            C11R c11r = abstractC1344165n.A02;
                            if (c11r instanceof C1OO) {
                                ((C1OO) c11r).cancel();
                            }
                            abstractC1344165n.A02 = null;
                            abstractC1344165n.A07("On Iris unsubscribe");
                            abstractC1344165n.A05(C7J2.A00(), false, false);
                            it.remove();
                        }
                    }
                }
                if (z) {
                    c4kq.A09();
                }
            }
            c4kq.A00 = z2;
            c4kq.A01 = z;
            return;
        }
        C94374Lx c94374Lx = (C94374Lx) this;
        boolean A0E = AbstractC15820qc.A0E(((C4KR) c94374Lx).A01);
        if (((C2DU) c94374Lx.A09).A0H.A0F && A0E) {
            if (!c94374Lx.A00) {
                C4KH c4kh2 = c94374Lx.A0A;
                c4kh2.A01 = 0;
                c4kh2.A00 = 0;
            }
            c94374Lx.A09();
        }
        c94374Lx.A00 = A0E;
    }

    public final void A09() {
        List list = this.A0B;
        int size = list.size();
        if (size > 3) {
            size = 3;
        }
        for (int i = 0; i < size; i++) {
            AbstractC1344165n abstractC1344165n = (AbstractC1344165n) list.get(i);
            if (abstractC1344165n.A02 == null) {
                int i2 = this.A0A.A00 * CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
                abstractC1344165n.A01();
                Handler handler = this.A0F;
                Message obtainMessage = handler.obtainMessage(1, abstractC1344165n);
                C14360o3.A07(obtainMessage);
                if (i2 == 0) {
                    handler.sendMessage(obtainMessage);
                } else {
                    handler.sendMessageDelayed(obtainMessage, i2);
                }
            }
        }
    }

    public final void A0A(C99J c99j, C99Z c99z) {
        if (this instanceof C4KQ) {
            C28811aJ c28811aJ = ((C4KQ) this).A02;
            if (c99j.A04) {
                UserSession userSession = c28811aJ.A0M;
                if (AbstractC94034Kn.A00(userSession)) {
                    C17110t6 c17110t6 = (C17110t6) c28811aJ.A0R;
                    C14360o3.A0B(userSession, 0);
                    c17110t6.A02.A06(C08730cb.A00(userSession).A00());
                }
                long j = c99z.A01;
                if (j != -1) {
                    c28811aJ.A05 = c99z.A02;
                    c28811aJ.A08 = AbstractC12880la.A04(c28811aJ.A0G);
                    c28811aJ.A07 = c99j.A02;
                    c28811aJ.A0C(j, 2);
                }
                AbstractC46972Dl abstractC46972Dl = c99j.A01;
                Integer num = abstractC46972Dl.A03;
                if (num == C05F.A00) {
                    String str = c99j.A02;
                    String A00 = AbstractC43591JPw.A00(1303);
                    if (!C2I7.A00(str, A00)) {
                        if (C2E8.A07(userSession)) {
                            if (abstractC46972Dl == C47072Dv.A00) {
                                Iterator it = c28811aJ.A0W.iterator();
                                while (it.hasNext()) {
                                    new C99G((AbstractC46972Dl) it.next(), null, c28811aJ, C4I3.A03, "page_scroll", false, false).A03();
                                }
                            } else if (c28811aJ.A0X.contains(abstractC46972Dl)) {
                                for (AbstractC46972Dl abstractC46972Dl2 : c28811aJ.A0W) {
                                    if (abstractC46972Dl2 != abstractC46972Dl) {
                                        new C99G(abstractC46972Dl2, null, c28811aJ, C4I3.A03, A00, true, false).A03();
                                    }
                                }
                            }
                        }
                        List list = c28811aJ.A0T;
                        if (!list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                new C99G((AbstractC46972Dl) it2.next(), null, c28811aJ, C4I3.A03, A00, true, false).A03();
                            }
                        }
                    }
                }
                ((C25671My) c28811aJ.A0a.getValue()).A05(new C132725yv(abstractC46972Dl, num, c99j.A02, c99z.A01, true));
            }
            C28811aJ.A04(c28811aJ);
            return;
        }
        throw new IllegalStateException("Inbox snapshot is not applicable to the Octane sync path");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r3 != r9.longValue()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(X.C129095sU r12) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C4KQ
            if (r0 == 0) goto L46
            r0 = r11
            X.4KQ r0 = (X.C4KQ) r0
            X.1aJ r8 = r0.A02
            java.util.List r0 = r12.A03
            java.util.concurrent.CopyOnWriteArrayList r7 = new java.util.concurrent.CopyOnWriteArrayList
            r7.<init>(r0)
            X.4K6 r6 = r8.A0Q
            java.lang.Long r9 = r12.A04
            java.util.Iterator r10 = r7.iterator()
        L18:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r5 = r10.next()
            X.5lP r5 = (X.C5lP) r5
            long r3 = r5.A00
            r0 = 1
            long r3 = r3 - r0
            if (r9 == 0) goto L34
            long r1 = r9.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L35
        L34:
            r2 = 0
        L35:
            X.02i r1 = r6.A00
            if (r2 == 0) goto L3f
            java.lang.String r0 = "thread_snapshot_end"
        L3b:
            X.AbstractC125215lS.A00(r1, r5, r0)
            goto L18
        L3f:
            java.lang.String r0 = "wait_for_thread_snapshot_end"
            goto L3b
        L42:
            X.C28811aJ.A07(r8, r7)
            return
        L46:
            r0 = r11
            X.4Lx r0 = (X.C94374Lx) r0
            X.4Kx r7 = r0.A01
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto Laf
            X.2DS r2 = r7.A04
            r6 = 0
            com.instagram.model.direct.DirectThreadKey r1 = new com.instagram.model.direct.DirectThreadKey
            r1.<init>(r0, r6)
            r0 = 0
            java.util.ArrayList r0 = r2.Ab7(r1, r0)
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r5.next()
            X.3nh r0 = (X.C83403nh) r0
            java.lang.Long r0 = r0.A1R
            if (r0 == 0) goto L91
            long r3 = r0.longValue()
        L74:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r5.next()
            X.3nh r0 = (X.C83403nh) r0
            java.lang.Long r0 = r0.A1R
            if (r0 == 0) goto L8e
            long r1 = r0.longValue()
        L88:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L74
            r3 = r1
            goto L74
        L8e:
            r1 = -1
            goto L88
        L91:
            r3 = -1
            goto L74
        L94:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L9a:
            X.4Lz r5 = r7.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto La8
            long r0 = r5.A01
            long r1 = java.lang.Math.max(r0, r3)
        La8:
            r5.A01 = r1
            X.4M3 r0 = X.C4M3.A04
            X.C94394Lz.A00(r0, r5, r6)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4KR.A0B(X.5sU):void");
    }

    public final void A0C(C129095sU c129095sU, String str) {
        if (this instanceof C4KQ) {
            C28811aJ c28811aJ = ((C4KQ) this).A02;
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(c129095sU.A03);
            C4K6 c4k6 = c28811aJ.A0Q;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C5lP c5lP = (C5lP) it.next();
                C006802i c006802i = c4k6.A00;
                AbstractC125215lS.A01(c006802i, c5lP, "thread_snapshot_fail_reason", str);
                AbstractC125215lS.A01(c006802i, c5lP, "cancel_reason", "Thread snapshot cancel");
                AbstractC125215lS.A02(c006802i, c5lP, (short) 4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r3 != r7.longValue()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(X.C129095sU r10, java.lang.String r11) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C4KQ
            if (r0 == 0) goto L56
            r0 = r9
            X.4KQ r0 = (X.C4KQ) r0
            X.1aJ r2 = r0.A02
            java.util.List r1 = r10.A03
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>(r1)
            X.4K6 r6 = r2.A0Q
            java.lang.Long r7 = r10.A04
            java.util.Iterator r8 = r0.iterator()
        L18:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r5 = r8.next()
            X.5lP r5 = (X.C5lP) r5
            long r3 = r5.A00
            r0 = 1
            long r3 = r3 - r0
            if (r7 == 0) goto L34
            long r1 = r7.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L35
        L34:
            r1 = 0
        L35:
            X.02i r2 = r6.A00
            if (r1 == 0) goto L4e
            java.lang.String r0 = "thread_snapshot_fail_reason"
            X.AbstractC125215lS.A01(r2, r5, r0, r11)
            java.lang.String r1 = "Thread snapshot fail"
        L40:
            r0 = 406(0x196, float:5.69E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.AbstractC125215lS.A01(r2, r5, r0, r1)
            r0 = 3
            X.AbstractC125215lS.A02(r2, r5, r0)
            goto L18
        L4e:
            java.lang.String r0 = "wait_for_thread_snapshot_fail_reason"
            X.AbstractC125215lS.A01(r2, r5, r0, r11)
            java.lang.String r1 = "Wait for thread snapshot fail"
            goto L40
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4KR.A0D(X.5sU, java.lang.String):void");
    }

    public final void A0E(boolean z) {
        if (this instanceof C4KQ) {
            C28811aJ c28811aJ = ((C4KQ) this).A02;
            if (!Boolean.valueOf(z).booleanValue()) {
                UserSession userSession = c28811aJ.A0M;
                if (AbstractC94034Kn.A00(userSession)) {
                    C17110t6 c17110t6 = (C17110t6) c28811aJ.A0R;
                    C14360o3.A0B(userSession, 0);
                    c17110t6.A02.A06(C08730cb.A00(userSession).A00());
                }
            }
        }
    }

    public C4KR(final Looper looper, UserSession userSession, C4KN c4kn, int i, boolean z) {
        this.A04 = userSession;
        this.A0G = looper;
        this.A07 = c4kn;
        this.A0E = z;
        this.A00 = i;
        this.A05 = C4KS.A00(userSession);
        this.A01 = userSession.deviceSession.A06();
        this.A09 = AbstractC28761aE.A00(userSession);
        this.A08 = (C4KV) userSession.A01(C4KV.class, new MHJ(userSession, 39));
        this.A06 = new C4KW(AbstractC12220kQ.A01(new C19270xB("ig_direct"), userSession));
        this.A0F = new Handler(looper) { // from class: X.4KY
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C14360o3.A0B(message, 0);
                if (message.what == 1) {
                    Object obj = message.obj;
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.realtime.snapshot.BaseSnapshotRequestManager.SnapshotHttpRequest<*>");
                    AbstractC1344165n abstractC1344165n = (AbstractC1344165n) obj;
                    C14360o3.A0B(abstractC1344165n, 0);
                    C11R c11r = abstractC1344165n.A02;
                    if (c11r != null) {
                        C1GJ.A03(c11r);
                    }
                }
            }
        };
        this.A03 = new Handler(looper) { // from class: X.4KZ
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i2;
                InterfaceC40801un interfaceC40801un;
                AbstractC115105If abstractC115105If;
                Throwable A01;
                int A00;
                InterfaceC40801un interfaceC40801un2;
                C14360o3.A0B(message, 0);
                if (message.what == 2) {
                    C4KR c4kr = this;
                    Object obj = message.obj;
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.realtime.snapshot.BaseSnapshotRequestManager.SnapshotHttpRequest<*>");
                    AbstractC1344165n abstractC1344165n = (AbstractC1344165n) obj;
                    C14360o3.A0B(abstractC1344165n, 0);
                    if (abstractC1344165n.A02 != null) {
                        AbstractC115105If abstractC115105If2 = abstractC1344165n.A01;
                        if (abstractC115105If2 != null && (interfaceC40801un2 = (InterfaceC40801un) abstractC115105If2.A00()) != null) {
                            i2 = interfaceC40801un2.getStatusCode();
                        } else {
                            i2 = 0;
                        }
                        abstractC1344165n.A02 = null;
                        boolean A002 = AbstractC37423Ge3.A00(i2);
                        if (i2 != 200 && !A002) {
                            if (!AbstractC15820qc.A0F(c4kr.A01) || ((A00 = abstractC1344165n.A00()) != -1 && abstractC1344165n.A00 >= A00)) {
                                c4kr.A0B.remove(abstractC1344165n);
                                C4KH c4kh = c4kr.A0A;
                                c4kh.A01 = 0;
                                c4kh.A00 = 0;
                                abstractC1344165n.A08(true);
                            } else {
                                abstractC1344165n.A08(false);
                                c4kr.A0A.A00();
                            }
                        } else {
                            c4kr.A0B.remove(abstractC1344165n);
                            C4KH c4kh2 = c4kr.A0A;
                            c4kh2.A01 = 0;
                            c4kh2.A00 = 0;
                            if (A002) {
                                AbstractC115105If abstractC115105If3 = abstractC1344165n.A01;
                                if (abstractC115105If3 != null && (interfaceC40801un = (InterfaceC40801un) abstractC115105If3.A00()) != null && interfaceC40801un.getStatusCode() == 200 && (abstractC115105If = abstractC1344165n.A01) != null && (A01 = abstractC115105If.A01()) != null) {
                                    C0K8.A0F(AbstractC111324zv.A00(3511), "failed to fetch snapshot", A01);
                                    if ((A01 instanceof C53093Ne6) || (A01 instanceof NullPointerException)) {
                                        C1ZX A003 = ((C1ZW) c4kr.A0C.getValue()).A00(C05F.A04, 817891655, 0, false);
                                        A003.A05(A01);
                                        A003.A00();
                                    }
                                }
                                abstractC1344165n.A02();
                            } else {
                                abstractC1344165n.A04();
                            }
                        }
                    }
                }
                this.A08();
            }
        };
    }

    public static final void A01(C4KR c4kr, C43707JUs c43707JUs, String str, String str2, String str3, String str4) {
        C28891aS A00 = AbstractC207749He.A00();
        UserSession userSession = c4kr.A04;
        JV9 A002 = A00.A00(userSession);
        if (!C18U.A06(C06090Tz.A05, userSession, 36318861938793174L)) {
            ArrayList A003 = A002.A00(c43707JUs);
            if (c43707JUs != null) {
                if ((c43707JUs.A08 || (!A003.isEmpty())) && c43707JUs.A05(userSession)) {
                    C14120nc.A00().ATO(new C45726KMd(A002, c4kr, c43707JUs, str3, str2, str4, str, A003));
                }
            }
        }
    }
}
