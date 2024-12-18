package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class T4Y implements InterfaceC92354Bq {
    public static final long A06 = TimeUnit.MINUTES.toMillis(20);
    public long A00;
    public C4C7 A01;
    public C4C0 A02;
    public C2BC A03;
    public boolean A04;
    public final UserSession A05;

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        synchronized (this) {
            this.A03 = c2bc;
        }
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ void cancel() {
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        synchronized (this) {
            C4C0 c4c0 = this.A02;
            if (c4c0 != null) {
                c4c0.close();
            }
            C2BC c2bc = this.A03;
            if (c2bc != null) {
                C4C7 c4c7 = this.A01;
                C4C7 c4c72 = C4C7.A0B;
                if (c4c7 == null) {
                    c4c7 = C4C7.A0B;
                }
                c2bc.Dv9(this, c4c7, true);
            }
            this.A01 = null;
            this.A00 = 0L;
            this.A04 = false;
        }
    }

    @Override // X.InterfaceC92354Bq
    public final Map getResponseHeaders() {
        LinkedHashMap A1I;
        synchronized (this) {
            A1I = AbstractC166987dD.A1I();
            A1I.put("Content-Length", AbstractC16960so.A1N(String.valueOf(this.A00)));
        }
        return A1I;
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        android.net.Uri uri;
        synchronized (this) {
            C4C7 c4c7 = this.A01;
            if (c4c7 == null || (uri = c4c7.A06) == null) {
                uri = android.net.Uri.EMPTY;
            }
        }
        C14360o3.A09(uri);
        return uri;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.4C1, X.4C0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ps, java.lang.Object] */
    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        boolean z;
        Object obj;
        long open;
        C14360o3.A0B(c4c7, 0);
        android.net.Uri uri = c4c7.A06;
        C14360o3.A06(uri);
        String scheme = uri.getScheme();
        if (scheme != null) {
            z = scheme.equalsIgnoreCase("msys");
        } else {
            z = false;
        }
        if (z) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = c4c7;
                } else {
                    throw new C93214Fx(c4c7, "DataSource is already opened", 1004, 1);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            InterfaceC09390do interfaceC09390do = LKn.A05;
            AbstractC46712KlV.A00(this.A05).A04(new C64469TFf(countDownLatch, obj3, obj2), AbstractC166987dD.A19(uri));
            try {
                countDownLatch.await(A06, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                C0K8.A0C("ArmadilloExpressHttpDataSource", MSV.A00(798));
            }
            if (obj2.A00 == null && (obj = obj3.A00) != null) {
                android.net.Uri A0B = AbstractC25227BEk.A0B((String) obj);
                long j = c4c7.A03;
                if (j <= 0) {
                    j = -1;
                }
                int i = c4c7.A01;
                byte[] bArr = c4c7.A0A;
                Map map = c4c7.A09;
                long j2 = c4c7.A04;
                String str = c4c7.A08;
                int i2 = c4c7.A00;
                C4C6 c4c6 = c4c7.A07;
                long j3 = c4c7.A02 - j2;
                synchronized (this) {
                    ?? c4c1 = new C4C1(false);
                    this.A02 = c4c1;
                    C2BC c2bc = this.A03;
                    if (c2bc != null) {
                        c4c1.addTransferListener(c2bc);
                    }
                    C4C0 c4c0 = this.A02;
                    if (c4c0 == null) {
                        C14360o3.A0F("fileDataSource");
                        throw C00O.createAndThrow();
                    }
                    if (c4c6 == null) {
                        c4c6 = new C4C6();
                    }
                    open = c4c0.open(new C4C7(A0B, c4c6, str, map, bArr, i, i2, j3, j2, j));
                    this.A04 = true;
                    this.A00 = MSY.A06(A0B.getPath());
                }
                return open;
            }
            throw new C93214Fx(c4c7, "Download failed", 1001, 1);
        }
        throw new C93214Fx(c4c7, "Invalid uri", 1004, 1);
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        int read;
        synchronized (this) {
            C4C0 c4c0 = this.A02;
            if (c4c0 != null && this.A04) {
                read = c4c0.read(bArr, i, i2);
            } else {
                throw new C93214Fx(this.A01, "No downloaded file to read", 2005, 2);
            }
        }
        return read;
    }

    public T4Y(UserSession userSession) {
        this.A05 = userSession;
    }
}
