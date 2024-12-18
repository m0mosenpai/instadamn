package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.HallpassDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61252qn implements InterfaceC61272qp, InterfaceC13000lm {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C1OK A06;
    public UserSession A07;
    public C3AZ A08;
    public String A09;
    public String A0A;
    public ArrayList A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public long A0N;
    public Integer A0O;
    public final C61302qs A0P;
    public final ArrayList A0Q;
    public final ArrayList A0R;
    public final AtomicBoolean A0S;
    public final AtomicBoolean A0T;
    public final AtomicBoolean A0U;

    public C61252qn(UserSession userSession) {
        long A01;
        long A012;
        C14360o3.A0B(userSession, 1);
        this.A0A = "";
        this.A0Q = new ArrayList();
        this.A0R = new ArrayList();
        this.A0L = -1;
        this.A0T = new AtomicBoolean(false);
        this.A0S = new AtomicBoolean(false);
        this.A0U = new AtomicBoolean(false);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A03 = C18U.A01(c06090Tz, userSession, 36598966817394011L);
        this.A0P = new C61302qs(userSession);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelTrayManager.init", -64870725);
        }
        try {
            this.A07 = userSession;
            if (C25371Lr.A00(AbstractC25351Lp.A00(userSession))) {
                A01 = C18U.A01(c06090Tz, userSession, 36603463643632574L);
            } else {
                A01 = C18U.A01(c06090Tz, userSession, 36592167879311695L);
            }
            this.A0L = (int) A01;
            this.A0M = (int) C18U.A01(c06090Tz, userSession, 36592167879377232L);
            if (C25371Lr.A00(AbstractC25351Lp.A00(userSession))) {
                A012 = C18U.A01(c06090Tz, userSession, 36603463643435964L);
            } else {
                A012 = C18U.A01(c06090Tz, userSession, 36592167879246158L);
            }
            this.A0K = (int) A012;
            this.A00 = C18U.A01(C06090Tz.A06, AbstractC25351Lp.A00(this.A07).A00, 36598966813658444L);
            if (Systrace.A0E(1L)) {
                C0fO.A00(1795351638);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1123708731);
            }
            throw th;
        }
    }

    public final void A0G(final InterfaceC61312qt interfaceC61312qt) {
        C14360o3.A0B(interfaceC61312qt, 0);
        C61302qs c61302qs = this.A0P;
        synchronized (c61302qs.A01) {
            if (C18U.A06(C06090Tz.A05, c61302qs.A00, 36325695224296738L)) {
                c61302qs.A03.add(new WeakReference(interfaceC61312qt) { // from class: X.3q4
                    public final int A00;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof C84553q4) {
                            T t = get();
                            Object obj2 = ((Reference) obj).get();
                            if (t != 0 && obj2 != null) {
                                return t.equals(obj2);
                            }
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return this.A00;
                    }

                    {
                        super(interfaceC61312qt);
                        this.A00 = interfaceC61312qt.hashCode();
                    }
                });
            } else {
                c61302qs.A02.add(interfaceC61312qt);
            }
        }
    }

    public final void A0H(InterfaceC61312qt interfaceC61312qt) {
        C14360o3.A0B(interfaceC61312qt, 0);
        C61302qs c61302qs = this.A0P;
        synchronized (c61302qs.A01) {
            if (C18U.A06(C06090Tz.A05, c61302qs.A00, 36325695224296738L)) {
                AnonymousClass016.A17(c61302qs.A03, new C206969Eb(interfaceC61312qt, 49));
            } else {
                c61302qs.A02.remove(interfaceC61312qt);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:5:0x001c, B:7:0x0022, B:9:0x0037, B:11:0x003b, B:13:0x003f, B:16:0x0048, B:18:0x004c, B:27:0x006b, B:28:0x006e, B:31:0x0074, B:33:0x007a, B:37:0x0087, B:39:0x008b, B:40:0x008d, B:44:0x0055, B:46:0x0059), top: B:4:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0J(X.C1GL r8, X.C61442r7 r9, java.lang.Integer r10) {
        /*
            r7 = this;
            r2 = 0
            X.C14360o3.A0B(r8, r2)
            java.lang.String r1 = "ReelTrayManager.refreshReelTray - fetchReason: "
            java.lang.String r0 = X.AbstractC25631Mt.A00(r10)
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            r5 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto L1c
            r0 = -968557355(0xffffffffc644fcd5, float:-12607.208)
            X.C0fO.A01(r1, r0)
        L1c:
            boolean r0 = r7.A0I()     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L9b
            com.instagram.common.session.UserSession r0 = r7.A07     // Catch: java.lang.Throwable -> Lb2
            X.1Lr r0 = X.AbstractC25351Lp.A00(r0)     // Catch: java.lang.Throwable -> Lb2
            com.instagram.common.session.UserSession r4 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            X.0Tz r3 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> Lb2
            r0 = 36325794007758198(0x810e1e00043576, double:3.035916630513572E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L48
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> Lb2
            if (r10 == r0) goto L48
            java.lang.Integer r0 = X.C05F.A01     // Catch: java.lang.Throwable -> Lb2
            if (r10 == r0) goto L48
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0S     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L48
            goto L9b
        L48:
            java.lang.Integer r0 = X.C05F.A03     // Catch: java.lang.Throwable -> Lb2
            if (r10 != r0) goto L55
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A0U     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = r1.get()     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto L6b
            goto La5
        L55:
            java.lang.Integer r0 = X.C05F.A0N     // Catch: java.lang.Throwable -> Lb2
            if (r10 == r0) goto L6e
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0U     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L6e
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto Lb1
            r0 = 1328853784(0x4f34b318, float:3.031636E9)
            goto Lae
        L6b:
            r1.set(r2)     // Catch: java.lang.Throwable -> Lb2
        L6e:
            java.lang.Integer r1 = X.C05F.A01     // Catch: java.lang.Throwable -> Lb2
            if (r10 != r1) goto L87
            if (r9 == 0) goto L87
            boolean r0 = A0C(r7, r10)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L87
            A05(r8, r9, r7, r1)     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto Lb1
            r0 = -2096444520(0xffffffff830acb98, float:-4.078827E-37)
            goto Lae
        L87:
            java.lang.Integer r0 = X.C05F.A06     // Catch: java.lang.Throwable -> Lb2
            if (r10 == r0) goto L8d
            java.lang.Integer r1 = X.C05F.A0Y     // Catch: java.lang.Throwable -> Lb2
        L8d:
            boolean r2 = r7.A0B(r8, r9, r1, r10)     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto Lb1
            r0 = 1551826938(0x5c7efffa, float:2.8710437E17)
            goto Lae
        L9b:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto Lb1
            r0 = 236535586(0xe193f22, float:1.8889103E-30)
            goto Lae
        La5:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto Lb1
            r0 = 906348223(0x3605c6bf, float:1.993423E-6)
        Lae:
            X.C0fO.A00(r0)
        Lb1:
            return r2
        Lb2:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r5)
            if (r0 == 0) goto Lbf
            r0 = -1282230012(0xffffffffb392b904, float:-6.832309E-8)
            X.C0fO.A00(r0)
        Lbf:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61252qn.A0J(X.1GL, X.2r7, java.lang.Integer):boolean");
    }

    public final boolean A0K(boolean z, boolean z2, boolean z3) {
        ArrayList A00;
        if (z && Math.abs(System.currentTimeMillis() - this.A02) <= TimeUnit.SECONDS.toMillis(this.A00)) {
            return false;
        }
        ReelStore A04 = C1OU.A04(this.A07);
        synchronized (A04) {
            A00 = A04.A03.A00();
        }
        List A0U = A04.A0U(z3);
        C61302qs c61302qs = this.A0P;
        boolean z4 = false;
        if (!A00.equals(A0U)) {
            z4 = true;
        }
        c61302qs.De4(z2, z4);
        return !A00.equals(A0U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC25351Lp.A00(r5.A07).A00, 36317212663026622L) != false) goto L9;
     */
    @Override // X.InterfaceC61272qp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Eib(java.lang.Integer r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            X.C14360o3.A0B(r6, r0)
            int r0 = r6.intValue()
            r4 = 0
            if (r0 == r4) goto L28
            if (r0 != r1) goto L41
            boolean r0 = r5.A0E
            if (r0 == 0) goto L30
            com.instagram.common.session.UserSession r0 = r5.A07
            X.1Lr r0 = X.AbstractC25351Lp.A00(r0)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317212663026622(0x810650000313be, double:3.0304897535510216E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L30
        L27:
            return r4
        L28:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0S
            r0.set(r1)
            int r1 = r5.A0L
            goto L32
        L30:
            int r1 = r5.A0M
        L32:
            java.util.ArrayList r0 = r5.A0R
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L27
            int r8 = r8 - r7
            if (r8 > r1) goto L27
            r4 = 1
            return r4
        L41:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61252qn.Eib(java.lang.Integer, int, int):boolean");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.4cT] */
    private final C99064cT A00(final C61442r7 c61442r7, final C1OP c1op, final Integer num, final boolean z) {
        String A1D = AnonymousClass001.A1D("ReelTrayManager.getColdStartCallback - useCache: ", z);
        if (Systrace.A0E(1L)) {
            C0fO.A01(A1D, -1369121406);
        }
        try {
            ?? r4 = new C1P1() { // from class: X.4cT
                public long A00 = System.currentTimeMillis();

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int i;
                    List list;
                    C61442r7 c61442r72;
                    int A03 = C0f9.A03(-1648405938);
                    C3LZ c3lz = (C3LZ) obj;
                    int A032 = C0f9.A03(-1945470903);
                    C14360o3.A0B(c3lz, 0);
                    C3NO F7f = c3lz.F7f();
                    C61252qn c61252qn = this;
                    C1DS.A00(c61252qn.A07);
                    boolean z2 = z;
                    if (z2 && c61252qn.A0T.get()) {
                        C61442r7 c61442r73 = c61442r7;
                        if (c61442r73 != null) {
                            C24611Ie c24611Ie = c61442r73.A0H.A03.A01;
                            c24611Ie.A01.A03("CACHED_STORIES_TRAY_FAILED", "cancel");
                            c24611Ie.A00().Egh(C1IT.A03);
                        }
                        i = 858981999;
                    } else {
                        if (z2 && (((list = F7f.A0J) == null || list.isEmpty()) && (c61442r72 = c61442r7) != null)) {
                            C24611Ie c24611Ie2 = c61442r72.A0H.A03.A01;
                            c24611Ie2.A01.A03("CACHED_STORIES_TRAY_FAILED", "empty");
                            c24611Ie2.A00().Egh(C1IT.A03);
                        }
                        C61252qn.A08(c1op, c3lz, c61252qn, -1, this.A00, z2);
                        C61252qn.A07(c61442r7, z2);
                        i = -1603884232;
                    }
                    C0f9.A0A(i, A032);
                    C0f9.A0A(1866418780, A03);
                }

                @Override // X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(1786885991);
                    C14360o3.A0B(abstractC115105If, 0);
                    boolean z2 = z;
                    if (!z2) {
                        String valueOf = String.valueOf(abstractC115105If.A01());
                        C61442r7 c61442r72 = c61442r7;
                        if (c61442r72 != null) {
                            c61442r72.A05(false, valueOf);
                        }
                    }
                    C61252qn.A03(abstractC115105If, c1op, this, this.A00, z2);
                    C0f9.A0A(-1891485722, A03);
                }

                @Override // X.C1P1
                public final void onFinish() {
                    int A03 = C0f9.A03(-1857011472);
                    boolean z2 = z;
                    C61252qn c61252qn = this;
                    C1OR.A00(c61252qn.A07).A07(c1op);
                    if (!z2) {
                        c61252qn.A0G = false;
                    }
                    c61252qn.A0C = true;
                    C0f9.A0A(-455298764, A03);
                }

                @Override // X.C1P1
                public final void onStart() {
                    int A03 = C0f9.A03(-163180832);
                    super.onStart();
                    if (z) {
                        this.A0Q.clear();
                    }
                    UserSession userSession = this.A07;
                    C1OS A00 = C1OR.A00(userSession);
                    C1OP c1op2 = c1op;
                    A00.A0C(c1op2, null);
                    C3D5.A00(userSession).A05(c1op2);
                    if (C18U.A06(C06090Tz.A05, userSession, 36327280066181591L)) {
                        C3D6 A002 = C3D5.A00(userSession);
                        C61442r7 c61442r72 = c61442r7;
                        synchronized (A002) {
                            A002.A00 = c61442r72;
                        }
                    }
                    C0f9.A0A(-937350023, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                    int A03 = C0f9.A03(1327903029);
                    C3LZ c3lz = (C3LZ) obj;
                    int A032 = C0f9.A03(-553301623);
                    C14360o3.A0B(c3lz, 0);
                    C3NO F7f = c3lz.F7f();
                    C61252qn c61252qn = this;
                    UserSession userSession = c61252qn.A07;
                    C1DS.A00(userSession);
                    if (!z) {
                        C226218q.A01(AbstractC12960li.A00).A0I();
                        c61252qn.A0T.set(true);
                        String str = F7f.A0D;
                        if (str != null && str.length() > 0) {
                            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                            C14360o3.A0B(A00, 1);
                            A00.A0t(str);
                        }
                        C61252qn.A0A(F7f, c61252qn);
                    }
                    C0f9.A0A(1695967160, A032);
                    C0f9.A0A(-1013209665, A03);
                }
            };
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1680814472);
            }
            return r4;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1525353049);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.3q6] */
    private final C84573q6 A01(final C61442r7 c61442r7, final C1OP c1op, final Integer num, final boolean z) {
        String A1D = AnonymousClass001.A1D("ReelTrayManager.getStreamingColdStartCallback - useCache: ", z);
        if (Systrace.A0E(1L)) {
            C0fO.A01(A1D, 428616186);
        }
        try {
            ?? r4 = new InterfaceC24551Hy(c61442r7, c1op, this, num, z) { // from class: X.3q6
                public long A00 = System.currentTimeMillis();
                public AtomicInteger A01 = new AtomicInteger(1);
                public final java.util.Set A02 = new LinkedHashSet();
                public final boolean A03;
                public final /* synthetic */ C61442r7 A04;
                public final /* synthetic */ C1OP A05;
                public final /* synthetic */ C61252qn A06;
                public final /* synthetic */ Integer A07;
                public final /* synthetic */ boolean A08;

                public final void A00(C3LZ c3lz) {
                    int i;
                    C14360o3.A0B(c3lz, 2);
                    boolean z2 = this.A08;
                    C61252qn c61252qn = this.A06;
                    C1OP c1op2 = this.A05;
                    C61442r7 c61442r72 = this.A04;
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("ReelTrayManager.getStreamingColdStartCallback.onNewData", 1215945562);
                    }
                    try {
                        if (!this.A02.contains(c3lz)) {
                            if (z2) {
                                if (!c61252qn.A0J) {
                                    C61252qn.A08(c1op2, c3lz, c61252qn, this.A01.get(), this.A00, z2);
                                }
                            } else {
                                long j = this.A00;
                                AtomicInteger atomicInteger = this.A01;
                                C61252qn.A08(c1op2, c3lz, c61252qn, atomicInteger.get(), j, false);
                                boolean z3 = false;
                                if (atomicInteger.get() == 1) {
                                    z3 = true;
                                }
                                c61252qn.A0E = z3;
                                c61252qn.A0J = true;
                            }
                            if (this.A01.getAndIncrement() == 1 && c61442r72 != null) {
                                C61252qn.A07(c61442r72, z2);
                            }
                            if (Systrace.A0E(1L)) {
                                i = -1338420699;
                            } else {
                                return;
                            }
                        } else if (Systrace.A0E(1L)) {
                            i = -32242294;
                        } else {
                            return;
                        }
                        C0fO.A00(i);
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-747149377);
                        }
                        throw th;
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                }

                @Override // X.InterfaceC24551Hy
                public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                    C14360o3.A0B(abstractC115105If, 1);
                    boolean z2 = this.A08;
                    if (!z2) {
                        String valueOf = String.valueOf(abstractC115105If.A01());
                        C61442r7 c61442r72 = this.A04;
                        if (c61442r72 != null) {
                            c61442r72.A05(false, valueOf);
                        }
                    }
                    C61252qn.A03(abstractC115105If, this.A05, this.A06, this.A00, z2);
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void DVR() {
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                }

                {
                    this.A06 = this;
                    this.A08 = z;
                    this.A07 = num;
                    boolean z2 = true;
                    UserSession userSession = this.A07;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (!C18U.A06(c06090Tz, userSession, 36328057457032282L) && !C18U.A06(c06090Tz, userSession, 36328057458146408L)) {
                        z2 = false;
                    }
                    this.A03 = z2;
                }

                @Override // X.InterfaceC24551Hy
                public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    A00((C3LZ) interfaceC40801un);
                }

                @Override // X.InterfaceC24551Hy
                public final /* bridge */ /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    C3LZ c3lz = (C3LZ) interfaceC40801un;
                    C14360o3.A0B(interfaceC26451Qa, 0);
                    C14360o3.A0B(c3jx, 1);
                    C14360o3.A0B(c3lz, 2);
                    if (!this.A08) {
                        C226218q.A01(AbstractC12960li.A00).A0I();
                        C3NO F7f = c3lz.F7f();
                        C61252qn c61252qn = this.A06;
                        UserSession userSession = c61252qn.A07;
                        C1DS.A00(userSession);
                        String str = F7f.A0D;
                        if (str != null) {
                            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                            C14360o3.A0B(A00, 1);
                            A00.A0t(str);
                        }
                        C61252qn.A0A(F7f, c61252qn);
                    }
                    if (this.A03 && C11T.A08()) {
                        A00(c3lz);
                        this.A02.add(c3lz);
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final void Dg4() {
                    boolean z2 = this.A08;
                    C61252qn c61252qn = this.A06;
                    C1OP c1op2 = this.A05;
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("ReelTrayManager.getStreamingColdStartCallback.onRequestFinished", 235905024);
                    }
                    try {
                        C1OR.A00(c61252qn.A07).A07(c1op2);
                        if (!z2) {
                            c61252qn.A0G = false;
                            c61252qn.A0E = false;
                        }
                        c61252qn.A0C = true;
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(139480909);
                        }
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(1385121164);
                        }
                        throw th;
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final void DgK() {
                    C1OP c1op2 = this.A05;
                    C61252qn c61252qn = this.A06;
                    C61442r7 c61442r72 = this.A04;
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("ReelTrayManager.getStreamingColdStartCallback.onRequestStarted", 1770277617);
                    }
                    try {
                        if (c1op2.A03 != C05F.A0C) {
                            c61252qn.A0Q.clear();
                        }
                        UserSession userSession = c61252qn.A07;
                        C1OR.A00(userSession).A0C(c1op2, null);
                        C3D5.A00(userSession).A05(c1op2);
                        if (C18U.A06(C06090Tz.A05, userSession, 36327280066181591L)) {
                            C3D6 A00 = C3D5.A00(userSession);
                            synchronized (A00) {
                                A00.A00 = c61442r72;
                            }
                        }
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(2053952353);
                        }
                    } catch (Throwable th) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(563925890);
                        }
                        throw th;
                    }
                }
            };
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1421728821);
            }
            return r4;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1509868151);
            }
            throw th;
        }
    }

    public static final Integer A02(C1GL c1gl, C61442r7 c61442r7, C61252qn c61252qn, Integer num) {
        Integer num2;
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelTrayManager.fetchReelTrayFromServer", -1345908439);
        }
        try {
            if (c61252qn.A0I()) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-479827720);
                }
                return null;
            }
            UserSession userSession = c61252qn.A07;
            C1OP A03 = C1LB.A00(userSession).A03();
            if (A03 instanceof C1P0) {
                C1IA A00 = C1I9.A00(userSession);
                C84573q6 A01 = c61252qn.A01(c61442r7, A03, num, false);
                C06090Tz c06090Tz = C06090Tz.A05;
                num2 = A00.A05(A01, c1gl, "main_reel", C18U.A01(c06090Tz, userSession, 36596441371642356L), true, true, C18U.A06(c06090Tz, userSession, 36328057457032282L));
            } else if (A03 instanceof C98934cD) {
                num2 = C1P2.A00(userSession).A05(c61252qn.A00(c61442r7, A03, num, false), c1gl, "main_reel", C18U.A01(C06090Tz.A05, userSession, 36596441371642356L), true, true);
            } else if (A03 instanceof C98944cE) {
                num2 = C1P2.A00(userSession).A05(new HGB(c61252qn.A00(c61442r7, A03, num, false)), c1gl, "main_reel_gql", C18U.A01(C06090Tz.A05, userSession, 36596441371642356L), true, true);
            } else {
                num2 = C05F.A0C;
            }
            if (num2 == C05F.A0C) {
                c61252qn.A0B(c1gl, c61442r7, C05F.A01, C05F.A00);
            } else {
                c61252qn.A0G = true;
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1923525353);
            }
            return num2;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-471526190);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if ((r1 instanceof java.io.IOException) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
    
        if (r3 == null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4 A[Catch: all -> 0x0180, TryCatch #0 {, blocks: (B:28:0x0067, B:30:0x0071, B:32:0x0077, B:41:0x007b, B:43:0x0087, B:45:0x008d, B:47:0x0097, B:48:0x0099, B:50:0x00a4, B:52:0x00aa, B:53:0x00b8, B:55:0x00f3, B:57:0x011a, B:59:0x0121, B:60:0x0123, B:64:0x012a, B:67:0x0149, B:68:0x0158, B:71:0x015e, B:73:0x0162, B:74:0x014f, B:76:0x0153, B:77:0x012d, B:78:0x00c2, B:80:0x00c8, B:82:0x00cd, B:84:0x00d1, B:85:0x00da, B:87:0x00de, B:89:0x0136, B:91:0x0140), top: B:27:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a A[Catch: all -> 0x0180, TryCatch #0 {, blocks: (B:28:0x0067, B:30:0x0071, B:32:0x0077, B:41:0x007b, B:43:0x0087, B:45:0x008d, B:47:0x0097, B:48:0x0099, B:50:0x00a4, B:52:0x00aa, B:53:0x00b8, B:55:0x00f3, B:57:0x011a, B:59:0x0121, B:60:0x0123, B:64:0x012a, B:67:0x0149, B:68:0x0158, B:71:0x015e, B:73:0x0162, B:74:0x014f, B:76:0x0153, B:77:0x012d, B:78:0x00c2, B:80:0x00c8, B:82:0x00cd, B:84:0x00d1, B:85:0x00da, B:87:0x00de, B:89:0x0136, B:91:0x0140), top: B:27:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149 A[Catch: all -> 0x0180, TryCatch #0 {, blocks: (B:28:0x0067, B:30:0x0071, B:32:0x0077, B:41:0x007b, B:43:0x0087, B:45:0x008d, B:47:0x0097, B:48:0x0099, B:50:0x00a4, B:52:0x00aa, B:53:0x00b8, B:55:0x00f3, B:57:0x011a, B:59:0x0121, B:60:0x0123, B:64:0x012a, B:67:0x0149, B:68:0x0158, B:71:0x015e, B:73:0x0162, B:74:0x014f, B:76:0x0153, B:77:0x012d, B:78:0x00c2, B:80:0x00c8, B:82:0x00cd, B:84:0x00d1, B:85:0x00da, B:87:0x00de, B:89:0x0136, B:91:0x0140), top: B:27:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f A[Catch: all -> 0x0180, TryCatch #0 {, blocks: (B:28:0x0067, B:30:0x0071, B:32:0x0077, B:41:0x007b, B:43:0x0087, B:45:0x008d, B:47:0x0097, B:48:0x0099, B:50:0x00a4, B:52:0x00aa, B:53:0x00b8, B:55:0x00f3, B:57:0x011a, B:59:0x0121, B:60:0x0123, B:64:0x012a, B:67:0x0149, B:68:0x0158, B:71:0x015e, B:73:0x0162, B:74:0x014f, B:76:0x0153, B:77:0x012d, B:78:0x00c2, B:80:0x00c8, B:82:0x00cd, B:84:0x00d1, B:85:0x00da, B:87:0x00de, B:89:0x0136, B:91:0x0140), top: B:27:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c8 A[Catch: all -> 0x0180, TryCatch #0 {, blocks: (B:28:0x0067, B:30:0x0071, B:32:0x0077, B:41:0x007b, B:43:0x0087, B:45:0x008d, B:47:0x0097, B:48:0x0099, B:50:0x00a4, B:52:0x00aa, B:53:0x00b8, B:55:0x00f3, B:57:0x011a, B:59:0x0121, B:60:0x0123, B:64:0x012a, B:67:0x0149, B:68:0x0158, B:71:0x015e, B:73:0x0162, B:74:0x014f, B:76:0x0153, B:77:0x012d, B:78:0x00c2, B:80:0x00c8, B:82:0x00cd, B:84:0x00d1, B:85:0x00da, B:87:0x00de, B:89:0x0136, B:91:0x0140), top: B:27:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.AbstractC115105If r17, X.C1OP r18, X.C61252qn r19, long r20, boolean r22) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61252qn.A03(X.5If, X.1OP, X.2qn, long, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C1GL r5, final X.C61442r7 r6, final X.C1OP r7, final X.C61252qn r8, java.lang.Integer r9, final java.lang.Integer r10) {
        /*
            java.lang.String r3 = "ReelTrayManager.scheduleAndAddCallBack - fetchReason: "
            java.lang.String r2 = X.AbstractC25631Mt.A00(r10)
            java.lang.String r1 = " - cachePolciy: "
            java.lang.String r0 = X.AbstractC26181Oz.A00(r9)
            java.lang.String r1 = X.AnonymousClass001.A0u(r3, r2, r1, r0)
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L1e
            r0 = -643005538(0xffffffffd9ac839e, float:-6.0698013E15)
            X.C0fO.A01(r1, r0)
        L1e:
            java.lang.Integer r0 = X.C05F.A0C     // Catch: java.lang.Throwable -> L77
            r1 = 0
            if (r9 != r0) goto L24
            r1 = 1
        L24:
            boolean r0 = r7 instanceof X.C1P0     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L41
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L77
            if (r10 != r0) goto L3b
            X.3q6 r1 = r8.A01(r6, r7, r10, r1)     // Catch: java.lang.Throwable -> L77
        L30:
            X.1P0 r7 = (X.C1P0) r7     // Catch: java.lang.Throwable -> L77
            X.1Hw r0 = r7.A00     // Catch: java.lang.Throwable -> L77
            r0.A02(r1)     // Catch: java.lang.Throwable -> L77
        L37:
            r5.schedule(r0)     // Catch: java.lang.Throwable -> L77
            goto L6a
        L3b:
            X.5i9 r1 = new X.5i9     // Catch: java.lang.Throwable -> L77
            r1.<init>()     // Catch: java.lang.Throwable -> L77
            goto L30
        L41:
            java.lang.Integer r0 = X.C05F.A00     // Catch: java.lang.Throwable -> L77
            if (r10 != r0) goto L54
            X.4cT r2 = r8.A00(r6, r7, r10, r1)     // Catch: java.lang.Throwable -> L77
        L49:
            boolean r0 = r7 instanceof X.C98934cD     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L5a
            X.4cD r7 = (X.C98934cD) r7     // Catch: java.lang.Throwable -> L77
            X.1ON r0 = r7.A00     // Catch: java.lang.Throwable -> L77
            r0.A00 = r2     // Catch: java.lang.Throwable -> L77
            goto L37
        L54:
            X.5i8 r2 = new X.5i8     // Catch: java.lang.Throwable -> L77
            r2.<init>()     // Catch: java.lang.Throwable -> L77
            goto L49
        L5a:
            boolean r0 = r7 instanceof X.C98944cE     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L6a
            X.IlP r1 = new X.IlP     // Catch: java.lang.Throwable -> L77
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L77
            X.4cE r7 = (X.C98944cE) r7     // Catch: java.lang.Throwable -> L77
            X.MWI r0 = r7.A00     // Catch: java.lang.Throwable -> L77
            r0.A00 = r1     // Catch: java.lang.Throwable -> L77
            goto L37
        L6a:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L76
            r0 = -807082344(0xffffffffcfe4e698, float:-7.680635E9)
            X.C0fO.A00(r0)
        L76:
            return
        L77:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L84
            r0 = 1361186055(0x51220d07, float:4.3500204E10)
            X.C0fO.A00(r0)
        L84:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61252qn.A04(X.1GL, X.2r7, X.1OP, X.2qn, java.lang.Integer, java.lang.Integer):void");
    }

    public static final void A05(C1GL c1gl, C61442r7 c61442r7, C61252qn c61252qn, Integer num) {
        String A0R = AnonymousClass001.A0R("ReelTrayManager.fetchReelTrayFromCache - reason: ", AbstractC25631Mt.A00(num));
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0R, 966149794);
        }
        try {
            C24611Ie c24611Ie = c61442r7.A0H.A03.A01;
            c24611Ie.A01.A02("CACHED_STORIES_TRAY_START");
            c24611Ie.A00().Egh(C1IT.A07);
            c61252qn.A0B(c1gl, c61442r7, C05F.A0C, num);
            if (Systrace.A0E(1L)) {
                C0fO.A00(335990533);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1885127446);
            }
            throw th;
        }
    }

    public static final void A06(C1GL c1gl, C61442r7 c61442r7, C61252qn c61252qn, Integer num, Integer num2) {
        C1OP A00;
        String A0u = AnonymousClass001.A0u("ReelTrayManager.fetchReelTrayHeadloadSync - fetchReason: ", AbstractC25631Mt.A00(num2), " - cachePolicy: ", AbstractC26181Oz.A00(num));
        if (Systrace.A0E(1L)) {
            C0fO.A01(A0u, -1695724064);
        }
        try {
            C1OK c1ok = new C1OK();
            c61252qn.A06 = c1ok;
            UserSession userSession = c61252qn.A07;
            UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession2, 36317212663550918L)) {
                boolean A06 = C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36317212662830011L);
                C1OL c1ol = c1ok.A00;
                C1OU c1ou = C1OU.$redex_init_class;
                C14360o3.A0B(num, 1);
                C14360o3.A0B(num2, 2);
                if (!A06) {
                    A00 = C25401Lu.A05(c1ol, userSession, num, num2, null, false);
                } else {
                    A00 = C25401Lu.A06(c1ol, userSession, num, num2, null);
                }
                C14360o3.A0A(A00);
                C14360o3.A0A(A00);
            } else {
                A00 = IBJ.A00.A00(userSession, num, num2);
            }
            A04(c1gl, c61442r7, A00, c61252qn, num, num2);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-452673673);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(492959946);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.C61442r7 r5, boolean r6) {
        /*
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L10
            r1 = -1050524704(0xffffffffc16243e0, float:-14.141571)
            java.lang.String r0 = "ReelTrayManager.measureColdStartOnReelTrayResponseReady"
            X.C0fO.A01(r0, r1)
        L10:
            if (r6 == 0) goto L30
            if (r5 == 0) goto L46
            java.lang.String r0 = "STORIES_LOAD_FROM_DISK_FINISHED"
            X.C61442r7.A02(r5, r0)     // Catch: java.lang.Throwable -> L38
            X.1IP r0 = r5.A0H     // Catch: java.lang.Throwable -> L38
            X.1Id r0 = r0.A03     // Catch: java.lang.Throwable -> L38
            X.1Ie r2 = r0.A01     // Catch: java.lang.Throwable -> L38
            X.1IN r1 = r2.A01     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "CACHED_STORIES_TRAY_END"
            r1.A02(r0)     // Catch: java.lang.Throwable -> L38
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r2.A00()     // Catch: java.lang.Throwable -> L38
            X.1IT r0 = X.C1IT.A08     // Catch: java.lang.Throwable -> L38
            r1.Egh(r0)     // Catch: java.lang.Throwable -> L38
            goto L46
        L30:
            if (r5 == 0) goto L46
            r1 = 1
            r0 = 0
            r5.A05(r1, r0)     // Catch: java.lang.Throwable -> L38
            goto L46
        L38:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L45
            r0 = 335951540(0x140636b4, float:6.7760594E-27)
            X.C0fO.A00(r0)
        L45:
            throw r1
        L46:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L52
            r0 = -1640652198(0xffffffff9e35a25a, float:-9.615634E-21)
            X.C0fO.A00(r0)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61252qn.A07(X.2r7, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x039a, code lost:
    
        if (r6.isEmpty() != false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0357 A[Catch: all -> 0x05a0, TryCatch #0 {, blocks: (B:95:0x02d9, B:97:0x02e9, B:99:0x02ef, B:170:0x02f5, B:171:0x030a, B:173:0x0310, B:177:0x0323, B:180:0x0327, B:182:0x0336, B:184:0x033c, B:186:0x0346, B:188:0x0357, B:189:0x0368, B:191:0x0391, B:193:0x0395, B:196:0x039d, B:198:0x03c6, B:199:0x03cf, B:201:0x03d3, B:203:0x03d9, B:206:0x0404, B:208:0x0413, B:210:0x041b, B:212:0x0408, B:214:0x0410, B:215:0x03df, B:216:0x035c, B:217:0x0349, B:219:0x0353), top: B:94:0x02d9, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0391 A[Catch: all -> 0x05a0, TryCatch #0 {, blocks: (B:95:0x02d9, B:97:0x02e9, B:99:0x02ef, B:170:0x02f5, B:171:0x030a, B:173:0x0310, B:177:0x0323, B:180:0x0327, B:182:0x0336, B:184:0x033c, B:186:0x0346, B:188:0x0357, B:189:0x0368, B:191:0x0391, B:193:0x0395, B:196:0x039d, B:198:0x03c6, B:199:0x03cf, B:201:0x03d3, B:203:0x03d9, B:206:0x0404, B:208:0x0413, B:210:0x041b, B:212:0x0408, B:214:0x0410, B:215:0x03df, B:216:0x035c, B:217:0x0349, B:219:0x0353), top: B:94:0x02d9, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c6 A[Catch: all -> 0x05a0, TryCatch #0 {, blocks: (B:95:0x02d9, B:97:0x02e9, B:99:0x02ef, B:170:0x02f5, B:171:0x030a, B:173:0x0310, B:177:0x0323, B:180:0x0327, B:182:0x0336, B:184:0x033c, B:186:0x0346, B:188:0x0357, B:189:0x0368, B:191:0x0391, B:193:0x0395, B:196:0x039d, B:198:0x03c6, B:199:0x03cf, B:201:0x03d3, B:203:0x03d9, B:206:0x0404, B:208:0x0413, B:210:0x041b, B:212:0x0408, B:214:0x0410, B:215:0x03df, B:216:0x035c, B:217:0x0349, B:219:0x0353), top: B:94:0x02d9, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041b A[Catch: all -> 0x05a0, TRY_LEAVE, TryCatch #0 {, blocks: (B:95:0x02d9, B:97:0x02e9, B:99:0x02ef, B:170:0x02f5, B:171:0x030a, B:173:0x0310, B:177:0x0323, B:180:0x0327, B:182:0x0336, B:184:0x033c, B:186:0x0346, B:188:0x0357, B:189:0x0368, B:191:0x0391, B:193:0x0395, B:196:0x039d, B:198:0x03c6, B:199:0x03cf, B:201:0x03d3, B:203:0x03d9, B:206:0x0404, B:208:0x0413, B:210:0x041b, B:212:0x0408, B:214:0x0410, B:215:0x03df, B:216:0x035c, B:217:0x0349, B:219:0x0353), top: B:94:0x02d9, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x035c A[Catch: all -> 0x05a0, TryCatch #0 {, blocks: (B:95:0x02d9, B:97:0x02e9, B:99:0x02ef, B:170:0x02f5, B:171:0x030a, B:173:0x0310, B:177:0x0323, B:180:0x0327, B:182:0x0336, B:184:0x033c, B:186:0x0346, B:188:0x0357, B:189:0x0368, B:191:0x0391, B:193:0x0395, B:196:0x039d, B:198:0x03c6, B:199:0x03cf, B:201:0x03d3, B:203:0x03d9, B:206:0x0404, B:208:0x0413, B:210:0x041b, B:212:0x0408, B:214:0x0410, B:215:0x03df, B:216:0x035c, B:217:0x0349, B:219:0x0353), top: B:94:0x02d9, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.C1OP r47, X.C3LZ r48, X.C61252qn r49, int r50, long r51, boolean r53) {
        /*
            Method dump skipped, instructions count: 1457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61252qn.A08(X.1OP, X.3LZ, X.2qn, int, long, boolean):void");
    }

    public static final void A09(C3NO c3no, C61252qn c61252qn) {
        Integer num = c3no.A09;
        if (num != null) {
            c61252qn.A0L = num.intValue();
        }
        Integer num2 = c3no.A0A;
        if (num2 != null) {
            c61252qn.A0M = num2.intValue();
        }
        Integer num3 = c3no.A0B;
        if (num3 != null) {
            c61252qn.A0O = num3;
        }
    }

    public static final void A0A(C3NO c3no, C61252qn c61252qn) {
        C3NK c3nk = c3no.A03;
        if (c3nk != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(c61252qn.A07);
            Integer num = c3nk.A04;
            if (num != null) {
                int intValue = num.intValue();
                InterfaceC19610xo ARD = A00.A01.ARD();
                ARD.E7D("reel_tray_personalization_follow_count", intValue);
                ARD.apply();
            }
            Boolean bool = c3nk.A01;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                InterfaceC19610xo ARD2 = A00.A01.ARD();
                ARD2.E77("reel_tray_personalization_is_high_usage_likelihood", booleanValue);
                ARD2.apply();
            }
            Float f = c3nk.A03;
            if (f != null) {
                float floatValue = f.floatValue();
                InterfaceC19610xo ARD3 = A00.A01.ARD();
                ARD3.E7A("reel_tray_personalization_avg_core_sessions_per_day", floatValue);
                ARD3.apply();
            }
            Integer num2 = c3nk.A09;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                InterfaceC19610xo ARD4 = A00.A01.ARD();
                ARD4.E7D("reel_tray_personalization_warm_refresh_cooldown_s", intValue2);
                ARD4.apply();
            }
            Boolean bool2 = c3nk.A00;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                InterfaceC19610xo ARD5 = A00.A01.ARD();
                ARD5.E77("reel_tray_personalization_is_high_me_user", booleanValue2);
                ARD5.apply();
            }
            Integer num3 = c3nk.A05;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                InterfaceC19610xo ARD6 = A00.A01.ARD();
                ARD6.E7D("reel_tray_personalization_lness28_score", intValue3);
                ARD6.apply();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        if (X.C18U.A06(r6, X.AbstractC25351Lp.A00(r8).A00, 36325794009003396L) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0B(final X.C1GL r17, final X.C61442r7 r18, final java.lang.Integer r19, final java.lang.Integer r20) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61252qn.A0B(X.1GL, X.2r7, java.lang.Integer, java.lang.Integer):boolean");
    }

    public static final boolean A0C(C61252qn c61252qn, Integer num) {
        UserSession userSession = c61252qn.A07;
        UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        long A01 = C18U.A01(c06090Tz, userSession2, 36598966815362389L);
        if (A01 <= 0 || AbstractC001900j.A0a(C18U.A04(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36880441793642827L), AbstractC25631Mt.A01(num), false) || !C14360o3.A0K(AbstractC23021Ah.A00(userSession).A01.getString("last_stories_tray_fetch_reason", null), "BACKGROUND_PREFETCH") || System.currentTimeMillis() - AbstractC23021Ah.A00(userSession).A01.getLong("last_stories_tray_request_timestamp", -1L) > TimeUnit.SECONDS.toMillis(A01)) {
            return false;
        }
        return true;
    }

    public final void A0D() {
        UserSession userSession = this.A07;
        C1OU c1ou = C1OU.$redex_init_class;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("stories/hallpass/hallpass_info_pogs/");
        c25621Ms.A0S(C3DA.class, C3DD.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C1P1() { // from class: X.3DG
            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(253375898);
                C3DA c3da = (C3DA) obj;
                int A032 = C0f9.A03(131849863);
                C14360o3.A0B(c3da, 0);
                ReelStore A04 = C1OU.A04(C61252qn.this.A07);
                InterfaceC74673Xb interfaceC74673Xb = c3da.A00;
                if (interfaceC74673Xb == null) {
                    C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                    throw C00O.createAndThrow();
                }
                List<HallpassDetailsDict> list = ((C3XZ) interfaceC74673Xb).A00;
                A04.A04 = new ArrayList();
                for (HallpassDetailsDict hallpassDetailsDict : list) {
                    Reel reel = new Reel((C1NB) null, AnonymousClass001.A0R("election:hallpass", hallpassDetailsDict.BAt()), false);
                    reel.A08 = hallpassDetailsDict;
                    reel.A0r = hallpassDetailsDict.getName();
                    A04.A04.add(reel);
                }
                if (list.isEmpty()) {
                    C23031Ai A00 = AbstractC23021Ah.A00(A04.A09);
                    long currentTimeMillis = System.currentTimeMillis();
                    InterfaceC19610xo ARD = A00.A01.ARD();
                    ARD.E7G("group_stories_cold_fetch_last_time", currentTimeMillis);
                    ARD.apply();
                }
                AbstractC25651Mw.A00(A04.A09).A05(new C3DH(null, A04.A0U(false), -1, false));
                C0f9.A0A(652608870, A032);
                C0f9.A0A(829443683, A03);
            }
        };
        C1GJ.A03(A0N);
    }

    public final void A0E() {
        UserSession userSession = this.A07;
        C1OU c1ou = C1OU.$redex_init_class;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A06();
        c25621Ms.A0B(AbstractC111324zv.A00(3140));
        c25621Ms.A0S(EAI.class, FSU.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new ESQ(this);
        C1GJ.A03(A0N);
    }

    public final void A0F() {
        this.A0S.set(true);
        if (this.A0E) {
            if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(this.A07).A00, 36317212663026622L)) {
                return;
            }
        }
        C1OK c1ok = this.A06;
        if (c1ok == null) {
            return;
        }
        c1ok.A00();
    }

    public final boolean A0I() {
        if (!this.A0G && !this.A0H && !this.A0F) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC61272qp
    public final boolean CKt() {
        return this.A0I;
    }

    @Override // X.InterfaceC61272qp
    public final boolean CLg() {
        if (this.A0B == null || !(!r0.isEmpty())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC61272qp
    public final boolean CLh() {
        return !this.A0R.isEmpty();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        java.util.Set set;
        C61302qs c61302qs = this.A0P;
        synchronized (c61302qs.A01) {
            if (C18U.A06(C06090Tz.A05, c61302qs.A00, 36325695224296738L)) {
                set = c61302qs.A03;
            } else {
                set = c61302qs.A02;
            }
            set.clear();
        }
        C3AZ c3az = this.A08;
        if (c3az != null) {
            A0H(c3az);
        }
        this.A08 = null;
    }

    @Override // X.InterfaceC61272qp
    public final void AVA() {
        int i;
        long j;
        if (!A0I()) {
            ArrayList arrayList = this.A0R;
            if (!arrayList.isEmpty()) {
                this.A0H = true;
                Integer num = this.A0O;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = this.A0K;
                }
                final ArrayList arrayList2 = new ArrayList(arrayList.subList(0, Math.min(i, arrayList.size())));
                UserSession userSession = this.A07;
                List list = null;
                if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(userSession).A00, 36325794008282493L)) {
                    ReelStore A04 = C1OU.A04(userSession);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(A04.A0M((String) it.next()));
                    }
                    list = AbstractC001800i.A0X(arrayList3);
                }
                String str = this.A0A;
                ArrayList arrayList4 = this.A0Q;
                ReelStore A042 = C1OU.A04(userSession);
                synchronized (A042) {
                    j = 0;
                    Iterator it2 = A042.A03.A00.values().iterator();
                    while (it2.hasNext()) {
                        j = Math.max(j, ((Reel) it2.next()).A04);
                    }
                }
                String str2 = this.A09;
                C14360o3.A0B(arrayList4, 3);
                C25621Ms c25621Ms = new C25621Ms(userSession);
                c25621Ms.A09(C05F.A01);
                c25621Ms.A0B("feed/reels_tray/");
                c25621Ms.A02 = new C25581Mo(new C07510aQ(userSession), C25571Mn.class);
                String obj = UUID.randomUUID().toString();
                c25621Ms.A9s(TraceFieldType.RequestID, obj);
                c25621Ms.A9s("tray_session_id", str);
                ((AbstractC23721Ec) c25621Ms).A06 = EnumC23341Bw.CriticalAPI;
                Integer num2 = C05F.A0u;
                c25621Ms.A9s("reason", "pagination");
                c25621Ms.A9s("current_highest_ranked_position", String.valueOf(j));
                try {
                    c25621Ms.A9s("reel_ids_to_fetch", C85743s3.A01(arrayList2));
                    if (!arrayList4.isEmpty()) {
                        c25621Ms.A9s("head_load_delivered_ids", C85743s3.A01(arrayList4));
                    }
                    if (list != null) {
                        c25621Ms.A9s("latest_reel_media_by_id", C85743s3.A00(userSession, list));
                    }
                } catch (IOException e) {
                    C0K8.A0G("ReelApiUtil", "Failed to convert a collection to json", e);
                }
                c25621Ms.A0H("cursor", str2);
                C1ON A0N = c25621Ms.A0N();
                Integer num3 = C05F.A00;
                final C98934cD c98934cD = new C98934cD(A0N, num3, num2, num3, obj, str, arrayList2);
                C1ON c1on = c98934cD.A00;
                c1on.A00 = new C1P1() { // from class: X.6Q5
                    public long A00 = System.currentTimeMillis();

                    @Override // X.C1P1
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                        List list2;
                        int A03 = C0f9.A03(-784425243);
                        C3LZ c3lz = (C3LZ) obj2;
                        int A032 = C0f9.A03(1717322060);
                        C14360o3.A0B(c3lz, 0);
                        C61252qn c61252qn = this;
                        c61252qn.A0Q.clear();
                        c61252qn.A0I = false;
                        UserSession userSession2 = c61252qn.A07;
                        C1OS A00 = C1OR.A00(userSession2);
                        C1OP c1op = c98934cD;
                        A00.A0A(c1op, c3lz, -1);
                        List list3 = arrayList2;
                        long j2 = this.A00;
                        C3NO F7f = c3lz.F7f();
                        C1DS.A00(userSession2);
                        ArrayList arrayList5 = c61252qn.A0R;
                        arrayList5.removeAll(list3);
                        UserSession userSession3 = AbstractC25351Lp.A00(userSession2).A00;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession3, 36317491839702270L) && (list2 = F7f.A0H) != null && (!list2.isEmpty())) {
                            arrayList5.clear();
                            arrayList5.addAll(list2);
                        }
                        c61252qn.A09 = F7f.A0E;
                        ReelStore A043 = C1OU.A04(userSession2);
                        List A01 = AbstractC73333Qj.A01(userSession2, F7f);
                        List A002 = AbstractC73333Qj.A00(userSession2, F7f);
                        User A012 = C17060sy.A01.A01(userSession2);
                        List list4 = F7f.A0I;
                        if (list4 == null) {
                            list4 = C16930sl.A00;
                        }
                        synchronized (A043) {
                            C1N6 c1n6 = new C1N6();
                            UserSession userSession4 = A043.A09;
                            if (!C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession4).A00, 36317491838784755L)) {
                                ReelStore.A0E(A043.A03, A043, A002);
                            }
                            ReelStore.A0D(c1n6, A043, A012, A01, list4);
                            ReelStore.A02(A043, c1n6.A00.values(), true);
                            C1N6 c1n62 = A043.A03;
                            c1n62.A03(c1n6.A00());
                            for (String str3 : A043.A0C) {
                                Map map = A043.A0B;
                                if (map.containsKey(str3)) {
                                    ((List) map.get(str3)).addAll(c1n6.A00());
                                }
                            }
                            AbstractC25651Mw.A00(userSession4).A05(new C3DH(c1op, ReelStore.A07(A043, c1n62.A00()), -1, false));
                        }
                        C1OR.A00(userSession2).A08(c1op, -1);
                        C61252qn.A09(F7f, c61252qn);
                        c61252qn.A0P.DXg(System.currentTimeMillis() - j2);
                        c61252qn.A0D = false;
                        c61252qn.A0B = null;
                        C0f9.A0A(1534219533, A032);
                        C0f9.A0A(-2106204685, A03);
                    }

                    @Override // X.C1P1
                    public final void onFail(AbstractC115105If abstractC115105If) {
                        int i2;
                        int A03 = C0f9.A03(-102848349);
                        C14360o3.A0B(abstractC115105If, 0);
                        C61252qn c61252qn = this;
                        c61252qn.A0I = true;
                        C1OR.A00(c61252qn.A07).A06(abstractC115105If, c98934cD);
                        long j2 = this.A00;
                        C61302qs c61302qs = c61252qn.A0P;
                        long currentTimeMillis = System.currentTimeMillis() - j2;
                        C40791um c40791um = (C40791um) abstractC115105If.A00();
                        if (c40791um != null) {
                            i2 = c40791um.mStatusCode;
                        } else {
                            i2 = -1;
                        }
                        c61302qs.DXf(currentTimeMillis, i2);
                        C0f9.A0A(-816612856, A03);
                    }

                    @Override // X.C1P1
                    public final void onFinish() {
                        int A03 = C0f9.A03(290321296);
                        C61252qn c61252qn = this;
                        C1OR.A00(c61252qn.A07).A07(c98934cD);
                        c61252qn.A0H = false;
                        C0f9.A0A(1639281655, A03);
                    }

                    @Override // X.C1P1
                    public final void onStart() {
                        int A03 = C0f9.A03(-946863778);
                        super.onStart();
                        C1OR.A00(this.A07).A0C(c98934cD, null);
                        C0f9.A0A(577790257, A03);
                    }
                };
                C1GJ.A03(c1on);
            }
        }
    }

    @Override // X.InterfaceC61272qp
    public final void Co4() {
        if (!A0I()) {
            List list = null;
            if (this.A0D) {
                if (!C18U.A06(C06090Tz.A05, this.A07, 36329869931659830L)) {
                    return;
                }
            }
            ArrayList arrayList = this.A0B;
            if (arrayList != null && arrayList.isEmpty()) {
                return;
            }
            this.A0F = true;
            UserSession userSession = this.A07;
            if (arrayList != null) {
                list = AbstractC001800i.A0a(arrayList);
            }
            C1OU c1ou = C1OU.$redex_init_class;
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A09(C05F.A0N);
            c25621Ms.A0B("feed/stories_injection_tray/");
            c25621Ms.A0D(AbstractC111324zv.A00(494), (int) C18U.A01(C06090Tz.A05, userSession, 36611344908228878L));
            c25621Ms.A9s(AbstractC43591JPw.A00(199), "tray");
            c25621Ms.A9s("reason", "inventory_exhaustion");
            c25621Ms.A0S(C32134EAh.class, C34748FSn.class);
            if (list != null) {
                try {
                    c25621Ms.A9s(AbstractC111324zv.A00(516), C85743s3.A01(list));
                } catch (IOException e) {
                    C0K8.A0G("ReelApiUtil", "Failed to convert highlights IDs to be fetched to json", e);
                }
            }
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C32493ESt(this);
            C1GJ.A03(A0N);
        }
    }
}
