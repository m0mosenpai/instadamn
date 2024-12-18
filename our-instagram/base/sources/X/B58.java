package X;

import com.instagram.share.facebook.upsell.api.CLNoticeApi;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.share.facebook.upsell.api.CLNoticeApi", f = "CLNoticeApi.kt", i = {0, 0, 0, 0, 0, 0}, l = {265}, m = "syncUserInteractionStateToServer", n = {"entryPoint", "variant", "noticeInteractionType", "performanceLogger", "noticeVariant", "repository"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes4.dex */
public final class B58 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ CLNoticeApi A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B58(CLNoticeApi cLNoticeApi, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = cLNoticeApi;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A08.A00(null, null, null, null, null, this);
    }
}
