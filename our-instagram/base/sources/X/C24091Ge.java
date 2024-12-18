package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: X.1Ge, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24091Ge implements C1G4, C1G0 {
    public static final Pattern A0R = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public ScheduledFuture A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final C24131Gi A07;
    public final C23361By A08;
    public final C24151Gk A09;
    public final C23371Bz A0A;
    public final C24121Gh A0B;
    public final InterfaceC11560jF A0C;
    public final InterfaceC11580jH A0D;
    public final C24111Gg A0E;
    public final C1G4 A0F;
    public final AbstractC12990ll A0G;
    public final Object A0H;
    public final Object A0I;
    public final Map A0J;
    public final Map A0K;
    public final Map A0L;
    public final ScheduledExecutorService A0M;
    public final AtomicBoolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public volatile boolean A0Q;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        if (r15.A00() != X.C1Ef.OffScreen) goto L85;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0087. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2 A[Catch: all -> 0x01fd, LOOP:0: B:108:0x01bc->B:110:0x01c2, LOOP_END, TryCatch #4 {, blocks: (B:97:0x016a, B:99:0x016e, B:101:0x0183, B:103:0x019a, B:105:0x019f, B:106:0x01a5, B:107:0x01ad, B:108:0x01bc, B:110:0x01c2, B:112:0x01e4, B:114:0x01ea, B:115:0x01d1, B:117:0x01d5, B:119:0x01d9, B:121:0x01dd, B:122:0x0187), top: B:96:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ea A[Catch: all -> 0x01fd, TRY_LEAVE, TryCatch #4 {, blocks: (B:97:0x016a, B:99:0x016e, B:101:0x0183, B:103:0x019a, B:105:0x019f, B:106:0x01a5, B:107:0x01ad, B:108:0x01bc, B:110:0x01c2, B:112:0x01e4, B:114:0x01ea, B:115:0x01d1, B:117:0x01d5, B:119:0x01d9, B:121:0x01dd, B:122:0x0187), top: B:96:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.C1G4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC27191Tt startRequest(X.C1QW r14, X.C1QY r15, X.C26511Qg r16) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24091Ge.startRequest(X.1QW, X.1QY, X.1Qg):X.1Tt");
    }

    private final void A00(C89143yG c89143yG, boolean z) {
        C1QY c1qy;
        EnumC23341Bw enumC23341Bw;
        C59602o3 c59602o3;
        C24111Gg c24111Gg = this.A0E;
        Iterator it = c24111Gg.A03.iterator();
        while (it.hasNext()) {
            C89143yG c89143yG2 = (C89143yG) it.next();
            C14360o3.A07(c89143yG2);
            if (c89143yG2 == c89143yG) {
                InterfaceC11560jF interfaceC11560jF = this.A0C;
                if (interfaceC11560jF != null && (((enumC23341Bw = (c1qy = c89143yG2.A04).A09) == EnumC23341Bw.Image || enumC23341Bw == EnumC23341Bw.VideoCoverImage) && (c59602o3 = c1qy.A08) != null)) {
                    interfaceC11560jF.Cju(c59602o3.A00);
                }
                C26511Qg c26511Qg = c89143yG2.A02;
                C1QW c1qw = c89143yG2.A03;
                C14360o3.A06(c1qw);
                C1QY c1qy2 = c89143yG2.A04;
                C14360o3.A06(c1qy2);
                c26511Qg.A01(new C1RP(this, c1qw, c1qy2, z));
                c89143yG2.A01.A00 = this.A0F.startRequest(c1qw, c1qy2, c26511Qg);
                it.remove();
                C24101Gf c24101Gf = c24111Gg.A00;
                if (c24101Gf != null) {
                    c24101Gf.A00.A09.A00.decrementAndGet();
                }
                A01(c1qw, c1qy2, z, true);
            }
        }
    }

    private final void A01(C1QW c1qw, C1QY c1qy, boolean z, boolean z2) {
        List list;
        C24121Gh c24121Gh = this.A0B;
        if (z2) {
            if (z) {
                list = c24121Gh.A03;
            } else {
                list = c24121Gh.A02;
            }
            list.add(c1qw);
        }
        EnumC23341Bw enumC23341Bw = c1qy.A09;
        if (enumC23341Bw == EnumC23341Bw.Image || enumC23341Bw == EnumC23341Bw.VideoCoverImage) {
            c24121Gh.A00++;
        }
        if (c24121Gh.A04) {
            C9B3 c9b3 = c24121Gh.A01;
            c9b3.A06++;
            int ordinal = enumC23341Bw.ordinal();
            if (ordinal != 3 && ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal == 8) {
                        if (z) {
                            c9b3.A01++;
                            return;
                        } else {
                            c9b3.A00++;
                            return;
                        }
                    }
                    return;
                }
                if (z) {
                    c9b3.A05++;
                    return;
                } else {
                    c9b3.A04++;
                    return;
                }
            }
            if (z) {
                c9b3.A03++;
            } else {
                c9b3.A02++;
            }
        }
    }

    public static final boolean A02(C24091Ge c24091Ge, boolean z) {
        int i;
        int i2;
        if (!c24091Ge.A0A.A0B || !c24091Ge.A0N.get()) {
            long j = c24091Ge.A06;
            long j2 = c24091Ge.A05;
            AbstractC12990ll abstractC12990ll = c24091Ge.A0G;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, abstractC12990ll, 36324849115738644L)) {
                int A01 = (int) C18U.A01(c06090Tz, abstractC12990ll, 36606324092310971L);
                int A012 = (int) C18U.A01(c06090Tz, abstractC12990ll, 36606324092376508L);
                double A013 = C1BU.A00().A01() * 1024.0d;
                if (A013 > 0.0d) {
                    j = (long) ((A01 * A013) / 100.0d);
                    j2 = (long) ((A013 * A012) / 100.0d);
                }
            }
            if (!C1JN.A00) {
                C24121Gh c24121Gh = c24091Ge.A0B;
                int size = c24121Gh.A02.size() + c24121Gh.A03.size();
                if (z) {
                    i2 = c24091Ge.A02;
                } else {
                    i2 = c24091Ge.A01;
                }
                if (size < i2) {
                    return true;
                }
            } else {
                C24131Gi c24131Gi = c24091Ge.A07;
                long j3 = c24131Gi.A01.A00.get();
                long j4 = c24131Gi.A00.A00.get();
                long j5 = j3 + j4;
                if (z) {
                    i = ((j3 + Math.min(j4, j2)) > j ? 1 : ((j3 + Math.min(j4, j2)) == j ? 0 : -1));
                } else {
                    i = (j5 > j2 ? 1 : (j5 == j2 ? 0 : -1));
                }
                if (i < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A03() {
        LinkedList linkedList = this.A0E.A03;
        if (linkedList.size() != 0) {
            this.A0Q = true;
            while (A02(this, true) && linkedList.size() != 0) {
                C89143yG c89143yG = null;
                if (linkedList.size() <= 0) {
                    break;
                }
                List<C89143yG> unmodifiableList = Collections.unmodifiableList(linkedList);
                C14360o3.A07(unmodifiableList);
                int i = this.A0B.A00;
                boolean z = true;
                boolean z2 = false;
                if (i >= this.A04) {
                    z2 = true;
                }
                if (i < this.A03) {
                    z = false;
                }
                if (z2 || z) {
                    ArrayList arrayList = new ArrayList();
                    for (C89143yG c89143yG2 : unmodifiableList) {
                        C1QY c1qy = c89143yG2.A04;
                        EnumC23341Bw enumC23341Bw = c1qy.A09;
                        if ((enumC23341Bw != EnumC23341Bw.Image && enumC23341Bw != EnumC23341Bw.VideoCoverImage) || (!z2 && (C1RN.A00(c1qy) || !z))) {
                            arrayList.add(c89143yG2);
                        }
                    }
                    unmodifiableList = arrayList;
                }
                if (!(!unmodifiableList.isEmpty())) {
                    break;
                }
                C89143yG BE0 = ((C57892l2) C57892l2.A01.getValue()).BE0(unmodifiableList);
                C1QY c1qy2 = BE0.A04;
                C14360o3.A06(c1qy2);
                C89143yG c89143yG3 = BE0;
                if (C1RN.A00(c1qy2)) {
                    c89143yG3 = null;
                    c89143yG = BE0;
                }
                InterfaceC11580jH interfaceC11580jH = this.A0D;
                C4J0 c4j0 = c1qy2.A0A;
                C9BO c9bo = c1qy2.A02;
                if (interfaceC11580jH != null && c1qy2.A09 == EnumC23341Bw.Video && c4j0 != null && c9bo != null) {
                    interfaceC11580jH.CmD(c4j0.A07, (C09530e4) c9bo.A01, c9bo.A00);
                }
                if (c89143yG != null) {
                    A00(c89143yG, true);
                } else if (c89143yG3 == null || !A02(this, false)) {
                    break;
                } else {
                    A00(c89143yG3, false);
                }
            }
            this.A0Q = false;
        }
    }

    @Override // X.C1G0
    public final void EKd() {
        synchronized (this.A0I) {
            this.A0N.set(false);
            ScheduledFuture scheduledFuture = this.A00;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.A00 = null;
        }
        synchronized (this.A0H) {
            if (!this.A0Q) {
                A03();
            }
        }
    }

    @Override // X.C1G0
    public final void pause() {
        synchronized (this.A0I) {
            this.A0N.set(true);
            this.A00 = this.A0M.schedule(new D10(this), 15L, TimeUnit.SECONDS);
        }
    }

    public C24091Ge(C23371Bz c23371Bz, InterfaceC11560jF interfaceC11560jF, InterfaceC11580jH interfaceC11580jH, C1G4 c1g4, AbstractC12990ll abstractC12990ll) {
        this.A0G = abstractC12990ll;
        this.A0A = c23371Bz;
        Object obj = new Object();
        this.A0H = obj;
        this.A0E = new C24111Gg(new C24101Gf(this), obj);
        this.A0B = new C24121Gh(c23371Bz.A0C);
        this.A0F = c1g4;
        this.A0C = interfaceC11560jF;
        this.A0D = interfaceC11580jH;
        this.A06 = c23371Bz.A05 * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        this.A05 = c23371Bz.A04 * OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
        this.A02 = c23371Bz.A01;
        this.A01 = c23371Bz.A00;
        this.A04 = c23371Bz.A03;
        this.A03 = c23371Bz.A02;
        this.A0O = c23371Bz.A0D;
        this.A0P = c23371Bz.A0E;
        this.A08 = c23371Bz.A06;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        C14360o3.A07(synchronizedMap);
        this.A0K = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new HashMap());
        C14360o3.A07(synchronizedMap2);
        this.A0L = synchronizedMap2;
        Map synchronizedMap3 = Collections.synchronizedMap(new HashMap());
        C14360o3.A07(synchronizedMap3);
        this.A0J = synchronizedMap3;
        this.A07 = new C24131Gi();
        this.A09 = new C24151Gk();
        this.A0N = new AtomicBoolean(false);
        this.A0I = new Object();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        C14360o3.A07(scheduledThreadPoolExecutor);
        this.A0M = scheduledThreadPoolExecutor;
    }
}
