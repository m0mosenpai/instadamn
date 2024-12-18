package com.instagram.stickersearch;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C51758Mth;
import X.EnumC143276dS;
import X.EnumC143286dT;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.stickersearch.AvatarStickerInteractor$fetchFromNetworkRespository$1", f = "AvatarStickerInteractor.kt", i = {4, 5}, l = {126, 125, 135, 135, 142, 140, 160, 158, 176, 174}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes8.dex */
public final class AvatarStickerInteractor$fetchFromNetworkRespository$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C51758Mth A03;
    public final /* synthetic */ EnumC143276dS A04;
    public final /* synthetic */ EnumC143286dT A05;
    public final /* synthetic */ AvatarStickerInteractor A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarStickerInteractor$fetchFromNetworkRespository$1(C51758Mth c51758Mth, EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, AvatarStickerInteractor avatarStickerInteractor, Integer num, Integer num2, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A06 = avatarStickerInteractor;
        this.A0A = str;
        this.A0B = z;
        this.A05 = enumC143286dT;
        this.A04 = enumC143276dS;
        this.A07 = num;
        this.A08 = num2;
        this.A03 = c51758Mth;
        this.A09 = str2;
        this.A0C = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        AvatarStickerInteractor avatarStickerInteractor = this.A06;
        String str = this.A0A;
        boolean z = this.A0B;
        EnumC143286dT enumC143286dT = this.A05;
        AvatarStickerInteractor$fetchFromNetworkRespository$1 avatarStickerInteractor$fetchFromNetworkRespository$1 = new AvatarStickerInteractor$fetchFromNetworkRespository$1(this.A03, this.A04, enumC143286dT, avatarStickerInteractor, this.A07, this.A08, str, this.A09, interfaceC23621Ds, z, this.A0C);
        avatarStickerInteractor$fetchFromNetworkRespository$1.A02 = obj;
        return avatarStickerInteractor$fetchFromNetworkRespository$1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0158  */
    /* JADX WARN: Type inference failed for: r2v13, types: [X.1um, X.K8S] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerInteractor$fetchFromNetworkRespository$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerInteractor$fetchFromNetworkRespository$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
