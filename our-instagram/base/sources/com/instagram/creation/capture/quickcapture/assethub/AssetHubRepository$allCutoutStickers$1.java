package com.instagram.creation.capture.quickcapture.assethub;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C75B;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.assethub.AssetHubRepository$allCutoutStickers$1", f = "AssetHubRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class AssetHubRepository$allCutoutStickers$1 extends AbstractC23611Dp implements InterfaceC16600sD {
    public final /* synthetic */ C75B A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetHubRepository$allCutoutStickers$1(C75B c75b, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A00 = c75b;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new AssetHubRepository$allCutoutStickers$1(this.A00, (InterfaceC23621Ds) obj4).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        return C75B.A00(this.A00);
    }
}
