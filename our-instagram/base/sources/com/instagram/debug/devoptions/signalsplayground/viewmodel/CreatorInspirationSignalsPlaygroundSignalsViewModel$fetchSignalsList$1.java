package com.instagram.debug.devoptions.signalsplayground.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C19L;
import X.C1JX;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalsViewModel$fetchSignalsList$1", f = "CreatorInspirationSignalsPlaygroundSignalsViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundSignalsViewModel$fetchSignalsList$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundSignalsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundSignalsViewModel$fetchSignalsList$1(CreatorInspirationSignalsPlaygroundSignalsViewModel creatorInspirationSignalsPlaygroundSignalsViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = creatorInspirationSignalsPlaygroundSignalsViewModel;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new CreatorInspirationSignalsPlaygroundSignalsViewModel$fetchSignalsList$1(this.this$0, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return new CreatorInspirationSignalsPlaygroundSignalsViewModel$fetchSignalsList$1(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC09560e7.A00(obj);
            } else {
                throw AbstractC166987dD.A13();
            }
        } else {
            AbstractC09560e7.A00(obj);
            CreatorInspirationSignalsPlaygroundRepository creatorInspirationSignalsPlaygroundRepository = this.this$0.repository;
            this.label = 1;
            if (creatorInspirationSignalsPlaygroundRepository.fetchSignals(this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
