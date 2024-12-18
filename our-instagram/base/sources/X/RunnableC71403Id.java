package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.io.Closeables;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;

/* renamed from: X.3Id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC71403Id extends C19Q implements Runnable {
    public C3IK A03;
    public boolean A04;
    public long A05;
    public C26511Qg A06;
    public AbstractRunnableC14200nk A07;
    public final C26511Qg A08;
    public final C1QW A09;
    public final C1QY A0A;
    public final String A0B;
    public final /* synthetic */ C1H7 A0D;
    public InterfaceC27191Tt A01 = null;
    public C1Ef A02 = null;
    public long A00 = -1;
    public final AtomicInteger A0C = new AtomicInteger(0);

    public RunnableC71403Id(C26511Qg c26511Qg, C1QW c1qw, C1QY c1qy, C1H7 c1h7, long j) {
        this.A0D = c1h7;
        this.A09 = c1qw;
        this.A0A = c1qy;
        this.A08 = c26511Qg;
        this.A06 = new C26511Qg(null, c1qy);
        this.A0B = AnonymousClass001.A0b(c1qy.A04, "-copy", c1qw.hashCode());
        this.A05 = j;
    }

    public static void A00(final RunnableC71403Id runnableC71403Id) {
        runnableC71403Id.A0D.A03.ATO(new AbstractRunnableC14200nk() { // from class: X.3Ky
            {
                super(554, 2, false, false);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v21, types: [X.3JQ, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                C1QY c1qy;
                int i;
                RunnableC71403Id runnableC71403Id2 = RunnableC71403Id.this;
                C1H7 c1h7 = runnableC71403Id2.A0D;
                CacheBehaviorLogger cacheBehaviorLogger = c1h7.A01;
                C1QW c1qw = runnableC71403Id2.A09;
                cacheBehaviorLogger.markerPoint(c1qw, CacheBehaviorLogger.ATTEMPTED_CACHE);
                AtomicInteger atomicInteger = runnableC71403Id2.A0C;
                if (atomicInteger.compareAndSet(0, 1)) {
                    cacheBehaviorLogger.markerPoint(c1qw, CacheBehaviorLogger.SET_READ_MODE, String.valueOf(atomicInteger.get()));
                    cacheBehaviorLogger.markerAnnotate(c1qw, CacheBehaviorLogger.SOURCE, "cache");
                    cacheBehaviorLogger.markerEnd(c1qw, (short) 2);
                    C26511Qg c26511Qg = runnableC71403Id2.A08;
                    String str = runnableC71403Id2.A0B;
                    c1qy = runnableC71403Id2.A0A;
                    long j = runnableC71403Id2.A00;
                    try {
                        java.net.URI uri = c1qw.A09;
                        C18C.A07(uri.getPath(), "require a valid url");
                        C24301Gz c24301Gz = C24301Gz.A05;
                        String path = uri.getPath();
                        int hashCode = c1qw.hashCode();
                        C3IK c3ik = new C3IK(str);
                        c3ik.A05 = path;
                        c3ik.A00 = hashCode;
                        C3IZ A01 = c3ik.A01(c1qy.A00(), c24301Gz.A00, c24301Gz.A01, true);
                        Map map = c24301Gz.A02;
                        if (!map.containsKey(str)) {
                            map.put(str, c3ik);
                            ArrayList arrayList = new ArrayList(Collections.unmodifiableList(A01.A03));
                            arrayList.add(new C23781El("X-IG-ANDROID-FROM-DISK-READ-START_TIME", String.valueOf(j)));
                            int i2 = A01.A01;
                            String str2 = A01.A02;
                            int i3 = A01.A00;
                            ?? obj = new Object();
                            obj.A01 = i2;
                            obj.A02 = str2;
                            obj.A00 = i3;
                            obj.A03 = arrayList;
                            c26511Qg.A00(obj, c1qw);
                            ByteBuffer allocate = ByteBuffer.allocate(4096);
                            while (true) {
                                C24301Gz c24301Gz2 = C24301Gz.A05;
                                String path2 = uri.getPath();
                                Map map2 = c24301Gz2.A02;
                                C3IK c3ik2 = (C3IK) map2.get(str);
                                if (c3ik2 != null) {
                                    try {
                                        InterfaceC24271Gw interfaceC24271Gw = c24301Gz2.A00;
                                        try {
                                            if (c3ik2.A04 == null) {
                                                C59732oG AXI = interfaceC24271Gw.AXI(c3ik2.A0A);
                                                if (AXI.A00 != null) {
                                                    AbstractC60252p8 abstractC60252p8 = (AbstractC60252p8) AXI.A00();
                                                    c3ik2.A04 = abstractC60252p8;
                                                    c3ik2.A06 = new GZIPInputStream(abstractC60252p8);
                                                } else {
                                                    throw new IOException("Http Response Body file stream not available");
                                                }
                                            }
                                            C18C.A07(c3ik2.A06, "mGZIPInputStream should be initialized above");
                                            int read = c3ik2.A06.read(allocate.array());
                                            if (read <= 0) {
                                                c3ik2.A06.close();
                                                map2.remove(str);
                                                c26511Qg.A03(c1qw);
                                                break;
                                            } else {
                                                allocate.limit(read);
                                                allocate.rewind();
                                                c26511Qg.A05(c1qw, allocate);
                                                allocate.clear();
                                            }
                                        } catch (IOException e) {
                                            Closeables.A01(c3ik2.A06);
                                            throw e;
                                        }
                                    } catch (IOException e2) {
                                        map2.remove(str);
                                        throw e2;
                                    }
                                } else {
                                    throw new IllegalStateException(AnonymousClass001.A0R("ResponseBody not found when trying to read new buffer of data. Another concurrent request might be accessing it.", path2));
                                }
                            }
                        } else {
                            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Attempted to read a response that is already being read.  Failed entry: %s. Current Entry reading: %s.", c3ik, map.get(str));
                            C0w9.A03("HttpStore_ConcurentReading", formatStrLocaleSafe);
                            throw new IOException(formatStrLocaleSafe);
                        }
                    } catch (IOException e3) {
                        c26511Qg.A04(c1qw, e3);
                    }
                }
                new C3IK(runnableC71403Id2.A0B).A03(C24301Gz.A05.A00);
                C3IK c3ik3 = runnableC71403Id2.A03;
                C24211Gq c24211Gq = c1h7.A05;
                if (c24211Gq != null && c3ik3 != null) {
                    String str3 = c1qy.A04;
                    str3.getClass();
                    if (c1qy.A00() == C1Ef.OffScreen) {
                        i = 0;
                    } else {
                        i = -1;
                        if (c1qy.A00() == C1Ef.OnScreen) {
                            i = 1;
                        }
                    }
                    InterfaceC24271Gw interfaceC24271Gw2 = C24301Gz.A05.A00;
                    c24211Gq.A02(str3, null, 0, i, interfaceC24271Gw2.B2T(c3ik3.A0C) + interfaceC24271Gw2.B2T(c3ik3.A0A));
                }
                new C3IK(runnableC71403Id2.A0B).A03(C24301Gz.A05.A00);
            }
        });
    }

    @Override // X.C19Q, X.C19O
    public final void onFailed(C1QW c1qw, IOException iOException) {
        AtomicInteger atomicInteger = this.A0C;
        if (atomicInteger.get() == 2) {
            this.A08.A04(c1qw, iOException);
        } else {
            if (atomicInteger.get() != 0) {
                return;
            }
            AbstractRunnableC14200nk abstractRunnableC14200nk = this.A07;
            if (abstractRunnableC14200nk != null) {
                this.A0D.A04.A02(abstractRunnableC14200nk);
            }
            A00(this);
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
        if (this.A0C.get() == 2) {
            this.A08.A05(c1qw, byteBuffer);
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
        Integer num;
        if (c3jq.A01 == 304 && (((num = c1qy.A0C) == C05F.A0Y || num == C05F.A0j) && this.A0C.get() == 0)) {
            A00(this);
            return;
        }
        AtomicInteger atomicInteger = this.A0C;
        if (!atomicInteger.compareAndSet(0, 2)) {
            return;
        }
        this.A0D.A01.markerPoint(this.A09, CacheBehaviorLogger.SET_READ_MODE, String.valueOf(atomicInteger.get()));
        this.A08.A00(c3jq, c1qw);
    }

    @Override // X.C19Q, X.C19O
    public final void onSucceeded(C1QW c1qw) {
        if (this.A0C.get() == 2) {
            this.A0D.A01.markerPoint(this.A09, CacheBehaviorLogger.CACHE_TASK_DISPATCH_NETWORK_SUCCESS);
            this.A08.A03(c1qw);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1H7 c1h7 = this.A0D;
        C1QW c1qw = this.A09;
        C1H7.A00(c1qw, C05F.A01);
        this.A00 = System.currentTimeMillis();
        C1QY c1qy = this.A0A;
        String str = c1qy.A04;
        str.getClass();
        String str2 = this.A0B;
        C24301Gz c24301Gz = C24301Gz.A05;
        C3IK c3ik = new C3IK(str);
        C3IK c3ik2 = new C3IK(str2);
        InterfaceC24271Gw interfaceC24271Gw = c24301Gz.A00;
        if (!C3IK.A00(interfaceC24271Gw, c3ik.A0C, c3ik2.A0C) || !C3IK.A00(interfaceC24271Gw, c3ik.A0A, c3ik2.A0A)) {
            c3ik.A03(interfaceC24271Gw);
            c3ik2.A03(interfaceC24271Gw);
            c3ik2 = null;
        }
        this.A03 = c3ik2;
        switch (c1qy.A0C.intValue()) {
            case 0:
            case 1:
                throw new IllegalStateException("Not Supported cached policy");
            case 2:
            case 3:
                if (c3ik2 != null) {
                    A00(this);
                    return;
                } else {
                    this.A08.A04(c1qw, new IOException("no content"));
                    c1h7.A01.markerEnd(c1qw, (short) 3);
                    return;
                }
            case 4:
            case 5:
                if (c3ik2 != null) {
                    AbstractRunnableC14200nk abstractRunnableC14200nk = new AbstractRunnableC14200nk() { // from class: X.5SK
                        {
                            super(555);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            RunnableC71403Id.A00(RunnableC71403Id.this);
                        }
                    };
                    this.A07 = abstractRunnableC14200nk;
                    c1h7.A04.A01(abstractRunnableC14200nk, c1qy.A00);
                }
                C26511Qg c26511Qg = this.A06;
                c26511Qg.A01(this);
                C24301Gz.A05.A01(c26511Qg, c1qw, str);
                if (c1qw.A02) {
                    c1qw.A01("X-IG-Cache-Entry-Timestamp", String.valueOf(this.A05));
                }
                C1H7.A00(c1qw, C05F.A0C);
                c1h7.A01.markerPoint(c1qw, CacheBehaviorLogger.PASS_TO_NEXT_LAYER);
                InterfaceC27191Tt startRequest = c1h7.A02.startRequest(c1qw, c1qy, c26511Qg);
                this.A01 = startRequest;
                C1Ef c1Ef = this.A02;
                if (c1Ef != null) {
                    startRequest.FAL(c1Ef);
                }
                if (!this.A04) {
                    return;
                }
                this.A01.cancel();
                return;
            default:
                return;
        }
    }
}
