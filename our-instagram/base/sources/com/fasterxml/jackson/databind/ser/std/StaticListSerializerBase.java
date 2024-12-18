package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC913345m;
import X.C46K;
import java.util.Collection;

/* loaded from: classes10.dex */
public abstract class StaticListSerializerBase extends StdSerializer implements C46K {
    public final Boolean A00;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r7, X.AbstractC913345m r8) {
        /*
            r6 = this;
            r3 = 0
            if (r7 == 0) goto L44
            X.45R r0 = r8.A05
            X.44W r0 = r0.A00()
            X.RBL r1 = r7.BSA()
            if (r1 == 0) goto L44
            java.lang.Object r0 = r0.A0X(r1)
            if (r0 == 0) goto L44
            com.fasterxml.jackson.databind.JsonSerializer r2 = r8.A0M(r1, r0)
        L19:
            java.lang.Class r0 = r6.A00
            X.45U r1 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r7, r8, r0)
            if (r1 == 0) goto L42
            X.ReZ r0 = X.EnumC61060ReZ.A02
            java.lang.Boolean r1 = r1.A01(r0)
        L27:
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.A0C(r7, r2, r8)
            if (r2 != 0) goto L33
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.fasterxml.jackson.databind.JsonSerializer r2 = r8.A0G(r7, r0)
        L33:
            boolean r0 = X.C914045z.A0K(r2)
            if (r0 == 0) goto L56
            java.lang.Boolean r0 = r6.A00
            boolean r0 = X.C2I7.A00(r1, r0)
            if (r0 == 0) goto L46
            return r6
        L42:
            r1 = r3
            goto L27
        L44:
            r2 = r3
            goto L19
        L46:
            boolean r0 = r6 instanceof com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer
            if (r0 == 0) goto L50
            com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer r0 = new com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer
            r0.<init>(r6, r1)
            return r0
        L50:
            com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer r0 = new com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer
            r0.<init>(r6, r1)
            return r0
        L56:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            X.44k r0 = r8.A05()
            X.44l r1 = r0.A09(r1)
            r5 = 1
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            com.fasterxml.jackson.databind.ser.std.CollectionSerializer r0 = new com.fasterxml.jackson.databind.ser.std.CollectionSerializer
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        Collection collection = (Collection) obj;
        if (collection != null && collection.size() != 0) {
            return false;
        }
        return true;
    }

    public StaticListSerializerBase(StaticListSerializerBase staticListSerializerBase, Boolean bool) {
        super(staticListSerializerBase);
        this.A00 = bool;
    }

    public StaticListSerializerBase(Class cls) {
        super(cls, false);
        this.A00 = null;
    }
}
