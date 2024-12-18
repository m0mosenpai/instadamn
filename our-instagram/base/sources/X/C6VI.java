package X;

import android.net.NetworkInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6VI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VI implements InterfaceC15680qO {
    public InterfaceC50418MNu A00;
    public final C6VG A01;
    public final C6VJ A02;
    public final AtomicReference A03;
    public final AtomicReference A04;
    public volatile int A05;

    public C6VI(C6VG c6vg) {
        C6VJ c6vj = new C6VJ(c6vg);
        this.A04 = new AtomicReference();
        this.A03 = new AtomicReference();
        this.A05 = 0;
        this.A01 = c6vg;
        this.A02 = c6vj;
    }

    public final Object A00() {
        boolean z;
        ListenableFuture submit;
        int i = this.A05;
        if (i == 2) {
            return this.A03.get();
        }
        if (i == 0) {
            A01();
            i = this.A05;
        }
        AtomicReference atomicReference = this.A04;
        Future future = (Future) atomicReference.get();
        if (future == null) {
            final C6VJ c6vj = this.A02;
            C6VG c6vg = this.A01;
            if (c6vg.A01 == null) {
                synchronized (c6vg) {
                    if (c6vg.A01 == null) {
                        c6vg.A01 = c6vg.A01();
                    }
                }
            }
            final C3LV c3lv = c6vg.A01;
            List list = C6VL.A01;
            if (list.contains(c3lv)) {
                submit = null;
            } else {
                list.add(c3lv);
                submit = C6VJ.A02.submit(new Callable() { // from class: X.6VM
                    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c1, code lost:
                    
                        if (r0.equals(r4) == false) goto L49;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final /* bridge */ /* synthetic */ java.lang.Object call() {
                        /*
                            r10 = this;
                            X.6VJ r7 = r2
                            X.6VH r6 = r7.A00
                            X.3LV r5 = r1
                            java.lang.String r4 = r5.A00
                            r3 = r6
                            X.6VG r3 = (X.C6VG) r3
                            X.6VO r1 = r3.A03()
                            if (r1 != 0) goto L7e
                            r8 = 0
                        L12:
                            r1 = 0
                            r2 = 1
                            if (r8 == 0) goto Ld9
                            r0 = 2
                            if (r8 == r2) goto Lce
                            if (r8 == r0) goto L61
                            r8 = 0
                        L1c:
                            java.util.List r0 = X.C6VL.A01
                            r0.remove(r5)
                            X.6VO r2 = r3.A03()
                            if (r2 == 0) goto L5f
                            java.lang.String r0 = r3.A05()
                            java.io.File r2 = r2.BoX(r0)
                            if (r2 == 0) goto L5f
                            X.6VK r0 = r3.A04()
                            r0.A00(r2)
                        L38:
                            java.lang.String r7 = "OLD"
                            java.lang.String r6 = "LATEST"
                            if (r2 != 0) goto L4d
                            java.lang.Class<X.6VJ> r3 = X.C6VJ.class
                            if (r8 != 0) goto L43
                            r7 = r6
                        L43:
                            java.lang.Object[] r2 = new java.lang.Object[]{r7}
                            java.lang.String r0 = "Unable to get file path for %s file"
                        L49:
                            X.C0K8.A0B(r3, r0, r2)
                            return r1
                        L4d:
                            boolean r0 = r2.isFile()
                            if (r0 != 0) goto Lc6
                            java.lang.Class<X.6VJ> r3 = X.C6VJ.class
                            if (r8 != 0) goto L58
                            r7 = r6
                        L58:
                            java.lang.Object[] r2 = new java.lang.Object[]{r7}
                            java.lang.String r0 = "File wasn't a file for %s file"
                            goto L49
                        L5f:
                            r2 = r1
                            goto L38
                        L61:
                            java.util.List r2 = X.C6VL.A00
                            boolean r0 = r2.contains(r5)
                            if (r0 != 0) goto L7c
                            boolean r0 = r6.A00()
                            if (r0 == 0) goto L7c
                            r2.add(r5)
                            X.3Qq r2 = X.C6VJ.A02
                            X.Au6 r0 = new X.Au6
                            r0.<init>(r5, r7)
                            r2.execute(r0)
                        L7c:
                            r8 = 1
                            goto L1c
                        L7e:
                            java.lang.String r0 = r3.A05()
                            java.io.File r0 = r1.BoX(r0)
                            if (r0 == 0) goto Lce
                            X.6VK r9 = r3.A04()
                            android.content.SharedPreferences r8 = r9.A01
                            if (r8 != 0) goto L9b
                            android.content.Context r2 = r9.A00
                            r1 = 0
                            java.lang.String r0 = "asset_preferences"
                            android.content.SharedPreferences r8 = r2.getSharedPreferences(r0, r1)
                            r9.A01 = r8
                        L9b:
                            X.95F r0 = r9.A03
                            if (r0 != 0) goto Lb1
                            java.lang.String r2 = "md5"
                            X.95F r1 = X.C95E.A04
                            java.lang.String r0 = r9.A04
                            X.95G r0 = r1.A00(r0)
                            X.95G r0 = r0.A00(r2)
                            X.95F r0 = (X.C95F) r0
                            r9.A03 = r0
                        Lb1:
                            java.lang.String r1 = r0.toString()
                            r0 = 0
                            java.lang.String r0 = r8.getString(r1, r0)
                            if (r0 == 0) goto Lc3
                            boolean r0 = r0.equals(r4)
                            r8 = 3
                            if (r0 != 0) goto L12
                        Lc3:
                            r8 = 2
                            goto L12
                        Lc6:
                            java.lang.String r0 = r5.A01
                            X.6VQ r1 = new X.6VQ
                            r1.<init>(r2, r0, r4, r8)
                            return r1
                        Lce:
                            r1 = 0
                            boolean r0 = r6.A00()
                            if (r0 == 0) goto Ld9
                            X.6VQ r1 = X.C6VJ.A00(r5, r7)
                        Ld9:
                            java.util.List r0 = X.C6VL.A01
                            r0.remove(r5)
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C6VM.call():java.lang.Object");
                    }
                });
            }
            if (C1EM.A00(null, submit, atomicReference)) {
                c6vj.A01 = this;
                C18150uz.A0B.A03(this);
            }
        } else if (future.isDone()) {
            try {
                C6VQ c6vq = (C6VQ) future.get();
                if (c6vq != null) {
                    Object AK1 = this.A01.A02().AK1(c6vq.A00);
                    AtomicReference atomicReference2 = this.A03;
                    synchronized (atomicReference2) {
                        if (i == this.A05) {
                            atomicReference2.set(AK1);
                            this.A05 = 2;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z && !c6vq.A01) {
                        C15670qN.A00(this);
                    }
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return this.A03.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r1.isFile() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r5 = this;
            int r0 = r5.A05
            if (r0 != 0) goto L6a
            X.6VJ r0 = r5.A02
            X.6VH r0 = r0.A00
            X.6VG r0 = (X.C6VG) r0
            X.6VK r3 = r0.A04()
            android.content.SharedPreferences r4 = r3.A01
            if (r4 != 0) goto L1d
            android.content.Context r2 = r3.A00
            r1 = 0
            java.lang.String r0 = "asset_preferences"
            android.content.SharedPreferences r4 = r2.getSharedPreferences(r0, r1)
            r3.A01 = r4
        L1d:
            X.95F r0 = r3.A02
            if (r0 != 0) goto L33
            java.lang.String r2 = "location"
            X.95F r1 = X.C95E.A04
            java.lang.String r0 = r3.A04
            X.95G r0 = r1.A00(r0)
            X.95G r0 = r0.A00(r2)
            X.95F r0 = (X.C95F) r0
            r3.A02 = r0
        L33:
            java.lang.String r0 = r0.toString()
            r3 = 0
            java.lang.String r0 = r4.getString(r0, r3)
            if (r0 == 0) goto L57
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L57
        L49:
            X.6VG r0 = r5.A01
            X.2mX r0 = r0.A02()
            java.lang.Object r2 = r0.AK1(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r5.A03
            monitor-enter(r1)
            goto L59
        L57:
            r1 = 0
            goto L49
        L59:
            int r0 = r5.A05     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L65
            r0 = 1
            r5.A05 = r0     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L65
            X.C1EM.A00(r3, r2, r1)     // Catch: java.lang.Throwable -> L67
        L65:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
            return
        L67:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L67
            throw r0
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6VI.A01():void");
    }

    @Override // X.InterfaceC15680qO
    public final void onConnectionChanged(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            if (networkInfo.getType() == 1 || networkInfo.getType() == 0) {
                AtomicReference atomicReference = this.A04;
                Future future = (Future) atomicReference.get();
                if (future != null && future.isDone()) {
                    try {
                        C6VQ c6vq = (C6VQ) future.get();
                        if ((c6vq == null || c6vq.A01) && C1EM.A00(future, null, atomicReference)) {
                            A00();
                        }
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
        }
    }

    public final boolean A02() {
        A01();
        if (this.A03.get() == null) {
            return false;
        }
        return true;
    }
}
