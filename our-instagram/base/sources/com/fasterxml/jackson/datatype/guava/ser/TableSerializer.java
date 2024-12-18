package com.fasterxml.jackson.datatype.guava.ser;

import X.AbstractC166987dD;
import X.AbstractC58322PtE;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C16R;
import X.C46K;
import X.C910844k;
import X.InterfaceC65620ToB;
import X.RD5;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.lang.reflect.Modifier;
import java.util.Map;

/* loaded from: classes10.dex */
public class TableSerializer extends ContainerSerializer implements C46K {
    public final InterfaceC65620ToB A00;
    public final AbstractC910944l A01;
    public final JsonSerializer A02;
    public final JsonSerializer A03;
    public final JsonSerializer A04;
    public final AbstractC63023Sar A05;
    public final MapSerializer A06;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        anonymousClass182.A0F(null);
        abstractC63023Sar.A02(anonymousClass182, abstractC63023Sar.A04(C16R.A0D, null));
        throw AbstractC166987dD.A15("rowMap");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        anonymousClass182.A0p(null);
        throw AbstractC166987dD.A15("isEmpty");
    }

    public TableSerializer(AbstractC63023Sar abstractC63023Sar, TableSerializer tableSerializer) {
        super(((StdSerializer) tableSerializer).A00, false);
        this.A01 = tableSerializer.A01;
        this.A00 = tableSerializer.A00;
        this.A03 = tableSerializer.A03;
        this.A02 = tableSerializer.A02;
        this.A05 = abstractC63023Sar;
        this.A04 = tableSerializer.A04;
        this.A06 = tableSerializer.A06;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        throw AbstractC166987dD.A15("isEmpty");
    }

    @Override // X.C46K
    public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
        JsonSerializer A0b;
        JsonSerializer A0b2;
        JsonSerializer jsonSerializer = this.A04;
        if (jsonSerializer == null) {
            AbstractC910944l A0a = AbstractC58322PtE.A0a(this.A01, 2);
            if (Modifier.isFinal(A0a.A00.getModifiers())) {
                jsonSerializer = abstractC913345m.A0E(interfaceC65620ToB, A0a);
            }
        } else {
            jsonSerializer = AbstractC58322PtE.A0b(interfaceC65620ToB, jsonSerializer, abstractC913345m, jsonSerializer instanceof C46K ? 1 : 0);
        }
        JsonSerializer jsonSerializer2 = this.A03;
        if (jsonSerializer2 == null) {
            A0b = abstractC913345m.A0C(interfaceC65620ToB, AbstractC58322PtE.A0a(this.A01, 0));
        } else {
            A0b = AbstractC58322PtE.A0b(interfaceC65620ToB, jsonSerializer2, abstractC913345m, jsonSerializer2 instanceof C46K ? 1 : 0);
        }
        JsonSerializer jsonSerializer3 = this.A02;
        if (jsonSerializer3 == null) {
            A0b2 = abstractC913345m.A0C(interfaceC65620ToB, AbstractC58322PtE.A0a(this.A01, 1));
        } else {
            A0b2 = AbstractC58322PtE.A0b(interfaceC65620ToB, jsonSerializer3, abstractC913345m, jsonSerializer3 instanceof C46K ? 1 : 0);
        }
        AbstractC63023Sar abstractC63023Sar = this.A05;
        if (abstractC63023Sar != null) {
            abstractC63023Sar = abstractC63023Sar.A05(interfaceC65620ToB);
        }
        return new TableSerializer(interfaceC65620ToB, A0b, A0b2, jsonSerializer, abstractC63023Sar, abstractC913345m.A05(), this);
    }

    public TableSerializer(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, JsonSerializer jsonSerializer3, AbstractC63023Sar abstractC63023Sar, C910844k c910844k, TableSerializer tableSerializer) {
        super(((StdSerializer) tableSerializer).A00, false);
        AbstractC910944l abstractC910944l = tableSerializer.A01;
        this.A01 = abstractC910944l;
        this.A00 = interfaceC65620ToB;
        this.A03 = jsonSerializer;
        this.A02 = jsonSerializer2;
        this.A05 = abstractC63023Sar;
        this.A04 = jsonSerializer3;
        RD5 A0B = c910844k.A0B(AbstractC58322PtE.A0a(abstractC910944l, 1), AbstractC58322PtE.A0a(abstractC910944l, 2), Map.class);
        this.A06 = MapSerializer.A04(c910844k.A0B(AbstractC58322PtE.A0a(abstractC910944l, 0), A0B, Map.class), jsonSerializer, MapSerializer.A04(A0B, jsonSerializer2, jsonSerializer3, abstractC63023Sar, null, null, null, false), null, null, null, null, false);
    }

    public TableSerializer(AbstractC910944l abstractC910944l) {
        super(abstractC910944l);
        this.A01 = abstractC910944l;
        this.A00 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
    }
}
