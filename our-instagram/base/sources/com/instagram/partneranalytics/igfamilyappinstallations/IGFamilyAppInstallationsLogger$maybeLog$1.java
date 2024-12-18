package com.instagram.partneranalytics.igfamilyappinstallations;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C2KY;
import X.InterfaceC16620sF;
import X.InterfaceC19610xo;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.partneranalytics.igfamilyappinstallations.IGFamilyAppInstallationsLogger$maybeLog$1", f = "IGFamilyAppInstallationsLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IGFamilyAppInstallationsLogger$maybeLog$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C2KY A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGFamilyAppInstallationsLogger$maybeLog$1(C2KY c2ky, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A01 = c2ky;
        this.A00 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new IGFamilyAppInstallationsLogger$maybeLog$1(this.A01, interfaceC23621Ds, this.A00);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IGFamilyAppInstallationsLogger$maybeLog$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        InterfaceC19610xo ARD = this.A01.A04.ARD();
        ARD.E7G("last_logging_time", this.A00);
        ARD.apply();
        return C0eB.A00;
    }
}
