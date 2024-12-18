package com.instagram.debug.devoptions.metadata.view;

import X.AbstractC52972be;
import X.C07N;
import X.C0YY;
import X.C52962bd;
import X.InterfaceC018407e;
import X.InterfaceC09390do;
import X.InterfaceC16820sZ;

/* loaded from: classes6.dex */
public final class ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$4 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InterfaceC16820sZ $extrasProducer;
    public final /* synthetic */ InterfaceC09390do $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$4(InterfaceC16820sZ interfaceC16820sZ, InterfaceC09390do interfaceC09390do) {
        super(0);
        this.$extrasProducer = interfaceC16820sZ;
        this.$owner$delegate = interfaceC09390do;
    }

    @Override // X.InterfaceC16820sZ
    public final AbstractC52972be invoke() {
        C07N c07n;
        AbstractC52972be abstractC52972be;
        InterfaceC16820sZ interfaceC16820sZ = this.$extrasProducer;
        if (interfaceC16820sZ == null || (abstractC52972be = (AbstractC52972be) interfaceC16820sZ.invoke()) == null) {
            InterfaceC018407e interfaceC018407e = (InterfaceC018407e) this.$owner$delegate.getValue();
            if ((interfaceC018407e instanceof C07N) && (c07n = (C07N) interfaceC018407e) != null) {
                return c07n.getDefaultViewModelCreationExtras();
            }
            return C52962bd.A00;
        }
        return abstractC52972be;
    }
}
