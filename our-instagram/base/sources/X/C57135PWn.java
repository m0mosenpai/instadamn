package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.pendingmedia.service.igapi.ConfigureMediaStep;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.pendingmedia.service.igapi.ConfigureMediaStep", f = "ConfigureMediaStep.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {163, 182}, m = "sendConfigureMediaRequestInternal", n = {"this", "uploadAttempt", "pendingMedia", "userSession", "logger", "shareTarget", "multiConfigShareType", "reliabilityLogger", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, "needMoreTime", "moreTimeRequestCount", "retryCooldownTime", "this", "uploadAttempt", "pendingMedia", "userSession", "logger", "shareTarget", "multiConfigShareType", "reliabilityLogger", OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, "configureHandler", "attemptId", "needMoreTime", "moreTimeRequestCount", "retryCooldownTime"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "I$1", "I$2"})
/* renamed from: X.PWn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57135PWn extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public Object A0E;
    public /* synthetic */ Object A0F;
    public final /* synthetic */ ConfigureMediaStep A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57135PWn(ConfigureMediaStep configureMediaStep, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0G = configureMediaStep;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A0F = obj;
        this.A03 |= Integer.MIN_VALUE;
        return ConfigureMediaStep.A01(null, this.A0G, this);
    }
}
