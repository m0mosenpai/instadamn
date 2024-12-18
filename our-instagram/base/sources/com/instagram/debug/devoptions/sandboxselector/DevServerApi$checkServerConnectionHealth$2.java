package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C40791um;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.debug.devoptions.sandboxselector.IgServerHealth;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.DevServerApi$checkServerConnectionHealth$2", f = "DevServerApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class DevServerApi$checkServerConnectionHealth$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object L$0;
    public int label;

    public DevServerApi$checkServerConnectionHealth$2(InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        DevServerApi$checkServerConnectionHealth$2 devServerApi$checkServerConnectionHealth$2 = new DevServerApi$checkServerConnectionHealth$2(interfaceC23621Ds);
        devServerApi$checkServerConnectionHealth$2.L$0 = obj;
        return devServerApi$checkServerConnectionHealth$2;
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(IgServerHealthCheckResponse igServerHealthCheckResponse, InterfaceC23621Ds interfaceC23621Ds) {
        DevServerApi$checkServerConnectionHealth$2 devServerApi$checkServerConnectionHealth$2 = new DevServerApi$checkServerConnectionHealth$2(interfaceC23621Ds);
        devServerApi$checkServerConnectionHealth$2.L$0 = igServerHealthCheckResponse;
        return devServerApi$checkServerConnectionHealth$2.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AbstractC09560e7.A00(obj);
            int i = ((C40791um) this.L$0).mStatusCode;
            if (i == 200) {
                return IgServerHealth.Healthy.INSTANCE;
            }
            return new IgServerHealth.Unhealthy(IgServerHealth.Unhealthy.UnhealthyReason.Companion.fromHttpStatusCode(i));
        }
        throw AbstractC166987dD.A13();
    }
}
