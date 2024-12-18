package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer {
    @Override // com.fasterxml.jackson.databind.JsonDeserializer, X.InterfaceC102444jN
    public final Object AXq(AnonymousClass469 anonymousClass469) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return new AtomicReference(((ReferenceTypeDeserializer) this).A01.BXX(anonymousClass469));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, X.InterfaceC102444jN
    public final /* bridge */ /* synthetic */ Object BXX(AnonymousClass469 anonymousClass469) {
        return new AtomicReference(((ReferenceTypeDeserializer) this).A01.BXX(anonymousClass469));
    }
}
