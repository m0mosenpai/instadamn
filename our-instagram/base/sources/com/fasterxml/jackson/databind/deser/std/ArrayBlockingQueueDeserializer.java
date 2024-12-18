package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC166987dD;
import X.AnonymousClass469;
import X.C16L;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes10.dex */
public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public final Collection A0x(C16L c16l, AnonymousClass469 anonymousClass469, Collection collection) {
        if (collection == null) {
            collection = AbstractC166987dD.A1E();
        }
        super.A0x(c16l, anonymousClass469, collection);
        if (collection.isEmpty()) {
            return new ArrayBlockingQueue(1, false);
        }
        return new ArrayBlockingQueue(collection.size(), false, collection);
    }
}
