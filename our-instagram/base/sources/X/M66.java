package X;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class M66 implements Runnable {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ C1336561u A01;
    public final /* synthetic */ C5KS A02;
    public final /* synthetic */ List A03;

    public M66(LK0 lk0, C1336561u c1336561u, C5KS c5ks, List list) {
        this.A02 = c5ks;
        this.A00 = lk0;
        this.A01 = c1336561u;
        this.A03 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        boolean z;
        C5KS c5ks = this.A02;
        boolean A0F = c5ks.A0F();
        LK0 lk0 = this.A00;
        if (A0F) {
            Object A06 = c5ks.A06();
            C14360o3.A07(A06);
            RetrieveBytesResponse retrieveBytesResponse = (RetrieveBytesResponse) A06;
            Iterator it = this.A03.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    RetrieveBytesResponse.BlockstoreData blockstoreData = (RetrieveBytesResponse.BlockstoreData) Collections.unmodifiableMap(retrieveBytesResponse.A00).get(next);
                    if (blockstoreData != null && (bArr = blockstoreData.A01) != null) {
                        z = C14360o3.A0K(next, "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY");
                        break;
                    }
                } else {
                    bArr = C1336561u.A03;
                    z = false;
                    break;
                }
            }
            lk0.A05(new C47500KyT(bArr, z));
            return;
        }
        lk0.A03();
    }
}
