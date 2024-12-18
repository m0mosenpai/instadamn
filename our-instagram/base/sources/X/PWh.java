package X;

import com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController", f = "CommonSparkAvatarPreviewController.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {123, BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE}, m = "initialize", n = {"this", "context", "container", "qplLogger", "onEventReceived", "liveEditingDataModel", "liveEditingInitializationParameters", "avatarEmbodimentSupport", "liveEditor", "fallbackLogicHandler", "$this$withLock_u24default$iv", "shouldRenderParametricsUsingLegacyAsset", "this", "liveEditingInitializationParameters", "liveEditor", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "Z$0", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes9.dex */
public final class PWh extends C1Dq {
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
    public Object A0A;
    public Object A0B;
    public boolean A0C;
    public /* synthetic */ Object A0D;
    public final /* synthetic */ CommonSparkAvatarPreviewController A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWh(CommonSparkAvatarPreviewController commonSparkAvatarPreviewController, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0E = commonSparkAvatarPreviewController;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A0D = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A0E.A00(null, null, null, null, null, null, null, null, null, this, false);
    }
}
