package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC58322PtE;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.SZV;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.Iterator;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class IteratorSerializer extends AsArraySerializerBase {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Iterator it = (Iterator) obj;
        anonymousClass182.A0o(it);
        A0E(anonymousClass182, abstractC913345m, it);
        anonymousClass182.A0Z();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        return !((Iterator) obj).hasNext();
    }

    public final void A0E(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Iterator it) {
        SZV A01;
        if (it.hasNext()) {
            JsonSerializer jsonSerializer = this.A03;
            if (jsonSerializer == null) {
                AbstractC63023Sar abstractC63023Sar = this.A04;
                SZV szv = ((AsArraySerializerBase) this).A00;
                do {
                    Object next = it.next();
                    if (next == null) {
                        abstractC913345m.A0T(anonymousClass182);
                    } else {
                        Class<?> cls = next.getClass();
                        JsonSerializer A00 = szv.A00(cls);
                        if (A00 == null) {
                            AbstractC910944l abstractC910944l = this.A02;
                            if (abstractC910944l.A0J()) {
                                AbstractC910944l A0A = abstractC913345m.A0A(abstractC910944l, cls);
                                A00 = abstractC913345m.A0B(this.A01, A0A);
                                A01 = szv.A01(A00, A0A.A00);
                            } else {
                                A00 = abstractC913345m.A0G(this.A01, cls);
                                A01 = szv.A01(A00, cls);
                            }
                            if (szv != A01) {
                                ((AsArraySerializerBase) this).A00 = A01;
                            }
                            szv = ((AsArraySerializerBase) this).A00;
                        }
                        AbstractC58322PtE.A1K(anonymousClass182, A00, abstractC913345m, abstractC63023Sar, next);
                    }
                } while (it.hasNext());
                return;
            }
            AbstractC63023Sar abstractC63023Sar2 = this.A04;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    abstractC913345m.A0T(anonymousClass182);
                } else {
                    AbstractC58322PtE.A1K(anonymousClass182, jsonSerializer, abstractC913345m, abstractC63023Sar2, next2);
                }
            } while (it.hasNext());
        }
    }
}
