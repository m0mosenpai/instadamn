package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC63035SbA;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C102314j6;
import X.C64175T2e;
import X.C912845h;
import X.C914045z;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.MSY;
import X.RBV;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaImmutableCollectionDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableBiMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedMapDeserializer;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableBiMap;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class ContainerDeserializerBase extends StdDeserializer {
    public final AbstractC910944l A00;
    public final InterfaceC102444jN A01;
    public final Boolean A02;
    public final boolean A03;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final RBV A0E(String str) {
        JsonDeserializer jsonDeserializer;
        if (this instanceof GuavaMapDeserializer) {
            jsonDeserializer = ((GuavaMapDeserializer) this).A00;
        } else if (this instanceof GuavaCollectionDeserializer) {
            jsonDeserializer = ((GuavaCollectionDeserializer) this).A00;
        } else if (this instanceof StringCollectionDeserializer) {
            jsonDeserializer = ((StringCollectionDeserializer) this).A01;
        } else if (this instanceof ObjectArrayDeserializer) {
            jsonDeserializer = ((ObjectArrayDeserializer) this).A00;
        } else if (this instanceof MapEntryDeserializer) {
            jsonDeserializer = ((MapEntryDeserializer) this).A00;
        } else if (this instanceof MapDeserializer) {
            jsonDeserializer = ((MapDeserializer) this).A06;
        } else if (this instanceof EnumMapDeserializer) {
            jsonDeserializer = ((EnumMapDeserializer) this).A01;
        } else {
            jsonDeserializer = ((CollectionDeserializer) this).A01;
        }
        if (jsonDeserializer != null) {
            return jsonDeserializer.A0E(str);
        }
        throw AbstractC58319PtB.A0j("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", new Object[]{str, MSY.A0h(this)});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ContainerDeserializerBase(X.InterfaceC102444jN r2, com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase r3, java.lang.Boolean r4) {
        /*
            r1 = this;
            X.44l r0 = r3.A00
            r1.<init>(r0)
            r1.A00 = r0
            r1.A01 = r2
            r1.A02 = r4
            X.T2e r0 = X.C64175T2e.A02
            boolean r0 = X.AbstractC167007dF.A1X(r2, r0)
            r1.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.<init>(X.4jN, com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, java.lang.Boolean):void");
    }

    public static final void A01(AnonymousClass469 anonymousClass469, Object obj, String str, Throwable th) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        Iterator it = C914045z.A00;
        if (!(th instanceof Error)) {
            if (anonymousClass469 != null && !anonymousClass469.A0j(EnumC912945i.A0S)) {
                C914045z.A0F(th);
            }
            if ((th instanceof IOException) && !(th instanceof C102314j6)) {
                throw th;
            }
            if (str == null) {
                str = "N/A";
            }
            throw C102314j6.A02(obj, str, th);
        }
        throw th;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean A0G(C912845h c912845h) {
        if (this instanceof GuavaImmutableCollectionDeserializer) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        if (this instanceof ImmutableSortedMapDeserializer) {
            return ImmutableSortedMap.A03;
        }
        if (this instanceof ImmutableMapDeserializer) {
            return RegularImmutableMap.A02;
        }
        if (this instanceof ImmutableBiMapDeserializer) {
            return RegularImmutableBiMap.A04;
        }
        if (this instanceof GuavaMultisetDeserializer) {
            return ((GuavaMultisetDeserializer) this).A0y();
        }
        if (this instanceof GuavaImmutableCollectionDeserializer) {
            return ((GuavaCollectionDeserializer) this).A0x();
        }
        if (this instanceof ObjectArrayDeserializer) {
            return ((ObjectArrayDeserializer) this).A04;
        }
        if (this instanceof EnumMapDeserializer) {
            return ((EnumMapDeserializer) this).A0x(anonymousClass469);
        }
        AbstractC63035SbA A0W = A0W();
        if (A0W != null && A0W.A0L()) {
            try {
                return A0W.A04(anonymousClass469);
            } catch (IOException e) {
                C914045z.A0D(anonymousClass469, e);
                throw C00O.createAndThrow();
            }
        }
        AbstractC910944l abstractC910944l = this.A00;
        AbstractC58318PtA.A1N(anonymousClass469, abstractC910944l, "Cannot create empty instance of %s, no default Creator", new Object[]{abstractC910944l});
        throw C00O.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC910944l A0T() {
        return this.A00;
    }

    public ContainerDeserializerBase(AbstractC910944l abstractC910944l, InterfaceC102444jN interfaceC102444jN, Boolean bool) {
        super(abstractC910944l);
        this.A00 = abstractC910944l;
        this.A02 = bool;
        this.A01 = interfaceC102444jN;
        this.A03 = AbstractC167007dF.A1X(interfaceC102444jN, C64175T2e.A02);
    }
}
