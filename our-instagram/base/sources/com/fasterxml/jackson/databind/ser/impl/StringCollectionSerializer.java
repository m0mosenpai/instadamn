package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC166987dD;
import X.AbstractC58321PtD;
import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C00O;
import X.C16R;
import X.SX7;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Collection;
import java.util.Iterator;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class StringCollectionSerializer extends StaticListSerializerBase {
    public static final StringCollectionSerializer A00 = new StringCollectionSerializer();

    public static final void A03(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Collection collection) {
        int i = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (A1B == null) {
                    abstractC913345m.A0T(anonymousClass182);
                } else {
                    anonymousClass182.A0u(A1B);
                }
                i++;
            }
        } catch (Exception e) {
            StdSerializer.A02(abstractC913345m, collection, e, i);
            throw C00O.createAndThrow();
        }
    }

    public StringCollectionSerializer() {
        super(Collection.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        Collection collection = (Collection) obj;
        SX7 A002 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0C, abstractC63023Sar, collection);
        anonymousClass182.A0F(collection);
        A03(anonymousClass182, abstractC913345m, collection);
        abstractC63023Sar.A03(anonymousClass182, A002);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Boolean bool;
        Collection collection = (Collection) obj;
        int size = collection.size();
        if (size == 1 && (((bool = ((StaticListSerializerBase) this).A00) == null && AbstractC58321PtD.A1V(abstractC913345m)) || bool == Boolean.TRUE)) {
            A03(anonymousClass182, abstractC913345m, collection);
            return;
        }
        anonymousClass182.A0q(collection, size);
        A03(anonymousClass182, abstractC913345m, collection);
        anonymousClass182.A0Z();
    }
}
