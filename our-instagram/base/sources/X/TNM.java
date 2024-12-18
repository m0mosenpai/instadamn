package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TNM implements Runnable {
    public final /* synthetic */ C62974SZu A00;
    public final /* synthetic */ SettableFuture A01;

    public TNM(C62974SZu c62974SZu, SettableFuture settableFuture) {
        this.A00 = c62974SZu;
        this.A01 = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C62974SZu c62974SZu = this.A00;
        C62974SZu.A00(c62974SZu);
        C63294Sgu c63294Sgu = S6L.A00;
        long j = c62974SZu.A01;
        SKI ski = c62974SZu.A05;
        Map map = c62974SZu.A02;
        if (map == null) {
            C14360o3.A0F("keysetHandles");
            throw C00O.createAndThrow();
        }
        C14360o3.A0B(ski, 1);
        SUU.A00 = 824186200;
        C006802i c006802i = SUU.A01;
        c006802i.markerStart(824186200);
        SUU.A00("get_encrypted_match_key_start");
        C51u A03 = c63294Sgu.A03(ski, C05F.A01, "www.meta.com", map, j);
        SUU.A00("get_encrypted_match_key_end");
        SUU.A00("get_encrypted_reports_start");
        C51u A01 = C63294Sgu.A01(A03, new C51u(null, null, null));
        SUU.A00("get_encrypted_reports_end");
        c006802i.markerEnd(SUU.A00, (short) 2);
        c62974SZu.A06.A00.add(AbstractC166987dD.A1L(Rg5.A04, A01));
        this.A01.set(A01);
    }
}
