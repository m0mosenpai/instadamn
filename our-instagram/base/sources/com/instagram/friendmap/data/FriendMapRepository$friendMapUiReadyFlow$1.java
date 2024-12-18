package com.instagram.friendmap.data;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C92984Et;
import X.EnumC92974Es;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.friendmap.data.FriendMapRepository$friendMapUiReadyFlow$1", f = "FriendMapRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FriendMapRepository$friendMapUiReadyFlow$1 extends AbstractC23611Dp implements InterfaceC16600sD {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;

    public FriendMapRepository$friendMapUiReadyFlow$1(InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        FriendMapRepository$friendMapUiReadyFlow$1 friendMapRepository$friendMapUiReadyFlow$1 = new FriendMapRepository$friendMapUiReadyFlow$1((InterfaceC23621Ds) obj4);
        friendMapRepository$friendMapUiReadyFlow$1.A00 = obj;
        friendMapRepository$friendMapUiReadyFlow$1.A01 = obj2;
        friendMapRepository$friendMapUiReadyFlow$1.A02 = booleanValue;
        return friendMapRepository$friendMapUiReadyFlow$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        List list = (List) this.A00;
        C92984Et c92984Et = (C92984Et) this.A01;
        boolean z = this.A02;
        boolean z2 = true;
        if (!(!list.isEmpty()) || c92984Et.A04 == EnumC92974Es.A0A || !z) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
