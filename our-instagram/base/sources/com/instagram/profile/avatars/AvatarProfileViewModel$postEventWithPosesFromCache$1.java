package com.instagram.profile.avatars;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C152086st;
import X.C2JS;
import X.C31370Dqa;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.profile.avatars.AvatarProfileViewModel$postEventWithPosesFromCache$1", f = "AvatarProfileViewModel.kt", i = {}, l = {537}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AvatarProfileViewModel$postEventWithPosesFromCache$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ C152086st A01;
    public final /* synthetic */ C31370Dqa A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarProfileViewModel$postEventWithPosesFromCache$1(C152086st c152086st, C31370Dqa c31370Dqa, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A02 = c31370Dqa;
        this.A06 = z;
        this.A01 = c152086st;
        this.A05 = z2;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C31370Dqa c31370Dqa = this.A02;
        boolean z = this.A06;
        return new AvatarProfileViewModel$postEventWithPosesFromCache$1(this.A01, c31370Dqa, this.A03, this.A04, interfaceC23621Ds, z, this.A05);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.avatars.AvatarProfileViewModel$postEventWithPosesFromCache$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static AvatarCoinFlipSticker A00(C2JS c2js, Object obj) {
        return new AvatarCoinFlipSticker(String.valueOf(obj), c2js.getCoercedIntField(4, "margin_top"), c2js.getCoercedIntField(7, AbstractC111324zv.A00(1089)), c2js.getCoercedIntField(5, AbstractC111324zv.A00(1090)), c2js.getCoercedIntField(6, AbstractC111324zv.A00(1091)), c2js.getCoercedIntField(8, IgReactMediaPickerNativeModule.HEIGHT));
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarProfileViewModel$postEventWithPosesFromCache$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
