package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KZI extends C4A7 {
    public final LruCache A00;
    public final C47516Kyj A01;
    public final UserSession A02;
    public final C1DX A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KZI(UserSession userSession) {
        super("barcelona_permalink_prefetch", C4A8.A00(1751638608));
        C1DX A00 = C1DW.A00(userSession);
        C47516Kyj c47516Kyj = new C47516Kyj(AbstractC25225BEi.A0F(userSession), userSession);
        this.A02 = userSession;
        this.A03 = A00;
        this.A01 = c47516Kyj;
        this.A00 = new LruCache(30);
    }

    @Override // X.C4A7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.A00.evictAll();
    }
}
