package X;

import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider", f = "FoaLiveEditingProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {121}, m = "initialize", n = {"this", "context", "container", "qplLogger", "benchmarkingKey", "onEventReceived", "fallbackLogicHandler", "liveEditingInitializationParameters", "richAvatarViewProvider", "cdlProviderHolder"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
/* renamed from: X.PWb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57130PWb extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public /* synthetic */ Object A0A;
    public final /* synthetic */ FoaLiveEditingProvider A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57130PWb(FoaLiveEditingProvider foaLiveEditingProvider, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0B = foaLiveEditingProvider;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A0A = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A0B.A00(null, null, null, null, null, null, this, false);
    }
}
