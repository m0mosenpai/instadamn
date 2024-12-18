package com.instagram.creation.drafts.model.datasource.clips;

import X.AbstractC09560e7;
import X.AbstractC209669Pc;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource$getTempCoverImage$2$1", f = "ClipsDraftLocalDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class ClipsDraftLocalDataSource$getTempCoverImage$2$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsDraftLocalDataSource$getTempCoverImage$2$1(String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A00 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ClipsDraftLocalDataSource$getTempCoverImage$2$1(this.A00, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ClipsDraftLocalDataSource$getTempCoverImage$2$1(this.A00, (InterfaceC23621Ds) obj2).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        return AbstractC209669Pc.A01(this.A00, 0L);
    }
}
