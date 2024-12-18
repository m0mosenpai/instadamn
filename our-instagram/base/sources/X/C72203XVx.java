package X;

import com.facebook.msys.mci.EventLogSubscriber;
import com.facebook.msys.mci.EventLoggingData;
import com.facebook.msys.mci.NoOpAnalytics;

/* renamed from: X.XVx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72203XVx extends EventLogSubscriber {
    public final /* synthetic */ NoOpAnalytics A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72203XVx(NoOpAnalytics noOpAnalytics, String[] strArr) {
        super(1, strArr);
        this.A00 = noOpAnalytics;
    }

    @Override // com.facebook.msys.mci.EventLogSubscriber
    public final void onLogTalEvent(EventLoggingData eventLoggingData) {
    }
}
