package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C16R;
import X.C46K;
import X.InterfaceC65620ToB;
import X.RC9;
import X.SX7;
import X.SZV;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class AsArraySerializerBase extends ContainerSerializer implements C46K {
    public SZV A00;
    public final InterfaceC65620ToB A01;
    public final AbstractC910944l A02;
    public final JsonSerializer A03;
    public final AbstractC63023Sar A04;
    public final Boolean A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(AbstractC910944l abstractC910944l, JsonSerializer jsonSerializer, AbstractC63023Sar abstractC63023Sar, Class cls, boolean z) {
        super(cls, false);
        boolean z2 = false;
        this.A02 = abstractC910944l;
        if (z || (abstractC910944l != null && Modifier.isFinal(abstractC910944l.A00.getModifiers()))) {
            z2 = true;
        }
        this.A06 = z2;
        this.A04 = abstractC63023Sar;
        this.A01 = null;
        this.A03 = jsonSerializer;
        this.A00 = RC9.A00;
        this.A05 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r10, X.AbstractC913345m r11) {
        /*
            r9 = this;
            r7 = r9
            X.Sar r6 = r9.A04
            r3 = r6
            r4 = r10
            if (r6 == 0) goto Lb
            X.Sar r6 = r6.A05(r10)
        Lb:
            r8 = 0
            if (r10 == 0) goto L61
            X.45R r0 = r11.A05
            X.44W r0 = r0.A00()
            X.RBL r1 = r10.BSA()
            if (r1 == 0) goto L61
            java.lang.Object r0 = r0.A0X(r1)
            if (r0 == 0) goto L61
            com.fasterxml.jackson.databind.JsonSerializer r2 = r11.A0M(r1, r0)
        L24:
            java.lang.Class r0 = r9.A00
            X.45U r1 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r10, r11, r0)
            if (r1 == 0) goto L32
            X.ReZ r0 = X.EnumC61060ReZ.A02
            java.lang.Boolean r8 = r1.A01(r0)
        L32:
            if (r2 != 0) goto L36
            com.fasterxml.jackson.databind.JsonSerializer r2 = r9.A03
        L36:
            com.fasterxml.jackson.databind.JsonSerializer r5 = r9.A0C(r10, r2, r11)
            if (r5 != 0) goto L4e
            X.44l r2 = r9.A02
            if (r2 == 0) goto L4e
            boolean r0 = r9.A06
            if (r0 == 0) goto L4e
            java.lang.Class r1 = r2.A00
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L4e
            com.fasterxml.jackson.databind.JsonSerializer r5 = r11.A0B(r10, r2)
        L4e:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r9.A03
            if (r5 != r0) goto L63
            X.ToB r0 = r9.A01
            if (r10 != r0) goto L63
            if (r3 != r6) goto L63
            java.lang.Boolean r0 = r9.A05
            boolean r0 = X.C2I7.A00(r0, r8)
            if (r0 == 0) goto L63
            return r9
        L61:
            r2 = r8
            goto L24
        L63:
            boolean r0 = r9 instanceof com.fasterxml.jackson.databind.ser.std.IterableSerializer
            if (r0 == 0) goto L6d
            com.fasterxml.jackson.databind.ser.std.IterableSerializer r3 = new com.fasterxml.jackson.databind.ser.std.IterableSerializer
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L6d:
            boolean r0 = r9 instanceof com.fasterxml.jackson.databind.ser.std.EnumSetSerializer
            if (r0 == 0) goto L77
            com.fasterxml.jackson.databind.ser.std.EnumSetSerializer r3 = new com.fasterxml.jackson.databind.ser.std.EnumSetSerializer
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L77:
            boolean r0 = r9 instanceof com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            if (r0 == 0) goto L81
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r3 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L81:
            boolean r0 = r9 instanceof com.fasterxml.jackson.databind.ser.impl.IteratorSerializer
            if (r0 == 0) goto L8b
            com.fasterxml.jackson.databind.ser.impl.IteratorSerializer r3 = new com.fasterxml.jackson.databind.ser.impl.IteratorSerializer
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L8b:
            com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer r3 = new com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        SX7 A00 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0C, abstractC63023Sar, obj);
        anonymousClass182.A0F(obj);
        if (this instanceof IterableSerializer) {
            ((IterableSerializer) this).A0E(anonymousClass182, abstractC913345m, (Iterable) obj);
        } else if (this instanceof EnumSetSerializer) {
            ((EnumSetSerializer) this).A0E(anonymousClass182, abstractC913345m, (EnumSet) obj);
        } else if (this instanceof CollectionSerializer) {
            ((CollectionSerializer) this).A0E(anonymousClass182, abstractC913345m, (Collection) obj);
        } else if (this instanceof IteratorSerializer) {
            ((IteratorSerializer) this).A0E(anonymousClass182, abstractC913345m, (Iterator) obj);
        } else {
            ((IndexedListSerializer) this).A0E(anonymousClass182, abstractC913345m, (List) obj);
        }
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    public AsArraySerializerBase(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, AbstractC63023Sar abstractC63023Sar, AsArraySerializerBase asArraySerializerBase, Boolean bool) {
        super(((StdSerializer) asArraySerializerBase).A00, false);
        this.A02 = asArraySerializerBase.A02;
        this.A06 = asArraySerializerBase.A06;
        this.A04 = abstractC63023Sar;
        this.A01 = interfaceC65620ToB;
        this.A03 = jsonSerializer;
        this.A00 = RC9.A00;
        this.A05 = bool;
    }
}
