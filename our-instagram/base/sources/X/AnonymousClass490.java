package X;

import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.quickpromotion.sdk.InstagramQpSdkModule", f = "InstagramQPSdkModule.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {247}, m = "choosePromotions", n = {"this", "userSession", "context", "triggerContext", "callback", "schedulerHelper", "qpUserFlowLogger", "fetchScope", "$this$choosePromotions_u24lambda_u242", "controllerManager", "destination$iv$iv", "surface"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$13"})
/* renamed from: X.490, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass490 extends C1Dq {
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
    public Object A0C;
    public Object A0D;
    public Object A0E;
    public /* synthetic */ Object A0F;
    public final /* synthetic */ InstagramQpSdkModule A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass490(InstagramQpSdkModule instagramQpSdkModule, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0G = instagramQpSdkModule;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A0F = obj;
        this.A00 |= Integer.MIN_VALUE;
        return InstagramQpSdkModule.A00(null, null, null, null, null, null, this.A0G, null, this, null);
    }
}
