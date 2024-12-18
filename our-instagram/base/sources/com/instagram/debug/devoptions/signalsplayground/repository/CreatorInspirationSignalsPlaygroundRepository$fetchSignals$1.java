package com.instagram.debug.devoptions.signalsplayground.repository;

import X.C1Dq;
import X.InterfaceC23621Ds;
import com.facebook.common.dextricks.StringTreeSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository", f = "CreatorInspirationSignalsPlaygroundRepository.kt", i = {0}, l = {StringTreeSet.PAYLOAD_MASK}, m = "fetchSignals", n = {"this"}, s = {"L$0"})
/* loaded from: classes7.dex */
public final class CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1 extends C1Dq {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundRepository$fetchSignals$1(CreatorInspirationSignalsPlaygroundRepository creatorInspirationSignalsPlaygroundRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.this$0 = creatorInspirationSignalsPlaygroundRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchSignals(this);
    }
}
