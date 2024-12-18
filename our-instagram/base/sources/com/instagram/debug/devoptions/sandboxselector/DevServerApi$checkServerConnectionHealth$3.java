package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09560e7;
import X.AbstractC115105If;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.DevServerApi$checkServerConnectionHealth$3", f = "DevServerApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class DevServerApi$checkServerConnectionHealth$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;

    public DevServerApi$checkServerConnectionHealth$3(InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new DevServerApi$checkServerConnectionHealth$3(interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj2;
        if (interfaceC23621Ds != null) {
            interfaceC23621Ds.getContext();
        }
        C0eB c0eB = C0eB.A00;
        AbstractC09560e7.A00(c0eB);
        return c0eB;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AbstractC09560e7.A00(obj);
            return C0eB.A00;
        }
        throw AbstractC166987dD.A13();
    }

    public final Object invoke(AbstractC115105If abstractC115105If, InterfaceC23621Ds interfaceC23621Ds) {
        if (interfaceC23621Ds != null) {
            interfaceC23621Ds.getContext();
        }
        C0eB c0eB = C0eB.A00;
        AbstractC09560e7.A00(c0eB);
        return c0eB;
    }
}
