package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C46K;
import X.C55I;
import X.C914045z;
import X.InterfaceC65620ToB;
import X.TmN;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes10.dex */
public class StdDelegatingSerializer extends StdSerializer implements C46K, C55I {
    public final TmN A00;
    public final AbstractC910944l A01;
    public final JsonSerializer A02;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        Object AK2 = this.A00.AK2(obj);
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer == null) {
            jsonSerializer = abstractC913345m.A0N(obj.getClass());
        }
        jsonSerializer.A09(anonymousClass182, abstractC913345m, abstractC63023Sar, AK2);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Object AK2 = this.A00.AK2(obj);
        if (AK2 == null) {
            abstractC913345m.A0T(anonymousClass182);
            return;
        }
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer == null) {
            jsonSerializer = abstractC913345m.A0N(AK2.getClass());
        }
        jsonSerializer.A0A(anonymousClass182, abstractC913345m, AK2);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        Object AK2 = this.A00.AK2(obj);
        if (AK2 == null) {
            return true;
        }
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer == null) {
            if (obj == null) {
                return true;
            }
            return false;
        }
        return jsonSerializer.A0B(abstractC913345m, AK2);
    }

    @Override // X.C46K
    public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
        JsonSerializer jsonSerializer = this.A02;
        AbstractC910944l abstractC910944l = this.A01;
        if (jsonSerializer == null) {
            if (abstractC910944l == null) {
                abstractC910944l = this.A00.BaK(abstractC913345m.A05());
            }
            if (abstractC910944l.A00 != Object.class) {
                jsonSerializer = abstractC913345m.A0K(abstractC910944l);
            }
        }
        if (jsonSerializer instanceof C46K) {
            jsonSerializer = abstractC913345m.A0F(interfaceC65620ToB, jsonSerializer);
        }
        if (jsonSerializer == jsonSerializer && abstractC910944l == abstractC910944l) {
            return this;
        }
        TmN tmN = this.A00;
        C914045z.A0E(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(abstractC910944l, jsonSerializer, tmN);
    }

    @Override // X.C55I
    public final void EK9(AbstractC913345m abstractC913345m) {
        Object obj = this.A02;
        if (obj != null && (obj instanceof C55I)) {
            ((C55I) obj).EK9(abstractC913345m);
        }
    }

    public StdDelegatingSerializer(AbstractC910944l abstractC910944l, JsonSerializer jsonSerializer, TmN tmN) {
        super(abstractC910944l);
        this.A00 = tmN;
        this.A01 = abstractC910944l;
        this.A02 = jsonSerializer;
    }
}
