package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Iterator;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class IterableSerializer extends AsArraySerializerBase {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Iterable iterable = (Iterable) obj;
        Boolean bool = this.A05;
        if (((bool == null && AbstractC58321PtD.A1V(abstractC913345m)) || bool == Boolean.TRUE) && iterable != null) {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                it.next();
                if (!it.hasNext()) {
                    A0E(anonymousClass182, abstractC913345m, iterable);
                    return;
                }
            }
        }
        anonymousClass182.A0o(iterable);
        A0E(anonymousClass182, abstractC913345m, iterable);
        anonymousClass182.A0Z();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        return !((Iterable) obj).iterator().hasNext();
    }

    public final void A0E(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Iterable iterable) {
        JsonSerializer jsonSerializer;
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            AbstractC63023Sar abstractC63023Sar = this.A04;
            Class<?> cls = null;
            JsonSerializer jsonSerializer2 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    abstractC913345m.A0T(anonymousClass182);
                } else {
                    JsonSerializer jsonSerializer3 = this.A03;
                    if (jsonSerializer3 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            jsonSerializer2 = abstractC913345m.A0I(this.A01, cls2);
                            cls = cls2;
                        }
                        jsonSerializer = jsonSerializer2;
                    } else {
                        jsonSerializer = jsonSerializer2;
                        jsonSerializer2 = jsonSerializer3;
                    }
                    AbstractC58322PtE.A1K(anonymousClass182, jsonSerializer2, abstractC913345m, abstractC63023Sar, next);
                    jsonSerializer2 = jsonSerializer;
                }
            } while (it.hasNext());
        }
    }
}
