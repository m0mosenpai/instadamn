package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class T7R implements C2Ju {
    public static final long A0F = AbstractC43593JPy.A09(TimeUnit.SECONDS);
    public final Context A00;
    public final Handler A01;
    public final C62645SKe A02;
    public final C62645SKe A03;
    public final C48492Kq A04;
    public final java.util.Set A05;
    public final java.util.Set A06;
    public final Executor A07;
    public final AtomicBoolean A08;
    public final AtomicReference A09;
    public final SC0 A0A;
    public final C2K8 A0B;
    public final C62850STx A0C;
    public final InterfaceC48462Kn A0D;
    public final File A0E;

    @Override // X.C2Ju
    public final C5KS AOV(List list) {
        N20 n20 = new N20(-5);
        C5KS c5ks = new C5KS();
        c5ks.A0C(n20);
        return c5ks;
    }

    @Override // X.C2Ju
    public final C5KS AOW(List list) {
        N20 n20 = new N20(-5);
        C5KS c5ks = new C5KS();
        c5ks.A0C(n20);
        return c5ks;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public T7R(Context context, C2K8 c2k8, C48492Kq c48492Kq, File file) {
        if (AbstractC61541RpL.A00 == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory) new Object());
            AbstractC61541RpL.A00 = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        ThreadPoolExecutor threadPoolExecutor2 = AbstractC61541RpL.A00;
        SC0 sc0 = new SC0(context);
        C62850STx c62850STx = C62850STx.A00;
        this.A01 = AbstractC167007dF.A0J();
        this.A09 = new AtomicReference();
        this.A05 = AbstractC58322PtE.A11();
        this.A06 = AbstractC58322PtE.A11();
        this.A08 = AbstractC166997dE.A17();
        this.A00 = context;
        this.A0E = file;
        this.A04 = c48492Kq;
        this.A0B = c2k8;
        this.A07 = threadPoolExecutor2;
        this.A0A = sc0;
        this.A0C = c62850STx;
        this.A03 = new C62645SKe();
        this.A02 = new C62645SKe();
        this.A0D = EnumC48452Km.A02;
    }

    private final C5KS A00(int i) {
        ArrayList A1E;
        RP1 rp1;
        synchronized (this) {
            AtomicReference atomicReference = this.A09;
            AbstractC62642SJz abstractC62642SJz = (AbstractC62642SJz) atomicReference.get();
            if (abstractC62642SJz == null) {
                rp1 = null;
            } else {
                RP1 rp12 = (RP1) abstractC62642SJz;
                int i2 = rp12.A00;
                long j = rp12.A03;
                long j2 = rp12.A04;
                ArrayList A01 = abstractC62642SJz.A01();
                List list = rp12.A07;
                if (list != null) {
                    A1E = AbstractC166987dD.A1F(list);
                } else {
                    A1E = AbstractC166987dD.A1E();
                }
                rp1 = new RP1(null, A01, A1E, null, i2, 6, i, j, j2);
            }
            while (!C1EM.A00(abstractC62642SJz, rp1, atomicReference) && atomicReference.get() == abstractC62642SJz) {
            }
        }
        N20 n20 = new N20(i);
        C5KS c5ks = new C5KS();
        c5ks.A0C(n20);
        return c5ks;
    }

    private final C62646SKf A01() {
        try {
            Context context = this.A00;
            C62646SKf A02 = this.A04.A02(((PackageItemInfo) context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo).metaData);
            if (A02 != null) {
                return A02;
            }
            throw AbstractC166987dD.A14("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("App is not found in PackageManager", e);
        }
    }

    public static final void A02(T7R t7r, Integer num, Long l, Long l2, List list, List list2, int i, int i2) {
        AbstractC62642SJz abstractC62642SJz;
        int intValue;
        long longValue;
        long longValue2;
        RP1 rp1;
        List list3 = list2;
        List list4 = list;
        synchronized (t7r) {
            AtomicReference atomicReference = t7r.A09;
            AbstractC62642SJz abstractC62642SJz2 = (AbstractC62642SJz) atomicReference.get();
            if (abstractC62642SJz2 == null) {
                abstractC62642SJz = new RP1(null, AbstractC166987dD.A1E(), AbstractC166987dD.A1E(), null, 0, 0, 0, 0L, 0L);
            } else {
                abstractC62642SJz = abstractC62642SJz2;
            }
            if (num == null) {
                intValue = ((RP1) abstractC62642SJz).A00;
            } else {
                intValue = num.intValue();
            }
            if (l == null) {
                longValue = ((RP1) abstractC62642SJz).A03;
            } else {
                longValue = l.longValue();
            }
            if (l2 == null) {
                longValue2 = ((RP1) abstractC62642SJz).A04;
            } else {
                longValue2 = l2.longValue();
            }
            if (list == null) {
                list4 = abstractC62642SJz.A01();
            }
            if (list2 == null) {
                List list5 = ((RP1) abstractC62642SJz).A07;
                if (list5 != null) {
                    list3 = AbstractC166987dD.A1F(list5);
                } else {
                    list3 = AbstractC166987dD.A1E();
                }
            }
            rp1 = new RP1(null, list4, list3, null, intValue, i, i2, longValue, longValue2);
            while (true) {
                if (C1EM.A00(abstractC62642SJz2, rp1, atomicReference)) {
                    break;
                } else if (atomicReference.get() != abstractC62642SJz2) {
                    rp1 = null;
                    break;
                }
            }
        }
        if (rp1 != null) {
            t7r.A01.post(new RunnableC64652TOj(rp1, t7r));
        }
    }

    @Override // X.C2Ju
    public final C5KS AGW(int i) {
        int i2;
        ArrayList A1E;
        RP1 rp1;
        try {
            synchronized (this) {
                AtomicReference atomicReference = this.A09;
                AbstractC62642SJz abstractC62642SJz = (AbstractC62642SJz) atomicReference.get();
                if (abstractC62642SJz != null) {
                    try {
                        RP1 rp12 = (RP1) abstractC62642SJz;
                        if (i == rp12.A00 && ((i2 = rp12.A01) == 1 || i2 == 2 || i2 == 8 || i2 == 9 || i2 == 7)) {
                            int i3 = rp12.A02;
                            long j = rp12.A03;
                            long j2 = rp12.A04;
                            ArrayList A01 = abstractC62642SJz.A01();
                            List list = rp12.A07;
                            if (list != null) {
                                A1E = AbstractC166987dD.A1F(list);
                            } else {
                                A1E = AbstractC166987dD.A1E();
                            }
                            rp1 = new RP1(null, A01, A1E, null, i, 7, i3, j, j2);
                            while (true) {
                                if (C1EM.A00(abstractC62642SJz, rp1, atomicReference)) {
                                    break;
                                }
                                if (atomicReference.get() != abstractC62642SJz) {
                                    rp1 = null;
                                    break;
                                }
                            }
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new RuntimeException("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e2);
                    }
                }
                throw new N20(-3);
            }
            if (rp1 != null) {
                this.A01.post(new RunnableC64652TOj(rp1, this));
            }
            return AbstractC58319PtB.A0Y(null);
        } catch (TXT e3) {
            Exception A00 = e3.A00();
            C5KS c5ks = new C5KS();
            c5ks.A0C(A00);
            return c5ks;
        }
    }

    @Override // X.C2Ju
    public final C5KS Btp() {
        List emptyList;
        Object obj = this.A09.get();
        if (obj != null) {
            emptyList = Collections.singletonList(obj);
        } else {
            emptyList = Collections.emptyList();
        }
        return AbstractC58319PtB.A0Y(emptyList);
    }

    @Override // X.C2Ju
    public final void EDP(C2KM c2km) {
        C62645SKe c62645SKe = this.A03;
        synchronized (c62645SKe) {
            c62645SKe.A00.add(c2km);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0189, code lost:
    
        if (r1.contains(r8) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0207, code lost:
    
        if (r0 == null) goto L82;
     */
    @Override // X.C2Ju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5KS EnT(X.C58640PzD r29) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7R.EnT(X.PzD):X.5KS");
    }

    @Override // X.C2Ju
    public final java.util.Set BIV() {
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.addAll(this.A04.A03());
        A1H.addAll(this.A05);
        return A1H;
    }
}
