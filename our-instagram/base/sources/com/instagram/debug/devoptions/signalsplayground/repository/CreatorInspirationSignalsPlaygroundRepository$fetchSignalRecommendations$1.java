package com.instagram.debug.devoptions.signalsplayground.repository;

import X.C1Dq;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository", f = "CreatorInspirationSignalsPlaygroundRepository.kt", i = {0, 0, 0}, l = {116}, m = "fetchSignalRecommendations", n = {"this", "identifier", "userId"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
public final class CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1 extends C1Dq {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1(CreatorInspirationSignalsPlaygroundRepository creatorInspirationSignalsPlaygroundRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.this$0 = creatorInspirationSignalsPlaygroundRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchSignalRecommendations(null, null, this);
    }
}
