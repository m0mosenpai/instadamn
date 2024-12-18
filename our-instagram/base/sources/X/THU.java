package X;

import com.facebook.common.dextricks.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class THU implements Closeable {
    public static final ExecutorService A0N;
    public int A00;
    public int A01;
    public long A03;
    public boolean A0B;
    public final String A0C;
    public final Socket A0D;
    public final java.util.Set A0F;
    public final ScheduledExecutorService A0G;
    public final AbstractC61528Rp4 A0H;
    public final C65147TeM A0I;
    public final THS A0J;
    public final InterfaceC65607Tnw A0K;
    public final C62719SNj A0L;
    public final ExecutorService A0M;
    public final Map A0E = AbstractC166987dD.A1I();
    public long A07 = 0;
    public long A08 = 0;
    public long A04 = 0;
    public long A06 = 0;
    public long A02 = 0;
    public long A05 = 0;
    public long A09 = 0;
    public C62719SNj A0A = new C62719SNj();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = AbstractC63404SjZ.A07;
        A0N = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new TVC("OkHttp Http2Connection", true));
    }

    public THU(String str, Socket socket, AbstractC61528Rp4 abstractC61528Rp4, InterfaceC65607Tnw interfaceC65607Tnw, InterfaceC65700TsM interfaceC65700TsM, InterfaceC65701TsN interfaceC65701TsN, int i) {
        boolean z = true;
        C62719SNj c62719SNj = new C62719SNj();
        this.A0L = c62719SNj;
        this.A0F = AbstractC31171DnF.A0l();
        this.A0K = interfaceC65607Tnw;
        this.A0H = abstractC61528Rp4;
        this.A01 = 1;
        this.A01 = 3;
        this.A0A.A01(7, 16777216);
        this.A0C = str;
        byte[] bArr = AbstractC63404SjZ.A07;
        Locale locale = Locale.US;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new TVC(String.format(locale, "OkHttp %s Writer", str), false));
        this.A0G = scheduledThreadPoolExecutor;
        if (i != 0) {
            long j = i;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new C65142TeH(this), j, j, TimeUnit.MILLISECONDS);
        }
        this.A0M = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new TVC(String.format(locale, "OkHttp %s Push Observer", str), z));
        c62719SNj.A01(7, 65535);
        c62719SNj.A01(5, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        this.A03 = c62719SNj.A00();
        this.A0D = socket;
        this.A0J = new THS(interfaceC65700TsM);
        this.A0I = new C65147TeM(this, new THV(interfaceC65701TsN));
    }

    public static synchronized void A00(TM2 tm2, THU thu) {
        synchronized (thu) {
            if (!thu.A0B) {
                thu.A0M.execute(tm2);
            }
        }
    }

    public final synchronized C63029Sb0 A01(int i) {
        return (C63029Sb0) AbstractC166997dE.A0m(this.A0E, i);
    }

    public final synchronized C63029Sb0 A02(int i) {
        C63029Sb0 c63029Sb0;
        c63029Sb0 = (C63029Sb0) this.A0E.remove(Integer.valueOf(i));
        notifyAll();
        return c63029Sb0;
    }

    public final synchronized void A04(long j) {
        long j2 = this.A09 + j;
        this.A09 = j2;
        if (j2 >= this.A0A.A00() / 2) {
            try {
                this.A0G.execute(new C65150TeP(this, new Object[]{this.A0C, 0}, 0, j2));
            } catch (RejectedExecutionException unused) {
            }
            this.A09 = 0L;
        }
    }

    public final void A03(int i, Integer num) {
        try {
            this.A0G.execute(new C65149TeO(num, this, new Object[]{this.A0C, Integer.valueOf(i)}, i));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void A06(Integer num) {
        THS ths = this.A0J;
        synchronized (ths) {
            synchronized (this) {
                try {
                    if (!this.A0B) {
                        this.A0B = true;
                        int i = this.A00;
                        byte[] bArr = AbstractC63404SjZ.A07;
                        try {
                            if (!ths.A01) {
                                int A00 = AbstractC62284S5d.A00(num);
                                ths.A01((byte) 7, (byte) 0, 0, 8);
                                InterfaceC65700TsM interfaceC65700TsM = ths.A04;
                                interfaceC65700TsM.FEZ(i);
                                interfaceC65700TsM.FEZ(A00);
                                interfaceC65700TsM.flush();
                            } else {
                                throw AbstractC58321PtD.A0g();
                            }
                        } catch (Throwable th) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void A07(boolean z, int i, int i2) {
        try {
            THS ths = this.A0J;
            synchronized (ths) {
                if (!ths.A01) {
                    ths.A01((byte) 6, AbstractC167007dF.A1M(z ? 1 : 0) ? (byte) 1 : (byte) 0, 0, 8);
                    InterfaceC65700TsM interfaceC65700TsM = ths.A04;
                    interfaceC65700TsM.FEZ(i);
                    interfaceC65700TsM.FEZ(i2);
                    interfaceC65700TsM.flush();
                } else {
                    throw AbstractC58321PtD.A0g();
                }
            }
        } catch (IOException e) {
            Integer num = C05F.A01;
            A05(e, num, num);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        A05(null, C05F.A00, C05F.A0j);
    }

    public final void A05(IOException iOException, Integer num, Integer num2) {
        try {
            A06(num);
        } catch (IOException unused) {
        }
        C63029Sb0[] c63029Sb0Arr = null;
        synchronized (this) {
            Map map = this.A0E;
            if (!map.isEmpty()) {
                c63029Sb0Arr = (C63029Sb0[]) map.values().toArray(new C63029Sb0[map.size()]);
                map.clear();
            }
        }
        if (c63029Sb0Arr != null) {
            for (C63029Sb0 c63029Sb0 : c63029Sb0Arr) {
                try {
                    c63029Sb0.A04(iOException, num2);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.A0J.close();
        } catch (IOException unused3) {
        }
        try {
            this.A0D.close();
        } catch (IOException unused4) {
        }
        this.A0G.shutdown();
        this.A0M.shutdown();
    }
}
