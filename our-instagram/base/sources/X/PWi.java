package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper", f = "ConfigureAsyncHelper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {StringTreeSet.PAYLOAD_MASK, 75}, m = "pollingConfigureStatus", n = {"module", "uploadAttempt", "pendingMedia", "userSession", "shareTarget", "configureHandler", "reliabilityLogger", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, "moreTimeRequestCount", "retryIntervalTimeMs", "retryMaxCount", "module", "uploadAttempt", "pendingMedia", "userSession", "shareTarget", "configureHandler", "reliabilityLogger", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, "needMoreTime", "moreTimeRequestCount", "retryIntervalTimeMs", "retryMaxCount"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "J$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "J$0", "I$2"})
/* loaded from: classes9.dex */
public final class PWi extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public /* synthetic */ Object A0D;
    public final /* synthetic */ ConfigureAsyncHelper A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWi(ConfigureAsyncHelper configureAsyncHelper, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0E = configureAsyncHelper;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A0D = obj;
        this.A03 |= Integer.MIN_VALUE;
        return ConfigureAsyncHelper.A00(null, null, this.A0E, this);
    }
}
