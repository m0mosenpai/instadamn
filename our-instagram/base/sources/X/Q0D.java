package X;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class Q0D implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C63Q A01;
    public final /* synthetic */ C64517THk A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public Q0D(C63Q c63q, C64517THk c64517THk, String str, String str2, long j) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A02 = c64517THk;
        this.A01 = c63q;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str = this.A03;
        String A0R = AnonymousClass001.A0R("storeResponseForKey:", str);
        String str2 = this.A04;
        long j = this.A00;
        C64517THk c64517THk = this.A02;
        C63Q c63q = this.A01;
        try {
            C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryDiskCache", A0R, ':'));
            Q0H q0h = new Q0H(c64517THk, str2, j);
            ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(A0U);
            try {
                objectOutputStream.writeObject(q0h);
                objectOutputStream.close();
                byte[] byteArray = A0U.toByteArray();
                C14360o3.A07(byteArray);
                c63q.A01.A00.write(str, byteArray);
                Object obj = c63q.A05.get();
                C14360o3.A07(obj);
                C63Q.A00(c63q, AbstractC06930Yk.A0C(AbstractC06930Yk.A0B((Map) obj), AbstractC166987dD.A1L(str, new Q0C(c64517THk, j))));
                C1LN.A00();
                return C0eB.A00;
            } finally {
            }
        } catch (Throwable th) {
            C1LN.A00();
            throw th;
        }
    }
}
