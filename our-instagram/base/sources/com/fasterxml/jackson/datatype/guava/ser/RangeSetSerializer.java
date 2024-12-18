package com.fasterxml.jackson.datatype.guava.ser;

import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C46K;
import X.C910844k;
import X.C911244o;
import X.InterfaceC65620ToB;
import X.SPS;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.Range;
import java.util.List;

/* loaded from: classes10.dex */
public class RangeSetSerializer extends JsonSerializer implements C46K {
    public AbstractC910944l A00;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        JsonSerializer A0K;
        SPS sps = (SPS) obj;
        AbstractC910944l abstractC910944l = this.A00;
        if (abstractC910944l == null) {
            A0K = abstractC913345m.A0N(List.class);
        } else {
            A0K = abstractC913345m.A0K(abstractC910944l);
        }
        A0K.A0A(anonymousClass182, abstractC913345m, sps.A00());
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object, com.fasterxml.jackson.datatype.guava.ser.RangeSetSerializer] */
    @Override // X.C46K
    public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
        if (interfaceC65620ToB == null) {
            return this;
        }
        ?? obj = new Object();
        C910844k A05 = abstractC913345m.A05();
        obj.A00 = A05.A0A(A05.A04(A05.A06(null, C911244o.A02(Range.class, new AbstractC910944l[]{interfaceC65620ToB.CBP().A07(0)}), Range.class)), List.class);
        return obj;
    }
}
