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

@DebugMetadata(c = "com.instagram.stickersearch.AvatarStickerInteractor$loadAvatarStickers$1", f = "AvatarStickerInteractor.kt", i = {0, 1, 1, 2, 2}, l = {67, 79, 83, 94, 106}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "stickerPackId", "$this$flow", "stickerPackId"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
public final class AvatarStickerInteractor$loadAvatarStickers$1 extends AbstractC23611Dp implements InterfaceC16620sF {
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
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarStickerInteractor$loadAvatarStickers$1(C51758Mth c51758Mth, EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, AvatarStickerInteractor avatarStickerInteractor, Integer num, Integer num2, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A06 = avatarStickerInteractor;
        this.A04 = enumC143276dS;
        this.A05 = enumC143286dT;
        this.A03 = c51758Mth;
        this.A0A = z;
        this.A07 = num;
        this.A08 = num2;
        this.A09 = str;
        this.A0B = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        AvatarStickerInteractor avatarStickerInteractor = this.A06;
        EnumC143276dS enumC143276dS = this.A04;
        EnumC143286dT enumC143286dT = this.A05;
        AvatarStickerInteractor$loadAvatarStickers$1 avatarStickerInteractor$loadAvatarStickers$1 = new AvatarStickerInteractor$loadAvatarStickers$1(this.A03, enumC143276dS, enumC143286dT, avatarStickerInteractor, this.A07, this.A08, this.A09, interfaceC23621Ds, this.A0A, this.A0B);
        avatarStickerInteractor$loadAvatarStickers$1.A02 = obj;
        return avatarStickerInteractor$loadAvatarStickers$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0113  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerInteractor$loadAvatarStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerInteractor$loadAvatarStickers$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
