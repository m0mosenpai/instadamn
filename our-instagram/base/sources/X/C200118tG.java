package X;

import com.instagram.share.facebook.upsell.api.CLNoticeApi;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.share.facebook.upsell.api.CLNoticeApi", f = "CLNoticeApi.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {84, 109}, m = "fetchCXPNoticesWithLogging", n = {"this", "userSession", "entrypoints", "noticeEligibilityMetaData", "performanceLogger", "eligibilityCacheStateKey", "useEligibilityCache", "isPrefetch", "entrypoints", "performanceLogger", "eligibilityCacheStateKey", "eligibilityCache", "result", "useEligibilityCache"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
/* renamed from: X.8tG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200118tG extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public boolean A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ CLNoticeApi A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C200118tG(CLNoticeApi cLNoticeApi, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0A = cLNoticeApi;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A09 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A0A.A01(null, null, null, null, null, null, this, false, false);
    }
}
