package com.instagram.friendmap.data;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C44151JfG;
import X.C92984Et;
import X.C9Q1;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.friendmap.data.FriendMapRepository$friendMapNotesEntryPointFlow$1", f = "FriendMapRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FriendMapRepository$friendMapNotesEntryPointFlow$1 extends AbstractC23611Dp implements InterfaceC16600sD {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ FriendMapRepository A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendMapRepository$friendMapNotesEntryPointFlow$1(FriendMapRepository friendMapRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A03 = friendMapRepository;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        FriendMapRepository$friendMapNotesEntryPointFlow$1 friendMapRepository$friendMapNotesEntryPointFlow$1 = new FriendMapRepository$friendMapNotesEntryPointFlow$1(this.A03, (InterfaceC23621Ds) obj4);
        friendMapRepository$friendMapNotesEntryPointFlow$1.A00 = obj;
        friendMapRepository$friendMapNotesEntryPointFlow$1.A01 = obj2;
        friendMapRepository$friendMapNotesEntryPointFlow$1.A02 = obj3;
        return friendMapRepository$friendMapNotesEntryPointFlow$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        List list = (List) this.A00;
        C92984Et c92984Et = (C92984Et) this.A01;
        return new C9Q1(AbstractC001800i.A0g(list, new C44151JfG()), FriendMapRepository.A00(this.A03, c92984Et, list), (String) this.A02);
    }
}
