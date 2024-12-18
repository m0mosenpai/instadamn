package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC58321PtD;
import X.AbstractC913345m;
import X.AnonymousClass182;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.AbstractCollection;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class EnumSetSerializer extends AsArraySerializerBase {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Boolean bool;
        EnumSet enumSet = (EnumSet) obj;
        int size = enumSet.size();
        if (size == 1 && (((bool = this.A05) == null && AbstractC58321PtD.A1V(abstractC913345m)) || bool == Boolean.TRUE)) {
            A0E(anonymousClass182, abstractC913345m, enumSet);
            return;
        }
        anonymousClass182.A0q(enumSet, size);
        A0E(anonymousClass182, abstractC913345m, enumSet);
        anonymousClass182.A0Z();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        return ((AbstractCollection) obj).isEmpty();
    }

    public final void A0E(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, EnumSet enumSet) {
        JsonSerializer jsonSerializer = this.A03;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum r2 = (Enum) it.next();
            if (jsonSerializer == null) {
                jsonSerializer = abstractC913345m.A0G(this.A01, r2.getDeclaringClass());
            }
            jsonSerializer.A0A(anonymousClass182, abstractC913345m, r2);
        }
    }
}
