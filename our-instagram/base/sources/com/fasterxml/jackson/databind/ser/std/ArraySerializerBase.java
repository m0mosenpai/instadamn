package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C16R;
import X.C46K;
import X.InterfaceC65620ToB;
import X.SX7;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;

/* loaded from: classes10.dex */
public abstract class ArraySerializerBase extends ContainerSerializer implements C46K {
    public final InterfaceC65620ToB A00;
    public final Boolean A01;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        SX7 A00 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0C, abstractC63023Sar, obj);
        anonymousClass182.A0F(obj);
        if (this instanceof StdArraySerializers$IntArraySerializer) {
            for (int i : (int[]) obj) {
                anonymousClass182.A0h(i);
            }
        } else if (this instanceof StdArraySerializers$ShortArraySerializer) {
            for (short s : (short[]) obj) {
                anonymousClass182.A0h(s);
            }
        } else if (this instanceof StdArraySerializers$LongArraySerializer) {
            for (long j : (long[]) obj) {
                anonymousClass182.A0i(j);
            }
        } else if (this instanceof StdArraySerializers$FloatArraySerializer) {
            for (float f : (float[]) obj) {
                anonymousClass182.A0g(f);
            }
        } else if (this instanceof StdArraySerializers$DoubleArraySerializer) {
            for (double d : (double[]) obj) {
                anonymousClass182.A0f(d);
            }
        } else if (this instanceof StdArraySerializers$BooleanArraySerializer) {
            for (boolean z : (boolean[]) obj) {
                anonymousClass182.A0y(z);
            }
        } else if (this instanceof ObjectArraySerializer) {
            ((ObjectArraySerializer) this).A0E(anonymousClass182, abstractC913345m, (Object[]) obj);
        } else {
            ((StringArraySerializer) this).A0E(anonymousClass182, abstractC913345m, (String[]) obj);
        }
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r11, X.AbstractC913345m r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ArraySerializerBase.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public ArraySerializerBase(Class cls) {
        super(cls);
        this.A00 = null;
        this.A01 = null;
    }

    public ArraySerializerBase(InterfaceC65620ToB interfaceC65620ToB, ArraySerializerBase arraySerializerBase, Boolean bool) {
        super(((StdSerializer) arraySerializerBase).A00, false);
        this.A00 = interfaceC65620ToB;
        this.A01 = bool;
    }
}
