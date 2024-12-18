package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC25226BEj;
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
import java.util.List;

@JacksonStdImpl
/* loaded from: classes10.dex */
public final class IndexedStringListSerializer extends StaticListSerializerBase {
    public static final IndexedStringListSerializer A00 = new IndexedStringListSerializer();

    public static final void A03(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, List list, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            try {
                String A1I = AbstractC25226BEj.A1I(list, i2);
                if (A1I == null) {
                    abstractC913345m.A0T(anonymousClass182);
                } else {
                    anonymousClass182.A0u(A1I);
                }
            } catch (Exception e) {
                StdSerializer.A02(abstractC913345m, list, e, i2);
                throw C00O.createAndThrow();
            }
        }
    }

    public IndexedStringListSerializer() {
        super(List.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        List list = (List) obj;
        SX7 A002 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0C, abstractC63023Sar, list);
        anonymousClass182.A0F(list);
        A03(anonymousClass182, abstractC913345m, list, list.size());
        abstractC63023Sar.A03(anonymousClass182, A002);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Boolean bool;
        List list = (List) obj;
        int size = list.size();
        if (size == 1 && (((bool = ((StaticListSerializerBase) this).A00) == null && AbstractC58321PtD.A1V(abstractC913345m)) || bool == Boolean.TRUE)) {
            A03(anonymousClass182, abstractC913345m, list, 1);
            return;
        }
        anonymousClass182.A0q(list, size);
        A03(anonymousClass182, abstractC913345m, list, size);
        anonymousClass182.A0Z();
    }
}
