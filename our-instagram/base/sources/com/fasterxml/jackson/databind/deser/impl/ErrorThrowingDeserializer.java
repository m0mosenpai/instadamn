package com.fasterxml.jackson.databind.deser.impl;

import X.AnonymousClass469;
import X.C16L;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes10.dex */
public class ErrorThrowingDeserializer extends JsonDeserializer {
    public final Error A00;

    public ErrorThrowingDeserializer(NoClassDefFoundError noClassDefFoundError) {
        this.A00 = noClassDefFoundError;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        throw this.A00;
    }
}
