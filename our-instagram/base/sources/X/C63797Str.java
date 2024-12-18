package X;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Queue;

/* renamed from: X.Str, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63797Str implements InterfaceC65571Tn4 {
    public static final Bitmap.Config A08 = Bitmap.Config.ARGB_8888;
    public long A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public final C63172SeX A06;
    public final java.util.Set A07;

    private synchronized Bitmap A00(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        int intValue;
        if (config != Bitmap.Config.HARDWARE) {
            C63172SeX c63172SeX = this.A06;
            if (config != null) {
                config2 = config;
            } else {
                config2 = A08;
            }
            int A00 = C63375Sim.A00(config2, i, i2);
            QBF qbf = c63172SeX.A01;
            C63799Stt A002 = qbf.A00(config2, A00);
            if (Bitmap.Config.RGBA_F16.equals(config2)) {
                configArr = C63172SeX.A06;
            } else {
                int A06 = AbstractC58318PtA.A06(config2, S69.A00);
                if (A06 != 1) {
                    if (A06 != 2) {
                        if (A06 != 3) {
                            if (A06 != 4) {
                                configArr = new Bitmap.Config[]{config2};
                            } else {
                                configArr = C63172SeX.A03;
                            }
                        } else {
                            configArr = C63172SeX.A04;
                        }
                    } else {
                        configArr = C63172SeX.A07;
                    }
                } else {
                    configArr = C63172SeX.A05;
                }
            }
            int length = configArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Bitmap.Config config3 = configArr[i3];
                Integer num = (Integer) AbstractC58323PtF.A0y(config3, c63172SeX.A02).ceilingKey(Integer.valueOf(A00));
                if (num == null || (intValue = num.intValue()) > A00 * 8) {
                    i3++;
                } else if (intValue != A00 || config3 == null || !config3.equals(config2)) {
                    Queue queue = qbf.A00;
                    if (queue.size() < 20) {
                        queue.offer(A002);
                    }
                    A002 = qbf.A00(config3, intValue);
                }
            }
            bitmap = (Bitmap) c63172SeX.A00.A01(A002);
            if (bitmap != null) {
                C63172SeX.A00(bitmap, c63172SeX, Integer.valueOf(A002.A00));
                bitmap.reconfigure(i, i2, config2);
            }
            if (bitmap != null) {
                this.A02++;
                this.A05 -= C63375Sim.A01(bitmap);
                bitmap.setHasAlpha(true);
                bitmap.setPremultiplied(true);
            } else {
                if (android.util.Log.isLoggable("LruBitmapPool", 3)) {
                    C63375Sim.A00(config, i, i2);
                }
                this.A03++;
            }
            if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                C63375Sim.A00(config, i, i2);
            }
            android.util.Log.isLoggable("LruBitmapPool", 2);
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Cannot create a mutable Bitmap with config: ");
            A1C.append(config);
            throw AbstractC58320PtC.A0m(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions", A1C);
        }
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (android.util.Log.isLoggable("LruBitmapPool", 5) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        android.util.Log.w("LruBitmapPool", "Size mismatch, resetting");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r5.A05 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void A01(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
        L1:
            long r1 = r5.A05     // Catch: java.lang.Throwable -> L59
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L57
            X.SeX r1 = r5.A06     // Catch: java.lang.Throwable -> L59
            X.SPZ r0 = r1.A00     // Catch: java.lang.Throwable -> L59
            java.lang.Object r4 = r0.A00()     // Catch: java.lang.Throwable -> L59
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L45
            int r0 = X.C63375Sim.A01(r4)     // Catch: java.lang.Throwable -> L59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L59
            X.C63172SeX.A00(r4, r1, r0)     // Catch: java.lang.Throwable -> L59
            long r2 = r5.A05     // Catch: java.lang.Throwable -> L59
            int r0 = X.C63375Sim.A01(r4)     // Catch: java.lang.Throwable -> L59
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L59
            long r2 = r2 - r0
            r5.A05 = r2     // Catch: java.lang.Throwable -> L59
            int r0 = r5.A01     // Catch: java.lang.Throwable -> L59
            int r0 = r0 + 1
            r5.A01 = r0     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "LruBitmapPool"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L3d
            X.C63375Sim.A01(r4)     // Catch: java.lang.Throwable -> L59
            r4.getConfig()     // Catch: java.lang.Throwable -> L59
        L3d:
            r0 = 2
            android.util.Log.isLoggable(r1, r0)     // Catch: java.lang.Throwable -> L59
            r4.recycle()     // Catch: java.lang.Throwable -> L59
            goto L1
        L45:
            java.lang.String r1 = "LruBitmapPool"
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L53
            java.lang.String r0 = "Size mismatch, resetting"
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L59
        L53:
            r0 = 0
            r5.A05 = r0     // Catch: java.lang.Throwable -> L59
        L57:
            monitor-exit(r5)
            return
        L59:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63797Str.A01(long):void");
    }

    @Override // X.InterfaceC65571Tn4
    public final synchronized void E6v(Bitmap bitmap) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                if (bitmap.isMutable()) {
                    C63172SeX c63172SeX = this.A06;
                    long A01 = C63375Sim.A01(bitmap);
                    long j = this.A00;
                    if (A01 <= j && this.A07.contains(bitmap.getConfig())) {
                        int A012 = C63375Sim.A01(bitmap);
                        C63799Stt A00 = c63172SeX.A01.A00(bitmap.getConfig(), C63375Sim.A01(bitmap));
                        c63172SeX.A00.A02(A00, bitmap);
                        NavigableMap A0y = AbstractC58323PtF.A0y(bitmap.getConfig(), c63172SeX.A02);
                        Integer num = (Integer) AbstractC166997dE.A0m(A0y, A00.A00);
                        Integer valueOf = Integer.valueOf(A00.A00);
                        int i = 1;
                        if (num != null) {
                            i = 1 + num.intValue();
                        }
                        AbstractC37301Gc2.A1T(valueOf, A0y, i);
                        this.A04++;
                        this.A05 += A012;
                        if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                            C63375Sim.A01(bitmap);
                            bitmap.getConfig();
                        }
                        android.util.Log.isLoggable("LruBitmapPool", 2);
                        A01(j);
                    }
                }
                if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                    C63375Sim.A01(bitmap);
                    bitmap.getConfig();
                    bitmap.isMutable();
                    this.A07.contains(bitmap.getConfig());
                }
                bitmap.recycle();
            }
        } else {
            throw AbstractC166987dD.A15("Bitmap must not be null");
        }
    }

    public C63797Str(long j) {
        C63172SeX c63172SeX = new C63172SeX();
        HashSet A13 = AbstractC58319PtB.A13(Bitmap.Config.values());
        A13.add(null);
        A13.remove(Bitmap.Config.HARDWARE);
        java.util.Set unmodifiableSet = Collections.unmodifiableSet(A13);
        this.A00 = j;
        this.A06 = c63172SeX;
        this.A07 = unmodifiableSet;
    }

    @Override // X.InterfaceC65571Tn4
    public final void AHt() {
        android.util.Log.isLoggable("LruBitmapPool", 3);
        A01(0L);
    }

    @Override // X.InterfaceC65571Tn4
    public final void F8f(int i) {
        android.util.Log.isLoggable("LruBitmapPool", 3);
        if (i < 40 && i < 20) {
            if (i == 15) {
                A01(this.A00 / 2);
                return;
            }
            return;
        }
        AHt();
    }

    @Override // X.InterfaceC65571Tn4
    public final Bitmap AXA(int i, int i2, Bitmap.Config config) {
        Bitmap A00 = A00(i, i2, config);
        if (A00 != null) {
            A00.eraseColor(0);
            return A00;
        }
        if (config == null) {
            config = A08;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // X.InterfaceC65571Tn4
    public final Bitmap Axk(int i, int i2, Bitmap.Config config) {
        Bitmap A00 = A00(i, i2, config);
        if (A00 == null) {
            if (config == null) {
                config = A08;
            }
            return Bitmap.createBitmap(i, i2, config);
        }
        return A00;
    }
}
