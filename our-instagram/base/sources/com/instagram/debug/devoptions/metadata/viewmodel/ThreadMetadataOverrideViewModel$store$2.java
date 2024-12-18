package com.instagram.debug.devoptions.metadata.viewmodel;

import X.C0YY;
import X.InterfaceC16820sZ;
import com.instagram.debug.devoptions.metadata.store.ThreadMetadataOverrideStore;

/* loaded from: classes6.dex */
public final class ThreadMetadataOverrideViewModel$store$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ ThreadMetadataOverrideViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideViewModel$store$2(ThreadMetadataOverrideViewModel threadMetadataOverrideViewModel) {
        super(0);
        this.this$0 = threadMetadataOverrideViewModel;
    }

    @Override // X.InterfaceC16820sZ
    public final ThreadMetadataOverrideStore invoke() {
        return ThreadMetadataOverrideStore.Companion.getInstance(this.this$0.userSession);
    }
}
