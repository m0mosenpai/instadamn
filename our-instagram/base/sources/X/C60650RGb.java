package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* renamed from: X.RGb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60650RGb extends AbstractC1335861e implements TmP {
    public C58698Q1o A00;
    public Integer A02;
    public final Context A05;
    public final Looper A06;
    public final GoogleApiAvailability A07;
    public final C61U A08;
    public final SWF A09;
    public final C1340363l A0A;
    public final C63459Ske A0B;
    public final ArrayList A0C;
    public final Map A0D;
    public final Map A0E;
    public final Lock A0G;
    public final int A0H;
    public final HandlerC60673RLc A0J;
    public final InterfaceC1340963t A0K;
    public volatile boolean A0L;
    public InterfaceC65587TnR A01 = null;
    public final Queue A0F = AbstractC58318PtA.A11();
    public long A04 = 120000;
    public java.util.Set A03 = AbstractC166987dD.A1H();
    public final C62437SBq A0I = new C62437SBq();

    @Override // X.AbstractC1335861e
    public final Context A03() {
        return this.A05;
    }

    @Override // X.AbstractC1335861e
    public final Looper A04() {
        return this.A06;
    }

    @Override // X.TmP
    public final void FF1(int i, boolean z) {
        AtomicInteger atomicInteger;
        if (i == 1) {
            if (!this.A0L) {
                this.A0L = true;
                if (this.A00 == null) {
                    try {
                        this.A00 = this.A07.A05(this.A05.getApplicationContext(), new C60665RGt(this));
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC60673RLc handlerC60673RLc = this.A0J;
                handlerC60673RLc.sendMessageDelayed(handlerC60673RLc.obtainMessage(1), this.A04);
                handlerC60673RLc.sendMessageDelayed(handlerC60673RLc.obtainMessage(2), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.A09.A01.toArray(new BasePendingResult[0])) {
            basePendingResult.A08(SWF.A02);
        }
        C63459Ske c63459Ske = this.A0B;
        Handler handler = c63459Ske.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            handler.removeMessages(1);
            synchronized (c63459Ske.A03) {
                c63459Ske.A00 = true;
                ArrayList arrayList = c63459Ske.A05;
                ArrayList A1F = AbstractC166987dD.A1F(arrayList);
                atomicInteger = c63459Ske.A07;
                int i2 = atomicInteger.get();
                Iterator it = A1F.iterator();
                while (it.hasNext()) {
                    C69E c69e = (C69E) it.next();
                    if (!c63459Ske.A08 || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(c69e)) {
                        c69e.D7H(i);
                    }
                }
                c63459Ske.A04.clear();
                c63459Ske.A00 = false;
            }
            c63459Ske.A08 = false;
            atomicInteger.incrementAndGet();
            if (i == 2) {
                A01(this);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("onUnintentionalDisconnection must only be called on the Handler thread");
    }

    public static final void A01(C60650RGb c60650RGb) {
        c60650RGb.A0B.A08 = true;
        InterfaceC65587TnR interfaceC65587TnR = c60650RGb.A01;
        C3U5.A02(interfaceC65587TnR);
        interfaceC65587TnR.FFC();
    }

    public static /* bridge */ /* synthetic */ void A02(C60650RGb c60650RGb) {
        Lock lock = c60650RGb.A0G;
        lock.lock();
        try {
            if (c60650RGb.A0L) {
                A01(c60650RGb);
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // X.AbstractC1335861e
    public final InterfaceC1340663q A05(C61S c61s) {
        InterfaceC1340663q interfaceC1340663q = (InterfaceC1340663q) this.A0D.get(c61s);
        C3U5.A03(interfaceC1340663q, "Appropriate Api was not requested.");
        return interfaceC1340663q;
    }

    @Override // X.AbstractC1335861e
    public final AbstractC60658RGk A06(AbstractC60658RGk abstractC60658RGk) {
        String str;
        C61W c61w = abstractC60658RGk.A01;
        boolean containsKey = this.A0D.containsKey(abstractC60658RGk.A00);
        if (c61w != null) {
            str = c61w.A02;
        } else {
            str = "the API";
        }
        C3U5.A08(containsKey, AnonymousClass001.A0g("GoogleApiClient is not configured to use ", str, " required for this call."));
        Lock lock = this.A0G;
        lock.lock();
        try {
            InterfaceC65587TnR interfaceC65587TnR = this.A01;
            if (interfaceC65587TnR == null) {
                this.A0F.add(abstractC60658RGk);
            } else {
                interfaceC65587TnR.FF4(abstractC60658RGk);
            }
            return abstractC60658RGk;
        } finally {
            lock.unlock();
        }
    }

    @Override // X.AbstractC1335861e
    public final AbstractC60658RGk A07(AbstractC60658RGk abstractC60658RGk) {
        String str;
        Map map = this.A0D;
        C61W c61w = abstractC60658RGk.A01;
        boolean containsKey = map.containsKey(abstractC60658RGk.A00);
        if (c61w != null) {
            str = c61w.A02;
        } else {
            str = "the API";
        }
        C3U5.A08(containsKey, AnonymousClass001.A0g("GoogleApiClient is not configured to use ", str, " required for this call."));
        Lock lock = this.A0G;
        lock.lock();
        try {
            InterfaceC65587TnR interfaceC65587TnR = this.A01;
            if (interfaceC65587TnR != null) {
                if (this.A0L) {
                    Queue queue = this.A0F;
                    queue.add(abstractC60658RGk);
                    while (!queue.isEmpty()) {
                        AbstractC60658RGk abstractC60658RGk2 = (AbstractC60658RGk) queue.remove();
                        SWF swf = this.A09;
                        swf.A01.add(abstractC60658RGk2);
                        abstractC60658RGk2.A0B.set(swf.A00);
                        abstractC60658RGk2.A0A(Status.A06);
                    }
                } else {
                    abstractC60658RGk = interfaceC65587TnR.FF7(abstractC60658RGk);
                }
                return abstractC60658RGk;
            }
            throw AbstractC166987dD.A14("GoogleApiClient is not connected yet.");
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[Catch: all -> 0x01fc, Merged into TryCatch #0 {all -> 0x0201, all -> 0x01fc, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x003a, B:8:0x003f, B:89:0x01bb, B:116:0x01fd, B:117:0x0200, B:120:0x0017, B:122:0x001b, B:123:0x002c, B:125:0x0032, B:14:0x0056, B:16:0x0063, B:17:0x0069, B:19:0x006d, B:20:0x0075, B:22:0x007b, B:24:0x0094, B:29:0x00a1, B:30:0x00c2, B:32:0x00c8, B:35:0x00da, B:42:0x00e4, B:38:0x00e8, B:45:0x00ec, B:46:0x0103, B:48:0x0109, B:61:0x0117, B:51:0x011f, B:53:0x0125, B:57:0x01f5, B:58:0x01fb, B:64:0x012d, B:66:0x013c, B:68:0x014a, B:70:0x0159, B:71:0x014e, B:73:0x0156, B:76:0x015c, B:79:0x0164, B:80:0x01b6, B:81:0x0193, B:84:0x0185, B:86:0x018c, B:88:0x01b8, B:92:0x008c, B:107:0x01ea), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: all -> 0x01fc, Merged into TryCatch #0 {all -> 0x0201, all -> 0x01fc, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x003a, B:8:0x003f, B:89:0x01bb, B:116:0x01fd, B:117:0x0200, B:120:0x0017, B:122:0x001b, B:123:0x002c, B:125:0x0032, B:14:0x0056, B:16:0x0063, B:17:0x0069, B:19:0x006d, B:20:0x0075, B:22:0x007b, B:24:0x0094, B:29:0x00a1, B:30:0x00c2, B:32:0x00c8, B:35:0x00da, B:42:0x00e4, B:38:0x00e8, B:45:0x00ec, B:46:0x0103, B:48:0x0109, B:61:0x0117, B:51:0x011f, B:53:0x0125, B:57:0x01f5, B:58:0x01fb, B:64:0x012d, B:66:0x013c, B:68:0x014a, B:70:0x0159, B:71:0x014e, B:73:0x0156, B:76:0x015c, B:79:0x0164, B:80:0x01b6, B:81:0x0193, B:84:0x0185, B:86:0x018c, B:88:0x01b8, B:92:0x008c, B:107:0x01ea), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008c A[Catch: all -> 0x01fc, Merged into TryCatch #0 {all -> 0x0201, all -> 0x01fc, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x003a, B:8:0x003f, B:89:0x01bb, B:116:0x01fd, B:117:0x0200, B:120:0x0017, B:122:0x001b, B:123:0x002c, B:125:0x0032, B:14:0x0056, B:16:0x0063, B:17:0x0069, B:19:0x006d, B:20:0x0075, B:22:0x007b, B:24:0x0094, B:29:0x00a1, B:30:0x00c2, B:32:0x00c8, B:35:0x00da, B:42:0x00e4, B:38:0x00e8, B:45:0x00ec, B:46:0x0103, B:48:0x0109, B:61:0x0117, B:51:0x011f, B:53:0x0125, B:57:0x01f5, B:58:0x01fb, B:64:0x012d, B:66:0x013c, B:68:0x014a, B:70:0x0159, B:71:0x014e, B:73:0x0156, B:76:0x015c, B:79:0x0164, B:80:0x01b6, B:81:0x0193, B:84:0x0185, B:86:0x018c, B:88:0x01b8, B:92:0x008c, B:107:0x01ea), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.01p, java.util.Map] */
    @Override // X.AbstractC1335861e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08() {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60650RGb.A08():void");
    }

    @Override // X.AbstractC1335861e
    public final void A09() {
        boolean z;
        Lock lock = this.A0G;
        lock.lock();
        try {
            java.util.Set set = this.A09.A01;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
                basePendingResult.A0B.set(null);
                synchronized (basePendingResult.A07) {
                    if (((AbstractC1335861e) basePendingResult.A08.get()) == null || !basePendingResult.A03) {
                        basePendingResult.A04();
                    }
                    z = basePendingResult.A02;
                }
                if (z) {
                    set.remove(basePendingResult);
                }
            }
            InterfaceC65587TnR interfaceC65587TnR = this.A01;
            if (interfaceC65587TnR != null) {
                interfaceC65587TnR.FFD();
            }
            java.util.Set<SGK> set2 = this.A0I.A00;
            for (SGK sgk : set2) {
                sgk.A02 = null;
                sgk.A01 = null;
            }
            set2.clear();
            Queue<AbstractC60658RGk> queue = this.A0F;
            for (AbstractC60658RGk abstractC60658RGk : queue) {
                abstractC60658RGk.A0B.set(null);
                abstractC60658RGk.A04();
            }
            queue.clear();
            if (this.A01 != null) {
                A0H();
                C63459Ske c63459Ske = this.A0B;
                c63459Ske.A08 = false;
                c63459Ske.A07.incrementAndGet();
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // X.AbstractC1335861e
    public final void A0A() {
        InterfaceC65587TnR interfaceC65587TnR = this.A01;
        if (interfaceC65587TnR != null) {
            interfaceC65587TnR.FFF();
        }
    }

    @Override // X.AbstractC1335861e
    public final void A0B(C69E c69e) {
        this.A0B.A00(c69e);
    }

    @Override // X.AbstractC1335861e
    public final void A0C(C69E c69e) {
        C63459Ske c63459Ske = this.A0B;
        C3U5.A02(c69e);
        synchronized (c63459Ske.A03) {
            if (!c63459Ske.A05.remove(c69e)) {
                android.util.Log.w("GmsClientEvents", AnonymousClass001.A0g("unregisterConnectionCallbacks(): listener ", String.valueOf(c69e), " not found"));
            } else if (c63459Ske.A00) {
                c63459Ske.A04.add(c69e);
            }
        }
    }

    @Override // X.AbstractC1335861e
    public final void A0D(C69G c69g) {
        this.A0B.A01(c69g);
    }

    @Override // X.AbstractC1335861e
    public final boolean A0F() {
        InterfaceC65587TnR interfaceC65587TnR = this.A01;
        if (interfaceC65587TnR != null && interfaceC65587TnR.FFG()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1335861e
    public final boolean A0G(InterfaceC65249Tgf interfaceC65249Tgf) {
        InterfaceC65587TnR interfaceC65587TnR = this.A01;
        if (interfaceC65587TnR != null && interfaceC65587TnR.FFH(interfaceC65249Tgf)) {
            return true;
        }
        return false;
    }

    public final boolean A0H() {
        boolean z = false;
        if (this.A0L) {
            this.A0L = false;
            HandlerC60673RLc handlerC60673RLc = this.A0J;
            handlerC60673RLc.removeMessages(2);
            z = true;
            handlerC60673RLc.removeMessages(1);
            C58698Q1o c58698Q1o = this.A00;
            if (c58698Q1o != null) {
                c58698Q1o.A00();
                this.A00 = null;
            }
        }
        return z;
    }

    @Override // X.TmP
    public final void FEw(ConnectionResult connectionResult) {
        AtomicInteger atomicInteger;
        if (!GooglePlayServicesUtil.A00(this.A05, connectionResult.A01)) {
            A0H();
        }
        if (!this.A0L) {
            C63459Ske c63459Ske = this.A0B;
            Handler handler = c63459Ske.A01;
            if (Looper.myLooper() == handler.getLooper()) {
                handler.removeMessages(1);
                synchronized (c63459Ske.A03) {
                    ArrayList arrayList = c63459Ske.A06;
                    ArrayList A1F = AbstractC166987dD.A1F(arrayList);
                    atomicInteger = c63459Ske.A07;
                    int i = atomicInteger.get();
                    Iterator it = A1F.iterator();
                    while (it.hasNext()) {
                        C69G c69g = (C69G) it.next();
                        if (!c63459Ske.A08 || atomicInteger.get() != i) {
                            break;
                        } else if (arrayList.contains(c69g)) {
                            c69g.D7D(connectionResult);
                        }
                    }
                }
                c63459Ske.A08 = false;
                atomicInteger.incrementAndGet();
                return;
            }
            throw AbstractC166987dD.A14("onConnectionFailure must only be called on the Handler thread");
        }
    }

    @Override // X.TmP
    public final void FEz(Bundle bundle) {
        while (true) {
            Queue queue = this.A0F;
            if (queue.isEmpty()) {
                break;
            } else {
                A07((AbstractC60658RGk) queue.remove());
            }
        }
        C63459Ske c63459Ske = this.A0B;
        Handler handler = c63459Ske.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            synchronized (c63459Ske.A03) {
                if (!c63459Ske.A00) {
                    handler.removeMessages(1);
                    c63459Ske.A00 = true;
                    ArrayList arrayList = c63459Ske.A04;
                    if (arrayList.isEmpty()) {
                        ArrayList A1F = AbstractC166987dD.A1F(c63459Ske.A05);
                        AtomicInteger atomicInteger = c63459Ske.A07;
                        int i = atomicInteger.get();
                        Iterator it = A1F.iterator();
                        while (it.hasNext()) {
                            C69E c69e = (C69E) it.next();
                            if (!c63459Ske.A08 || !c63459Ske.A02.isConnected() || atomicInteger.get() != i) {
                                break;
                            } else if (!arrayList.contains(c69e)) {
                                c69e.D75(bundle);
                            }
                        }
                        arrayList.clear();
                        c63459Ske.A00 = false;
                    } else {
                        throw AbstractC58318PtA.A0Z();
                    }
                } else {
                    throw AbstractC58318PtA.A0Z();
                }
            }
            return;
        }
        throw AbstractC166987dD.A14("onConnectionSuccess must only be called on the Handler thread");
    }

    public static int A00(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            InterfaceC1340663q interfaceC1340663q = (InterfaceC1340663q) it.next();
            z2 |= interfaceC1340663q.requiresSignIn();
            z3 |= interfaceC1340663q.E6l();
        }
        if (z2) {
            if (z3 && z) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    @Override // X.AbstractC1335861e
    public final void A0E(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.A05);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.A0L);
        printWriter.append(" mWorkQueue.size()=").print(this.A0F.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A09.A01.size());
        InterfaceC65587TnR interfaceC65587TnR = this.A01;
        if (interfaceC65587TnR != null) {
            interfaceC65587TnR.FFE(str, fileDescriptor, printWriter, strArr);
        }
    }

    public C60650RGb(Context context, Looper looper, GoogleApiAvailability googleApiAvailability, C61U c61u, C1340363l c1340363l, ArrayList arrayList, List list, List list2, Map map, Map map2, Lock lock, int i, int i2) {
        this.A02 = null;
        C64230T5f c64230T5f = new C64230T5f(this);
        this.A0K = c64230T5f;
        this.A05 = context;
        this.A0G = lock;
        this.A0B = new C63459Ske(looper, c64230T5f);
        this.A06 = looper;
        this.A0J = new HandlerC60673RLc(looper, this);
        this.A07 = googleApiAvailability;
        this.A0H = i;
        if (i >= 0) {
            this.A02 = Integer.valueOf(i2);
        }
        this.A0E = map;
        this.A0D = map2;
        this.A0C = arrayList;
        this.A09 = new SWF();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0B.A00((C69E) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.A0B.A01((C69G) it2.next());
        }
        this.A0A = c1340363l;
        this.A08 = c61u;
    }
}
